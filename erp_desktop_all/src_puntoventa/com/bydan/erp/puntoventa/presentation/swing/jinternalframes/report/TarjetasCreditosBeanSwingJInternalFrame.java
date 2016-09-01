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

//import com.bydan.erp.puntoventa.util.TarjetasCreditosConstantesFunciones;
import com.bydan.erp.puntoventa.util.report.TarjetasCreditosParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.report.TarjetasCreditosParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.report.TarjetasCreditosBean;
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
import com.bydan.erp.puntoventa.business.logic.*;

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
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TarjetasCreditosBeanSwingJInternalFrame extends TarjetasCreditosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TarjetasCreditosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TarjetasCreditos> tarjetascreditosValidator = new ClassValidator<TarjetasCreditos>(TarjetasCreditos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TarjetasCreditos tarjetascreditos;	
	public TarjetasCreditos tarjetascreditosAux;
	public TarjetasCreditos tarjetascreditosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TarjetasCreditos tarjetascreditosTotales;
	public Long idTarjetasCreditosActual;
	public Long iIdNuevoTarjetasCreditos=0L;
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

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboTarjetaCredito="";

	public List<TarjetaCredito> tarjetacreditosForeignKey;

	public List<TarjetaCredito> gettarjetacreditosForeignKey() {
		return tarjetacreditosForeignKey;
	}

	public void settarjetacreditosForeignKey(List<TarjetaCredito> tarjetacreditosForeignKey) {
		this.tarjetacreditosForeignKey = tarjetacreditosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TarjetaCredito tarjetacreditoForeignKey;

	public TarjetaCredito gettarjetacreditoForeignKey() {
		return tarjetacreditoForeignKey;
	}

	public void settarjetacreditoForeignKey(TarjetaCredito tarjetacreditoForeignKey) {
		this.tarjetacreditoForeignKey = tarjetacreditoForeignKey;
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
	
	public Boolean isPermisoTodoTarjetasCreditos;
	public Boolean isPermisoNuevoTarjetasCreditos;
	public Boolean isPermisoActualizarTarjetasCreditos;
	public Boolean isPermisoActualizarOriginalTarjetasCreditos;
	public Boolean isPermisoEliminarTarjetasCreditos;
	public Boolean isPermisoGuardarCambiosTarjetasCreditos;
	public Boolean isPermisoConsultaTarjetasCreditos;
	public Boolean isPermisoBusquedaTarjetasCreditos;
	public Boolean isPermisoReporteTarjetasCreditos;
	public Boolean isPermisoPaginacionMedioTarjetasCreditos;
	public Boolean isPermisoPaginacionAltoTarjetasCreditos;
	public Boolean isPermisoPaginacionTodoTarjetasCreditos;
	public Boolean isPermisoCopiarTarjetasCreditos;
	public Boolean isPermisoVerFormTarjetasCreditos;
	public Boolean isPermisoDuplicarTarjetasCreditos;
	public Boolean isPermisoOrdenTarjetasCreditos;
	
	
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
	
	public TarjetasCreditosParameterReturnGeneral tarjetascreditosReturnGeneral;
	public TarjetasCreditosParameterReturnGeneral tarjetascreditosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTarjetasCreditos=false;
	public Boolean esParaAccionDesdeFormularioTarjetasCreditos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TarjetasCreditosSessionBeanAdditional tarjetascreditosSessionBeanAdditional=null;
	
	public TarjetasCreditosSessionBeanAdditional getTarjetasCreditosSessionBeanAdditional() {
		return this.tarjetascreditosSessionBeanAdditional;
	}
	
	public void setTarjetasCreditosSessionBeanAdditional(TarjetasCreditosSessionBeanAdditional tarjetascreditosSessionBeanAdditional) {
		try {
			this.tarjetascreditosSessionBeanAdditional=tarjetascreditosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TarjetasCreditosBeanSwingJInternalFrameAdditional tarjetascreditosBeanSwingJInternalFrameAdditional=null;
	//public class TarjetasCreditosBeanSwingJInternalFrame
	
	public TarjetasCreditosBeanSwingJInternalFrameAdditional getTarjetasCreditosBeanSwingJInternalFrameAdditional() {
		return this.tarjetascreditosBeanSwingJInternalFrameAdditional;
	}
	
	public void setTarjetasCreditosBeanSwingJInternalFrameAdditional(TarjetasCreditosBeanSwingJInternalFrameAdditional tarjetascreditosBeanSwingJInternalFrameAdditional) {
		try {
			this.tarjetascreditosBeanSwingJInternalFrameAdditional=tarjetascreditosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TarjetasCreditosLogic tarjetascreditosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TarjetasCreditos tarjetascreditosBean;
	public TarjetasCreditosConstantesFunciones tarjetascreditosConstantesFunciones;
	//public TarjetasCreditosParameterReturnGeneral tarjetascreditosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public TarjetaCreditoLogic tarjetacreditoLogic;
	
	//PARAMETROS
	
	
	//public List<TarjetasCreditos> tarjetascreditoss;	
	//public List<TarjetasCreditos> tarjetascreditossEliminados;
	//public List<TarjetasCreditos> tarjetascreditossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTarjetasCreditos=false;
	public Boolean isVisibilidadCeldaDuplicarTarjetasCreditos=true;
	public Boolean isVisibilidadCeldaCopiarTarjetasCreditos=true;
	public Boolean isVisibilidadCeldaVerFormTarjetasCreditos=true;
	public Boolean isVisibilidadCeldaOrdenTarjetasCreditos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTarjetasCreditos=false;
	public Boolean isVisibilidadCeldaModificarTarjetasCreditos=false;
	public Boolean isVisibilidadCeldaActualizarTarjetasCreditos=false;
	public Boolean isVisibilidadCeldaEliminarTarjetasCreditos=false;
	public Boolean isVisibilidadCeldaCancelarTarjetasCreditos=false;
	public Boolean isVisibilidadCeldaGuardarTarjetasCreditos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTarjetasCreditos=false;	
	
	
	public Boolean isVisibilidadBusquedaTarjetaCredito=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTarjetaCredito=false;
	
	public Long getiIdNuevoTarjetasCreditos() {
		return this.iIdNuevoTarjetasCreditos;
	}

	public void setiIdNuevoTarjetasCreditos(Long iIdNuevoTarjetasCreditos) {
		this.iIdNuevoTarjetasCreditos = iIdNuevoTarjetasCreditos;
	}
	
	public Long getidTarjetasCreditosActual() {
		return this.idTarjetasCreditosActual;
	}

	public void setidTarjetasCreditosActual(Long idTarjetasCreditosActual) {
		this.idTarjetasCreditosActual = idTarjetasCreditosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TarjetasCreditos gettarjetascreditos() {
		return this.tarjetascreditos;
	}

	public void settarjetascreditos(TarjetasCreditos tarjetascreditos) {
		this.tarjetascreditos = tarjetascreditos;
	}
	
	public TarjetasCreditos gettarjetascreditosAux() {
		return this.tarjetascreditosAux;
	}

	public void settarjetascreditosAux(TarjetasCreditos tarjetascreditosAux) {
		this.tarjetascreditosAux = tarjetascreditosAux;
	}				
	
	public TarjetasCreditos gettarjetascreditosAnterior() {
		return this.tarjetascreditosAnterior;
	}

	public void settarjetascreditosAnterior(TarjetasCreditos tarjetascreditosAnterior) {
		this.tarjetascreditosAnterior = tarjetascreditosAnterior;
	}	
	
	public TarjetasCreditos gettarjetascreditosTotales() {
		return this.tarjetascreditosTotales;
	}

	public void settarjetascreditosTotales(TarjetasCreditos tarjetascreditosTotales) {
		this.tarjetascreditosTotales = tarjetascreditosTotales;
	}	
	
	public TarjetasCreditos gettarjetascreditosBean() {
		return this.tarjetascreditosBean;
	}

	public void settarjetascreditosBean(TarjetasCreditos tarjetascreditosBean) {
		this.tarjetascreditosBean = tarjetascreditosBean;
	}	
	
	public TarjetasCreditosParameterReturnGeneral gettarjetascreditosReturnGeneral() {
		return this.tarjetascreditosReturnGeneral;
	}

	public void settarjetascreditosReturnGeneral(TarjetasCreditosParameterReturnGeneral tarjetascreditosReturnGeneral) {
		this.tarjetascreditosReturnGeneral = tarjetascreditosReturnGeneral;
	}	
	
	
	public Date fecha_inicioBusquedaTarjetaCredito=new Date();

	public Date getfecha_inicioBusquedaTarjetaCredito() {
		return this.fecha_inicioBusquedaTarjetaCredito;
	}

	public void setfecha_inicioBusquedaTarjetaCredito(Date fecha_inicioBusquedaTarjetaCredito) {
		this.fecha_inicioBusquedaTarjetaCredito = fecha_inicioBusquedaTarjetaCredito;
	}

;
	public Date fecha_finBusquedaTarjetaCredito=new Date();

	public Date getfecha_finBusquedaTarjetaCredito() {
		return this.fecha_finBusquedaTarjetaCredito;
	}

	public void setfecha_finBusquedaTarjetaCredito(Date fecha_finBusquedaTarjetaCredito) {
		this.fecha_finBusquedaTarjetaCredito = fecha_finBusquedaTarjetaCredito;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tarjeta_creditoFK_IdTarjetaCredito=-1L;

	public Long getid_tarjeta_creditoFK_IdTarjetaCredito() {
		return this.id_tarjeta_creditoFK_IdTarjetaCredito;
	}

	public void setid_tarjeta_creditoFK_IdTarjetaCredito(Long id_tarjeta_creditoFK_IdTarjetaCredito) {
		this.id_tarjeta_creditoFK_IdTarjetaCredito = id_tarjeta_creditoFK_IdTarjetaCredito;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TarjetasCreditosLogic getTarjetasCreditosLogic()	{		
		return tarjetascreditosLogic;
	}

	public void setTarjetasCreditosLogic(TarjetasCreditosLogic tarjetascreditosLogic) {
		this.tarjetascreditosLogic = tarjetascreditosLogic;
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
	
	public Boolean getIsEsNuevoTarjetasCreditos() {
		return isEsNuevoTarjetasCreditos;
	}

	public void setIsEsNuevoTarjetasCreditos(Boolean isEsNuevoTarjetasCreditos) {
		this.isEsNuevoTarjetasCreditos = isEsNuevoTarjetasCreditos;
	}

	public Boolean getEsParaAccionDesdeFormularioTarjetasCreditos() {
		return esParaAccionDesdeFormularioTarjetasCreditos;
	}
	
	public void setEsParaAccionDesdeFormularioTarjetasCreditos(Boolean esParaAccionDesdeFormularioTarjetasCreditos) {
		this.esParaAccionDesdeFormularioTarjetasCreditos = esParaAccionDesdeFormularioTarjetasCreditos;
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

			if(this.tarjetascreditosSessionBean==null) {
				this.tarjetascreditosSessionBean=new TarjetasCreditosSessionBean();
			}

			if(!this.tarjetascreditosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tarjetascreditosSessionBean.getlidEmpresaActual());
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

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.tarjetascreditosSessionBean==null) {
				this.tarjetascreditosSessionBean=new TarjetasCreditosSessionBean();
			}

			if(!this.tarjetascreditosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(tarjetascreditosSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
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

	public void cargarCombosTarjetaCreditosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tarjetacreditosForeignKey=new ArrayList<TarjetaCredito>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TarjetaCreditoLogic tarjetacreditoLogic=new TarjetaCreditoLogic();

			//tarjetacreditoLogic.getTarjetaCreditoDataAccess().setIsForForeingKeyData(true);

			if(this.tarjetascreditosSessionBean==null) {
				this.tarjetascreditosSessionBean=new TarjetasCreditosSessionBean();
			}

			if(!this.tarjetascreditosSessionBean.getisBusquedaDesdeForeignKeySesionTarjetaCredito()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tarjetacreditoLogic.getTarjetaCreditoDataAccess().setIsForForeingKeyData(true);

					tarjetacreditoLogic.getTodosTarjetaCreditosWithConnection(sFinalQuery,new Pagination());

					this.tarjetacreditosForeignKey=tarjetacreditoLogic.getTarjetaCreditos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTarjetaCredito(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tarjetacreditoLogic.getEntityWithConnection(tarjetascreditosSessionBean.getlidTarjetaCreditoActual());
					this.tarjetacreditosForeignKey.add(tarjetacreditoLogic.getTarjetaCredito());
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

					if(this.tarjetascreditos!=null) {
						this.tarjetascreditos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
						this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_empresaTarjetasCreditos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTarjetasCreditos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
						if(this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_empresaTarjetasCreditos.getItemCount()>0) {
							this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_empresaTarjetasCreditos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTarjetasCreditosGenerico)throws Exception
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
				jComboBoxid_empresaTarjetasCreditosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTarjetasCreditosGenerico!=null && jComboBoxid_empresaTarjetasCreditosGenerico.getItemCount()>0) {
					jComboBoxid_empresaTarjetasCreditosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.tarjetascreditos!=null) {
						this.tarjetascreditos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
						this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_sucursalTarjetasCreditos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalTarjetasCreditos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
						if(this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_sucursalTarjetasCreditos.getItemCount()>0) {
							this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_sucursalTarjetasCreditos.setSelectedIndex(0);
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

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalTarjetasCreditosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalTarjetasCreditosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalTarjetasCreditosGenerico!=null && jComboBoxid_sucursalTarjetasCreditosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalTarjetasCreditosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTarjetaCreditoForeignKey(Long idTarjetaCreditoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TarjetaCredito  tarjetacreditoTemp=null;

			for(TarjetaCredito tarjetacreditoAux:tarjetacreditosForeignKey) {
				if(tarjetacreditoAux.getId()!=null && tarjetacreditoAux.getId().equals(idTarjetaCreditoSeleccionado)) {
					tarjetacreditoTemp=tarjetacreditoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tarjetacreditoTemp!=null) {

					if(this.tarjetascreditos!=null) {
						this.tarjetascreditos.setTarjetaCredito(tarjetacreditoTemp);
					}

					if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
						this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_tarjeta_creditoTarjetasCreditos.setSelectedItem(tarjetacreditoTemp);
					}
				} else {
					//jComboBoxid_tarjeta_creditoTarjetasCreditos.setSelectedItem(tarjetacreditoTemp);
					if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
						if(this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_tarjeta_creditoTarjetasCreditos.getItemCount()>0) {
							this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_tarjeta_creditoTarjetasCreditos.setSelectedIndex(0);
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

	public String getActualTarjetaCreditoForeignKeyDescripcion(Long idTarjetaCreditoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TarjetaCredito  tarjetacreditoTemp=null;

			for(TarjetaCredito tarjetacreditoAux:tarjetacreditosForeignKey) {
				if(tarjetacreditoAux.getId()!=null && tarjetacreditoAux.getId().equals(idTarjetaCreditoSeleccionado)) {
					tarjetacreditoTemp=tarjetacreditoAux;
					break;
				}
			}


			sDescripcion=TarjetaCreditoConstantesFunciones.getTarjetaCreditoDescripcion(tarjetacreditoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTarjetaCreditoForeignKeyGenerico(Long idTarjetaCreditoSeleccionado,JComboBox jComboBoxid_tarjeta_creditoTarjetasCreditosGenerico)throws Exception
	{
		try
		{
			TarjetaCredito  tarjetacreditoTemp=null;

			for(TarjetaCredito tarjetacreditoAux:tarjetacreditosForeignKey) {
				if(tarjetacreditoAux.getId()!=null && tarjetacreditoAux.getId().equals(idTarjetaCreditoSeleccionado)) {
					tarjetacreditoTemp=tarjetacreditoAux;
					break;
				}
			}

			if(tarjetacreditoTemp!=null) {
				jComboBoxid_tarjeta_creditoTarjetasCreditosGenerico.setSelectedItem(tarjetacreditoTemp);
			} else {
				if(jComboBoxid_tarjeta_creditoTarjetasCreditosGenerico!=null && jComboBoxid_tarjeta_creditoTarjetasCreditosGenerico.getItemCount()>0) {
					jComboBoxid_tarjeta_creditoTarjetasCreditosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TarjetasCreditos tarjetascreditos,JComboBox jComboBoxid_empresaTarjetasCreditosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTarjetasCreditosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_empresaTarjetasCreditos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTarjetasCreditosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tarjetascreditos.setid_empresa(empresaAux.getId());
				tarjetascreditos.setempresa_descripcion(TarjetasCreditosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tarjetascreditos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(TarjetasCreditos tarjetascreditos,JComboBox jComboBoxid_sucursalTarjetasCreditosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalTarjetasCreditosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_sucursalTarjetasCreditos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalTarjetasCreditosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				tarjetascreditos.setid_sucursal(sucursalAux.getId());
				tarjetascreditos.setsucursal_descripcion(TarjetasCreditosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				tarjetascreditos.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTarjetaCreditoForeignKey(TarjetasCreditos tarjetascreditos,JComboBox jComboBoxid_tarjeta_creditoTarjetasCreditosGenerico)throws Exception
	{
		try
		{
			TarjetaCredito  tarjetacreditoAux=new TarjetaCredito();

			if(jComboBoxid_tarjeta_creditoTarjetasCreditosGenerico==null) {
				tarjetacreditoAux=(TarjetaCredito)this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_tarjeta_creditoTarjetasCreditos.getSelectedItem();
			} else {
				tarjetacreditoAux=(TarjetaCredito)jComboBoxid_tarjeta_creditoTarjetasCreditosGenerico.getSelectedItem();
			}

			if(tarjetacreditoAux!=null && tarjetacreditoAux.getId()!=null) {
				tarjetascreditos.setid_tarjeta_credito(tarjetacreditoAux.getId());
				tarjetascreditos.settarjetacredito_descripcion(TarjetasCreditosConstantesFunciones.getTarjetaCreditoDescripcion(tarjetacreditoAux));
				tarjetascreditos.setTarjetaCredito(tarjetacreditoAux);			}
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

					if(!TarjetasCreditosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { 
							this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_empresaTarjetasCreditos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_empresaTarjetasCreditos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { 
					}

					if(!TarjetasCreditosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TarjetasCreditosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { 
							this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_sucursalTarjetasCreditos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_sucursalTarjetasCreditos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { 
					}

					if(!TarjetasCreditosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTarjetaCreditosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTarjetaCredito=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TarjetasCreditosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { 
							this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_tarjeta_creditoTarjetasCreditos.removeAllItems();

							for(TarjetaCredito tarjetacredito:this.tarjetacreditosForeignKey) {
								this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_tarjeta_creditoTarjetasCreditos.addItem(tarjetacredito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { 
					}

					if(!TarjetasCreditosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
							this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_empresaTarjetasCreditos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
							this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_empresaTarjetasCreditos.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
							this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_sucursalTarjetasCreditos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
							this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_sucursalTarjetasCreditos.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTarjetaCreditoForeignKey(TarjetaCredito tarjetacredito,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
							this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_tarjeta_creditoTarjetasCreditos.setSelectedItem(tarjetacredito);
						}
					} else {
						if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
							this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_tarjeta_creditoTarjetasCreditos.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTarjetasCreditos() throws Exception {
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
		
	public TarjetasCreditosParameterReturnGeneral getTarjetasCreditosParameterGeneral() {
		return this.tarjetascreditosParameterGeneral;
	}
	
	public void setTarjetasCreditosParameterGeneral(TarjetasCreditosParameterReturnGeneral tarjetascreditosParameterGeneral) {
		this.tarjetascreditosParameterGeneral = tarjetascreditosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTarjetasCreditos() {
		return isPermisoTodoTarjetasCreditos;
	}

	public void setIsPermisoTodoTarjetasCreditos(Boolean isPermisoTodoTarjetasCreditos) {
		this.isPermisoTodoTarjetasCreditos = isPermisoTodoTarjetasCreditos;
	}

	public Boolean getIsPermisoNuevoTarjetasCreditos() {
		return isPermisoNuevoTarjetasCreditos;
	}

	public void setIsPermisoNuevoTarjetasCreditos(Boolean isPermisoNuevoTarjetasCreditos) {
		this.isPermisoNuevoTarjetasCreditos = isPermisoNuevoTarjetasCreditos;
	}

	public Boolean getIsPermisoActualizarTarjetasCreditos() {
		return isPermisoActualizarTarjetasCreditos;
	}

	public void setIsPermisoActualizarTarjetasCreditos(Boolean isPermisoActualizarTarjetasCreditos) {
		this.isPermisoActualizarTarjetasCreditos = isPermisoActualizarTarjetasCreditos;
	}

	public Boolean getIsPermisoEliminarTarjetasCreditos() {
		return isPermisoEliminarTarjetasCreditos;
	}

	public void setIsPermisoEliminarTarjetasCreditos(Boolean isPermisoEliminarTarjetasCreditos) {
		this.isPermisoEliminarTarjetasCreditos = isPermisoEliminarTarjetasCreditos;
	}

	public Boolean getIsPermisoGuardarCambiosTarjetasCreditos() {
		return isPermisoGuardarCambiosTarjetasCreditos;
	}

	public void setIsPermisoGuardarCambiosTarjetasCreditos(Boolean isPermisoGuardarCambiosTarjetasCreditos) {
		this.isPermisoGuardarCambiosTarjetasCreditos = isPermisoGuardarCambiosTarjetasCreditos;
	}
	
	public Boolean getIsPermisoConsultaTarjetasCreditos() {
		return isPermisoConsultaTarjetasCreditos;
	}

	public void setIsPermisoConsultaTarjetasCreditos(Boolean isPermisoConsultaTarjetasCreditos) {
		this.isPermisoConsultaTarjetasCreditos = isPermisoConsultaTarjetasCreditos;
	}

	public Boolean getIsPermisoBusquedaTarjetasCreditos() {
		return isPermisoBusquedaTarjetasCreditos;
	}

	public void setIsPermisoBusquedaTarjetasCreditos(Boolean isPermisoBusquedaTarjetasCreditos) {
		this.isPermisoBusquedaTarjetasCreditos = isPermisoBusquedaTarjetasCreditos;
	}

	public Boolean getIsPermisoReporteTarjetasCreditos() {
		return isPermisoReporteTarjetasCreditos;
	}

	public void setIsPermisoReporteTarjetasCreditos(Boolean isPermisoReporteTarjetasCreditos) {
		this.isPermisoReporteTarjetasCreditos = isPermisoReporteTarjetasCreditos;
	}
	
	public Boolean getIsPermisoPaginacionMedioTarjetasCreditos() {
		return isPermisoPaginacionMedioTarjetasCreditos;
	}

	public void setIsPermisoPaginacionMedioTarjetasCreditos(Boolean isPermisoPaginacionMedioTarjetasCreditos) {
		this.isPermisoPaginacionMedioTarjetasCreditos = isPermisoPaginacionMedioTarjetasCreditos;
	}
	
	public Boolean getIsPermisoPaginacionTodoTarjetasCreditos() {
		return isPermisoPaginacionTodoTarjetasCreditos;
	}

	public void setIsPermisoPaginacionTodoTarjetasCreditos(Boolean isPermisoPaginacionTodoTarjetasCreditos) {
		this.isPermisoPaginacionTodoTarjetasCreditos = isPermisoPaginacionTodoTarjetasCreditos;
	}
	
	public Boolean getIsPermisoPaginacionAltoTarjetasCreditos() {
		return isPermisoPaginacionAltoTarjetasCreditos;
	}

	public void setIsPermisoPaginacionAltoTarjetasCreditos(Boolean isPermisoPaginacionAltoTarjetasCreditos) {
		this.isPermisoPaginacionAltoTarjetasCreditos = isPermisoPaginacionAltoTarjetasCreditos;
	}
	
	public Boolean getIsPermisoCopiarTarjetasCreditos() {
		return isPermisoCopiarTarjetasCreditos;
	}

	public void setIsPermisoCopiarTarjetasCreditos(Boolean isPermisoCopiarTarjetasCreditos) {
		this.isPermisoCopiarTarjetasCreditos = isPermisoCopiarTarjetasCreditos;
	}
	
	public Boolean getIsPermisoVerFormTarjetasCreditos() {
		return isPermisoVerFormTarjetasCreditos;
	}

	public void setIsPermisoVerFormTarjetasCreditos(Boolean isPermisoVerFormTarjetasCreditos) {
		this.isPermisoVerFormTarjetasCreditos = isPermisoVerFormTarjetasCreditos;
	}
	
	public Boolean getIsPermisoDuplicarTarjetasCreditos() {
		return isPermisoDuplicarTarjetasCreditos;
	}

	public void setIsPermisoDuplicarTarjetasCreditos(Boolean isPermisoDuplicarTarjetasCreditos) {
		this.isPermisoDuplicarTarjetasCreditos = isPermisoDuplicarTarjetasCreditos;
	}
	
	public Boolean getIsPermisoOrdenTarjetasCreditos() {
		return isPermisoOrdenTarjetasCreditos;
	}

	public void setIsPermisoOrdenTarjetasCreditos(Boolean isPermisoOrdenTarjetasCreditos) {
		this.isPermisoOrdenTarjetasCreditos = isPermisoOrdenTarjetasCreditos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTarjetasCreditos() {
		return isVisibilidadCeldaNuevoTarjetasCreditos;
	}

	public void setIsVisibilidadCeldaNuevoTarjetasCreditos(Boolean isVisibilidadCeldaNuevoTarjetasCreditos) {
		this.isVisibilidadCeldaNuevoTarjetasCreditos = isVisibilidadCeldaNuevoTarjetasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTarjetasCreditos() {
		return isVisibilidadCeldaDuplicarTarjetasCreditos;
	}

	public void setIsVisibilidadCeldaDuplicarTarjetasCreditos(Boolean isVisibilidadCeldaDuplicarTarjetasCreditos) {
		this.isVisibilidadCeldaDuplicarTarjetasCreditos = isVisibilidadCeldaDuplicarTarjetasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTarjetasCreditos() {
		return isVisibilidadCeldaCopiarTarjetasCreditos;
	}

	public void setIsVisibilidadCeldaCopiarTarjetasCreditos(Boolean isVisibilidadCeldaCopiarTarjetasCreditos) {
		this.isVisibilidadCeldaCopiarTarjetasCreditos = isVisibilidadCeldaCopiarTarjetasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTarjetasCreditos() {
		return isVisibilidadCeldaVerFormTarjetasCreditos;
	}

	public void setIsVisibilidadCeldaVerFormTarjetasCreditos(Boolean isVisibilidadCeldaVerFormTarjetasCreditos) {
		this.isVisibilidadCeldaVerFormTarjetasCreditos = isVisibilidadCeldaVerFormTarjetasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTarjetasCreditos() {
		return isVisibilidadCeldaOrdenTarjetasCreditos;
	}

	public void setIsVisibilidadCeldaOrdenTarjetasCreditos(Boolean isVisibilidadCeldaOrdenTarjetasCreditos) {
		this.isVisibilidadCeldaOrdenTarjetasCreditos = isVisibilidadCeldaOrdenTarjetasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTarjetasCreditos() {
		return isVisibilidadCeldaNuevoRelacionesTarjetasCreditos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTarjetasCreditos(Boolean isVisibilidadCeldaNuevoRelacionesTarjetasCreditos) {
		this.isVisibilidadCeldaNuevoRelacionesTarjetasCreditos = isVisibilidadCeldaNuevoRelacionesTarjetasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTarjetasCreditos() {
		return isVisibilidadCeldaModificarTarjetasCreditos;
	}

	public void setIsVisibilidadCeldaModificarTarjetasCreditos(Boolean isVisibilidadCeldaModificarTarjetasCreditos) {
		this.isVisibilidadCeldaModificarTarjetasCreditos = isVisibilidadCeldaModificarTarjetasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTarjetasCreditos() {
		return isVisibilidadCeldaActualizarTarjetasCreditos;
	}

	public void setIsVisibilidadCeldaActualizarTarjetasCreditos(Boolean isVisibilidadCeldaActualizarTarjetasCreditos) {
		this.isVisibilidadCeldaActualizarTarjetasCreditos = isVisibilidadCeldaActualizarTarjetasCreditos;
	}

	public Boolean getIsVisibilidadCeldaEliminarTarjetasCreditos() {
		return isVisibilidadCeldaEliminarTarjetasCreditos;
	}

	public void setIsVisibilidadCeldaEliminarTarjetasCreditos(Boolean isVisibilidadCeldaEliminarTarjetasCreditos) {
		this.isVisibilidadCeldaEliminarTarjetasCreditos = isVisibilidadCeldaEliminarTarjetasCreditos;
	}

	public Boolean getIsVisibilidadCeldaCancelarTarjetasCreditos() {
		return isVisibilidadCeldaCancelarTarjetasCreditos;
	}

	public void setIsVisibilidadCeldaCancelarTarjetasCreditos(Boolean isVisibilidadCeldaCancelarTarjetasCreditos) {
		this.isVisibilidadCeldaCancelarTarjetasCreditos = isVisibilidadCeldaCancelarTarjetasCreditos;
	}

	public Boolean getIsVisibilidadCeldaGuardarTarjetasCreditos() {
		return isVisibilidadCeldaGuardarTarjetasCreditos;
	}

	public void setIsVisibilidadCeldaGuardarTarjetasCreditos(Boolean isVisibilidadCeldaGuardarTarjetasCreditos) {
		this.isVisibilidadCeldaGuardarTarjetasCreditos = isVisibilidadCeldaGuardarTarjetasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTarjetasCreditos() {
		return isVisibilidadCeldaGuardarCambiosTarjetasCreditos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTarjetasCreditos(Boolean isVisibilidadCeldaGuardarCambiosTarjetasCreditos) {
		this.isVisibilidadCeldaGuardarCambiosTarjetasCreditos = isVisibilidadCeldaGuardarCambiosTarjetasCreditos;
	}
		
	public TarjetasCreditosSessionBean gettarjetascreditosSessionBean() {
		return this.tarjetascreditosSessionBean;
	}
	
	public void settarjetascreditosSessionBean(TarjetasCreditosSessionBean tarjetascreditosSessionBean) {
		this.tarjetascreditosSessionBean=tarjetascreditosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaTarjetaCredito() {
		return this.isVisibilidadBusquedaTarjetaCredito;
	}

	public void setisVisibilidadBusquedaTarjetaCredito(Boolean isVisibilidadBusquedaTarjetaCredito) {
		this.isVisibilidadBusquedaTarjetaCredito=isVisibilidadBusquedaTarjetaCredito;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTarjetaCredito() {
		return this.isVisibilidadFK_IdTarjetaCredito;
	}

	public void setisVisibilidadFK_IdTarjetaCredito(Boolean isVisibilidadFK_IdTarjetaCredito) {
		this.isVisibilidadFK_IdTarjetaCredito=isVisibilidadFK_IdTarjetaCredito;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(TarjetasCreditos tarjetascreditos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tarjetascreditos,null);
				this.setActualParaGuardarSucursalForeignKey(tarjetascreditos,null);
				this.setActualParaGuardarTarjetaCreditoForeignKey(tarjetascreditos,null);
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
	
	public void bugActualizarReferenciaActual(TarjetasCreditos tarjetascreditos,TarjetasCreditos tarjetascreditosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTarjetasCreditos(tarjetascreditos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tarjetascreditosAux.setId(tarjetascreditos.getId());
		tarjetascreditosAux.setVersionRow(tarjetascreditos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(TarjetasCreditos tarjetascreditosLocal) throws Exception {
		
		if(this.tarjetascreditosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TarjetasCreditos tarjetascreditosLocal) throws Exception {	
		if(this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tarjetascreditosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				tarjetascreditosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TarjetaCreditoDetalleFormJInternalFrame.class)) {
				TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrameLocal=(TarjetaCreditoBeanSwingJInternalFrame) ((TarjetaCreditoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tarjetacreditoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTarjetaCredito(tarjetacreditoBeanSwingJInternalFrameLocal.gettarjetacredito(),true);
				tarjetacreditoBeanSwingJInternalFrameLocal.actualizarLista(tarjetacreditoBeanSwingJInternalFrameLocal.tarjetacredito,this.tarjetacreditosForeignKey);

				tarjetacreditoBeanSwingJInternalFrameLocal.actualizarRelaciones(tarjetacreditoBeanSwingJInternalFrameLocal.tarjetacredito);

				tarjetascreditosLocal.setTarjetaCredito(tarjetacreditoBeanSwingJInternalFrameLocal.tarjetacredito);

				this.addItemDefectoCombosForeignKeyTarjetaCredito();
				this.cargarCombosFrameTarjetaCreditosForeignKey("Formulario");
				this.setActualTarjetaCreditoForeignKey(tarjetacreditoBeanSwingJInternalFrameLocal.tarjetacredito.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTarjetasCreditosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tarjetascreditosValidator.getInvalidValues(this.tarjetascreditos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TarjetasCreditos tarjetascreditos,List<TarjetasCreditos> tarjetascreditoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(TarjetasCreditos tarjetascreditos,List<TarjetasCreditos> tarjetascreditoss) throws Exception {
		try	{			
			TarjetasCreditosConstantesFunciones.actualizarSelectedLista(tarjetascreditos,tarjetascreditoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TarjetasCreditos> tarjetascreditossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tarjetascreditossLocal=this.tarjetascreditosLogic.getTarjetasCreditoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tarjetascreditossLocal=this.tarjetascreditoss;
			}
			//ARCHITECTURE
		
			for(TarjetasCreditos tarjetascreditosLocal:tarjetascreditossLocal) {
				if(this.permiteMantenimiento(tarjetascreditosLocal) && tarjetascreditosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TarjetasCreditosConstantesFunciones.getTarjetasCreditosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TarjetasCreditosConstantesFunciones.IDTARJETACREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetasCreditos.jLabelid_tarjeta_creditoTarjetasCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TarjetasCreditosConstantesFunciones.NOMBRETARJETA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetasCreditos.jLabelnombre_tarjetaTarjetasCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TarjetasCreditosConstantesFunciones.LOTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetasCreditos.jLabelloteTarjetasCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TarjetasCreditosConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetasCreditos.jLabelfechaTarjetasCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TarjetasCreditosConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetasCreditos.jLabeltotalTarjetasCreditos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTarjetasCreditos.jLabelid_tarjeta_creditoTarjetasCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTarjetasCreditos.jLabelnombre_tarjetaTarjetasCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTarjetasCreditos.jLabelloteTarjetasCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTarjetasCreditos.jLabelfechaTarjetasCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTarjetasCreditos.jLabeltotalTarjetasCreditos,"");
		
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
		this.iIdNuevoTarjetasCreditos--;	
		
		
		this.tarjetascreditosAux=new TarjetasCreditos();
		
		this.tarjetascreditosAux.setId(this.iIdNuevoTarjetasCreditos);
		this.tarjetascreditosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tarjetascreditosLogic.getTarjetasCreditoss().add(this.tarjetascreditosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tarjetascreditoss.add(this.tarjetascreditosAux);
		}
		//ARCHITECTURE
		
		this.tarjetascreditos=this.tarjetascreditosAux;
		
		if(TarjetasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTarjetasCreditos(this.tarjetascreditos);
			this.setVariablesObjetoActualToFormularioForeignKeyTarjetasCreditos(this.tarjetascreditos);
		}
				
		//this.setDefaultControlesTarjetasCreditos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTarjetasCreditos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTarjetasCreditos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTarjetasCreditos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTarjetasCreditos(this.tarjetascreditosBean,this.tarjetascreditos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTarjetasCreditos(this.tarjetascreditosReturnGeneral,this.tarjetascreditosBean,false);
		
		if(this.tarjetascreditosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTarjetasCreditos(this.tarjetascreditosReturnGeneral.getTarjetasCreditos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTarjetasCreditos(this.tarjetascreditosReturnGeneral.getTarjetasCreditos());
		}
		
		if(this.tarjetascreditosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTarjetasCreditos(this.tarjetascreditosReturnGeneral.getTarjetasCreditos(),classes);//this.tarjetascreditosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.tarjetascreditos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTarjetasCreditos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTarjetasCreditos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TarjetasCreditosBeanSwingJInternalFrameAdditional.RecargarFormTarjetasCreditos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTarjetasCreditos(false);
						
			if(tarjetascreditosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TarjetasCreditosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTarjetasCreditos();
			}
			
			this.actualizarVisualTableDatosTarjetasCreditos();
			
			this.jTableDatosTarjetasCreditos.setRowSelectionInterval(this.getIndiceNuevoTarjetasCreditos(), this.getIndiceNuevoTarjetasCreditos());
			
			this.seleccionarFilaTablaTarjetasCreditosActual();
						
			this.actualizarEstadoCeldasBotonesTarjetasCreditos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTarjetasCreditos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTarjetasCreditos.jDateChooserfecha_inicioTarjetasCreditos.setEnabled(isHabilitar && this.tarjetascreditosConstantesFunciones.activarfecha_inicioTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jDateChooserfecha_finTarjetasCreditos.setEnabled(isHabilitar && this.tarjetascreditosConstantesFunciones.activarfecha_finTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jTextAreanombre_tarjetaTarjetasCreditos.setEnabled(isHabilitar && this.tarjetascreditosConstantesFunciones.activarnombre_tarjetaTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jTextFieldloteTarjetasCreditos.setEnabled(isHabilitar && this.tarjetascreditosConstantesFunciones.activarloteTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jDateChooserfechaTarjetasCreditos.setEnabled(isHabilitar && this.tarjetascreditosConstantesFunciones.activarfechaTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jTextFieldtotalTarjetasCreditos.setEnabled(isHabilitar && this.tarjetascreditosConstantesFunciones.activartotalTarjetasCreditos);	
		//
		this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_empresaTarjetasCreditos.setEnabled(isHabilitar && this.tarjetascreditosConstantesFunciones.activarid_empresaTarjetasCreditos);//
		this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_sucursalTarjetasCreditos.setEnabled(isHabilitar && this.tarjetascreditosConstantesFunciones.activarid_sucursalTarjetasCreditos);//
		this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_tarjeta_creditoTarjetasCreditos.setEnabled(isHabilitar && this.tarjetascreditosConstantesFunciones.activarid_tarjeta_creditoTarjetasCreditos);
	};
	
	public void setDefaultControlesTarjetasCreditos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTarjetasCreditos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tarjetascreditosSessionBean.setConGuardarRelaciones(true);			
			this.tarjetascreditosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTarjetasCreditos.jTabbedPaneRelacionesTarjetasCreditos.setVisible(true);
			
					
		} else {
			//this.tarjetascreditosSessionBean.setConGuardarRelaciones(false);			
			this.tarjetascreditosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTarjetasCreditos.jTabbedPaneRelacionesTarjetasCreditos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTarjetasCreditos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TarjetasCreditos tarjetascreditosAux:this.tarjetascreditosLogic.getTarjetasCreditoss()) {
				if(tarjetascreditosAux.getId().equals(this.iIdNuevoTarjetasCreditos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TarjetasCreditos tarjetascreditosAux:this.tarjetascreditoss) {
				if(tarjetascreditosAux.getId().equals(this.iIdNuevoTarjetasCreditos)) {
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
	
	public int getIndiceActualTarjetasCreditos(TarjetasCreditos tarjetascreditos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TarjetasCreditos tarjetascreditosAux:this.tarjetascreditosLogic.getTarjetasCreditoss()) {
				if(tarjetascreditosAux.getId().equals(tarjetascreditos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TarjetasCreditos tarjetascreditosAux:this.tarjetascreditoss) {
				if(tarjetascreditosAux.getId().equals(tarjetascreditos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTarjetasCreditos(TarjetasCreditos tarjetascreditosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TarjetasCreditos tarjetascreditosAux:this.tarjetascreditosLogic.getTarjetasCreditoss()) {
				if(tarjetascreditosAux.getTarjetasCreditosOriginal().getId().equals(tarjetascreditosOriginal.getId())) {
					existe=true;
					tarjetascreditosOriginal.setId(tarjetascreditosAux.getId());
					tarjetascreditosOriginal.setVersionRow(tarjetascreditosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TarjetasCreditos tarjetascreditosAux:this.tarjetascreditoss) {
				if(tarjetascreditosAux.getTarjetasCreditosOriginal().getId().equals(tarjetascreditosOriginal.getId())) {
					existe=true;
					tarjetascreditosOriginal.setId(tarjetascreditosAux.getId());
					tarjetascreditosOriginal.setVersionRow(tarjetascreditosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTarjetasCreditos(Boolean esParaCancelar) throws Exception {
		tarjetascreditossAux=new ArrayList<TarjetasCreditos>();
		tarjetascreditosAux=new TarjetasCreditos();
		
		if(!this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TarjetasCreditos tarjetascreditosAux:this.tarjetascreditosLogic.getTarjetasCreditoss()) {
					if(tarjetascreditosAux.getId()<0) {
						tarjetascreditossAux.add(tarjetascreditosAux);
					}		
				}
				this.iIdNuevoTarjetasCreditos=0L;
				this.tarjetascreditosLogic.getTarjetasCreditoss().removeAll(tarjetascreditossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TarjetasCreditos tarjetascreditosAux:this.tarjetascreditoss) {
					if(tarjetascreditosAux.getId()<0) {
						tarjetascreditossAux.add(tarjetascreditosAux);
					}		
				}
				this.iIdNuevoTarjetasCreditos=0L;
				this.tarjetascreditoss.removeAll(tarjetascreditossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTarjetasCreditos 
					&& this.tarjetascreditosLogic.getTarjetasCreditoss().size()>0
					) {
					tarjetascreditosAux=this.tarjetascreditosLogic.getTarjetasCreditoss().get(this.tarjetascreditosLogic.getTarjetasCreditoss().size() - 1);
				
					if(tarjetascreditosAux.getId()<0) {
						this.tarjetascreditosLogic.getTarjetasCreditoss().remove(tarjetascreditosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTarjetasCreditos && this.tarjetascreditoss.size()>0) {
					tarjetascreditosAux=this.tarjetascreditoss.get(this.tarjetascreditoss.size() - 1);
				
					if(tarjetascreditosAux.getId()<0) {
						this.tarjetascreditoss.remove(tarjetascreditosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTarjetasCreditos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tarjetascreditos.getId()<0) {
				this.tarjetascreditosLogic.getTarjetasCreditoss().remove(this.tarjetascreditos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tarjetascreditos.getId()<0) {
				this.tarjetascreditoss.remove(this.tarjetascreditos);
			}
		}			
	}
	
	public void setEstadosInicialesTarjetasCreditos(List<TarjetasCreditos> tarjetascreditossAux) throws Exception {
		TarjetasCreditosConstantesFunciones.setEstadosInicialesTarjetasCreditos(tarjetascreditossAux);
	}
	
	public void setEstadosInicialesTarjetasCreditos(TarjetasCreditos tarjetascreditosAux) throws Exception {
		TarjetasCreditosConstantesFunciones.setEstadosInicialesTarjetasCreditos(tarjetascreditosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTarjetasCreditosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTarjetasCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTarjetasCreditosActual()) {
				if(!this.isEsNuevoTarjetasCreditos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTarjetasCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTarjetasCreditos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTarjetasCreditosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tarjeta Credito ?", "MANTENIMIENTO DE Tarjeta Credito", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTarjetasCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TarjetasCreditos tarjetascreditos) throws Exception {
		TarjetasCreditosConstantesFunciones.seleccionarAsignar(this.tarjetascreditos,tarjetascreditos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTarjetasCreditos=this.isPermisoActualizarOriginalTarjetasCreditos;
			
			
			this.seleccionarAsignar(tarjetascreditos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesTarjetasCreditos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tarjetascreditosSessionBean.setsFuncionBusquedaRapida(this.tarjetascreditosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTarjetasCreditos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTarjetasCreditos(esParaCancelar);				
				this.cancelarNuevoTarjetasCreditos(esParaCancelar);								
			}
			
			this.tarjetascreditos=new TarjetasCreditos();
			
			this.inicializarTarjetasCreditos();
			
			this.actualizarEstadoCeldasBotonesTarjetasCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTarjetasCreditos() throws Exception {
		try {
			TarjetasCreditosConstantesFunciones.inicializarTarjetasCreditos(this.tarjetascreditos);
			
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
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tarjetascreditosLogic.getTarjetasCreditoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTarjetasCreditoss(String sAccionBusqueda,List<TarjetasCreditos> tarjetascreditossParaReportes) throws Exception {
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
					sPathReporteFinal="TarjetasCreditos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TarjetasCreditosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TarjetasCreditosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TarjetasCreditos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tarjeta Creditos");		
		parameters.put("busquedapor", TarjetasCreditosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTarjetasCreditos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TarjetasCreditosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TarjetasCreditosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTarjetasCreditos=new JRBeanArrayDataSource(TarjetasCreditosJInternalFrame.TraerTarjetasCreditosBeans(tarjetascreditossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTarjetasCreditos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TarjetasCreditosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TarjetasCreditosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TarjetasCreditosBean.TraerTarjetasCreditosBeans(tarjetascreditossParaReportes).toArray()));
							
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
				this.generarExcelReporteTarjetasCreditoss(sAccionBusqueda,sTipoArchivoReporte,tarjetascreditossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTarjetasCreditoss(sAccionBusqueda,sTipoArchivoReporte,tarjetascreditossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTarjetasCreditosActionPerformed(null);
					//this.generarExcelReporteTarjetasCreditoss(sAccionBusqueda,sTipoArchivoReporte,tarjetascreditossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTarjetasCreditoss(sAccionBusqueda,sTipoArchivoReporte,tarjetascreditossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTarjetasCreditoss(sAccionBusqueda,sTipoArchivoReporte,tarjetascreditossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTarjetasCreditoss(sAccionBusqueda,sTipoArchivoReporte,tarjetascreditossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTarjetasCreditoss(String sAccionBusqueda,String sTipoArchivoReporte,List<TarjetasCreditos> tarjetascreditossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tarjetascreditos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TarjetasCreditoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTarjetasCreditos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TarjetasCreditos tarjetascreditos : tarjetascreditossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TarjetasCreditosConstantesFunciones.generarExcelReporteDataTarjetasCreditos("NORMAL",row,workbook,tarjetascreditos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTarjetasCreditos(String sTipo,Row row,Workbook workbook) {
		
		TarjetasCreditosConstantesFunciones.generarExcelReporteHeaderTarjetasCreditos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTarjetasCreditoss(String sAccionBusqueda,String sTipoArchivoReporte,List<TarjetasCreditos> tarjetascreditossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tarjetascreditos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TarjetasCreditoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TarjetasCreditos tarjetascreditos : tarjetascreditossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TarjetasCreditosConstantesFunciones.getTarjetasCreditosDescripcion(tarjetascreditos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TarjetasCreditosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tarjetascreditos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TarjetasCreditosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tarjetascreditos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TarjetasCreditosConstantesFunciones.LABEL_IDTARJETACREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_IDTARJETACREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tarjetascreditos.gettarjetacredito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TarjetasCreditosConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tarjetascreditos.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TarjetasCreditosConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tarjetascreditos.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TarjetasCreditosConstantesFunciones.LABEL_NOMBRETARJETA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_NOMBRETARJETA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tarjetascreditos.getnombre_tarjeta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TarjetasCreditosConstantesFunciones.LABEL_LOTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_LOTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tarjetascreditos.getlote());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TarjetasCreditosConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tarjetascreditos.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TarjetasCreditosConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tarjetascreditos.gettotal());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTarjetasCreditoss(String sAccionBusqueda,String sTipoArchivoReporte,List<TarjetasCreditos> tarjetascreditossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TarjetasCreditos> tarjetascreditossRespaldo=null;
		
		classes=TarjetasCreditosConstantesFunciones.getClassesRelationshipsOfTarjetasCreditos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tarjetascreditosLogic.setDatosCliente(this.datosCliente);
		this.tarjetascreditosLogic.setDatosDeep(this.datosDeep);
		this.tarjetascreditosLogic.setIsConDeep(true);
		
		tarjetascreditossRespaldo=this.tarjetascreditosLogic.getTarjetasCreditoss();
		
		this.tarjetascreditosLogic.setTarjetasCreditoss(tarjetascreditossParaReportes);	
		this.tarjetascreditosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tarjetascreditossParaReportes=this.tarjetascreditosLogic.getTarjetasCreditoss();
		this.tarjetascreditosLogic.setTarjetasCreditoss(tarjetascreditossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tarjetascreditos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TarjetasCreditoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTarjetasCreditos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TarjetasCreditos tarjetascreditos : tarjetascreditossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTarjetasCreditos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TarjetasCreditosConstantesFunciones.generarExcelReporteDataTarjetasCreditos("NORMAL",row,workbook,tarjetascreditos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TarjetasCreditosConstantesFunciones.getTarjetasCreditosDescripcion(tarjetascreditos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTarjetasCreditos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTarjetasCreditos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTarjetasCreditos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTarjetasCreditos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTarjetasCreditos() throws Exception {		
		this.startProcessTarjetasCreditos(true);
	}
	
	public void startProcessTarjetasCreditos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTarjetasCreditos ,this.jPanelParametrosReportesTarjetasCreditos, this.jScrollPanelDatosTarjetasCreditos,this.jPanelPaginacionTarjetasCreditos, this.jScrollPanelDatosEdicionTarjetasCreditos, this.jPanelAccionesTarjetasCreditos,this.jPanelAccionesFormularioTarjetasCreditos,this.jmenuBarTarjetasCreditos,this.jmenuBarDetalleTarjetasCreditos,this.jTtoolBarTarjetasCreditos,this.jTtoolBarDetalleTarjetasCreditos);		
		
		final JTabbedPane jTabbedPaneBusquedasTarjetasCreditos=this.jTabbedPaneBusquedasTarjetasCreditos; 
		
		final JPanel jPanelParametrosReportesTarjetasCreditos=this.jPanelParametrosReportesTarjetasCreditos;
		//final JScrollPane jScrollPanelDatosTarjetasCreditos=this.jScrollPanelDatosTarjetasCreditos;
		final JTable jTableDatosTarjetasCreditos=this.jTableDatosTarjetasCreditos;		
		final JPanel jPanelPaginacionTarjetasCreditos=this.jPanelPaginacionTarjetasCreditos;
		//final JScrollPane jScrollPanelDatosEdicionTarjetasCreditos=this.jScrollPanelDatosEdicionTarjetasCreditos;
		final JPanel jPanelAccionesTarjetasCreditos=this.jPanelAccionesTarjetasCreditos;
		
		JPanel jPanelCamposAuxiliarTarjetasCreditos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTarjetasCreditos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
			jPanelCamposAuxiliarTarjetasCreditos=this.jInternalFrameDetalleFormTarjetasCreditos.jPanelCamposTarjetasCreditos;
			jPanelAccionesFormularioAuxiliarTarjetasCreditos=this.jInternalFrameDetalleFormTarjetasCreditos.jPanelAccionesFormularioTarjetasCreditos;
		}
		
		final JPanel jPanelCamposTarjetasCreditos=jPanelCamposAuxiliarTarjetasCreditos;
		final JPanel jPanelAccionesFormularioTarjetasCreditos=jPanelAccionesFormularioAuxiliarTarjetasCreditos;
		
		
		final JMenuBar jmenuBarTarjetasCreditos=this.jmenuBarTarjetasCreditos;
		final JToolBar jTtoolBarTarjetasCreditos=this.jTtoolBarTarjetasCreditos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTarjetasCreditos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTarjetasCreditos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
			jmenuBarDetalleAuxiliarTarjetasCreditos=this.jInternalFrameDetalleFormTarjetasCreditos.jmenuBarDetalleTarjetasCreditos;
			jTtoolBarDetalleAuxiliarTarjetasCreditos=this.jInternalFrameDetalleFormTarjetasCreditos.jTtoolBarDetalleTarjetasCreditos;
		}
		
		final JMenuBar jmenuBarDetalleTarjetasCreditos=jmenuBarDetalleAuxiliarTarjetasCreditos;
		final JToolBar jTtoolBarDetalleTarjetasCreditos=jTtoolBarDetalleAuxiliarTarjetasCreditos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTarjetasCreditos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTarjetasCreditos;
			processRunnable.jTableDatos=jTableDatosTarjetasCreditos;
			processRunnable.jPanelCampos=jPanelCamposTarjetasCreditos;
			processRunnable.jPanelPaginacion=jPanelPaginacionTarjetasCreditos;
			processRunnable.jPanelAcciones=jPanelAccionesTarjetasCreditos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTarjetasCreditos;
			
			
			processRunnable.jmenuBar=jmenuBarTarjetasCreditos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTarjetasCreditos;
			processRunnable.jTtoolBar=jTtoolBarTarjetasCreditos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTarjetasCreditos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTarjetasCreditos ,jPanelParametrosReportesTarjetasCreditos,jTableDatosTarjetasCreditos, /*jScrollPanelDatosTarjetasCreditos,*/jPanelCamposTarjetasCreditos,jPanelPaginacionTarjetasCreditos, /*jScrollPanelDatosEdicionTarjetasCreditos,*/ jPanelAccionesTarjetasCreditos,jPanelAccionesFormularioTarjetasCreditos,jmenuBarTarjetasCreditos,jmenuBarDetalleTarjetasCreditos,jTtoolBarTarjetasCreditos,jTtoolBarDetalleTarjetasCreditos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTarjetasCreditos ,jPanelParametrosReportesTarjetasCreditos, jScrollPanelDatosTarjetasCreditos,jPanelPaginacionTarjetasCreditos, jScrollPanelDatosEdicionTarjetasCreditos, jPanelAccionesTarjetasCreditos,jPanelAccionesFormularioTarjetasCreditos,jmenuBarTarjetasCreditos,jmenuBarDetalleTarjetasCreditos,jTtoolBarTarjetasCreditos,jTtoolBarDetalleTarjetasCreditos);
						
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
	
	public void finishProcessTarjetasCreditos() {// throws Exception 
		this.finishProcessTarjetasCreditos(true);
	}
	
	public void finishProcessTarjetasCreditos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTarjetasCreditos ,this.jPanelParametrosReportesTarjetasCreditos, this.jScrollPanelDatosTarjetasCreditos,this.jPanelPaginacionTarjetasCreditos, this.jScrollPanelDatosEdicionTarjetasCreditos, this.jPanelAccionesTarjetasCreditos,this.jPanelAccionesFormularioTarjetasCreditos,this.jmenuBarTarjetasCreditos,this.jmenuBarDetalleTarjetasCreditos,this.jTtoolBarTarjetasCreditos,this.jTtoolBarDetalleTarjetasCreditos);		
		
		final JTabbedPane jTabbedPaneBusquedasTarjetasCreditos=this.jTabbedPaneBusquedasTarjetasCreditos; 
		
		final JPanel jPanelParametrosReportesTarjetasCreditos=this.jPanelParametrosReportesTarjetasCreditos;
		//final JScrollPane jScrollPanelDatosTarjetasCreditos=this.jScrollPanelDatosTarjetasCreditos;
		final JTable jTableDatosTarjetasCreditos=this.jTableDatosTarjetasCreditos;		
		final JPanel jPanelPaginacionTarjetasCreditos=this.jPanelPaginacionTarjetasCreditos;
		//final JScrollPane jScrollPanelDatosEdicionTarjetasCreditos=this.jScrollPanelDatosEdicionTarjetasCreditos;
		final JPanel jPanelAccionesTarjetasCreditos=this.jPanelAccionesTarjetasCreditos;
		
		JPanel jPanelCamposAuxiliarTarjetasCreditos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTarjetasCreditos=new JPanel();
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
			jPanelCamposAuxiliarTarjetasCreditos=this.jInternalFrameDetalleFormTarjetasCreditos.jPanelCamposTarjetasCreditos;
			jPanelAccionesFormularioAuxiliarTarjetasCreditos=this.jInternalFrameDetalleFormTarjetasCreditos.jPanelAccionesFormularioTarjetasCreditos;
		}
		
		final JPanel jPanelCamposTarjetasCreditos=jPanelCamposAuxiliarTarjetasCreditos;
		final JPanel jPanelAccionesFormularioTarjetasCreditos=jPanelAccionesFormularioAuxiliarTarjetasCreditos;
		
		
		final JMenuBar jmenuBarTarjetasCreditos=this.jmenuBarTarjetasCreditos;		
		final JToolBar jTtoolBarTarjetasCreditos=this.jTtoolBarTarjetasCreditos;
				
		JMenuBar jmenuBarDetalleAuxiliarTarjetasCreditos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTarjetasCreditos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
			jmenuBarDetalleAuxiliarTarjetasCreditos=this.jInternalFrameDetalleFormTarjetasCreditos.jmenuBarDetalleTarjetasCreditos;
			jTtoolBarDetalleAuxiliarTarjetasCreditos=this.jInternalFrameDetalleFormTarjetasCreditos.jTtoolBarDetalleTarjetasCreditos;		
		}
		
		final JMenuBar jmenuBarDetalleTarjetasCreditos=jmenuBarDetalleAuxiliarTarjetasCreditos;
		final JToolBar jTtoolBarDetalleTarjetasCreditos=jTtoolBarDetalleAuxiliarTarjetasCreditos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTarjetasCreditos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTarjetasCreditos;
			processRunnable.jTableDatos=jTableDatosTarjetasCreditos;
			processRunnable.jPanelCampos=jPanelCamposTarjetasCreditos;
			processRunnable.jPanelPaginacion=jPanelPaginacionTarjetasCreditos;
			processRunnable.jPanelAcciones=jPanelAccionesTarjetasCreditos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTarjetasCreditos;
			
			
			processRunnable.jmenuBar=jmenuBarTarjetasCreditos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTarjetasCreditos;
			processRunnable.jTtoolBar=jTtoolBarTarjetasCreditos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTarjetasCreditos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTarjetasCreditos ,jPanelParametrosReportesTarjetasCreditos, jTableDatosTarjetasCreditos,/*jScrollPanelDatosTarjetasCreditos,*/jPanelCamposTarjetasCreditos,jPanelPaginacionTarjetasCreditos, /*jScrollPanelDatosEdicionTarjetasCreditos,*/ jPanelAccionesTarjetasCreditos,jPanelAccionesFormularioTarjetasCreditos,jmenuBarTarjetasCreditos,jmenuBarDetalleTarjetasCreditos,jTtoolBarTarjetasCreditos,jTtoolBarDetalleTarjetasCreditos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTarjetasCreditos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTarjetasCreditos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTarjetasCreditos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTarjetasCreditos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTarjetasCreditos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTarjetasCreditos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTarjetasCreditos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTarjetasCreditos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTarjetasCreditos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tarjetascreditosConstantesFunciones.getsFinalQueryTarjetasCreditos();
		String  finalQueryPaginacionTodos=this.tarjetascreditosConstantesFunciones.getsFinalQueryTarjetasCreditos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TarjetasCreditosConstantesFunciones.getArrayColumnasGlobalesNoTarjetasCreditos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TarjetasCreditosConstantesFunciones.getArrayColumnasGlobalesTarjetasCreditos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TarjetasCreditosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tarjetascreditossEliminados= new ArrayList<TarjetasCreditos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTarjetasCreditos();
		
				///*TarjetasCreditosSessionBean*/this.tarjetascreditosSessionBean=new TarjetasCreditosSessionBean();
			
			if(this.tarjetascreditosSessionBean==null) {
				this.tarjetascreditosSessionBean=new TarjetasCreditosSessionBean();
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
					this.iNumeroPaginacion=TarjetasCreditosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TarjetasCreditosConstantesFunciones.getClassesForeignKeysOfTarjetasCreditos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tarjetascreditos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tarjetascreditossAux= new ArrayList<TarjetasCreditos>();
			
				
			tarjetascreditosLogic.setDatosCliente(this.datosCliente);
			tarjetascreditosLogic.setDatosDeep(this.datosDeep);
			tarjetascreditosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaTarjetaCredito")) {
				this.sDetalleReporte=TarjetasCreditosConstantesFunciones.getDetalleIndiceBusquedaTarjetaCredito(fecha_inicioBusquedaTarjetaCredito,fecha_finBusquedaTarjetaCredito);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tarjetascreditosLogic.getTarjetasCreditossBusquedaTarjetaCredito(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_inicioBusquedaTarjetaCredito,fecha_finBusquedaTarjetaCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TarjetasCreditosConstantesFunciones.getDetalleIndiceBusquedaTarjetaCredito(fecha_inicioBusquedaTarjetaCredito,fecha_finBusquedaTarjetaCredito);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TarjetasCreditosConstantesFunciones.getDetalleIndiceBusquedaTarjetaCredito(fecha_inicioBusquedaTarjetaCredito,fecha_finBusquedaTarjetaCredito);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tarjetascreditosLogic.getTarjetasCreditoss()==null||tarjetascreditosLogic.getTarjetasCreditoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tarjetascreditoss==null|| tarjetascreditoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetascreditossAux=new ArrayList<TarjetasCreditos>();
						tarjetascreditossAux.addAll(tarjetascreditosLogic.getTarjetasCreditoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetascreditossAux=new ArrayList<TarjetasCreditos>();
							tarjetascreditossAux.addAll(tarjetascreditoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tarjetascreditosLogic.getTarjetasCreditossBusquedaTarjetaCredito(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_inicioBusquedaTarjetaCredito,fecha_finBusquedaTarjetaCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TarjetasCreditosConstantesFunciones.getDetalleIndiceBusquedaTarjetaCredito(fecha_inicioBusquedaTarjetaCredito,fecha_finBusquedaTarjetaCredito);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TarjetasCreditosConstantesFunciones.getDetalleIndiceBusquedaTarjetaCredito(fecha_inicioBusquedaTarjetaCredito,fecha_finBusquedaTarjetaCredito);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTarjetasCreditoss("BusquedaTarjetaCredito",tarjetascreditosLogic.getTarjetasCreditoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTarjetasCreditoss("BusquedaTarjetaCredito",tarjetascreditoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetascreditosLogic.setTarjetasCreditoss(new ArrayList<TarjetasCreditos>());
						tarjetascreditosLogic.getTarjetasCreditoss().addAll(tarjetascreditossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetascreditoss=new ArrayList<TarjetasCreditos>();
							tarjetascreditoss.addAll(tarjetascreditossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTarjetasCreditos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTarjetasCreditos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tarjetascreditosLogic.getTarjetasCreditoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tarjetascreditoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tarjetascreditosLogic.getTarjetasCreditoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tarjetascreditoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TarjetasCreditos tarjetascreditos) {
		Boolean permite=true;
		
		if(this.tarjetascreditos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TarjetasCreditosConstantesFunciones.getOrderByListaTarjetasCreditos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TarjetasCreditosConstantesFunciones.getOrderByListaTarjetasCreditos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TarjetasCreditos tarjetascreditos:tarjetascreditosLogic.getTarjetasCreditoss()) {
				if(tarjetascreditos.getsType().equals(Constantes2.S_TOTALES)) {
					tarjetascreditosTotales=tarjetascreditos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TarjetasCreditos tarjetascreditos:this.tarjetascreditoss) {
				if(tarjetascreditos.getsType().equals(Constantes2.S_TOTALES)) {
					tarjetascreditosTotales=tarjetascreditos;
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
			this.tarjetascreditosAux=new TarjetasCreditos();
			this.tarjetascreditosAux.setsType(Constantes2.S_TOTALES);
			this.tarjetascreditosAux.setIsNew(false);
			this.tarjetascreditosAux.setIsChanged(false);
			this.tarjetascreditosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//TarjetasCreditosConstantesFunciones.TotalizarValoresFilaTarjetasCreditos(this.tarjetascreditosLogic.getTarjetasCreditoss(),this.tarjetascreditosAux);
				
				//this.tarjetascreditosLogic.getTarjetasCreditoss().add(this.tarjetascreditosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TarjetasCreditosConstantesFunciones.TotalizarValoresFilaTarjetasCreditos(this.tarjetascreditoss,this.tarjetascreditosAux);
				
				this.tarjetascreditoss.add(this.tarjetascreditosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tarjetascreditosTotales=new TarjetasCreditos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tarjetascreditosLogic.getTarjetasCreditoss().remove(tarjetascreditosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tarjetascreditoss.remove(tarjetascreditosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tarjetascreditosTotales=new TarjetasCreditos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TarjetasCreditos tarjetascreditos:tarjetascreditosLogic.getTarjetasCreditoss()) {
				if(tarjetascreditos.getsType().equals(Constantes2.S_TOTALES)) {
					tarjetascreditosTotales=tarjetascreditos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TarjetasCreditosConstantesFunciones.TotalizarValoresFilaTarjetasCreditos(this.tarjetascreditosLogic.getTarjetasCreditoss(),tarjetascreditosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TarjetasCreditos tarjetascreditos:this.tarjetascreditoss) {
				if(tarjetascreditos.getsType().equals(Constantes2.S_TOTALES)) {
					tarjetascreditosTotales=tarjetascreditos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TarjetasCreditosConstantesFunciones.TotalizarValoresFilaTarjetasCreditos(this.tarjetascreditoss,tarjetascreditosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTarjetasCreditossBusquedaTarjetaCredito()throws Exception {
		try {
			sAccionBusqueda="BusquedaTarjetaCredito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTarjetasCreditossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTarjetasCreditossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTarjetasCreditossFK_IdTarjetaCredito()throws Exception {
		try {
			sAccionBusqueda="FK_IdTarjetaCredito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTarjetasCreditossBusquedaTarjetaCredito(String sFinalQuery,Date fecha_inicio,Date fecha_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tarjetascreditosLogic.getTarjetasCreditossBusquedaTarjetaCredito(sFinalQuery,this.pagination,fecha_inicio,fecha_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTarjetasCreditossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tarjetascreditosLogic.getTarjetasCreditossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTarjetasCreditossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tarjetascreditosLogic.getTarjetasCreditossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTarjetasCreditossFK_IdTarjetaCredito(String sFinalQuery,Long id_tarjeta_credito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tarjetascreditosLogic.getTarjetasCreditossFK_IdTarjetaCredito(sFinalQuery,this.pagination,id_tarjeta_credito);
				
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
	
	public void inicializarPermisosTarjetasCreditos() {
		this.isPermisoTodoTarjetasCreditos=false;
		this.isPermisoNuevoTarjetasCreditos=false;
		this.isPermisoActualizarTarjetasCreditos=false;
		this.isPermisoActualizarOriginalTarjetasCreditos=false;
		this.isPermisoEliminarTarjetasCreditos=false;
		this.isPermisoGuardarCambiosTarjetasCreditos=false;
		this.isPermisoConsultaTarjetasCreditos=true;
		this.isPermisoBusquedaTarjetasCreditos=true;
		this.isPermisoReporteTarjetasCreditos=true;
		this.isPermisoOrdenTarjetasCreditos=false;		
		this.isPermisoPaginacionMedioTarjetasCreditos=false;		
		this.isPermisoPaginacionAltoTarjetasCreditos=false;		
		this.isPermisoPaginacionTodoTarjetasCreditos=false;		
		this.isPermisoCopiarTarjetasCreditos=false;		
		this.isPermisoVerFormTarjetasCreditos=false;		
		this.isPermisoDuplicarTarjetasCreditos=false;
		this.isPermisoOrdenTarjetasCreditos=false;
	}
	
	public void setPermisosUsuarioTarjetasCreditos(Boolean isPermiso) {
		this.isPermisoTodoTarjetasCreditos=isPermiso;
		this.isPermisoNuevoTarjetasCreditos=isPermiso;
		this.isPermisoActualizarTarjetasCreditos=isPermiso;
		this.isPermisoActualizarOriginalTarjetasCreditos=isPermiso;
		this.isPermisoEliminarTarjetasCreditos=isPermiso;
		this.isPermisoGuardarCambiosTarjetasCreditos=isPermiso;
		this.isPermisoConsultaTarjetasCreditos=isPermiso;
		this.isPermisoBusquedaTarjetasCreditos=isPermiso;
		this.isPermisoReporteTarjetasCreditos=isPermiso;
		this.isPermisoOrdenTarjetasCreditos=isPermiso;		
		this.isPermisoPaginacionMedioTarjetasCreditos=isPermiso;		
		this.isPermisoPaginacionAltoTarjetasCreditos=isPermiso;		
		this.isPermisoPaginacionTodoTarjetasCreditos=isPermiso;		
		this.isPermisoCopiarTarjetasCreditos=isPermiso;		
		this.isPermisoVerFormTarjetasCreditos=isPermiso;		
		this.isPermisoDuplicarTarjetasCreditos=isPermiso;
		this.isPermisoOrdenTarjetasCreditos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTarjetasCreditos(Boolean isPermiso) {
		//this.isPermisoTodoTarjetasCreditos=isPermiso;
		this.isPermisoNuevoTarjetasCreditos=isPermiso;
		this.isPermisoActualizarTarjetasCreditos=isPermiso;
		this.isPermisoActualizarOriginalTarjetasCreditos=isPermiso;
		this.isPermisoEliminarTarjetasCreditos=isPermiso;
		this.isPermisoGuardarCambiosTarjetasCreditos=isPermiso;
		//this.isPermisoConsultaTarjetasCreditos=isPermiso;
		//this.isPermisoBusquedaTarjetasCreditos=isPermiso;
		//this.isPermisoReporteTarjetasCreditos=isPermiso;
		//this.isPermisoOrdenTarjetasCreditos=isPermiso;		
		//this.isPermisoPaginacionMedioTarjetasCreditos=isPermiso;		
		//this.isPermisoPaginacionAltoTarjetasCreditos=isPermiso;		
		//this.isPermisoPaginacionTodoTarjetasCreditos=isPermiso;		
		//this.isPermisoCopiarTarjetasCreditos=isPermiso;		
		//this.isPermisoDuplicarTarjetasCreditos=isPermiso;
		//this.isPermisoOrdenTarjetasCreditos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTarjetasCreditosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TarjetasCreditosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTarjetasCreditos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTarjetasCreditosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTarjetasCreditosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTarjetasCreditosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTarjetasCreditosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTarjetasCreditos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TarjetasCreditosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TarjetasCreditosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTarjetasCreditos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTarjetasCreditos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTarjetasCreditos=this.isPermisoActualizarTarjetasCreditos;
			this.isPermisoEliminarTarjetasCreditos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTarjetasCreditos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTarjetasCreditos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTarjetasCreditos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTarjetasCreditos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTarjetasCreditos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTarjetasCreditos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTarjetasCreditos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTarjetasCreditos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTarjetasCreditos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTarjetasCreditos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTarjetasCreditos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTarjetasCreditos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTarjetasCreditos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTarjetasCreditos.setToolTipText(this.jTableDatosTarjetasCreditos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTarjetasCreditos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTarjetasCreditos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TarjetasCreditosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TarjetasCreditosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTarjetasCreditos() throws Exception {
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
	public void inicializarCombosForeignKeyTarjetasCreditosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.tarjetacreditosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTarjetasCreditosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TarjetasCreditosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTarjetaCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTarjetaCreditoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tarjetacreditosForeignKey==null||this.tarjetacreditosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TarjetaCreditoConstantesFunciones.getArrayColumnasGlobalesTarjetaCredito(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TarjetaCreditoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TarjetaCreditoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTarjetaCreditosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyTarjetasCreditos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyTarjetaCredito();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tarjetascreditosSessionBean==null) {
				this.tarjetascreditosSessionBean=new TarjetasCreditosSessionBean();
			}

			if(!this.tarjetascreditosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.tarjetascreditosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTarjetaCredito()throws Exception {
		try {

			if(!this.tarjetascreditosSessionBean.getisBusquedaDesdeForeignKeySesionTarjetaCredito()) {
				TarjetaCredito tarjetacredito=new TarjetaCredito();
				TarjetaCreditoConstantesFunciones.setTarjetaCreditoDescripcion(tarjetacredito,Constantes.SMENSAJE_ESCOJA_OPCION);
				tarjetacredito.setId(null);

				if(!TarjetaCreditoConstantesFunciones.ExisteEnLista(this.tarjetacreditosForeignKey,tarjetacredito,true)) {

					this.tarjetacreditosForeignKey.add(0,tarjetacredito);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTarjetasCreditos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTarjetasCreditos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTarjetasCreditos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTarjetasCreditos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTarjetasCreditos(TarjetasCreditos tarjetascreditos)throws Exception {	
		try {
			
			this.setActualTarjetaCreditoForeignKey(tarjetascreditos.getid_tarjeta_credito(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTarjetasCreditos(TarjetasCreditos tarjetascreditos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTarjetasCreditos()throws Exception {	
		try {
			
			this.setActualTarjetaCreditoForeignKey(this.tarjetascreditosConstantesFunciones.getid_tarjeta_credito(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTarjetasCreditos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTarjetasCreditos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTarjetasCreditos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTarjetasCreditos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTarjetasCreditos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameTarjetaCreditosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTarjetasCreditos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTarjetaCreditosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTarjetasCreditos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_empresaTarjetasCreditos!=null && this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_empresaTarjetasCreditos.getItemCount()>0) {
				this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_empresaTarjetasCreditos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_sucursalTarjetasCreditos!=null && this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_sucursalTarjetasCreditos.getItemCount()>0) {
				this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_sucursalTarjetasCreditos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_tarjeta_creditoTarjetasCreditos!=null && this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_tarjeta_creditoTarjetasCreditos.getItemCount()>0) {
				this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_tarjeta_creditoTarjetasCreditos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public TarjetasCreditosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TarjetasCreditosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TarjetasCreditosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tarjetascreditosSessionBean=new TarjetasCreditosSessionBean(); 
		this.tarjetascreditosConstantesFunciones=new TarjetasCreditosConstantesFunciones(); 
		this.tarjetascreditosBean=new TarjetasCreditos();//(this.tarjetascreditosConstantesFunciones); 		
		this.tarjetascreditosReturnGeneral=new TarjetasCreditosParameterReturnGeneral(); 
		
		this.tarjetascreditosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tarjetascreditosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TarjetasCreditosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TarjetasCreditosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TarjetasCreditosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTarjetasCreditos(true);
			
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
			
			this.tarjetascreditosConstantesFunciones=new TarjetasCreditosConstantesFunciones(); 
			this.tarjetascreditosBean=new TarjetasCreditos();//this.tarjetascreditosConstantesFunciones); 			
			this.tarjetascreditosReturnGeneral=new TarjetasCreditosParameterReturnGeneral(); 
		
			TarjetasCreditosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tarjeta Credito Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.tarjetascreditos=new TarjetasCreditos();
			this.tarjetascreditoss = new ArrayList<TarjetasCreditos>();
			this.tarjetascreditossAux = new ArrayList<TarjetasCreditos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic=new TarjetasCreditosLogic();
				this.tarjetascreditosLogic.getNewConnexionToDeep("");
			}
			
			//this.tarjetascreditosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tarjetascreditosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTarjetasCreditos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTarjetasCreditos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTarjetasCreditos);	
					}
					
					if(this.jInternalFrameImportacionTarjetasCreditos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTarjetasCreditos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTarjetasCreditos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTarjetasCreditos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTarjetasCreditos);
				this.jInternalFrameDetalleFormTarjetasCreditos.setVisible(false);
				this.jInternalFrameDetalleFormTarjetasCreditos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTarjetasCreditos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTarjetasCreditos);
					this.jInternalFrameReporteDinamicoTarjetasCreditos.setVisible(false);
					this.jInternalFrameReporteDinamicoTarjetasCreditos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTarjetasCreditos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTarjetasCreditos);
					this.jInternalFrameImportacionTarjetasCreditos.setVisible(false);
					this.jInternalFrameImportacionTarjetasCreditos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTarjetasCreditos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTarjetasCreditos);
					this.jInternalFrameOrderByTarjetasCreditos.setVisible(false);
					this.jInternalFrameOrderByTarjetasCreditos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTarjetasCreditosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TarjetasCreditosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tarjetascreditosReturnGeneral=new TarjetasCreditosParameterReturnGeneral();
			
			this.tarjetascreditosParameterGeneral=new TarjetasCreditosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tarjetascreditosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TarjetasCreditosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TarjetasCreditosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tarjetascreditosSessionBean.getEsGuardarRelacionado(),this.tarjetascreditosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TarjetasCreditosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tarjetascreditosSessionBean.getEsGuardarRelacionado(),this.tarjetascreditosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTarjetasCreditos=false;
			this.isVisibilidadCeldaDuplicarTarjetasCreditos=true;
			this.isVisibilidadCeldaCopiarTarjetasCreditos=true;
			this.isVisibilidadCeldaVerFormTarjetasCreditos=true;
			this.isVisibilidadCeldaOrdenTarjetasCreditos=true;
			this.isVisibilidadCeldaNuevoRelacionesTarjetasCreditos=false;
			this.isVisibilidadCeldaModificarTarjetasCreditos=false;
			this.isVisibilidadCeldaActualizarTarjetasCreditos=false;
			this.isVisibilidadCeldaEliminarTarjetasCreditos=false;
			this.isVisibilidadCeldaCancelarTarjetasCreditos=false;
			this.isVisibilidadCeldaGuardarTarjetasCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosTarjetasCreditos=false;
			
			
			this.isVisibilidadBusquedaTarjetaCredito=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTarjetaCredito=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTarjetasCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTarjetasCreditos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTarjetasCreditos(false);
			
			this.setPermisosUsuarioTarjetasCreditos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tarjetascreditosSessionBean.getEsGuardarRelacionado() 
				|| (this.tarjetascreditosSessionBean.getEsGuardarRelacionado() && this.tarjetascreditosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTarjetasCreditosClasesRelacionadas();
			}
			
			if(this.tarjetascreditosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTarjetasCreditosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TarjetasCreditosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTarjetasCreditos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTarjetasCreditos();
			}
			
			if(!this.isPermisoBusquedaTarjetasCreditos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTarjetasCreditos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TarjetasCreditosConstantesFunciones.getTiposSeleccionarTarjetasCreditos());
				
				this.tiposColumnasSelect=TarjetasCreditosConstantesFunciones.getTiposSeleccionarTarjetasCreditos(true);
				
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
			//if(!this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTarjetasCreditos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioTarjetasCreditos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioTarjetasCreditos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTarjetasCreditos() ;
			
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
			this.sucursalLogic=new SucursalLogic();
			this.tarjetacreditoLogic=new TarjetaCreditoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tarjetascreditosImplementable= (TarjetasCreditosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TarjetasCreditosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tarjetascreditosImplementableHome= (TarjetasCreditosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TarjetasCreditosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tarjetascreditoss= new ArrayList<TarjetasCreditos>();
			this.tarjetascreditossEliminados= new ArrayList<TarjetasCreditos>();
						
			this.isEsNuevoTarjetasCreditos=false;
			this.esParaAccionDesdeFormularioTarjetasCreditos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.tarjetacreditosForeignKey=new ArrayList<TarjetaCredito>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTarjetasCreditos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTarjetasCreditos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TarjetasCreditosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TarjetasCreditosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTarjetasCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTarjetasCreditos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTarjetasCreditos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTarjetasCreditos();
			}
			
			TarjetasCreditosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTarjetasCreditos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTarjetasCreditos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTarjetasCreditos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTarjetasCreditos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TarjetasCreditos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTarjetasCreditos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTarjetasCreditos")) {
				iIndex=this.jInternalFrameDetalleFormTarjetasCreditos.jTabbedPaneRelacionesTarjetasCreditos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTarjetasCreditos.jTabbedPaneRelacionesTarjetasCreditos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTarjetasCreditos();	
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
	
	public void cargarCombosForeignKeyTarjetasCreditos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTarjetasCreditos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTarjetasCreditos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTarjetasCreditosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTarjetasCreditos();
		
		this.cargarCombosFrameForeignKeyTarjetasCreditos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTarjetasCreditos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTarjetasCreditos();
		}
	}
	
	

	public void cargarCombosForeignKeyTarjetaCredito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTarjetaCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTarjetaCredito();
				this.cargarCombosFrameTarjetaCreditosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTarjetaCredito(this.tarjetacreditosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTarjetasCreditosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tarjetascreditosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTarjetasCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
			
			
			if(jTableDatosTarjetasCreditos.getRowCount()>=1) {
				jTableDatosTarjetasCreditos.removeRowSelectionInterval(0, jTableDatosTarjetasCreditos.getRowCount()-1);						
			}
			
			this.isEsNuevoTarjetasCreditos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTarjetasCreditos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTarjetasCreditos(true);			
			//this.tarjetascreditos=new TarjetasCreditos();
			//this.tarjetascreditos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTarjetasCreditos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTarjetasCreditos() ;
			
			if(TarjetasCreditosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTarjetasCreditos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tarjetascreditos);	
			this.actualizarInformacion("INFO_PADRE",false,this.tarjetascreditos);				
			
			TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
			
			if(this.tarjetascreditosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TarjetasCreditos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTarjetasCreditosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TarjetasCreditos> tarjetascreditossSeleccionados=new ArrayList<TarjetasCreditos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTarjetasCreditos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTarjetasCreditos.getSelectedRows().length;			
			}
			
			tarjetascreditossSeleccionados=this.getTarjetasCreditossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTarjetasCreditos--;			
				//TarjetasCreditos tarjetascreditosAux= new TarjetasCreditos();			
				//tarjetascreditosAux.setId(this.iIdNuevoTarjetasCreditos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TarjetasCreditos tarjetascreditosOrigen=new TarjetasCreditos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TarjetasCreditos tarjetascreditosOrigen : tarjetascreditossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tarjetascreditosOrigen =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetascreditosOrigen =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTarjetasCreditos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tarjetascreditos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTarjetasCreditos(tarjetascreditosOrigen,this.tarjetascreditos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tarjetascreditosLogic.getTarjetasCreditoss().add(this.tarjetascreditosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tarjetascreditoss.add(this.tarjetascreditosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTarjetasCreditos(false);
				
				this.jTableDatosTarjetasCreditos.setRowSelectionInterval(this.getIndiceNuevoTarjetasCreditos(), this.getIndiceNuevoTarjetasCreditos());
				
				int iLastRow =  this.jTableDatosTarjetasCreditos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTarjetasCreditos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTarjetasCreditos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTarjetasCreditos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TarjetasCreditos> tarjetascreditossSeleccionados=new ArrayList<TarjetasCreditos>();									
		
			TarjetasCreditos tarjetascreditosOrigen=new TarjetasCreditos();
			TarjetasCreditos tarjetascreditosDestino=new TarjetasCreditos();
				
			tarjetascreditossSeleccionados=this.getTarjetasCreditossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTarjetasCreditos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tarjetascreditossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTarjetasCreditos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetascreditosOrigen =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tarjetascreditosOrigen =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetascreditosDestino =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tarjetascreditosDestino =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tarjetascreditosOrigen =tarjetascreditossSeleccionados.get(0);
				tarjetascreditosDestino =tarjetascreditossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTarjetasCreditos(tarjetascreditosOrigen,tarjetascreditosDestino,true,false);
				
				tarjetascreditosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tarjetascreditosDestino,tarjetascreditosLogic.getTarjetasCreditoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tarjetascreditosDestino,tarjetascreditoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTarjetasCreditos(false);
				
				//this.jTableDatosTarjetasCreditos.setRowSelectionInterval(this.getIndiceNuevoTarjetasCreditos(), this.getIndiceNuevoTarjetasCreditos());
				
				int iLastRow =  this.jTableDatosTarjetasCreditos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTarjetasCreditos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTarjetasCreditos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTarjetasCreditos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTarjetasCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTarjetasCreditos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTarjetasCreditos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTarjetasCreditos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTarjetasCreditos.setVisible(!isVisible);
			this.jPanelPaginacionTarjetasCreditos.setVisible(!isVisible);
			this.jPanelAccionesTarjetasCreditos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTarjetasCreditos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTarjetasCreditos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTarjetasCreditos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTarjetasCreditos();
			
			this.abrirFrameOrderByTarjetasCreditos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTarjetasCreditos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTarjetasCreditos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTarjetasCreditos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTarjetasCreditos.isMaximum()) {
					this.jInternalFrameDetalleFormTarjetasCreditos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTarjetasCreditos.setSize(this.jInternalFrameDetalleFormTarjetasCreditos.iWidthFormulario,this.jInternalFrameDetalleFormTarjetasCreditos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTarjetasCreditos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTarjetasCreditos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTarjetasCreditos.isMaximum()) {
						this.jInternalFrameDetalleFormTarjetasCreditos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTarjetasCreditos.jContentPaneDetalleTarjetasCreditos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTarjetasCreditos.jTabbedPaneRelacionesTarjetasCreditos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTarjetasCreditos.jContentPaneDetalleTarjetasCreditos.getWidth(),TarjetasCreditosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTarjetasCreditos.jTabbedPaneRelacionesTarjetasCreditos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTarjetasCreditos.jContentPaneDetalleTarjetasCreditos.getWidth(),TarjetasCreditosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTarjetasCreditos.jTabbedPaneRelacionesTarjetasCreditos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTarjetasCreditos.jContentPaneDetalleTarjetasCreditos.getWidth(),TarjetasCreditosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTarjetasCreditos.setVisible(true);
	        this.jInternalFrameDetalleFormTarjetasCreditos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTarjetasCreditos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTarjetasCreditos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTarjetasCreditos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTarjetasCreditos,false,this);
				} else {
					this.jInternalFrameOrderByTarjetasCreditos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTarjetasCreditos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTarjetasCreditos);
				this.jInternalFrameOrderByTarjetasCreditos.setVisible(false);
				this.jInternalFrameOrderByTarjetasCreditos.setSelected(false);
				
				this.jInternalFrameOrderByTarjetasCreditos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTarjetasCreditos"));
				
				this.inicializarActualizarBindingTablaOrderByTarjetasCreditos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTarjetasCreditos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTarjetasCreditos==null) {
				
				this.jInternalFrameImportacionTarjetasCreditos=new ImportacionJInternalFrame(TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTarjetasCreditos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTarjetasCreditos);
				this.jInternalFrameImportacionTarjetasCreditos.setVisible(false);
				this.jInternalFrameImportacionTarjetasCreditos.setSelected(false);


				this.jInternalFrameImportacionTarjetasCreditos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTarjetasCreditos"));
				this.jInternalFrameImportacionTarjetasCreditos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTarjetasCreditos"));
				this.jInternalFrameImportacionTarjetasCreditos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTarjetasCreditos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTarjetasCreditos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTarjetasCreditos==null) {
				this.jInternalFrameReporteDinamicoTarjetasCreditos=new ReporteDinamicoJInternalFrame(TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTarjetasCreditos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTarjetasCreditos);
				this.jInternalFrameReporteDinamicoTarjetasCreditos.setVisible(false);
				this.jInternalFrameReporteDinamicoTarjetasCreditos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTarjetasCreditos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTarjetasCreditos"));
				this.jInternalFrameReporteDinamicoTarjetasCreditos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTarjetasCreditos"));
				this.jInternalFrameReporteDinamicoTarjetasCreditos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTarjetasCreditos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTarjetasCreditos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTarjetasCreditos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTarjetasCreditos);
			
	       	this.jInternalFrameDetalleFormTarjetasCreditos.setVisible(false);
	        this.jInternalFrameDetalleFormTarjetasCreditos.setSelected(false);
			
			//this.jInternalFrameDetalleFormTarjetasCreditos.dispose();
			//this.jInternalFrameDetalleFormTarjetasCreditos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTarjetasCreditos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTarjetasCreditos.setVisible(true);
	        this.jInternalFrameReporteDinamicoTarjetasCreditos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTarjetasCreditos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTarjetasCreditos.setVisible(true);
	        this.jInternalFrameImportacionTarjetasCreditos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTarjetasCreditos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTarjetasCreditos.setVisible(true);
	        this.jInternalFrameOrderByTarjetasCreditos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTarjetasCreditos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTarjetasCreditos.setVisible(false);
	        this.jInternalFrameOrderByTarjetasCreditos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTarjetasCreditos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTarjetasCreditos.setVisible(false);
	        this.jInternalFrameReporteDinamicoTarjetasCreditos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTarjetasCreditos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTarjetasCreditos.setVisible(false);
	        this.jInternalFrameImportacionTarjetasCreditos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTarjetasCreditos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTarjetasCreditos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTarjetasCreditos(true);
			//this.isEsNuevoTarjetasCreditos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTarjetasCreditos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTarjetasCreditos(false) ;
			
			if(tarjetascreditosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TarjetasCreditosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTarjetasCreditos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTarjetasCreditos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTarjetasCreditosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTarjetasCreditos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTarjetasCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTarjetasCreditos(true);
			//this.isEsNuevoTarjetasCreditos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tarjetascreditos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTarjetasCreditos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTarjetasCreditos(false) ;
			
			if(TarjetasCreditosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTarjetasCreditos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTarjetasCreditos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaTarjetaCredito(List<TarjetaCredito> tarjetacreditosForeignKey)throws Exception{
		TableColumn tableColumnTarjetaCredito=this.jTableDatosTarjetasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetasCreditos,TarjetasCreditosConstantesFunciones.LABEL_IDTARJETACREDITO));
		TableCellEditor tableCellEditorTarjetaCredito =tableColumnTarjetaCredito.getCellEditor();

		TarjetaCreditoTableCell tarjetacreditoTableCellFk=(TarjetaCreditoTableCell)tableCellEditorTarjetaCredito;

		if(tarjetacreditoTableCellFk!=null) {
			tarjetacreditoTableCellFk.settarjetacreditosForeignKey(tarjetacreditosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTarjetasCreditos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tarjetacreditoTableCellFk.setRowActual(intSelectedRow);
			//tarjetacreditoTableCellFk.settarjetacreditosForeignKeyActual(tarjetacreditosForeignKey);
		//}


		if(tarjetacreditoTableCellFk!=null) {
			tarjetacreditoTableCellFk.RecargarTarjetaCreditosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTarjetasCreditos(false);
			
			//if(!this.isEsNuevoTarjetasCreditos) {								
				int intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TarjetasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.tarjetascreditos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
				
			}
			
			if(this.permiteMantenimiento(this.tarjetascreditos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTarjetasCreditos=true;
					this.inicializarActualizarBindingTablaTarjetasCreditos(false);
					this.isEsNuevoTarjetasCreditos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTarjetasCreditos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTarjetasCreditos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTarjetasCreditos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTarjetasCreditos(false);
				
				this.habilitarDeshabilitarControlesTarjetasCreditos(false);
			
												
				
				if(TarjetasCreditosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTarjetasCreditos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTarjetasCreditosActionPerformed(evt,tarjetascreditosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTarjetasCreditos(this.tarjetascreditos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTarjetasCreditos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tarjetascreditosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tarjetascreditos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TarjetasCreditos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetasCreditos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				this.tarjetascreditos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				this.tarjetascreditos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tarjetascreditos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TarjetasCreditosModel) this.jTableDatosTarjetasCreditos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTarjetasCreditos=true;
				this.inicializarActualizarBindingTablaTarjetasCreditos(false);
				this.isEsNuevoTarjetasCreditos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTarjetasCreditos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTarjetasCreditos(false);
				
				this.habilitarDeshabilitarControlesTarjetasCreditos(false);
				
				
				
				if(TarjetasCreditosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTarjetasCreditos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTarjetasCreditos.getRowCount()>=1) {
				jTableDatosTarjetasCreditos.removeRowSelectionInterval(0, jTableDatosTarjetasCreditos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTarjetasCreditos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTarjetasCreditos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTarjetasCreditos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTarjetasCreditos(false) ;
			
			this.isEsNuevoTarjetasCreditos=false;
			
			if(TarjetasCreditosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTarjetasCreditos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTarjetasCreditos(false);
				
				//SI ES MANUAL
				if(TarjetasCreditosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTarjetasCreditos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTarjetasCreditos--;			
			//TarjetasCreditos tarjetascreditosAux= new TarjetasCreditos();			
			//tarjetascreditosAux.setId(this.iIdNuevoTarjetasCreditos);
			
			if(this.jInternalFrameDetalleFormTarjetasCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTarjetasCreditos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
			
			this.tarjetascreditos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tarjetascreditosLogic.getTarjetasCreditoss().add(this.tarjetascreditosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tarjetascreditoss.add(this.tarjetascreditosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTarjetasCreditos(false);
			
			this.jTableDatosTarjetasCreditos.setRowSelectionInterval(this.getIndiceNuevoTarjetasCreditos(), this.getIndiceNuevoTarjetasCreditos());
			
			int iLastRow =  this.jTableDatosTarjetasCreditos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTarjetasCreditos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTarjetasCreditos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTarjetasCreditos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTarjetasCreditos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTarjetasCreditos(false);
			
			//SI ES MANUAL
			if(TarjetasCreditosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTarjetasCreditos();
			}
			
			//this.abrirFrameTreeTarjetasCreditos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTarjetasCreditos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTarjetasCreditos.setFileImportacion(this.jInternalFrameImportacionTarjetasCreditos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTarjetasCreditos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTarjetasCreditos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTarjetasCreditos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTarjetasCreditos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TarjetasCreditos> tarjetascreditossSeleccionados=new ArrayList<TarjetasCreditos>();		

		tarjetascreditossSeleccionados=this.getTarjetasCreditossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTarjetasCreditos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTarjetasCreditos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TarjetasCreditosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TarjetasCreditosBaseDesign.jrxml";
			
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
			
			this.generarReporteTarjetasCreditoss("Todos",tarjetascreditossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTarjetasCreditos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTarjetasCreditos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TarjetasCreditosConstantesFunciones.LABEL_IDTARJETACREDITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TarjetaCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TarjetaCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TarjetaCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TarjetaCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TarjetasCreditosConstantesFunciones.LABEL_NOMBRETARJETA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTarjeta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTarjeta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTarjeta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTarjeta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TarjetasCreditosConstantesFunciones.LABEL_LOTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_te_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_te_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_te_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_te_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TarjetasCreditosConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TarjetasCreditosConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTarjetasCreditos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTarjetasCreditos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTarjetasCreditos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TarjetasCreditosConstantesFunciones.LABEL_IDTARJETACREDITO:
					sNombreCampoCategoria="id_tarjeta_credito";
					break;

				case TarjetasCreditosConstantesFunciones.LABEL_NOMBRETARJETA:
					sNombreCampoCategoria="nombre_tarjeta";
					break;

				case TarjetasCreditosConstantesFunciones.LABEL_LOTE:
					sNombreCampoCategoria="lote";
					break;

				case TarjetasCreditosConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case TarjetasCreditosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTarjetasCreditos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TarjetasCreditosConstantesFunciones.LABEL_IDTARJETACREDITO:
					sNombreCampoCategoriaValor="id_tarjeta_credito";
					break;

				case TarjetasCreditosConstantesFunciones.LABEL_NOMBRETARJETA:
					sNombreCampoCategoriaValor="nombre_tarjeta";
					break;

				case TarjetasCreditosConstantesFunciones.LABEL_LOTE:
					sNombreCampoCategoriaValor="lote";
					break;

				case TarjetasCreditosConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case TarjetasCreditosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTarjetasCreditos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTarjetasCreditos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TarjetasCreditosConstantesFunciones.LABEL_IDTARJETACREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tarjeta Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tarjeta_credito");
					break;

				case TarjetasCreditosConstantesFunciones.LABEL_NOMBRETARJETA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Tarjeta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_tarjeta");
					break;

				case TarjetasCreditosConstantesFunciones.LABEL_LOTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Lote",sNombreCampoCategoria,sNombreCampoCategoriaValor,"lote");
					break;

				case TarjetasCreditosConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case TarjetasCreditosConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
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
	
	public void jButtonGenerarExcelReporteDinamicoTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TarjetasCreditos> tarjetascreditossSeleccionados=new ArrayList<TarjetasCreditos>();		
		
		tarjetascreditossSeleccionados=this.getTarjetasCreditossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tarjetascreditos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TarjetasCreditoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTarjetasCreditos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTarjetasCreditos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TarjetasCreditosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TarjetasCreditos tarjetascreditos:tarjetascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tarjetascreditos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TarjetasCreditosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(TarjetasCreditos tarjetascreditos:tarjetascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tarjetascreditos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TarjetasCreditosConstantesFunciones.LABEL_IDTARJETACREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_IDTARJETACREDITO);
					iRow++;

					for(TarjetasCreditos tarjetascreditos:tarjetascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tarjetascreditos.gettarjetacredito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TarjetasCreditosConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(TarjetasCreditos tarjetascreditos:tarjetascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tarjetascreditos.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TarjetasCreditosConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(TarjetasCreditos tarjetascreditos:tarjetascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tarjetascreditos.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TarjetasCreditosConstantesFunciones.LABEL_NOMBRETARJETA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_NOMBRETARJETA);
					iRow++;

					for(TarjetasCreditos tarjetascreditos:tarjetascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tarjetascreditos.getnombre_tarjeta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TarjetasCreditosConstantesFunciones.LABEL_LOTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_LOTE);
					iRow++;

					for(TarjetasCreditos tarjetascreditos:tarjetascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tarjetascreditos.getlote());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TarjetasCreditosConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(TarjetasCreditos tarjetascreditos:tarjetascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tarjetascreditos.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TarjetasCreditosConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(TarjetasCreditos tarjetascreditos:tarjetascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tarjetascreditos.gettotal());
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
			//	this.getFilaCabeceraExportarExcelTarjetasCreditos(row);				
			//	iRow++;
			//}				
			
			//for(TarjetasCreditos tarjetascreditosAux:tarjetascreditossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTarjetasCreditos(tarjetascreditosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito",JOptionPane.INFORMATION_MESSAGE);
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
				this.tarjetascreditosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTarjetasCreditos(false);
			
			//SI ES MANUAL
			if(TarjetasCreditosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTarjetasCreditos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTarjetasCreditos(false);
			
			//SI ES MANUAL
			if(TarjetasCreditosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTarjetasCreditos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTarjetasCreditos(false);
			
			//SI ES MANUAL
			if(TarjetasCreditosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTarjetasCreditos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTarjetasCreditos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTarjetasCreditos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTarjetasCreditos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTarjetasCreditos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTarjetasCreditos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTarjetasCreditos.setMinimumSize(dimensionMinimum);
		this.jTableDatosTarjetasCreditos.setMaximumSize(dimensionMaximum);
		this.jTableDatosTarjetasCreditos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTarjetasCreditos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTarjetasCreditos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTarjetasCreditos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTarjetasCreditos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTarjetasCreditos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTarjetasCreditos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTarjetasCreditos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTarjetasCreditos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TarjetasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TarjetasCreditosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTarjetasCreditos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTarjetasCreditos();
		
		this.inicializarActualizarBindingBotonesManualTarjetasCreditos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTarjetasCreditos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTarjetasCreditos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTarjetasCreditos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTarjetasCreditos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTarjetasCreditos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTarjetasCreditos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTarjetasCreditos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTarjetasCreditos.jCheckBoxPostAccionNuevoTarjetasCreditos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTarjetasCreditos.jCheckBoxPostAccionSinCerrarTarjetasCreditos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTarjetasCreditos.jCheckBoxPostAccionSinMensajeTarjetasCreditos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTarjetasCreditos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTarjetasCreditos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTarjetasCreditos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
				this.jInternalFrameDetalleFormTarjetasCreditos.jCheckBoxPostAccionNuevoTarjetasCreditos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTarjetasCreditos.jCheckBoxPostAccionSinCerrarTarjetasCreditos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTarjetasCreditos.jCheckBoxPostAccionSinMensajeTarjetasCreditos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTarjetasCreditos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTarjetasCreditos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxTiposAccionesFormularioTarjetasCreditos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTarjetasCreditos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTarjetasCreditos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTarjetasCreditos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTarjetasCreditos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTarjetasCreditos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTarjetasCreditos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTarjetasCreditos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTarjetasCreditos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTarjetasCreditos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTarjetasCreditos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTarjetasCreditos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTarjetasCreditos(Boolean esInicializar) throws Exception {
		try	{	
			if(TarjetasCreditosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTarjetasCreditos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTarjetasCreditos() throws Exception {
		try	{
			if(TarjetasCreditosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTarjetasCreditos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTarjetasCreditos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxTiposAccionesFormularioTarjetasCreditos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxTiposAccionesFormularioTarjetasCreditos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTarjetasCreditos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTarjetasCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTarjetasCreditos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTarjetasCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTarjetasCreditos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTarjetasCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTarjetasCreditos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTarjetasCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTarjetasCreditos.addItem(reporte);
			}
			
			
			if(!this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTarjetasCreditos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTarjetasCreditos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTarjetasCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTarjetasCreditos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTarjetasCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTarjetasCreditos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxTiposAccionesFormularioTarjetasCreditos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxTiposAccionesFormularioTarjetasCreditos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTarjetasCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTarjetasCreditos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTarjetasCreditos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTarjetasCreditos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTarjetasCreditos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTarjetasCreditos!=null) {
				this.jInternalFrameReporteDinamicoTarjetasCreditos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTarjetasCreditos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTarjetasCreditos!=null) {
				this.jInternalFrameReporteDinamicoTarjetasCreditos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTarjetasCreditos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTarjetasCreditos!=null) {
				
				if(this.jInternalFrameReporteDinamicoTarjetasCreditos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTarjetasCreditos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTarjetasCreditos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTarjetasCreditos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTarjetasCreditos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTarjetasCreditos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoTarjetasCreditos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTarjetasCreditos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=TarjetasCreditosConstantesFunciones.getTiposSeleccionarTarjetasCreditos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTarjetasCreditos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoTarjetasCreditos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoTarjetasCreditos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=TarjetasCreditosConstantesFunciones.getTiposSeleccionarTarjetasCreditos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTarjetasCreditos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoTarjetasCreditos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTarjetasCreditos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=TarjetasCreditosConstantesFunciones.getTiposSeleccionarTarjetasCreditos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTarjetasCreditos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoTarjetasCreditos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoTarjetasCreditos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoTarjetasCreditos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTarjetasCreditos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_inicioBusquedaTarjetaCredito=new Date(this.jDateChooserfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos.getDate().getTime());
		this.fecha_finBusquedaTarjetaCredito=new Date(this.jDateChooserfecha_finBusquedaTarjetaCreditoTarjetasCreditos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTarjetasCreditos(Boolean esInicializar) throws Exception {				
		if(TarjetasCreditosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTarjetasCreditos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTarjetasCreditos() throws Exception {
		this.inicializarActualizarBindingTablaTarjetasCreditos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTarjetasCreditos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTarjetasCreditos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTarjetasCreditos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTarjetasCreditos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TarjetasCreditosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTarjetasCreditos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTarjetasCreditos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TarjetasCreditosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTarjetasCreditosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetasCreditosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TarjetasCreditosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTarjetasCreditos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTarjetasCreditos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TarjetasCreditosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTarjetasCreditos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTarjetasCreditos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tarjetascreditosLogic.getTarjetasCreditoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tarjetascreditoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TarjetasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTarjetasCreditos.setModel(new TarjetasCreditosModel(this.tarjetascreditosLogic.getTarjetasCreditoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTarjetasCreditos.setModel(new TarjetasCreditosModel(this.tarjetascreditoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTarjetasCreditos!=null && this.jInternalFrameOrderByTarjetasCreditos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTarjetasCreditos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTarjetasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetasCreditos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TarjetasCreditosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO,tarjetascreditosConstantesFunciones.resaltarSeleccionarTarjetasCreditos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO,tarjetascreditosConstantesFunciones.resaltarSeleccionarTarjetasCreditos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTarjetasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetasCreditos,TarjetasCreditosConstantesFunciones.LABEL_ID));

		if(this.tarjetascreditosConstantesFunciones.mostraridTarjetasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TarjetasCreditosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tarjetascreditosConstantesFunciones.resaltaridTarjetasCreditos,this.tarjetascreditosConstantesFunciones.activaridTarjetasCreditos,iSizeTabla,this,true,"idTarjetasCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tarjetascreditosConstantesFunciones.resaltaridTarjetasCreditos,this.tarjetascreditosConstantesFunciones.activaridTarjetasCreditos,this,true,"idTarjetasCreditos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTarjetasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetasCreditos,TarjetasCreditosConstantesFunciones.LABEL_NOMBRETARJETA));

		if(this.tarjetascreditosConstantesFunciones.mostrarnombre_tarjetaTarjetasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TarjetasCreditosConstantesFunciones.LABEL_NOMBRETARJETA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tarjetascreditosConstantesFunciones.resaltarnombre_tarjetaTarjetasCreditos,this.tarjetascreditosConstantesFunciones.activarnombre_tarjetaTarjetasCreditos,iSizeTabla,this,true,"nombre_tarjetaTarjetasCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tarjetascreditosConstantesFunciones.resaltarnombre_tarjetaTarjetasCreditos,this.tarjetascreditosConstantesFunciones.activarnombre_tarjetaTarjetasCreditos,this,true,"nombre_tarjetaTarjetasCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TarjetasCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTarjetasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetasCreditos,TarjetasCreditosConstantesFunciones.LABEL_LOTE));

		if(this.tarjetascreditosConstantesFunciones.mostrarloteTarjetasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TarjetasCreditosConstantesFunciones.LABEL_LOTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tarjetascreditosConstantesFunciones.resaltarloteTarjetasCreditos,this.tarjetascreditosConstantesFunciones.activarloteTarjetasCreditos,iSizeTabla,this,true,"loteTarjetasCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tarjetascreditosConstantesFunciones.resaltarloteTarjetasCreditos,this.tarjetascreditosConstantesFunciones.activarloteTarjetasCreditos,this,true,"loteTarjetasCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TarjetasCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTarjetasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetasCreditos,TarjetasCreditosConstantesFunciones.LABEL_FECHA));

		if(this.tarjetascreditosConstantesFunciones.mostrarfechaTarjetasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TarjetasCreditosConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.tarjetascreditosConstantesFunciones.resaltarfechaTarjetasCreditos,this.tarjetascreditosConstantesFunciones.activarfechaTarjetasCreditos,iSizeTabla,this,true,"fechaTarjetasCreditos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.tarjetascreditosConstantesFunciones.resaltarfechaTarjetasCreditos,this.tarjetascreditosConstantesFunciones.activarfechaTarjetasCreditos,this,true,"fechaTarjetasCreditos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TarjetasCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTarjetasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetasCreditos,TarjetasCreditosConstantesFunciones.LABEL_TOTAL));

		if(this.tarjetascreditosConstantesFunciones.mostrartotalTarjetasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TarjetasCreditosConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tarjetascreditosConstantesFunciones.resaltartotalTarjetasCreditos,this.tarjetascreditosConstantesFunciones.activartotalTarjetasCreditos,iSizeTabla,this,true,"totalTarjetasCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tarjetascreditosConstantesFunciones.resaltartotalTarjetasCreditos,this.tarjetascreditosConstantesFunciones.activartotalTarjetasCreditos,this,true,"totalTarjetasCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TarjetasCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tarjetascreditosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tarjetascreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tarjetascreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTarjetasCreditos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tarjetascreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tarjetascreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTarjetasCreditos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTarjetasCreditos && this.isPermisoGuardarCambiosTarjetasCreditos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tarjetascreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tarjetascreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTarjetasCreditos.addColumn(tableColumn);
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
			
			this.jTableDatosTarjetasCreditos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTarjetasCreditos && this.isPermisoGuardarCambiosTarjetasCreditos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTarjetasCreditos && this.isPermisoGuardarCambiosTarjetasCreditos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTarjetasCreditos.moveColumn(this.jTableDatosTarjetasCreditos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTarjetasCreditos.moveColumn(this.jTableDatosTarjetasCreditos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTarjetasCreditos.moveColumn(this.jTableDatosTarjetasCreditos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTarjetasCreditos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTarjetasCreditos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTarjetasCreditos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TarjetasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTarjetasCreditos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTarjetasCreditos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TarjetasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TarjetasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTarjetasCreditos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTarjetasCreditos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTarjetasCreditos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=tarjetascreditosLogic.getTarjetasCreditoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tarjetascreditoss.size()-1;
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
		//this.jTableDatosTarjetasCreditos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTarjetasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTarjetasCreditos();
			
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
				
				//this.isEsNuevoTarjetasCreditos=false;
					
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
			
				if(this.tarjetascreditosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTarjetasCreditos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTarjetasCreditos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTarjetasCreditos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tarjetascreditos.getsType().equals("DUPLICADO")
				   || this.tarjetascreditos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTarjetasCreditos=true;
				
				} else {
					this.isEsNuevoTarjetasCreditos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
					if(this.tarjetascreditos.getId()>=0 && !this.tarjetascreditos.getIsNew()) {						
						this.isEsNuevoTarjetasCreditos=false;
						
					} else {
						this.isEsNuevoTarjetasCreditos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTarjetasCreditos(esRelaciones);						
				
				this.seleccionarTarjetasCreditos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tarjetascreditos.getId()<0) {
					this.isEsNuevoTarjetasCreditos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTarjetasCreditos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTarjetasCreditos(evt,rowIndex);
				}	
				
				if(this.tarjetascreditosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TarjetasCreditos: " + this.dDif); 
					}
				}								
				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTarjetasCreditos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tarjetascreditos)) {
					if(this.tarjetascreditos.getId()>0) {
						this.tarjetascreditos.setIsDeleted(true);
						
						this.tarjetascreditossEliminados.add(this.tarjetascreditos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tarjetascreditosLogic.getTarjetasCreditoss().remove(this.tarjetascreditos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tarjetascreditoss.remove(this.tarjetascreditos);				
					}
					
					
					((TarjetasCreditosModel) this.jTableDatosTarjetasCreditos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTarjetasCreditos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTarjetasCreditos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTarjetasCreditos) {
			
			if(this.jInternalFrameDetalleFormTarjetasCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTarjetasCreditos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTarjetasCreditos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TarjetasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTarjetasCreditos(this.tarjetascreditos);
				}
				
				//ARCHITECTURE
				try {
					

					//TarjetaCredito
					if(!this.tarjetascreditosConstantesFunciones.cargarid_tarjeta_creditoTarjetasCreditos || this.tarjetascreditosConstantesFunciones.event_dependid_tarjeta_creditoTarjetasCreditos) {
						//this.cargarCombosTarjetaCreditosForeignKeyLista(" where id="+this.tarjetascreditos.getid_tarjeta_credito());
									//this.inicializarActualizarBindingTarjetasCreditos(false,false);
						this.tarjetacreditosForeignKey=new ArrayList<TarjetaCredito>();

						if(tarjetascreditos.getTarjetaCredito()!=null) {
							this.tarjetacreditosForeignKey.add(tarjetascreditos.getTarjetaCredito());
						}

						this.addItemDefectoCombosForeignKeyTarjetaCredito();
						this.cargarCombosFrameTarjetaCreditosForeignKey("Todos");
					}
					this.setActualTarjetaCreditoForeignKey(this.tarjetascreditos.getid_tarjeta_credito(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTarjetasCreditos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTarjetasCreditos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTarjetasCreditos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTarjetasCreditos(TarjetasCreditos tarjetascreditos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTarjetasCreditos(tarjetascreditos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTarjetasCreditos(TarjetasCreditos tarjetascreditos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTarjetasCreditos(tarjetascreditos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTarjetasCreditos(tarjetascreditos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTarjetasCreditos(tarjetascreditos);
	}
	
	public void setVariablesObjetoActualToFormularioTarjetasCreditos(TarjetasCreditos tarjetascreditos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTarjetasCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTarjetasCreditos.jLabelidTarjetasCreditos.setText(tarjetascreditos.getId().toString());
			this.jInternalFrameDetalleFormTarjetasCreditos.jTextAreanombre_tarjetaTarjetasCreditos.setText(tarjetascreditos.getnombre_tarjeta());
			this.jInternalFrameDetalleFormTarjetasCreditos.jTextFieldloteTarjetasCreditos.setText(tarjetascreditos.getlote());
			this.jInternalFrameDetalleFormTarjetasCreditos.jDateChooserfechaTarjetasCreditos.setDate(tarjetascreditos.getfecha());
			this.jInternalFrameDetalleFormTarjetasCreditos.jTextFieldtotalTarjetasCreditos.setText(tarjetascreditos.gettotal().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TarjetasCreditos tarjetascreditosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tarjetascreditosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TarjetasCreditos tarjetascreditosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tarjetascreditosLocal=this.tarjetascreditos;
			} else {
				tarjetascreditosLocal=this.tarjetascreditosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tarjetascreditosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTarjetasCreditos(tarjetascreditosLocal,true);
					
					if(tarjetascreditosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tarjetascreditosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tarjetascreditosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTarjetasCreditos(TarjetasCreditos tarjetascreditos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTarjetasCreditos(tarjetascreditos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(tarjetascreditos);
	}
	
	public void setVariablesFormularioToObjetoActualTarjetasCreditos(TarjetasCreditos tarjetascreditos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTarjetasCreditos(tarjetascreditos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTarjetasCreditos(TarjetasCreditos tarjetascreditos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTarjetasCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTarjetasCreditos.jLabelidTarjetasCreditos.getText()==null || this.jInternalFrameDetalleFormTarjetasCreditos.jLabelidTarjetasCreditos.getText()=="" || this.jInternalFrameDetalleFormTarjetasCreditos.jLabelidTarjetasCreditos.getText()=="Id") {
				this.jInternalFrameDetalleFormTarjetasCreditos.jLabelidTarjetasCreditos.setText("0");
			}

			if(conColumnasBase) {tarjetascreditos.setId(Long.parseLong(this.jInternalFrameDetalleFormTarjetasCreditos.jLabelidTarjetasCreditos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TarjetasCreditosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetasCreditos.jLabelIdTarjetasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tarjetascreditos.setnombre_tarjeta(this.jInternalFrameDetalleFormTarjetasCreditos.jTextAreanombre_tarjetaTarjetasCreditos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TarjetasCreditosConstantesFunciones.LABEL_NOMBRETARJETA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetasCreditos.jLabelnombre_tarjetaTarjetasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tarjetascreditos.setlote(this.jInternalFrameDetalleFormTarjetasCreditos.jTextFieldloteTarjetasCreditos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TarjetasCreditosConstantesFunciones.LABEL_LOTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetasCreditos.jLabelloteTarjetasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tarjetascreditos.setfecha(this.jInternalFrameDetalleFormTarjetasCreditos.jDateChooserfechaTarjetasCreditos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TarjetasCreditosConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetasCreditos.jLabelfechaTarjetasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tarjetascreditos.settotal(Double.parseDouble(this.jInternalFrameDetalleFormTarjetasCreditos.jTextFieldtotalTarjetasCreditos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TarjetasCreditosConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetasCreditos.jLabeltotalTarjetasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTarjetasCreditos(TarjetasCreditos tarjetascreditosBean,TarjetasCreditos tarjetascreditos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTarjetasCreditos(TarjetasCreditos tarjetascreditosOrigen,TarjetasCreditos tarjetascreditos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tarjetascreditosOrigen.getId()!=null && !tarjetascreditosOrigen.getId().equals(0L))) {tarjetascreditos.setId(tarjetascreditosOrigen.getId());}}
			if(conDefault || (!conDefault && tarjetascreditosOrigen.getid_tarjeta_credito()!=null && !tarjetascreditosOrigen.getid_tarjeta_credito().equals(-1L))) {tarjetascreditos.setid_tarjeta_credito(tarjetascreditosOrigen.getid_tarjeta_credito());}
			if(conDefault || (!conDefault && tarjetascreditosOrigen.getfecha_inicio()!=null && !tarjetascreditosOrigen.getfecha_inicio().equals(new Date()))) {tarjetascreditos.setfecha_inicio(tarjetascreditosOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && tarjetascreditosOrigen.getfecha_fin()!=null && !tarjetascreditosOrigen.getfecha_fin().equals(new Date()))) {tarjetascreditos.setfecha_fin(tarjetascreditosOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && tarjetascreditosOrigen.getnombre_tarjeta()!=null && !tarjetascreditosOrigen.getnombre_tarjeta().equals(""))) {tarjetascreditos.setnombre_tarjeta(tarjetascreditosOrigen.getnombre_tarjeta());}
			if(conDefault || (!conDefault && tarjetascreditosOrigen.getlote()!=null && !tarjetascreditosOrigen.getlote().equals(""))) {tarjetascreditos.setlote(tarjetascreditosOrigen.getlote());}
			if(conDefault || (!conDefault && tarjetascreditosOrigen.getfecha()!=null && !tarjetascreditosOrigen.getfecha().equals(new Date()))) {tarjetascreditos.setfecha(tarjetascreditosOrigen.getfecha());}
			if(conDefault || (!conDefault && tarjetascreditosOrigen.gettotal()!=null && !tarjetascreditosOrigen.gettotal().equals(0.0))) {tarjetascreditos.settotal(tarjetascreditosOrigen.gettotal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTarjetasCreditos(TarjetasCreditos tarjetascreditos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTarjetasCreditos.jLabelidTarjetasCreditos.setText(tarjetascreditos.getId().toString());
			this.jInternalFrameDetalleFormTarjetasCreditos.jTextAreanombre_tarjetaTarjetasCreditos.setText(tarjetascreditos.getnombre_tarjeta());
			this.jInternalFrameDetalleFormTarjetasCreditos.jTextFieldloteTarjetasCreditos.setText(tarjetascreditos.getlote());
			this.jInternalFrameDetalleFormTarjetasCreditos.jDateChooserfechaTarjetasCreditos.setDate(tarjetascreditos.getfecha());
			this.jInternalFrameDetalleFormTarjetasCreditos.jTextFieldtotalTarjetasCreditos.setText(tarjetascreditos.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTarjetasCreditos(TarjetasCreditosBean tarjetascreditosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTarjetasCreditos.jLabelidTarjetasCreditos.setText(tarjetascreditosBean.getId().toString());
			this.jInternalFrameDetalleFormTarjetasCreditos.jTextAreanombre_tarjetaTarjetasCreditos.setText(tarjetascreditosBean.getnombre_tarjeta());
			this.jInternalFrameDetalleFormTarjetasCreditos.jTextFieldloteTarjetasCreditos.setText(tarjetascreditosBean.getlote());
			this.jInternalFrameDetalleFormTarjetasCreditos.jDateChooserfechaTarjetasCreditos.setDate(tarjetascreditosBean.getfecha());
			this.jInternalFrameDetalleFormTarjetasCreditos.jTextFieldtotalTarjetasCreditos.setText(tarjetascreditosBean.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTarjetasCreditos(TarjetasCreditosParameterReturnGeneral tarjetascreditosReturnGeneral,TarjetasCreditosBean tarjetascreditosBean,Boolean conDefault) throws Exception { 
		try {
			TarjetasCreditos tarjetascreditosLocal=new TarjetasCreditos();
			
			tarjetascreditosLocal=tarjetascreditosReturnGeneral.getTarjetasCreditos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tarjetascreditosLocal.getId()!=null && !tarjetascreditosLocal.getId().equals(0L))) {tarjetascreditosBean.setId(tarjetascreditosLocal.getId());}}
			if(conDefault || (!conDefault && tarjetascreditosLocal.getnombre_tarjeta()!=null && !tarjetascreditosLocal.getnombre_tarjeta().equals(""))) {tarjetascreditosBean.setnombre_tarjeta(tarjetascreditosLocal.getnombre_tarjeta());}
			if(conDefault || (!conDefault && tarjetascreditosLocal.getlote()!=null && !tarjetascreditosLocal.getlote().equals(""))) {tarjetascreditosBean.setlote(tarjetascreditosLocal.getlote());}
			if(conDefault || (!conDefault && tarjetascreditosLocal.getfecha()!=null && !tarjetascreditosLocal.getfecha().equals(new Date()))) {tarjetascreditosBean.setfecha(tarjetascreditosLocal.getfecha());}
			if(conDefault || (!conDefault && tarjetascreditosLocal.gettotal()!=null && !tarjetascreditosLocal.gettotal().equals(0.0))) {tarjetascreditosBean.settotal(tarjetascreditosLocal.gettotal());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTarjetasCreditosGenerico(Long idTarjetasCreditosSeleccionado,JComboBox jComboBoxTarjetasCreditos,List<TarjetasCreditos> tarjetascreditossLocal)throws Exception {
		try {
			TarjetasCreditos  tarjetascreditosTemp=null;

			for(TarjetasCreditos tarjetascreditosAux:tarjetascreditossLocal) {
				if(tarjetascreditosAux.getId()!=null && tarjetascreditosAux.getId().equals(idTarjetasCreditosSeleccionado)) {
					tarjetascreditosTemp=tarjetascreditosAux;
					break;
				}
			}

			jComboBoxTarjetasCreditos.setSelectedItem(tarjetascreditosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTarjetasCreditosGenerico(JComboBox jComboBoxTarjetasCreditos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTarjetasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTarjetasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTarjetasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTarjetasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTarjetasCreditos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTarjetasCreditos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTarjetasCreditos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTarjetasCreditos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTarjetasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTarjetasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tarjetascreditos=(TarjetasCreditos) tarjetascreditosLogic.getTarjetasCreditoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tarjetascreditos =(TarjetasCreditos) tarjetascreditoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tarjetascreditos.getIsNew() && !tarjetascreditos.getIsChanged() && !tarjetascreditos.getIsDeleted()) {
				sDescripcion=tarjetascreditos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tarjetascreditos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!tarjetascreditos.getIsNew() && !tarjetascreditos.getIsChanged() && !tarjetascreditos.getIsDeleted()) {
				sDescripcion=tarjetascreditos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=tarjetascreditos.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("TarjetaCredito")) {
			//sDescripcion=this.getActualTarjetaCreditoForeignKeyDescripcion((Long)value);
			if(!tarjetascreditos.getIsNew() && !tarjetascreditos.getIsChanged() && !tarjetascreditos.getIsDeleted()) {
				sDescripcion=tarjetascreditos.gettarjetacredito_descripcion();
			} else {
				//sDescripcion=this.getActualTarjetaCreditoForeignKeyDescripcion((Long)value);
				sDescripcion=tarjetascreditos.gettarjetacredito_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TarjetasCreditos tarjetascreditosRow=new TarjetasCreditos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tarjetascreditosRow=(TarjetasCreditos) tarjetascreditosLogic.getTarjetasCreditoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tarjetascreditosRow=(TarjetasCreditos) tarjetascreditoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTarjetasCreditos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTarjetasCreditos.setVisible((this.isVisibilidadCeldaNuevoTarjetasCreditos && this.isPermisoNuevoTarjetasCreditos));			
			this.jButtonDuplicarTarjetasCreditos.setVisible((this.isVisibilidadCeldaDuplicarTarjetasCreditos && this.isPermisoDuplicarTarjetasCreditos));			
			this.jButtonCopiarTarjetasCreditos.setVisible((this.isVisibilidadCeldaCopiarTarjetasCreditos && this.isPermisoCopiarTarjetasCreditos));
			this.jButtonVerFormTarjetasCreditos.setVisible((this.isVisibilidadCeldaVerFormTarjetasCreditos && this.isPermisoVerFormTarjetasCreditos));
			
			this.jButtonAbrirOrderByTarjetasCreditos.setVisible((this.isVisibilidadCeldaOrdenTarjetasCreditos && this.isPermisoOrdenTarjetasCreditos));			
			
			this.jButtonNuevoRelacionesTarjetasCreditos.setVisible((this.isVisibilidadCeldaNuevoRelacionesTarjetasCreditos && this.isPermisoNuevoTarjetasCreditos));			
			this.jButtonNuevoGuardarCambiosTarjetasCreditos.setVisible((this.isVisibilidadCeldaNuevoTarjetasCreditos && this.isPermisoNuevoTarjetasCreditos && this.isPermisoGuardarCambiosTarjetasCreditos));
			
			if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonModificarTarjetasCreditos.setVisible((this.isVisibilidadCeldaModificarTarjetasCreditos && this.isPermisoActualizarTarjetasCreditos));	
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonActualizarTarjetasCreditos.setVisible((this.isVisibilidadCeldaActualizarTarjetasCreditos && this.isPermisoActualizarTarjetasCreditos));	
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonEliminarTarjetasCreditos.setVisible((this.isVisibilidadCeldaEliminarTarjetasCreditos && this.isPermisoEliminarTarjetasCreditos));
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonCancelarTarjetasCreditos.setVisible(this.isVisibilidadCeldaCancelarTarjetasCreditos);							
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonGuardarCambiosTarjetasCreditos.setVisible((this.isVisibilidadCeldaGuardarTarjetasCreditos && this.isPermisoGuardarCambiosTarjetasCreditos));			
			
			}
						
			this.jButtonGuardarCambiosTablaTarjetasCreditos.setVisible((this.isVisibilidadCeldaGuardarCambiosTarjetasCreditos && this.isPermisoGuardarCambiosTarjetasCreditos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTarjetasCreditos.setVisible((this.isVisibilidadCeldaNuevoTarjetasCreditos && this.isPermisoNuevoTarjetasCreditos));						
			this.jButtonDuplicarToolBarTarjetasCreditos.setVisible((this.isVisibilidadCeldaDuplicarTarjetasCreditos && this.isPermisoDuplicarTarjetasCreditos));						
			this.jButtonCopiarToolBarTarjetasCreditos.setVisible((this.isVisibilidadCeldaCopiarTarjetasCreditos && this.isPermisoCopiarTarjetasCreditos));			
			this.jButtonVerFormToolBarTarjetasCreditos.setVisible((this.isVisibilidadCeldaVerFormTarjetasCreditos && this.isPermisoVerFormTarjetasCreditos));			
			this.jButtonAbrirOrderByToolBarTarjetasCreditos.setVisible((this.isVisibilidadCeldaOrdenTarjetasCreditos && this.isPermisoOrdenTarjetasCreditos));
			this.jButtonNuevoRelacionesToolBarTarjetasCreditos.setVisible((this.isVisibilidadCeldaNuevoRelacionesTarjetasCreditos && this.isPermisoNuevoTarjetasCreditos));			
			this.jButtonNuevoGuardarCambiosToolBarTarjetasCreditos.setVisible((this.isVisibilidadCeldaNuevoTarjetasCreditos && this.isPermisoNuevoTarjetasCreditos && this.isPermisoGuardarCambiosTarjetasCreditos));			
			
			if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonModificarToolBarTarjetasCreditos.setVisible((this.isVisibilidadCeldaModificarTarjetasCreditos && this.isPermisoActualizarTarjetasCreditos));	
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonActualizarToolBarTarjetasCreditos.setVisible((this.isVisibilidadCeldaActualizarTarjetasCreditos  && this.isPermisoActualizarTarjetasCreditos));	
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonEliminarToolBarTarjetasCreditos.setVisible((this.isVisibilidadCeldaEliminarTarjetasCreditos && this.isPermisoEliminarTarjetasCreditos));
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonCancelarToolBarTarjetasCreditos.setVisible(this.isVisibilidadCeldaCancelarTarjetasCreditos);				
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonGuardarCambiosToolBarTarjetasCreditos.setVisible((this.isVisibilidadCeldaGuardarTarjetasCreditos && this.isPermisoGuardarCambiosTarjetasCreditos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTarjetasCreditos.setVisible((this.isVisibilidadCeldaGuardarCambiosTarjetasCreditos && this.isPermisoGuardarCambiosTarjetasCreditos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTarjetasCreditos.setVisible((this.isVisibilidadCeldaNuevoTarjetasCreditos && this.isPermisoNuevoTarjetasCreditos));			
			this.jMenuItemDuplicarTarjetasCreditos.setVisible((this.isVisibilidadCeldaDuplicarTarjetasCreditos && this.isPermisoDuplicarTarjetasCreditos));			
			this.jMenuItemCopiarTarjetasCreditos.setVisible((this.isVisibilidadCeldaCopiarTarjetasCreditos && this.isPermisoCopiarTarjetasCreditos));			
			this.jMenuItemVerFormTarjetasCreditos.setVisible((this.isVisibilidadCeldaVerFormTarjetasCreditos && this.isPermisoVerFormTarjetasCreditos));			
			this.jMenuItemAbrirOrderByTarjetasCreditos.setVisible((this.isVisibilidadCeldaOrdenTarjetasCreditos && this.isPermisoOrdenTarjetasCreditos));			
			//this.jMenuItemMostrarOcultarTarjetasCreditos.setVisible((this.isVisibilidadCeldaOrdenTarjetasCreditos && this.isPermisoOrdenTarjetasCreditos));
			this.jMenuItemDetalleAbrirOrderByTarjetasCreditos.setVisible((this.isVisibilidadCeldaOrdenTarjetasCreditos && this.isPermisoOrdenTarjetasCreditos));			
			//this.jMenuItemDetalleMostrarOcultarTarjetasCreditos.setVisible((this.isVisibilidadCeldaOrdenTarjetasCreditos && this.isPermisoOrdenTarjetasCreditos));			
			this.jMenuItemNuevoRelacionesTarjetasCreditos.setVisible((this.isVisibilidadCeldaNuevoRelacionesTarjetasCreditos && this.isPermisoNuevoTarjetasCreditos));			
			this.jMenuItemNuevoGuardarCambiosTarjetasCreditos.setVisible((this.isVisibilidadCeldaNuevoTarjetasCreditos && this.isPermisoNuevoTarjetasCreditos && this.isPermisoGuardarCambiosTarjetasCreditos));									
			
			if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
			this.jInternalFrameDetalleFormTarjetasCreditos.jMenuItemModificarTarjetasCreditos.setVisible((this.isVisibilidadCeldaModificarTarjetasCreditos && this.isPermisoActualizarTarjetasCreditos));	
			this.jInternalFrameDetalleFormTarjetasCreditos.jMenuItemActualizarTarjetasCreditos.setVisible((this.isVisibilidadCeldaActualizarTarjetasCreditos && this.isPermisoActualizarTarjetasCreditos));	
			this.jInternalFrameDetalleFormTarjetasCreditos.jMenuItemEliminarTarjetasCreditos.setVisible((this.isVisibilidadCeldaEliminarTarjetasCreditos && this.isPermisoEliminarTarjetasCreditos));
			this.jInternalFrameDetalleFormTarjetasCreditos.jMenuItemCancelarTarjetasCreditos.setVisible(this.isVisibilidadCeldaCancelarTarjetasCreditos);				
			}
			
			this.jMenuItemGuardarCambiosTarjetasCreditos.setVisible((this.isVisibilidadCeldaGuardarTarjetasCreditos && this.isPermisoGuardarCambiosTarjetasCreditos));						
			this.jMenuItemGuardarCambiosTablaTarjetasCreditos.setVisible((this.isVisibilidadCeldaGuardarCambiosTarjetasCreditos && this.isPermisoGuardarCambiosTarjetasCreditos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTarjetasCreditos=this.jButtonNuevoTarjetasCreditos.isVisible();
			this.isVisibilidadCeldaDuplicarTarjetasCreditos=this.jButtonDuplicarTarjetasCreditos.isVisible();
			this.isVisibilidadCeldaCopiarTarjetasCreditos=this.jButtonCopiarTarjetasCreditos.isVisible();
			this.isVisibilidadCeldaVerFormTarjetasCreditos=this.jButtonVerFormTarjetasCreditos.isVisible();
			
			this.isVisibilidadCeldaOrdenTarjetasCreditos=this.jButtonAbrirOrderByTarjetasCreditos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTarjetasCreditos=this.jButtonNuevoRelacionesTarjetasCreditos.isVisible();
			this.isVisibilidadCeldaModificarTarjetasCreditos=this.jButtonModificarTarjetasCreditos.isVisible();
			
			if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
			this.isVisibilidadCeldaActualizarTarjetasCreditos=this.jInternalFrameDetalleFormTarjetasCreditos.jButtonActualizarTarjetasCreditos.isVisible();
			this.isVisibilidadCeldaEliminarTarjetasCreditos=this.jInternalFrameDetalleFormTarjetasCreditos.jButtonEliminarTarjetasCreditos.isVisible();
			this.isVisibilidadCeldaCancelarTarjetasCreditos=this.jInternalFrameDetalleFormTarjetasCreditos.jButtonCancelarTarjetasCreditos.isVisible();
			this.isVisibilidadCeldaGuardarTarjetasCreditos=this.jInternalFrameDetalleFormTarjetasCreditos.jButtonGuardarCambiosTarjetasCreditos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTarjetasCreditos=this.jButtonGuardarCambiosTablaTarjetasCreditos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTarjetasCreditos=this.jButtonNuevoToolBarTarjetasCreditos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTarjetasCreditos=this.jButtonNuevoRelacionesToolBarTarjetasCreditos.isVisible();
			
			if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
			this.isVisibilidadCeldaModificarTarjetasCreditos=this.jInternalFrameDetalleFormTarjetasCreditos.jButtonModificarToolBarTarjetasCreditos.isVisible();
			this.isVisibilidadCeldaActualizarTarjetasCreditos=this.jInternalFrameDetalleFormTarjetasCreditos.jButtonActualizarToolBarTarjetasCreditos.isVisible();
			this.isVisibilidadCeldaEliminarTarjetasCreditos=this.jInternalFrameDetalleFormTarjetasCreditos.jButtonEliminarToolBarTarjetasCreditos.isVisible();
			this.isVisibilidadCeldaCancelarTarjetasCreditos=this.jInternalFrameDetalleFormTarjetasCreditos.jButtonCancelarToolBarTarjetasCreditos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTarjetasCreditos=this.jButtonGuardarCambiosToolBarTarjetasCreditos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTarjetasCreditos=this.jButtonGuardarCambiosTablaToolBarTarjetasCreditos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTarjetasCreditos=this.jMenuItemNuevoTarjetasCreditos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTarjetasCreditos=this.jMenuItemNuevoRelacionesTarjetasCreditos.isVisible();
			
			if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
			this.isVisibilidadCeldaModificarTarjetasCreditos=this.jInternalFrameDetalleFormTarjetasCreditos.jMenuItemModificarTarjetasCreditos.isVisible();
			this.isVisibilidadCeldaActualizarTarjetasCreditos=this.jInternalFrameDetalleFormTarjetasCreditos.jMenuItemActualizarTarjetasCreditos.isVisible();
			this.isVisibilidadCeldaEliminarTarjetasCreditos=this.jInternalFrameDetalleFormTarjetasCreditos.jMenuItemEliminarTarjetasCreditos.isVisible();
			this.isVisibilidadCeldaCancelarTarjetasCreditos=this.jInternalFrameDetalleFormTarjetasCreditos.jMenuItemCancelarTarjetasCreditos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTarjetasCreditos=this.jMenuItemGuardarCambiosTarjetasCreditos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTarjetasCreditos=this.jMenuItemGuardarCambiosTablaTarjetasCreditos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTarjetasCreditos(Boolean esInicializar) {
		if(TarjetasCreditosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tarjetascreditosSessionBean.getConGuardarRelaciones()) {
				//if(this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTarjetasCreditos();
			}
			
			this.inicializarActualizarBindingBotonesManualTarjetasCreditos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTarjetasCreditos() {
		this.jButtonNuevoTarjetasCreditos.setVisible(this.isPermisoNuevoTarjetasCreditos);			
		this.jButtonDuplicarTarjetasCreditos.setVisible(this.isPermisoDuplicarTarjetasCreditos);			
		this.jButtonCopiarTarjetasCreditos.setVisible(this.isPermisoCopiarTarjetasCreditos);			
		this.jButtonVerFormTarjetasCreditos.setVisible(this.isPermisoVerFormTarjetasCreditos);			
		
		this.jButtonAbrirOrderByTarjetasCreditos.setVisible(this.isPermisoOrdenTarjetasCreditos);					
		
		this.jButtonNuevoRelacionesTarjetasCreditos.setVisible(this.isPermisoNuevoTarjetasCreditos);			
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonModificarTarjetasCreditos.setVisible(this.isPermisoActualizarTarjetasCreditos);	
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonActualizarTarjetasCreditos.setVisible(this.isPermisoActualizarTarjetasCreditos);	
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonEliminarTarjetasCreditos.setVisible(this.isPermisoEliminarTarjetasCreditos);
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonCancelarTarjetasCreditos.setVisible(this.isVisibilidadCeldaCancelarTarjetasCreditos);						
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonGuardarCambiosTarjetasCreditos.setVisible(this.isPermisoGuardarCambiosTarjetasCreditos);							
		}
		
		this.jButtonGuardarCambiosTablaTarjetasCreditos.setVisible(this.isPermisoActualizarTarjetasCreditos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTarjetasCreditos() {
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonModificarTarjetasCreditos.setVisible(this.isPermisoActualizarTarjetasCreditos);	
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonActualizarTarjetasCreditos.setVisible(this.isPermisoActualizarTarjetasCreditos);	
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonEliminarTarjetasCreditos.setVisible(this.isPermisoEliminarTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonCancelarTarjetasCreditos.setVisible(this.isVisibilidadCeldaCancelarTarjetasCreditos);							
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonGuardarCambiosTarjetasCreditos.setVisible((this.isVisibilidadCeldaGuardarTarjetasCreditos && this.isPermisoGuardarCambiosTarjetasCreditos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTarjetasCreditos() {
		if(TarjetasCreditosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTarjetasCreditos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTarjetasCreditos() {
	}
	
	public void jTableDatosTarjetasCreditosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTarjetasCreditos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTarjetasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.gettarjetascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetascreditos==null) {
						this.tarjetascreditos = new TarjetasCreditos();
					}

					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.tarjetascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
				}

				if(this.tarjetascreditos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tarjetascreditos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTarjetasCreditosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTarjetasCreditos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTarjetasCreditos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTarjetasCreditos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.gettarjetascreditos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tarjetascreditosLogic.getConnexion());

				if(this.tarjetascreditos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tarjetascreditos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTarjetasCreditos=(TitledBorder)this.jScrollPanelDatosTarjetasCreditos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTarjetasCreditos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTarjetasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.gettarjetascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetascreditos==null) {
						this.tarjetascreditos = new TarjetasCreditos();
					}

					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.tarjetascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
				}

				if(this.tarjetascreditos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tarjetascreditos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalTarjetasCreditosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebTarjetasCreditos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTarjetasCreditos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTarjetasCreditos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.gettarjetascreditos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.tarjetascreditosLogic.getConnexion());

				if(this.tarjetascreditos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.tarjetascreditos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTarjetasCreditos=(TitledBorder)this.jScrollPanelDatosTarjetasCreditos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderTarjetasCreditos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalTarjetasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.gettarjetascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetascreditos==null) {
						this.tarjetascreditos = new TarjetasCreditos();
					}

					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.tarjetascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
				}

				if(this.tarjetascreditos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.tarjetascreditos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tarjeta_creditoTarjetasCreditosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotarjetacredito=true;

			idTienePermisotarjetacredito=this.tienePermisosUsuarioEnPaginaWebTarjetasCreditos(TarjetaCreditoConstantesFunciones.CLASSNAME);

			if(idTienePermisotarjetacredito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTarjetasCreditos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTarjetasCreditos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.gettarjetascreditos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);

				this.tarjetacreditoBeanSwingJInternalFrame=new TarjetaCreditoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tarjetacreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tarjetacreditoBeanSwingJInternalFrame.getTarjetaCreditoLogic().setConnexion(this.tarjetascreditosLogic.getConnexion());

				if(this.tarjetascreditos.getid_tarjeta_credito()!=null) {
					this.tarjetacreditoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tarjetacreditoBeanSwingJInternalFrame.setIdActual(this.tarjetascreditos.getid_tarjeta_credito());
					this.tarjetacreditoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tarjetacreditoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tarjetacreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTarjetaCredito();
				}

				JInternalFrameBase jinternalFrame =this.tarjetacreditoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTarjetasCreditos=(TitledBorder)this.jScrollPanelDatosTarjetasCreditos.getBorder();
				TitledBorder titledBordertarjetacredito=(TitledBorder)this.tarjetacreditoBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCredito.getBorder();

				titledBordertarjetacredito.setTitle(titledBorderTarjetasCreditos.getTitle() + " -> Tarjeta Credito");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tarjeta_creditoTarjetasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.gettarjetascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetascreditos==null) {
						this.tarjetascreditos = new TarjetasCreditos();
					}

					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.tarjetascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
				}

				if(this.tarjetascreditos.getid_tarjeta_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tarjeta_credito = "+this.tarjetascreditos.getid_tarjeta_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioTarjetasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.gettarjetascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetascreditos==null) {
						this.tarjetascreditos = new TarjetasCreditos();
					}

					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.tarjetascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
				}

				if(this.tarjetascreditos.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.tarjetascreditos.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finTarjetasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.gettarjetascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetascreditos==null) {
						this.tarjetascreditos = new TarjetasCreditos();
					}

					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.tarjetascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
				}

				if(this.tarjetascreditos.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.tarjetascreditos.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_tarjetaTarjetasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.gettarjetascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetascreditos==null) {
						this.tarjetascreditos = new TarjetasCreditos();
					}

					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.tarjetascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
				}

				if(this.tarjetascreditos.getnombre_tarjeta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_tarjeta like '%"+this.tarjetascreditos.getnombre_tarjeta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonloteTarjetasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.gettarjetascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetascreditos==null) {
						this.tarjetascreditos = new TarjetasCreditos();
					}

					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.tarjetascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
				}

				if(this.tarjetascreditos.getlote()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where lote like '%"+this.tarjetascreditos.getlote()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaTarjetasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.gettarjetascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetascreditos==null) {
						this.tarjetascreditos = new TarjetasCreditos();
					}

					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.tarjetascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
				}

				if(this.tarjetascreditos.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.tarjetascreditos.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalTarjetasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.gettarjetascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetascreditos==null) {
						this.tarjetascreditos = new TarjetasCreditos();
					}

					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.tarjetascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);
				}

				if(this.tarjetascreditos.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.tarjetascreditos.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaTarjetaCreditoTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTarjetasCreditos(false,false);

			this.getTarjetasCreditossBusquedaTarjetaCredito();

			this.inicializarActualizarBindingTarjetasCreditos(false);

			//if(TarjetasCreditosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTarjetasCreditos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTarjetasCreditos(false,false);

			this.getTarjetasCreditossFK_IdEmpresa();

			this.inicializarActualizarBindingTarjetasCreditos(false);

			//if(TarjetasCreditosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTarjetasCreditos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTarjetasCreditos(false,false);

			this.getTarjetasCreditossFK_IdSucursal();

			this.inicializarActualizarBindingTarjetasCreditos(false);

			//if(TarjetasCreditosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTarjetasCreditos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTarjetaCreditoTarjetasCreditosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTarjetasCreditos(false,false);

			this.getTarjetasCreditossFK_IdTarjetaCredito();

			this.inicializarActualizarBindingTarjetasCreditos(false);

			//if(TarjetasCreditosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTarjetasCreditos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetascreditosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTarjetasCreditos() {
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
			this.jInternalFrameDetalleFormTarjetasCreditos.setVisible(false);	    			
			this.jInternalFrameDetalleFormTarjetasCreditos.dispose();
			this.jInternalFrameDetalleFormTarjetasCreditos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTarjetasCreditos!=null) {
			this.jInternalFrameReporteDinamicoTarjetasCreditos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTarjetasCreditos.dispose();
			this.jInternalFrameReporteDinamicoTarjetasCreditos=null;
		}
		
		if(this.jInternalFrameImportacionTarjetasCreditos!=null) {
			this.jInternalFrameImportacionTarjetasCreditos.setVisible(false);	    			
			this.jInternalFrameImportacionTarjetasCreditos.dispose();
			this.jInternalFrameImportacionTarjetasCreditos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTarjetasCreditos();
			
			TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
			
			
			if(sTipo.equals("NuevoTarjetasCreditos")) {
				jButtonNuevoTarjetasCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTarjetasCreditos")) {
				jButtonDuplicarTarjetasCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTarjetasCreditos")) {
				jButtonCopiarTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("VerFormTarjetasCreditos")) {
				jButtonVerFormTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTarjetasCreditos")) {
				jButtonNuevoTarjetasCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTarjetasCreditos")) {
				jButtonDuplicarTarjetasCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTarjetasCreditos")) {
				jButtonNuevoTarjetasCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTarjetasCreditos")) {
				jButtonDuplicarTarjetasCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTarjetasCreditos")) {
				jButtonNuevoTarjetasCreditosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTarjetasCreditos")) {
				jButtonNuevoTarjetasCreditosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTarjetasCreditos")) {
				jButtonNuevoTarjetasCreditosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTarjetasCreditos")) {
				jButtonModificarTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTarjetasCreditos")) {
				jButtonModificarTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTarjetasCreditos")) {
				jButtonModificarTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTarjetasCreditos")) {
				jButtonActualizarTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTarjetasCreditos")) {
				jButtonActualizarTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTarjetasCreditos")) {
				jButtonActualizarTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("EliminarTarjetasCreditos")) {
				jButtonEliminarTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTarjetasCreditos")) {
				jButtonEliminarTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTarjetasCreditos")) {
				jButtonEliminarTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("CancelarTarjetasCreditos")) {
				jButtonCancelarTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTarjetasCreditos")) {
				jButtonCancelarTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTarjetasCreditos")) {
				jButtonCancelarTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("CerrarTarjetasCreditos")) {
				jButtonCerrarTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTarjetasCreditos")) {
				jButtonCerrarTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTarjetasCreditos")) {
				jButtonCerrarTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTarjetasCreditos")) {
				jButtonMostrarOcultarTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTarjetasCreditos")) {
				jButtonCancelarTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTarjetasCreditos")) {
				jButtonGuardarCambiosTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTarjetasCreditos")) {
				jButtonGuardarCambiosTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTarjetasCreditos")) {
				jButtonCopiarTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTarjetasCreditos")) {
				jButtonVerFormTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTarjetasCreditos")) {
				jButtonGuardarCambiosTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTarjetasCreditos")) {
				jButtonCopiarTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTarjetasCreditos")) {
				jButtonVerFormTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTarjetasCreditos")) {
				jButtonGuardarCambiosTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTarjetasCreditos")) {
				jButtonGuardarCambiosTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTarjetasCreditos")) {
				jButtonGuardarCambiosTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTarjetasCreditos")) {
				jButtonRecargarInformacionTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTarjetasCreditos")) {
				jButtonRecargarInformacionTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTarjetasCreditos")) {
				jButtonRecargarInformacionTarjetasCreditosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTarjetasCreditos")) {
				jButtonAnterioresTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTarjetasCreditos")) {
				jButtonAnterioresTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTarjetasCreditos")) {
				jButtonAnterioresTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTarjetasCreditos")) {
				jButtonSiguientesTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTarjetasCreditos")) {
				jButtonSiguientesTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTarjetasCreditos")) {
				jButtonSiguientesTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTarjetasCreditos") || sTipo.equals("MenuItemDetalleAbrirOrderByTarjetasCreditos")) {
				jButtonAbrirOrderByTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTarjetasCreditos") || sTipo.equals("MenuItemDetalleMostrarOcultarTarjetasCreditos")) {
				jButtonMostrarOcultarTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTarjetasCreditos")) {
				jButtonNuevoGuardarCambiosTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTarjetasCreditos")) {
				jButtonNuevoGuardarCambiosTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTarjetasCreditos")) {
				jButtonNuevoGuardarCambiosTarjetasCreditosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTarjetasCreditos")) {
				jButtonCerrarReporteDinamicoTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTarjetasCreditos")) {
				jButtonGenerarReporteDinamicoTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTarjetasCreditos")) {
				
				jButtonGenerarExcelReporteDinamicoTarjetasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTarjetasCreditos")) {
				jButtonCerrarImportacionTarjetasCreditosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTarjetasCreditos")) {
				
				jButtonGenerarImportacionTarjetasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTarjetasCreditos")) {
				
				jButtonAbrirImportacionTarjetasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTarjetasCreditos")) {
				jComboBoxTiposAccionesTarjetasCreditosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTarjetasCreditos")) {
				jComboBoxTiposRelacionesTarjetasCreditosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTarjetasCreditos")) {
				jComboBoxTiposAccionesTarjetasCreditosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTarjetasCreditos")) {
				
				jComboBoxTiposSeleccionarTarjetasCreditosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTarjetasCreditos")) {
				jTextFieldValorCampoGeneralTarjetasCreditosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTarjetasCreditos")) {
				jButtonAbrirOrderByTarjetasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTarjetasCreditos")) {
				jButtonAbrirOrderByTarjetasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTarjetasCreditos")) {
				jButtonCerrarOrderByTarjetasCreditosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTarjetasCreditosBusqueda")) {
				this.jButtonidTarjetasCreditosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTarjetasCreditosUpdate")) {
				this.jButtonid_empresaTarjetasCreditosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTarjetasCreditosBusqueda")) {
				this.jButtonid_empresaTarjetasCreditosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTarjetasCreditosUpdate")) {
				this.jButtonid_sucursalTarjetasCreditosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTarjetasCreditosBusqueda")) {
				this.jButtonid_sucursalTarjetasCreditosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tarjeta_creditoTarjetasCreditosUpdate")) {
				this.jButtonid_tarjeta_creditoTarjetasCreditosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tarjeta_creditoTarjetasCreditosBusqueda")) {
				this.jButtonid_tarjeta_creditoTarjetasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioTarjetasCreditosBusqueda")) {
				this.jButtonfecha_inicioTarjetasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finTarjetasCreditosBusqueda")) {
				this.jButtonfecha_finTarjetasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tarjetaTarjetasCreditosBusqueda")) {
				this.jButtonnombre_tarjetaTarjetasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("loteTarjetasCreditosBusqueda")) {
				this.jButtonloteTarjetasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaTarjetasCreditosBusqueda")) {
				this.jButtonfechaTarjetasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalTarjetasCreditosBusqueda")) {
				this.jButtontotalTarjetasCreditosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaTarjetaCreditoTarjetasCreditos")) {
				this.jButtonBusquedaTarjetaCreditoTarjetasCreditosActionPerformed(evt);
			}
			
			;
			
			
			TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTarjetasCreditos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTarjetasCreditosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetascreditos);
				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
				
				


				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetasCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TarjetasCreditos tarjetascreditosLocal=null;
			
			if(!this.getEsControlTabla()) {
				tarjetascreditosLocal=this.tarjetascreditos;
			} else {
				tarjetascreditosLocal=this.tarjetascreditosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetascreditos);
				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
							
				
				


				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetasCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetasCreditosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosAnterior =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetascreditosAnterior =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
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
			
			TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
			
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
			
			


			
			TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTarjetasCreditosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetascreditos);
				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
								
						
				


				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetasCreditos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetascreditos);
				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
								
				
				


				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetasCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetasCreditosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosAnterior =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetascreditosAnterior =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetascreditos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetasCreditosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosAnterior =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetascreditosAnterior =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetasCreditosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetascreditos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tarjetascreditos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetascreditos);
				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
							
				
				


				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetasCreditos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTarjetasCreditosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetascreditosAnterior =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tarjetascreditosAnterior =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
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
			
			TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
			
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
			
			


			
			TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetasCreditosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetascreditos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tarjetascreditos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetascreditos);
				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
								
				
				


				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetasCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetasCreditosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosAnterior =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetascreditosAnterior =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetasCreditosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetascreditos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tarjetascreditos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTarjetasCreditosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetascreditos);
				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTarjetasCreditos")) {
					jCheckBoxSeleccionarTodosTarjetasCreditosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTarjetasCreditos")) {
					jCheckBoxSeleccionadosTarjetasCreditosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTarjetasCreditos")) {
					
				}
				
				


				
				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetasCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetascreditos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tarjetascreditos);
				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
												
				
				


				
				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetasCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTarjetasCreditosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetascreditosAnterior =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tarjetascreditosAnterior =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTarjetasCreditosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetascreditos);
				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
				
				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
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
			
			TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
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
			
			


			
			TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTarjetasCreditosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetascreditos);
				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetasCreditos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetasCreditos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetascreditos);
				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
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
				
				


				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetasCreditos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetasCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetasCreditosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetascreditosAnterior =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetascreditosAnterior =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTarjetasCreditos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTarjetasCreditosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTarjetasCreditos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tarjetascreditos =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tarjetascreditos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTarjetasCreditos")) {
				
				}
				
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTarjetasCreditos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTarjetasCreditos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTarjetasCreditos")) {
			
			}
			
			TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTarjetasCreditos();
			
			TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
			
			if(sTipo.equals("NuevoTarjetasCreditos")) {
				jButtonNuevoTarjetasCreditosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTarjetasCreditos")) {
				jButtonDuplicarTarjetasCreditosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTarjetasCreditos")) {
				jButtonCopiarTarjetasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTarjetasCreditos")) {
				jButtonVerFormTarjetasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTarjetasCreditos")) {
				jButtonNuevoTarjetasCreditosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTarjetasCreditos")) {
				jButtonModificarTarjetasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTarjetasCreditos")) {
				jButtonActualizarTarjetasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTarjetasCreditos")) {
				jButtonEliminarTarjetasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTarjetasCreditos")) {
				jButtonGuardarCambiosTarjetasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTarjetasCreditos")) {
				jButtonCancelarTarjetasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTarjetasCreditos")) {
				jButtonCerrarTarjetasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTarjetasCreditos")) {
				jButtonGuardarCambiosTarjetasCreditosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTarjetasCreditos")) {
				jButtonNuevoGuardarCambiosTarjetasCreditosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTarjetasCreditos")) {
				jButtonAbrirOrderByTarjetasCreditosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTarjetasCreditos")) {
				jButtonRecargarInformacionTarjetasCreditosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTarjetasCreditos")) {
				jButtonAnterioresTarjetasCreditosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTarjetasCreditos")) {
				jButtonSiguientesTarjetasCreditosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTarjetasCreditosBusqueda")) {
				this.jButtonidTarjetasCreditosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTarjetasCreditosUpdate")) {
				this.jButtonid_empresaTarjetasCreditosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTarjetasCreditosBusqueda")) {
				this.jButtonid_empresaTarjetasCreditosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTarjetasCreditosUpdate")) {
				this.jButtonid_sucursalTarjetasCreditosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTarjetasCreditosBusqueda")) {
				this.jButtonid_sucursalTarjetasCreditosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tarjeta_creditoTarjetasCreditosUpdate")) {
				this.jButtonid_tarjeta_creditoTarjetasCreditosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tarjeta_creditoTarjetasCreditosBusqueda")) {
				this.jButtonid_tarjeta_creditoTarjetasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioTarjetasCreditosBusqueda")) {
				this.jButtonfecha_inicioTarjetasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finTarjetasCreditosBusqueda")) {
				this.jButtonfecha_finTarjetasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tarjetaTarjetasCreditosBusqueda")) {
				this.jButtonnombre_tarjetaTarjetasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("loteTarjetasCreditosBusqueda")) {
				this.jButtonloteTarjetasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaTarjetasCreditosBusqueda")) {
				this.jButtonfechaTarjetasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalTarjetasCreditosBusqueda")) {
				this.jButtontotalTarjetasCreditosBusquedaActionPerformed(evt);
			}
			
			TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTarjetasCreditos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTarjetasCreditos")) {
				closingInternalFrameTarjetasCreditos();
				
			} else if(sTipo.equals("jButtonCancelarTarjetasCreditos")) {
				JInternalFrameBase jInternalFrameDetalleFormTarjetasCreditos = (JInternalFrameBase)evt.getSource();
	            	
	            TarjetasCreditosBeanSwingJInternalFrame jInternalFrameParent=(TarjetasCreditosBeanSwingJInternalFrame)jInternalFrameDetalleFormTarjetasCreditos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTarjetasCreditosActionPerformed(null);
			}
			
			TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tarjetascreditos,new Object(),this.tarjetascreditosParameterGeneral,this.tarjetascreditosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTarjetasCreditos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTarjetasCreditos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTarjetasCreditos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tarjetascreditos)) {
			if(!esControlTabla) {
				if(TarjetasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.tarjetascreditos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);			
				}
				
				if(this.tarjetascreditosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTarjetasCreditos(this.tarjetascreditos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTarjetasCreditos(this.tarjetascreditosReturnGeneral,this.tarjetascreditosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tarjetascreditosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTarjetasCreditos(classes,this.tarjetascreditosReturnGeneral,this.tarjetascreditosBean,false);
					}
						
					if(this.tarjetascreditosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTarjetasCreditos(this.tarjetascreditosReturnGeneral.getTarjetasCreditos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTarjetasCreditos(this.tarjetascreditosReturnGeneral.getTarjetasCreditos());	
					}
						
					if(this.tarjetascreditosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTarjetasCreditos(this.tarjetascreditosReturnGeneral.getTarjetasCreditos(),classes);//this.tarjetascreditosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTarjetasCreditos(this.tarjetascreditos,classes);//this.tarjetascreditosBean);									
				}
			
				if(TarjetasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTarjetasCreditos(this.tarjetascreditos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetasCreditos(this.tarjetascreditos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tarjetascreditosAnterior!=null) {
						this.tarjetascreditos=this.tarjetascreditosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tarjetascreditosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tarjetascreditosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tarjetascreditosReturnGeneral.getTarjetasCreditos(),tarjetascreditosLogic.getTarjetasCreditoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tarjetascreditosReturnGeneral.getTarjetasCreditos(),this.tarjetascreditoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTarjetasCreditos.repaint();
				
				//((AbstractTableModel) this.jTableDatosTarjetasCreditos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTarjetasCreditos();
			}
		}
	}
	
	public void actualizarVisualTableDatosTarjetasCreditos() throws Exception {
		
		TarjetasCreditosModel tarjetascreditosModel=(TarjetasCreditosModel)this.jTableDatosTarjetasCreditos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tarjetascreditosModel.tarjetascreditoss=this.tarjetascreditosLogic.getTarjetasCreditoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tarjetascreditosModel.tarjetascreditoss=this.tarjetascreditoss;
		}
		
		
		((TarjetasCreditosModel) this.jTableDatosTarjetasCreditos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTarjetasCreditos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettarjetascreditosAnterior(),this.tarjetascreditosLogic.getTarjetasCreditoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettarjetascreditosAnterior(),this.tarjetascreditoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTarjetasCreditos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTarjetasCreditos(TarjetasCreditos tarjetascreditos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
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
										
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tarjetascreditos,new Object(),generalEntityParameterGeneral,this.tarjetascreditosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tarjetascreditosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TarjetasCreditosConstantesFunciones.getClassesRelationshipsOfTarjetasCreditos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TarjetasCreditosConstantesFunciones.getClassesRelationshipsFromStringsOfTarjetasCreditos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTarjetasCreditos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TarjetasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tarjetascreditos,new Object(),generalEntityParameterGeneral,this.tarjetascreditosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTarjetasCreditos(TarjetasCreditosBean tarjetascreditosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTarjetasCreditos(ArrayList<Classe> classes,TarjetasCreditosReturnGeneral tarjetascreditosReturnGeneral,TarjetasCreditosBean tarjetascreditosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTarjetasCreditos(TarjetasCreditos tarjetascreditos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tarjetascreditos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTarjetasCreditos = new TarjetasCreditosDetalleFormJInternalFrame(jDesktopPane,this.tarjetascreditosSessionBean.getConGuardarRelaciones(),this.tarjetascreditosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.setVisible(false);
		this.jInternalFrameDetalleFormTarjetasCreditos.setSelected(false);						
		
		this.jInternalFrameDetalleFormTarjetasCreditos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTarjetasCreditos.tarjetascreditosLogic=this.tarjetascreditosLogic;
		
		this.cargarCombosFrameForeignKeyTarjetasCreditos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTarjetasCreditos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTarjetasCreditos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTarjetasCreditos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTarjetasCreditos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTarjetasCreditos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTarjetasCreditos"));
		
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonModificarTarjetasCreditos.addActionListener(new ButtonActionListener(this,"ModificarTarjetasCreditos"));

		
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonModificarToolBarTarjetasCreditos.addActionListener(new ButtonActionListener(this,"ModificarToolBarTarjetasCreditos"));
					
		this.jInternalFrameDetalleFormTarjetasCreditos.jMenuItemModificarTarjetasCreditos.addActionListener(new ButtonActionListener(this,"MenuItemModificarTarjetasCreditos"));		
		
		
		
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonActualizarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"ActualizarTarjetasCreditos"));
		
		
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonActualizarToolBarTarjetasCreditos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTarjetasCreditos"));
						
		this.jInternalFrameDetalleFormTarjetasCreditos.jMenuItemActualizarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTarjetasCreditos"));		
		
		
		
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonEliminarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"EliminarTarjetasCreditos"));
		
		
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonEliminarToolBarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"EliminarToolBarTarjetasCreditos"));
								
		this.jInternalFrameDetalleFormTarjetasCreditos.jMenuItemEliminarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTarjetasCreditos"));		
		
		
		
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonCancelarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"CancelarTarjetasCreditos"));
		
		
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonCancelarToolBarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"CancelarToolBarTarjetasCreditos"));
					
		this.jInternalFrameDetalleFormTarjetasCreditos.jMenuItemCancelarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTarjetasCreditos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTarjetasCreditos.jMenuItemDetalleCerrarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTarjetasCreditos"));		
		
		
		
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonGuardarCambiosToolBarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTarjetasCreditos"));
		
		
		
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonGuardarCambiosToolBarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTarjetasCreditos"));
		
		
		
		this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxTiposAccionesFormularioTarjetasCreditos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTarjetasCreditos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonidTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"idTarjetasCreditosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonid_empresaTarjetasCreditosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTarjetasCreditosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonid_empresaTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTarjetasCreditosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonid_sucursalTarjetasCreditosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTarjetasCreditosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonid_sucursalTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTarjetasCreditosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonid_tarjeta_creditoTarjetasCreditosUpdate.addActionListener(new ButtonActionListener(this,"id_tarjeta_creditoTarjetasCreditosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonid_tarjeta_creditoTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"id_tarjeta_creditoTarjetasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonfecha_inicioTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioTarjetasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonfecha_finTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finTarjetasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonnombre_tarjetaTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tarjetaTarjetasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonloteTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"loteTarjetasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonfechaTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fechaTarjetasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtontotalTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"totalTarjetasCreditosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTarjetasCreditos.jTabbedPaneRelacionesTarjetasCreditos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTarjetasCreditos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTarjetasCreditos"));
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetasCreditos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTarjetasCreditos"));
		}
		
		this.jTableDatosTarjetasCreditos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTarjetasCreditos"));
		
		this.jTableDatosTarjetasCreditos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTarjetasCreditos"));
		
		this.jButtonNuevoTarjetasCreditos.addActionListener(new ButtonActionListener(this,"NuevoTarjetasCreditos"));
		
		this.jButtonDuplicarTarjetasCreditos.addActionListener(new ButtonActionListener(this,"DuplicarTarjetasCreditos"));
		
		this.jButtonCopiarTarjetasCreditos.addActionListener(new ButtonActionListener(this,"CopiarTarjetasCreditos"));
		
		this.jButtonVerFormTarjetasCreditos.addActionListener(new ButtonActionListener(this,"VerFormTarjetasCreditos"));
		
		
		this.jButtonNuevoToolBarTarjetasCreditos.addActionListener(new ButtonActionListener(this,"NuevoToolBarTarjetasCreditos"));
			
		this.jButtonDuplicarToolBarTarjetasCreditos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTarjetasCreditos"));
			
		this.jMenuItemNuevoTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTarjetasCreditos"));
			
		this.jMenuItemDuplicarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTarjetasCreditos"));		
		
		
		this.jButtonNuevoRelacionesTarjetasCreditos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTarjetasCreditos"));
		
		
		this.jButtonNuevoRelacionesToolBarTarjetasCreditos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTarjetasCreditos"));
			
		this.jMenuItemNuevoRelacionesTarjetasCreditos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTarjetasCreditos"));		
		
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonModificarTarjetasCreditos.addActionListener(new ButtonActionListener(this,"ModificarTarjetasCreditos"));
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonModificarToolBarTarjetasCreditos.addActionListener(new ButtonActionListener(this,"ModificarToolBarTarjetasCreditos"));
			
			this.jInternalFrameDetalleFormTarjetasCreditos.jMenuItemModificarTarjetasCreditos.addActionListener(new ButtonActionListener(this,"MenuItemModificarTarjetasCreditos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonActualizarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"ActualizarTarjetasCreditos"));
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonActualizarToolBarTarjetasCreditos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTarjetasCreditos"));
				
			this.jInternalFrameDetalleFormTarjetasCreditos.jMenuItemActualizarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTarjetasCreditos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonEliminarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"EliminarTarjetasCreditos"));
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonEliminarToolBarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"EliminarToolBarTarjetasCreditos"));
						
			this.jInternalFrameDetalleFormTarjetasCreditos.jMenuItemEliminarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTarjetasCreditos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonCancelarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"CancelarTarjetasCreditos"));
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonCancelarToolBarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"CancelarToolBarTarjetasCreditos"));
			
			this.jInternalFrameDetalleFormTarjetasCreditos.jMenuItemCancelarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTarjetasCreditos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTarjetasCreditos"));		
		
		
		this.jButtonCerrarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"CerrarTarjetasCreditos"));
		
		
		this.jButtonCerrarToolBarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"CerrarToolBarTarjetasCreditos"));
			
		this.jMenuItemCerrarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTarjetasCreditos"));
			
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetasCreditos.jMenuItemDetalleCerrarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTarjetasCreditos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonGuardarCambiosTarjetasCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTarjetasCreditos"));
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetasCreditos.jButtonGuardarCambiosToolBarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTarjetasCreditos"));
		}
		
		this.jButtonCopiarToolBarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"CopiarToolBarTarjetasCreditos"));
			
		this.jButtonVerFormToolBarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"VerFormToolBarTarjetasCreditos"));
		
		this.jMenuItemGuardarCambiosTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTarjetasCreditos"));
			
		this.jMenuItemCopiarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTarjetasCreditos"));		
		
		this.jMenuItemVerFormTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTarjetasCreditos"));		
		
		
		this.jButtonGuardarCambiosTablaTarjetasCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTarjetasCreditos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTarjetasCreditos"));
			
		this.jMenuItemGuardarCambiosTablaTarjetasCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTarjetasCreditos"));		
		
		
		
		this.jButtonRecargarInformacionTarjetasCreditos.addActionListener (new ButtonActionListener(this,"RecargarInformacionTarjetasCreditos"));
					
		this.jButtonRecargarInformacionToolBarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTarjetasCreditos"));
		
		this.jMenuItemRecargarInformacionTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTarjetasCreditos"));		
		
		
		
		this.jButtonAnterioresTarjetasCreditos.addActionListener (new ButtonActionListener(this,"AnterioresTarjetasCreditos"));
		
		
		this.jButtonAnterioresToolBarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTarjetasCreditos"));
		
		this.jMenuItemAnterioresTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTarjetasCreditos"));		
		
		
		this.jButtonSiguientesTarjetasCreditos.addActionListener (new ButtonActionListener(this,"SiguientesTarjetasCreditos"));
		
		
		this.jButtonSiguientesToolBarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTarjetasCreditos"));
			
		this.jMenuItemSiguientesTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTarjetasCreditos"));
			
		this.jMenuItemAbrirOrderByTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTarjetasCreditos"));
			
		this.jMenuItemMostrarOcultarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTarjetasCreditos"));
			
		this.jMenuItemDetalleAbrirOrderByTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTarjetasCreditos"));
			
		this.jMenuItemDetalleMostarOcultarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTarjetasCreditos"));		
		
		
		this.jButtonNuevoGuardarCambiosTarjetasCreditos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTarjetasCreditos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTarjetasCreditos"));
			
		this.jMenuItemNuevoGuardarCambiosTarjetasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTarjetasCreditos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTarjetasCreditos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTarjetasCreditos"));

		this.jCheckBoxSeleccionadosTarjetasCreditos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTarjetasCreditos"));
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxTiposAccionesFormularioTarjetasCreditos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTarjetasCreditos"));
		}
		
		
		this.jComboBoxTiposRelacionesTarjetasCreditos.addActionListener (new ButtonActionListener(this,"TiposRelacionesTarjetasCreditos"));
			
		this.jComboBoxTiposAccionesTarjetasCreditos.addActionListener (new ButtonActionListener(this,"TiposAccionesTarjetasCreditos"));
					
		this.jComboBoxTiposSeleccionarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTarjetasCreditos"));
			
		this.jTextFieldValorCampoGeneralTarjetasCreditos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTarjetasCreditos"));		
		
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonidTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"idTarjetasCreditosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonid_empresaTarjetasCreditosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTarjetasCreditosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonid_empresaTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTarjetasCreditosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonid_sucursalTarjetasCreditosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTarjetasCreditosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonid_sucursalTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTarjetasCreditosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonid_tarjeta_creditoTarjetasCreditosUpdate.addActionListener(new ButtonActionListener(this,"id_tarjeta_creditoTarjetasCreditosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonid_tarjeta_creditoTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"id_tarjeta_creditoTarjetasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonfecha_inicioTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioTarjetasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonfecha_finTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finTarjetasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonnombre_tarjetaTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tarjetaTarjetasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonloteTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"loteTarjetasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonfechaTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fechaTarjetasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtontotalTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"totalTarjetasCreditosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaTarjetaCreditoTarjetasCreditos.addActionListener(new ButtonActionListener(this,"BusquedaTarjetaCreditoTarjetasCreditos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTarjetasCreditos!=null) {
				this.jInternalFrameReporteDinamicoTarjetasCreditos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTarjetasCreditos"));
				this.jInternalFrameReporteDinamicoTarjetasCreditos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTarjetasCreditos"));
				this.jInternalFrameReporteDinamicoTarjetasCreditos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTarjetasCreditos"));
			}
			
			//this.jButtonCerrarReporteDinamicoTarjetasCreditos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTarjetasCreditos"));				
			//this.jButtonGenerarReporteDinamicoTarjetasCreditos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTarjetasCreditos"));
			//this.jButtonGenerarExcelReporteDinamicoTarjetasCreditos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTarjetasCreditos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTarjetasCreditos!=null) {
				this.jInternalFrameImportacionTarjetasCreditos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTarjetasCreditos"));
				this.jInternalFrameImportacionTarjetasCreditos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTarjetasCreditos"));
				this.jInternalFrameImportacionTarjetasCreditos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTarjetasCreditos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTarjetasCreditos.addActionListener (new ButtonActionListener(this,"AbrirOrderByTarjetasCreditos"));
			
			this.jButtonAbrirOrderByToolBarTarjetasCreditos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTarjetasCreditos"));			
			
			if(this.jInternalFrameOrderByTarjetasCreditos!=null) {
				this.jInternalFrameOrderByTarjetasCreditos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTarjetasCreditos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetasCreditos.jTabbedPaneRelacionesTarjetasCreditos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTarjetasCreditos"));
		
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
            		closingInternalFrameTarjetasCreditos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTarjetasCreditos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTarjetasCreditos = (JInternalFrameBase)event.getSource();
	            	
	            TarjetasCreditosBeanSwingJInternalFrame jInternalFrameParent=(TarjetasCreditosBeanSwingJInternalFrame)jInternalFrameDetalleFormTarjetasCreditos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTarjetasCreditosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTarjetasCreditos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTarjetasCreditosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTarjetasCreditos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTarjetasCreditos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTarjetasCreditosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTarjetasCreditosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTarjetasCreditosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTarjetasCreditos";
		inputMap = this.jButtonNuevoTarjetasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTarjetasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTarjetasCreditosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTarjetasCreditosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTarjetasCreditosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTarjetasCreditosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTarjetasCreditos";
		inputMap = this.jButtonNuevoRelacionesTarjetasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTarjetasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTarjetasCreditosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTarjetasCreditos";
		inputMap = this.jButtonModificarTarjetasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTarjetasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTarjetasCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTarjetasCreditos";
		inputMap = this.jButtonActualizarTarjetasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTarjetasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTarjetasCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTarjetasCreditos";
		inputMap = this.jButtonEliminarTarjetasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTarjetasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTarjetasCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTarjetasCreditos";
		inputMap = this.jButtonCancelarTarjetasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTarjetasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTarjetasCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTarjetasCreditos";
		inputMap = this.jButtonCerrarTarjetasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTarjetasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTarjetasCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonGuardarCambiosTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTarjetasCreditos";
		inputMap = this.jInternalFrameDetalleFormTarjetasCreditos.jButtonGuardarCambiosTarjetasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonGuardarCambiosTarjetasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTarjetasCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTarjetasCreditos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTarjetasCreditosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTarjetasCreditos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTarjetasCreditosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTarjetasCreditos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTarjetasCreditosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTarjetasCreditos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTarjetasCreditosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonidTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"idTarjetasCreditosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonid_empresaTarjetasCreditosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTarjetasCreditosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonid_empresaTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTarjetasCreditosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonid_sucursalTarjetasCreditosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTarjetasCreditosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonid_sucursalTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTarjetasCreditosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonid_tarjeta_creditoTarjetasCreditosUpdate.addActionListener(new ButtonActionListener(this,"id_tarjeta_creditoTarjetasCreditosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonid_tarjeta_creditoTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"id_tarjeta_creditoTarjetasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonfecha_inicioTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioTarjetasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonfecha_finTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finTarjetasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonnombre_tarjetaTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tarjetaTarjetasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonloteTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"loteTarjetasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtonfechaTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fechaTarjetasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetasCreditos.jButtontotalTarjetasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"totalTarjetasCreditosBusqueda"));
		
		
		this.jButtonBusquedaTarjetaCreditoTarjetasCreditos.addActionListener(new ButtonActionListener(this,"BusquedaTarjetaCreditoTarjetasCreditos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTarjetasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTarjetasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTarjetasCreditosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTarjetasCreditos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTarjetasCreditos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TarjetasCreditos tarjetascreditosAux:this.tarjetascreditosLogic.getTarjetasCreditoss()) {
					tarjetascreditosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TarjetasCreditos tarjetascreditosAux:tarjetascreditoss) {
					tarjetascreditosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTarjetasCreditosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTarjetasCreditos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TarjetasCreditos tarjetascreditosAux:this.tarjetascreditosLogic.getTarjetasCreditoss()) {
						tarjetascreditosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TarjetasCreditos tarjetascreditosAux:tarjetascreditoss) {
						tarjetascreditosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TarjetasCreditos tarjetascreditosAux:this.tarjetascreditosLogic.getTarjetasCreditoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TarjetasCreditos tarjetascreditosAux:tarjetascreditoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTarjetasCreditos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTarjetasCreditos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTarjetasCreditos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTarjetasCreditos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTarjetasCreditosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTarjetasCreditos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTarjetasCreditos.getSelectedRows();
			
			TarjetasCreditos tarjetascreditosLocal=new TarjetasCreditos();
			
			//this.seleccionarTodosTarjetasCreditos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tarjetascreditosLocal =(TarjetasCreditos) this.tarjetascreditosLogic.getTarjetasCreditoss().toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tarjetascreditosLocal =(TarjetasCreditos) this.tarjetascreditoss.toArray()[this.jTableDatosTarjetasCreditos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tarjetascreditosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TarjetasCreditos tarjetascreditosAux:this.tarjetascreditosLogic.getTarjetasCreditoss()) {
						tarjetascreditosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TarjetasCreditos tarjetascreditosAux:tarjetascreditoss) {
						tarjetascreditosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTarjetasCreditos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTarjetasCreditos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTarjetasCreditos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTarjetasCreditos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTarjetasCreditosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTarjetasCreditosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTarjetasCreditosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTarjetasCreditos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTarjetasCreditos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TarjetasCreditos tarjetascreditosAux:this.tarjetascreditosLogic.getTarjetasCreditoss()) {
				
						if(sTipoSeleccionar.equals(TarjetasCreditosConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							tarjetascreditosAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TarjetasCreditosConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							tarjetascreditosAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TarjetasCreditosConstantesFunciones.LABEL_NOMBRETARJETA)) {
							existe=true;
							tarjetascreditosAux.setnombre_tarjeta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TarjetasCreditosConstantesFunciones.LABEL_LOTE)) {
							existe=true;
							tarjetascreditosAux.setlote(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TarjetasCreditosConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							tarjetascreditosAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TarjetasCreditosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							tarjetascreditosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TarjetasCreditos tarjetascreditosAux:tarjetascreditoss) {
					
						if(sTipoSeleccionar.equals(TarjetasCreditosConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							tarjetascreditosAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TarjetasCreditosConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							tarjetascreditosAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TarjetasCreditosConstantesFunciones.LABEL_NOMBRETARJETA)) {
							existe=true;
							tarjetascreditosAux.setnombre_tarjeta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TarjetasCreditosConstantesFunciones.LABEL_LOTE)) {
							existe=true;
							tarjetascreditosAux.setlote(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TarjetasCreditosConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							tarjetascreditosAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TarjetasCreditosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							tarjetascreditosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTarjetasCreditos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTarjetasCreditosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTarjetasCreditos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTarjetasCreditos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTarjetasCreditos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxTiposAccionesFormularioTarjetasCreditos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTarjetasCreditos) {				
					conSplash=true;//false;										
					
					//this.startProcessTarjetasCreditos(conSplash);
				
					this.generarReporteTarjetasCreditossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTarjetasCreditos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxTiposAccionesFormularioTarjetasCreditos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTarjetasCreditossSeleccionados();
				//this.jComboBoxTiposAccionesTarjetasCreditos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTarjetasCreditossSeleccionados(false);
				//this.jComboBoxTiposAccionesTarjetasCreditos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTarjetasCreditossSeleccionados(true);
				//this.jComboBoxTiposAccionesTarjetasCreditos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTarjetasCreditos();
				
				this.exportarTarjetasCreditossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTarjetasCreditos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxTiposAccionesFormularioTarjetasCreditos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTarjetasCreditoss();
				//this.importarTarjetasCreditoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTarjetasCreditos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxTiposAccionesFormularioTarjetasCreditos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTarjetasCreditos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTarjetasCreditossSeleccionados();
				//this.jComboBoxTiposAccionesTarjetasCreditos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tarjeta Credito", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTarjetasCreditos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTarjetasCreditos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTarjetasCreditos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tarjeta Credito",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTarjetasCreditos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxTiposAccionesFormularioTarjetasCreditos.setSelectedIndex(0);					
				}	
			} 			
			else if(TarjetasCreditosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTarjetasCreditos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTarjetasCreditos(conSplash);
					
						//this.actualizarParametrosGeneralTarjetasCreditos();
						
						this.generarReporteProcesoAccionTarjetasCreditossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTarjetasCreditos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxTiposAccionesFormularioTarjetasCreditos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TarjetasCreditosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tarjeta CreditoS SELECCIONADOS?", "MANTENIMIENTO DE Tarjeta Credito", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTarjetasCreditos();
				
						this.actualizarParametrosGeneralTarjetasCreditos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tarjetascreditosReturnGeneral=tarjetascreditosLogic.procesarAccionTarjetasCreditossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tarjetascreditosLogic.getTarjetasCreditoss(),this.tarjetascreditosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTarjetasCreditosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTarjetasCreditos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxTiposAccionesFormularioTarjetasCreditos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTarjetasCreditos();
					
					TarjetasCreditosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTarjetasCreditosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTarjetasCreditos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxTiposAccionesFormularioTarjetasCreditos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTarjetasCreditos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTarjetasCreditosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTarjetasCreditos();
			
			if(this.jInternalFrameDetalleFormTarjetasCreditos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TarjetasCreditos> tarjetascreditossSeleccionados=new ArrayList<TarjetasCreditos>();		
			TarjetasCreditos tarjetascreditos=new TarjetasCreditos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTarjetasCreditos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTarjetasCreditos.getSelectedItem();
			
			
			
			
			tarjetascreditossSeleccionados=this.getTarjetasCreditossSeleccionados(true);
			//this.sTipoAccion;
			
			if(tarjetascreditossSeleccionados.size()==1) {
				for(TarjetasCreditos tarjetascreditosAux:tarjetascreditossSeleccionados) {
					tarjetascreditos=tarjetascreditosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTarjetasCreditos();
			
      		//this.finishProcessTarjetasCreditos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTarjetasCreditosReturnGeneral() throws Exception {
		if(this.tarjetascreditosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tarjetascreditosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tarjetascreditosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tarjetascreditosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tarjetascreditosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tarjetascreditosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTarjetasCreditos(false);
		}
		
		if(this.tarjetascreditosReturnGeneral.getConRetornoLista() || this.tarjetascreditosReturnGeneral.getConRetornoObjeto()) {
			if(this.tarjetascreditosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tarjetascreditosLogic.setTarjetasCreditoss(this.tarjetascreditosReturnGeneral.getTarjetasCreditoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingTarjetasCreditos(false);
		}
	}
	
	public void actualizarParametrosGeneralTarjetasCreditos() throws Exception {
		
		
	}
	
	public ArrayList<TarjetasCreditos> getTarjetasCreditossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TarjetasCreditos> tarjetascreditossSeleccionados=new ArrayList<TarjetasCreditos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTarjetasCreditos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TarjetasCreditos tarjetascreditosAux:tarjetascreditosLogic.getTarjetasCreditoss()) {
					if(tarjetascreditosAux.getIsSelected()) {
						tarjetascreditossSeleccionados.add(tarjetascreditosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TarjetasCreditos tarjetascreditosAux:this.tarjetascreditoss) {
					if(tarjetascreditosAux.getIsSelected()) {
						tarjetascreditossSeleccionados.add(tarjetascreditosAux);				
					}
				}
			}
			
			if(tarjetascreditossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tarjetascreditossSeleccionados.addAll(this.tarjetascreditosLogic.getTarjetasCreditoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tarjetascreditossSeleccionados.addAll(this.tarjetascreditoss);				
					}
				}
			}
		} else {
			tarjetascreditossSeleccionados.add(this.tarjetascreditos);
		}
		
		return tarjetascreditossSeleccionados;
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
	
	public void generarReporteTarjetasCreditossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTarjetasCreditossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTarjetasCreditossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTarjetasCreditossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTarjetasCreditossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tarjeta Credito",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTarjetasCreditossSeleccionados() throws Exception {
		ArrayList<TarjetasCreditos> tarjetascreditossSeleccionados=new ArrayList<TarjetasCreditos>();		
		
		tarjetascreditossSeleccionados=this.getTarjetasCreditossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTarjetasCreditoss("Todos",tarjetascreditossSeleccionados);
		
	}	
	
	public void generarReporteNormalTarjetasCreditossSeleccionados() throws Exception {
		ArrayList<TarjetasCreditos> tarjetascreditossSeleccionados=new ArrayList<TarjetasCreditos>();		
		
		tarjetascreditossSeleccionados=this.getTarjetasCreditossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTarjetasCreditoss("Todos",tarjetascreditossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTarjetasCreditossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TarjetasCreditos> tarjetascreditossSeleccionados=new ArrayList<TarjetasCreditos>();
		
		tarjetascreditossSeleccionados=this.getTarjetasCreditossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTarjetasCreditoss("Todos",tarjetascreditossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTarjetasCreditossSeleccionados() throws Exception {
		ArrayList<TarjetasCreditos> tarjetascreditossSeleccionados=new ArrayList<TarjetasCreditos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTarjetasCreditos();
		
		
		tarjetascreditossSeleccionados=this.getTarjetasCreditossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTarjetasCreditos();
		
		
		//this.generarReporteTarjetasCreditoss("Todos",tarjetascreditossSeleccionados ,tarjetascreditosImplementable,tarjetascreditosImplementableHome);
	}
	
	public void mostrarImportacionTarjetasCreditoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTarjetasCreditos();
		
		this.abrirFrameImportacionTarjetasCreditos();		
		
			
		//this.generarReporteTarjetasCreditoss("Todos",tarjetascreditossSeleccionados ,tarjetascreditosImplementable,tarjetascreditosImplementableHome);
	}
	
	public void importarTarjetasCreditoss() throws Exception {		
	
	}
	
	public void exportarTarjetasCreditossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTarjetasCreditossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTarjetasCreditossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTarjetasCreditossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tarjeta Credito",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTarjetasCreditossSeleccionados() throws Exception {
		ArrayList<TarjetasCreditos> tarjetascreditossSeleccionados=new ArrayList<TarjetasCreditos>();		
		
		tarjetascreditossSeleccionados=this.getTarjetasCreditossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tarjetascreditos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTarjetasCreditos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TarjetasCreditos tarjetascreditosAux:tarjetascreditossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTarjetasCreditos(tarjetascreditosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tarjetascreditosAux.setsDetalleGeneralEntityReporte(tarjetascreditosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTarjetasCreditos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TarjetasCreditosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetasCreditosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetasCreditosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetasCreditosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetasCreditosConstantesFunciones.LABEL_IDTARJETACREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetasCreditosConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetasCreditosConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetasCreditosConstantesFunciones.LABEL_NOMBRETARJETA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetasCreditosConstantesFunciones.LABEL_LOTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetasCreditosConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetasCreditosConstantesFunciones.LABEL_TOTAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTarjetasCreditos(TarjetasCreditos tarjetascreditos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tarjetascreditos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetascreditos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetascreditos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetascreditos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetascreditos.gettarjetacredito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetascreditos.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetascreditos.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetascreditos.getnombre_tarjeta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetascreditos.getlote();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetascreditos.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetascreditos.gettotal().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTarjetasCreditossSeleccionados() throws Exception {
		ArrayList<TarjetasCreditos> tarjetascreditossSeleccionados=new ArrayList<TarjetasCreditos>();		
		
		tarjetascreditossSeleccionados=this.getTarjetasCreditossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tarjetascreditos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TarjetasCreditoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTarjetasCreditos(row);				
				iRow++;
			}				
			
			for(TarjetasCreditos tarjetascreditosAux:tarjetascreditossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTarjetasCreditos(tarjetascreditosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTarjetasCreditossSeleccionados() throws Exception {
		ArrayList<TarjetasCreditos> tarjetascreditossSeleccionados=new ArrayList<TarjetasCreditos>();		
		
		tarjetascreditossSeleccionados=this.getTarjetasCreditossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tarjetascreditos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tarjetascreditoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tarjetascreditos");
			//elementRoot.appendChild(element);
		
			for(TarjetasCreditos tarjetascreditosAux:tarjetascreditossSeleccionados) {
				element = document.createElement("tarjetascreditos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTarjetasCreditos(tarjetascreditosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTarjetasCreditos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_IDTARJETACREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_NOMBRETARJETA);
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_LOTE);
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetasCreditosConstantesFunciones.LABEL_TOTAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTarjetasCreditos(TarjetasCreditos tarjetascreditos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetascreditos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetascreditos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetascreditos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetascreditos.gettarjetacredito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetascreditos.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetascreditos.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetascreditos.getnombre_tarjeta());
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetascreditos.getlote());
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetascreditos.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetascreditos.gettotal());				
	}
	
	public void setFilaDatosExportarXmlTarjetasCreditos(TarjetasCreditos tarjetascreditos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TarjetasCreditosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tarjetascreditos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TarjetasCreditosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tarjetascreditos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TarjetasCreditosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tarjetascreditos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(TarjetasCreditosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(tarjetascreditos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementtarjetacredito_descripcion = document.createElement(TarjetasCreditosConstantesFunciones.IDTARJETACREDITO);
		elementtarjetacredito_descripcion.appendChild(document.createTextNode(tarjetascreditos.gettarjetacredito_descripcion()));
		element.appendChild(elementtarjetacredito_descripcion);

		Element elementfecha_inicio = document.createElement(TarjetasCreditosConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(tarjetascreditos.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(TarjetasCreditosConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(tarjetascreditos.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementnombre_tarjeta = document.createElement(TarjetasCreditosConstantesFunciones.NOMBRETARJETA);
		elementnombre_tarjeta.appendChild(document.createTextNode(tarjetascreditos.getnombre_tarjeta().trim()));
		element.appendChild(elementnombre_tarjeta);

		Element elementlote = document.createElement(TarjetasCreditosConstantesFunciones.LOTE);
		elementlote.appendChild(document.createTextNode(tarjetascreditos.getlote().trim()));
		element.appendChild(elementlote);

		Element elementfecha = document.createElement(TarjetasCreditosConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(tarjetascreditos.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementtotal = document.createElement(TarjetasCreditosConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(tarjetascreditos.gettotal().toString().trim()));
		element.appendChild(elementtotal);
	}
	
	public void generarReporteGroupGenericoTarjetasCreditossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TarjetasCreditos> tarjetascreditossSeleccionados=new ArrayList<TarjetasCreditos>();
		
		tarjetascreditossSeleccionados=this.getTarjetasCreditossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTarjetasCreditos(tarjetascreditossSeleccionados);
		
		this.generarReporteTarjetasCreditoss("Todos",tarjetascreditossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTarjetasCreditos(ArrayList<TarjetasCreditos> tarjetascreditossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TarjetasCreditos tarjetascreditosAux:tarjetascreditossSeleccionados) {
				tarjetascreditosAux.setsDetalleGeneralEntityReporte(tarjetascreditosAux.toString());
			
				if(sTipoSeleccionar.equals(TarjetasCreditosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tarjetascreditosAux.setsDescripcionGeneralEntityReporte1(tarjetascreditosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TarjetasCreditosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					tarjetascreditosAux.setsDescripcionGeneralEntityReporte1(tarjetascreditosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TarjetasCreditosConstantesFunciones.LABEL_IDTARJETACREDITO)) {
					existe=true;
					tarjetascreditosAux.setsDescripcionGeneralEntityReporte1(tarjetascreditosAux.gettarjetacredito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TarjetasCreditosConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					tarjetascreditosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(tarjetascreditosAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(TarjetasCreditosConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					tarjetascreditosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(tarjetascreditosAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(TarjetasCreditosConstantesFunciones.LABEL_NOMBRETARJETA)) {
					existe=true;
					tarjetascreditosAux.setsDescripcionGeneralEntityReporte1(tarjetascreditosAux.getnombre_tarjeta());
				}
				 else if(sTipoSeleccionar.equals(TarjetasCreditosConstantesFunciones.LABEL_LOTE)) {
					existe=true;
					tarjetascreditosAux.setsDescripcionGeneralEntityReporte1(tarjetascreditosAux.getlote());
				}
				 else if(sTipoSeleccionar.equals(TarjetasCreditosConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					tarjetascreditosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(tarjetascreditosAux.getfecha()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTarjetasCreditos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTarjetasCreditos=true;
				this.isVisibilidadCeldaNuevoRelacionesTarjetasCreditos=true;
				this.isVisibilidadCeldaGuardarCambiosTarjetasCreditos=true;
			}
			
			this.isVisibilidadCeldaModificarTarjetasCreditos=false;
			this.isVisibilidadCeldaActualizarTarjetasCreditos=false;
			this.isVisibilidadCeldaEliminarTarjetasCreditos=false;
			this.isVisibilidadCeldaCancelarTarjetasCreditos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTarjetasCreditos=true;
				} else {
					this.isVisibilidadCeldaGuardarTarjetasCreditos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTarjetasCreditos=false;
			this.isVisibilidadCeldaNuevoRelacionesTarjetasCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosTarjetasCreditos=false;
			this.isVisibilidadCeldaModificarTarjetasCreditos=false;
			this.isVisibilidadCeldaActualizarTarjetasCreditos=true;
			this.isVisibilidadCeldaEliminarTarjetasCreditos=false;
			this.isVisibilidadCeldaCancelarTarjetasCreditos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTarjetasCreditos=true;
				} else {
					this.isVisibilidadCeldaGuardarTarjetasCreditos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTarjetasCreditos=false;
			this.isVisibilidadCeldaNuevoRelacionesTarjetasCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosTarjetasCreditos=false;
			this.isVisibilidadCeldaModificarTarjetasCreditos=false;
			this.isVisibilidadCeldaActualizarTarjetasCreditos=true;
			this.isVisibilidadCeldaEliminarTarjetasCreditos=true;
			this.isVisibilidadCeldaCancelarTarjetasCreditos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTarjetasCreditos=true;
				} else {
					this.isVisibilidadCeldaGuardarTarjetasCreditos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTarjetasCreditos=false;
			this.isVisibilidadCeldaNuevoRelacionesTarjetasCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosTarjetasCreditos=false;
			this.isVisibilidadCeldaModificarTarjetasCreditos=false;
			this.isVisibilidadCeldaActualizarTarjetasCreditos=true;
			this.isVisibilidadCeldaEliminarTarjetasCreditos=false;
			this.isVisibilidadCeldaCancelarTarjetasCreditos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTarjetasCreditos=false;
				} else {
					this.isVisibilidadCeldaGuardarTarjetasCreditos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTarjetasCreditos=true;
			this.isVisibilidadCeldaNuevoRelacionesTarjetasCreditos=true;
			this.isVisibilidadCeldaGuardarCambiosTarjetasCreditos=true;
			this.isVisibilidadCeldaModificarTarjetasCreditos=false;
			this.isVisibilidadCeldaActualizarTarjetasCreditos=false;
			this.isVisibilidadCeldaEliminarTarjetasCreditos=false;
			this.isVisibilidadCeldaCancelarTarjetasCreditos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTarjetasCreditos=true;
				} else {
					this.isVisibilidadCeldaGuardarTarjetasCreditos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTarjetasCreditos=false;
			this.isVisibilidadCeldaNuevoRelacionesTarjetasCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosTarjetasCreditos=false;
			this.isVisibilidadCeldaActualizarTarjetasCreditos=false;
			this.isVisibilidadCeldaEliminarTarjetasCreditos=false;
			this.isVisibilidadCeldaCancelarTarjetasCreditos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTarjetasCreditos=false;
				} else {
					this.isVisibilidadCeldaGuardarTarjetasCreditos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTarjetasCreditos=false;
			this.isVisibilidadCeldaNuevoRelacionesTarjetasCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosTarjetasCreditos=false;
			this.isVisibilidadCeldaModificarTarjetasCreditos=true;
			this.isVisibilidadCeldaActualizarTarjetasCreditos=false;
			this.isVisibilidadCeldaEliminarTarjetasCreditos=false;
			this.isVisibilidadCeldaCancelarTarjetasCreditos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTarjetasCreditos=false;
				} else {
					this.isVisibilidadCeldaGuardarTarjetasCreditos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TarjetasCreditosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTarjetasCreditos=true;
			this.isVisibilidadCeldaNuevoRelacionesTarjetasCreditos=true;
			this.isVisibilidadCeldaGuardarCambiosTarjetasCreditos=true;
		} else {
			this.actualizarEstadoPanelsTarjetasCreditos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTarjetasCreditos=false;
			//this.isVisibilidadCeldaVerFormTarjetasCreditos=false;
			this.isVisibilidadCeldaDuplicarTarjetasCreditos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tarjetascreditosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTarjetasCreditos=false;
		} else {
			this.isVisibilidadCeldaNuevoTarjetasCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosTarjetasCreditos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
			if(!tarjetascreditosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTarjetasCreditos=false;												
			}
			
			this.jButtonCerrarTarjetasCreditos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTarjetasCreditos=false;
		}
		
		if(!this.permiteMantenimiento(this.tarjetascreditos)) {
			this.isVisibilidadCeldaActualizarTarjetasCreditos=false;
			this.isVisibilidadCeldaEliminarTarjetasCreditos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoTarjetasCreditos=false;
		this.isVisibilidadCeldaNuevoRelacionesTarjetasCreditos=false;
		this.isVisibilidadCeldaGuardarCambiosTarjetasCreditos=false;
		//this.isVisibilidadCeldaModificarTarjetasCreditos=true;
		this.isVisibilidadCeldaActualizarTarjetasCreditos=false;
		this.isVisibilidadCeldaEliminarTarjetasCreditos=false;
		//this.isVisibilidadCeldaCancelarTarjetasCreditos=true;			
		this.isVisibilidadCeldaGuardarTarjetasCreditos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTarjetasCreditos() {
	}
	
	public void actualizarEstadoPanelsTarjetasCreditos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTarjetasCreditos!=null) {
				this.jScrollPanelDatosEdicionTarjetasCreditos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetasCreditos!=null) {
				this.jTabbedPaneBusquedasTarjetasCreditos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTarjetasCreditos!=null) {
				this.jScrollPanelDatosTarjetasCreditos.setVisible(true);
			}
			
			if(this.jPanelPaginacionTarjetasCreditos!=null) {
				this.jPanelPaginacionTarjetasCreditos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTarjetasCreditos!=null) {
				this.jPanelParametrosReportesTarjetasCreditos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTarjetasCreditos!=null) {
				this.jScrollPanelDatosEdicionTarjetasCreditos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetasCreditos!=null) {
				this.jTabbedPaneBusquedasTarjetasCreditos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTarjetasCreditos!=null) {
				this.jScrollPanelDatosTarjetasCreditos.setVisible(false);
			}
			
			if(this.jPanelPaginacionTarjetasCreditos!=null) {
				this.jPanelPaginacionTarjetasCreditos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTarjetasCreditos!=null) {
				this.jPanelParametrosReportesTarjetasCreditos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTarjetasCreditos!=null) {
				this.jScrollPanelDatosEdicionTarjetasCreditos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetasCreditos!=null) {
				this.jTabbedPaneBusquedasTarjetasCreditos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTarjetasCreditos!=null) {
				this.jScrollPanelDatosTarjetasCreditos.setVisible(false);
			}
			
			if(this.jPanelPaginacionTarjetasCreditos!=null) {
				this.jPanelPaginacionTarjetasCreditos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTarjetasCreditos!=null) {
				this.jPanelParametrosReportesTarjetasCreditos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTarjetasCreditos!=null) {
				this.jScrollPanelDatosEdicionTarjetasCreditos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetasCreditos!=null) {
				this.jTabbedPaneBusquedasTarjetasCreditos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTarjetasCreditos!=null) {
				this.jScrollPanelDatosTarjetasCreditos.setVisible(false);
			}
			
			if(this.jPanelPaginacionTarjetasCreditos!=null) {
				this.jPanelPaginacionTarjetasCreditos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTarjetasCreditos!=null) {
				this.jPanelParametrosReportesTarjetasCreditos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTarjetasCreditos!=null) {
				this.jScrollPanelDatosEdicionTarjetasCreditos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetasCreditos!=null) {
				this.jTabbedPaneBusquedasTarjetasCreditos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTarjetasCreditos!=null) {
				this.jScrollPanelDatosTarjetasCreditos.setVisible(true);
			}
			
			if(this.jPanelPaginacionTarjetasCreditos!=null) {
				this.jPanelPaginacionTarjetasCreditos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTarjetasCreditos!=null) {
				this.jPanelParametrosReportesTarjetasCreditos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTarjetasCreditos!=null) {
				this.jScrollPanelDatosEdicionTarjetasCreditos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetasCreditos!=null) {
				this.jTabbedPaneBusquedasTarjetasCreditos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTarjetasCreditos!=null) {
				this.jScrollPanelDatosTarjetasCreditos.setVisible(true);
			}
			
			if(this.jPanelPaginacionTarjetasCreditos!=null) {
				this.jPanelPaginacionTarjetasCreditos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTarjetasCreditos!=null) {
				this.jPanelParametrosReportesTarjetasCreditos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTarjetasCreditos!=null) {
				this.jScrollPanelDatosEdicionTarjetasCreditos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetasCreditos!=null) {
				this.jTabbedPaneBusquedasTarjetasCreditos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTarjetasCreditos!=null) {
				this.jScrollPanelDatosTarjetasCreditos.setVisible(true);
			}
			
			if(this.jPanelPaginacionTarjetasCreditos!=null) {
				this.jPanelPaginacionTarjetasCreditos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTarjetasCreditos!=null) {
				this.jPanelParametrosReportesTarjetasCreditos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTarjetasCreditos!=null) {
					this.jTabbedPaneBusquedasTarjetasCreditos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTarjetasCreditos!=null) {
				this.jPanelParametrosReportesTarjetasCreditos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetasCreditos!=null) {
				this.jTabbedPaneBusquedasTarjetasCreditos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTarjetasCreditos!=null) {
				this.jPanelParametrosReportesTarjetasCreditos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaTarjetaCredito=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaTarjetaCredito) {this.jTabbedPaneBusquedasTarjetasCreditos.remove(jPanelBusquedaTarjetaCreditoTarjetasCreditos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaTarjetaCredito=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaTarjetaCredito) {this.jTabbedPaneBusquedasTarjetasCreditos.remove(jPanelBusquedaTarjetaCreditoTarjetasCreditos);}
		}
		
	}

	public void setVisibilidadBusquedasParaTarjetaCredito(Boolean isParaTarjetaCredito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTarjetaCreditoNegation=!isParaTarjetaCredito;

			this.isVisibilidadBusquedaTarjetaCredito=isParaTarjetaCreditoNegation;
			if(!this.isVisibilidadBusquedaTarjetaCredito) {this.jTabbedPaneBusquedasTarjetasCreditos.remove(jPanelBusquedaTarjetaCreditoTarjetasCreditos);}
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
			
			this.inicializarActualizarBindingTablaTarjetasCreditos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTarjetasCreditos() {
		this.updateBorderResaltarBusquedasFormularioTarjetasCreditos();
		this.updateVisibilidadBusquedasFormularioTarjetasCreditos();
		this.updateHabilitarBusquedasFormularioTarjetasCreditos();
	}
	
	public void updateBorderResaltarBusquedasFormularioTarjetasCreditos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTarjetasCreditos.getComponents().length>0) {
	

		if(this.tarjetascreditosConstantesFunciones.resaltarBusquedaTarjetaCreditoTarjetasCreditos!=null) {
			index= this.jTabbedPaneBusquedasTarjetasCreditos.indexOfComponent(this.jPanelBusquedaTarjetaCreditoTarjetasCreditos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTarjetasCreditos.getComponent(index);
				jPanel.setBorder(this.tarjetascreditosConstantesFunciones.resaltarBusquedaTarjetaCreditoTarjetasCreditos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTarjetasCreditos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTarjetasCreditos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTarjetasCreditos.indexOfComponent(this.jPanelBusquedaTarjetaCreditoTarjetasCreditos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTarjetasCreditos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tarjetascreditosConstantesFunciones.mostrarBusquedaTarjetaCreditoTarjetasCreditos);
			if(!this.tarjetascreditosConstantesFunciones.mostrarBusquedaTarjetaCreditoTarjetasCreditos && index>-1) {
				this.jTabbedPaneBusquedasTarjetasCreditos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTarjetasCreditos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTarjetasCreditos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTarjetasCreditos.indexOfComponent(this.jPanelBusquedaTarjetaCreditoTarjetasCreditos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTarjetasCreditos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tarjetascreditosConstantesFunciones.activarBusquedaTarjetaCreditoTarjetasCreditos);
				this.jTabbedPaneBusquedasTarjetasCreditos.setEnabledAt(index,this.tarjetascreditosConstantesFunciones.activarBusquedaTarjetaCreditoTarjetasCreditos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTarjetasCreditos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaTarjetaCredito")) {
			index= this.jTabbedPaneBusquedasTarjetasCreditos.indexOfComponent(this.jPanelBusquedaTarjetaCreditoTarjetasCreditos);

			this.jTabbedPaneBusquedasTarjetasCreditos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTarjetasCreditos.getComponent(index);

			this.tarjetascreditosConstantesFunciones.setResaltarBusquedaTarjetaCreditoTarjetasCreditos(resaltar);

			jPanel.setBorder(this.tarjetascreditosConstantesFunciones.resaltarBusquedaTarjetaCreditoTarjetasCreditos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTarjetasCreditos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTarjetasCreditos() throws Exception {

		if(this.jInternalFrameDetalleFormTarjetasCreditos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTarjetasCreditos();
		this.updateVisibilidadResaltarControlesFormularioTarjetasCreditos();
		this.updateHabilitarResaltarControlesFormularioTarjetasCreditos();
		
	}
	
	public void updateBorderResaltarControlesFormularioTarjetasCreditos() throws Exception {
		if(this.jInternalFrameDetalleFormTarjetasCreditos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tarjetascreditosConstantesFunciones.resaltaridTarjetasCreditos!=null && this.jInternalFrameDetalleFormTarjetasCreditos!=null) {this.jInternalFrameDetalleFormTarjetasCreditos.jLabelidTarjetasCreditos.setBorder(this.tarjetascreditosConstantesFunciones.resaltaridTarjetasCreditos);}
		if(this.tarjetascreditosConstantesFunciones.resaltarid_empresaTarjetasCreditos!=null && this.jInternalFrameDetalleFormTarjetasCreditos!=null) {this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_empresaTarjetasCreditos.setBorder(this.tarjetascreditosConstantesFunciones.resaltarid_empresaTarjetasCreditos);}
		if(this.tarjetascreditosConstantesFunciones.resaltarid_sucursalTarjetasCreditos!=null && this.jInternalFrameDetalleFormTarjetasCreditos!=null) {this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_sucursalTarjetasCreditos.setBorder(this.tarjetascreditosConstantesFunciones.resaltarid_sucursalTarjetasCreditos);}
		if(this.tarjetascreditosConstantesFunciones.resaltarid_tarjeta_creditoTarjetasCreditos!=null && this.jInternalFrameDetalleFormTarjetasCreditos!=null) {this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_tarjeta_creditoTarjetasCreditos.setBorder(this.tarjetascreditosConstantesFunciones.resaltarid_tarjeta_creditoTarjetasCreditos);}
		if(this.tarjetascreditosConstantesFunciones.resaltarfecha_inicioTarjetasCreditos!=null && this.jInternalFrameDetalleFormTarjetasCreditos!=null) {this.jInternalFrameDetalleFormTarjetasCreditos.jDateChooserfecha_inicioTarjetasCreditos.setBorder(this.tarjetascreditosConstantesFunciones.resaltarfecha_inicioTarjetasCreditos);}
		if(this.tarjetascreditosConstantesFunciones.resaltarfecha_finTarjetasCreditos!=null && this.jInternalFrameDetalleFormTarjetasCreditos!=null) {this.jInternalFrameDetalleFormTarjetasCreditos.jDateChooserfecha_finTarjetasCreditos.setBorder(this.tarjetascreditosConstantesFunciones.resaltarfecha_finTarjetasCreditos);}
		if(this.tarjetascreditosConstantesFunciones.resaltarnombre_tarjetaTarjetasCreditos!=null && this.jInternalFrameDetalleFormTarjetasCreditos!=null) {this.jInternalFrameDetalleFormTarjetasCreditos.jTextAreanombre_tarjetaTarjetasCreditos.setBorder(this.tarjetascreditosConstantesFunciones.resaltarnombre_tarjetaTarjetasCreditos);}
		if(this.tarjetascreditosConstantesFunciones.resaltarloteTarjetasCreditos!=null && this.jInternalFrameDetalleFormTarjetasCreditos!=null) {this.jInternalFrameDetalleFormTarjetasCreditos.jTextFieldloteTarjetasCreditos.setBorder(this.tarjetascreditosConstantesFunciones.resaltarloteTarjetasCreditos);}
		if(this.tarjetascreditosConstantesFunciones.resaltarfechaTarjetasCreditos!=null && this.jInternalFrameDetalleFormTarjetasCreditos!=null) {this.jInternalFrameDetalleFormTarjetasCreditos.jDateChooserfechaTarjetasCreditos.setBorder(this.tarjetascreditosConstantesFunciones.resaltarfechaTarjetasCreditos);}
		if(this.tarjetascreditosConstantesFunciones.resaltartotalTarjetasCreditos!=null && this.jInternalFrameDetalleFormTarjetasCreditos!=null) {this.jInternalFrameDetalleFormTarjetasCreditos.jTextFieldtotalTarjetasCreditos.setBorder(this.tarjetascreditosConstantesFunciones.resaltartotalTarjetasCreditos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTarjetasCreditos() throws Exception {		
		if(this.jInternalFrameDetalleFormTarjetasCreditos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
	
		//this.jInternalFrameDetalleFormTarjetasCreditos.jLabelidTarjetasCreditos.setVisible(this.tarjetascreditosConstantesFunciones.mostraridTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jPanelidTarjetasCreditos.setVisible(this.tarjetascreditosConstantesFunciones.mostraridTarjetasCreditos);
		//this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_empresaTarjetasCreditos.setVisible(this.tarjetascreditosConstantesFunciones.mostrarid_empresaTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jPanelid_empresaTarjetasCreditos.setVisible(this.tarjetascreditosConstantesFunciones.mostrarid_empresaTarjetasCreditos);
		//this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_sucursalTarjetasCreditos.setVisible(this.tarjetascreditosConstantesFunciones.mostrarid_sucursalTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jPanelid_sucursalTarjetasCreditos.setVisible(this.tarjetascreditosConstantesFunciones.mostrarid_sucursalTarjetasCreditos);
		//this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_tarjeta_creditoTarjetasCreditos.setVisible(this.tarjetascreditosConstantesFunciones.mostrarid_tarjeta_creditoTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jPanelid_tarjeta_creditoTarjetasCreditos.setVisible(this.tarjetascreditosConstantesFunciones.mostrarid_tarjeta_creditoTarjetasCreditos);
		//this.jInternalFrameDetalleFormTarjetasCreditos.jDateChooserfecha_inicioTarjetasCreditos.setVisible(this.tarjetascreditosConstantesFunciones.mostrarfecha_inicioTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jPanelfecha_inicioTarjetasCreditos.setVisible(this.tarjetascreditosConstantesFunciones.mostrarfecha_inicioTarjetasCreditos);
		//this.jInternalFrameDetalleFormTarjetasCreditos.jDateChooserfecha_finTarjetasCreditos.setVisible(this.tarjetascreditosConstantesFunciones.mostrarfecha_finTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jPanelfecha_finTarjetasCreditos.setVisible(this.tarjetascreditosConstantesFunciones.mostrarfecha_finTarjetasCreditos);
		//this.jInternalFrameDetalleFormTarjetasCreditos.jTextAreanombre_tarjetaTarjetasCreditos.setVisible(this.tarjetascreditosConstantesFunciones.mostrarnombre_tarjetaTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jPanelnombre_tarjetaTarjetasCreditos.setVisible(this.tarjetascreditosConstantesFunciones.mostrarnombre_tarjetaTarjetasCreditos);
		//this.jInternalFrameDetalleFormTarjetasCreditos.jTextFieldloteTarjetasCreditos.setVisible(this.tarjetascreditosConstantesFunciones.mostrarloteTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jPanelloteTarjetasCreditos.setVisible(this.tarjetascreditosConstantesFunciones.mostrarloteTarjetasCreditos);
		//this.jInternalFrameDetalleFormTarjetasCreditos.jDateChooserfechaTarjetasCreditos.setVisible(this.tarjetascreditosConstantesFunciones.mostrarfechaTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jPanelfechaTarjetasCreditos.setVisible(this.tarjetascreditosConstantesFunciones.mostrarfechaTarjetasCreditos);
		//this.jInternalFrameDetalleFormTarjetasCreditos.jTextFieldtotalTarjetasCreditos.setVisible(this.tarjetascreditosConstantesFunciones.mostrartotalTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jPaneltotalTarjetasCreditos.setVisible(this.tarjetascreditosConstantesFunciones.mostrartotalTarjetasCreditos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTarjetasCreditos() throws Exception {
		if(this.jInternalFrameDetalleFormTarjetasCreditos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTarjetasCreditos!=null) {
	
		this.jInternalFrameDetalleFormTarjetasCreditos.jLabelidTarjetasCreditos.setEnabled(this.tarjetascreditosConstantesFunciones.activaridTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_empresaTarjetasCreditos.setEnabled(this.tarjetascreditosConstantesFunciones.activarid_empresaTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_sucursalTarjetasCreditos.setEnabled(this.tarjetascreditosConstantesFunciones.activarid_sucursalTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jComboBoxid_tarjeta_creditoTarjetasCreditos.setEnabled(this.tarjetascreditosConstantesFunciones.activarid_tarjeta_creditoTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jDateChooserfecha_inicioTarjetasCreditos.setEnabled(this.tarjetascreditosConstantesFunciones.activarfecha_inicioTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jDateChooserfecha_finTarjetasCreditos.setEnabled(this.tarjetascreditosConstantesFunciones.activarfecha_finTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jTextAreanombre_tarjetaTarjetasCreditos.setEnabled(this.tarjetascreditosConstantesFunciones.activarnombre_tarjetaTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jTextFieldloteTarjetasCreditos.setEnabled(this.tarjetascreditosConstantesFunciones.activarloteTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jDateChooserfechaTarjetasCreditos.setEnabled(this.tarjetascreditosConstantesFunciones.activarfechaTarjetasCreditos);
		this.jInternalFrameDetalleFormTarjetasCreditos.jTextFieldtotalTarjetasCreditos.setEnabled(this.tarjetascreditosConstantesFunciones.activartotalTarjetasCreditos);
		}
	}
	
		
}