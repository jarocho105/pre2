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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.puntoventa.util.PagosTarjetasConstantesFunciones;
import com.bydan.erp.puntoventa.util.report.PagosTarjetasParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.report.PagosTarjetasParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.report.PagosTarjetasBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.puntoventa.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.puntoventa.util.*;

import com.bydan.erp.puntoventa.util.report.*;
import com.bydan.erp.puntoventa.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.report.*;
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

//import org.hibernate.collection.PersistentBag;

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
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;

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
public class PagosTarjetasBeanSwingJInternalFrame extends PagosTarjetasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PagosTarjetasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PagosTarjetas> pagostarjetasValidator = new ClassValidator<PagosTarjetas>(PagosTarjetas.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PagosTarjetas pagostarjetas;	
	public PagosTarjetas pagostarjetasAux;
	public PagosTarjetas pagostarjetasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PagosTarjetas pagostarjetasTotales;
	public Long idPagosTarjetasActual;
	public Long iIdNuevoPagosTarjetas=0L;
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
	
	public Boolean isPermisoTodoPagosTarjetas;
	public Boolean isPermisoNuevoPagosTarjetas;
	public Boolean isPermisoActualizarPagosTarjetas;
	public Boolean isPermisoActualizarOriginalPagosTarjetas;
	public Boolean isPermisoEliminarPagosTarjetas;
	public Boolean isPermisoGuardarCambiosPagosTarjetas;
	public Boolean isPermisoConsultaPagosTarjetas;
	public Boolean isPermisoBusquedaPagosTarjetas;
	public Boolean isPermisoReportePagosTarjetas;
	public Boolean isPermisoPaginacionMedioPagosTarjetas;
	public Boolean isPermisoPaginacionAltoPagosTarjetas;
	public Boolean isPermisoPaginacionTodoPagosTarjetas;
	public Boolean isPermisoCopiarPagosTarjetas;
	public Boolean isPermisoVerFormPagosTarjetas;
	public Boolean isPermisoDuplicarPagosTarjetas;
	public Boolean isPermisoOrdenPagosTarjetas;
	
	
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
	
	public PagosTarjetasParameterReturnGeneral pagostarjetasReturnGeneral;
	public PagosTarjetasParameterReturnGeneral pagostarjetasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPagosTarjetas=false;
	public Boolean esParaAccionDesdeFormularioPagosTarjetas=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PagosTarjetasSessionBeanAdditional pagostarjetasSessionBeanAdditional=null;
	
	public PagosTarjetasSessionBeanAdditional getPagosTarjetasSessionBeanAdditional() {
		return this.pagostarjetasSessionBeanAdditional;
	}
	
	public void setPagosTarjetasSessionBeanAdditional(PagosTarjetasSessionBeanAdditional pagostarjetasSessionBeanAdditional) {
		try {
			this.pagostarjetasSessionBeanAdditional=pagostarjetasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PagosTarjetasBeanSwingJInternalFrameAdditional pagostarjetasBeanSwingJInternalFrameAdditional=null;
	//public class PagosTarjetasBeanSwingJInternalFrame
	
	public PagosTarjetasBeanSwingJInternalFrameAdditional getPagosTarjetasBeanSwingJInternalFrameAdditional() {
		return this.pagostarjetasBeanSwingJInternalFrameAdditional;
	}
	
	public void setPagosTarjetasBeanSwingJInternalFrameAdditional(PagosTarjetasBeanSwingJInternalFrameAdditional pagostarjetasBeanSwingJInternalFrameAdditional) {
		try {
			this.pagostarjetasBeanSwingJInternalFrameAdditional=pagostarjetasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PagosTarjetasLogic pagostarjetasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PagosTarjetas pagostarjetasBean;
	public PagosTarjetasConstantesFunciones pagostarjetasConstantesFunciones;
	//public PagosTarjetasParameterReturnGeneral pagostarjetasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<PagosTarjetas> pagostarjetass;	
	//public List<PagosTarjetas> pagostarjetassEliminados;
	//public List<PagosTarjetas> pagostarjetassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPagosTarjetas=false;
	public Boolean isVisibilidadCeldaDuplicarPagosTarjetas=true;
	public Boolean isVisibilidadCeldaCopiarPagosTarjetas=true;
	public Boolean isVisibilidadCeldaVerFormPagosTarjetas=true;
	public Boolean isVisibilidadCeldaOrdenPagosTarjetas=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPagosTarjetas=false;
	public Boolean isVisibilidadCeldaModificarPagosTarjetas=false;
	public Boolean isVisibilidadCeldaActualizarPagosTarjetas=false;
	public Boolean isVisibilidadCeldaEliminarPagosTarjetas=false;
	public Boolean isVisibilidadCeldaCancelarPagosTarjetas=false;
	public Boolean isVisibilidadCeldaGuardarPagosTarjetas=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPagosTarjetas=false;	
	
	
	public Boolean isVisibilidadBusquedaPagosTarjetas=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoPagosTarjetas() {
		return this.iIdNuevoPagosTarjetas;
	}

	public void setiIdNuevoPagosTarjetas(Long iIdNuevoPagosTarjetas) {
		this.iIdNuevoPagosTarjetas = iIdNuevoPagosTarjetas;
	}
	
	public Long getidPagosTarjetasActual() {
		return this.idPagosTarjetasActual;
	}

	public void setidPagosTarjetasActual(Long idPagosTarjetasActual) {
		this.idPagosTarjetasActual = idPagosTarjetasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PagosTarjetas getpagostarjetas() {
		return this.pagostarjetas;
	}

	public void setpagostarjetas(PagosTarjetas pagostarjetas) {
		this.pagostarjetas = pagostarjetas;
	}
	
	public PagosTarjetas getpagostarjetasAux() {
		return this.pagostarjetasAux;
	}

	public void setpagostarjetasAux(PagosTarjetas pagostarjetasAux) {
		this.pagostarjetasAux = pagostarjetasAux;
	}				
	
	public PagosTarjetas getpagostarjetasAnterior() {
		return this.pagostarjetasAnterior;
	}

	public void setpagostarjetasAnterior(PagosTarjetas pagostarjetasAnterior) {
		this.pagostarjetasAnterior = pagostarjetasAnterior;
	}	
	
	public PagosTarjetas getpagostarjetasTotales() {
		return this.pagostarjetasTotales;
	}

	public void setpagostarjetasTotales(PagosTarjetas pagostarjetasTotales) {
		this.pagostarjetasTotales = pagostarjetasTotales;
	}	
	
	public PagosTarjetas getpagostarjetasBean() {
		return this.pagostarjetasBean;
	}

	public void setpagostarjetasBean(PagosTarjetas pagostarjetasBean) {
		this.pagostarjetasBean = pagostarjetasBean;
	}	
	
	public PagosTarjetasParameterReturnGeneral getpagostarjetasReturnGeneral() {
		return this.pagostarjetasReturnGeneral;
	}

	public void setpagostarjetasReturnGeneral(PagosTarjetasParameterReturnGeneral pagostarjetasReturnGeneral) {
		this.pagostarjetasReturnGeneral = pagostarjetasReturnGeneral;
	}	
	
	
	public Date fecha_hastaBusquedaPagosTarjetas=new Date();

	public Date getfecha_hastaBusquedaPagosTarjetas() {
		return this.fecha_hastaBusquedaPagosTarjetas;
	}

	public void setfecha_hastaBusquedaPagosTarjetas(Date fecha_hastaBusquedaPagosTarjetas) {
		this.fecha_hastaBusquedaPagosTarjetas = fecha_hastaBusquedaPagosTarjetas;
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
	
	
	public PagosTarjetasLogic getPagosTarjetasLogic()	{		
		return pagostarjetasLogic;
	}

	public void setPagosTarjetasLogic(PagosTarjetasLogic pagostarjetasLogic) {
		this.pagostarjetasLogic = pagostarjetasLogic;
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
	
	public Boolean getIsEsNuevoPagosTarjetas() {
		return isEsNuevoPagosTarjetas;
	}

	public void setIsEsNuevoPagosTarjetas(Boolean isEsNuevoPagosTarjetas) {
		this.isEsNuevoPagosTarjetas = isEsNuevoPagosTarjetas;
	}

	public Boolean getEsParaAccionDesdeFormularioPagosTarjetas() {
		return esParaAccionDesdeFormularioPagosTarjetas;
	}
	
	public void setEsParaAccionDesdeFormularioPagosTarjetas(Boolean esParaAccionDesdeFormularioPagosTarjetas) {
		this.esParaAccionDesdeFormularioPagosTarjetas = esParaAccionDesdeFormularioPagosTarjetas;
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

			if(this.pagostarjetasSessionBean==null) {
				this.pagostarjetasSessionBean=new PagosTarjetasSessionBean();
			}

			if(!this.pagostarjetasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(pagostarjetasSessionBean.getlidEmpresaActual());
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

					if(this.pagostarjetas!=null) {
						this.pagostarjetas.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
						this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxid_empresaPagosTarjetas.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPagosTarjetas.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
						if(this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxid_empresaPagosTarjetas.getItemCount()>0) {
							this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxid_empresaPagosTarjetas.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPagosTarjetasGenerico)throws Exception
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
				jComboBoxid_empresaPagosTarjetasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPagosTarjetasGenerico!=null && jComboBoxid_empresaPagosTarjetasGenerico.getItemCount()>0) {
					jComboBoxid_empresaPagosTarjetasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PagosTarjetas pagostarjetas,JComboBox jComboBoxid_empresaPagosTarjetasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPagosTarjetasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxid_empresaPagosTarjetas.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPagosTarjetasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				pagostarjetas.setid_empresa(empresaAux.getId());
				pagostarjetas.setempresa_descripcion(PagosTarjetasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				pagostarjetas.setEmpresa(empresaAux);			}
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

					if(!PagosTarjetasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPagosTarjetas!=null) { 
							this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxid_empresaPagosTarjetas.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxid_empresaPagosTarjetas.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPagosTarjetas!=null) { 
					}

					if(!PagosTarjetasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
							this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxid_empresaPagosTarjetas.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
							this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxid_empresaPagosTarjetas.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesPagosTarjetas() throws Exception {
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
		
	public PagosTarjetasParameterReturnGeneral getPagosTarjetasParameterGeneral() {
		return this.pagostarjetasParameterGeneral;
	}
	
	public void setPagosTarjetasParameterGeneral(PagosTarjetasParameterReturnGeneral pagostarjetasParameterGeneral) {
		this.pagostarjetasParameterGeneral = pagostarjetasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPagosTarjetas() {
		return isPermisoTodoPagosTarjetas;
	}

	public void setIsPermisoTodoPagosTarjetas(Boolean isPermisoTodoPagosTarjetas) {
		this.isPermisoTodoPagosTarjetas = isPermisoTodoPagosTarjetas;
	}

	public Boolean getIsPermisoNuevoPagosTarjetas() {
		return isPermisoNuevoPagosTarjetas;
	}

	public void setIsPermisoNuevoPagosTarjetas(Boolean isPermisoNuevoPagosTarjetas) {
		this.isPermisoNuevoPagosTarjetas = isPermisoNuevoPagosTarjetas;
	}

	public Boolean getIsPermisoActualizarPagosTarjetas() {
		return isPermisoActualizarPagosTarjetas;
	}

	public void setIsPermisoActualizarPagosTarjetas(Boolean isPermisoActualizarPagosTarjetas) {
		this.isPermisoActualizarPagosTarjetas = isPermisoActualizarPagosTarjetas;
	}

	public Boolean getIsPermisoEliminarPagosTarjetas() {
		return isPermisoEliminarPagosTarjetas;
	}

	public void setIsPermisoEliminarPagosTarjetas(Boolean isPermisoEliminarPagosTarjetas) {
		this.isPermisoEliminarPagosTarjetas = isPermisoEliminarPagosTarjetas;
	}

	public Boolean getIsPermisoGuardarCambiosPagosTarjetas() {
		return isPermisoGuardarCambiosPagosTarjetas;
	}

	public void setIsPermisoGuardarCambiosPagosTarjetas(Boolean isPermisoGuardarCambiosPagosTarjetas) {
		this.isPermisoGuardarCambiosPagosTarjetas = isPermisoGuardarCambiosPagosTarjetas;
	}
	
	public Boolean getIsPermisoConsultaPagosTarjetas() {
		return isPermisoConsultaPagosTarjetas;
	}

	public void setIsPermisoConsultaPagosTarjetas(Boolean isPermisoConsultaPagosTarjetas) {
		this.isPermisoConsultaPagosTarjetas = isPermisoConsultaPagosTarjetas;
	}

	public Boolean getIsPermisoBusquedaPagosTarjetas() {
		return isPermisoBusquedaPagosTarjetas;
	}

	public void setIsPermisoBusquedaPagosTarjetas(Boolean isPermisoBusquedaPagosTarjetas) {
		this.isPermisoBusquedaPagosTarjetas = isPermisoBusquedaPagosTarjetas;
	}

	public Boolean getIsPermisoReportePagosTarjetas() {
		return isPermisoReportePagosTarjetas;
	}

	public void setIsPermisoReportePagosTarjetas(Boolean isPermisoReportePagosTarjetas) {
		this.isPermisoReportePagosTarjetas = isPermisoReportePagosTarjetas;
	}
	
	public Boolean getIsPermisoPaginacionMedioPagosTarjetas() {
		return isPermisoPaginacionMedioPagosTarjetas;
	}

	public void setIsPermisoPaginacionMedioPagosTarjetas(Boolean isPermisoPaginacionMedioPagosTarjetas) {
		this.isPermisoPaginacionMedioPagosTarjetas = isPermisoPaginacionMedioPagosTarjetas;
	}
	
	public Boolean getIsPermisoPaginacionTodoPagosTarjetas() {
		return isPermisoPaginacionTodoPagosTarjetas;
	}

	public void setIsPermisoPaginacionTodoPagosTarjetas(Boolean isPermisoPaginacionTodoPagosTarjetas) {
		this.isPermisoPaginacionTodoPagosTarjetas = isPermisoPaginacionTodoPagosTarjetas;
	}
	
	public Boolean getIsPermisoPaginacionAltoPagosTarjetas() {
		return isPermisoPaginacionAltoPagosTarjetas;
	}

	public void setIsPermisoPaginacionAltoPagosTarjetas(Boolean isPermisoPaginacionAltoPagosTarjetas) {
		this.isPermisoPaginacionAltoPagosTarjetas = isPermisoPaginacionAltoPagosTarjetas;
	}
	
	public Boolean getIsPermisoCopiarPagosTarjetas() {
		return isPermisoCopiarPagosTarjetas;
	}

	public void setIsPermisoCopiarPagosTarjetas(Boolean isPermisoCopiarPagosTarjetas) {
		this.isPermisoCopiarPagosTarjetas = isPermisoCopiarPagosTarjetas;
	}
	
	public Boolean getIsPermisoVerFormPagosTarjetas() {
		return isPermisoVerFormPagosTarjetas;
	}

	public void setIsPermisoVerFormPagosTarjetas(Boolean isPermisoVerFormPagosTarjetas) {
		this.isPermisoVerFormPagosTarjetas = isPermisoVerFormPagosTarjetas;
	}
	
	public Boolean getIsPermisoDuplicarPagosTarjetas() {
		return isPermisoDuplicarPagosTarjetas;
	}

	public void setIsPermisoDuplicarPagosTarjetas(Boolean isPermisoDuplicarPagosTarjetas) {
		this.isPermisoDuplicarPagosTarjetas = isPermisoDuplicarPagosTarjetas;
	}
	
	public Boolean getIsPermisoOrdenPagosTarjetas() {
		return isPermisoOrdenPagosTarjetas;
	}

	public void setIsPermisoOrdenPagosTarjetas(Boolean isPermisoOrdenPagosTarjetas) {
		this.isPermisoOrdenPagosTarjetas = isPermisoOrdenPagosTarjetas;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPagosTarjetas() {
		return isVisibilidadCeldaNuevoPagosTarjetas;
	}

	public void setIsVisibilidadCeldaNuevoPagosTarjetas(Boolean isVisibilidadCeldaNuevoPagosTarjetas) {
		this.isVisibilidadCeldaNuevoPagosTarjetas = isVisibilidadCeldaNuevoPagosTarjetas;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPagosTarjetas() {
		return isVisibilidadCeldaDuplicarPagosTarjetas;
	}

	public void setIsVisibilidadCeldaDuplicarPagosTarjetas(Boolean isVisibilidadCeldaDuplicarPagosTarjetas) {
		this.isVisibilidadCeldaDuplicarPagosTarjetas = isVisibilidadCeldaDuplicarPagosTarjetas;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPagosTarjetas() {
		return isVisibilidadCeldaCopiarPagosTarjetas;
	}

	public void setIsVisibilidadCeldaCopiarPagosTarjetas(Boolean isVisibilidadCeldaCopiarPagosTarjetas) {
		this.isVisibilidadCeldaCopiarPagosTarjetas = isVisibilidadCeldaCopiarPagosTarjetas;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPagosTarjetas() {
		return isVisibilidadCeldaVerFormPagosTarjetas;
	}

	public void setIsVisibilidadCeldaVerFormPagosTarjetas(Boolean isVisibilidadCeldaVerFormPagosTarjetas) {
		this.isVisibilidadCeldaVerFormPagosTarjetas = isVisibilidadCeldaVerFormPagosTarjetas;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPagosTarjetas() {
		return isVisibilidadCeldaOrdenPagosTarjetas;
	}

	public void setIsVisibilidadCeldaOrdenPagosTarjetas(Boolean isVisibilidadCeldaOrdenPagosTarjetas) {
		this.isVisibilidadCeldaOrdenPagosTarjetas = isVisibilidadCeldaOrdenPagosTarjetas;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPagosTarjetas() {
		return isVisibilidadCeldaNuevoRelacionesPagosTarjetas;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPagosTarjetas(Boolean isVisibilidadCeldaNuevoRelacionesPagosTarjetas) {
		this.isVisibilidadCeldaNuevoRelacionesPagosTarjetas = isVisibilidadCeldaNuevoRelacionesPagosTarjetas;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPagosTarjetas() {
		return isVisibilidadCeldaModificarPagosTarjetas;
	}

	public void setIsVisibilidadCeldaModificarPagosTarjetas(Boolean isVisibilidadCeldaModificarPagosTarjetas) {
		this.isVisibilidadCeldaModificarPagosTarjetas = isVisibilidadCeldaModificarPagosTarjetas;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPagosTarjetas() {
		return isVisibilidadCeldaActualizarPagosTarjetas;
	}

	public void setIsVisibilidadCeldaActualizarPagosTarjetas(Boolean isVisibilidadCeldaActualizarPagosTarjetas) {
		this.isVisibilidadCeldaActualizarPagosTarjetas = isVisibilidadCeldaActualizarPagosTarjetas;
	}

	public Boolean getIsVisibilidadCeldaEliminarPagosTarjetas() {
		return isVisibilidadCeldaEliminarPagosTarjetas;
	}

	public void setIsVisibilidadCeldaEliminarPagosTarjetas(Boolean isVisibilidadCeldaEliminarPagosTarjetas) {
		this.isVisibilidadCeldaEliminarPagosTarjetas = isVisibilidadCeldaEliminarPagosTarjetas;
	}

	public Boolean getIsVisibilidadCeldaCancelarPagosTarjetas() {
		return isVisibilidadCeldaCancelarPagosTarjetas;
	}

	public void setIsVisibilidadCeldaCancelarPagosTarjetas(Boolean isVisibilidadCeldaCancelarPagosTarjetas) {
		this.isVisibilidadCeldaCancelarPagosTarjetas = isVisibilidadCeldaCancelarPagosTarjetas;
	}

	public Boolean getIsVisibilidadCeldaGuardarPagosTarjetas() {
		return isVisibilidadCeldaGuardarPagosTarjetas;
	}

	public void setIsVisibilidadCeldaGuardarPagosTarjetas(Boolean isVisibilidadCeldaGuardarPagosTarjetas) {
		this.isVisibilidadCeldaGuardarPagosTarjetas = isVisibilidadCeldaGuardarPagosTarjetas;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPagosTarjetas() {
		return isVisibilidadCeldaGuardarCambiosPagosTarjetas;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPagosTarjetas(Boolean isVisibilidadCeldaGuardarCambiosPagosTarjetas) {
		this.isVisibilidadCeldaGuardarCambiosPagosTarjetas = isVisibilidadCeldaGuardarCambiosPagosTarjetas;
	}
		
	public PagosTarjetasSessionBean getpagostarjetasSessionBean() {
		return this.pagostarjetasSessionBean;
	}
	
	public void setpagostarjetasSessionBean(PagosTarjetasSessionBean pagostarjetasSessionBean) {
		this.pagostarjetasSessionBean=pagostarjetasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPagosTarjetas() {
		return this.isVisibilidadBusquedaPagosTarjetas;
	}

	public void setisVisibilidadBusquedaPagosTarjetas(Boolean isVisibilidadBusquedaPagosTarjetas) {
		this.isVisibilidadBusquedaPagosTarjetas=isVisibilidadBusquedaPagosTarjetas;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(PagosTarjetas pagostarjetas)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(pagostarjetas,null);
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
	
	public void bugActualizarReferenciaActual(PagosTarjetas pagostarjetas,PagosTarjetas pagostarjetasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPagosTarjetas(pagostarjetas);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		pagostarjetasAux.setId(pagostarjetas.getId());
		pagostarjetasAux.setVersionRow(pagostarjetas.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(PagosTarjetas pagostarjetasLocal) throws Exception {
		
		if(this.pagostarjetasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PagosTarjetas pagostarjetasLocal) throws Exception {	
		if(this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				pagostarjetasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPagosTarjetasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = pagostarjetasValidator.getInvalidValues(this.pagostarjetas);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PagosTarjetas pagostarjetas,List<PagosTarjetas> pagostarjetass) throws Exception {
	}		
	
	public void actualizarSelectedLista(PagosTarjetas pagostarjetas,List<PagosTarjetas> pagostarjetass) throws Exception {
		try	{			
			PagosTarjetasConstantesFunciones.actualizarSelectedLista(pagostarjetas,pagostarjetass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PagosTarjetas> pagostarjetassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				pagostarjetassLocal=this.pagostarjetasLogic.getPagosTarjetass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				pagostarjetassLocal=this.pagostarjetass;
			}
			//ARCHITECTURE
		
			for(PagosTarjetas pagostarjetasLocal:pagostarjetassLocal) {
				if(this.permiteMantenimiento(pagostarjetasLocal) && pagostarjetasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PagosTarjetasConstantesFunciones.getPagosTarjetasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PagosTarjetasConstantesFunciones.CODIGOASIENTOCONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelcodigo_asiento_contablePagosTarjetas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosTarjetasConstantesFunciones.CODIGOTARJETACREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelcodigo_tarjeta_creditoPagosTarjetas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosTarjetasConstantesFunciones.NOMBRETIPOINTERESTARJETA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelnombre_tipo_interes_tarjetaPagosTarjetas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosTarjetasConstantesFunciones.NOMBRECONEXION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelnombre_conexionPagosTarjetas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosTarjetasConstantesFunciones.NOMBREMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelnombre_mesPagosTarjetas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosTarjetasConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelnumeroPagosTarjetas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosTarjetasConstantesFunciones.LOTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabellotePagosTarjetas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosTarjetasConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelvalorPagosTarjetas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosTarjetasConstantesFunciones.VALORRETENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelvalor_retencionPagosTarjetas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosTarjetasConstantesFunciones.VALORCOMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelvalor_comisionPagosTarjetas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosTarjetasConstantesFunciones.VALORCALCULADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelvalor_calculadoPagosTarjetas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosTarjetasConstantesFunciones.VALORCANCELADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelvalor_canceladoPagosTarjetas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosTarjetasConstantesFunciones.VALORDIFIERE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelvalor_difierePagosTarjetas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosTarjetasConstantesFunciones.NUMERORETENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelnumero_retencionPagosTarjetas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosTarjetasConstantesFunciones.NUMEROLIQUIDACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelnumero_liquidacionPagosTarjetas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosTarjetasConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelfechaPagosTarjetas,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosTarjetas.jLabelcodigo_asiento_contablePagosTarjetas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosTarjetas.jLabelcodigo_tarjeta_creditoPagosTarjetas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosTarjetas.jLabelnombre_tipo_interes_tarjetaPagosTarjetas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosTarjetas.jLabelnombre_conexionPagosTarjetas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosTarjetas.jLabelnombre_mesPagosTarjetas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosTarjetas.jLabelnumeroPagosTarjetas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosTarjetas.jLabellotePagosTarjetas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosTarjetas.jLabelvalorPagosTarjetas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosTarjetas.jLabelvalor_retencionPagosTarjetas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosTarjetas.jLabelvalor_comisionPagosTarjetas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosTarjetas.jLabelvalor_calculadoPagosTarjetas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosTarjetas.jLabelvalor_canceladoPagosTarjetas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosTarjetas.jLabelvalor_difierePagosTarjetas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosTarjetas.jLabelnumero_retencionPagosTarjetas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosTarjetas.jLabelnumero_liquidacionPagosTarjetas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosTarjetas.jLabelfechaPagosTarjetas,"");
		
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
		this.iIdNuevoPagosTarjetas--;	
		
		
		this.pagostarjetasAux=new PagosTarjetas();
		
		this.pagostarjetasAux.setId(this.iIdNuevoPagosTarjetas);
		this.pagostarjetasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.pagostarjetasLogic.getPagosTarjetass().add(this.pagostarjetasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.pagostarjetass.add(this.pagostarjetasAux);
		}
		//ARCHITECTURE
		
		this.pagostarjetas=this.pagostarjetasAux;
		
		if(PagosTarjetasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPagosTarjetas(this.pagostarjetas);
			this.setVariablesObjetoActualToFormularioForeignKeyPagosTarjetas(this.pagostarjetas);
		}
				
		//this.setDefaultControlesPagosTarjetas();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPagosTarjetas();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPagosTarjetas();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPagosTarjetas();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPagosTarjetas(this.pagostarjetasBean,this.pagostarjetas,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPagosTarjetas(this.pagostarjetasReturnGeneral,this.pagostarjetasBean,false);
		
		if(this.pagostarjetasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPagosTarjetas(this.pagostarjetasReturnGeneral.getPagosTarjetas());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPagosTarjetas(this.pagostarjetasReturnGeneral.getPagosTarjetas());
		}
		
		if(this.pagostarjetasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPagosTarjetas(this.pagostarjetasReturnGeneral.getPagosTarjetas(),classes);//this.pagostarjetasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPagosTarjetas();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPagosTarjetas();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PagosTarjetasBeanSwingJInternalFrameAdditional.RecargarFormPagosTarjetas(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPagosTarjetas(false);
						
			if(pagostarjetasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PagosTarjetasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPagosTarjetas();
			}
			
			this.actualizarVisualTableDatosPagosTarjetas();
			
			this.jTableDatosPagosTarjetas.setRowSelectionInterval(this.getIndiceNuevoPagosTarjetas(), this.getIndiceNuevoPagosTarjetas());
			
			this.seleccionarFilaTablaPagosTarjetasActual();
						
			this.actualizarEstadoCeldasBotonesPagosTarjetas("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPagosTarjetas(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPagosTarjetas.jDateChooserfecha_hastaPagosTarjetas.setEnabled(isHabilitar && this.pagostarjetasConstantesFunciones.activarfecha_hastaPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldcodigo_asiento_contablePagosTarjetas.setEnabled(isHabilitar && this.pagostarjetasConstantesFunciones.activarcodigo_asiento_contablePagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldcodigo_tarjeta_creditoPagosTarjetas.setEnabled(isHabilitar && this.pagostarjetasConstantesFunciones.activarcodigo_tarjeta_creditoPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextAreanombre_tipo_interes_tarjetaPagosTarjetas.setEnabled(isHabilitar && this.pagostarjetasConstantesFunciones.activarnombre_tipo_interes_tarjetaPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextAreanombre_conexionPagosTarjetas.setEnabled(isHabilitar && this.pagostarjetasConstantesFunciones.activarnombre_conexionPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnombre_mesPagosTarjetas.setEnabled(isHabilitar && this.pagostarjetasConstantesFunciones.activarnombre_mesPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumeroPagosTarjetas.setEnabled(isHabilitar && this.pagostarjetasConstantesFunciones.activarnumeroPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldlotePagosTarjetas.setEnabled(isHabilitar && this.pagostarjetasConstantesFunciones.activarlotePagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalorPagosTarjetas.setEnabled(isHabilitar && this.pagostarjetasConstantesFunciones.activarvalorPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_retencionPagosTarjetas.setEnabled(isHabilitar && this.pagostarjetasConstantesFunciones.activarvalor_retencionPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_comisionPagosTarjetas.setEnabled(isHabilitar && this.pagostarjetasConstantesFunciones.activarvalor_comisionPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_calculadoPagosTarjetas.setEnabled(isHabilitar && this.pagostarjetasConstantesFunciones.activarvalor_calculadoPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_canceladoPagosTarjetas.setEnabled(isHabilitar && this.pagostarjetasConstantesFunciones.activarvalor_canceladoPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_difierePagosTarjetas.setEnabled(isHabilitar && this.pagostarjetasConstantesFunciones.activarvalor_difierePagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumero_retencionPagosTarjetas.setEnabled(isHabilitar && this.pagostarjetasConstantesFunciones.activarnumero_retencionPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumero_liquidacionPagosTarjetas.setEnabled(isHabilitar && this.pagostarjetasConstantesFunciones.activarnumero_liquidacionPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jDateChooserfechaPagosTarjetas.setEnabled(isHabilitar && this.pagostarjetasConstantesFunciones.activarfechaPagosTarjetas);	
		//
		this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxid_empresaPagosTarjetas.setEnabled(isHabilitar && this.pagostarjetasConstantesFunciones.activarid_empresaPagosTarjetas);
	};
	
	public void setDefaultControlesPagosTarjetas() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPagosTarjetas(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.pagostarjetasSessionBean.setConGuardarRelaciones(true);			
			this.pagostarjetasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPagosTarjetas.jTabbedPaneRelacionesPagosTarjetas.setVisible(true);
			
					
		} else {
			//this.pagostarjetasSessionBean.setConGuardarRelaciones(false);			
			this.pagostarjetasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPagosTarjetas.jTabbedPaneRelacionesPagosTarjetas.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPagosTarjetas() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PagosTarjetas pagostarjetasAux:this.pagostarjetasLogic.getPagosTarjetass()) {
				if(pagostarjetasAux.getId().equals(this.iIdNuevoPagosTarjetas)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PagosTarjetas pagostarjetasAux:this.pagostarjetass) {
				if(pagostarjetasAux.getId().equals(this.iIdNuevoPagosTarjetas)) {
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
	
	public int getIndiceActualPagosTarjetas(PagosTarjetas pagostarjetas,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PagosTarjetas pagostarjetasAux:this.pagostarjetasLogic.getPagosTarjetass()) {
				if(pagostarjetasAux.getId().equals(pagostarjetas.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PagosTarjetas pagostarjetasAux:this.pagostarjetass) {
				if(pagostarjetasAux.getId().equals(pagostarjetas.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPagosTarjetas(PagosTarjetas pagostarjetasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PagosTarjetas pagostarjetasAux:this.pagostarjetasLogic.getPagosTarjetass()) {
				if(pagostarjetasAux.getPagosTarjetasOriginal().getId().equals(pagostarjetasOriginal.getId())) {
					existe=true;
					pagostarjetasOriginal.setId(pagostarjetasAux.getId());
					pagostarjetasOriginal.setVersionRow(pagostarjetasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PagosTarjetas pagostarjetasAux:this.pagostarjetass) {
				if(pagostarjetasAux.getPagosTarjetasOriginal().getId().equals(pagostarjetasOriginal.getId())) {
					existe=true;
					pagostarjetasOriginal.setId(pagostarjetasAux.getId());
					pagostarjetasOriginal.setVersionRow(pagostarjetasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPagosTarjetas(Boolean esParaCancelar) throws Exception {
		pagostarjetassAux=new ArrayList<PagosTarjetas>();
		pagostarjetasAux=new PagosTarjetas();
		
		if(!this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PagosTarjetas pagostarjetasAux:this.pagostarjetasLogic.getPagosTarjetass()) {
					if(pagostarjetasAux.getId()<0) {
						pagostarjetassAux.add(pagostarjetasAux);
					}		
				}
				this.iIdNuevoPagosTarjetas=0L;
				this.pagostarjetasLogic.getPagosTarjetass().removeAll(pagostarjetassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PagosTarjetas pagostarjetasAux:this.pagostarjetass) {
					if(pagostarjetasAux.getId()<0) {
						pagostarjetassAux.add(pagostarjetasAux);
					}		
				}
				this.iIdNuevoPagosTarjetas=0L;
				this.pagostarjetass.removeAll(pagostarjetassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPagosTarjetas 
					&& this.pagostarjetasLogic.getPagosTarjetass().size()>0
					) {
					pagostarjetasAux=this.pagostarjetasLogic.getPagosTarjetass().get(this.pagostarjetasLogic.getPagosTarjetass().size() - 1);
				
					if(pagostarjetasAux.getId()<0) {
						this.pagostarjetasLogic.getPagosTarjetass().remove(pagostarjetasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPagosTarjetas && this.pagostarjetass.size()>0) {
					pagostarjetasAux=this.pagostarjetass.get(this.pagostarjetass.size() - 1);
				
					if(pagostarjetasAux.getId()<0) {
						this.pagostarjetass.remove(pagostarjetasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPagosTarjetas(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(pagostarjetas.getId()<0) {
				this.pagostarjetasLogic.getPagosTarjetass().remove(this.pagostarjetas);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(pagostarjetas.getId()<0) {
				this.pagostarjetass.remove(this.pagostarjetas);
			}
		}			
	}
	
	public void setEstadosInicialesPagosTarjetas(List<PagosTarjetas> pagostarjetassAux) throws Exception {
		PagosTarjetasConstantesFunciones.setEstadosInicialesPagosTarjetas(pagostarjetassAux);
	}
	
	public void setEstadosInicialesPagosTarjetas(PagosTarjetas pagostarjetasAux) throws Exception {
		PagosTarjetasConstantesFunciones.setEstadosInicialesPagosTarjetas(pagostarjetasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPagosTarjetasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPagosTarjetas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPagosTarjetasActual()) {
				if(!this.isEsNuevoPagosTarjetas) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPagosTarjetas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPagosTarjetas=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPagosTarjetasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Pagos Tarjetas ?", "MANTENIMIENTO DE Pagos Tarjetas", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPagosTarjetas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PagosTarjetas pagostarjetas) throws Exception {
		PagosTarjetasConstantesFunciones.seleccionarAsignar(this.pagostarjetas,pagostarjetas);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPagosTarjetas=this.isPermisoActualizarOriginalPagosTarjetas;
			
			
			this.seleccionarAsignar(pagostarjetas);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesPagosTarjetas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.pagostarjetasSessionBean.setsFuncionBusquedaRapida(this.pagostarjetasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPagosTarjetas) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPagosTarjetas(esParaCancelar);				
				this.cancelarNuevoPagosTarjetas(esParaCancelar);								
			}
			
			this.pagostarjetas=new PagosTarjetas();
			
			this.inicializarPagosTarjetas();
			
			this.actualizarEstadoCeldasBotonesPagosTarjetas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPagosTarjetas() throws Exception {
		try {
			PagosTarjetasConstantesFunciones.inicializarPagosTarjetas(this.pagostarjetas);
			
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
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.pagostarjetasLogic.getPagosTarjetass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePagosTarjetass(String sAccionBusqueda,List<PagosTarjetas> pagostarjetassParaReportes) throws Exception {
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
					sPathReporteFinal="PagosTarjetas"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PagosTarjetasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PagosTarjetasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PagosTarjetas"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Pagos Tarjetases");		
		parameters.put("busquedapor", PagosTarjetasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePagosTarjetas=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PagosTarjetasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PagosTarjetasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePagosTarjetas=new JRBeanArrayDataSource(PagosTarjetasJInternalFrame.TraerPagosTarjetasBeans(pagostarjetassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePagosTarjetas);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PagosTarjetasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PagosTarjetasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PagosTarjetasBean.TraerPagosTarjetasBeans(pagostarjetassParaReportes).toArray()));
							
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
				this.generarExcelReportePagosTarjetass(sAccionBusqueda,sTipoArchivoReporte,pagostarjetassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPagosTarjetass(sAccionBusqueda,sTipoArchivoReporte,pagostarjetassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPagosTarjetasActionPerformed(null);
					//this.generarExcelReportePagosTarjetass(sAccionBusqueda,sTipoArchivoReporte,pagostarjetassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPagosTarjetass(sAccionBusqueda,sTipoArchivoReporte,pagostarjetassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPagosTarjetass(sAccionBusqueda,sTipoArchivoReporte,pagostarjetassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPagosTarjetass(sAccionBusqueda,sTipoArchivoReporte,pagostarjetassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePagosTarjetass(String sAccionBusqueda,String sTipoArchivoReporte,List<PagosTarjetas> pagostarjetassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagostarjetas";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PagosTarjetass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPagosTarjetas("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PagosTarjetas pagostarjetas : pagostarjetassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PagosTarjetasConstantesFunciones.generarExcelReporteDataPagosTarjetas("NORMAL",row,workbook,pagostarjetas,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Tarjetas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPagosTarjetas(String sTipo,Row row,Workbook workbook) {
		
		PagosTarjetasConstantesFunciones.generarExcelReporteHeaderPagosTarjetas(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPagosTarjetass(String sAccionBusqueda,String sTipoArchivoReporte,List<PagosTarjetas> pagostarjetassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagostarjetas_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PagosTarjetass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PagosTarjetas pagostarjetas : pagostarjetassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PagosTarjetasConstantesFunciones.getPagosTarjetasDescripcion(pagostarjetas));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosTarjetasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagostarjetas.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosTarjetasConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagostarjetas.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosTarjetasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagostarjetas.getcodigo_asiento_contable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosTarjetasConstantesFunciones.LABEL_CODIGOTARJETACREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_CODIGOTARJETACREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagostarjetas.getcodigo_tarjeta_credito());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosTarjetasConstantesFunciones.LABEL_NOMBRETIPOINTERESTARJETA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_NOMBRETIPOINTERESTARJETA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagostarjetas.getnombre_tipo_interes_tarjeta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosTarjetasConstantesFunciones.LABEL_NOMBRECONEXION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_NOMBRECONEXION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagostarjetas.getnombre_conexion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosTarjetasConstantesFunciones.LABEL_NOMBREMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_NOMBREMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagostarjetas.getnombre_mes());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosTarjetasConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagostarjetas.getnumero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosTarjetasConstantesFunciones.LABEL_LOTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_LOTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagostarjetas.getlote());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosTarjetasConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagostarjetas.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosTarjetasConstantesFunciones.LABEL_VALORRETENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_VALORRETENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagostarjetas.getvalor_retencion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosTarjetasConstantesFunciones.LABEL_VALORCOMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_VALORCOMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagostarjetas.getvalor_comision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosTarjetasConstantesFunciones.LABEL_VALORCALCULADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_VALORCALCULADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagostarjetas.getvalor_calculado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosTarjetasConstantesFunciones.LABEL_VALORCANCELADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_VALORCANCELADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagostarjetas.getvalor_cancelado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosTarjetasConstantesFunciones.LABEL_VALORDIFIERE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_VALORDIFIERE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagostarjetas.getvalor_difiere());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosTarjetasConstantesFunciones.LABEL_NUMERORETENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_NUMERORETENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagostarjetas.getnumero_retencion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosTarjetasConstantesFunciones.LABEL_NUMEROLIQUIDACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_NUMEROLIQUIDACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagostarjetas.getnumero_liquidacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosTarjetasConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagostarjetas.getfecha());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Tarjetas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPagosTarjetass(String sAccionBusqueda,String sTipoArchivoReporte,List<PagosTarjetas> pagostarjetassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PagosTarjetas> pagostarjetassRespaldo=null;
		
		classes=PagosTarjetasConstantesFunciones.getClassesRelationshipsOfPagosTarjetas(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.pagostarjetasLogic.setDatosCliente(this.datosCliente);
		this.pagostarjetasLogic.setDatosDeep(this.datosDeep);
		this.pagostarjetasLogic.setIsConDeep(true);
		
		pagostarjetassRespaldo=this.pagostarjetasLogic.getPagosTarjetass();
		
		this.pagostarjetasLogic.setPagosTarjetass(pagostarjetassParaReportes);	
		this.pagostarjetasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		pagostarjetassParaReportes=this.pagostarjetasLogic.getPagosTarjetass();
		this.pagostarjetasLogic.setPagosTarjetass(pagostarjetassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagostarjetas_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PagosTarjetass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPagosTarjetas("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PagosTarjetas pagostarjetas : pagostarjetassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPagosTarjetas("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PagosTarjetasConstantesFunciones.generarExcelReporteDataPagosTarjetas("NORMAL",row,workbook,pagostarjetas,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PagosTarjetasConstantesFunciones.getPagosTarjetasDescripcion(pagostarjetas));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Tarjetas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPagosTarjetas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPagosTarjetas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPagosTarjetas.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPagosTarjetas.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPagosTarjetas() throws Exception {		
		this.startProcessPagosTarjetas(true);
	}
	
	public void startProcessPagosTarjetas(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPagosTarjetas ,this.jPanelParametrosReportesPagosTarjetas, this.jScrollPanelDatosPagosTarjetas,this.jPanelPaginacionPagosTarjetas, this.jScrollPanelDatosEdicionPagosTarjetas, this.jPanelAccionesPagosTarjetas,this.jPanelAccionesFormularioPagosTarjetas,this.jmenuBarPagosTarjetas,this.jmenuBarDetallePagosTarjetas,this.jTtoolBarPagosTarjetas,this.jTtoolBarDetallePagosTarjetas);		
		
		final JTabbedPane jTabbedPaneBusquedasPagosTarjetas=this.jTabbedPaneBusquedasPagosTarjetas; 
		
		final JPanel jPanelParametrosReportesPagosTarjetas=this.jPanelParametrosReportesPagosTarjetas;
		//final JScrollPane jScrollPanelDatosPagosTarjetas=this.jScrollPanelDatosPagosTarjetas;
		final JTable jTableDatosPagosTarjetas=this.jTableDatosPagosTarjetas;		
		final JPanel jPanelPaginacionPagosTarjetas=this.jPanelPaginacionPagosTarjetas;
		//final JScrollPane jScrollPanelDatosEdicionPagosTarjetas=this.jScrollPanelDatosEdicionPagosTarjetas;
		final JPanel jPanelAccionesPagosTarjetas=this.jPanelAccionesPagosTarjetas;
		
		JPanel jPanelCamposAuxiliarPagosTarjetas=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPagosTarjetas=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
			jPanelCamposAuxiliarPagosTarjetas=this.jInternalFrameDetalleFormPagosTarjetas.jPanelCamposPagosTarjetas;
			jPanelAccionesFormularioAuxiliarPagosTarjetas=this.jInternalFrameDetalleFormPagosTarjetas.jPanelAccionesFormularioPagosTarjetas;
		}
		
		final JPanel jPanelCamposPagosTarjetas=jPanelCamposAuxiliarPagosTarjetas;
		final JPanel jPanelAccionesFormularioPagosTarjetas=jPanelAccionesFormularioAuxiliarPagosTarjetas;
		
		
		final JMenuBar jmenuBarPagosTarjetas=this.jmenuBarPagosTarjetas;
		final JToolBar jTtoolBarPagosTarjetas=this.jTtoolBarPagosTarjetas;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPagosTarjetas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPagosTarjetas=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
			jmenuBarDetalleAuxiliarPagosTarjetas=this.jInternalFrameDetalleFormPagosTarjetas.jmenuBarDetallePagosTarjetas;
			jTtoolBarDetalleAuxiliarPagosTarjetas=this.jInternalFrameDetalleFormPagosTarjetas.jTtoolBarDetallePagosTarjetas;
		}
		
		final JMenuBar jmenuBarDetallePagosTarjetas=jmenuBarDetalleAuxiliarPagosTarjetas;
		final JToolBar jTtoolBarDetallePagosTarjetas=jTtoolBarDetalleAuxiliarPagosTarjetas;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPagosTarjetas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPagosTarjetas;
			processRunnable.jTableDatos=jTableDatosPagosTarjetas;
			processRunnable.jPanelCampos=jPanelCamposPagosTarjetas;
			processRunnable.jPanelPaginacion=jPanelPaginacionPagosTarjetas;
			processRunnable.jPanelAcciones=jPanelAccionesPagosTarjetas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPagosTarjetas;
			
			
			processRunnable.jmenuBar=jmenuBarPagosTarjetas;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePagosTarjetas;
			processRunnable.jTtoolBar=jTtoolBarPagosTarjetas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePagosTarjetas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPagosTarjetas ,jPanelParametrosReportesPagosTarjetas,jTableDatosPagosTarjetas, /*jScrollPanelDatosPagosTarjetas,*/jPanelCamposPagosTarjetas,jPanelPaginacionPagosTarjetas, /*jScrollPanelDatosEdicionPagosTarjetas,*/ jPanelAccionesPagosTarjetas,jPanelAccionesFormularioPagosTarjetas,jmenuBarPagosTarjetas,jmenuBarDetallePagosTarjetas,jTtoolBarPagosTarjetas,jTtoolBarDetallePagosTarjetas);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPagosTarjetas ,jPanelParametrosReportesPagosTarjetas, jScrollPanelDatosPagosTarjetas,jPanelPaginacionPagosTarjetas, jScrollPanelDatosEdicionPagosTarjetas, jPanelAccionesPagosTarjetas,jPanelAccionesFormularioPagosTarjetas,jmenuBarPagosTarjetas,jmenuBarDetallePagosTarjetas,jTtoolBarPagosTarjetas,jTtoolBarDetallePagosTarjetas);
						
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
	
	public void finishProcessPagosTarjetas() {// throws Exception 
		this.finishProcessPagosTarjetas(true);
	}
	
	public void finishProcessPagosTarjetas(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPagosTarjetas ,this.jPanelParametrosReportesPagosTarjetas, this.jScrollPanelDatosPagosTarjetas,this.jPanelPaginacionPagosTarjetas, this.jScrollPanelDatosEdicionPagosTarjetas, this.jPanelAccionesPagosTarjetas,this.jPanelAccionesFormularioPagosTarjetas,this.jmenuBarPagosTarjetas,this.jmenuBarDetallePagosTarjetas,this.jTtoolBarPagosTarjetas,this.jTtoolBarDetallePagosTarjetas);		
		
		final JTabbedPane jTabbedPaneBusquedasPagosTarjetas=this.jTabbedPaneBusquedasPagosTarjetas; 
		
		final JPanel jPanelParametrosReportesPagosTarjetas=this.jPanelParametrosReportesPagosTarjetas;
		//final JScrollPane jScrollPanelDatosPagosTarjetas=this.jScrollPanelDatosPagosTarjetas;
		final JTable jTableDatosPagosTarjetas=this.jTableDatosPagosTarjetas;		
		final JPanel jPanelPaginacionPagosTarjetas=this.jPanelPaginacionPagosTarjetas;
		//final JScrollPane jScrollPanelDatosEdicionPagosTarjetas=this.jScrollPanelDatosEdicionPagosTarjetas;
		final JPanel jPanelAccionesPagosTarjetas=this.jPanelAccionesPagosTarjetas;
		
		JPanel jPanelCamposAuxiliarPagosTarjetas=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPagosTarjetas=new JPanel();
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
			jPanelCamposAuxiliarPagosTarjetas=this.jInternalFrameDetalleFormPagosTarjetas.jPanelCamposPagosTarjetas;
			jPanelAccionesFormularioAuxiliarPagosTarjetas=this.jInternalFrameDetalleFormPagosTarjetas.jPanelAccionesFormularioPagosTarjetas;
		}
		
		final JPanel jPanelCamposPagosTarjetas=jPanelCamposAuxiliarPagosTarjetas;
		final JPanel jPanelAccionesFormularioPagosTarjetas=jPanelAccionesFormularioAuxiliarPagosTarjetas;
		
		
		final JMenuBar jmenuBarPagosTarjetas=this.jmenuBarPagosTarjetas;		
		final JToolBar jTtoolBarPagosTarjetas=this.jTtoolBarPagosTarjetas;
				
		JMenuBar jmenuBarDetalleAuxiliarPagosTarjetas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPagosTarjetas=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
			jmenuBarDetalleAuxiliarPagosTarjetas=this.jInternalFrameDetalleFormPagosTarjetas.jmenuBarDetallePagosTarjetas;
			jTtoolBarDetalleAuxiliarPagosTarjetas=this.jInternalFrameDetalleFormPagosTarjetas.jTtoolBarDetallePagosTarjetas;		
		}
		
		final JMenuBar jmenuBarDetallePagosTarjetas=jmenuBarDetalleAuxiliarPagosTarjetas;
		final JToolBar jTtoolBarDetallePagosTarjetas=jTtoolBarDetalleAuxiliarPagosTarjetas;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPagosTarjetas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPagosTarjetas;
			processRunnable.jTableDatos=jTableDatosPagosTarjetas;
			processRunnable.jPanelCampos=jPanelCamposPagosTarjetas;
			processRunnable.jPanelPaginacion=jPanelPaginacionPagosTarjetas;
			processRunnable.jPanelAcciones=jPanelAccionesPagosTarjetas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPagosTarjetas;
			
			
			processRunnable.jmenuBar=jmenuBarPagosTarjetas;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePagosTarjetas;
			processRunnable.jTtoolBar=jTtoolBarPagosTarjetas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePagosTarjetas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPagosTarjetas ,jPanelParametrosReportesPagosTarjetas, jTableDatosPagosTarjetas,/*jScrollPanelDatosPagosTarjetas,*/jPanelCamposPagosTarjetas,jPanelPaginacionPagosTarjetas, /*jScrollPanelDatosEdicionPagosTarjetas,*/ jPanelAccionesPagosTarjetas,jPanelAccionesFormularioPagosTarjetas,jmenuBarPagosTarjetas,jmenuBarDetallePagosTarjetas,jTtoolBarPagosTarjetas,jTtoolBarDetallePagosTarjetas));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPagosTarjetas(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPagosTarjetas(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPagosTarjetas(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPagosTarjetas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPagosTarjetas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePagosTarjetas,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPagosTarjetas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPagosTarjetas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePagosTarjetas,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.pagostarjetasConstantesFunciones.getsFinalQueryPagosTarjetas();
		String  finalQueryPaginacionTodos=this.pagostarjetasConstantesFunciones.getsFinalQueryPagosTarjetas();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PagosTarjetasConstantesFunciones.getArrayColumnasGlobalesNoPagosTarjetas(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PagosTarjetasConstantesFunciones.getArrayColumnasGlobalesPagosTarjetas(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PagosTarjetasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.pagostarjetassEliminados= new ArrayList<PagosTarjetas>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPagosTarjetas();
		
				///*PagosTarjetasSessionBean*/this.pagostarjetasSessionBean=new PagosTarjetasSessionBean();
			
			if(this.pagostarjetasSessionBean==null) {
				this.pagostarjetasSessionBean=new PagosTarjetasSessionBean();
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
					this.iNumeroPaginacion=PagosTarjetasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PagosTarjetasConstantesFunciones.getClassesForeignKeysOfPagosTarjetas(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/pagostarjetas."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			pagostarjetassAux= new ArrayList<PagosTarjetas>();
			
				
			pagostarjetasLogic.setDatosCliente(this.datosCliente);
			pagostarjetasLogic.setDatosDeep(this.datosDeep);
			pagostarjetasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPagosTarjetas")) {
				this.sDetalleReporte=PagosTarjetasConstantesFunciones.getDetalleIndiceBusquedaPagosTarjetas(fecha_hastaBusquedaPagosTarjetas);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pagostarjetasLogic.getPagosTarjetassBusquedaPagosTarjetas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_hastaBusquedaPagosTarjetas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PagosTarjetasConstantesFunciones.getDetalleIndiceBusquedaPagosTarjetas(fecha_hastaBusquedaPagosTarjetas);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PagosTarjetasConstantesFunciones.getDetalleIndiceBusquedaPagosTarjetas(fecha_hastaBusquedaPagosTarjetas);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pagostarjetasLogic.getPagosTarjetass()==null||pagostarjetasLogic.getPagosTarjetass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pagostarjetass==null|| pagostarjetass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pagostarjetassAux=new ArrayList<PagosTarjetas>();
						pagostarjetassAux.addAll(pagostarjetasLogic.getPagosTarjetass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pagostarjetassAux=new ArrayList<PagosTarjetas>();
							pagostarjetassAux.addAll(pagostarjetass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pagostarjetasLogic.getPagosTarjetassBusquedaPagosTarjetas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_hastaBusquedaPagosTarjetas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PagosTarjetasConstantesFunciones.getDetalleIndiceBusquedaPagosTarjetas(fecha_hastaBusquedaPagosTarjetas);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PagosTarjetasConstantesFunciones.getDetalleIndiceBusquedaPagosTarjetas(fecha_hastaBusquedaPagosTarjetas);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePagosTarjetass("BusquedaPagosTarjetas",pagostarjetasLogic.getPagosTarjetass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePagosTarjetass("BusquedaPagosTarjetas",pagostarjetass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pagostarjetasLogic.setPagosTarjetass(new ArrayList<PagosTarjetas>());
						pagostarjetasLogic.getPagosTarjetass().addAll(pagostarjetassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pagostarjetass=new ArrayList<PagosTarjetas>();
							pagostarjetass.addAll(pagostarjetassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPagosTarjetas();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPagosTarjetas();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=pagostarjetasLogic.getPagosTarjetass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pagostarjetass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=pagostarjetasLogic.getPagosTarjetass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pagostarjetass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PagosTarjetas pagostarjetas) {
		Boolean permite=true;
		
		if(this.pagostarjetas.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PagosTarjetasConstantesFunciones.getOrderByListaPagosTarjetas();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PagosTarjetasConstantesFunciones.getOrderByListaPagosTarjetas();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PagosTarjetas pagostarjetas:pagostarjetasLogic.getPagosTarjetass()) {
				if(pagostarjetas.getsType().equals(Constantes2.S_TOTALES)) {
					pagostarjetasTotales=pagostarjetas;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PagosTarjetas pagostarjetas:this.pagostarjetass) {
				if(pagostarjetas.getsType().equals(Constantes2.S_TOTALES)) {
					pagostarjetasTotales=pagostarjetas;
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
			this.pagostarjetasAux=new PagosTarjetas();
			this.pagostarjetasAux.setsType(Constantes2.S_TOTALES);
			this.pagostarjetasAux.setIsNew(false);
			this.pagostarjetasAux.setIsChanged(false);
			this.pagostarjetasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//PagosTarjetasConstantesFunciones.TotalizarValoresFilaPagosTarjetas(this.pagostarjetasLogic.getPagosTarjetass(),this.pagostarjetasAux);
				
				//this.pagostarjetasLogic.getPagosTarjetass().add(this.pagostarjetasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PagosTarjetasConstantesFunciones.TotalizarValoresFilaPagosTarjetas(this.pagostarjetass,this.pagostarjetasAux);
				
				this.pagostarjetass.add(this.pagostarjetasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		pagostarjetasTotales=new PagosTarjetas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.pagostarjetasLogic.getPagosTarjetass().remove(pagostarjetasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.pagostarjetass.remove(pagostarjetasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		pagostarjetasTotales=new PagosTarjetas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PagosTarjetas pagostarjetas:pagostarjetasLogic.getPagosTarjetass()) {
				if(pagostarjetas.getsType().equals(Constantes2.S_TOTALES)) {
					pagostarjetasTotales=pagostarjetas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PagosTarjetasConstantesFunciones.TotalizarValoresFilaPagosTarjetas(this.pagostarjetasLogic.getPagosTarjetass(),pagostarjetasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PagosTarjetas pagostarjetas:this.pagostarjetass) {
				if(pagostarjetas.getsType().equals(Constantes2.S_TOTALES)) {
					pagostarjetasTotales=pagostarjetas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PagosTarjetasConstantesFunciones.TotalizarValoresFilaPagosTarjetas(this.pagostarjetass,pagostarjetasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPagosTarjetassBusquedaPagosTarjetas()throws Exception {
		try {
			sAccionBusqueda="BusquedaPagosTarjetas";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPagosTarjetassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPagosTarjetassBusquedaPagosTarjetas(String sFinalQuery,Date fecha_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pagostarjetasLogic.getPagosTarjetassBusquedaPagosTarjetas(sFinalQuery,this.pagination,fecha_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPagosTarjetassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pagostarjetasLogic.getPagosTarjetassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosPagosTarjetas() {
		this.isPermisoTodoPagosTarjetas=false;
		this.isPermisoNuevoPagosTarjetas=false;
		this.isPermisoActualizarPagosTarjetas=false;
		this.isPermisoActualizarOriginalPagosTarjetas=false;
		this.isPermisoEliminarPagosTarjetas=false;
		this.isPermisoGuardarCambiosPagosTarjetas=false;
		this.isPermisoConsultaPagosTarjetas=true;
		this.isPermisoBusquedaPagosTarjetas=true;
		this.isPermisoReportePagosTarjetas=true;
		this.isPermisoOrdenPagosTarjetas=false;		
		this.isPermisoPaginacionMedioPagosTarjetas=false;		
		this.isPermisoPaginacionAltoPagosTarjetas=false;		
		this.isPermisoPaginacionTodoPagosTarjetas=false;		
		this.isPermisoCopiarPagosTarjetas=false;		
		this.isPermisoVerFormPagosTarjetas=false;		
		this.isPermisoDuplicarPagosTarjetas=false;
		this.isPermisoOrdenPagosTarjetas=false;
	}
	
	public void setPermisosUsuarioPagosTarjetas(Boolean isPermiso) {
		this.isPermisoTodoPagosTarjetas=isPermiso;
		this.isPermisoNuevoPagosTarjetas=isPermiso;
		this.isPermisoActualizarPagosTarjetas=isPermiso;
		this.isPermisoActualizarOriginalPagosTarjetas=isPermiso;
		this.isPermisoEliminarPagosTarjetas=isPermiso;
		this.isPermisoGuardarCambiosPagosTarjetas=isPermiso;
		this.isPermisoConsultaPagosTarjetas=isPermiso;
		this.isPermisoBusquedaPagosTarjetas=isPermiso;
		this.isPermisoReportePagosTarjetas=isPermiso;
		this.isPermisoOrdenPagosTarjetas=isPermiso;		
		this.isPermisoPaginacionMedioPagosTarjetas=isPermiso;		
		this.isPermisoPaginacionAltoPagosTarjetas=isPermiso;		
		this.isPermisoPaginacionTodoPagosTarjetas=isPermiso;		
		this.isPermisoCopiarPagosTarjetas=isPermiso;		
		this.isPermisoVerFormPagosTarjetas=isPermiso;		
		this.isPermisoDuplicarPagosTarjetas=isPermiso;
		this.isPermisoOrdenPagosTarjetas=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPagosTarjetas(Boolean isPermiso) {
		//this.isPermisoTodoPagosTarjetas=isPermiso;
		this.isPermisoNuevoPagosTarjetas=isPermiso;
		this.isPermisoActualizarPagosTarjetas=isPermiso;
		this.isPermisoActualizarOriginalPagosTarjetas=isPermiso;
		this.isPermisoEliminarPagosTarjetas=isPermiso;
		this.isPermisoGuardarCambiosPagosTarjetas=isPermiso;
		//this.isPermisoConsultaPagosTarjetas=isPermiso;
		//this.isPermisoBusquedaPagosTarjetas=isPermiso;
		//this.isPermisoReportePagosTarjetas=isPermiso;
		//this.isPermisoOrdenPagosTarjetas=isPermiso;		
		//this.isPermisoPaginacionMedioPagosTarjetas=isPermiso;		
		//this.isPermisoPaginacionAltoPagosTarjetas=isPermiso;		
		//this.isPermisoPaginacionTodoPagosTarjetas=isPermiso;		
		//this.isPermisoCopiarPagosTarjetas=isPermiso;		
		//this.isPermisoDuplicarPagosTarjetas=isPermiso;
		//this.isPermisoOrdenPagosTarjetas=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPagosTarjetasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PagosTarjetasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPagosTarjetas(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPagosTarjetasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPagosTarjetasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPagosTarjetasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPagosTarjetasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPagosTarjetas() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PagosTarjetasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PagosTarjetasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPagosTarjetas=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPagosTarjetas=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPagosTarjetas=this.isPermisoActualizarPagosTarjetas;
			this.isPermisoEliminarPagosTarjetas=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPagosTarjetas=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPagosTarjetas=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPagosTarjetas=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPagosTarjetas=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePagosTarjetas=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPagosTarjetas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPagosTarjetas=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPagosTarjetas=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPagosTarjetas=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPagosTarjetas=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPagosTarjetas=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPagosTarjetas=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPagosTarjetas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPagosTarjetas.setToolTipText(this.jTableDatosPagosTarjetas.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPagosTarjetas(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPagosTarjetas(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PagosTarjetasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PagosTarjetasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPagosTarjetas() throws Exception {
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
	public void inicializarCombosForeignKeyPagosTarjetasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPagosTarjetasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PagosTarjetasJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyPagosTarjetas()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.pagostarjetasSessionBean==null) {
				this.pagostarjetasSessionBean=new PagosTarjetasSessionBean();
			}

			if(!this.pagostarjetasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyPagosTarjetas()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPagosTarjetas(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPagosTarjetas()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPagosTarjetas();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPagosTarjetas(PagosTarjetas pagostarjetas)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPagosTarjetas(PagosTarjetas pagostarjetas,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPagosTarjetas()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPagosTarjetas()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPagosTarjetas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPagosTarjetas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPagosTarjetas()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPagosTarjetas()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPagosTarjetas(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPagosTarjetas()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxid_empresaPagosTarjetas!=null && this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxid_empresaPagosTarjetas.getItemCount()>0) {
				this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxid_empresaPagosTarjetas.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public PagosTarjetasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PagosTarjetasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PagosTarjetasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.pagostarjetasSessionBean=new PagosTarjetasSessionBean(); 
		this.pagostarjetasConstantesFunciones=new PagosTarjetasConstantesFunciones(); 
		this.pagostarjetasBean=new PagosTarjetas();//(this.pagostarjetasConstantesFunciones); 		
		this.pagostarjetasReturnGeneral=new PagosTarjetasParameterReturnGeneral(); 
		
		this.pagostarjetasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pagostarjetasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PagosTarjetasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PagosTarjetasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PagosTarjetasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPagosTarjetas(true);
			
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
			
			this.pagostarjetasConstantesFunciones=new PagosTarjetasConstantesFunciones(); 
			this.pagostarjetasBean=new PagosTarjetas();//this.pagostarjetasConstantesFunciones); 			
			this.pagostarjetasReturnGeneral=new PagosTarjetasParameterReturnGeneral(); 
		
			PagosTarjetasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pagos Tarjetas Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.pagostarjetas=new PagosTarjetas();
			this.pagostarjetass = new ArrayList<PagosTarjetas>();
			this.pagostarjetassAux = new ArrayList<PagosTarjetas>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic=new PagosTarjetasLogic();
				this.pagostarjetasLogic.getNewConnexionToDeep("");
			}
			
			//this.pagostarjetasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.pagostarjetasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPagosTarjetas);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPagosTarjetas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPagosTarjetas);	
					}
					
					if(this.jInternalFrameImportacionPagosTarjetas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPagosTarjetas);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPagosTarjetas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPagosTarjetas);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPagosTarjetas!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPagosTarjetas);
				this.jInternalFrameDetalleFormPagosTarjetas.setVisible(false);
				this.jInternalFrameDetalleFormPagosTarjetas.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPagosTarjetas!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPagosTarjetas);
					this.jInternalFrameReporteDinamicoPagosTarjetas.setVisible(false);
					this.jInternalFrameReporteDinamicoPagosTarjetas.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPagosTarjetas!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPagosTarjetas);
					this.jInternalFrameImportacionPagosTarjetas.setVisible(false);
					this.jInternalFrameImportacionPagosTarjetas.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPagosTarjetas!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPagosTarjetas);
					this.jInternalFrameOrderByPagosTarjetas.setVisible(false);
					this.jInternalFrameOrderByPagosTarjetas.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPagosTarjetasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PagosTarjetasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.pagostarjetasReturnGeneral=new PagosTarjetasParameterReturnGeneral();
			
			this.pagostarjetasParameterGeneral=new PagosTarjetasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.pagostarjetasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PagosTarjetasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PagosTarjetasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.pagostarjetasSessionBean.getEsGuardarRelacionado(),this.pagostarjetasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PagosTarjetasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.pagostarjetasSessionBean.getEsGuardarRelacionado(),this.pagostarjetasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPagosTarjetas=false;
			this.isVisibilidadCeldaDuplicarPagosTarjetas=true;
			this.isVisibilidadCeldaCopiarPagosTarjetas=true;
			this.isVisibilidadCeldaVerFormPagosTarjetas=true;
			this.isVisibilidadCeldaOrdenPagosTarjetas=true;
			this.isVisibilidadCeldaNuevoRelacionesPagosTarjetas=false;
			this.isVisibilidadCeldaModificarPagosTarjetas=false;
			this.isVisibilidadCeldaActualizarPagosTarjetas=false;
			this.isVisibilidadCeldaEliminarPagosTarjetas=false;
			this.isVisibilidadCeldaCancelarPagosTarjetas=false;
			this.isVisibilidadCeldaGuardarPagosTarjetas=false;
			this.isVisibilidadCeldaGuardarCambiosPagosTarjetas=false;
			
			
			this.isVisibilidadBusquedaPagosTarjetas=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPagosTarjetas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPagosTarjetas();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPagosTarjetas(false);
			
			this.setPermisosUsuarioPagosTarjetas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pagostarjetasSessionBean.getEsGuardarRelacionado() 
				|| (this.pagostarjetasSessionBean.getEsGuardarRelacionado() && this.pagostarjetasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPagosTarjetasClasesRelacionadas();
			}
			
			if(this.pagostarjetasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPagosTarjetasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PagosTarjetasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPagosTarjetas();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPagosTarjetas();
			}
			
			if(!this.isPermisoBusquedaPagosTarjetas) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPagosTarjetas.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PagosTarjetasConstantesFunciones.getTiposSeleccionarPagosTarjetas());
				
				this.tiposColumnasSelect=PagosTarjetasConstantesFunciones.getTiposSeleccionarPagosTarjetas(true);
				
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
			//if(!this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPagosTarjetas();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioPagosTarjetas(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioPagosTarjetas(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPagosTarjetas() ;
			
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
				pagostarjetasImplementable= (PagosTarjetasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PagosTarjetasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				pagostarjetasImplementableHome= (PagosTarjetasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PagosTarjetasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.pagostarjetass= new ArrayList<PagosTarjetas>();
			this.pagostarjetassEliminados= new ArrayList<PagosTarjetas>();
						
			this.isEsNuevoPagosTarjetas=false;
			this.esParaAccionDesdeFormularioPagosTarjetas=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPagosTarjetas(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPagosTarjetas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PagosTarjetasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PagosTarjetasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPagosTarjetas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPagosTarjetas(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPagosTarjetas();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPagosTarjetas();
			}
			
			PagosTarjetasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPagosTarjetas.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPagosTarjetas.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPagosTarjetas.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPagosTarjetas(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PagosTarjetas: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPagosTarjetas() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPagosTarjetas")) {
				iIndex=this.jInternalFrameDetalleFormPagosTarjetas.jTabbedPaneRelacionesPagosTarjetas.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPagosTarjetas.jTabbedPaneRelacionesPagosTarjetas.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPagosTarjetas();	
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
	
	public void cargarCombosForeignKeyPagosTarjetas(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPagosTarjetas(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPagosTarjetas(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPagosTarjetasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPagosTarjetas();
		
		this.cargarCombosFrameForeignKeyPagosTarjetas();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPagosTarjetas();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPagosTarjetas();
		}
	}
	
	
	
	public void jButtonNuevoPagosTarjetasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.pagostarjetasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPagosTarjetas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
			
			
			if(jTableDatosPagosTarjetas.getRowCount()>=1) {
				jTableDatosPagosTarjetas.removeRowSelectionInterval(0, jTableDatosPagosTarjetas.getRowCount()-1);						
			}
			
			this.isEsNuevoPagosTarjetas=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPagosTarjetas(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPagosTarjetas(true);			
			//this.pagostarjetas=new PagosTarjetas();
			//this.pagostarjetas.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPagosTarjetas(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPagosTarjetas() ;
			
			if(PagosTarjetasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePagosTarjetas(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.pagostarjetas);	
			this.actualizarInformacion("INFO_PADRE",false,this.pagostarjetas);				
			
			PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
			
			if(this.pagostarjetasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PagosTarjetas: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPagosTarjetasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PagosTarjetas> pagostarjetassSeleccionados=new ArrayList<PagosTarjetas>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPagosTarjetas.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPagosTarjetas.getSelectedRows().length;			
			}
			
			pagostarjetassSeleccionados=this.getPagosTarjetassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPagosTarjetas--;			
				//PagosTarjetas pagostarjetasAux= new PagosTarjetas();			
				//pagostarjetasAux.setId(this.iIdNuevoPagosTarjetas);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PagosTarjetas pagostarjetasOrigen=new PagosTarjetas();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PagosTarjetas pagostarjetasOrigen : pagostarjetassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							pagostarjetasOrigen =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pagostarjetasOrigen =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPagosTarjetas();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.pagostarjetas.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPagosTarjetas(pagostarjetasOrigen,this.pagostarjetas,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.pagostarjetasLogic.getPagosTarjetass().add(this.pagostarjetasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.pagostarjetass.add(this.pagostarjetasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPagosTarjetas(false);
				
				this.jTableDatosPagosTarjetas.setRowSelectionInterval(this.getIndiceNuevoPagosTarjetas(), this.getIndiceNuevoPagosTarjetas());
				
				int iLastRow =  this.jTableDatosPagosTarjetas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPagosTarjetas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPagosTarjetas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPagosTarjetas(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PagosTarjetas> pagostarjetassSeleccionados=new ArrayList<PagosTarjetas>();									
		
			PagosTarjetas pagostarjetasOrigen=new PagosTarjetas();
			PagosTarjetas pagostarjetasDestino=new PagosTarjetas();
				
			pagostarjetassSeleccionados=this.getPagosTarjetassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPagosTarjetas.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || pagostarjetassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPagosTarjetas.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pagostarjetasOrigen =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						pagostarjetasOrigen =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pagostarjetasDestino =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						pagostarjetasDestino =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				pagostarjetasOrigen =pagostarjetassSeleccionados.get(0);
				pagostarjetasDestino =pagostarjetassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPagosTarjetas(pagostarjetasOrigen,pagostarjetasDestino,true,false);
				
				pagostarjetasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(pagostarjetasDestino,pagostarjetasLogic.getPagosTarjetass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(pagostarjetasDestino,pagostarjetass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPagosTarjetas(false);
				
				//this.jTableDatosPagosTarjetas.setRowSelectionInterval(this.getIndiceNuevoPagosTarjetas(), this.getIndiceNuevoPagosTarjetas());
				
				int iLastRow =  this.jTableDatosPagosTarjetas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPagosTarjetas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPagosTarjetas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPagosTarjetas(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPagosTarjetas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPagosTarjetas.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPagosTarjetas.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPagosTarjetas.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPagosTarjetas.setVisible(!isVisible);
			this.jPanelPaginacionPagosTarjetas.setVisible(!isVisible);
			this.jPanelAccionesPagosTarjetas.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePagosTarjetas();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPagosTarjetas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPagosTarjetas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPagosTarjetas();
			
			this.abrirFrameOrderByPagosTarjetas();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPagosTarjetas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePagosTarjetas(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPagosTarjetas);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPagosTarjetas.isMaximum()) {
					this.jInternalFrameDetalleFormPagosTarjetas.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPagosTarjetas.setSize(this.jInternalFrameDetalleFormPagosTarjetas.iWidthFormulario,this.jInternalFrameDetalleFormPagosTarjetas.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPagosTarjetas.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPagosTarjetas.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPagosTarjetas.isMaximum()) {
						this.jInternalFrameDetalleFormPagosTarjetas.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPagosTarjetas.jContentPaneDetallePagosTarjetas.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPagosTarjetas.jTabbedPaneRelacionesPagosTarjetas.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPagosTarjetas.jContentPaneDetallePagosTarjetas.getWidth(),PagosTarjetasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPagosTarjetas.jTabbedPaneRelacionesPagosTarjetas.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPagosTarjetas.jContentPaneDetallePagosTarjetas.getWidth(),PagosTarjetasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPagosTarjetas.jTabbedPaneRelacionesPagosTarjetas.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPagosTarjetas.jContentPaneDetallePagosTarjetas.getWidth(),PagosTarjetasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPagosTarjetas.setVisible(true);
	        this.jInternalFrameDetalleFormPagosTarjetas.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPagosTarjetas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPagosTarjetas==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPagosTarjetas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPagosTarjetas,false,this);
				} else {
					this.jInternalFrameOrderByPagosTarjetas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPagosTarjetas,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPagosTarjetas);
				this.jInternalFrameOrderByPagosTarjetas.setVisible(false);
				this.jInternalFrameOrderByPagosTarjetas.setSelected(false);
				
				this.jInternalFrameOrderByPagosTarjetas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPagosTarjetas"));
				
				this.inicializarActualizarBindingTablaOrderByPagosTarjetas();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPagosTarjetas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPagosTarjetas==null) {
				
				this.jInternalFrameImportacionPagosTarjetas=new ImportacionJInternalFrame(PagosTarjetasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPagosTarjetas);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPagosTarjetas);
				this.jInternalFrameImportacionPagosTarjetas.setVisible(false);
				this.jInternalFrameImportacionPagosTarjetas.setSelected(false);


				this.jInternalFrameImportacionPagosTarjetas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPagosTarjetas"));
				this.jInternalFrameImportacionPagosTarjetas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPagosTarjetas"));
				this.jInternalFrameImportacionPagosTarjetas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPagosTarjetas"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPagosTarjetas() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPagosTarjetas==null) {
				this.jInternalFrameReporteDinamicoPagosTarjetas=new ReporteDinamicoJInternalFrame(PagosTarjetasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPagosTarjetas);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPagosTarjetas);
				this.jInternalFrameReporteDinamicoPagosTarjetas.setVisible(false);
				this.jInternalFrameReporteDinamicoPagosTarjetas.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPagosTarjetas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPagosTarjetas"));
				this.jInternalFrameReporteDinamicoPagosTarjetas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPagosTarjetas"));
				this.jInternalFrameReporteDinamicoPagosTarjetas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPagosTarjetas"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPagosTarjetas();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePagosTarjetas() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPagosTarjetas);
			
	       	this.jInternalFrameDetalleFormPagosTarjetas.setVisible(false);
	        this.jInternalFrameDetalleFormPagosTarjetas.setSelected(false);
			
			//this.jInternalFrameDetalleFormPagosTarjetas.dispose();
			//this.jInternalFrameDetalleFormPagosTarjetas=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPagosTarjetas() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPagosTarjetas.setVisible(true);
	        this.jInternalFrameReporteDinamicoPagosTarjetas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPagosTarjetas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPagosTarjetas.setVisible(true);
	        this.jInternalFrameImportacionPagosTarjetas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPagosTarjetas() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPagosTarjetas.setVisible(true);
	        this.jInternalFrameOrderByPagosTarjetas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPagosTarjetas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPagosTarjetas.setVisible(false);
	        this.jInternalFrameOrderByPagosTarjetas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPagosTarjetas() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPagosTarjetas.setVisible(false);
	        this.jInternalFrameReporteDinamicoPagosTarjetas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPagosTarjetas() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPagosTarjetas.setVisible(false);
	        this.jInternalFrameImportacionPagosTarjetas.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPagosTarjetas(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPagosTarjetas(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPagosTarjetas(true);
			//this.isEsNuevoPagosTarjetas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPagosTarjetas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPagosTarjetas(false) ;
			
			if(pagostarjetasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PagosTarjetasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePagosTarjetas(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPagosTarjetas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPagosTarjetasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPagosTarjetas(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPagosTarjetas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPagosTarjetas(true);
			//this.isEsNuevoPagosTarjetas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.pagostarjetas.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPagosTarjetas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPagosTarjetas(false) ;
			
			if(PagosTarjetasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePagosTarjetas(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPagosTarjetas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPagosTarjetas(false);
			
			//if(!this.isEsNuevoPagosTarjetas) {								
				int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PagosTarjetasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
				
			}
			
			if(this.permiteMantenimiento(this.pagostarjetas)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPagosTarjetas=true;
					this.inicializarActualizarBindingTablaPagosTarjetas(false);
					this.isEsNuevoPagosTarjetas=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPagosTarjetas=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPagosTarjetas=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPagosTarjetas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPagosTarjetas(false);
				
				this.habilitarDeshabilitarControlesPagosTarjetas(false);
			
												
				
				if(PagosTarjetasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePagosTarjetas();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPagosTarjetasActionPerformed(evt,pagostarjetasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPagosTarjetas(this.pagostarjetas,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPagosTarjetas.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,pagostarjetasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.pagostarjetas.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PagosTarjetas.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosTarjetas.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				this.pagostarjetas.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				this.pagostarjetas.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.pagostarjetas)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PagosTarjetasModel) this.jTableDatosPagosTarjetas.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPagosTarjetas=true;
				this.inicializarActualizarBindingTablaPagosTarjetas(false);
				this.isEsNuevoPagosTarjetas=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPagosTarjetas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPagosTarjetas(false);
				
				this.habilitarDeshabilitarControlesPagosTarjetas(false);
				
				
				
				if(PagosTarjetasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePagosTarjetas();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPagosTarjetas.getRowCount()>=1) {
				jTableDatosPagosTarjetas.removeRowSelectionInterval(0, jTableDatosPagosTarjetas.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPagosTarjetas(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPagosTarjetas(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPagosTarjetas(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPagosTarjetas(false) ;
			
			this.isEsNuevoPagosTarjetas=false;
			
			if(PagosTarjetasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePagosTarjetas();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPagosTarjetas(false);
				
				//SI ES MANUAL
				if(PagosTarjetasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPagosTarjetas();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPagosTarjetas--;			
			//PagosTarjetas pagostarjetasAux= new PagosTarjetas();			
			//pagostarjetasAux.setId(this.iIdNuevoPagosTarjetas);
			
			if(this.jInternalFrameDetalleFormPagosTarjetas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPagosTarjetas();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
			
			this.pagostarjetas.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.pagostarjetasLogic.getPagosTarjetass().add(this.pagostarjetasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.pagostarjetass.add(this.pagostarjetasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPagosTarjetas(false);
			
			this.jTableDatosPagosTarjetas.setRowSelectionInterval(this.getIndiceNuevoPagosTarjetas(), this.getIndiceNuevoPagosTarjetas());
			
			int iLastRow =  this.jTableDatosPagosTarjetas.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPagosTarjetas.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPagosTarjetas.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPagosTarjetas(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPagosTarjetas(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPagosTarjetas(false);
			
			//SI ES MANUAL
			if(PagosTarjetasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPagosTarjetas();
			}
			
			//this.abrirFrameTreePagosTarjetas();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPagosTarjetas.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPagosTarjetas.setFileImportacion(this.jInternalFrameImportacionPagosTarjetas.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPagosTarjetas.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPagosTarjetas.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPagosTarjetas.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPagosTarjetas.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PagosTarjetas> pagostarjetassSeleccionados=new ArrayList<PagosTarjetas>();		

		pagostarjetassSeleccionados=this.getPagosTarjetassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPagosTarjetas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPagosTarjetas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PagosTarjetasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PagosTarjetasBaseDesign.jrxml";
			
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
			
			this.generarReportePagosTarjetass("Todos",pagostarjetassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Tarjetas",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPagosTarjetas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPagosTarjetas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PagosTarjetasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoAsientoContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoAsientoContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoAsientoContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoAsientoContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosTarjetasConstantesFunciones.LABEL_CODIGOTARJETACREDITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoTarjetaCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoTarjetaCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoTarjetaCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoTarjetaCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosTarjetasConstantesFunciones.LABEL_NOMBRETIPOINTERESTARJETA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTipoInteresTarjeta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTipoInteresTarjeta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTipoInteresTarjeta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTipoInteresTarjeta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosTarjetasConstantesFunciones.LABEL_NOMBRECONEXION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreConexion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreConexion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreConexion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreConexion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosTarjetasConstantesFunciones.LABEL_NOMBREMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreMes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreMes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreMes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreMes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosTarjetasConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosTarjetasConstantesFunciones.LABEL_LOTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_te_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_te_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_te_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_te_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORRETENCION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorRetencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorRetencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorRetencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorRetencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORCOMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorComision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorComision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorComision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorComision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORCALCULADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorCalculado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorCalculado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorCalculado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorCalculado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORCANCELADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorCancelado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorCancelado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorCancelado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorCancelado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORDIFIERE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorDifiere_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorDifiere_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorDifiere_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorDifiere_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosTarjetasConstantesFunciones.LABEL_NUMERORETENCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroRetencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroRetencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroRetencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroRetencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosTarjetasConstantesFunciones.LABEL_NUMEROLIQUIDACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroLiquidacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroLiquidacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroLiquidacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroLiquidacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosTarjetasConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPagosTarjetas.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPagosTarjetas.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPagosTarjetas.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PagosTarjetasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE:
					sNombreCampoCategoria="codigo_asiento_contable";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_CODIGOTARJETACREDITO:
					sNombreCampoCategoria="codigo_tarjeta_credito";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NOMBRETIPOINTERESTARJETA:
					sNombreCampoCategoria="nombre_tipo_interes_tarjeta";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NOMBRECONEXION:
					sNombreCampoCategoria="nombre_conexion";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NOMBREMES:
					sNombreCampoCategoria="nombre_mes";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_LOTE:
					sNombreCampoCategoria="lote";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORRETENCION:
					sNombreCampoCategoria="valor_retencion";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORCOMISION:
					sNombreCampoCategoria="valor_comision";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORCALCULADO:
					sNombreCampoCategoria="valor_calculado";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORCANCELADO:
					sNombreCampoCategoria="valor_cancelado";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORDIFIERE:
					sNombreCampoCategoria="valor_difiere";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NUMERORETENCION:
					sNombreCampoCategoria="numero_retencion";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NUMEROLIQUIDACION:
					sNombreCampoCategoria="numero_liquidacion";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPagosTarjetas.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PagosTarjetasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE:
					sNombreCampoCategoriaValor="codigo_asiento_contable";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_CODIGOTARJETACREDITO:
					sNombreCampoCategoriaValor="codigo_tarjeta_credito";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NOMBRETIPOINTERESTARJETA:
					sNombreCampoCategoriaValor="nombre_tipo_interes_tarjeta";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NOMBRECONEXION:
					sNombreCampoCategoriaValor="nombre_conexion";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NOMBREMES:
					sNombreCampoCategoriaValor="nombre_mes";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_LOTE:
					sNombreCampoCategoriaValor="lote";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORRETENCION:
					sNombreCampoCategoriaValor="valor_retencion";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORCOMISION:
					sNombreCampoCategoriaValor="valor_comision";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORCALCULADO:
					sNombreCampoCategoriaValor="valor_calculado";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORCANCELADO:
					sNombreCampoCategoriaValor="valor_cancelado";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORDIFIERE:
					sNombreCampoCategoriaValor="valor_difiere";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NUMERORETENCION:
					sNombreCampoCategoriaValor="numero_retencion";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NUMEROLIQUIDACION:
					sNombreCampoCategoriaValor="numero_liquidacion";
					break;

				case PagosTarjetasConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPagosTarjetas.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPagosTarjetas.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PagosTarjetasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Asiento Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_asiento_contable");
					break;

				case PagosTarjetasConstantesFunciones.LABEL_CODIGOTARJETACREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Tarjeta Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_tarjeta_credito");
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NOMBRETIPOINTERESTARJETA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Tipo Interes Tarjeta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_tipo_interes_tarjeta");
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NOMBRECONEXION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Conexion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_conexion");
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NOMBREMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_mes");
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
					break;

				case PagosTarjetasConstantesFunciones.LABEL_LOTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Lote",sNombreCampoCategoria,sNombreCampoCategoriaValor,"lote");
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORRETENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Retencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_retencion");
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORCOMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Comision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_comision");
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORCALCULADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Calculado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_calculado");
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORCANCELADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Cancelado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_cancelado");
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORDIFIERE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Difiere",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_difiere");
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NUMERORETENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Retencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_retencion");
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NUMEROLIQUIDACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Liquidacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_liquidacion");
					break;

				case PagosTarjetasConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
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
	
	public void jButtonGenerarExcelReporteDinamicoPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PagosTarjetas> pagostarjetassSeleccionados=new ArrayList<PagosTarjetas>();		
		
		pagostarjetassSeleccionados=this.getPagosTarjetassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagostarjetas";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PagosTarjetass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPagosTarjetas.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPagosTarjetas.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PagosTarjetasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PagosTarjetas pagostarjetas:pagostarjetassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagostarjetas.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosTarjetasConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(PagosTarjetas pagostarjetas:pagostarjetassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagostarjetas.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosTarjetasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE);
					iRow++;

					for(PagosTarjetas pagostarjetas:pagostarjetassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagostarjetas.getcodigo_asiento_contable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosTarjetasConstantesFunciones.LABEL_CODIGOTARJETACREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_CODIGOTARJETACREDITO);
					iRow++;

					for(PagosTarjetas pagostarjetas:pagostarjetassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagostarjetas.getcodigo_tarjeta_credito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NOMBRETIPOINTERESTARJETA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_NOMBRETIPOINTERESTARJETA);
					iRow++;

					for(PagosTarjetas pagostarjetas:pagostarjetassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagostarjetas.getnombre_tipo_interes_tarjeta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NOMBRECONEXION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_NOMBRECONEXION);
					iRow++;

					for(PagosTarjetas pagostarjetas:pagostarjetassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagostarjetas.getnombre_conexion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NOMBREMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_NOMBREMES);
					iRow++;

					for(PagosTarjetas pagostarjetas:pagostarjetassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagostarjetas.getnombre_mes());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(PagosTarjetas pagostarjetas:pagostarjetassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagostarjetas.getnumero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosTarjetasConstantesFunciones.LABEL_LOTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_LOTE);
					iRow++;

					for(PagosTarjetas pagostarjetas:pagostarjetassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagostarjetas.getlote());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(PagosTarjetas pagostarjetas:pagostarjetassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagostarjetas.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORRETENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_VALORRETENCION);
					iRow++;

					for(PagosTarjetas pagostarjetas:pagostarjetassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagostarjetas.getvalor_retencion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORCOMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_VALORCOMISION);
					iRow++;

					for(PagosTarjetas pagostarjetas:pagostarjetassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagostarjetas.getvalor_comision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORCALCULADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_VALORCALCULADO);
					iRow++;

					for(PagosTarjetas pagostarjetas:pagostarjetassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagostarjetas.getvalor_calculado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORCANCELADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_VALORCANCELADO);
					iRow++;

					for(PagosTarjetas pagostarjetas:pagostarjetassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagostarjetas.getvalor_cancelado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosTarjetasConstantesFunciones.LABEL_VALORDIFIERE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_VALORDIFIERE);
					iRow++;

					for(PagosTarjetas pagostarjetas:pagostarjetassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagostarjetas.getvalor_difiere());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NUMERORETENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_NUMERORETENCION);
					iRow++;

					for(PagosTarjetas pagostarjetas:pagostarjetassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagostarjetas.getnumero_retencion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosTarjetasConstantesFunciones.LABEL_NUMEROLIQUIDACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_NUMEROLIQUIDACION);
					iRow++;

					for(PagosTarjetas pagostarjetas:pagostarjetassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagostarjetas.getnumero_liquidacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosTarjetasConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(PagosTarjetas pagostarjetas:pagostarjetassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagostarjetas.getfecha());
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
			//	this.getFilaCabeceraExportarExcelPagosTarjetas(row);				
			//	iRow++;
			//}				
			
			//for(PagosTarjetas pagostarjetasAux:pagostarjetassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPagosTarjetas(pagostarjetasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Tarjetas",JOptionPane.INFORMATION_MESSAGE);
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
				this.pagostarjetasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPagosTarjetas(false);
			
			//SI ES MANUAL
			if(PagosTarjetasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPagosTarjetas();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPagosTarjetas(false);
			
			//SI ES MANUAL
			if(PagosTarjetasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPagosTarjetas();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPagosTarjetas(false);
			
			//SI ES MANUAL
			if(PagosTarjetasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPagosTarjetas();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPagosTarjetas() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPagosTarjetas.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPagosTarjetas.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPagosTarjetas.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPagosTarjetas.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPagosTarjetas.setMinimumSize(dimensionMinimum);
		this.jTableDatosPagosTarjetas.setMaximumSize(dimensionMaximum);
		this.jTableDatosPagosTarjetas.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPagosTarjetas(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPagosTarjetas(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPagosTarjetas(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPagosTarjetas(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPagosTarjetas(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPagosTarjetas(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPagosTarjetas(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPagosTarjetas(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PagosTarjetasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PagosTarjetasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPagosTarjetas() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPagosTarjetas();
		
		this.inicializarActualizarBindingBotonesManualPagosTarjetas(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPagosTarjetas();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPagosTarjetas() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPagosTarjetas(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPagosTarjetas(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPagosTarjetas.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPagosTarjetas.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePagosTarjetas.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPagosTarjetas.jCheckBoxPostAccionNuevoPagosTarjetas.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPagosTarjetas.jCheckBoxPostAccionSinCerrarPagosTarjetas.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPagosTarjetas.jCheckBoxPostAccionSinMensajePagosTarjetas.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPagosTarjetas.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPagosTarjetas.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePagosTarjetas.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
				this.jInternalFrameDetalleFormPagosTarjetas.jCheckBoxPostAccionNuevoPagosTarjetas.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPagosTarjetas.jCheckBoxPostAccionSinCerrarPagosTarjetas.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPagosTarjetas.jCheckBoxPostAccionSinMensajePagosTarjetas.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPagosTarjetas.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPagosTarjetas.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxTiposAccionesFormularioPagosTarjetas.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPagosTarjetas.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPagosTarjetas!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPagosTarjetas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPagosTarjetas.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPagosTarjetas.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPagosTarjetas.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPagosTarjetas.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPagosTarjetas!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPagosTarjetas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPagosTarjetas.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPagosTarjetas.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPagosTarjetas(Boolean esInicializar) throws Exception {
		try	{	
			if(PagosTarjetasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPagosTarjetas(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPagosTarjetas() throws Exception {
		try	{
			if(PagosTarjetasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPagosTarjetas();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePagosTarjetas() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxTiposAccionesFormularioPagosTarjetas.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxTiposAccionesFormularioPagosTarjetas.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPagosTarjetas() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPagosTarjetas.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPagosTarjetas.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPagosTarjetas.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPagosTarjetas.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPagosTarjetas.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPagosTarjetas.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPagosTarjetas.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPagosTarjetas.addItem(reporte);
			}
			
			
			if(!this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPagosTarjetas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPagosTarjetas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPagosTarjetas.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPagosTarjetas.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPagosTarjetas.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPagosTarjetas.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPagosTarjetas!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxTiposAccionesFormularioPagosTarjetas.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxTiposAccionesFormularioPagosTarjetas.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPagosTarjetas.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPagosTarjetas.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPagosTarjetas.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPagosTarjetas();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPagosTarjetas() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPagosTarjetas!=null) {
				this.jInternalFrameReporteDinamicoPagosTarjetas.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPagosTarjetas.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPagosTarjetas!=null) {
				this.jInternalFrameReporteDinamicoPagosTarjetas.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPagosTarjetas.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPagosTarjetas!=null) {
				
				if(this.jInternalFrameReporteDinamicoPagosTarjetas.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPagosTarjetas.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPagosTarjetas.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPagosTarjetas.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPagosTarjetas.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPagosTarjetas.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPagosTarjetas.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPagosTarjetas.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PagosTarjetasConstantesFunciones.getTiposSeleccionarPagosTarjetas(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPagosTarjetas.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPagosTarjetas.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPagosTarjetas.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PagosTarjetasConstantesFunciones.getTiposSeleccionarPagosTarjetas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPagosTarjetas.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPagosTarjetas.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPagosTarjetas.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PagosTarjetasConstantesFunciones.getTiposSeleccionarPagosTarjetas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPagosTarjetas.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPagosTarjetas.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPagosTarjetas.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPagosTarjetas.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPagosTarjetas()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_hastaBusquedaPagosTarjetas=new Date(this.jDateChooserfecha_hastaBusquedaPagosTarjetasPagosTarjetas.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPagosTarjetas(Boolean esInicializar) throws Exception {				
		if(PagosTarjetasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPagosTarjetas();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPagosTarjetas() throws Exception {
		this.inicializarActualizarBindingTablaPagosTarjetas(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPagosTarjetas() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPagosTarjetas.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPagosTarjetas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPagosTarjetas.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PagosTarjetasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPagosTarjetas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPagosTarjetas.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PagosTarjetasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPagosTarjetasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosTarjetasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PagosTarjetasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPagosTarjetas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPagosTarjetas.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PagosTarjetasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPagosTarjetas.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPagosTarjetas(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=pagostarjetasLogic.getPagosTarjetass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=pagostarjetass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PagosTarjetasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPagosTarjetas.setModel(new PagosTarjetasModel(this.pagostarjetasLogic.getPagosTarjetass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPagosTarjetas.setModel(new PagosTarjetasModel(this.pagostarjetass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPagosTarjetas!=null && this.jInternalFrameOrderByPagosTarjetas.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPagosTarjetas();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPagosTarjetas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosTarjetas,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PagosTarjetasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO,pagostarjetasConstantesFunciones.resaltarSeleccionarPagosTarjetas,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO,pagostarjetasConstantesFunciones.resaltarSeleccionarPagosTarjetas,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPagosTarjetas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosTarjetas,PagosTarjetasConstantesFunciones.LABEL_ID));

		if(this.pagostarjetasConstantesFunciones.mostraridPagosTarjetas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosTarjetasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pagostarjetasConstantesFunciones.resaltaridPagosTarjetas,this.pagostarjetasConstantesFunciones.activaridPagosTarjetas,iSizeTabla,this,true,"idPagosTarjetas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagostarjetasConstantesFunciones.resaltaridPagosTarjetas,this.pagostarjetasConstantesFunciones.activaridPagosTarjetas,this,true,"idPagosTarjetas","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosTarjetas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosTarjetas,PagosTarjetasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE));

		if(this.pagostarjetasConstantesFunciones.mostrarcodigo_asiento_contablePagosTarjetas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosTarjetasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagostarjetasConstantesFunciones.resaltarcodigo_asiento_contablePagosTarjetas,this.pagostarjetasConstantesFunciones.activarcodigo_asiento_contablePagosTarjetas,iSizeTabla,this,true,"codigo_asiento_contablePagosTarjetas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagostarjetasConstantesFunciones.resaltarcodigo_asiento_contablePagosTarjetas,this.pagostarjetasConstantesFunciones.activarcodigo_asiento_contablePagosTarjetas,this,true,"codigo_asiento_contablePagosTarjetas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosTarjetasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosTarjetas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosTarjetas,PagosTarjetasConstantesFunciones.LABEL_CODIGOTARJETACREDITO));

		if(this.pagostarjetasConstantesFunciones.mostrarcodigo_tarjeta_creditoPagosTarjetas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosTarjetasConstantesFunciones.LABEL_CODIGOTARJETACREDITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagostarjetasConstantesFunciones.resaltarcodigo_tarjeta_creditoPagosTarjetas,this.pagostarjetasConstantesFunciones.activarcodigo_tarjeta_creditoPagosTarjetas,iSizeTabla,this,true,"codigo_tarjeta_creditoPagosTarjetas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagostarjetasConstantesFunciones.resaltarcodigo_tarjeta_creditoPagosTarjetas,this.pagostarjetasConstantesFunciones.activarcodigo_tarjeta_creditoPagosTarjetas,this,true,"codigo_tarjeta_creditoPagosTarjetas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosTarjetasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosTarjetas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosTarjetas,PagosTarjetasConstantesFunciones.LABEL_NOMBRETIPOINTERESTARJETA));

		if(this.pagostarjetasConstantesFunciones.mostrarnombre_tipo_interes_tarjetaPagosTarjetas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosTarjetasConstantesFunciones.LABEL_NOMBRETIPOINTERESTARJETA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagostarjetasConstantesFunciones.resaltarnombre_tipo_interes_tarjetaPagosTarjetas,this.pagostarjetasConstantesFunciones.activarnombre_tipo_interes_tarjetaPagosTarjetas,iSizeTabla,this,true,"nombre_tipo_interes_tarjetaPagosTarjetas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagostarjetasConstantesFunciones.resaltarnombre_tipo_interes_tarjetaPagosTarjetas,this.pagostarjetasConstantesFunciones.activarnombre_tipo_interes_tarjetaPagosTarjetas,this,true,"nombre_tipo_interes_tarjetaPagosTarjetas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosTarjetasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosTarjetas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosTarjetas,PagosTarjetasConstantesFunciones.LABEL_NOMBRECONEXION));

		if(this.pagostarjetasConstantesFunciones.mostrarnombre_conexionPagosTarjetas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosTarjetasConstantesFunciones.LABEL_NOMBRECONEXION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagostarjetasConstantesFunciones.resaltarnombre_conexionPagosTarjetas,this.pagostarjetasConstantesFunciones.activarnombre_conexionPagosTarjetas,iSizeTabla,this,true,"nombre_conexionPagosTarjetas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagostarjetasConstantesFunciones.resaltarnombre_conexionPagosTarjetas,this.pagostarjetasConstantesFunciones.activarnombre_conexionPagosTarjetas,this,true,"nombre_conexionPagosTarjetas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosTarjetasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosTarjetas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosTarjetas,PagosTarjetasConstantesFunciones.LABEL_NOMBREMES));

		if(this.pagostarjetasConstantesFunciones.mostrarnombre_mesPagosTarjetas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosTarjetasConstantesFunciones.LABEL_NOMBREMES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagostarjetasConstantesFunciones.resaltarnombre_mesPagosTarjetas,this.pagostarjetasConstantesFunciones.activarnombre_mesPagosTarjetas,iSizeTabla,this,true,"nombre_mesPagosTarjetas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagostarjetasConstantesFunciones.resaltarnombre_mesPagosTarjetas,this.pagostarjetasConstantesFunciones.activarnombre_mesPagosTarjetas,this,true,"nombre_mesPagosTarjetas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosTarjetasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosTarjetas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosTarjetas,PagosTarjetasConstantesFunciones.LABEL_NUMERO));

		if(this.pagostarjetasConstantesFunciones.mostrarnumeroPagosTarjetas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosTarjetasConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagostarjetasConstantesFunciones.resaltarnumeroPagosTarjetas,this.pagostarjetasConstantesFunciones.activarnumeroPagosTarjetas,iSizeTabla,this,true,"numeroPagosTarjetas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagostarjetasConstantesFunciones.resaltarnumeroPagosTarjetas,this.pagostarjetasConstantesFunciones.activarnumeroPagosTarjetas,this,true,"numeroPagosTarjetas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosTarjetasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosTarjetas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosTarjetas,PagosTarjetasConstantesFunciones.LABEL_LOTE));

		if(this.pagostarjetasConstantesFunciones.mostrarlotePagosTarjetas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosTarjetasConstantesFunciones.LABEL_LOTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagostarjetasConstantesFunciones.resaltarlotePagosTarjetas,this.pagostarjetasConstantesFunciones.activarlotePagosTarjetas,iSizeTabla,this,true,"lotePagosTarjetas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagostarjetasConstantesFunciones.resaltarlotePagosTarjetas,this.pagostarjetasConstantesFunciones.activarlotePagosTarjetas,this,true,"lotePagosTarjetas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosTarjetasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosTarjetas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosTarjetas,PagosTarjetasConstantesFunciones.LABEL_VALOR));

		if(this.pagostarjetasConstantesFunciones.mostrarvalorPagosTarjetas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosTarjetasConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pagostarjetasConstantesFunciones.resaltarvalorPagosTarjetas,this.pagostarjetasConstantesFunciones.activarvalorPagosTarjetas,iSizeTabla,this,true,"valorPagosTarjetas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagostarjetasConstantesFunciones.resaltarvalorPagosTarjetas,this.pagostarjetasConstantesFunciones.activarvalorPagosTarjetas,this,true,"valorPagosTarjetas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PagosTarjetasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosTarjetas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosTarjetas,PagosTarjetasConstantesFunciones.LABEL_VALORRETENCION));

		if(this.pagostarjetasConstantesFunciones.mostrarvalor_retencionPagosTarjetas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosTarjetasConstantesFunciones.LABEL_VALORRETENCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pagostarjetasConstantesFunciones.resaltarvalor_retencionPagosTarjetas,this.pagostarjetasConstantesFunciones.activarvalor_retencionPagosTarjetas,iSizeTabla,this,true,"valor_retencionPagosTarjetas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagostarjetasConstantesFunciones.resaltarvalor_retencionPagosTarjetas,this.pagostarjetasConstantesFunciones.activarvalor_retencionPagosTarjetas,this,true,"valor_retencionPagosTarjetas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PagosTarjetasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosTarjetas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosTarjetas,PagosTarjetasConstantesFunciones.LABEL_VALORCOMISION));

		if(this.pagostarjetasConstantesFunciones.mostrarvalor_comisionPagosTarjetas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosTarjetasConstantesFunciones.LABEL_VALORCOMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pagostarjetasConstantesFunciones.resaltarvalor_comisionPagosTarjetas,this.pagostarjetasConstantesFunciones.activarvalor_comisionPagosTarjetas,iSizeTabla,this,true,"valor_comisionPagosTarjetas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagostarjetasConstantesFunciones.resaltarvalor_comisionPagosTarjetas,this.pagostarjetasConstantesFunciones.activarvalor_comisionPagosTarjetas,this,true,"valor_comisionPagosTarjetas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PagosTarjetasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosTarjetas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosTarjetas,PagosTarjetasConstantesFunciones.LABEL_VALORCALCULADO));

		if(this.pagostarjetasConstantesFunciones.mostrarvalor_calculadoPagosTarjetas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosTarjetasConstantesFunciones.LABEL_VALORCALCULADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pagostarjetasConstantesFunciones.resaltarvalor_calculadoPagosTarjetas,this.pagostarjetasConstantesFunciones.activarvalor_calculadoPagosTarjetas,iSizeTabla,this,true,"valor_calculadoPagosTarjetas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagostarjetasConstantesFunciones.resaltarvalor_calculadoPagosTarjetas,this.pagostarjetasConstantesFunciones.activarvalor_calculadoPagosTarjetas,this,true,"valor_calculadoPagosTarjetas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PagosTarjetasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosTarjetas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosTarjetas,PagosTarjetasConstantesFunciones.LABEL_VALORCANCELADO));

		if(this.pagostarjetasConstantesFunciones.mostrarvalor_canceladoPagosTarjetas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosTarjetasConstantesFunciones.LABEL_VALORCANCELADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pagostarjetasConstantesFunciones.resaltarvalor_canceladoPagosTarjetas,this.pagostarjetasConstantesFunciones.activarvalor_canceladoPagosTarjetas,iSizeTabla,this,true,"valor_canceladoPagosTarjetas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagostarjetasConstantesFunciones.resaltarvalor_canceladoPagosTarjetas,this.pagostarjetasConstantesFunciones.activarvalor_canceladoPagosTarjetas,this,true,"valor_canceladoPagosTarjetas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PagosTarjetasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosTarjetas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosTarjetas,PagosTarjetasConstantesFunciones.LABEL_VALORDIFIERE));

		if(this.pagostarjetasConstantesFunciones.mostrarvalor_difierePagosTarjetas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosTarjetasConstantesFunciones.LABEL_VALORDIFIERE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pagostarjetasConstantesFunciones.resaltarvalor_difierePagosTarjetas,this.pagostarjetasConstantesFunciones.activarvalor_difierePagosTarjetas,iSizeTabla,this,true,"valor_difierePagosTarjetas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagostarjetasConstantesFunciones.resaltarvalor_difierePagosTarjetas,this.pagostarjetasConstantesFunciones.activarvalor_difierePagosTarjetas,this,true,"valor_difierePagosTarjetas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PagosTarjetasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosTarjetas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosTarjetas,PagosTarjetasConstantesFunciones.LABEL_NUMERORETENCION));

		if(this.pagostarjetasConstantesFunciones.mostrarnumero_retencionPagosTarjetas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosTarjetasConstantesFunciones.LABEL_NUMERORETENCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagostarjetasConstantesFunciones.resaltarnumero_retencionPagosTarjetas,this.pagostarjetasConstantesFunciones.activarnumero_retencionPagosTarjetas,iSizeTabla,this,true,"numero_retencionPagosTarjetas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagostarjetasConstantesFunciones.resaltarnumero_retencionPagosTarjetas,this.pagostarjetasConstantesFunciones.activarnumero_retencionPagosTarjetas,this,true,"numero_retencionPagosTarjetas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosTarjetasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosTarjetas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosTarjetas,PagosTarjetasConstantesFunciones.LABEL_NUMEROLIQUIDACION));

		if(this.pagostarjetasConstantesFunciones.mostrarnumero_liquidacionPagosTarjetas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosTarjetasConstantesFunciones.LABEL_NUMEROLIQUIDACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagostarjetasConstantesFunciones.resaltarnumero_liquidacionPagosTarjetas,this.pagostarjetasConstantesFunciones.activarnumero_liquidacionPagosTarjetas,iSizeTabla,this,true,"numero_liquidacionPagosTarjetas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagostarjetasConstantesFunciones.resaltarnumero_liquidacionPagosTarjetas,this.pagostarjetasConstantesFunciones.activarnumero_liquidacionPagosTarjetas,this,true,"numero_liquidacionPagosTarjetas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosTarjetasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosTarjetas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosTarjetas,PagosTarjetasConstantesFunciones.LABEL_FECHA));

		if(this.pagostarjetasConstantesFunciones.mostrarfechaPagosTarjetas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosTarjetasConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.pagostarjetasConstantesFunciones.resaltarfechaPagosTarjetas,this.pagostarjetasConstantesFunciones.activarfechaPagosTarjetas,iSizeTabla,this,true,"fechaPagosTarjetas","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.pagostarjetasConstantesFunciones.resaltarfechaPagosTarjetas,this.pagostarjetasConstantesFunciones.activarfechaPagosTarjetas,this,true,"fechaPagosTarjetas","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PagosTarjetasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.pagostarjetasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.pagostarjetasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.pagostarjetasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPagosTarjetas.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.pagostarjetasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.pagostarjetasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPagosTarjetas.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPagosTarjetas && this.isPermisoGuardarCambiosPagosTarjetas) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.pagostarjetasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.pagostarjetasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPagosTarjetas.addColumn(tableColumn);
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
			
			this.jTableDatosPagosTarjetas.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPagosTarjetas && this.isPermisoGuardarCambiosPagosTarjetas) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPagosTarjetas && this.isPermisoGuardarCambiosPagosTarjetas) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPagosTarjetas.moveColumn(this.jTableDatosPagosTarjetas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPagosTarjetas.moveColumn(this.jTableDatosPagosTarjetas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPagosTarjetas.moveColumn(this.jTableDatosPagosTarjetas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPagosTarjetas.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPagosTarjetas.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPagosTarjetas,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PagosTarjetasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPagosTarjetas.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPagosTarjetas.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PagosTarjetasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PagosTarjetasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPagosTarjetas.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPagosTarjetas.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPagosTarjetas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=pagostarjetasLogic.getPagosTarjetass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=pagostarjetass.size()-1;
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
		//this.jTableDatosPagosTarjetas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPagosTarjetas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPagosTarjetas();
			
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
				
				//this.isEsNuevoPagosTarjetas=false;
					
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
			
				if(this.pagostarjetasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPagosTarjetas==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPagosTarjetas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPagosTarjetas.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.pagostarjetas.getsType().equals("DUPLICADO")
				   || this.pagostarjetas.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPagosTarjetas=true;
				
				} else {
					this.isEsNuevoPagosTarjetas=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
					if(this.pagostarjetas.getId()>=0 && !this.pagostarjetas.getIsNew()) {						
						this.isEsNuevoPagosTarjetas=false;
						
					} else {
						this.isEsNuevoPagosTarjetas=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPagosTarjetas(esRelaciones);						
				
				this.seleccionarPagosTarjetas(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.pagostarjetas.getId()<0) {
					this.isEsNuevoPagosTarjetas=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPagosTarjetas(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPagosTarjetas(evt,rowIndex);
				}	
				
				if(this.pagostarjetasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PagosTarjetas: " + this.dDif); 
					}
				}								
				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPagosTarjetas(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.pagostarjetas)) {
					if(this.pagostarjetas.getId()>0) {
						this.pagostarjetas.setIsDeleted(true);
						
						this.pagostarjetassEliminados.add(this.pagostarjetas);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.pagostarjetasLogic.getPagosTarjetass().remove(this.pagostarjetas);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.pagostarjetass.remove(this.pagostarjetas);				
					}
					
					
					((PagosTarjetasModel) this.jTableDatosPagosTarjetas.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPagosTarjetas(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPagosTarjetas(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPagosTarjetas) {
			
			if(this.jInternalFrameDetalleFormPagosTarjetas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPagosTarjetas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPagosTarjetas.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PagosTarjetasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPagosTarjetas(this.pagostarjetas);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPagosTarjetas("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPagosTarjetas(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPagosTarjetas() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPagosTarjetas(PagosTarjetas pagostarjetas) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPagosTarjetas(pagostarjetas,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPagosTarjetas(PagosTarjetas pagostarjetas,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPagosTarjetas(pagostarjetas);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPagosTarjetas(pagostarjetas,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPagosTarjetas(pagostarjetas);
	}
	
	public void setVariablesObjetoActualToFormularioPagosTarjetas(PagosTarjetas pagostarjetas) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPagosTarjetas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPagosTarjetas.jLabelidPagosTarjetas.setText(pagostarjetas.getId().toString());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldcodigo_asiento_contablePagosTarjetas.setText(pagostarjetas.getcodigo_asiento_contable());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldcodigo_tarjeta_creditoPagosTarjetas.setText(pagostarjetas.getcodigo_tarjeta_credito());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextAreanombre_tipo_interes_tarjetaPagosTarjetas.setText(pagostarjetas.getnombre_tipo_interes_tarjeta());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextAreanombre_conexionPagosTarjetas.setText(pagostarjetas.getnombre_conexion());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnombre_mesPagosTarjetas.setText(pagostarjetas.getnombre_mes());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumeroPagosTarjetas.setText(pagostarjetas.getnumero());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldlotePagosTarjetas.setText(pagostarjetas.getlote());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalorPagosTarjetas.setText(pagostarjetas.getvalor().toString());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_retencionPagosTarjetas.setText(pagostarjetas.getvalor_retencion().toString());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_comisionPagosTarjetas.setText(pagostarjetas.getvalor_comision().toString());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_calculadoPagosTarjetas.setText(pagostarjetas.getvalor_calculado().toString());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_canceladoPagosTarjetas.setText(pagostarjetas.getvalor_cancelado().toString());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_difierePagosTarjetas.setText(pagostarjetas.getvalor_difiere().toString());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumero_retencionPagosTarjetas.setText(pagostarjetas.getnumero_retencion());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumero_liquidacionPagosTarjetas.setText(pagostarjetas.getnumero_liquidacion());
			this.jInternalFrameDetalleFormPagosTarjetas.jDateChooserfechaPagosTarjetas.setDate(pagostarjetas.getfecha());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PagosTarjetas pagostarjetasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,pagostarjetasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PagosTarjetas pagostarjetasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				pagostarjetasLocal=this.pagostarjetas;
			} else {
				pagostarjetasLocal=this.pagostarjetasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(pagostarjetasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPagosTarjetas(pagostarjetasLocal,true);
					
					if(pagostarjetasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(pagostarjetasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(pagostarjetasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPagosTarjetas(PagosTarjetas pagostarjetas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPagosTarjetas(pagostarjetas,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(pagostarjetas);
	}
	
	public void setVariablesFormularioToObjetoActualPagosTarjetas(PagosTarjetas pagostarjetas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPagosTarjetas(pagostarjetas,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPagosTarjetas(PagosTarjetas pagostarjetas,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPagosTarjetas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPagosTarjetas.jLabelidPagosTarjetas.getText()==null || this.jInternalFrameDetalleFormPagosTarjetas.jLabelidPagosTarjetas.getText()=="" || this.jInternalFrameDetalleFormPagosTarjetas.jLabelidPagosTarjetas.getText()=="Id") {
				this.jInternalFrameDetalleFormPagosTarjetas.jLabelidPagosTarjetas.setText("0");
			}

			if(conColumnasBase) {pagostarjetas.setId(Long.parseLong(this.jInternalFrameDetalleFormPagosTarjetas.jLabelidPagosTarjetas.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosTarjetasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelIdPagosTarjetas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagostarjetas.setcodigo_asiento_contable(this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldcodigo_asiento_contablePagosTarjetas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosTarjetasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelcodigo_asiento_contablePagosTarjetas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagostarjetas.setcodigo_tarjeta_credito(this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldcodigo_tarjeta_creditoPagosTarjetas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosTarjetasConstantesFunciones.LABEL_CODIGOTARJETACREDITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelcodigo_tarjeta_creditoPagosTarjetas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagostarjetas.setnombre_tipo_interes_tarjeta(this.jInternalFrameDetalleFormPagosTarjetas.jTextAreanombre_tipo_interes_tarjetaPagosTarjetas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosTarjetasConstantesFunciones.LABEL_NOMBRETIPOINTERESTARJETA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelnombre_tipo_interes_tarjetaPagosTarjetas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagostarjetas.setnombre_conexion(this.jInternalFrameDetalleFormPagosTarjetas.jTextAreanombre_conexionPagosTarjetas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosTarjetasConstantesFunciones.LABEL_NOMBRECONEXION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelnombre_conexionPagosTarjetas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagostarjetas.setnombre_mes(this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnombre_mesPagosTarjetas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosTarjetasConstantesFunciones.LABEL_NOMBREMES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelnombre_mesPagosTarjetas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagostarjetas.setnumero(this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumeroPagosTarjetas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosTarjetasConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelnumeroPagosTarjetas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagostarjetas.setlote(this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldlotePagosTarjetas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosTarjetasConstantesFunciones.LABEL_LOTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabellotePagosTarjetas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagostarjetas.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalorPagosTarjetas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosTarjetasConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelvalorPagosTarjetas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagostarjetas.setvalor_retencion(Double.parseDouble(this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_retencionPagosTarjetas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosTarjetasConstantesFunciones.LABEL_VALORRETENCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelvalor_retencionPagosTarjetas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagostarjetas.setvalor_comision(Double.parseDouble(this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_comisionPagosTarjetas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosTarjetasConstantesFunciones.LABEL_VALORCOMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelvalor_comisionPagosTarjetas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagostarjetas.setvalor_calculado(Double.parseDouble(this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_calculadoPagosTarjetas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosTarjetasConstantesFunciones.LABEL_VALORCALCULADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelvalor_calculadoPagosTarjetas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagostarjetas.setvalor_cancelado(Double.parseDouble(this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_canceladoPagosTarjetas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosTarjetasConstantesFunciones.LABEL_VALORCANCELADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelvalor_canceladoPagosTarjetas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagostarjetas.setvalor_difiere(Double.parseDouble(this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_difierePagosTarjetas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosTarjetasConstantesFunciones.LABEL_VALORDIFIERE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelvalor_difierePagosTarjetas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagostarjetas.setnumero_retencion(this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumero_retencionPagosTarjetas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosTarjetasConstantesFunciones.LABEL_NUMERORETENCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelnumero_retencionPagosTarjetas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagostarjetas.setnumero_liquidacion(this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumero_liquidacionPagosTarjetas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosTarjetasConstantesFunciones.LABEL_NUMEROLIQUIDACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelnumero_liquidacionPagosTarjetas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagostarjetas.setfecha(this.jInternalFrameDetalleFormPagosTarjetas.jDateChooserfechaPagosTarjetas.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosTarjetasConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosTarjetas.jLabelfechaPagosTarjetas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPagosTarjetas(PagosTarjetas pagostarjetasBean,PagosTarjetas pagostarjetas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPagosTarjetas(PagosTarjetas pagostarjetasOrigen,PagosTarjetas pagostarjetas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && pagostarjetasOrigen.getId()!=null && !pagostarjetasOrigen.getId().equals(0L))) {pagostarjetas.setId(pagostarjetasOrigen.getId());}}
			if(conDefault || (!conDefault && pagostarjetasOrigen.getfecha_hasta()!=null && !pagostarjetasOrigen.getfecha_hasta().equals(new Date()))) {pagostarjetas.setfecha_hasta(pagostarjetasOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && pagostarjetasOrigen.getcodigo_asiento_contable()!=null && !pagostarjetasOrigen.getcodigo_asiento_contable().equals(""))) {pagostarjetas.setcodigo_asiento_contable(pagostarjetasOrigen.getcodigo_asiento_contable());}
			if(conDefault || (!conDefault && pagostarjetasOrigen.getcodigo_tarjeta_credito()!=null && !pagostarjetasOrigen.getcodigo_tarjeta_credito().equals(""))) {pagostarjetas.setcodigo_tarjeta_credito(pagostarjetasOrigen.getcodigo_tarjeta_credito());}
			if(conDefault || (!conDefault && pagostarjetasOrigen.getnombre_tipo_interes_tarjeta()!=null && !pagostarjetasOrigen.getnombre_tipo_interes_tarjeta().equals(""))) {pagostarjetas.setnombre_tipo_interes_tarjeta(pagostarjetasOrigen.getnombre_tipo_interes_tarjeta());}
			if(conDefault || (!conDefault && pagostarjetasOrigen.getnombre_conexion()!=null && !pagostarjetasOrigen.getnombre_conexion().equals(""))) {pagostarjetas.setnombre_conexion(pagostarjetasOrigen.getnombre_conexion());}
			if(conDefault || (!conDefault && pagostarjetasOrigen.getnombre_mes()!=null && !pagostarjetasOrigen.getnombre_mes().equals(""))) {pagostarjetas.setnombre_mes(pagostarjetasOrigen.getnombre_mes());}
			if(conDefault || (!conDefault && pagostarjetasOrigen.getnumero()!=null && !pagostarjetasOrigen.getnumero().equals(""))) {pagostarjetas.setnumero(pagostarjetasOrigen.getnumero());}
			if(conDefault || (!conDefault && pagostarjetasOrigen.getlote()!=null && !pagostarjetasOrigen.getlote().equals(""))) {pagostarjetas.setlote(pagostarjetasOrigen.getlote());}
			if(conDefault || (!conDefault && pagostarjetasOrigen.getvalor()!=null && !pagostarjetasOrigen.getvalor().equals(0.0))) {pagostarjetas.setvalor(pagostarjetasOrigen.getvalor());}
			if(conDefault || (!conDefault && pagostarjetasOrigen.getvalor_retencion()!=null && !pagostarjetasOrigen.getvalor_retencion().equals(0.0))) {pagostarjetas.setvalor_retencion(pagostarjetasOrigen.getvalor_retencion());}
			if(conDefault || (!conDefault && pagostarjetasOrigen.getvalor_comision()!=null && !pagostarjetasOrigen.getvalor_comision().equals(0.0))) {pagostarjetas.setvalor_comision(pagostarjetasOrigen.getvalor_comision());}
			if(conDefault || (!conDefault && pagostarjetasOrigen.getvalor_calculado()!=null && !pagostarjetasOrigen.getvalor_calculado().equals(0.0))) {pagostarjetas.setvalor_calculado(pagostarjetasOrigen.getvalor_calculado());}
			if(conDefault || (!conDefault && pagostarjetasOrigen.getvalor_cancelado()!=null && !pagostarjetasOrigen.getvalor_cancelado().equals(0.0))) {pagostarjetas.setvalor_cancelado(pagostarjetasOrigen.getvalor_cancelado());}
			if(conDefault || (!conDefault && pagostarjetasOrigen.getvalor_difiere()!=null && !pagostarjetasOrigen.getvalor_difiere().equals(0.0))) {pagostarjetas.setvalor_difiere(pagostarjetasOrigen.getvalor_difiere());}
			if(conDefault || (!conDefault && pagostarjetasOrigen.getnumero_retencion()!=null && !pagostarjetasOrigen.getnumero_retencion().equals(""))) {pagostarjetas.setnumero_retencion(pagostarjetasOrigen.getnumero_retencion());}
			if(conDefault || (!conDefault && pagostarjetasOrigen.getnumero_liquidacion()!=null && !pagostarjetasOrigen.getnumero_liquidacion().equals(""))) {pagostarjetas.setnumero_liquidacion(pagostarjetasOrigen.getnumero_liquidacion());}
			if(conDefault || (!conDefault && pagostarjetasOrigen.getfecha()!=null && !pagostarjetasOrigen.getfecha().equals(new Date()))) {pagostarjetas.setfecha(pagostarjetasOrigen.getfecha());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPagosTarjetas(PagosTarjetas pagostarjetas) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPagosTarjetas.jLabelidPagosTarjetas.setText(pagostarjetas.getId().toString());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldcodigo_asiento_contablePagosTarjetas.setText(pagostarjetas.getcodigo_asiento_contable());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldcodigo_tarjeta_creditoPagosTarjetas.setText(pagostarjetas.getcodigo_tarjeta_credito());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextAreanombre_tipo_interes_tarjetaPagosTarjetas.setText(pagostarjetas.getnombre_tipo_interes_tarjeta());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextAreanombre_conexionPagosTarjetas.setText(pagostarjetas.getnombre_conexion());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnombre_mesPagosTarjetas.setText(pagostarjetas.getnombre_mes());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumeroPagosTarjetas.setText(pagostarjetas.getnumero());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldlotePagosTarjetas.setText(pagostarjetas.getlote());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalorPagosTarjetas.setText(pagostarjetas.getvalor().toString());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_retencionPagosTarjetas.setText(pagostarjetas.getvalor_retencion().toString());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_comisionPagosTarjetas.setText(pagostarjetas.getvalor_comision().toString());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_calculadoPagosTarjetas.setText(pagostarjetas.getvalor_calculado().toString());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_canceladoPagosTarjetas.setText(pagostarjetas.getvalor_cancelado().toString());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_difierePagosTarjetas.setText(pagostarjetas.getvalor_difiere().toString());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumero_retencionPagosTarjetas.setText(pagostarjetas.getnumero_retencion());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumero_liquidacionPagosTarjetas.setText(pagostarjetas.getnumero_liquidacion());
			this.jInternalFrameDetalleFormPagosTarjetas.jDateChooserfechaPagosTarjetas.setDate(pagostarjetas.getfecha());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPagosTarjetas(PagosTarjetasBean pagostarjetasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPagosTarjetas.jLabelidPagosTarjetas.setText(pagostarjetasBean.getId().toString());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldcodigo_asiento_contablePagosTarjetas.setText(pagostarjetasBean.getcodigo_asiento_contable());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldcodigo_tarjeta_creditoPagosTarjetas.setText(pagostarjetasBean.getcodigo_tarjeta_credito());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextAreanombre_tipo_interes_tarjetaPagosTarjetas.setText(pagostarjetasBean.getnombre_tipo_interes_tarjeta());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextAreanombre_conexionPagosTarjetas.setText(pagostarjetasBean.getnombre_conexion());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnombre_mesPagosTarjetas.setText(pagostarjetasBean.getnombre_mes());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumeroPagosTarjetas.setText(pagostarjetasBean.getnumero());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldlotePagosTarjetas.setText(pagostarjetasBean.getlote());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalorPagosTarjetas.setText(pagostarjetasBean.getvalor().toString());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_retencionPagosTarjetas.setText(pagostarjetasBean.getvalor_retencion().toString());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_comisionPagosTarjetas.setText(pagostarjetasBean.getvalor_comision().toString());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_calculadoPagosTarjetas.setText(pagostarjetasBean.getvalor_calculado().toString());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_canceladoPagosTarjetas.setText(pagostarjetasBean.getvalor_cancelado().toString());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_difierePagosTarjetas.setText(pagostarjetasBean.getvalor_difiere().toString());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumero_retencionPagosTarjetas.setText(pagostarjetasBean.getnumero_retencion());
			this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumero_liquidacionPagosTarjetas.setText(pagostarjetasBean.getnumero_liquidacion());
			this.jInternalFrameDetalleFormPagosTarjetas.jDateChooserfechaPagosTarjetas.setDate(pagostarjetasBean.getfecha());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPagosTarjetas(PagosTarjetasParameterReturnGeneral pagostarjetasReturnGeneral,PagosTarjetasBean pagostarjetasBean,Boolean conDefault) throws Exception { 
		try {
			PagosTarjetas pagostarjetasLocal=new PagosTarjetas();
			
			pagostarjetasLocal=pagostarjetasReturnGeneral.getPagosTarjetas();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && pagostarjetasLocal.getId()!=null && !pagostarjetasLocal.getId().equals(0L))) {pagostarjetasBean.setId(pagostarjetasLocal.getId());}}
			if(conDefault || (!conDefault && pagostarjetasLocal.getcodigo_asiento_contable()!=null && !pagostarjetasLocal.getcodigo_asiento_contable().equals(""))) {pagostarjetasBean.setcodigo_asiento_contable(pagostarjetasLocal.getcodigo_asiento_contable());}
			if(conDefault || (!conDefault && pagostarjetasLocal.getcodigo_tarjeta_credito()!=null && !pagostarjetasLocal.getcodigo_tarjeta_credito().equals(""))) {pagostarjetasBean.setcodigo_tarjeta_credito(pagostarjetasLocal.getcodigo_tarjeta_credito());}
			if(conDefault || (!conDefault && pagostarjetasLocal.getnombre_tipo_interes_tarjeta()!=null && !pagostarjetasLocal.getnombre_tipo_interes_tarjeta().equals(""))) {pagostarjetasBean.setnombre_tipo_interes_tarjeta(pagostarjetasLocal.getnombre_tipo_interes_tarjeta());}
			if(conDefault || (!conDefault && pagostarjetasLocal.getnombre_conexion()!=null && !pagostarjetasLocal.getnombre_conexion().equals(""))) {pagostarjetasBean.setnombre_conexion(pagostarjetasLocal.getnombre_conexion());}
			if(conDefault || (!conDefault && pagostarjetasLocal.getnombre_mes()!=null && !pagostarjetasLocal.getnombre_mes().equals(""))) {pagostarjetasBean.setnombre_mes(pagostarjetasLocal.getnombre_mes());}
			if(conDefault || (!conDefault && pagostarjetasLocal.getnumero()!=null && !pagostarjetasLocal.getnumero().equals(""))) {pagostarjetasBean.setnumero(pagostarjetasLocal.getnumero());}
			if(conDefault || (!conDefault && pagostarjetasLocal.getlote()!=null && !pagostarjetasLocal.getlote().equals(""))) {pagostarjetasBean.setlote(pagostarjetasLocal.getlote());}
			if(conDefault || (!conDefault && pagostarjetasLocal.getvalor()!=null && !pagostarjetasLocal.getvalor().equals(0.0))) {pagostarjetasBean.setvalor(pagostarjetasLocal.getvalor());}
			if(conDefault || (!conDefault && pagostarjetasLocal.getvalor_retencion()!=null && !pagostarjetasLocal.getvalor_retencion().equals(0.0))) {pagostarjetasBean.setvalor_retencion(pagostarjetasLocal.getvalor_retencion());}
			if(conDefault || (!conDefault && pagostarjetasLocal.getvalor_comision()!=null && !pagostarjetasLocal.getvalor_comision().equals(0.0))) {pagostarjetasBean.setvalor_comision(pagostarjetasLocal.getvalor_comision());}
			if(conDefault || (!conDefault && pagostarjetasLocal.getvalor_calculado()!=null && !pagostarjetasLocal.getvalor_calculado().equals(0.0))) {pagostarjetasBean.setvalor_calculado(pagostarjetasLocal.getvalor_calculado());}
			if(conDefault || (!conDefault && pagostarjetasLocal.getvalor_cancelado()!=null && !pagostarjetasLocal.getvalor_cancelado().equals(0.0))) {pagostarjetasBean.setvalor_cancelado(pagostarjetasLocal.getvalor_cancelado());}
			if(conDefault || (!conDefault && pagostarjetasLocal.getvalor_difiere()!=null && !pagostarjetasLocal.getvalor_difiere().equals(0.0))) {pagostarjetasBean.setvalor_difiere(pagostarjetasLocal.getvalor_difiere());}
			if(conDefault || (!conDefault && pagostarjetasLocal.getnumero_retencion()!=null && !pagostarjetasLocal.getnumero_retencion().equals(""))) {pagostarjetasBean.setnumero_retencion(pagostarjetasLocal.getnumero_retencion());}
			if(conDefault || (!conDefault && pagostarjetasLocal.getnumero_liquidacion()!=null && !pagostarjetasLocal.getnumero_liquidacion().equals(""))) {pagostarjetasBean.setnumero_liquidacion(pagostarjetasLocal.getnumero_liquidacion());}
			if(conDefault || (!conDefault && pagostarjetasLocal.getfecha()!=null && !pagostarjetasLocal.getfecha().equals(new Date()))) {pagostarjetasBean.setfecha(pagostarjetasLocal.getfecha());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPagosTarjetasGenerico(Long idPagosTarjetasSeleccionado,JComboBox jComboBoxPagosTarjetas,List<PagosTarjetas> pagostarjetassLocal)throws Exception {
		try {
			PagosTarjetas  pagostarjetasTemp=null;

			for(PagosTarjetas pagostarjetasAux:pagostarjetassLocal) {
				if(pagostarjetasAux.getId()!=null && pagostarjetasAux.getId().equals(idPagosTarjetasSeleccionado)) {
					pagostarjetasTemp=pagostarjetasAux;
					break;
				}
			}

			jComboBoxPagosTarjetas.setSelectedItem(pagostarjetasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPagosTarjetasGenerico(JComboBox jComboBoxPagosTarjetas,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPagosTarjetas.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPagosTarjetas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPagosTarjetas.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPagosTarjetas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pagostarjetas=(PagosTarjetas) pagostarjetasLogic.getPagosTarjetass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			pagostarjetas =(PagosTarjetas) pagostarjetass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!pagostarjetas.getIsNew() && !pagostarjetas.getIsChanged() && !pagostarjetas.getIsDeleted()) {
				sDescripcion=pagostarjetas.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=pagostarjetas.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PagosTarjetas pagostarjetasRow=new PagosTarjetas();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pagostarjetasRow=(PagosTarjetas) pagostarjetasLogic.getPagosTarjetass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			pagostarjetasRow=(PagosTarjetas) pagostarjetass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPagosTarjetas(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPagosTarjetas.setVisible((this.isVisibilidadCeldaNuevoPagosTarjetas && this.isPermisoNuevoPagosTarjetas));			
			this.jButtonDuplicarPagosTarjetas.setVisible((this.isVisibilidadCeldaDuplicarPagosTarjetas && this.isPermisoDuplicarPagosTarjetas));			
			this.jButtonCopiarPagosTarjetas.setVisible((this.isVisibilidadCeldaCopiarPagosTarjetas && this.isPermisoCopiarPagosTarjetas));
			this.jButtonVerFormPagosTarjetas.setVisible((this.isVisibilidadCeldaVerFormPagosTarjetas && this.isPermisoVerFormPagosTarjetas));
			
			this.jButtonAbrirOrderByPagosTarjetas.setVisible((this.isVisibilidadCeldaOrdenPagosTarjetas && this.isPermisoOrdenPagosTarjetas));			
			
			this.jButtonNuevoRelacionesPagosTarjetas.setVisible((this.isVisibilidadCeldaNuevoRelacionesPagosTarjetas && this.isPermisoNuevoPagosTarjetas));			
			this.jButtonNuevoGuardarCambiosPagosTarjetas.setVisible((this.isVisibilidadCeldaNuevoPagosTarjetas && this.isPermisoNuevoPagosTarjetas && this.isPermisoGuardarCambiosPagosTarjetas));
			
			if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonModificarPagosTarjetas.setVisible((this.isVisibilidadCeldaModificarPagosTarjetas && this.isPermisoActualizarPagosTarjetas));	
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonActualizarPagosTarjetas.setVisible((this.isVisibilidadCeldaActualizarPagosTarjetas && this.isPermisoActualizarPagosTarjetas));	
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonEliminarPagosTarjetas.setVisible((this.isVisibilidadCeldaEliminarPagosTarjetas && this.isPermisoEliminarPagosTarjetas));
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonCancelarPagosTarjetas.setVisible(this.isVisibilidadCeldaCancelarPagosTarjetas);							
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonGuardarCambiosPagosTarjetas.setVisible((this.isVisibilidadCeldaGuardarPagosTarjetas && this.isPermisoGuardarCambiosPagosTarjetas));			
			
			}
						
			this.jButtonGuardarCambiosTablaPagosTarjetas.setVisible((this.isVisibilidadCeldaGuardarCambiosPagosTarjetas && this.isPermisoGuardarCambiosPagosTarjetas));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPagosTarjetas.setVisible((this.isVisibilidadCeldaNuevoPagosTarjetas && this.isPermisoNuevoPagosTarjetas));						
			this.jButtonDuplicarToolBarPagosTarjetas.setVisible((this.isVisibilidadCeldaDuplicarPagosTarjetas && this.isPermisoDuplicarPagosTarjetas));						
			this.jButtonCopiarToolBarPagosTarjetas.setVisible((this.isVisibilidadCeldaCopiarPagosTarjetas && this.isPermisoCopiarPagosTarjetas));			
			this.jButtonVerFormToolBarPagosTarjetas.setVisible((this.isVisibilidadCeldaVerFormPagosTarjetas && this.isPermisoVerFormPagosTarjetas));			
			this.jButtonAbrirOrderByToolBarPagosTarjetas.setVisible((this.isVisibilidadCeldaOrdenPagosTarjetas && this.isPermisoOrdenPagosTarjetas));
			this.jButtonNuevoRelacionesToolBarPagosTarjetas.setVisible((this.isVisibilidadCeldaNuevoRelacionesPagosTarjetas && this.isPermisoNuevoPagosTarjetas));			
			this.jButtonNuevoGuardarCambiosToolBarPagosTarjetas.setVisible((this.isVisibilidadCeldaNuevoPagosTarjetas && this.isPermisoNuevoPagosTarjetas && this.isPermisoGuardarCambiosPagosTarjetas));			
			
			if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonModificarToolBarPagosTarjetas.setVisible((this.isVisibilidadCeldaModificarPagosTarjetas && this.isPermisoActualizarPagosTarjetas));	
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonActualizarToolBarPagosTarjetas.setVisible((this.isVisibilidadCeldaActualizarPagosTarjetas  && this.isPermisoActualizarPagosTarjetas));	
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonEliminarToolBarPagosTarjetas.setVisible((this.isVisibilidadCeldaEliminarPagosTarjetas && this.isPermisoEliminarPagosTarjetas));
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonCancelarToolBarPagosTarjetas.setVisible(this.isVisibilidadCeldaCancelarPagosTarjetas);				
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonGuardarCambiosToolBarPagosTarjetas.setVisible((this.isVisibilidadCeldaGuardarPagosTarjetas && this.isPermisoGuardarCambiosPagosTarjetas));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPagosTarjetas.setVisible((this.isVisibilidadCeldaGuardarCambiosPagosTarjetas && this.isPermisoGuardarCambiosPagosTarjetas));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPagosTarjetas.setVisible((this.isVisibilidadCeldaNuevoPagosTarjetas && this.isPermisoNuevoPagosTarjetas));			
			this.jMenuItemDuplicarPagosTarjetas.setVisible((this.isVisibilidadCeldaDuplicarPagosTarjetas && this.isPermisoDuplicarPagosTarjetas));			
			this.jMenuItemCopiarPagosTarjetas.setVisible((this.isVisibilidadCeldaCopiarPagosTarjetas && this.isPermisoCopiarPagosTarjetas));			
			this.jMenuItemVerFormPagosTarjetas.setVisible((this.isVisibilidadCeldaVerFormPagosTarjetas && this.isPermisoVerFormPagosTarjetas));			
			this.jMenuItemAbrirOrderByPagosTarjetas.setVisible((this.isVisibilidadCeldaOrdenPagosTarjetas && this.isPermisoOrdenPagosTarjetas));			
			//this.jMenuItemMostrarOcultarPagosTarjetas.setVisible((this.isVisibilidadCeldaOrdenPagosTarjetas && this.isPermisoOrdenPagosTarjetas));
			this.jMenuItemDetalleAbrirOrderByPagosTarjetas.setVisible((this.isVisibilidadCeldaOrdenPagosTarjetas && this.isPermisoOrdenPagosTarjetas));			
			//this.jMenuItemDetalleMostrarOcultarPagosTarjetas.setVisible((this.isVisibilidadCeldaOrdenPagosTarjetas && this.isPermisoOrdenPagosTarjetas));			
			this.jMenuItemNuevoRelacionesPagosTarjetas.setVisible((this.isVisibilidadCeldaNuevoRelacionesPagosTarjetas && this.isPermisoNuevoPagosTarjetas));			
			this.jMenuItemNuevoGuardarCambiosPagosTarjetas.setVisible((this.isVisibilidadCeldaNuevoPagosTarjetas && this.isPermisoNuevoPagosTarjetas && this.isPermisoGuardarCambiosPagosTarjetas));									
			
			if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
			this.jInternalFrameDetalleFormPagosTarjetas.jMenuItemModificarPagosTarjetas.setVisible((this.isVisibilidadCeldaModificarPagosTarjetas && this.isPermisoActualizarPagosTarjetas));	
			this.jInternalFrameDetalleFormPagosTarjetas.jMenuItemActualizarPagosTarjetas.setVisible((this.isVisibilidadCeldaActualizarPagosTarjetas && this.isPermisoActualizarPagosTarjetas));	
			this.jInternalFrameDetalleFormPagosTarjetas.jMenuItemEliminarPagosTarjetas.setVisible((this.isVisibilidadCeldaEliminarPagosTarjetas && this.isPermisoEliminarPagosTarjetas));
			this.jInternalFrameDetalleFormPagosTarjetas.jMenuItemCancelarPagosTarjetas.setVisible(this.isVisibilidadCeldaCancelarPagosTarjetas);				
			}
			
			this.jMenuItemGuardarCambiosPagosTarjetas.setVisible((this.isVisibilidadCeldaGuardarPagosTarjetas && this.isPermisoGuardarCambiosPagosTarjetas));						
			this.jMenuItemGuardarCambiosTablaPagosTarjetas.setVisible((this.isVisibilidadCeldaGuardarCambiosPagosTarjetas && this.isPermisoGuardarCambiosPagosTarjetas));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPagosTarjetas=this.jButtonNuevoPagosTarjetas.isVisible();
			this.isVisibilidadCeldaDuplicarPagosTarjetas=this.jButtonDuplicarPagosTarjetas.isVisible();
			this.isVisibilidadCeldaCopiarPagosTarjetas=this.jButtonCopiarPagosTarjetas.isVisible();
			this.isVisibilidadCeldaVerFormPagosTarjetas=this.jButtonVerFormPagosTarjetas.isVisible();
			
			this.isVisibilidadCeldaOrdenPagosTarjetas=this.jButtonAbrirOrderByPagosTarjetas.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPagosTarjetas=this.jButtonNuevoRelacionesPagosTarjetas.isVisible();
			this.isVisibilidadCeldaModificarPagosTarjetas=this.jButtonModificarPagosTarjetas.isVisible();
			
			if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
			this.isVisibilidadCeldaActualizarPagosTarjetas=this.jInternalFrameDetalleFormPagosTarjetas.jButtonActualizarPagosTarjetas.isVisible();
			this.isVisibilidadCeldaEliminarPagosTarjetas=this.jInternalFrameDetalleFormPagosTarjetas.jButtonEliminarPagosTarjetas.isVisible();
			this.isVisibilidadCeldaCancelarPagosTarjetas=this.jInternalFrameDetalleFormPagosTarjetas.jButtonCancelarPagosTarjetas.isVisible();
			this.isVisibilidadCeldaGuardarPagosTarjetas=this.jInternalFrameDetalleFormPagosTarjetas.jButtonGuardarCambiosPagosTarjetas.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPagosTarjetas=this.jButtonGuardarCambiosTablaPagosTarjetas.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPagosTarjetas=this.jButtonNuevoToolBarPagosTarjetas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPagosTarjetas=this.jButtonNuevoRelacionesToolBarPagosTarjetas.isVisible();
			
			if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
			this.isVisibilidadCeldaModificarPagosTarjetas=this.jInternalFrameDetalleFormPagosTarjetas.jButtonModificarToolBarPagosTarjetas.isVisible();
			this.isVisibilidadCeldaActualizarPagosTarjetas=this.jInternalFrameDetalleFormPagosTarjetas.jButtonActualizarToolBarPagosTarjetas.isVisible();
			this.isVisibilidadCeldaEliminarPagosTarjetas=this.jInternalFrameDetalleFormPagosTarjetas.jButtonEliminarToolBarPagosTarjetas.isVisible();
			this.isVisibilidadCeldaCancelarPagosTarjetas=this.jInternalFrameDetalleFormPagosTarjetas.jButtonCancelarToolBarPagosTarjetas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPagosTarjetas=this.jButtonGuardarCambiosToolBarPagosTarjetas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPagosTarjetas=this.jButtonGuardarCambiosTablaToolBarPagosTarjetas.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPagosTarjetas=this.jMenuItemNuevoPagosTarjetas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPagosTarjetas=this.jMenuItemNuevoRelacionesPagosTarjetas.isVisible();
			
			if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
			this.isVisibilidadCeldaModificarPagosTarjetas=this.jInternalFrameDetalleFormPagosTarjetas.jMenuItemModificarPagosTarjetas.isVisible();
			this.isVisibilidadCeldaActualizarPagosTarjetas=this.jInternalFrameDetalleFormPagosTarjetas.jMenuItemActualizarPagosTarjetas.isVisible();
			this.isVisibilidadCeldaEliminarPagosTarjetas=this.jInternalFrameDetalleFormPagosTarjetas.jMenuItemEliminarPagosTarjetas.isVisible();
			this.isVisibilidadCeldaCancelarPagosTarjetas=this.jInternalFrameDetalleFormPagosTarjetas.jMenuItemCancelarPagosTarjetas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPagosTarjetas=this.jMenuItemGuardarCambiosPagosTarjetas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPagosTarjetas=this.jMenuItemGuardarCambiosTablaPagosTarjetas.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPagosTarjetas(Boolean esInicializar) {
		if(PagosTarjetasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.pagostarjetasSessionBean.getConGuardarRelaciones()) {
				//if(this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPagosTarjetas();
			}
			
			this.inicializarActualizarBindingBotonesManualPagosTarjetas(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPagosTarjetas() {
		this.jButtonNuevoPagosTarjetas.setVisible(this.isPermisoNuevoPagosTarjetas);			
		this.jButtonDuplicarPagosTarjetas.setVisible(this.isPermisoDuplicarPagosTarjetas);			
		this.jButtonCopiarPagosTarjetas.setVisible(this.isPermisoCopiarPagosTarjetas);			
		this.jButtonVerFormPagosTarjetas.setVisible(this.isPermisoVerFormPagosTarjetas);			
		
		this.jButtonAbrirOrderByPagosTarjetas.setVisible(this.isPermisoOrdenPagosTarjetas);					
		
		this.jButtonNuevoRelacionesPagosTarjetas.setVisible(this.isPermisoNuevoPagosTarjetas);			
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonModificarPagosTarjetas.setVisible(this.isPermisoActualizarPagosTarjetas);	
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonActualizarPagosTarjetas.setVisible(this.isPermisoActualizarPagosTarjetas);	
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonEliminarPagosTarjetas.setVisible(this.isPermisoEliminarPagosTarjetas);
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonCancelarPagosTarjetas.setVisible(this.isVisibilidadCeldaCancelarPagosTarjetas);						
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonGuardarCambiosPagosTarjetas.setVisible(this.isPermisoGuardarCambiosPagosTarjetas);							
		}
		
		this.jButtonGuardarCambiosTablaPagosTarjetas.setVisible(this.isPermisoActualizarPagosTarjetas);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePagosTarjetas() {
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonModificarPagosTarjetas.setVisible(this.isPermisoActualizarPagosTarjetas);	
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonActualizarPagosTarjetas.setVisible(this.isPermisoActualizarPagosTarjetas);	
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonEliminarPagosTarjetas.setVisible(this.isPermisoEliminarPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonCancelarPagosTarjetas.setVisible(this.isVisibilidadCeldaCancelarPagosTarjetas);							
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonGuardarCambiosPagosTarjetas.setVisible((this.isVisibilidadCeldaGuardarPagosTarjetas && this.isPermisoGuardarCambiosPagosTarjetas));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPagosTarjetas() {
		if(PagosTarjetasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPagosTarjetas();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPagosTarjetas() {
	}
	
	public void jTableDatosPagosTarjetasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPagosTarjetas(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPagosTarjetasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.getpagostarjetas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagostarjetas==null) {
						this.pagostarjetas = new PagosTarjetas();
					}

					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
				}

				if(this.pagostarjetas.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.pagostarjetas.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosTarjetas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPagosTarjetasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPagosTarjetas(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPagosTarjetas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPagosTarjetas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPagosTarjetas(this.getpagostarjetas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.pagostarjetasLogic.getConnexion());

				if(this.pagostarjetas.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.pagostarjetas.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPagosTarjetas=(TitledBorder)this.jScrollPanelDatosPagosTarjetas.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPagosTarjetas.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPagosTarjetasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.getpagostarjetas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagostarjetas==null) {
						this.pagostarjetas = new PagosTarjetas();
					}

					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
				}

				if(this.pagostarjetas.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.pagostarjetas.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosTarjetas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaPagosTarjetasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.getpagostarjetas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagostarjetas==null) {
						this.pagostarjetas = new PagosTarjetas();
					}

					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
				}

				if(this.pagostarjetas.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.pagostarjetas.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosTarjetas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_asiento_contablePagosTarjetasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.getpagostarjetas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagostarjetas==null) {
						this.pagostarjetas = new PagosTarjetas();
					}

					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
				}

				if(this.pagostarjetas.getcodigo_asiento_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_asiento_contable like '%"+this.pagostarjetas.getcodigo_asiento_contable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosTarjetas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_tarjeta_creditoPagosTarjetasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.getpagostarjetas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagostarjetas==null) {
						this.pagostarjetas = new PagosTarjetas();
					}

					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
				}

				if(this.pagostarjetas.getcodigo_tarjeta_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_tarjeta_credito like '%"+this.pagostarjetas.getcodigo_tarjeta_credito()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosTarjetas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_tipo_interes_tarjetaPagosTarjetasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.getpagostarjetas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagostarjetas==null) {
						this.pagostarjetas = new PagosTarjetas();
					}

					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
				}

				if(this.pagostarjetas.getnombre_tipo_interes_tarjeta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_tipo_interes_tarjeta like '%"+this.pagostarjetas.getnombre_tipo_interes_tarjeta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosTarjetas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_conexionPagosTarjetasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.getpagostarjetas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagostarjetas==null) {
						this.pagostarjetas = new PagosTarjetas();
					}

					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
				}

				if(this.pagostarjetas.getnombre_conexion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_conexion like '%"+this.pagostarjetas.getnombre_conexion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosTarjetas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_mesPagosTarjetasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.getpagostarjetas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagostarjetas==null) {
						this.pagostarjetas = new PagosTarjetas();
					}

					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
				}

				if(this.pagostarjetas.getnombre_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_mes like '%"+this.pagostarjetas.getnombre_mes()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosTarjetas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroPagosTarjetasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.getpagostarjetas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagostarjetas==null) {
						this.pagostarjetas = new PagosTarjetas();
					}

					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
				}

				if(this.pagostarjetas.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero like '%"+this.pagostarjetas.getnumero()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosTarjetas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonlotePagosTarjetasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.getpagostarjetas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagostarjetas==null) {
						this.pagostarjetas = new PagosTarjetas();
					}

					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
				}

				if(this.pagostarjetas.getlote()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where lote like '%"+this.pagostarjetas.getlote()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosTarjetas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorPagosTarjetasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.getpagostarjetas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagostarjetas==null) {
						this.pagostarjetas = new PagosTarjetas();
					}

					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
				}

				if(this.pagostarjetas.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.pagostarjetas.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosTarjetas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_retencionPagosTarjetasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.getpagostarjetas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagostarjetas==null) {
						this.pagostarjetas = new PagosTarjetas();
					}

					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
				}

				if(this.pagostarjetas.getvalor_retencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_retencion = "+this.pagostarjetas.getvalor_retencion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosTarjetas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_comisionPagosTarjetasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.getpagostarjetas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagostarjetas==null) {
						this.pagostarjetas = new PagosTarjetas();
					}

					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
				}

				if(this.pagostarjetas.getvalor_comision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_comision = "+this.pagostarjetas.getvalor_comision().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosTarjetas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_calculadoPagosTarjetasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.getpagostarjetas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagostarjetas==null) {
						this.pagostarjetas = new PagosTarjetas();
					}

					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
				}

				if(this.pagostarjetas.getvalor_calculado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_calculado = "+this.pagostarjetas.getvalor_calculado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosTarjetas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_canceladoPagosTarjetasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.getpagostarjetas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagostarjetas==null) {
						this.pagostarjetas = new PagosTarjetas();
					}

					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
				}

				if(this.pagostarjetas.getvalor_cancelado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_cancelado = "+this.pagostarjetas.getvalor_cancelado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosTarjetas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_difierePagosTarjetasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.getpagostarjetas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagostarjetas==null) {
						this.pagostarjetas = new PagosTarjetas();
					}

					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
				}

				if(this.pagostarjetas.getvalor_difiere()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_difiere = "+this.pagostarjetas.getvalor_difiere().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosTarjetas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_retencionPagosTarjetasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.getpagostarjetas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagostarjetas==null) {
						this.pagostarjetas = new PagosTarjetas();
					}

					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
				}

				if(this.pagostarjetas.getnumero_retencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_retencion like '%"+this.pagostarjetas.getnumero_retencion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosTarjetas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_liquidacionPagosTarjetasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.getpagostarjetas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagostarjetas==null) {
						this.pagostarjetas = new PagosTarjetas();
					}

					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
				}

				if(this.pagostarjetas.getnumero_liquidacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_liquidacion like '%"+this.pagostarjetas.getnumero_liquidacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosTarjetas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaPagosTarjetasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.getpagostarjetas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagostarjetas==null) {
						this.pagostarjetas = new PagosTarjetas();
					}

					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);
				}

				if(this.pagostarjetas.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.pagostarjetas.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosTarjetas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPagosTarjetasPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPagosTarjetas(false,false);

			this.getPagosTarjetassBusquedaPagosTarjetas();

			this.inicializarActualizarBindingPagosTarjetas(false);

			//if(PagosTarjetasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPagosTarjetas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPagosTarjetasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPagosTarjetas(false,false);

			this.getPagosTarjetassFK_IdEmpresa();

			this.inicializarActualizarBindingPagosTarjetas(false);

			//if(PagosTarjetasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPagosTarjetas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagostarjetasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePagosTarjetas() {
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
			this.jInternalFrameDetalleFormPagosTarjetas.setVisible(false);	    			
			this.jInternalFrameDetalleFormPagosTarjetas.dispose();
			this.jInternalFrameDetalleFormPagosTarjetas=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPagosTarjetas!=null) {
			this.jInternalFrameReporteDinamicoPagosTarjetas.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPagosTarjetas.dispose();
			this.jInternalFrameReporteDinamicoPagosTarjetas=null;
		}
		
		if(this.jInternalFrameImportacionPagosTarjetas!=null) {
			this.jInternalFrameImportacionPagosTarjetas.setVisible(false);	    			
			this.jInternalFrameImportacionPagosTarjetas.dispose();
			this.jInternalFrameImportacionPagosTarjetas=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPagosTarjetas();
			
			PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
			
			
			if(sTipo.equals("NuevoPagosTarjetas")) {
				jButtonNuevoPagosTarjetasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPagosTarjetas")) {
				jButtonDuplicarPagosTarjetasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPagosTarjetas")) {
				jButtonCopiarPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("VerFormPagosTarjetas")) {
				jButtonVerFormPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPagosTarjetas")) {
				jButtonNuevoPagosTarjetasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPagosTarjetas")) {
				jButtonDuplicarPagosTarjetasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPagosTarjetas")) {
				jButtonNuevoPagosTarjetasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPagosTarjetas")) {
				jButtonDuplicarPagosTarjetasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPagosTarjetas")) {
				jButtonNuevoPagosTarjetasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPagosTarjetas")) {
				jButtonNuevoPagosTarjetasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPagosTarjetas")) {
				jButtonNuevoPagosTarjetasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPagosTarjetas")) {
				jButtonModificarPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPagosTarjetas")) {
				jButtonModificarPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPagosTarjetas")) {
				jButtonModificarPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPagosTarjetas")) {
				jButtonActualizarPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPagosTarjetas")) {
				jButtonActualizarPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPagosTarjetas")) {
				jButtonActualizarPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("EliminarPagosTarjetas")) {
				jButtonEliminarPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPagosTarjetas")) {
				jButtonEliminarPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPagosTarjetas")) {
				jButtonEliminarPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("CancelarPagosTarjetas")) {
				jButtonCancelarPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPagosTarjetas")) {
				jButtonCancelarPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPagosTarjetas")) {
				jButtonCancelarPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("CerrarPagosTarjetas")) {
				jButtonCerrarPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPagosTarjetas")) {
				jButtonCerrarPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPagosTarjetas")) {
				jButtonCerrarPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPagosTarjetas")) {
				jButtonMostrarOcultarPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPagosTarjetas")) {
				jButtonCancelarPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPagosTarjetas")) {
				jButtonGuardarCambiosPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPagosTarjetas")) {
				jButtonGuardarCambiosPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPagosTarjetas")) {
				jButtonCopiarPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPagosTarjetas")) {
				jButtonVerFormPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPagosTarjetas")) {
				jButtonGuardarCambiosPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPagosTarjetas")) {
				jButtonCopiarPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPagosTarjetas")) {
				jButtonVerFormPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPagosTarjetas")) {
				jButtonGuardarCambiosPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPagosTarjetas")) {
				jButtonGuardarCambiosPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPagosTarjetas")) {
				jButtonGuardarCambiosPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPagosTarjetas")) {
				jButtonRecargarInformacionPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPagosTarjetas")) {
				jButtonRecargarInformacionPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPagosTarjetas")) {
				jButtonRecargarInformacionPagosTarjetasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPagosTarjetas")) {
				jButtonAnterioresPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPagosTarjetas")) {
				jButtonAnterioresPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePagosTarjetas")) {
				jButtonAnterioresPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPagosTarjetas")) {
				jButtonSiguientesPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPagosTarjetas")) {
				jButtonSiguientesPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPagosTarjetas")) {
				jButtonSiguientesPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPagosTarjetas") || sTipo.equals("MenuItemDetalleAbrirOrderByPagosTarjetas")) {
				jButtonAbrirOrderByPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPagosTarjetas") || sTipo.equals("MenuItemDetalleMostrarOcultarPagosTarjetas")) {
				jButtonMostrarOcultarPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPagosTarjetas")) {
				jButtonNuevoGuardarCambiosPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPagosTarjetas")) {
				jButtonNuevoGuardarCambiosPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPagosTarjetas")) {
				jButtonNuevoGuardarCambiosPagosTarjetasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPagosTarjetas")) {
				jButtonCerrarReporteDinamicoPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPagosTarjetas")) {
				jButtonGenerarReporteDinamicoPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPagosTarjetas")) {
				
				jButtonGenerarExcelReporteDinamicoPagosTarjetasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPagosTarjetas")) {
				jButtonCerrarImportacionPagosTarjetasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPagosTarjetas")) {
				
				jButtonGenerarImportacionPagosTarjetasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPagosTarjetas")) {
				
				jButtonAbrirImportacionPagosTarjetasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPagosTarjetas")) {
				jComboBoxTiposAccionesPagosTarjetasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPagosTarjetas")) {
				jComboBoxTiposRelacionesPagosTarjetasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPagosTarjetas")) {
				jComboBoxTiposAccionesPagosTarjetasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPagosTarjetas")) {
				
				jComboBoxTiposSeleccionarPagosTarjetasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPagosTarjetas")) {
				jTextFieldValorCampoGeneralPagosTarjetasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPagosTarjetas")) {
				jButtonAbrirOrderByPagosTarjetasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPagosTarjetas")) {
				jButtonAbrirOrderByPagosTarjetasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPagosTarjetas")) {
				jButtonCerrarOrderByPagosTarjetasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPagosTarjetasBusqueda")) {
				this.jButtonidPagosTarjetasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPagosTarjetasUpdate")) {
				this.jButtonid_empresaPagosTarjetasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPagosTarjetasBusqueda")) {
				this.jButtonid_empresaPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaPagosTarjetasBusqueda")) {
				this.jButtonfecha_hastaPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_asiento_contablePagosTarjetasBusqueda")) {
				this.jButtoncodigo_asiento_contablePagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tarjeta_creditoPagosTarjetasBusqueda")) {
				this.jButtoncodigo_tarjeta_creditoPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_interes_tarjetaPagosTarjetasBusqueda")) {
				this.jButtonnombre_tipo_interes_tarjetaPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_conexionPagosTarjetasBusqueda")) {
				this.jButtonnombre_conexionPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_mesPagosTarjetasBusqueda")) {
				this.jButtonnombre_mesPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroPagosTarjetasBusqueda")) {
				this.jButtonnumeroPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("lotePagosTarjetasBusqueda")) {
				this.jButtonlotePagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorPagosTarjetasBusqueda")) {
				this.jButtonvalorPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_retencionPagosTarjetasBusqueda")) {
				this.jButtonvalor_retencionPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_comisionPagosTarjetasBusqueda")) {
				this.jButtonvalor_comisionPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_calculadoPagosTarjetasBusqueda")) {
				this.jButtonvalor_calculadoPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_canceladoPagosTarjetasBusqueda")) {
				this.jButtonvalor_canceladoPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_difierePagosTarjetasBusqueda")) {
				this.jButtonvalor_difierePagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_retencionPagosTarjetasBusqueda")) {
				this.jButtonnumero_retencionPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_liquidacionPagosTarjetasBusqueda")) {
				this.jButtonnumero_liquidacionPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPagosTarjetasBusqueda")) {
				this.jButtonfechaPagosTarjetasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPagosTarjetasPagosTarjetas")) {
				this.jButtonBusquedaPagosTarjetasPagosTarjetasActionPerformed(evt);
			}
			
			;
			
			
			PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPagosTarjetas();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosTarjetasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagostarjetas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagostarjetas);
				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
				
				


				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosTarjetas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosTarjetas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PagosTarjetas pagostarjetasLocal=null;
			
			if(!this.getEsControlTabla()) {
				pagostarjetasLocal=this.pagostarjetas;
			} else {
				pagostarjetasLocal=this.pagostarjetasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagostarjetas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagostarjetas);
				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
							
				
				


				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosTarjetas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosTarjetas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosTarjetasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasAnterior =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagostarjetasAnterior =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
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
			
			PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
			
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
			
			


			
			PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosTarjetasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagostarjetas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagostarjetas);
				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
								
						
				


				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosTarjetas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosTarjetas.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagostarjetas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagostarjetas);
				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
								
				
				


				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosTarjetas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosTarjetas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosTarjetasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasAnterior =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagostarjetasAnterior =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagostarjetas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagostarjetas);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosTarjetasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasAnterior =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagostarjetasAnterior =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosTarjetasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pagostarjetas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pagostarjetas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagostarjetas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagostarjetas);
				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
							
				
				


				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosTarjetas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosTarjetas.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosTarjetasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagostarjetasAnterior =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.pagostarjetasAnterior =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
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
			
			PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
			
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
			
			


			
			PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosTarjetasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pagostarjetas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pagostarjetas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagostarjetas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagostarjetas);
				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
								
				
				


				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosTarjetas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosTarjetas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosTarjetasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasAnterior =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagostarjetasAnterior =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosTarjetasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pagostarjetas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pagostarjetas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosTarjetasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagostarjetas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagostarjetas);
				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPagosTarjetas")) {
					jCheckBoxSeleccionarTodosPagosTarjetasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPagosTarjetas")) {
					jCheckBoxSeleccionadosPagosTarjetasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPagosTarjetas")) {
					
				}
				
				


				
				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosTarjetas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosTarjetas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.pagostarjetas);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.pagostarjetas);
				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
												
				
				


				
				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosTarjetas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosTarjetas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosTarjetasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagostarjetasAnterior =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.pagostarjetasAnterior =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosTarjetasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagostarjetas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagostarjetas);
				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
				
				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
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
			
			PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
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
			
			


			
			PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosTarjetasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagostarjetas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagostarjetas);
				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosTarjetas.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosTarjetas.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagostarjetas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagostarjetas);
				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
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
				
				


				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosTarjetas.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosTarjetas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosTarjetasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagostarjetasAnterior =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagostarjetasAnterior =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPagosTarjetas")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPagosTarjetasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPagosTarjetas.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.pagostarjetas =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.pagostarjetas =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.pagostarjetas);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPagosTarjetas")) {
				
				}
				
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPagosTarjetas")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPagosTarjetas.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPagosTarjetas")) {
			
			}
			
			PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPagosTarjetas();
			
			PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
			
			if(sTipo.equals("NuevoPagosTarjetas")) {
				jButtonNuevoPagosTarjetasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPagosTarjetas")) {
				jButtonDuplicarPagosTarjetasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPagosTarjetas")) {
				jButtonCopiarPagosTarjetasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPagosTarjetas")) {
				jButtonVerFormPagosTarjetasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPagosTarjetas")) {
				jButtonNuevoPagosTarjetasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPagosTarjetas")) {
				jButtonModificarPagosTarjetasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPagosTarjetas")) {
				jButtonActualizarPagosTarjetasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPagosTarjetas")) {
				jButtonEliminarPagosTarjetasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPagosTarjetas")) {
				jButtonGuardarCambiosPagosTarjetasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPagosTarjetas")) {
				jButtonCancelarPagosTarjetasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPagosTarjetas")) {
				jButtonCerrarPagosTarjetasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPagosTarjetas")) {
				jButtonGuardarCambiosPagosTarjetasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPagosTarjetas")) {
				jButtonNuevoGuardarCambiosPagosTarjetasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPagosTarjetas")) {
				jButtonAbrirOrderByPagosTarjetasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPagosTarjetas")) {
				jButtonRecargarInformacionPagosTarjetasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPagosTarjetas")) {
				jButtonAnterioresPagosTarjetasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPagosTarjetas")) {
				jButtonSiguientesPagosTarjetasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPagosTarjetasBusqueda")) {
				this.jButtonidPagosTarjetasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPagosTarjetasUpdate")) {
				this.jButtonid_empresaPagosTarjetasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPagosTarjetasBusqueda")) {
				this.jButtonid_empresaPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaPagosTarjetasBusqueda")) {
				this.jButtonfecha_hastaPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_asiento_contablePagosTarjetasBusqueda")) {
				this.jButtoncodigo_asiento_contablePagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tarjeta_creditoPagosTarjetasBusqueda")) {
				this.jButtoncodigo_tarjeta_creditoPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_interes_tarjetaPagosTarjetasBusqueda")) {
				this.jButtonnombre_tipo_interes_tarjetaPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_conexionPagosTarjetasBusqueda")) {
				this.jButtonnombre_conexionPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_mesPagosTarjetasBusqueda")) {
				this.jButtonnombre_mesPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroPagosTarjetasBusqueda")) {
				this.jButtonnumeroPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("lotePagosTarjetasBusqueda")) {
				this.jButtonlotePagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorPagosTarjetasBusqueda")) {
				this.jButtonvalorPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_retencionPagosTarjetasBusqueda")) {
				this.jButtonvalor_retencionPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_comisionPagosTarjetasBusqueda")) {
				this.jButtonvalor_comisionPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_calculadoPagosTarjetasBusqueda")) {
				this.jButtonvalor_calculadoPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_canceladoPagosTarjetasBusqueda")) {
				this.jButtonvalor_canceladoPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_difierePagosTarjetasBusqueda")) {
				this.jButtonvalor_difierePagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_retencionPagosTarjetasBusqueda")) {
				this.jButtonnumero_retencionPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_liquidacionPagosTarjetasBusqueda")) {
				this.jButtonnumero_liquidacionPagosTarjetasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPagosTarjetasBusqueda")) {
				this.jButtonfechaPagosTarjetasBusquedaActionPerformed(evt);
			}
			
			PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPagosTarjetas();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePagosTarjetas")) {
				closingInternalFramePagosTarjetas();
				
			} else if(sTipo.equals("jButtonCancelarPagosTarjetas")) {
				JInternalFrameBase jInternalFrameDetalleFormPagosTarjetas = (JInternalFrameBase)evt.getSource();
	            	
	            PagosTarjetasBeanSwingJInternalFrame jInternalFrameParent=(PagosTarjetasBeanSwingJInternalFrame)jInternalFrameDetalleFormPagosTarjetas.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPagosTarjetasActionPerformed(null);
			}
			
			PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.pagostarjetas,new Object(),this.pagostarjetasParameterGeneral,this.pagostarjetasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPagosTarjetas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPagosTarjetas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPagosTarjetas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.pagostarjetas)) {
			if(!esControlTabla) {
				if(PagosTarjetasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);			
				}
				
				if(this.pagostarjetasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPagosTarjetas(this.pagostarjetas,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPagosTarjetas(this.pagostarjetasReturnGeneral,this.pagostarjetasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.pagostarjetasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPagosTarjetas(classes,this.pagostarjetasReturnGeneral,this.pagostarjetasBean,false);
					}
						
					if(this.pagostarjetasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPagosTarjetas(this.pagostarjetasReturnGeneral.getPagosTarjetas());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPagosTarjetas(this.pagostarjetasReturnGeneral.getPagosTarjetas());	
					}
						
					if(this.pagostarjetasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPagosTarjetas(this.pagostarjetasReturnGeneral.getPagosTarjetas(),classes);//this.pagostarjetasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPagosTarjetas(this.pagostarjetas,classes);//this.pagostarjetasBean);									
				}
			
				if(PagosTarjetasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPagosTarjetas(this.pagostarjetas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosTarjetas(this.pagostarjetas);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.pagostarjetasAnterior!=null) {
						this.pagostarjetas=this.pagostarjetasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.pagostarjetasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.pagostarjetasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.pagostarjetasReturnGeneral.getPagosTarjetas(),pagostarjetasLogic.getPagosTarjetass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.pagostarjetasReturnGeneral.getPagosTarjetas(),this.pagostarjetass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPagosTarjetas.repaint();
				
				//((AbstractTableModel) this.jTableDatosPagosTarjetas.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPagosTarjetas();
			}
		}
	}
	
	public void actualizarVisualTableDatosPagosTarjetas() throws Exception {
		
		PagosTarjetasModel pagostarjetasModel=(PagosTarjetasModel)this.jTableDatosPagosTarjetas.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pagostarjetasModel.pagostarjetass=this.pagostarjetasLogic.getPagosTarjetass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			pagostarjetasModel.pagostarjetass=this.pagostarjetass;
		}
		
		
		((PagosTarjetasModel) this.jTableDatosPagosTarjetas.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPagosTarjetas() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpagostarjetasAnterior(),this.pagostarjetasLogic.getPagosTarjetass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpagostarjetasAnterior(),this.pagostarjetass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPagosTarjetas();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPagosTarjetas(PagosTarjetas pagostarjetas,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
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
										
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pagostarjetas,new Object(),generalEntityParameterGeneral,this.pagostarjetasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.pagostarjetasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PagosTarjetasConstantesFunciones.getClassesRelationshipsOfPagosTarjetas(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PagosTarjetasConstantesFunciones.getClassesRelationshipsFromStringsOfPagosTarjetas(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPagosTarjetas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PagosTarjetasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pagostarjetas,new Object(),generalEntityParameterGeneral,this.pagostarjetasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPagosTarjetas(PagosTarjetasBean pagostarjetasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPagosTarjetas(ArrayList<Classe> classes,PagosTarjetasReturnGeneral pagostarjetasReturnGeneral,PagosTarjetasBean pagostarjetasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPagosTarjetas(PagosTarjetas pagostarjetas,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.pagostarjetas)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPagosTarjetas = new PagosTarjetasDetalleFormJInternalFrame(jDesktopPane,this.pagostarjetasSessionBean.getConGuardarRelaciones(),this.pagostarjetasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.setVisible(false);
		this.jInternalFrameDetalleFormPagosTarjetas.setSelected(false);						
		
		this.jInternalFrameDetalleFormPagosTarjetas.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPagosTarjetas.pagostarjetasLogic=this.pagostarjetasLogic;
		
		this.cargarCombosFrameForeignKeyPagosTarjetas("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePagosTarjetas();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePagosTarjetas();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPagosTarjetas("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPagosTarjetas();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPagosTarjetas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPagosTarjetas"));
		
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonModificarPagosTarjetas.addActionListener(new ButtonActionListener(this,"ModificarPagosTarjetas"));

		
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonModificarToolBarPagosTarjetas.addActionListener(new ButtonActionListener(this,"ModificarToolBarPagosTarjetas"));
					
		this.jInternalFrameDetalleFormPagosTarjetas.jMenuItemModificarPagosTarjetas.addActionListener(new ButtonActionListener(this,"MenuItemModificarPagosTarjetas"));		
		
		
		
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonActualizarPagosTarjetas.addActionListener (new ButtonActionListener(this,"ActualizarPagosTarjetas"));
		
		
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonActualizarToolBarPagosTarjetas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPagosTarjetas"));
						
		this.jInternalFrameDetalleFormPagosTarjetas.jMenuItemActualizarPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPagosTarjetas"));		
		
		
		
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonEliminarPagosTarjetas.addActionListener (new ButtonActionListener(this,"EliminarPagosTarjetas"));
		
		
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonEliminarToolBarPagosTarjetas.addActionListener (new ButtonActionListener(this,"EliminarToolBarPagosTarjetas"));
								
		this.jInternalFrameDetalleFormPagosTarjetas.jMenuItemEliminarPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPagosTarjetas"));		
		
		
		
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonCancelarPagosTarjetas.addActionListener (new ButtonActionListener(this,"CancelarPagosTarjetas"));
		
		
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonCancelarToolBarPagosTarjetas.addActionListener (new ButtonActionListener(this,"CancelarToolBarPagosTarjetas"));
					
		this.jInternalFrameDetalleFormPagosTarjetas.jMenuItemCancelarPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPagosTarjetas"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPagosTarjetas.jMenuItemDetalleCerrarPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPagosTarjetas"));		
		
		
		
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonGuardarCambiosToolBarPagosTarjetas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPagosTarjetas"));
		
		
		
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonGuardarCambiosToolBarPagosTarjetas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPagosTarjetas"));
		
		
		
		this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxTiposAccionesFormularioPagosTarjetas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPagosTarjetas"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonidPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"idPagosTarjetasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonid_empresaPagosTarjetasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPagosTarjetasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonid_empresaPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonfecha_hastaPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtoncodigo_asiento_contablePagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_asiento_contablePagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtoncodigo_tarjeta_creditoPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tarjeta_creditoPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonnombre_tipo_interes_tarjetaPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_interes_tarjetaPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonnombre_conexionPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_conexionPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonnombre_mesPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_mesPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonnumeroPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"numeroPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonlotePagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"lotePagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonvalorPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"valorPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonvalor_retencionPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"valor_retencionPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonvalor_comisionPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"valor_comisionPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonvalor_calculadoPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"valor_calculadoPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonvalor_canceladoPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"valor_canceladoPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonvalor_difierePagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"valor_difierePagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonnumero_retencionPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencionPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonnumero_liquidacionPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"numero_liquidacionPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonfechaPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"fechaPagosTarjetasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPagosTarjetas.jTabbedPaneRelacionesPagosTarjetas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPagosTarjetas"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePagosTarjetas"));
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosTarjetas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPagosTarjetas"));
		}
		
		this.jTableDatosPagosTarjetas.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPagosTarjetas"));
		
		this.jTableDatosPagosTarjetas.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPagosTarjetas"));
		
		this.jButtonNuevoPagosTarjetas.addActionListener(new ButtonActionListener(this,"NuevoPagosTarjetas"));
		
		this.jButtonDuplicarPagosTarjetas.addActionListener(new ButtonActionListener(this,"DuplicarPagosTarjetas"));
		
		this.jButtonCopiarPagosTarjetas.addActionListener(new ButtonActionListener(this,"CopiarPagosTarjetas"));
		
		this.jButtonVerFormPagosTarjetas.addActionListener(new ButtonActionListener(this,"VerFormPagosTarjetas"));
		
		
		this.jButtonNuevoToolBarPagosTarjetas.addActionListener(new ButtonActionListener(this,"NuevoToolBarPagosTarjetas"));
			
		this.jButtonDuplicarToolBarPagosTarjetas.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPagosTarjetas"));
			
		this.jMenuItemNuevoPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPagosTarjetas"));
			
		this.jMenuItemDuplicarPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPagosTarjetas"));		
		
		
		this.jButtonNuevoRelacionesPagosTarjetas.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPagosTarjetas"));
		
		
		this.jButtonNuevoRelacionesToolBarPagosTarjetas.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPagosTarjetas"));
			
		this.jMenuItemNuevoRelacionesPagosTarjetas.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPagosTarjetas"));		
		
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonModificarPagosTarjetas.addActionListener(new ButtonActionListener(this,"ModificarPagosTarjetas"));
		}
		
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonModificarToolBarPagosTarjetas.addActionListener(new ButtonActionListener(this,"ModificarToolBarPagosTarjetas"));
			
			this.jInternalFrameDetalleFormPagosTarjetas.jMenuItemModificarPagosTarjetas.addActionListener(new ButtonActionListener(this,"MenuItemModificarPagosTarjetas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonActualizarPagosTarjetas.addActionListener (new ButtonActionListener(this,"ActualizarPagosTarjetas"));
		}
		
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonActualizarToolBarPagosTarjetas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPagosTarjetas"));
				
			this.jInternalFrameDetalleFormPagosTarjetas.jMenuItemActualizarPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPagosTarjetas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonEliminarPagosTarjetas.addActionListener (new ButtonActionListener(this,"EliminarPagosTarjetas"));
		}
		
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonEliminarToolBarPagosTarjetas.addActionListener (new ButtonActionListener(this,"EliminarToolBarPagosTarjetas"));
						
			this.jInternalFrameDetalleFormPagosTarjetas.jMenuItemEliminarPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPagosTarjetas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonCancelarPagosTarjetas.addActionListener (new ButtonActionListener(this,"CancelarPagosTarjetas"));
		}
		
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonCancelarToolBarPagosTarjetas.addActionListener (new ButtonActionListener(this,"CancelarToolBarPagosTarjetas"));
			
			this.jInternalFrameDetalleFormPagosTarjetas.jMenuItemCancelarPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPagosTarjetas"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPagosTarjetas.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPagosTarjetas"));		
		
		
		this.jButtonCerrarPagosTarjetas.addActionListener (new ButtonActionListener(this,"CerrarPagosTarjetas"));
		
		
		this.jButtonCerrarToolBarPagosTarjetas.addActionListener (new ButtonActionListener(this,"CerrarToolBarPagosTarjetas"));
			
		this.jMenuItemCerrarPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPagosTarjetas"));
			
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosTarjetas.jMenuItemDetalleCerrarPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPagosTarjetas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonGuardarCambiosPagosTarjetas.addActionListener (new ButtonActionListener(this,"GuardarCambiosPagosTarjetas"));
		}
		
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosTarjetas.jButtonGuardarCambiosToolBarPagosTarjetas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPagosTarjetas"));
		}
		
		this.jButtonCopiarToolBarPagosTarjetas.addActionListener (new ButtonActionListener(this,"CopiarToolBarPagosTarjetas"));
			
		this.jButtonVerFormToolBarPagosTarjetas.addActionListener (new ButtonActionListener(this,"VerFormToolBarPagosTarjetas"));
		
		this.jMenuItemGuardarCambiosPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPagosTarjetas"));
			
		this.jMenuItemCopiarPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPagosTarjetas"));		
		
		this.jMenuItemVerFormPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPagosTarjetas"));		
		
		
		this.jButtonGuardarCambiosTablaPagosTarjetas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPagosTarjetas"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPagosTarjetas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPagosTarjetas"));
			
		this.jMenuItemGuardarCambiosTablaPagosTarjetas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPagosTarjetas"));		
		
		
		
		this.jButtonRecargarInformacionPagosTarjetas.addActionListener (new ButtonActionListener(this,"RecargarInformacionPagosTarjetas"));
					
		this.jButtonRecargarInformacionToolBarPagosTarjetas.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPagosTarjetas"));
		
		this.jMenuItemRecargarInformacionPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPagosTarjetas"));		
		
		
		
		this.jButtonAnterioresPagosTarjetas.addActionListener (new ButtonActionListener(this,"AnterioresPagosTarjetas"));
		
		
		this.jButtonAnterioresToolBarPagosTarjetas.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPagosTarjetas"));
		
		this.jMenuItemAnterioresPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPagosTarjetas"));		
		
		
		this.jButtonSiguientesPagosTarjetas.addActionListener (new ButtonActionListener(this,"SiguientesPagosTarjetas"));
		
		
		this.jButtonSiguientesToolBarPagosTarjetas.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPagosTarjetas"));
			
		this.jMenuItemSiguientesPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPagosTarjetas"));
			
		this.jMenuItemAbrirOrderByPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPagosTarjetas"));
			
		this.jMenuItemMostrarOcultarPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPagosTarjetas"));
			
		this.jMenuItemDetalleAbrirOrderByPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPagosTarjetas"));
			
		this.jMenuItemDetalleMostarOcultarPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPagosTarjetas"));		
		
		
		this.jButtonNuevoGuardarCambiosPagosTarjetas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPagosTarjetas"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPagosTarjetas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPagosTarjetas"));
			
		this.jMenuItemNuevoGuardarCambiosPagosTarjetas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPagosTarjetas"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPagosTarjetas.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPagosTarjetas"));

		this.jCheckBoxSeleccionadosPagosTarjetas.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPagosTarjetas"));
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxTiposAccionesFormularioPagosTarjetas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPagosTarjetas"));
		}
		
		
		this.jComboBoxTiposRelacionesPagosTarjetas.addActionListener (new ButtonActionListener(this,"TiposRelacionesPagosTarjetas"));
			
		this.jComboBoxTiposAccionesPagosTarjetas.addActionListener (new ButtonActionListener(this,"TiposAccionesPagosTarjetas"));
					
		this.jComboBoxTiposSeleccionarPagosTarjetas.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPagosTarjetas"));
			
		this.jTextFieldValorCampoGeneralPagosTarjetas.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPagosTarjetas"));		
		
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonidPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"idPagosTarjetasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonid_empresaPagosTarjetasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPagosTarjetasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonid_empresaPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonfecha_hastaPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtoncodigo_asiento_contablePagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_asiento_contablePagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtoncodigo_tarjeta_creditoPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tarjeta_creditoPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonnombre_tipo_interes_tarjetaPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_interes_tarjetaPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonnombre_conexionPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_conexionPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonnombre_mesPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_mesPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonnumeroPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"numeroPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonlotePagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"lotePagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonvalorPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"valorPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonvalor_retencionPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"valor_retencionPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonvalor_comisionPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"valor_comisionPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonvalor_calculadoPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"valor_calculadoPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonvalor_canceladoPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"valor_canceladoPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonvalor_difierePagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"valor_difierePagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonnumero_retencionPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencionPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonnumero_liquidacionPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"numero_liquidacionPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonfechaPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"fechaPagosTarjetasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPagosTarjetasPagosTarjetas.addActionListener(new ButtonActionListener(this,"BusquedaPagosTarjetasPagosTarjetas"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPagosTarjetas!=null) {
				this.jInternalFrameReporteDinamicoPagosTarjetas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPagosTarjetas"));
				this.jInternalFrameReporteDinamicoPagosTarjetas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPagosTarjetas"));
				this.jInternalFrameReporteDinamicoPagosTarjetas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPagosTarjetas"));
			}
			
			//this.jButtonCerrarReporteDinamicoPagosTarjetas.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPagosTarjetas"));				
			//this.jButtonGenerarReporteDinamicoPagosTarjetas.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPagosTarjetas"));
			//this.jButtonGenerarExcelReporteDinamicoPagosTarjetas.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPagosTarjetas"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPagosTarjetas!=null) {
				this.jInternalFrameImportacionPagosTarjetas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPagosTarjetas"));
				this.jInternalFrameImportacionPagosTarjetas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPagosTarjetas"));
				this.jInternalFrameImportacionPagosTarjetas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPagosTarjetas"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPagosTarjetas.addActionListener (new ButtonActionListener(this,"AbrirOrderByPagosTarjetas"));
			
			this.jButtonAbrirOrderByToolBarPagosTarjetas.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPagosTarjetas"));			
			
			if(this.jInternalFrameOrderByPagosTarjetas!=null) {
				this.jInternalFrameOrderByPagosTarjetas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPagosTarjetas"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPagosTarjetas!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosTarjetas.jTabbedPaneRelacionesPagosTarjetas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPagosTarjetas"));
		
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
            		closingInternalFramePagosTarjetas();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPagosTarjetas.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPagosTarjetas = (JInternalFrameBase)event.getSource();
	            	
	            PagosTarjetasBeanSwingJInternalFrame jInternalFrameParent=(PagosTarjetasBeanSwingJInternalFrame)jInternalFrameDetalleFormPagosTarjetas.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPagosTarjetasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPagosTarjetas.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPagosTarjetasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPagosTarjetas.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPagosTarjetas.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosTarjetasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosTarjetasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosTarjetasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPagosTarjetas";
		inputMap = this.jButtonNuevoPagosTarjetas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPagosTarjetas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPagosTarjetasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosTarjetasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosTarjetasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosTarjetasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPagosTarjetas";
		inputMap = this.jButtonNuevoRelacionesPagosTarjetas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPagosTarjetas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPagosTarjetasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPagosTarjetas";
		inputMap = this.jButtonModificarPagosTarjetas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPagosTarjetas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPagosTarjetasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPagosTarjetas";
		inputMap = this.jButtonActualizarPagosTarjetas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPagosTarjetas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPagosTarjetasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPagosTarjetas";
		inputMap = this.jButtonEliminarPagosTarjetas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPagosTarjetas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPagosTarjetasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPagosTarjetas";
		inputMap = this.jButtonCancelarPagosTarjetas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPagosTarjetas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPagosTarjetasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPagosTarjetas";
		inputMap = this.jButtonCerrarPagosTarjetas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPagosTarjetas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPagosTarjetasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonGuardarCambiosPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPagosTarjetas";
		inputMap = this.jInternalFrameDetalleFormPagosTarjetas.jButtonGuardarCambiosPagosTarjetas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonGuardarCambiosPagosTarjetas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPagosTarjetasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPagosTarjetas.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPagosTarjetasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPagosTarjetas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPagosTarjetasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPagosTarjetas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPagosTarjetasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPagosTarjetas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPagosTarjetasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonidPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"idPagosTarjetasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonid_empresaPagosTarjetasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPagosTarjetasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonid_empresaPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonfecha_hastaPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtoncodigo_asiento_contablePagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_asiento_contablePagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtoncodigo_tarjeta_creditoPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tarjeta_creditoPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonnombre_tipo_interes_tarjetaPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_interes_tarjetaPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonnombre_conexionPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_conexionPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonnombre_mesPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_mesPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonnumeroPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"numeroPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonlotePagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"lotePagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonvalorPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"valorPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonvalor_retencionPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"valor_retencionPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonvalor_comisionPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"valor_comisionPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonvalor_calculadoPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"valor_calculadoPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonvalor_canceladoPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"valor_canceladoPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonvalor_difierePagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"valor_difierePagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonnumero_retencionPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencionPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonnumero_liquidacionPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"numero_liquidacionPagosTarjetasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosTarjetas.jButtonfechaPagosTarjetasBusqueda.addActionListener(new ButtonActionListener(this,"fechaPagosTarjetasBusqueda"));
		
		
		this.jButtonBusquedaPagosTarjetasPagosTarjetas.addActionListener(new ButtonActionListener(this,"BusquedaPagosTarjetasPagosTarjetas"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPagosTarjetas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPagosTarjetasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPagosTarjetasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPagosTarjetas.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPagosTarjetas(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PagosTarjetas pagostarjetasAux:this.pagostarjetasLogic.getPagosTarjetass()) {
					pagostarjetasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PagosTarjetas pagostarjetasAux:pagostarjetass) {
					pagostarjetasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPagosTarjetasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPagosTarjetas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PagosTarjetas pagostarjetasAux:this.pagostarjetasLogic.getPagosTarjetass()) {
						pagostarjetasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PagosTarjetas pagostarjetasAux:pagostarjetass) {
						pagostarjetasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PagosTarjetas pagostarjetasAux:this.pagostarjetasLogic.getPagosTarjetass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PagosTarjetas pagostarjetasAux:pagostarjetass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPagosTarjetas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPagosTarjetas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPagosTarjetas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPagosTarjetas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPagosTarjetasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPagosTarjetas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPagosTarjetas.getSelectedRows();
			
			PagosTarjetas pagostarjetasLocal=new PagosTarjetas();
			
			//this.seleccionarTodosPagosTarjetas(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pagostarjetasLocal =(PagosTarjetas) this.pagostarjetasLogic.getPagosTarjetass().toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					pagostarjetasLocal =(PagosTarjetas) this.pagostarjetass.toArray()[this.jTableDatosPagosTarjetas.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				pagostarjetasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PagosTarjetas pagostarjetasAux:this.pagostarjetasLogic.getPagosTarjetass()) {
						pagostarjetasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PagosTarjetas pagostarjetasAux:pagostarjetass) {
						pagostarjetasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPagosTarjetas(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPagosTarjetas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPagosTarjetas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPagosTarjetas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPagosTarjetasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPagosTarjetasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPagosTarjetasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPagosTarjetas(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPagosTarjetas.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PagosTarjetas pagostarjetasAux:this.pagostarjetasLogic.getPagosTarjetass()) {
				
						if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							pagostarjetasAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE)) {
							existe=true;
							pagostarjetasAux.setcodigo_asiento_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_CODIGOTARJETACREDITO)) {
							existe=true;
							pagostarjetasAux.setcodigo_tarjeta_credito(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_NOMBRETIPOINTERESTARJETA)) {
							existe=true;
							pagostarjetasAux.setnombre_tipo_interes_tarjeta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_NOMBRECONEXION)) {
							existe=true;
							pagostarjetasAux.setnombre_conexion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_NOMBREMES)) {
							existe=true;
							pagostarjetasAux.setnombre_mes(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							pagostarjetasAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_LOTE)) {
							existe=true;
							pagostarjetasAux.setlote(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							pagostarjetasAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_VALORRETENCION)) {
							existe=true;
							pagostarjetasAux.setvalor_retencion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_VALORCOMISION)) {
							existe=true;
							pagostarjetasAux.setvalor_comision(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_VALORCALCULADO)) {
							existe=true;
							pagostarjetasAux.setvalor_calculado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_VALORCANCELADO)) {
							existe=true;
							pagostarjetasAux.setvalor_cancelado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_VALORDIFIERE)) {
							existe=true;
							pagostarjetasAux.setvalor_difiere(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_NUMERORETENCION)) {
							existe=true;
							pagostarjetasAux.setnumero_retencion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_NUMEROLIQUIDACION)) {
							existe=true;
							pagostarjetasAux.setnumero_liquidacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							pagostarjetasAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PagosTarjetas pagostarjetasAux:pagostarjetass) {
					
						if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							pagostarjetasAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE)) {
							existe=true;
							pagostarjetasAux.setcodigo_asiento_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_CODIGOTARJETACREDITO)) {
							existe=true;
							pagostarjetasAux.setcodigo_tarjeta_credito(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_NOMBRETIPOINTERESTARJETA)) {
							existe=true;
							pagostarjetasAux.setnombre_tipo_interes_tarjeta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_NOMBRECONEXION)) {
							existe=true;
							pagostarjetasAux.setnombre_conexion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_NOMBREMES)) {
							existe=true;
							pagostarjetasAux.setnombre_mes(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							pagostarjetasAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_LOTE)) {
							existe=true;
							pagostarjetasAux.setlote(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							pagostarjetasAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_VALORRETENCION)) {
							existe=true;
							pagostarjetasAux.setvalor_retencion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_VALORCOMISION)) {
							existe=true;
							pagostarjetasAux.setvalor_comision(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_VALORCALCULADO)) {
							existe=true;
							pagostarjetasAux.setvalor_calculado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_VALORCANCELADO)) {
							existe=true;
							pagostarjetasAux.setvalor_cancelado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_VALORDIFIERE)) {
							existe=true;
							pagostarjetasAux.setvalor_difiere(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_NUMERORETENCION)) {
							existe=true;
							pagostarjetasAux.setnumero_retencion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_NUMEROLIQUIDACION)) {
							existe=true;
							pagostarjetasAux.setnumero_liquidacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							pagostarjetasAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPagosTarjetas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPagosTarjetasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPagosTarjetas(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPagosTarjetas=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPagosTarjetas.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxTiposAccionesFormularioPagosTarjetas.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePagosTarjetas) {				
					conSplash=true;//false;										
					
					//this.startProcessPagosTarjetas(conSplash);
				
					this.generarReportePagosTarjetassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPagosTarjetas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxTiposAccionesFormularioPagosTarjetas.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPagosTarjetassSeleccionados();
				//this.jComboBoxTiposAccionesPagosTarjetas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPagosTarjetassSeleccionados(false);
				//this.jComboBoxTiposAccionesPagosTarjetas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPagosTarjetassSeleccionados(true);
				//this.jComboBoxTiposAccionesPagosTarjetas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPagosTarjetas();
				
				this.exportarPagosTarjetassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPagosTarjetas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxTiposAccionesFormularioPagosTarjetas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPagosTarjetass();
				//this.importarPagosTarjetass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPagosTarjetas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxTiposAccionesFormularioPagosTarjetas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPagosTarjetas();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPagosTarjetassSeleccionados();
				//this.jComboBoxTiposAccionesPagosTarjetas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Pagos Tarjetas", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPagosTarjetas();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPagosTarjetas)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPagosTarjetas(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Pagos Tarjetas",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPagosTarjetas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxTiposAccionesFormularioPagosTarjetas.setSelectedIndex(0);					
				}	
			} 			
			else if(PagosTarjetasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePagosTarjetas) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPagosTarjetas(conSplash);
					
						//this.actualizarParametrosGeneralPagosTarjetas();
						
						this.generarReporteProcesoAccionPagosTarjetassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPagosTarjetas.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxTiposAccionesFormularioPagosTarjetas.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PagosTarjetasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Pagos TarjetasES SELECCIONADOS?", "MANTENIMIENTO DE Pagos Tarjetas", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPagosTarjetas();
				
						this.actualizarParametrosGeneralPagosTarjetas();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.pagostarjetasReturnGeneral=pagostarjetasLogic.procesarAccionPagosTarjetassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.pagostarjetasLogic.getPagosTarjetass(),this.pagostarjetasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPagosTarjetasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPagosTarjetas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxTiposAccionesFormularioPagosTarjetas.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPagosTarjetas();
					
					PagosTarjetasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPagosTarjetasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPagosTarjetas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxTiposAccionesFormularioPagosTarjetas.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPagosTarjetas(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPagosTarjetasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPagosTarjetas();
			
			if(this.jInternalFrameDetalleFormPagosTarjetas==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PagosTarjetas> pagostarjetassSeleccionados=new ArrayList<PagosTarjetas>();		
			PagosTarjetas pagostarjetas=new PagosTarjetas();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPagosTarjetas(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPagosTarjetas.getSelectedItem();
			
			
			
			
			pagostarjetassSeleccionados=this.getPagosTarjetassSeleccionados(true);
			//this.sTipoAccion;
			
			if(pagostarjetassSeleccionados.size()==1) {
				for(PagosTarjetas pagostarjetasAux:pagostarjetassSeleccionados) {
					pagostarjetas=pagostarjetasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPagosTarjetas();
			
      		//this.finishProcessPagosTarjetas(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPagosTarjetasReturnGeneral() throws Exception {
		if(this.pagostarjetasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.pagostarjetasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.pagostarjetasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.pagostarjetasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.pagostarjetasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.pagostarjetasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPagosTarjetas(false);
		}
		
		if(this.pagostarjetasReturnGeneral.getConRetornoLista() || this.pagostarjetasReturnGeneral.getConRetornoObjeto()) {
			if(this.pagostarjetasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.pagostarjetasLogic.setPagosTarjetass(this.pagostarjetasReturnGeneral.getPagosTarjetass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingPagosTarjetas(false);
		}
	}
	
	public void actualizarParametrosGeneralPagosTarjetas() throws Exception {
		
		
	}
	
	public ArrayList<PagosTarjetas> getPagosTarjetassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PagosTarjetas> pagostarjetassSeleccionados=new ArrayList<PagosTarjetas>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPagosTarjetas) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PagosTarjetas pagostarjetasAux:pagostarjetasLogic.getPagosTarjetass()) {
					if(pagostarjetasAux.getIsSelected()) {
						pagostarjetassSeleccionados.add(pagostarjetasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PagosTarjetas pagostarjetasAux:this.pagostarjetass) {
					if(pagostarjetasAux.getIsSelected()) {
						pagostarjetassSeleccionados.add(pagostarjetasAux);				
					}
				}
			}
			
			if(pagostarjetassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						pagostarjetassSeleccionados.addAll(this.pagostarjetasLogic.getPagosTarjetass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						pagostarjetassSeleccionados.addAll(this.pagostarjetass);				
					}
				}
			}
		} else {
			pagostarjetassSeleccionados.add(this.pagostarjetas);
		}
		
		return pagostarjetassSeleccionados;
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
	
	public void generarReportePagosTarjetassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPagosTarjetassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPagosTarjetassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPagosTarjetassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPagosTarjetassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Pagos Tarjetas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPagosTarjetassSeleccionados() throws Exception {
		ArrayList<PagosTarjetas> pagostarjetassSeleccionados=new ArrayList<PagosTarjetas>();		
		
		pagostarjetassSeleccionados=this.getPagosTarjetassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePagosTarjetass("Todos",pagostarjetassSeleccionados);
		
	}	
	
	public void generarReporteNormalPagosTarjetassSeleccionados() throws Exception {
		ArrayList<PagosTarjetas> pagostarjetassSeleccionados=new ArrayList<PagosTarjetas>();		
		
		pagostarjetassSeleccionados=this.getPagosTarjetassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePagosTarjetass("Todos",pagostarjetassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPagosTarjetassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PagosTarjetas> pagostarjetassSeleccionados=new ArrayList<PagosTarjetas>();
		
		pagostarjetassSeleccionados=this.getPagosTarjetassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePagosTarjetass("Todos",pagostarjetassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPagosTarjetassSeleccionados() throws Exception {
		ArrayList<PagosTarjetas> pagostarjetassSeleccionados=new ArrayList<PagosTarjetas>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPagosTarjetas();
		
		
		pagostarjetassSeleccionados=this.getPagosTarjetassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPagosTarjetas();
		
		
		//this.generarReportePagosTarjetass("Todos",pagostarjetassSeleccionados ,pagostarjetasImplementable,pagostarjetasImplementableHome);
	}
	
	public void mostrarImportacionPagosTarjetass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPagosTarjetas();
		
		this.abrirFrameImportacionPagosTarjetas();		
		
			
		//this.generarReportePagosTarjetass("Todos",pagostarjetassSeleccionados ,pagostarjetasImplementable,pagostarjetasImplementableHome);
	}
	
	public void importarPagosTarjetass() throws Exception {		
	
	}
	
	public void exportarPagosTarjetassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPagosTarjetassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPagosTarjetassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPagosTarjetassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Pagos Tarjetas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPagosTarjetassSeleccionados() throws Exception {
		ArrayList<PagosTarjetas> pagostarjetassSeleccionados=new ArrayList<PagosTarjetas>();		
		
		pagostarjetassSeleccionados=this.getPagosTarjetassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagostarjetas."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPagosTarjetas(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PagosTarjetas pagostarjetasAux:pagostarjetassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPagosTarjetas(pagostarjetasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//pagostarjetasAux.setsDetalleGeneralEntityReporte(pagostarjetasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Tarjetas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPagosTarjetas(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PagosTarjetasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosTarjetasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosTarjetasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosTarjetasConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosTarjetasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosTarjetasConstantesFunciones.LABEL_CODIGOTARJETACREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosTarjetasConstantesFunciones.LABEL_NOMBRETIPOINTERESTARJETA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosTarjetasConstantesFunciones.LABEL_NOMBRECONEXION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosTarjetasConstantesFunciones.LABEL_NOMBREMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosTarjetasConstantesFunciones.LABEL_NUMERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosTarjetasConstantesFunciones.LABEL_LOTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosTarjetasConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosTarjetasConstantesFunciones.LABEL_VALORRETENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosTarjetasConstantesFunciones.LABEL_VALORCOMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosTarjetasConstantesFunciones.LABEL_VALORCALCULADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosTarjetasConstantesFunciones.LABEL_VALORCANCELADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosTarjetasConstantesFunciones.LABEL_VALORDIFIERE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosTarjetasConstantesFunciones.LABEL_NUMERORETENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosTarjetasConstantesFunciones.LABEL_NUMEROLIQUIDACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosTarjetasConstantesFunciones.LABEL_FECHA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPagosTarjetas(PagosTarjetas pagostarjetas,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=pagostarjetas.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=pagostarjetas.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagostarjetas.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagostarjetas.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagostarjetas.getcodigo_asiento_contable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagostarjetas.getcodigo_tarjeta_credito();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagostarjetas.getnombre_tipo_interes_tarjeta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagostarjetas.getnombre_conexion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagostarjetas.getnombre_mes();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagostarjetas.getnumero();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagostarjetas.getlote();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagostarjetas.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagostarjetas.getvalor_retencion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagostarjetas.getvalor_comision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagostarjetas.getvalor_calculado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagostarjetas.getvalor_cancelado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagostarjetas.getvalor_difiere().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagostarjetas.getnumero_retencion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagostarjetas.getnumero_liquidacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagostarjetas.getfecha().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPagosTarjetassSeleccionados() throws Exception {
		ArrayList<PagosTarjetas> pagostarjetassSeleccionados=new ArrayList<PagosTarjetas>();		
		
		pagostarjetassSeleccionados=this.getPagosTarjetassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagostarjetas.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PagosTarjetass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPagosTarjetas(row);				
				iRow++;
			}				
			
			for(PagosTarjetas pagostarjetasAux:pagostarjetassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPagosTarjetas(pagostarjetasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Tarjetas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPagosTarjetassSeleccionados() throws Exception {
		ArrayList<PagosTarjetas> pagostarjetassSeleccionados=new ArrayList<PagosTarjetas>();		
		
		pagostarjetassSeleccionados=this.getPagosTarjetassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagostarjetas.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("pagostarjetass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("pagostarjetas");
			//elementRoot.appendChild(element);
		
			for(PagosTarjetas pagostarjetasAux:pagostarjetassSeleccionados) {
				element = document.createElement("pagostarjetas");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPagosTarjetas(pagostarjetasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Tarjetas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPagosTarjetas(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_CODIGOTARJETACREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_NOMBRETIPOINTERESTARJETA);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_NOMBRECONEXION);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_NOMBREMES);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_NUMERO);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_LOTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_VALORRETENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_VALORCOMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_VALORCALCULADO);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_VALORCANCELADO);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_VALORDIFIERE);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_NUMERORETENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_NUMEROLIQUIDACION);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosTarjetasConstantesFunciones.LABEL_FECHA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPagosTarjetas(PagosTarjetas pagostarjetas,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(pagostarjetas.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(pagostarjetas.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pagostarjetas.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(pagostarjetas.getcodigo_asiento_contable());
		cell = row.createCell(iColumn++);cell.setCellValue(pagostarjetas.getcodigo_tarjeta_credito());
		cell = row.createCell(iColumn++);cell.setCellValue(pagostarjetas.getnombre_tipo_interes_tarjeta());
		cell = row.createCell(iColumn++);cell.setCellValue(pagostarjetas.getnombre_conexion());
		cell = row.createCell(iColumn++);cell.setCellValue(pagostarjetas.getnombre_mes());
		cell = row.createCell(iColumn++);cell.setCellValue(pagostarjetas.getnumero());
		cell = row.createCell(iColumn++);cell.setCellValue(pagostarjetas.getlote());
		cell = row.createCell(iColumn++);cell.setCellValue(pagostarjetas.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(pagostarjetas.getvalor_retencion());
		cell = row.createCell(iColumn++);cell.setCellValue(pagostarjetas.getvalor_comision());
		cell = row.createCell(iColumn++);cell.setCellValue(pagostarjetas.getvalor_calculado());
		cell = row.createCell(iColumn++);cell.setCellValue(pagostarjetas.getvalor_cancelado());
		cell = row.createCell(iColumn++);cell.setCellValue(pagostarjetas.getvalor_difiere());
		cell = row.createCell(iColumn++);cell.setCellValue(pagostarjetas.getnumero_retencion());
		cell = row.createCell(iColumn++);cell.setCellValue(pagostarjetas.getnumero_liquidacion());
		cell = row.createCell(iColumn++);cell.setCellValue(pagostarjetas.getfecha());				
	}
	
	public void setFilaDatosExportarXmlPagosTarjetas(PagosTarjetas pagostarjetas,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PagosTarjetasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(pagostarjetas.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PagosTarjetasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(pagostarjetas.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PagosTarjetasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(pagostarjetas.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementfecha_hasta = document.createElement(PagosTarjetasConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(pagostarjetas.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementcodigo_asiento_contable = document.createElement(PagosTarjetasConstantesFunciones.CODIGOASIENTOCONTABLE);
		elementcodigo_asiento_contable.appendChild(document.createTextNode(pagostarjetas.getcodigo_asiento_contable().trim()));
		element.appendChild(elementcodigo_asiento_contable);

		Element elementcodigo_tarjeta_credito = document.createElement(PagosTarjetasConstantesFunciones.CODIGOTARJETACREDITO);
		elementcodigo_tarjeta_credito.appendChild(document.createTextNode(pagostarjetas.getcodigo_tarjeta_credito().trim()));
		element.appendChild(elementcodigo_tarjeta_credito);

		Element elementnombre_tipo_interes_tarjeta = document.createElement(PagosTarjetasConstantesFunciones.NOMBRETIPOINTERESTARJETA);
		elementnombre_tipo_interes_tarjeta.appendChild(document.createTextNode(pagostarjetas.getnombre_tipo_interes_tarjeta().trim()));
		element.appendChild(elementnombre_tipo_interes_tarjeta);

		Element elementnombre_conexion = document.createElement(PagosTarjetasConstantesFunciones.NOMBRECONEXION);
		elementnombre_conexion.appendChild(document.createTextNode(pagostarjetas.getnombre_conexion().trim()));
		element.appendChild(elementnombre_conexion);

		Element elementnombre_mes = document.createElement(PagosTarjetasConstantesFunciones.NOMBREMES);
		elementnombre_mes.appendChild(document.createTextNode(pagostarjetas.getnombre_mes().trim()));
		element.appendChild(elementnombre_mes);

		Element elementnumero = document.createElement(PagosTarjetasConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(pagostarjetas.getnumero().trim()));
		element.appendChild(elementnumero);

		Element elementlote = document.createElement(PagosTarjetasConstantesFunciones.LOTE);
		elementlote.appendChild(document.createTextNode(pagostarjetas.getlote().trim()));
		element.appendChild(elementlote);

		Element elementvalor = document.createElement(PagosTarjetasConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(pagostarjetas.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementvalor_retencion = document.createElement(PagosTarjetasConstantesFunciones.VALORRETENCION);
		elementvalor_retencion.appendChild(document.createTextNode(pagostarjetas.getvalor_retencion().toString().trim()));
		element.appendChild(elementvalor_retencion);

		Element elementvalor_comision = document.createElement(PagosTarjetasConstantesFunciones.VALORCOMISION);
		elementvalor_comision.appendChild(document.createTextNode(pagostarjetas.getvalor_comision().toString().trim()));
		element.appendChild(elementvalor_comision);

		Element elementvalor_calculado = document.createElement(PagosTarjetasConstantesFunciones.VALORCALCULADO);
		elementvalor_calculado.appendChild(document.createTextNode(pagostarjetas.getvalor_calculado().toString().trim()));
		element.appendChild(elementvalor_calculado);

		Element elementvalor_cancelado = document.createElement(PagosTarjetasConstantesFunciones.VALORCANCELADO);
		elementvalor_cancelado.appendChild(document.createTextNode(pagostarjetas.getvalor_cancelado().toString().trim()));
		element.appendChild(elementvalor_cancelado);

		Element elementvalor_difiere = document.createElement(PagosTarjetasConstantesFunciones.VALORDIFIERE);
		elementvalor_difiere.appendChild(document.createTextNode(pagostarjetas.getvalor_difiere().toString().trim()));
		element.appendChild(elementvalor_difiere);

		Element elementnumero_retencion = document.createElement(PagosTarjetasConstantesFunciones.NUMERORETENCION);
		elementnumero_retencion.appendChild(document.createTextNode(pagostarjetas.getnumero_retencion().trim()));
		element.appendChild(elementnumero_retencion);

		Element elementnumero_liquidacion = document.createElement(PagosTarjetasConstantesFunciones.NUMEROLIQUIDACION);
		elementnumero_liquidacion.appendChild(document.createTextNode(pagostarjetas.getnumero_liquidacion().trim()));
		element.appendChild(elementnumero_liquidacion);

		Element elementfecha = document.createElement(PagosTarjetasConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(pagostarjetas.getfecha().toString().trim()));
		element.appendChild(elementfecha);
	}
	
	public void generarReporteGroupGenericoPagosTarjetassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PagosTarjetas> pagostarjetassSeleccionados=new ArrayList<PagosTarjetas>();
		
		pagostarjetassSeleccionados=this.getPagosTarjetassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPagosTarjetas(pagostarjetassSeleccionados);
		
		this.generarReportePagosTarjetass("Todos",pagostarjetassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPagosTarjetas(ArrayList<PagosTarjetas> pagostarjetassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PagosTarjetas pagostarjetasAux:pagostarjetassSeleccionados) {
				pagostarjetasAux.setsDetalleGeneralEntityReporte(pagostarjetasAux.toString());
			
				if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					pagostarjetasAux.setsDescripcionGeneralEntityReporte1(pagostarjetasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					pagostarjetasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pagostarjetasAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE)) {
					existe=true;
					pagostarjetasAux.setsDescripcionGeneralEntityReporte1(pagostarjetasAux.getcodigo_asiento_contable());
				}
				 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_CODIGOTARJETACREDITO)) {
					existe=true;
					pagostarjetasAux.setsDescripcionGeneralEntityReporte1(pagostarjetasAux.getcodigo_tarjeta_credito());
				}
				 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_NOMBRETIPOINTERESTARJETA)) {
					existe=true;
					pagostarjetasAux.setsDescripcionGeneralEntityReporte1(pagostarjetasAux.getnombre_tipo_interes_tarjeta());
				}
				 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_NOMBRECONEXION)) {
					existe=true;
					pagostarjetasAux.setsDescripcionGeneralEntityReporte1(pagostarjetasAux.getnombre_conexion());
				}
				 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_NOMBREMES)) {
					existe=true;
					pagostarjetasAux.setsDescripcionGeneralEntityReporte1(pagostarjetasAux.getnombre_mes());
				}
				 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					pagostarjetasAux.setsDescripcionGeneralEntityReporte1(pagostarjetasAux.getnumero());
				}
				 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_LOTE)) {
					existe=true;
					pagostarjetasAux.setsDescripcionGeneralEntityReporte1(pagostarjetasAux.getlote());
				}
				 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_NUMERORETENCION)) {
					existe=true;
					pagostarjetasAux.setsDescripcionGeneralEntityReporte1(pagostarjetasAux.getnumero_retencion());
				}
				 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_NUMEROLIQUIDACION)) {
					existe=true;
					pagostarjetasAux.setsDescripcionGeneralEntityReporte1(pagostarjetasAux.getnumero_liquidacion());
				}
				 else if(sTipoSeleccionar.equals(PagosTarjetasConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					pagostarjetasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pagostarjetasAux.getfecha()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosTarjetasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPagosTarjetas(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPagosTarjetas=true;
				this.isVisibilidadCeldaNuevoRelacionesPagosTarjetas=true;
				this.isVisibilidadCeldaGuardarCambiosPagosTarjetas=true;
			}
			
			this.isVisibilidadCeldaModificarPagosTarjetas=false;
			this.isVisibilidadCeldaActualizarPagosTarjetas=false;
			this.isVisibilidadCeldaEliminarPagosTarjetas=false;
			this.isVisibilidadCeldaCancelarPagosTarjetas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosTarjetas=true;
				} else {
					this.isVisibilidadCeldaGuardarPagosTarjetas=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPagosTarjetas=false;
			this.isVisibilidadCeldaNuevoRelacionesPagosTarjetas=false;
			this.isVisibilidadCeldaGuardarCambiosPagosTarjetas=false;
			this.isVisibilidadCeldaModificarPagosTarjetas=false;
			this.isVisibilidadCeldaActualizarPagosTarjetas=true;
			this.isVisibilidadCeldaEliminarPagosTarjetas=false;
			this.isVisibilidadCeldaCancelarPagosTarjetas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosTarjetas=true;
				} else {
					this.isVisibilidadCeldaGuardarPagosTarjetas=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPagosTarjetas=false;
			this.isVisibilidadCeldaNuevoRelacionesPagosTarjetas=false;
			this.isVisibilidadCeldaGuardarCambiosPagosTarjetas=false;
			this.isVisibilidadCeldaModificarPagosTarjetas=false;
			this.isVisibilidadCeldaActualizarPagosTarjetas=true;
			this.isVisibilidadCeldaEliminarPagosTarjetas=true;
			this.isVisibilidadCeldaCancelarPagosTarjetas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosTarjetas=true;
				} else {
					this.isVisibilidadCeldaGuardarPagosTarjetas=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPagosTarjetas=false;
			this.isVisibilidadCeldaNuevoRelacionesPagosTarjetas=false;
			this.isVisibilidadCeldaGuardarCambiosPagosTarjetas=false;
			this.isVisibilidadCeldaModificarPagosTarjetas=false;
			this.isVisibilidadCeldaActualizarPagosTarjetas=true;
			this.isVisibilidadCeldaEliminarPagosTarjetas=false;
			this.isVisibilidadCeldaCancelarPagosTarjetas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosTarjetas=false;
				} else {
					this.isVisibilidadCeldaGuardarPagosTarjetas=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPagosTarjetas=true;
			this.isVisibilidadCeldaNuevoRelacionesPagosTarjetas=true;
			this.isVisibilidadCeldaGuardarCambiosPagosTarjetas=true;
			this.isVisibilidadCeldaModificarPagosTarjetas=false;
			this.isVisibilidadCeldaActualizarPagosTarjetas=false;
			this.isVisibilidadCeldaEliminarPagosTarjetas=false;
			this.isVisibilidadCeldaCancelarPagosTarjetas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosTarjetas=true;
				} else {
					this.isVisibilidadCeldaGuardarPagosTarjetas=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPagosTarjetas=false;
			this.isVisibilidadCeldaNuevoRelacionesPagosTarjetas=false;
			this.isVisibilidadCeldaGuardarCambiosPagosTarjetas=false;
			this.isVisibilidadCeldaActualizarPagosTarjetas=false;
			this.isVisibilidadCeldaEliminarPagosTarjetas=false;
			this.isVisibilidadCeldaCancelarPagosTarjetas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosTarjetas=false;
				} else {
					this.isVisibilidadCeldaGuardarPagosTarjetas=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPagosTarjetas=false;
			this.isVisibilidadCeldaNuevoRelacionesPagosTarjetas=false;
			this.isVisibilidadCeldaGuardarCambiosPagosTarjetas=false;
			this.isVisibilidadCeldaModificarPagosTarjetas=true;
			this.isVisibilidadCeldaActualizarPagosTarjetas=false;
			this.isVisibilidadCeldaEliminarPagosTarjetas=false;
			this.isVisibilidadCeldaCancelarPagosTarjetas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosTarjetas=false;
				} else {
					this.isVisibilidadCeldaGuardarPagosTarjetas=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PagosTarjetasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPagosTarjetas=true;
			this.isVisibilidadCeldaNuevoRelacionesPagosTarjetas=true;
			this.isVisibilidadCeldaGuardarCambiosPagosTarjetas=true;
		} else {
			this.actualizarEstadoPanelsPagosTarjetas(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPagosTarjetas=false;
			//this.isVisibilidadCeldaVerFormPagosTarjetas=false;
			this.isVisibilidadCeldaDuplicarPagosTarjetas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!pagostarjetasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPagosTarjetas=false;
		} else {
			this.isVisibilidadCeldaNuevoPagosTarjetas=false;
			this.isVisibilidadCeldaGuardarCambiosPagosTarjetas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(pagostarjetasSessionBean.getEsGuardarRelacionado()) {
			if(!pagostarjetasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPagosTarjetas=false;												
			}
			
			this.jButtonCerrarPagosTarjetas.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPagosTarjetas=false;
		}
		
		if(!this.permiteMantenimiento(this.pagostarjetas)) {
			this.isVisibilidadCeldaActualizarPagosTarjetas=false;
			this.isVisibilidadCeldaEliminarPagosTarjetas=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoPagosTarjetas=false;
		this.isVisibilidadCeldaNuevoRelacionesPagosTarjetas=false;
		this.isVisibilidadCeldaGuardarCambiosPagosTarjetas=false;
		//this.isVisibilidadCeldaModificarPagosTarjetas=true;
		this.isVisibilidadCeldaActualizarPagosTarjetas=false;
		this.isVisibilidadCeldaEliminarPagosTarjetas=false;
		//this.isVisibilidadCeldaCancelarPagosTarjetas=true;			
		this.isVisibilidadCeldaGuardarPagosTarjetas=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPagosTarjetas() {
	}
	
	public void actualizarEstadoPanelsPagosTarjetas(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPagosTarjetas!=null) {
				this.jScrollPanelDatosEdicionPagosTarjetas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosTarjetas!=null) {
				this.jTabbedPaneBusquedasPagosTarjetas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPagosTarjetas!=null) {
				this.jScrollPanelDatosPagosTarjetas.setVisible(true);
			}
			
			if(this.jPanelPaginacionPagosTarjetas!=null) {
				this.jPanelPaginacionPagosTarjetas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPagosTarjetas!=null) {
				this.jPanelParametrosReportesPagosTarjetas.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPagosTarjetas!=null) {
				this.jScrollPanelDatosEdicionPagosTarjetas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosTarjetas!=null) {
				this.jTabbedPaneBusquedasPagosTarjetas.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPagosTarjetas!=null) {
				this.jScrollPanelDatosPagosTarjetas.setVisible(false);
			}
			
			if(this.jPanelPaginacionPagosTarjetas!=null) {
				this.jPanelPaginacionPagosTarjetas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPagosTarjetas!=null) {
				this.jPanelParametrosReportesPagosTarjetas.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPagosTarjetas!=null) {
				this.jScrollPanelDatosEdicionPagosTarjetas.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosTarjetas!=null) {
				this.jTabbedPaneBusquedasPagosTarjetas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPagosTarjetas!=null) {
				this.jScrollPanelDatosPagosTarjetas.setVisible(false);
			}
			
			if(this.jPanelPaginacionPagosTarjetas!=null) {
				this.jPanelPaginacionPagosTarjetas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPagosTarjetas!=null) {
				this.jPanelParametrosReportesPagosTarjetas.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPagosTarjetas!=null) {
				this.jScrollPanelDatosEdicionPagosTarjetas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosTarjetas!=null) {
				this.jTabbedPaneBusquedasPagosTarjetas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPagosTarjetas!=null) {
				this.jScrollPanelDatosPagosTarjetas.setVisible(false);
			}
			
			if(this.jPanelPaginacionPagosTarjetas!=null) {
				this.jPanelPaginacionPagosTarjetas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPagosTarjetas!=null) {
				this.jPanelParametrosReportesPagosTarjetas.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPagosTarjetas!=null) {
				this.jScrollPanelDatosEdicionPagosTarjetas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosTarjetas!=null) {
				this.jTabbedPaneBusquedasPagosTarjetas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPagosTarjetas!=null) {
				this.jScrollPanelDatosPagosTarjetas.setVisible(true);
			}
			
			if(this.jPanelPaginacionPagosTarjetas!=null) {
				this.jPanelPaginacionPagosTarjetas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPagosTarjetas!=null) {
				this.jPanelParametrosReportesPagosTarjetas.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPagosTarjetas!=null) {
				this.jScrollPanelDatosEdicionPagosTarjetas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosTarjetas!=null) {
				this.jTabbedPaneBusquedasPagosTarjetas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPagosTarjetas!=null) {
				this.jScrollPanelDatosPagosTarjetas.setVisible(true);
			}
			
			if(this.jPanelPaginacionPagosTarjetas!=null) {
				this.jPanelPaginacionPagosTarjetas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPagosTarjetas!=null) {
				this.jPanelParametrosReportesPagosTarjetas.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPagosTarjetas!=null) {
				this.jScrollPanelDatosEdicionPagosTarjetas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosTarjetas!=null) {
				this.jTabbedPaneBusquedasPagosTarjetas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPagosTarjetas!=null) {
				this.jScrollPanelDatosPagosTarjetas.setVisible(true);
			}
			
			if(this.jPanelPaginacionPagosTarjetas!=null) {
				this.jPanelPaginacionPagosTarjetas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPagosTarjetas!=null) {
				this.jPanelParametrosReportesPagosTarjetas.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPagosTarjetas!=null) {
					this.jTabbedPaneBusquedasPagosTarjetas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPagosTarjetas!=null) {
				this.jPanelParametrosReportesPagosTarjetas.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosTarjetas!=null) {
				this.jTabbedPaneBusquedasPagosTarjetas.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPagosTarjetas!=null) {
				this.jPanelParametrosReportesPagosTarjetas.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPagosTarjetas=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPagosTarjetas) {this.jTabbedPaneBusquedasPagosTarjetas.remove(jPanelBusquedaPagosTarjetasPagosTarjetas);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPagosTarjetas(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPagosTarjetas() {
		this.updateBorderResaltarBusquedasFormularioPagosTarjetas();
		this.updateVisibilidadBusquedasFormularioPagosTarjetas();
		this.updateHabilitarBusquedasFormularioPagosTarjetas();
	}
	
	public void updateBorderResaltarBusquedasFormularioPagosTarjetas() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPagosTarjetas.getComponents().length>0) {
	

		if(this.pagostarjetasConstantesFunciones.resaltarBusquedaPagosTarjetasPagosTarjetas!=null) {
			index= this.jTabbedPaneBusquedasPagosTarjetas.indexOfComponent(this.jPanelBusquedaPagosTarjetasPagosTarjetas);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPagosTarjetas.getComponent(index);
				jPanel.setBorder(this.pagostarjetasConstantesFunciones.resaltarBusquedaPagosTarjetasPagosTarjetas);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPagosTarjetas() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPagosTarjetas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPagosTarjetas.indexOfComponent(this.jPanelBusquedaPagosTarjetasPagosTarjetas);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPagosTarjetas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.pagostarjetasConstantesFunciones.mostrarBusquedaPagosTarjetasPagosTarjetas);
			if(!this.pagostarjetasConstantesFunciones.mostrarBusquedaPagosTarjetasPagosTarjetas && index>-1) {
				this.jTabbedPaneBusquedasPagosTarjetas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPagosTarjetas() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPagosTarjetas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPagosTarjetas.indexOfComponent(this.jPanelBusquedaPagosTarjetasPagosTarjetas);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPagosTarjetas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.pagostarjetasConstantesFunciones.activarBusquedaPagosTarjetasPagosTarjetas);
				this.jTabbedPaneBusquedasPagosTarjetas.setEnabledAt(index,this.pagostarjetasConstantesFunciones.activarBusquedaPagosTarjetasPagosTarjetas);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPagosTarjetas(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPagosTarjetas")) {
			index= this.jTabbedPaneBusquedasPagosTarjetas.indexOfComponent(this.jPanelBusquedaPagosTarjetasPagosTarjetas);

			this.jTabbedPaneBusquedasPagosTarjetas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPagosTarjetas.getComponent(index);

			this.pagostarjetasConstantesFunciones.setResaltarBusquedaPagosTarjetasPagosTarjetas(resaltar);

			jPanel.setBorder(this.pagostarjetasConstantesFunciones.resaltarBusquedaPagosTarjetasPagosTarjetas);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPagosTarjetas.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPagosTarjetas() throws Exception {

		if(this.jInternalFrameDetalleFormPagosTarjetas==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPagosTarjetas();
		this.updateVisibilidadResaltarControlesFormularioPagosTarjetas();
		this.updateHabilitarResaltarControlesFormularioPagosTarjetas();
		
	}
	
	public void updateBorderResaltarControlesFormularioPagosTarjetas() throws Exception {
		if(this.jInternalFrameDetalleFormPagosTarjetas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.pagostarjetasConstantesFunciones.resaltaridPagosTarjetas!=null && this.jInternalFrameDetalleFormPagosTarjetas!=null) {this.jInternalFrameDetalleFormPagosTarjetas.jLabelidPagosTarjetas.setBorder(this.pagostarjetasConstantesFunciones.resaltaridPagosTarjetas);}
		if(this.pagostarjetasConstantesFunciones.resaltarid_empresaPagosTarjetas!=null && this.jInternalFrameDetalleFormPagosTarjetas!=null) {this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxid_empresaPagosTarjetas.setBorder(this.pagostarjetasConstantesFunciones.resaltarid_empresaPagosTarjetas);}
		if(this.pagostarjetasConstantesFunciones.resaltarfecha_hastaPagosTarjetas!=null && this.jInternalFrameDetalleFormPagosTarjetas!=null) {this.jInternalFrameDetalleFormPagosTarjetas.jDateChooserfecha_hastaPagosTarjetas.setBorder(this.pagostarjetasConstantesFunciones.resaltarfecha_hastaPagosTarjetas);}
		if(this.pagostarjetasConstantesFunciones.resaltarcodigo_asiento_contablePagosTarjetas!=null && this.jInternalFrameDetalleFormPagosTarjetas!=null) {this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldcodigo_asiento_contablePagosTarjetas.setBorder(this.pagostarjetasConstantesFunciones.resaltarcodigo_asiento_contablePagosTarjetas);}
		if(this.pagostarjetasConstantesFunciones.resaltarcodigo_tarjeta_creditoPagosTarjetas!=null && this.jInternalFrameDetalleFormPagosTarjetas!=null) {this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldcodigo_tarjeta_creditoPagosTarjetas.setBorder(this.pagostarjetasConstantesFunciones.resaltarcodigo_tarjeta_creditoPagosTarjetas);}
		if(this.pagostarjetasConstantesFunciones.resaltarnombre_tipo_interes_tarjetaPagosTarjetas!=null && this.jInternalFrameDetalleFormPagosTarjetas!=null) {this.jInternalFrameDetalleFormPagosTarjetas.jTextAreanombre_tipo_interes_tarjetaPagosTarjetas.setBorder(this.pagostarjetasConstantesFunciones.resaltarnombre_tipo_interes_tarjetaPagosTarjetas);}
		if(this.pagostarjetasConstantesFunciones.resaltarnombre_conexionPagosTarjetas!=null && this.jInternalFrameDetalleFormPagosTarjetas!=null) {this.jInternalFrameDetalleFormPagosTarjetas.jTextAreanombre_conexionPagosTarjetas.setBorder(this.pagostarjetasConstantesFunciones.resaltarnombre_conexionPagosTarjetas);}
		if(this.pagostarjetasConstantesFunciones.resaltarnombre_mesPagosTarjetas!=null && this.jInternalFrameDetalleFormPagosTarjetas!=null) {this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnombre_mesPagosTarjetas.setBorder(this.pagostarjetasConstantesFunciones.resaltarnombre_mesPagosTarjetas);}
		if(this.pagostarjetasConstantesFunciones.resaltarnumeroPagosTarjetas!=null && this.jInternalFrameDetalleFormPagosTarjetas!=null) {this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumeroPagosTarjetas.setBorder(this.pagostarjetasConstantesFunciones.resaltarnumeroPagosTarjetas);}
		if(this.pagostarjetasConstantesFunciones.resaltarlotePagosTarjetas!=null && this.jInternalFrameDetalleFormPagosTarjetas!=null) {this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldlotePagosTarjetas.setBorder(this.pagostarjetasConstantesFunciones.resaltarlotePagosTarjetas);}
		if(this.pagostarjetasConstantesFunciones.resaltarvalorPagosTarjetas!=null && this.jInternalFrameDetalleFormPagosTarjetas!=null) {this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalorPagosTarjetas.setBorder(this.pagostarjetasConstantesFunciones.resaltarvalorPagosTarjetas);}
		if(this.pagostarjetasConstantesFunciones.resaltarvalor_retencionPagosTarjetas!=null && this.jInternalFrameDetalleFormPagosTarjetas!=null) {this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_retencionPagosTarjetas.setBorder(this.pagostarjetasConstantesFunciones.resaltarvalor_retencionPagosTarjetas);}
		if(this.pagostarjetasConstantesFunciones.resaltarvalor_comisionPagosTarjetas!=null && this.jInternalFrameDetalleFormPagosTarjetas!=null) {this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_comisionPagosTarjetas.setBorder(this.pagostarjetasConstantesFunciones.resaltarvalor_comisionPagosTarjetas);}
		if(this.pagostarjetasConstantesFunciones.resaltarvalor_calculadoPagosTarjetas!=null && this.jInternalFrameDetalleFormPagosTarjetas!=null) {this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_calculadoPagosTarjetas.setBorder(this.pagostarjetasConstantesFunciones.resaltarvalor_calculadoPagosTarjetas);}
		if(this.pagostarjetasConstantesFunciones.resaltarvalor_canceladoPagosTarjetas!=null && this.jInternalFrameDetalleFormPagosTarjetas!=null) {this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_canceladoPagosTarjetas.setBorder(this.pagostarjetasConstantesFunciones.resaltarvalor_canceladoPagosTarjetas);}
		if(this.pagostarjetasConstantesFunciones.resaltarvalor_difierePagosTarjetas!=null && this.jInternalFrameDetalleFormPagosTarjetas!=null) {this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_difierePagosTarjetas.setBorder(this.pagostarjetasConstantesFunciones.resaltarvalor_difierePagosTarjetas);}
		if(this.pagostarjetasConstantesFunciones.resaltarnumero_retencionPagosTarjetas!=null && this.jInternalFrameDetalleFormPagosTarjetas!=null) {this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumero_retencionPagosTarjetas.setBorder(this.pagostarjetasConstantesFunciones.resaltarnumero_retencionPagosTarjetas);}
		if(this.pagostarjetasConstantesFunciones.resaltarnumero_liquidacionPagosTarjetas!=null && this.jInternalFrameDetalleFormPagosTarjetas!=null) {this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumero_liquidacionPagosTarjetas.setBorder(this.pagostarjetasConstantesFunciones.resaltarnumero_liquidacionPagosTarjetas);}
		if(this.pagostarjetasConstantesFunciones.resaltarfechaPagosTarjetas!=null && this.jInternalFrameDetalleFormPagosTarjetas!=null) {this.jInternalFrameDetalleFormPagosTarjetas.jDateChooserfechaPagosTarjetas.setBorder(this.pagostarjetasConstantesFunciones.resaltarfechaPagosTarjetas);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPagosTarjetas() throws Exception {		
		if(this.jInternalFrameDetalleFormPagosTarjetas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
	
		//this.jInternalFrameDetalleFormPagosTarjetas.jLabelidPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostraridPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jPanelidPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostraridPagosTarjetas);
		//this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxid_empresaPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarid_empresaPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jPanelid_empresaPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarid_empresaPagosTarjetas);
		//this.jInternalFrameDetalleFormPagosTarjetas.jDateChooserfecha_hastaPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarfecha_hastaPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jPanelfecha_hastaPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarfecha_hastaPagosTarjetas);
		//this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldcodigo_asiento_contablePagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarcodigo_asiento_contablePagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jPanelcodigo_asiento_contablePagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarcodigo_asiento_contablePagosTarjetas);
		//this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldcodigo_tarjeta_creditoPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarcodigo_tarjeta_creditoPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jPanelcodigo_tarjeta_creditoPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarcodigo_tarjeta_creditoPagosTarjetas);
		//this.jInternalFrameDetalleFormPagosTarjetas.jTextAreanombre_tipo_interes_tarjetaPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarnombre_tipo_interes_tarjetaPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jPanelnombre_tipo_interes_tarjetaPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarnombre_tipo_interes_tarjetaPagosTarjetas);
		//this.jInternalFrameDetalleFormPagosTarjetas.jTextAreanombre_conexionPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarnombre_conexionPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jPanelnombre_conexionPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarnombre_conexionPagosTarjetas);
		//this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnombre_mesPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarnombre_mesPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jPanelnombre_mesPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarnombre_mesPagosTarjetas);
		//this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumeroPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarnumeroPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jPanelnumeroPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarnumeroPagosTarjetas);
		//this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldlotePagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarlotePagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jPanellotePagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarlotePagosTarjetas);
		//this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalorPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarvalorPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jPanelvalorPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarvalorPagosTarjetas);
		//this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_retencionPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarvalor_retencionPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jPanelvalor_retencionPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarvalor_retencionPagosTarjetas);
		//this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_comisionPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarvalor_comisionPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jPanelvalor_comisionPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarvalor_comisionPagosTarjetas);
		//this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_calculadoPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarvalor_calculadoPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jPanelvalor_calculadoPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarvalor_calculadoPagosTarjetas);
		//this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_canceladoPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarvalor_canceladoPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jPanelvalor_canceladoPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarvalor_canceladoPagosTarjetas);
		//this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_difierePagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarvalor_difierePagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jPanelvalor_difierePagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarvalor_difierePagosTarjetas);
		//this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumero_retencionPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarnumero_retencionPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jPanelnumero_retencionPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarnumero_retencionPagosTarjetas);
		//this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumero_liquidacionPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarnumero_liquidacionPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jPanelnumero_liquidacionPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarnumero_liquidacionPagosTarjetas);
		//this.jInternalFrameDetalleFormPagosTarjetas.jDateChooserfechaPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarfechaPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jPanelfechaPagosTarjetas.setVisible(this.pagostarjetasConstantesFunciones.mostrarfechaPagosTarjetas);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPagosTarjetas() throws Exception {
		if(this.jInternalFrameDetalleFormPagosTarjetas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPagosTarjetas!=null) {
	
		this.jInternalFrameDetalleFormPagosTarjetas.jLabelidPagosTarjetas.setEnabled(this.pagostarjetasConstantesFunciones.activaridPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jComboBoxid_empresaPagosTarjetas.setEnabled(this.pagostarjetasConstantesFunciones.activarid_empresaPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jDateChooserfecha_hastaPagosTarjetas.setEnabled(this.pagostarjetasConstantesFunciones.activarfecha_hastaPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldcodigo_asiento_contablePagosTarjetas.setEnabled(this.pagostarjetasConstantesFunciones.activarcodigo_asiento_contablePagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldcodigo_tarjeta_creditoPagosTarjetas.setEnabled(this.pagostarjetasConstantesFunciones.activarcodigo_tarjeta_creditoPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextAreanombre_tipo_interes_tarjetaPagosTarjetas.setEnabled(this.pagostarjetasConstantesFunciones.activarnombre_tipo_interes_tarjetaPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextAreanombre_conexionPagosTarjetas.setEnabled(this.pagostarjetasConstantesFunciones.activarnombre_conexionPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnombre_mesPagosTarjetas.setEnabled(this.pagostarjetasConstantesFunciones.activarnombre_mesPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumeroPagosTarjetas.setEnabled(this.pagostarjetasConstantesFunciones.activarnumeroPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldlotePagosTarjetas.setEnabled(this.pagostarjetasConstantesFunciones.activarlotePagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalorPagosTarjetas.setEnabled(this.pagostarjetasConstantesFunciones.activarvalorPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_retencionPagosTarjetas.setEnabled(this.pagostarjetasConstantesFunciones.activarvalor_retencionPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_comisionPagosTarjetas.setEnabled(this.pagostarjetasConstantesFunciones.activarvalor_comisionPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_calculadoPagosTarjetas.setEnabled(this.pagostarjetasConstantesFunciones.activarvalor_calculadoPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_canceladoPagosTarjetas.setEnabled(this.pagostarjetasConstantesFunciones.activarvalor_canceladoPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldvalor_difierePagosTarjetas.setEnabled(this.pagostarjetasConstantesFunciones.activarvalor_difierePagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumero_retencionPagosTarjetas.setEnabled(this.pagostarjetasConstantesFunciones.activarnumero_retencionPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jTextFieldnumero_liquidacionPagosTarjetas.setEnabled(this.pagostarjetasConstantesFunciones.activarnumero_liquidacionPagosTarjetas);
		this.jInternalFrameDetalleFormPagosTarjetas.jDateChooserfechaPagosTarjetas.setEnabled(this.pagostarjetasConstantesFunciones.activarfechaPagosTarjetas);
		}
	}
	
		
}