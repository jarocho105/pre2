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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.cartera.util.CobrarListadosMovimientosConstantesFunciones;
import com.bydan.erp.cartera.util.report.CobrarListadosMovimientosParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.CobrarListadosMovimientosParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.CobrarListadosMovimientosBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.cartera.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.cartera.util.*;

import com.bydan.erp.cartera.util.report.*;
import com.bydan.erp.cartera.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.business.entity.report.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;

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
public class CobrarListadosMovimientosBeanSwingJInternalFrame extends CobrarListadosMovimientosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CobrarListadosMovimientosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CobrarListadosMovimientos> cobrarlistadosmovimientosValidator = new ClassValidator<CobrarListadosMovimientos>(CobrarListadosMovimientos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CobrarListadosMovimientos cobrarlistadosmovimientos;	
	public CobrarListadosMovimientos cobrarlistadosmovimientosAux;
	public CobrarListadosMovimientos cobrarlistadosmovimientosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CobrarListadosMovimientos cobrarlistadosmovimientosTotales;
	public Long idCobrarListadosMovimientosActual;
	public Long iIdNuevoCobrarListadosMovimientos=0L;
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
	
	public Boolean isPermisoTodoCobrarListadosMovimientos;
	public Boolean isPermisoNuevoCobrarListadosMovimientos;
	public Boolean isPermisoActualizarCobrarListadosMovimientos;
	public Boolean isPermisoActualizarOriginalCobrarListadosMovimientos;
	public Boolean isPermisoEliminarCobrarListadosMovimientos;
	public Boolean isPermisoGuardarCambiosCobrarListadosMovimientos;
	public Boolean isPermisoConsultaCobrarListadosMovimientos;
	public Boolean isPermisoBusquedaCobrarListadosMovimientos;
	public Boolean isPermisoReporteCobrarListadosMovimientos;
	public Boolean isPermisoPaginacionMedioCobrarListadosMovimientos;
	public Boolean isPermisoPaginacionAltoCobrarListadosMovimientos;
	public Boolean isPermisoPaginacionTodoCobrarListadosMovimientos;
	public Boolean isPermisoCopiarCobrarListadosMovimientos;
	public Boolean isPermisoVerFormCobrarListadosMovimientos;
	public Boolean isPermisoDuplicarCobrarListadosMovimientos;
	public Boolean isPermisoOrdenCobrarListadosMovimientos;
	
	
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
	
	public CobrarListadosMovimientosParameterReturnGeneral cobrarlistadosmovimientosReturnGeneral;
	public CobrarListadosMovimientosParameterReturnGeneral cobrarlistadosmovimientosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCobrarListadosMovimientos=false;
	public Boolean esParaAccionDesdeFormularioCobrarListadosMovimientos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CobrarListadosMovimientosSessionBeanAdditional cobrarlistadosmovimientosSessionBeanAdditional=null;
	
	public CobrarListadosMovimientosSessionBeanAdditional getCobrarListadosMovimientosSessionBeanAdditional() {
		return this.cobrarlistadosmovimientosSessionBeanAdditional;
	}
	
	public void setCobrarListadosMovimientosSessionBeanAdditional(CobrarListadosMovimientosSessionBeanAdditional cobrarlistadosmovimientosSessionBeanAdditional) {
		try {
			this.cobrarlistadosmovimientosSessionBeanAdditional=cobrarlistadosmovimientosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CobrarListadosMovimientosBeanSwingJInternalFrameAdditional cobrarlistadosmovimientosBeanSwingJInternalFrameAdditional=null;
	//public class CobrarListadosMovimientosBeanSwingJInternalFrame
	
	public CobrarListadosMovimientosBeanSwingJInternalFrameAdditional getCobrarListadosMovimientosBeanSwingJInternalFrameAdditional() {
		return this.cobrarlistadosmovimientosBeanSwingJInternalFrameAdditional;
	}
	
	public void setCobrarListadosMovimientosBeanSwingJInternalFrameAdditional(CobrarListadosMovimientosBeanSwingJInternalFrameAdditional cobrarlistadosmovimientosBeanSwingJInternalFrameAdditional) {
		try {
			this.cobrarlistadosmovimientosBeanSwingJInternalFrameAdditional=cobrarlistadosmovimientosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CobrarListadosMovimientosLogic cobrarlistadosmovimientosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CobrarListadosMovimientos cobrarlistadosmovimientosBean;
	public CobrarListadosMovimientosConstantesFunciones cobrarlistadosmovimientosConstantesFunciones;
	//public CobrarListadosMovimientosParameterReturnGeneral cobrarlistadosmovimientosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<CobrarListadosMovimientos> cobrarlistadosmovimientoss;	
	//public List<CobrarListadosMovimientos> cobrarlistadosmovimientossEliminados;
	//public List<CobrarListadosMovimientos> cobrarlistadosmovimientossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCobrarListadosMovimientos=false;
	public Boolean isVisibilidadCeldaDuplicarCobrarListadosMovimientos=true;
	public Boolean isVisibilidadCeldaCopiarCobrarListadosMovimientos=true;
	public Boolean isVisibilidadCeldaVerFormCobrarListadosMovimientos=true;
	public Boolean isVisibilidadCeldaOrdenCobrarListadosMovimientos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos=false;
	public Boolean isVisibilidadCeldaModificarCobrarListadosMovimientos=false;
	public Boolean isVisibilidadCeldaActualizarCobrarListadosMovimientos=false;
	public Boolean isVisibilidadCeldaEliminarCobrarListadosMovimientos=false;
	public Boolean isVisibilidadCeldaCancelarCobrarListadosMovimientos=false;
	public Boolean isVisibilidadCeldaGuardarCobrarListadosMovimientos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos=false;	
	
	
	public Boolean isVisibilidadBusquedaCobrarListadosMovimientos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoCobrarListadosMovimientos() {
		return this.iIdNuevoCobrarListadosMovimientos;
	}

	public void setiIdNuevoCobrarListadosMovimientos(Long iIdNuevoCobrarListadosMovimientos) {
		this.iIdNuevoCobrarListadosMovimientos = iIdNuevoCobrarListadosMovimientos;
	}
	
	public Long getidCobrarListadosMovimientosActual() {
		return this.idCobrarListadosMovimientosActual;
	}

	public void setidCobrarListadosMovimientosActual(Long idCobrarListadosMovimientosActual) {
		this.idCobrarListadosMovimientosActual = idCobrarListadosMovimientosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CobrarListadosMovimientos getcobrarlistadosmovimientos() {
		return this.cobrarlistadosmovimientos;
	}

	public void setcobrarlistadosmovimientos(CobrarListadosMovimientos cobrarlistadosmovimientos) {
		this.cobrarlistadosmovimientos = cobrarlistadosmovimientos;
	}
	
	public CobrarListadosMovimientos getcobrarlistadosmovimientosAux() {
		return this.cobrarlistadosmovimientosAux;
	}

	public void setcobrarlistadosmovimientosAux(CobrarListadosMovimientos cobrarlistadosmovimientosAux) {
		this.cobrarlistadosmovimientosAux = cobrarlistadosmovimientosAux;
	}				
	
	public CobrarListadosMovimientos getcobrarlistadosmovimientosAnterior() {
		return this.cobrarlistadosmovimientosAnterior;
	}

	public void setcobrarlistadosmovimientosAnterior(CobrarListadosMovimientos cobrarlistadosmovimientosAnterior) {
		this.cobrarlistadosmovimientosAnterior = cobrarlistadosmovimientosAnterior;
	}	
	
	public CobrarListadosMovimientos getcobrarlistadosmovimientosTotales() {
		return this.cobrarlistadosmovimientosTotales;
	}

	public void setcobrarlistadosmovimientosTotales(CobrarListadosMovimientos cobrarlistadosmovimientosTotales) {
		this.cobrarlistadosmovimientosTotales = cobrarlistadosmovimientosTotales;
	}	
	
	public CobrarListadosMovimientos getcobrarlistadosmovimientosBean() {
		return this.cobrarlistadosmovimientosBean;
	}

	public void setcobrarlistadosmovimientosBean(CobrarListadosMovimientos cobrarlistadosmovimientosBean) {
		this.cobrarlistadosmovimientosBean = cobrarlistadosmovimientosBean;
	}	
	
	public CobrarListadosMovimientosParameterReturnGeneral getcobrarlistadosmovimientosReturnGeneral() {
		return this.cobrarlistadosmovimientosReturnGeneral;
	}

	public void setcobrarlistadosmovimientosReturnGeneral(CobrarListadosMovimientosParameterReturnGeneral cobrarlistadosmovimientosReturnGeneral) {
		this.cobrarlistadosmovimientosReturnGeneral = cobrarlistadosmovimientosReturnGeneral;
	}	
	
	
	public Date fecha_emision_desdeBusquedaCobrarListadosMovimientos=new Date();

	public Date getfecha_emision_desdeBusquedaCobrarListadosMovimientos() {
		return this.fecha_emision_desdeBusquedaCobrarListadosMovimientos;
	}

	public void setfecha_emision_desdeBusquedaCobrarListadosMovimientos(Date fecha_emision_desdeBusquedaCobrarListadosMovimientos) {
		this.fecha_emision_desdeBusquedaCobrarListadosMovimientos = fecha_emision_desdeBusquedaCobrarListadosMovimientos;
	}

;
	public Date fecha_emision_hastaBusquedaCobrarListadosMovimientos=new Date();

	public Date getfecha_emision_hastaBusquedaCobrarListadosMovimientos() {
		return this.fecha_emision_hastaBusquedaCobrarListadosMovimientos;
	}

	public void setfecha_emision_hastaBusquedaCobrarListadosMovimientos(Date fecha_emision_hastaBusquedaCobrarListadosMovimientos) {
		this.fecha_emision_hastaBusquedaCobrarListadosMovimientos = fecha_emision_hastaBusquedaCobrarListadosMovimientos;
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
	
	
	public CobrarListadosMovimientosLogic getCobrarListadosMovimientosLogic()	{		
		return cobrarlistadosmovimientosLogic;
	}

	public void setCobrarListadosMovimientosLogic(CobrarListadosMovimientosLogic cobrarlistadosmovimientosLogic) {
		this.cobrarlistadosmovimientosLogic = cobrarlistadosmovimientosLogic;
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
	
	public Boolean getIsEsNuevoCobrarListadosMovimientos() {
		return isEsNuevoCobrarListadosMovimientos;
	}

	public void setIsEsNuevoCobrarListadosMovimientos(Boolean isEsNuevoCobrarListadosMovimientos) {
		this.isEsNuevoCobrarListadosMovimientos = isEsNuevoCobrarListadosMovimientos;
	}

	public Boolean getEsParaAccionDesdeFormularioCobrarListadosMovimientos() {
		return esParaAccionDesdeFormularioCobrarListadosMovimientos;
	}
	
	public void setEsParaAccionDesdeFormularioCobrarListadosMovimientos(Boolean esParaAccionDesdeFormularioCobrarListadosMovimientos) {
		this.esParaAccionDesdeFormularioCobrarListadosMovimientos = esParaAccionDesdeFormularioCobrarListadosMovimientos;
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

			if(this.cobrarlistadosmovimientosSessionBean==null) {
				this.cobrarlistadosmovimientosSessionBean=new CobrarListadosMovimientosSessionBean();
			}

			if(!this.cobrarlistadosmovimientosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cobrarlistadosmovimientosSessionBean.getlidEmpresaActual());
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

					if(this.cobrarlistadosmovimientos!=null) {
						this.cobrarlistadosmovimientos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
						this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxid_empresaCobrarListadosMovimientos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCobrarListadosMovimientos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
						if(this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxid_empresaCobrarListadosMovimientos.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxid_empresaCobrarListadosMovimientos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCobrarListadosMovimientosGenerico)throws Exception
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
				jComboBoxid_empresaCobrarListadosMovimientosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCobrarListadosMovimientosGenerico!=null && jComboBoxid_empresaCobrarListadosMovimientosGenerico.getItemCount()>0) {
					jComboBoxid_empresaCobrarListadosMovimientosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CobrarListadosMovimientos cobrarlistadosmovimientos,JComboBox jComboBoxid_empresaCobrarListadosMovimientosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCobrarListadosMovimientosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxid_empresaCobrarListadosMovimientos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCobrarListadosMovimientosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cobrarlistadosmovimientos.setid_empresa(empresaAux.getId());
				cobrarlistadosmovimientos.setempresa_descripcion(CobrarListadosMovimientosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cobrarlistadosmovimientos.setEmpresa(empresaAux);			}
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

					if(!CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) { 
							this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxid_empresaCobrarListadosMovimientos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxid_empresaCobrarListadosMovimientos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) { 
					}

					if(!CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
							this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxid_empresaCobrarListadosMovimientos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
							this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxid_empresaCobrarListadosMovimientos.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesCobrarListadosMovimientos() throws Exception {
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
		
	public CobrarListadosMovimientosParameterReturnGeneral getCobrarListadosMovimientosParameterGeneral() {
		return this.cobrarlistadosmovimientosParameterGeneral;
	}
	
	public void setCobrarListadosMovimientosParameterGeneral(CobrarListadosMovimientosParameterReturnGeneral cobrarlistadosmovimientosParameterGeneral) {
		this.cobrarlistadosmovimientosParameterGeneral = cobrarlistadosmovimientosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCobrarListadosMovimientos() {
		return isPermisoTodoCobrarListadosMovimientos;
	}

	public void setIsPermisoTodoCobrarListadosMovimientos(Boolean isPermisoTodoCobrarListadosMovimientos) {
		this.isPermisoTodoCobrarListadosMovimientos = isPermisoTodoCobrarListadosMovimientos;
	}

	public Boolean getIsPermisoNuevoCobrarListadosMovimientos() {
		return isPermisoNuevoCobrarListadosMovimientos;
	}

	public void setIsPermisoNuevoCobrarListadosMovimientos(Boolean isPermisoNuevoCobrarListadosMovimientos) {
		this.isPermisoNuevoCobrarListadosMovimientos = isPermisoNuevoCobrarListadosMovimientos;
	}

	public Boolean getIsPermisoActualizarCobrarListadosMovimientos() {
		return isPermisoActualizarCobrarListadosMovimientos;
	}

	public void setIsPermisoActualizarCobrarListadosMovimientos(Boolean isPermisoActualizarCobrarListadosMovimientos) {
		this.isPermisoActualizarCobrarListadosMovimientos = isPermisoActualizarCobrarListadosMovimientos;
	}

	public Boolean getIsPermisoEliminarCobrarListadosMovimientos() {
		return isPermisoEliminarCobrarListadosMovimientos;
	}

	public void setIsPermisoEliminarCobrarListadosMovimientos(Boolean isPermisoEliminarCobrarListadosMovimientos) {
		this.isPermisoEliminarCobrarListadosMovimientos = isPermisoEliminarCobrarListadosMovimientos;
	}

	public Boolean getIsPermisoGuardarCambiosCobrarListadosMovimientos() {
		return isPermisoGuardarCambiosCobrarListadosMovimientos;
	}

	public void setIsPermisoGuardarCambiosCobrarListadosMovimientos(Boolean isPermisoGuardarCambiosCobrarListadosMovimientos) {
		this.isPermisoGuardarCambiosCobrarListadosMovimientos = isPermisoGuardarCambiosCobrarListadosMovimientos;
	}
	
	public Boolean getIsPermisoConsultaCobrarListadosMovimientos() {
		return isPermisoConsultaCobrarListadosMovimientos;
	}

	public void setIsPermisoConsultaCobrarListadosMovimientos(Boolean isPermisoConsultaCobrarListadosMovimientos) {
		this.isPermisoConsultaCobrarListadosMovimientos = isPermisoConsultaCobrarListadosMovimientos;
	}

	public Boolean getIsPermisoBusquedaCobrarListadosMovimientos() {
		return isPermisoBusquedaCobrarListadosMovimientos;
	}

	public void setIsPermisoBusquedaCobrarListadosMovimientos(Boolean isPermisoBusquedaCobrarListadosMovimientos) {
		this.isPermisoBusquedaCobrarListadosMovimientos = isPermisoBusquedaCobrarListadosMovimientos;
	}

	public Boolean getIsPermisoReporteCobrarListadosMovimientos() {
		return isPermisoReporteCobrarListadosMovimientos;
	}

	public void setIsPermisoReporteCobrarListadosMovimientos(Boolean isPermisoReporteCobrarListadosMovimientos) {
		this.isPermisoReporteCobrarListadosMovimientos = isPermisoReporteCobrarListadosMovimientos;
	}
	
	public Boolean getIsPermisoPaginacionMedioCobrarListadosMovimientos() {
		return isPermisoPaginacionMedioCobrarListadosMovimientos;
	}

	public void setIsPermisoPaginacionMedioCobrarListadosMovimientos(Boolean isPermisoPaginacionMedioCobrarListadosMovimientos) {
		this.isPermisoPaginacionMedioCobrarListadosMovimientos = isPermisoPaginacionMedioCobrarListadosMovimientos;
	}
	
	public Boolean getIsPermisoPaginacionTodoCobrarListadosMovimientos() {
		return isPermisoPaginacionTodoCobrarListadosMovimientos;
	}

	public void setIsPermisoPaginacionTodoCobrarListadosMovimientos(Boolean isPermisoPaginacionTodoCobrarListadosMovimientos) {
		this.isPermisoPaginacionTodoCobrarListadosMovimientos = isPermisoPaginacionTodoCobrarListadosMovimientos;
	}
	
	public Boolean getIsPermisoPaginacionAltoCobrarListadosMovimientos() {
		return isPermisoPaginacionAltoCobrarListadosMovimientos;
	}

	public void setIsPermisoPaginacionAltoCobrarListadosMovimientos(Boolean isPermisoPaginacionAltoCobrarListadosMovimientos) {
		this.isPermisoPaginacionAltoCobrarListadosMovimientos = isPermisoPaginacionAltoCobrarListadosMovimientos;
	}
	
	public Boolean getIsPermisoCopiarCobrarListadosMovimientos() {
		return isPermisoCopiarCobrarListadosMovimientos;
	}

	public void setIsPermisoCopiarCobrarListadosMovimientos(Boolean isPermisoCopiarCobrarListadosMovimientos) {
		this.isPermisoCopiarCobrarListadosMovimientos = isPermisoCopiarCobrarListadosMovimientos;
	}
	
	public Boolean getIsPermisoVerFormCobrarListadosMovimientos() {
		return isPermisoVerFormCobrarListadosMovimientos;
	}

	public void setIsPermisoVerFormCobrarListadosMovimientos(Boolean isPermisoVerFormCobrarListadosMovimientos) {
		this.isPermisoVerFormCobrarListadosMovimientos = isPermisoVerFormCobrarListadosMovimientos;
	}
	
	public Boolean getIsPermisoDuplicarCobrarListadosMovimientos() {
		return isPermisoDuplicarCobrarListadosMovimientos;
	}

	public void setIsPermisoDuplicarCobrarListadosMovimientos(Boolean isPermisoDuplicarCobrarListadosMovimientos) {
		this.isPermisoDuplicarCobrarListadosMovimientos = isPermisoDuplicarCobrarListadosMovimientos;
	}
	
	public Boolean getIsPermisoOrdenCobrarListadosMovimientos() {
		return isPermisoOrdenCobrarListadosMovimientos;
	}

	public void setIsPermisoOrdenCobrarListadosMovimientos(Boolean isPermisoOrdenCobrarListadosMovimientos) {
		this.isPermisoOrdenCobrarListadosMovimientos = isPermisoOrdenCobrarListadosMovimientos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCobrarListadosMovimientos() {
		return isVisibilidadCeldaNuevoCobrarListadosMovimientos;
	}

	public void setIsVisibilidadCeldaNuevoCobrarListadosMovimientos(Boolean isVisibilidadCeldaNuevoCobrarListadosMovimientos) {
		this.isVisibilidadCeldaNuevoCobrarListadosMovimientos = isVisibilidadCeldaNuevoCobrarListadosMovimientos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCobrarListadosMovimientos() {
		return isVisibilidadCeldaDuplicarCobrarListadosMovimientos;
	}

	public void setIsVisibilidadCeldaDuplicarCobrarListadosMovimientos(Boolean isVisibilidadCeldaDuplicarCobrarListadosMovimientos) {
		this.isVisibilidadCeldaDuplicarCobrarListadosMovimientos = isVisibilidadCeldaDuplicarCobrarListadosMovimientos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCobrarListadosMovimientos() {
		return isVisibilidadCeldaCopiarCobrarListadosMovimientos;
	}

	public void setIsVisibilidadCeldaCopiarCobrarListadosMovimientos(Boolean isVisibilidadCeldaCopiarCobrarListadosMovimientos) {
		this.isVisibilidadCeldaCopiarCobrarListadosMovimientos = isVisibilidadCeldaCopiarCobrarListadosMovimientos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCobrarListadosMovimientos() {
		return isVisibilidadCeldaVerFormCobrarListadosMovimientos;
	}

	public void setIsVisibilidadCeldaVerFormCobrarListadosMovimientos(Boolean isVisibilidadCeldaVerFormCobrarListadosMovimientos) {
		this.isVisibilidadCeldaVerFormCobrarListadosMovimientos = isVisibilidadCeldaVerFormCobrarListadosMovimientos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCobrarListadosMovimientos() {
		return isVisibilidadCeldaOrdenCobrarListadosMovimientos;
	}

	public void setIsVisibilidadCeldaOrdenCobrarListadosMovimientos(Boolean isVisibilidadCeldaOrdenCobrarListadosMovimientos) {
		this.isVisibilidadCeldaOrdenCobrarListadosMovimientos = isVisibilidadCeldaOrdenCobrarListadosMovimientos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos() {
		return isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos(Boolean isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos) {
		this.isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos = isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCobrarListadosMovimientos() {
		return isVisibilidadCeldaModificarCobrarListadosMovimientos;
	}

	public void setIsVisibilidadCeldaModificarCobrarListadosMovimientos(Boolean isVisibilidadCeldaModificarCobrarListadosMovimientos) {
		this.isVisibilidadCeldaModificarCobrarListadosMovimientos = isVisibilidadCeldaModificarCobrarListadosMovimientos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCobrarListadosMovimientos() {
		return isVisibilidadCeldaActualizarCobrarListadosMovimientos;
	}

	public void setIsVisibilidadCeldaActualizarCobrarListadosMovimientos(Boolean isVisibilidadCeldaActualizarCobrarListadosMovimientos) {
		this.isVisibilidadCeldaActualizarCobrarListadosMovimientos = isVisibilidadCeldaActualizarCobrarListadosMovimientos;
	}

	public Boolean getIsVisibilidadCeldaEliminarCobrarListadosMovimientos() {
		return isVisibilidadCeldaEliminarCobrarListadosMovimientos;
	}

	public void setIsVisibilidadCeldaEliminarCobrarListadosMovimientos(Boolean isVisibilidadCeldaEliminarCobrarListadosMovimientos) {
		this.isVisibilidadCeldaEliminarCobrarListadosMovimientos = isVisibilidadCeldaEliminarCobrarListadosMovimientos;
	}

	public Boolean getIsVisibilidadCeldaCancelarCobrarListadosMovimientos() {
		return isVisibilidadCeldaCancelarCobrarListadosMovimientos;
	}

	public void setIsVisibilidadCeldaCancelarCobrarListadosMovimientos(Boolean isVisibilidadCeldaCancelarCobrarListadosMovimientos) {
		this.isVisibilidadCeldaCancelarCobrarListadosMovimientos = isVisibilidadCeldaCancelarCobrarListadosMovimientos;
	}

	public Boolean getIsVisibilidadCeldaGuardarCobrarListadosMovimientos() {
		return isVisibilidadCeldaGuardarCobrarListadosMovimientos;
	}

	public void setIsVisibilidadCeldaGuardarCobrarListadosMovimientos(Boolean isVisibilidadCeldaGuardarCobrarListadosMovimientos) {
		this.isVisibilidadCeldaGuardarCobrarListadosMovimientos = isVisibilidadCeldaGuardarCobrarListadosMovimientos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos() {
		return isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos(Boolean isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos) {
		this.isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos = isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos;
	}
		
	public CobrarListadosMovimientosSessionBean getcobrarlistadosmovimientosSessionBean() {
		return this.cobrarlistadosmovimientosSessionBean;
	}
	
	public void setcobrarlistadosmovimientosSessionBean(CobrarListadosMovimientosSessionBean cobrarlistadosmovimientosSessionBean) {
		this.cobrarlistadosmovimientosSessionBean=cobrarlistadosmovimientosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaCobrarListadosMovimientos() {
		return this.isVisibilidadBusquedaCobrarListadosMovimientos;
	}

	public void setisVisibilidadBusquedaCobrarListadosMovimientos(Boolean isVisibilidadBusquedaCobrarListadosMovimientos) {
		this.isVisibilidadBusquedaCobrarListadosMovimientos=isVisibilidadBusquedaCobrarListadosMovimientos;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(CobrarListadosMovimientos cobrarlistadosmovimientos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cobrarlistadosmovimientos,null);
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
	
	public void bugActualizarReferenciaActual(CobrarListadosMovimientos cobrarlistadosmovimientos,CobrarListadosMovimientos cobrarlistadosmovimientosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCobrarListadosMovimientos(cobrarlistadosmovimientos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cobrarlistadosmovimientosAux.setId(cobrarlistadosmovimientos.getId());
		cobrarlistadosmovimientosAux.setVersionRow(cobrarlistadosmovimientos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(CobrarListadosMovimientos cobrarlistadosmovimientosLocal) throws Exception {
		
		if(this.cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CobrarListadosMovimientos cobrarlistadosmovimientosLocal) throws Exception {	
		if(this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cobrarlistadosmovimientosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCobrarListadosMovimientosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cobrarlistadosmovimientosValidator.getInvalidValues(this.cobrarlistadosmovimientos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CobrarListadosMovimientos cobrarlistadosmovimientos,List<CobrarListadosMovimientos> cobrarlistadosmovimientoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(CobrarListadosMovimientos cobrarlistadosmovimientos,List<CobrarListadosMovimientos> cobrarlistadosmovimientoss) throws Exception {
		try	{			
			CobrarListadosMovimientosConstantesFunciones.actualizarSelectedLista(cobrarlistadosmovimientos,cobrarlistadosmovimientoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CobrarListadosMovimientos> cobrarlistadosmovimientossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cobrarlistadosmovimientossLocal=this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cobrarlistadosmovimientossLocal=this.cobrarlistadosmovimientoss;
			}
			//ARCHITECTURE
		
			for(CobrarListadosMovimientos cobrarlistadosmovimientosLocal:cobrarlistadosmovimientossLocal) {
				if(this.permiteMantenimiento(cobrarlistadosmovimientosLocal) && cobrarlistadosmovimientosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CobrarListadosMovimientosConstantesFunciones.getCobrarListadosMovimientosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CobrarListadosMovimientosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelcodigoCobrarListadosMovimientos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarListadosMovimientosConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelnombre_completoCobrarListadosMovimientos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarListadosMovimientosConstantesFunciones.NOMBRETRANSACCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelnombre_transaccionCobrarListadosMovimientos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarListadosMovimientosConstantesFunciones.FECHAVENCE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelfecha_venceCobrarListadosMovimientos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarListadosMovimientosConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelfecha_emisionCobrarListadosMovimientos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarListadosMovimientosConstantesFunciones.NUMEROCOMPROBANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelnumero_comprobanteCobrarListadosMovimientos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarListadosMovimientosConstantesFunciones.NUMEROFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelnumero_facturaCobrarListadosMovimientos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarListadosMovimientosConstantesFunciones.DEBITOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabeldebito_mone_localCobrarListadosMovimientos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarListadosMovimientosConstantesFunciones.CREDITOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelcredito_mone_localCobrarListadosMovimientos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarListadosMovimientosConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabeldescripcionCobrarListadosMovimientos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelcodigoCobrarListadosMovimientos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelnombre_completoCobrarListadosMovimientos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelnombre_transaccionCobrarListadosMovimientos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelfecha_venceCobrarListadosMovimientos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelfecha_emisionCobrarListadosMovimientos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelnumero_comprobanteCobrarListadosMovimientos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelnumero_facturaCobrarListadosMovimientos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabeldebito_mone_localCobrarListadosMovimientos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelcredito_mone_localCobrarListadosMovimientos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabeldescripcionCobrarListadosMovimientos,"");
		
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
		this.iIdNuevoCobrarListadosMovimientos--;	
		
		
		this.cobrarlistadosmovimientosAux=new CobrarListadosMovimientos();
		
		this.cobrarlistadosmovimientosAux.setId(this.iIdNuevoCobrarListadosMovimientos);
		this.cobrarlistadosmovimientosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().add(this.cobrarlistadosmovimientosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cobrarlistadosmovimientoss.add(this.cobrarlistadosmovimientosAux);
		}
		//ARCHITECTURE
		
		this.cobrarlistadosmovimientos=this.cobrarlistadosmovimientosAux;
		
		if(CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
		}
				
		//this.setDefaultControlesCobrarListadosMovimientos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCobrarListadosMovimientos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCobrarListadosMovimientos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarListadosMovimientos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarListadosMovimientos(this.cobrarlistadosmovimientosBean,this.cobrarlistadosmovimientos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCobrarListadosMovimientos(this.cobrarlistadosmovimientosReturnGeneral,this.cobrarlistadosmovimientosBean,false);
		
		if(this.cobrarlistadosmovimientosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarListadosMovimientos(this.cobrarlistadosmovimientosReturnGeneral.getCobrarListadosMovimientos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCobrarListadosMovimientos(this.cobrarlistadosmovimientosReturnGeneral.getCobrarListadosMovimientos());
		}
		
		if(this.cobrarlistadosmovimientosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCobrarListadosMovimientos(this.cobrarlistadosmovimientosReturnGeneral.getCobrarListadosMovimientos(),classes);//this.cobrarlistadosmovimientosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.cobrarlistadosmovimientos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCobrarListadosMovimientos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCobrarListadosMovimientos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.RecargarFormCobrarListadosMovimientos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCobrarListadosMovimientos(false);
						
			if(cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarListadosMovimientos();
			}
			
			this.actualizarVisualTableDatosCobrarListadosMovimientos();
			
			this.jTableDatosCobrarListadosMovimientos.setRowSelectionInterval(this.getIndiceNuevoCobrarListadosMovimientos(), this.getIndiceNuevoCobrarListadosMovimientos());
			
			this.seleccionarFilaTablaCobrarListadosMovimientosActual();
						
			this.actualizarEstadoCeldasBotonesCobrarListadosMovimientos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCobrarListadosMovimientos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_emision_desdeCobrarListadosMovimientos.setEnabled(isHabilitar && this.cobrarlistadosmovimientosConstantesFunciones.activarfecha_emision_desdeCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_emision_hastaCobrarListadosMovimientos.setEnabled(isHabilitar && this.cobrarlistadosmovimientosConstantesFunciones.activarfecha_emision_hastaCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldcodigoCobrarListadosMovimientos.setEnabled(isHabilitar && this.cobrarlistadosmovimientosConstantesFunciones.activarcodigoCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreanombre_completoCobrarListadosMovimientos.setEnabled(isHabilitar && this.cobrarlistadosmovimientosConstantesFunciones.activarnombre_completoCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreanombre_transaccionCobrarListadosMovimientos.setEnabled(isHabilitar && this.cobrarlistadosmovimientosConstantesFunciones.activarnombre_transaccionCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_venceCobrarListadosMovimientos.setEnabled(isHabilitar && this.cobrarlistadosmovimientosConstantesFunciones.activarfecha_venceCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_emisionCobrarListadosMovimientos.setEnabled(isHabilitar && this.cobrarlistadosmovimientosConstantesFunciones.activarfecha_emisionCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldnumero_comprobanteCobrarListadosMovimientos.setEnabled(isHabilitar && this.cobrarlistadosmovimientosConstantesFunciones.activarnumero_comprobanteCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldnumero_facturaCobrarListadosMovimientos.setEnabled(isHabilitar && this.cobrarlistadosmovimientosConstantesFunciones.activarnumero_facturaCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFielddebito_mone_localCobrarListadosMovimientos.setEnabled(isHabilitar && this.cobrarlistadosmovimientosConstantesFunciones.activardebito_mone_localCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldcredito_mone_localCobrarListadosMovimientos.setEnabled(isHabilitar && this.cobrarlistadosmovimientosConstantesFunciones.activarcredito_mone_localCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreadescripcionCobrarListadosMovimientos.setEnabled(isHabilitar && this.cobrarlistadosmovimientosConstantesFunciones.activardescripcionCobrarListadosMovimientos);	
		//
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxid_empresaCobrarListadosMovimientos.setEnabled(isHabilitar && this.cobrarlistadosmovimientosConstantesFunciones.activarid_empresaCobrarListadosMovimientos);
	};
	
	public void setDefaultControlesCobrarListadosMovimientos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCobrarListadosMovimientos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cobrarlistadosmovimientosSessionBean.setConGuardarRelaciones(true);			
			this.cobrarlistadosmovimientosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTabbedPaneRelacionesCobrarListadosMovimientos.setVisible(true);
			
					
		} else {
			//this.cobrarlistadosmovimientosSessionBean.setConGuardarRelaciones(false);			
			this.cobrarlistadosmovimientosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTabbedPaneRelacionesCobrarListadosMovimientos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCobrarListadosMovimientos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss()) {
				if(cobrarlistadosmovimientosAux.getId().equals(this.iIdNuevoCobrarListadosMovimientos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:this.cobrarlistadosmovimientoss) {
				if(cobrarlistadosmovimientosAux.getId().equals(this.iIdNuevoCobrarListadosMovimientos)) {
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
	
	public int getIndiceActualCobrarListadosMovimientos(CobrarListadosMovimientos cobrarlistadosmovimientos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss()) {
				if(cobrarlistadosmovimientosAux.getId().equals(cobrarlistadosmovimientos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:this.cobrarlistadosmovimientoss) {
				if(cobrarlistadosmovimientosAux.getId().equals(cobrarlistadosmovimientos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCobrarListadosMovimientos(CobrarListadosMovimientos cobrarlistadosmovimientosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss()) {
				if(cobrarlistadosmovimientosAux.getCobrarListadosMovimientosOriginal().getId().equals(cobrarlistadosmovimientosOriginal.getId())) {
					existe=true;
					cobrarlistadosmovimientosOriginal.setId(cobrarlistadosmovimientosAux.getId());
					cobrarlistadosmovimientosOriginal.setVersionRow(cobrarlistadosmovimientosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:this.cobrarlistadosmovimientoss) {
				if(cobrarlistadosmovimientosAux.getCobrarListadosMovimientosOriginal().getId().equals(cobrarlistadosmovimientosOriginal.getId())) {
					existe=true;
					cobrarlistadosmovimientosOriginal.setId(cobrarlistadosmovimientosAux.getId());
					cobrarlistadosmovimientosOriginal.setVersionRow(cobrarlistadosmovimientosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCobrarListadosMovimientos(Boolean esParaCancelar) throws Exception {
		cobrarlistadosmovimientossAux=new ArrayList<CobrarListadosMovimientos>();
		cobrarlistadosmovimientosAux=new CobrarListadosMovimientos();
		
		if(!this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss()) {
					if(cobrarlistadosmovimientosAux.getId()<0) {
						cobrarlistadosmovimientossAux.add(cobrarlistadosmovimientosAux);
					}		
				}
				this.iIdNuevoCobrarListadosMovimientos=0L;
				this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().removeAll(cobrarlistadosmovimientossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:this.cobrarlistadosmovimientoss) {
					if(cobrarlistadosmovimientosAux.getId()<0) {
						cobrarlistadosmovimientossAux.add(cobrarlistadosmovimientosAux);
					}		
				}
				this.iIdNuevoCobrarListadosMovimientos=0L;
				this.cobrarlistadosmovimientoss.removeAll(cobrarlistadosmovimientossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCobrarListadosMovimientos 
					&& this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().size()>0
					) {
					cobrarlistadosmovimientosAux=this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().get(this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().size() - 1);
				
					if(cobrarlistadosmovimientosAux.getId()<0) {
						this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().remove(cobrarlistadosmovimientosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCobrarListadosMovimientos && this.cobrarlistadosmovimientoss.size()>0) {
					cobrarlistadosmovimientosAux=this.cobrarlistadosmovimientoss.get(this.cobrarlistadosmovimientoss.size() - 1);
				
					if(cobrarlistadosmovimientosAux.getId()<0) {
						this.cobrarlistadosmovimientoss.remove(cobrarlistadosmovimientosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCobrarListadosMovimientos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cobrarlistadosmovimientos.getId()<0) {
				this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().remove(this.cobrarlistadosmovimientos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cobrarlistadosmovimientos.getId()<0) {
				this.cobrarlistadosmovimientoss.remove(this.cobrarlistadosmovimientos);
			}
		}			
	}
	
	public void setEstadosInicialesCobrarListadosMovimientos(List<CobrarListadosMovimientos> cobrarlistadosmovimientossAux) throws Exception {
		CobrarListadosMovimientosConstantesFunciones.setEstadosInicialesCobrarListadosMovimientos(cobrarlistadosmovimientossAux);
	}
	
	public void setEstadosInicialesCobrarListadosMovimientos(CobrarListadosMovimientos cobrarlistadosmovimientosAux) throws Exception {
		CobrarListadosMovimientosConstantesFunciones.setEstadosInicialesCobrarListadosMovimientos(cobrarlistadosmovimientosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCobrarListadosMovimientosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCobrarListadosMovimientos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCobrarListadosMovimientosActual()) {
				if(!this.isEsNuevoCobrarListadosMovimientos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCobrarListadosMovimientos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCobrarListadosMovimientos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCobrarListadosMovimientosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cobrar Listados Movimientos ?", "MANTENIMIENTO DE Cobrar Listados Movimientos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCobrarListadosMovimientos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CobrarListadosMovimientos cobrarlistadosmovimientos) throws Exception {
		CobrarListadosMovimientosConstantesFunciones.seleccionarAsignar(this.cobrarlistadosmovimientos,cobrarlistadosmovimientos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCobrarListadosMovimientos=this.isPermisoActualizarOriginalCobrarListadosMovimientos;
			
			
			this.seleccionarAsignar(cobrarlistadosmovimientos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesCobrarListadosMovimientos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cobrarlistadosmovimientosSessionBean.setsFuncionBusquedaRapida(this.cobrarlistadosmovimientosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCobrarListadosMovimientos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCobrarListadosMovimientos(esParaCancelar);				
				this.cancelarNuevoCobrarListadosMovimientos(esParaCancelar);								
			}
			
			this.cobrarlistadosmovimientos=new CobrarListadosMovimientos();
			
			this.inicializarCobrarListadosMovimientos();
			
			this.actualizarEstadoCeldasBotonesCobrarListadosMovimientos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCobrarListadosMovimientos() throws Exception {
		try {
			CobrarListadosMovimientosConstantesFunciones.inicializarCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
			
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
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCobrarListadosMovimientoss(String sAccionBusqueda,List<CobrarListadosMovimientos> cobrarlistadosmovimientossParaReportes) throws Exception {
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
					sPathReporteFinal="CobrarListadosMovimientos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CobrarListadosMovimientosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CobrarListadosMovimientosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CobrarListadosMovimientos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cobrar Listados Movimientoses");		
		parameters.put("busquedapor", CobrarListadosMovimientosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCobrarListadosMovimientos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CobrarListadosMovimientosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CobrarListadosMovimientosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCobrarListadosMovimientos=new JRBeanArrayDataSource(CobrarListadosMovimientosJInternalFrame.TraerCobrarListadosMovimientosBeans(cobrarlistadosmovimientossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCobrarListadosMovimientos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CobrarListadosMovimientosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CobrarListadosMovimientosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CobrarListadosMovimientosBean.TraerCobrarListadosMovimientosBeans(cobrarlistadosmovimientossParaReportes).toArray()));
							
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
				this.generarExcelReporteCobrarListadosMovimientoss(sAccionBusqueda,sTipoArchivoReporte,cobrarlistadosmovimientossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCobrarListadosMovimientoss(sAccionBusqueda,sTipoArchivoReporte,cobrarlistadosmovimientossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCobrarListadosMovimientosActionPerformed(null);
					//this.generarExcelReporteCobrarListadosMovimientoss(sAccionBusqueda,sTipoArchivoReporte,cobrarlistadosmovimientossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCobrarListadosMovimientoss(sAccionBusqueda,sTipoArchivoReporte,cobrarlistadosmovimientossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCobrarListadosMovimientoss(sAccionBusqueda,sTipoArchivoReporte,cobrarlistadosmovimientossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCobrarListadosMovimientoss(sAccionBusqueda,sTipoArchivoReporte,cobrarlistadosmovimientossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCobrarListadosMovimientoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarListadosMovimientos> cobrarlistadosmovimientossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarlistadosmovimientos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarListadosMovimientoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarListadosMovimientos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CobrarListadosMovimientos cobrarlistadosmovimientos : cobrarlistadosmovimientossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CobrarListadosMovimientosConstantesFunciones.generarExcelReporteDataCobrarListadosMovimientos("NORMAL",row,workbook,cobrarlistadosmovimientos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Listados Movimientos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCobrarListadosMovimientos(String sTipo,Row row,Workbook workbook) {
		
		CobrarListadosMovimientosConstantesFunciones.generarExcelReporteHeaderCobrarListadosMovimientos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCobrarListadosMovimientoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarListadosMovimientos> cobrarlistadosmovimientossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarlistadosmovimientos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarListadosMovimientoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CobrarListadosMovimientos cobrarlistadosmovimientos : cobrarlistadosmovimientossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.getCobrarListadosMovimientosDescripcion(cobrarlistadosmovimientos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadosMovimientosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadosmovimientos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadosmovimientos.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadosmovimientos.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadosMovimientosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadosmovimientos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadosmovimientos.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadosmovimientos.getnombre_transaccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAVENCE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAVENCE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadosmovimientos.getfecha_vence());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadosmovimientos.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadosmovimientos.getnumero_comprobante());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadosmovimientos.getnumero_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadosMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadosmovimientos.getdebito_mone_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadosMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadosmovimientos.getcredito_mone_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadosMovimientosConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadosmovimientos.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Listados Movimientos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCobrarListadosMovimientoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarListadosMovimientos> cobrarlistadosmovimientossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CobrarListadosMovimientos> cobrarlistadosmovimientossRespaldo=null;
		
		classes=CobrarListadosMovimientosConstantesFunciones.getClassesRelationshipsOfCobrarListadosMovimientos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cobrarlistadosmovimientosLogic.setDatosCliente(this.datosCliente);
		this.cobrarlistadosmovimientosLogic.setDatosDeep(this.datosDeep);
		this.cobrarlistadosmovimientosLogic.setIsConDeep(true);
		
		cobrarlistadosmovimientossRespaldo=this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss();
		
		this.cobrarlistadosmovimientosLogic.setCobrarListadosMovimientoss(cobrarlistadosmovimientossParaReportes);	
		this.cobrarlistadosmovimientosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cobrarlistadosmovimientossParaReportes=this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss();
		this.cobrarlistadosmovimientosLogic.setCobrarListadosMovimientoss(cobrarlistadosmovimientossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarlistadosmovimientos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarListadosMovimientoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarListadosMovimientos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CobrarListadosMovimientos cobrarlistadosmovimientos : cobrarlistadosmovimientossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCobrarListadosMovimientos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CobrarListadosMovimientosConstantesFunciones.generarExcelReporteDataCobrarListadosMovimientos("NORMAL",row,workbook,cobrarlistadosmovimientos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.getCobrarListadosMovimientosDescripcion(cobrarlistadosmovimientos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Listados Movimientos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCobrarListadosMovimientos() throws Exception {		
		this.startProcessCobrarListadosMovimientos(true);
	}
	
	public void startProcessCobrarListadosMovimientos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCobrarListadosMovimientos ,this.jPanelParametrosReportesCobrarListadosMovimientos, this.jScrollPanelDatosCobrarListadosMovimientos,this.jPanelPaginacionCobrarListadosMovimientos, this.jScrollPanelDatosEdicionCobrarListadosMovimientos, this.jPanelAccionesCobrarListadosMovimientos,this.jPanelAccionesFormularioCobrarListadosMovimientos,this.jmenuBarCobrarListadosMovimientos,this.jmenuBarDetalleCobrarListadosMovimientos,this.jTtoolBarCobrarListadosMovimientos,this.jTtoolBarDetalleCobrarListadosMovimientos);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarListadosMovimientos=this.jTabbedPaneBusquedasCobrarListadosMovimientos; 
		
		final JPanel jPanelParametrosReportesCobrarListadosMovimientos=this.jPanelParametrosReportesCobrarListadosMovimientos;
		//final JScrollPane jScrollPanelDatosCobrarListadosMovimientos=this.jScrollPanelDatosCobrarListadosMovimientos;
		final JTable jTableDatosCobrarListadosMovimientos=this.jTableDatosCobrarListadosMovimientos;		
		final JPanel jPanelPaginacionCobrarListadosMovimientos=this.jPanelPaginacionCobrarListadosMovimientos;
		//final JScrollPane jScrollPanelDatosEdicionCobrarListadosMovimientos=this.jScrollPanelDatosEdicionCobrarListadosMovimientos;
		final JPanel jPanelAccionesCobrarListadosMovimientos=this.jPanelAccionesCobrarListadosMovimientos;
		
		JPanel jPanelCamposAuxiliarCobrarListadosMovimientos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCobrarListadosMovimientos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
			jPanelCamposAuxiliarCobrarListadosMovimientos=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jPanelCamposCobrarListadosMovimientos;
			jPanelAccionesFormularioAuxiliarCobrarListadosMovimientos=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jPanelAccionesFormularioCobrarListadosMovimientos;
		}
		
		final JPanel jPanelCamposCobrarListadosMovimientos=jPanelCamposAuxiliarCobrarListadosMovimientos;
		final JPanel jPanelAccionesFormularioCobrarListadosMovimientos=jPanelAccionesFormularioAuxiliarCobrarListadosMovimientos;
		
		
		final JMenuBar jmenuBarCobrarListadosMovimientos=this.jmenuBarCobrarListadosMovimientos;
		final JToolBar jTtoolBarCobrarListadosMovimientos=this.jTtoolBarCobrarListadosMovimientos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCobrarListadosMovimientos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarListadosMovimientos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
			jmenuBarDetalleAuxiliarCobrarListadosMovimientos=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jmenuBarDetalleCobrarListadosMovimientos;
			jTtoolBarDetalleAuxiliarCobrarListadosMovimientos=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTtoolBarDetalleCobrarListadosMovimientos;
		}
		
		final JMenuBar jmenuBarDetalleCobrarListadosMovimientos=jmenuBarDetalleAuxiliarCobrarListadosMovimientos;
		final JToolBar jTtoolBarDetalleCobrarListadosMovimientos=jTtoolBarDetalleAuxiliarCobrarListadosMovimientos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarListadosMovimientos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarListadosMovimientos;
			processRunnable.jTableDatos=jTableDatosCobrarListadosMovimientos;
			processRunnable.jPanelCampos=jPanelCamposCobrarListadosMovimientos;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarListadosMovimientos;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarListadosMovimientos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarListadosMovimientos;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarListadosMovimientos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarListadosMovimientos;
			processRunnable.jTtoolBar=jTtoolBarCobrarListadosMovimientos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarListadosMovimientos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarListadosMovimientos ,jPanelParametrosReportesCobrarListadosMovimientos,jTableDatosCobrarListadosMovimientos, /*jScrollPanelDatosCobrarListadosMovimientos,*/jPanelCamposCobrarListadosMovimientos,jPanelPaginacionCobrarListadosMovimientos, /*jScrollPanelDatosEdicionCobrarListadosMovimientos,*/ jPanelAccionesCobrarListadosMovimientos,jPanelAccionesFormularioCobrarListadosMovimientos,jmenuBarCobrarListadosMovimientos,jmenuBarDetalleCobrarListadosMovimientos,jTtoolBarCobrarListadosMovimientos,jTtoolBarDetalleCobrarListadosMovimientos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarListadosMovimientos ,jPanelParametrosReportesCobrarListadosMovimientos, jScrollPanelDatosCobrarListadosMovimientos,jPanelPaginacionCobrarListadosMovimientos, jScrollPanelDatosEdicionCobrarListadosMovimientos, jPanelAccionesCobrarListadosMovimientos,jPanelAccionesFormularioCobrarListadosMovimientos,jmenuBarCobrarListadosMovimientos,jmenuBarDetalleCobrarListadosMovimientos,jTtoolBarCobrarListadosMovimientos,jTtoolBarDetalleCobrarListadosMovimientos);
						
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
	
	public void finishProcessCobrarListadosMovimientos() {// throws Exception 
		this.finishProcessCobrarListadosMovimientos(true);
	}
	
	public void finishProcessCobrarListadosMovimientos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCobrarListadosMovimientos ,this.jPanelParametrosReportesCobrarListadosMovimientos, this.jScrollPanelDatosCobrarListadosMovimientos,this.jPanelPaginacionCobrarListadosMovimientos, this.jScrollPanelDatosEdicionCobrarListadosMovimientos, this.jPanelAccionesCobrarListadosMovimientos,this.jPanelAccionesFormularioCobrarListadosMovimientos,this.jmenuBarCobrarListadosMovimientos,this.jmenuBarDetalleCobrarListadosMovimientos,this.jTtoolBarCobrarListadosMovimientos,this.jTtoolBarDetalleCobrarListadosMovimientos);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarListadosMovimientos=this.jTabbedPaneBusquedasCobrarListadosMovimientos; 
		
		final JPanel jPanelParametrosReportesCobrarListadosMovimientos=this.jPanelParametrosReportesCobrarListadosMovimientos;
		//final JScrollPane jScrollPanelDatosCobrarListadosMovimientos=this.jScrollPanelDatosCobrarListadosMovimientos;
		final JTable jTableDatosCobrarListadosMovimientos=this.jTableDatosCobrarListadosMovimientos;		
		final JPanel jPanelPaginacionCobrarListadosMovimientos=this.jPanelPaginacionCobrarListadosMovimientos;
		//final JScrollPane jScrollPanelDatosEdicionCobrarListadosMovimientos=this.jScrollPanelDatosEdicionCobrarListadosMovimientos;
		final JPanel jPanelAccionesCobrarListadosMovimientos=this.jPanelAccionesCobrarListadosMovimientos;
		
		JPanel jPanelCamposAuxiliarCobrarListadosMovimientos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCobrarListadosMovimientos=new JPanel();
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
			jPanelCamposAuxiliarCobrarListadosMovimientos=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jPanelCamposCobrarListadosMovimientos;
			jPanelAccionesFormularioAuxiliarCobrarListadosMovimientos=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jPanelAccionesFormularioCobrarListadosMovimientos;
		}
		
		final JPanel jPanelCamposCobrarListadosMovimientos=jPanelCamposAuxiliarCobrarListadosMovimientos;
		final JPanel jPanelAccionesFormularioCobrarListadosMovimientos=jPanelAccionesFormularioAuxiliarCobrarListadosMovimientos;
		
		
		final JMenuBar jmenuBarCobrarListadosMovimientos=this.jmenuBarCobrarListadosMovimientos;		
		final JToolBar jTtoolBarCobrarListadosMovimientos=this.jTtoolBarCobrarListadosMovimientos;
				
		JMenuBar jmenuBarDetalleAuxiliarCobrarListadosMovimientos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarListadosMovimientos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
			jmenuBarDetalleAuxiliarCobrarListadosMovimientos=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jmenuBarDetalleCobrarListadosMovimientos;
			jTtoolBarDetalleAuxiliarCobrarListadosMovimientos=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTtoolBarDetalleCobrarListadosMovimientos;		
		}
		
		final JMenuBar jmenuBarDetalleCobrarListadosMovimientos=jmenuBarDetalleAuxiliarCobrarListadosMovimientos;
		final JToolBar jTtoolBarDetalleCobrarListadosMovimientos=jTtoolBarDetalleAuxiliarCobrarListadosMovimientos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarListadosMovimientos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarListadosMovimientos;
			processRunnable.jTableDatos=jTableDatosCobrarListadosMovimientos;
			processRunnable.jPanelCampos=jPanelCamposCobrarListadosMovimientos;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarListadosMovimientos;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarListadosMovimientos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarListadosMovimientos;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarListadosMovimientos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarListadosMovimientos;
			processRunnable.jTtoolBar=jTtoolBarCobrarListadosMovimientos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarListadosMovimientos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCobrarListadosMovimientos ,jPanelParametrosReportesCobrarListadosMovimientos, jTableDatosCobrarListadosMovimientos,/*jScrollPanelDatosCobrarListadosMovimientos,*/jPanelCamposCobrarListadosMovimientos,jPanelPaginacionCobrarListadosMovimientos, /*jScrollPanelDatosEdicionCobrarListadosMovimientos,*/ jPanelAccionesCobrarListadosMovimientos,jPanelAccionesFormularioCobrarListadosMovimientos,jmenuBarCobrarListadosMovimientos,jmenuBarDetalleCobrarListadosMovimientos,jTtoolBarCobrarListadosMovimientos,jTtoolBarDetalleCobrarListadosMovimientos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCobrarListadosMovimientos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCobrarListadosMovimientos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCobrarListadosMovimientos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCobrarListadosMovimientos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCobrarListadosMovimientos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCobrarListadosMovimientos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCobrarListadosMovimientos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCobrarListadosMovimientos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCobrarListadosMovimientos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cobrarlistadosmovimientosConstantesFunciones.getsFinalQueryCobrarListadosMovimientos();
		String  finalQueryPaginacionTodos=this.cobrarlistadosmovimientosConstantesFunciones.getsFinalQueryCobrarListadosMovimientos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CobrarListadosMovimientosConstantesFunciones.getArrayColumnasGlobalesNoCobrarListadosMovimientos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CobrarListadosMovimientosConstantesFunciones.getArrayColumnasGlobalesCobrarListadosMovimientos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CobrarListadosMovimientosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cobrarlistadosmovimientossEliminados= new ArrayList<CobrarListadosMovimientos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCobrarListadosMovimientos();
		
				///*CobrarListadosMovimientosSessionBean*/this.cobrarlistadosmovimientosSessionBean=new CobrarListadosMovimientosSessionBean();
			
			if(this.cobrarlistadosmovimientosSessionBean==null) {
				this.cobrarlistadosmovimientosSessionBean=new CobrarListadosMovimientosSessionBean();
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
					this.iNumeroPaginacion=CobrarListadosMovimientosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CobrarListadosMovimientosConstantesFunciones.getClassesForeignKeysOfCobrarListadosMovimientos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cobrarlistadosmovimientos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cobrarlistadosmovimientossAux= new ArrayList<CobrarListadosMovimientos>();
			
				
			cobrarlistadosmovimientosLogic.setDatosCliente(this.datosCliente);
			cobrarlistadosmovimientosLogic.setDatosDeep(this.datosDeep);
			cobrarlistadosmovimientosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaCobrarListadosMovimientos")) {
				this.sDetalleReporte=CobrarListadosMovimientosConstantesFunciones.getDetalleIndiceBusquedaCobrarListadosMovimientos(fecha_emision_desdeBusquedaCobrarListadosMovimientos,fecha_emision_hastaBusquedaCobrarListadosMovimientos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cobrarlistadosmovimientosLogic.getCobrarListadosMovimientossBusquedaCobrarListadosMovimientos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaCobrarListadosMovimientos,fecha_emision_hastaBusquedaCobrarListadosMovimientos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarListadosMovimientosConstantesFunciones.getDetalleIndiceBusquedaCobrarListadosMovimientos(fecha_emision_desdeBusquedaCobrarListadosMovimientos,fecha_emision_hastaBusquedaCobrarListadosMovimientos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarListadosMovimientosConstantesFunciones.getDetalleIndiceBusquedaCobrarListadosMovimientos(fecha_emision_desdeBusquedaCobrarListadosMovimientos,fecha_emision_hastaBusquedaCobrarListadosMovimientos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss()==null||cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cobrarlistadosmovimientoss==null|| cobrarlistadosmovimientoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarlistadosmovimientossAux=new ArrayList<CobrarListadosMovimientos>();
						cobrarlistadosmovimientossAux.addAll(cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarlistadosmovimientossAux=new ArrayList<CobrarListadosMovimientos>();
							cobrarlistadosmovimientossAux.addAll(cobrarlistadosmovimientoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cobrarlistadosmovimientosLogic.getCobrarListadosMovimientossBusquedaCobrarListadosMovimientos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaCobrarListadosMovimientos,fecha_emision_hastaBusquedaCobrarListadosMovimientos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarListadosMovimientosConstantesFunciones.getDetalleIndiceBusquedaCobrarListadosMovimientos(fecha_emision_desdeBusquedaCobrarListadosMovimientos,fecha_emision_hastaBusquedaCobrarListadosMovimientos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarListadosMovimientosConstantesFunciones.getDetalleIndiceBusquedaCobrarListadosMovimientos(fecha_emision_desdeBusquedaCobrarListadosMovimientos,fecha_emision_hastaBusquedaCobrarListadosMovimientos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCobrarListadosMovimientoss("BusquedaCobrarListadosMovimientos",cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCobrarListadosMovimientoss("BusquedaCobrarListadosMovimientos",cobrarlistadosmovimientoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarlistadosmovimientosLogic.setCobrarListadosMovimientoss(new ArrayList<CobrarListadosMovimientos>());
						cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().addAll(cobrarlistadosmovimientossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarlistadosmovimientoss=new ArrayList<CobrarListadosMovimientos>();
							cobrarlistadosmovimientoss.addAll(cobrarlistadosmovimientossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCobrarListadosMovimientos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCobrarListadosMovimientos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarlistadosmovimientoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarlistadosmovimientoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CobrarListadosMovimientos cobrarlistadosmovimientos) {
		Boolean permite=true;
		
		if(this.cobrarlistadosmovimientos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CobrarListadosMovimientosConstantesFunciones.getOrderByListaCobrarListadosMovimientos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CobrarListadosMovimientosConstantesFunciones.getOrderByListaCobrarListadosMovimientos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarListadosMovimientos cobrarlistadosmovimientos:cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss()) {
				if(cobrarlistadosmovimientos.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarlistadosmovimientosTotales=cobrarlistadosmovimientos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarListadosMovimientos cobrarlistadosmovimientos:this.cobrarlistadosmovimientoss) {
				if(cobrarlistadosmovimientos.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarlistadosmovimientosTotales=cobrarlistadosmovimientos;
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
			this.cobrarlistadosmovimientosAux=new CobrarListadosMovimientos();
			this.cobrarlistadosmovimientosAux.setsType(Constantes2.S_TOTALES);
			this.cobrarlistadosmovimientosAux.setIsNew(false);
			this.cobrarlistadosmovimientosAux.setIsChanged(false);
			this.cobrarlistadosmovimientosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//CobrarListadosMovimientosConstantesFunciones.TotalizarValoresFilaCobrarListadosMovimientos(this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss(),this.cobrarlistadosmovimientosAux);
				
				//this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().add(this.cobrarlistadosmovimientosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CobrarListadosMovimientosConstantesFunciones.TotalizarValoresFilaCobrarListadosMovimientos(this.cobrarlistadosmovimientoss,this.cobrarlistadosmovimientosAux);
				
				this.cobrarlistadosmovimientoss.add(this.cobrarlistadosmovimientosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cobrarlistadosmovimientosTotales=new CobrarListadosMovimientos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().remove(cobrarlistadosmovimientosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarlistadosmovimientoss.remove(cobrarlistadosmovimientosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cobrarlistadosmovimientosTotales=new CobrarListadosMovimientos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarListadosMovimientos cobrarlistadosmovimientos:cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss()) {
				if(cobrarlistadosmovimientos.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarlistadosmovimientosTotales=cobrarlistadosmovimientos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarListadosMovimientosConstantesFunciones.TotalizarValoresFilaCobrarListadosMovimientos(this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss(),cobrarlistadosmovimientosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarListadosMovimientos cobrarlistadosmovimientos:this.cobrarlistadosmovimientoss) {
				if(cobrarlistadosmovimientos.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarlistadosmovimientosTotales=cobrarlistadosmovimientos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarListadosMovimientosConstantesFunciones.TotalizarValoresFilaCobrarListadosMovimientos(this.cobrarlistadosmovimientoss,cobrarlistadosmovimientosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCobrarListadosMovimientossBusquedaCobrarListadosMovimientos()throws Exception {
		try {
			sAccionBusqueda="BusquedaCobrarListadosMovimientos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarListadosMovimientossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCobrarListadosMovimientossBusquedaCobrarListadosMovimientos(String sFinalQuery,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarlistadosmovimientosLogic.getCobrarListadosMovimientossBusquedaCobrarListadosMovimientos(sFinalQuery,this.pagination,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarListadosMovimientossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarlistadosmovimientosLogic.getCobrarListadosMovimientossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosCobrarListadosMovimientos() {
		this.isPermisoTodoCobrarListadosMovimientos=false;
		this.isPermisoNuevoCobrarListadosMovimientos=false;
		this.isPermisoActualizarCobrarListadosMovimientos=false;
		this.isPermisoActualizarOriginalCobrarListadosMovimientos=false;
		this.isPermisoEliminarCobrarListadosMovimientos=false;
		this.isPermisoGuardarCambiosCobrarListadosMovimientos=false;
		this.isPermisoConsultaCobrarListadosMovimientos=true;
		this.isPermisoBusquedaCobrarListadosMovimientos=true;
		this.isPermisoReporteCobrarListadosMovimientos=true;
		this.isPermisoOrdenCobrarListadosMovimientos=false;		
		this.isPermisoPaginacionMedioCobrarListadosMovimientos=false;		
		this.isPermisoPaginacionAltoCobrarListadosMovimientos=false;		
		this.isPermisoPaginacionTodoCobrarListadosMovimientos=false;		
		this.isPermisoCopiarCobrarListadosMovimientos=false;		
		this.isPermisoVerFormCobrarListadosMovimientos=false;		
		this.isPermisoDuplicarCobrarListadosMovimientos=false;
		this.isPermisoOrdenCobrarListadosMovimientos=false;
	}
	
	public void setPermisosUsuarioCobrarListadosMovimientos(Boolean isPermiso) {
		this.isPermisoTodoCobrarListadosMovimientos=isPermiso;
		this.isPermisoNuevoCobrarListadosMovimientos=isPermiso;
		this.isPermisoActualizarCobrarListadosMovimientos=isPermiso;
		this.isPermisoActualizarOriginalCobrarListadosMovimientos=isPermiso;
		this.isPermisoEliminarCobrarListadosMovimientos=isPermiso;
		this.isPermisoGuardarCambiosCobrarListadosMovimientos=isPermiso;
		this.isPermisoConsultaCobrarListadosMovimientos=isPermiso;
		this.isPermisoBusquedaCobrarListadosMovimientos=isPermiso;
		this.isPermisoReporteCobrarListadosMovimientos=isPermiso;
		this.isPermisoOrdenCobrarListadosMovimientos=isPermiso;		
		this.isPermisoPaginacionMedioCobrarListadosMovimientos=isPermiso;		
		this.isPermisoPaginacionAltoCobrarListadosMovimientos=isPermiso;		
		this.isPermisoPaginacionTodoCobrarListadosMovimientos=isPermiso;		
		this.isPermisoCopiarCobrarListadosMovimientos=isPermiso;		
		this.isPermisoVerFormCobrarListadosMovimientos=isPermiso;		
		this.isPermisoDuplicarCobrarListadosMovimientos=isPermiso;
		this.isPermisoOrdenCobrarListadosMovimientos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCobrarListadosMovimientos(Boolean isPermiso) {
		//this.isPermisoTodoCobrarListadosMovimientos=isPermiso;
		this.isPermisoNuevoCobrarListadosMovimientos=isPermiso;
		this.isPermisoActualizarCobrarListadosMovimientos=isPermiso;
		this.isPermisoActualizarOriginalCobrarListadosMovimientos=isPermiso;
		this.isPermisoEliminarCobrarListadosMovimientos=isPermiso;
		this.isPermisoGuardarCambiosCobrarListadosMovimientos=isPermiso;
		//this.isPermisoConsultaCobrarListadosMovimientos=isPermiso;
		//this.isPermisoBusquedaCobrarListadosMovimientos=isPermiso;
		//this.isPermisoReporteCobrarListadosMovimientos=isPermiso;
		//this.isPermisoOrdenCobrarListadosMovimientos=isPermiso;		
		//this.isPermisoPaginacionMedioCobrarListadosMovimientos=isPermiso;		
		//this.isPermisoPaginacionAltoCobrarListadosMovimientos=isPermiso;		
		//this.isPermisoPaginacionTodoCobrarListadosMovimientos=isPermiso;		
		//this.isPermisoCopiarCobrarListadosMovimientos=isPermiso;		
		//this.isPermisoDuplicarCobrarListadosMovimientos=isPermiso;
		//this.isPermisoOrdenCobrarListadosMovimientos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCobrarListadosMovimientosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CobrarListadosMovimientosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCobrarListadosMovimientos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCobrarListadosMovimientosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCobrarListadosMovimientosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCobrarListadosMovimientosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCobrarListadosMovimientosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCobrarListadosMovimientos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CobrarListadosMovimientosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CobrarListadosMovimientosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCobrarListadosMovimientos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCobrarListadosMovimientos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCobrarListadosMovimientos=this.isPermisoActualizarCobrarListadosMovimientos;
			this.isPermisoEliminarCobrarListadosMovimientos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCobrarListadosMovimientos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCobrarListadosMovimientos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCobrarListadosMovimientos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCobrarListadosMovimientos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCobrarListadosMovimientos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarListadosMovimientos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCobrarListadosMovimientos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCobrarListadosMovimientos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCobrarListadosMovimientos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCobrarListadosMovimientos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCobrarListadosMovimientos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCobrarListadosMovimientos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarListadosMovimientos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCobrarListadosMovimientos.setToolTipText(this.jTableDatosCobrarListadosMovimientos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCobrarListadosMovimientos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCobrarListadosMovimientos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CobrarListadosMovimientosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CobrarListadosMovimientosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCobrarListadosMovimientos() throws Exception {
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
	public void inicializarCombosForeignKeyCobrarListadosMovimientosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCobrarListadosMovimientosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CobrarListadosMovimientosJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyCobrarListadosMovimientos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cobrarlistadosmovimientosSessionBean==null) {
				this.cobrarlistadosmovimientosSessionBean=new CobrarListadosMovimientosSessionBean();
			}

			if(!this.cobrarlistadosmovimientosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyCobrarListadosMovimientos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCobrarListadosMovimientos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCobrarListadosMovimientos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarListadosMovimientos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCobrarListadosMovimientos(CobrarListadosMovimientos cobrarlistadosmovimientos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCobrarListadosMovimientos(CobrarListadosMovimientos cobrarlistadosmovimientos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCobrarListadosMovimientos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarListadosMovimientos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCobrarListadosMovimientos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCobrarListadosMovimientos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCobrarListadosMovimientos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCobrarListadosMovimientos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCobrarListadosMovimientos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCobrarListadosMovimientos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxid_empresaCobrarListadosMovimientos!=null && this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxid_empresaCobrarListadosMovimientos.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxid_empresaCobrarListadosMovimientos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public CobrarListadosMovimientosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CobrarListadosMovimientosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CobrarListadosMovimientosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cobrarlistadosmovimientosSessionBean=new CobrarListadosMovimientosSessionBean(); 
		this.cobrarlistadosmovimientosConstantesFunciones=new CobrarListadosMovimientosConstantesFunciones(); 
		this.cobrarlistadosmovimientosBean=new CobrarListadosMovimientos();//(this.cobrarlistadosmovimientosConstantesFunciones); 		
		this.cobrarlistadosmovimientosReturnGeneral=new CobrarListadosMovimientosParameterReturnGeneral(); 
		
		this.cobrarlistadosmovimientosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarlistadosmovimientosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CobrarListadosMovimientosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CobrarListadosMovimientosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CobrarListadosMovimientosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCobrarListadosMovimientos(true);
			
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
			
			this.cobrarlistadosmovimientosConstantesFunciones=new CobrarListadosMovimientosConstantesFunciones(); 
			this.cobrarlistadosmovimientosBean=new CobrarListadosMovimientos();//this.cobrarlistadosmovimientosConstantesFunciones); 			
			this.cobrarlistadosmovimientosReturnGeneral=new CobrarListadosMovimientosParameterReturnGeneral(); 
		
			CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Listados Movimientos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cobrarlistadosmovimientos=new CobrarListadosMovimientos();
			this.cobrarlistadosmovimientoss = new ArrayList<CobrarListadosMovimientos>();
			this.cobrarlistadosmovimientossAux = new ArrayList<CobrarListadosMovimientos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic=new CobrarListadosMovimientosLogic();
				this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
			}
			
			//this.cobrarlistadosmovimientosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cobrarlistadosmovimientosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCobrarListadosMovimientos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCobrarListadosMovimientos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarListadosMovimientos);	
					}
					
					if(this.jInternalFrameImportacionCobrarListadosMovimientos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarListadosMovimientos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCobrarListadosMovimientos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCobrarListadosMovimientos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarListadosMovimientos);
				this.jInternalFrameDetalleFormCobrarListadosMovimientos.setVisible(false);
				this.jInternalFrameDetalleFormCobrarListadosMovimientos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarListadosMovimientos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarListadosMovimientos);
					this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.setVisible(false);
					this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCobrarListadosMovimientos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCobrarListadosMovimientos);
					this.jInternalFrameImportacionCobrarListadosMovimientos.setVisible(false);
					this.jInternalFrameImportacionCobrarListadosMovimientos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCobrarListadosMovimientos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCobrarListadosMovimientos);
					this.jInternalFrameOrderByCobrarListadosMovimientos.setVisible(false);
					this.jInternalFrameOrderByCobrarListadosMovimientos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCobrarListadosMovimientosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CobrarListadosMovimientosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cobrarlistadosmovimientosReturnGeneral=new CobrarListadosMovimientosParameterReturnGeneral();
			
			this.cobrarlistadosmovimientosParameterGeneral=new CobrarListadosMovimientosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cobrarlistadosmovimientosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CobrarListadosMovimientosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarListadosMovimientosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado(),this.cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarListadosMovimientosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado(),this.cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaDuplicarCobrarListadosMovimientos=true;
			this.isVisibilidadCeldaCopiarCobrarListadosMovimientos=true;
			this.isVisibilidadCeldaVerFormCobrarListadosMovimientos=true;
			this.isVisibilidadCeldaOrdenCobrarListadosMovimientos=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaModificarCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaActualizarCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaEliminarCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaCancelarCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaGuardarCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos=false;
			
			
			this.isVisibilidadBusquedaCobrarListadosMovimientos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCobrarListadosMovimientos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCobrarListadosMovimientos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCobrarListadosMovimientos(false);
			
			this.setPermisosUsuarioCobrarListadosMovimientos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado() 
				|| (this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado() && this.cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCobrarListadosMovimientosClasesRelacionadas();
			}
			
			if(this.cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCobrarListadosMovimientosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCobrarListadosMovimientos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCobrarListadosMovimientos();
			}
			
			if(!this.isPermisoBusquedaCobrarListadosMovimientos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCobrarListadosMovimientos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				this.tiposReportes.add(new Reporte("LISTA_COLUMNAS","LISTA COLUMNAS"));
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CobrarListadosMovimientosConstantesFunciones.getTiposSeleccionarCobrarListadosMovimientos());
				
				this.tiposColumnasSelect=CobrarListadosMovimientosConstantesFunciones.getTiposSeleccionarCobrarListadosMovimientos(true);
				
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
			//if(!this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCobrarListadosMovimientos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioCobrarListadosMovimientos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioCobrarListadosMovimientos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarListadosMovimientos() ;
			
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
				cobrarlistadosmovimientosImplementable= (CobrarListadosMovimientosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarListadosMovimientosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cobrarlistadosmovimientosImplementableHome= (CobrarListadosMovimientosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarListadosMovimientosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cobrarlistadosmovimientoss= new ArrayList<CobrarListadosMovimientos>();
			this.cobrarlistadosmovimientossEliminados= new ArrayList<CobrarListadosMovimientos>();
						
			this.isEsNuevoCobrarListadosMovimientos=false;
			this.esParaAccionDesdeFormularioCobrarListadosMovimientos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCobrarListadosMovimientos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCobrarListadosMovimientos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CobrarListadosMovimientosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCobrarListadosMovimientos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCobrarListadosMovimientos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCobrarListadosMovimientos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCobrarListadosMovimientos();
			}
			
			CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCobrarListadosMovimientos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCobrarListadosMovimientos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCobrarListadosMovimientos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCobrarListadosMovimientos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CobrarListadosMovimientos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCobrarListadosMovimientos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCobrarListadosMovimientos")) {
				iIndex=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTabbedPaneRelacionesCobrarListadosMovimientos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTabbedPaneRelacionesCobrarListadosMovimientos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCobrarListadosMovimientos();	
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
	
	public void cargarCombosForeignKeyCobrarListadosMovimientos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCobrarListadosMovimientos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCobrarListadosMovimientos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCobrarListadosMovimientosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCobrarListadosMovimientos();
		
		this.cargarCombosFrameForeignKeyCobrarListadosMovimientos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCobrarListadosMovimientos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCobrarListadosMovimientos();
		}
	}
	
	
	
	public void jButtonNuevoCobrarListadosMovimientosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCobrarListadosMovimientos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
			
			
			if(jTableDatosCobrarListadosMovimientos.getRowCount()>=1) {
				jTableDatosCobrarListadosMovimientos.removeRowSelectionInterval(0, jTableDatosCobrarListadosMovimientos.getRowCount()-1);						
			}
			
			this.isEsNuevoCobrarListadosMovimientos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCobrarListadosMovimientos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCobrarListadosMovimientos(true);			
			//this.cobrarlistadosmovimientos=new CobrarListadosMovimientos();
			//this.cobrarlistadosmovimientos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarListadosMovimientos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarListadosMovimientos() ;
			
			if(CobrarListadosMovimientosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarListadosMovimientos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cobrarlistadosmovimientos);	
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadosmovimientos);				
			
			CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
			
			if(this.cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CobrarListadosMovimientos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCobrarListadosMovimientosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CobrarListadosMovimientos> cobrarlistadosmovimientossSeleccionados=new ArrayList<CobrarListadosMovimientos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCobrarListadosMovimientos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCobrarListadosMovimientos.getSelectedRows().length;			
			}
			
			cobrarlistadosmovimientossSeleccionados=this.getCobrarListadosMovimientossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCobrarListadosMovimientos--;			
				//CobrarListadosMovimientos cobrarlistadosmovimientosAux= new CobrarListadosMovimientos();			
				//cobrarlistadosmovimientosAux.setId(this.iIdNuevoCobrarListadosMovimientos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CobrarListadosMovimientos cobrarlistadosmovimientosOrigen=new CobrarListadosMovimientos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CobrarListadosMovimientos cobrarlistadosmovimientosOrigen : cobrarlistadosmovimientossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cobrarlistadosmovimientosOrigen =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarlistadosmovimientosOrigen =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCobrarListadosMovimientos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cobrarlistadosmovimientos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCobrarListadosMovimientos(cobrarlistadosmovimientosOrigen,this.cobrarlistadosmovimientos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().add(this.cobrarlistadosmovimientosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarlistadosmovimientoss.add(this.cobrarlistadosmovimientosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCobrarListadosMovimientos(false);
				
				this.jTableDatosCobrarListadosMovimientos.setRowSelectionInterval(this.getIndiceNuevoCobrarListadosMovimientos(), this.getIndiceNuevoCobrarListadosMovimientos());
				
				int iLastRow =  this.jTableDatosCobrarListadosMovimientos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarListadosMovimientos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarListadosMovimientos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarListadosMovimientos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CobrarListadosMovimientos> cobrarlistadosmovimientossSeleccionados=new ArrayList<CobrarListadosMovimientos>();									
		
			CobrarListadosMovimientos cobrarlistadosmovimientosOrigen=new CobrarListadosMovimientos();
			CobrarListadosMovimientos cobrarlistadosmovimientosDestino=new CobrarListadosMovimientos();
				
			cobrarlistadosmovimientossSeleccionados=this.getCobrarListadosMovimientossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCobrarListadosMovimientos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cobrarlistadosmovimientossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCobrarListadosMovimientos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarlistadosmovimientosOrigen =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarlistadosmovimientosOrigen =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarlistadosmovimientosDestino =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarlistadosmovimientosDestino =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cobrarlistadosmovimientosOrigen =cobrarlistadosmovimientossSeleccionados.get(0);
				cobrarlistadosmovimientosDestino =cobrarlistadosmovimientossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCobrarListadosMovimientos(cobrarlistadosmovimientosOrigen,cobrarlistadosmovimientosDestino,true,false);
				
				cobrarlistadosmovimientosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cobrarlistadosmovimientosDestino,cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cobrarlistadosmovimientosDestino,cobrarlistadosmovimientoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCobrarListadosMovimientos(false);
				
				//this.jTableDatosCobrarListadosMovimientos.setRowSelectionInterval(this.getIndiceNuevoCobrarListadosMovimientos(), this.getIndiceNuevoCobrarListadosMovimientos());
				
				int iLastRow =  this.jTableDatosCobrarListadosMovimientos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarListadosMovimientos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarListadosMovimientos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarListadosMovimientos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarListadosMovimientos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCobrarListadosMovimientos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCobrarListadosMovimientos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCobrarListadosMovimientos.setVisible(!isVisible);
			this.jPanelPaginacionCobrarListadosMovimientos.setVisible(!isVisible);
			this.jPanelAccionesCobrarListadosMovimientos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCobrarListadosMovimientos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCobrarListadosMovimientos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCobrarListadosMovimientos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCobrarListadosMovimientos();
			
			this.abrirFrameOrderByCobrarListadosMovimientos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCobrarListadosMovimientos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCobrarListadosMovimientos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarListadosMovimientos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCobrarListadosMovimientos.isMaximum()) {
					this.jInternalFrameDetalleFormCobrarListadosMovimientos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCobrarListadosMovimientos.setSize(this.jInternalFrameDetalleFormCobrarListadosMovimientos.iWidthFormulario,this.jInternalFrameDetalleFormCobrarListadosMovimientos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCobrarListadosMovimientos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCobrarListadosMovimientos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCobrarListadosMovimientos.isMaximum()) {
						this.jInternalFrameDetalleFormCobrarListadosMovimientos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCobrarListadosMovimientos.jContentPaneDetalleCobrarListadosMovimientos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTabbedPaneRelacionesCobrarListadosMovimientos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCobrarListadosMovimientos.jContentPaneDetalleCobrarListadosMovimientos.getWidth(),CobrarListadosMovimientosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTabbedPaneRelacionesCobrarListadosMovimientos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCobrarListadosMovimientos.jContentPaneDetalleCobrarListadosMovimientos.getWidth(),CobrarListadosMovimientosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTabbedPaneRelacionesCobrarListadosMovimientos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCobrarListadosMovimientos.jContentPaneDetalleCobrarListadosMovimientos.getWidth(),CobrarListadosMovimientosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCobrarListadosMovimientos.setVisible(true);
	        this.jInternalFrameDetalleFormCobrarListadosMovimientos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCobrarListadosMovimientos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCobrarListadosMovimientos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCobrarListadosMovimientos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarListadosMovimientos,false,this);
				} else {
					this.jInternalFrameOrderByCobrarListadosMovimientos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarListadosMovimientos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCobrarListadosMovimientos);
				this.jInternalFrameOrderByCobrarListadosMovimientos.setVisible(false);
				this.jInternalFrameOrderByCobrarListadosMovimientos.setSelected(false);
				
				this.jInternalFrameOrderByCobrarListadosMovimientos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarListadosMovimientos"));
				
				this.inicializarActualizarBindingTablaOrderByCobrarListadosMovimientos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCobrarListadosMovimientos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCobrarListadosMovimientos==null) {
				
				this.jInternalFrameImportacionCobrarListadosMovimientos=new ImportacionJInternalFrame(CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarListadosMovimientos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCobrarListadosMovimientos);
				this.jInternalFrameImportacionCobrarListadosMovimientos.setVisible(false);
				this.jInternalFrameImportacionCobrarListadosMovimientos.setSelected(false);


				this.jInternalFrameImportacionCobrarListadosMovimientos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarListadosMovimientos"));
				this.jInternalFrameImportacionCobrarListadosMovimientos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarListadosMovimientos"));
				this.jInternalFrameImportacionCobrarListadosMovimientos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarListadosMovimientos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCobrarListadosMovimientos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCobrarListadosMovimientos==null) {
				this.jInternalFrameReporteDinamicoCobrarListadosMovimientos=new ReporteDinamicoJInternalFrame(CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarListadosMovimientos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarListadosMovimientos);
				this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.setVisible(false);
				this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarListadosMovimientos"));
				this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarListadosMovimientos"));
				this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarListadosMovimientos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarListadosMovimientos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCobrarListadosMovimientos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarListadosMovimientos);
			
	       	this.jInternalFrameDetalleFormCobrarListadosMovimientos.setVisible(false);
	        this.jInternalFrameDetalleFormCobrarListadosMovimientos.setSelected(false);
			
			//this.jInternalFrameDetalleFormCobrarListadosMovimientos.dispose();
			//this.jInternalFrameDetalleFormCobrarListadosMovimientos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCobrarListadosMovimientos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.setVisible(true);
	        this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCobrarListadosMovimientos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCobrarListadosMovimientos.setVisible(true);
	        this.jInternalFrameImportacionCobrarListadosMovimientos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCobrarListadosMovimientos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCobrarListadosMovimientos.setVisible(true);
	        this.jInternalFrameOrderByCobrarListadosMovimientos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCobrarListadosMovimientos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCobrarListadosMovimientos.setVisible(false);
	        this.jInternalFrameOrderByCobrarListadosMovimientos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCobrarListadosMovimientos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.setVisible(false);
	        this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCobrarListadosMovimientos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCobrarListadosMovimientos.setVisible(false);
	        this.jInternalFrameImportacionCobrarListadosMovimientos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCobrarListadosMovimientos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCobrarListadosMovimientos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCobrarListadosMovimientos(true);
			//this.isEsNuevoCobrarListadosMovimientos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCobrarListadosMovimientos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarListadosMovimientos(false) ;
			
			if(cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CobrarListadosMovimientosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarListadosMovimientos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarListadosMovimientos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCobrarListadosMovimientosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCobrarListadosMovimientos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarListadosMovimientos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCobrarListadosMovimientos(true);
			//this.isEsNuevoCobrarListadosMovimientos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cobrarlistadosmovimientos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCobrarListadosMovimientos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCobrarListadosMovimientos(false) ;
			
			if(CobrarListadosMovimientosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarListadosMovimientos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarListadosMovimientos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCobrarListadosMovimientos(false);
			
			//if(!this.isEsNuevoCobrarListadosMovimientos) {								
				int intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.cobrarlistadosmovimientos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
				
			}
			
			if(this.permiteMantenimiento(this.cobrarlistadosmovimientos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCobrarListadosMovimientos=true;
					this.inicializarActualizarBindingTablaCobrarListadosMovimientos(false);
					this.isEsNuevoCobrarListadosMovimientos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCobrarListadosMovimientos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCobrarListadosMovimientos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarListadosMovimientos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarListadosMovimientos(false);
				
				this.habilitarDeshabilitarControlesCobrarListadosMovimientos(false);
			
												
				
				if(CobrarListadosMovimientosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCobrarListadosMovimientos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCobrarListadosMovimientosActionPerformed(evt,cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCobrarListadosMovimientos(this.cobrarlistadosmovimientos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCobrarListadosMovimientos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cobrarlistadosmovimientos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CobrarListadosMovimientos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadosMovimientos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				this.cobrarlistadosmovimientos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				this.cobrarlistadosmovimientos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cobrarlistadosmovimientos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CobrarListadosMovimientosModel) this.jTableDatosCobrarListadosMovimientos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCobrarListadosMovimientos=true;
				this.inicializarActualizarBindingTablaCobrarListadosMovimientos(false);
				this.isEsNuevoCobrarListadosMovimientos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarListadosMovimientos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarListadosMovimientos(false);
				
				this.habilitarDeshabilitarControlesCobrarListadosMovimientos(false);
				
				
				
				if(CobrarListadosMovimientosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCobrarListadosMovimientos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCobrarListadosMovimientos.getRowCount()>=1) {
				jTableDatosCobrarListadosMovimientos.removeRowSelectionInterval(0, jTableDatosCobrarListadosMovimientos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCobrarListadosMovimientos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCobrarListadosMovimientos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarListadosMovimientos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarListadosMovimientos(false) ;
			
			this.isEsNuevoCobrarListadosMovimientos=false;
			
			if(CobrarListadosMovimientosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCobrarListadosMovimientos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCobrarListadosMovimientos(false);
				
				//SI ES MANUAL
				if(CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCobrarListadosMovimientos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCobrarListadosMovimientos--;			
			//CobrarListadosMovimientos cobrarlistadosmovimientosAux= new CobrarListadosMovimientos();			
			//cobrarlistadosmovimientosAux.setId(this.iIdNuevoCobrarListadosMovimientos);
			
			if(this.jInternalFrameDetalleFormCobrarListadosMovimientos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCobrarListadosMovimientos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
			
			this.cobrarlistadosmovimientos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().add(this.cobrarlistadosmovimientosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cobrarlistadosmovimientoss.add(this.cobrarlistadosmovimientosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCobrarListadosMovimientos(false);
			
			this.jTableDatosCobrarListadosMovimientos.setRowSelectionInterval(this.getIndiceNuevoCobrarListadosMovimientos(), this.getIndiceNuevoCobrarListadosMovimientos());
			
			int iLastRow =  this.jTableDatosCobrarListadosMovimientos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCobrarListadosMovimientos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCobrarListadosMovimientos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCobrarListadosMovimientos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCobrarListadosMovimientos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarListadosMovimientos(false);
			
			//SI ES MANUAL
			if(CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarListadosMovimientos();
			}
			
			//this.abrirFrameTreeCobrarListadosMovimientos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCobrarListadosMovimientos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCobrarListadosMovimientos.setFileImportacion(this.jInternalFrameImportacionCobrarListadosMovimientos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCobrarListadosMovimientos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCobrarListadosMovimientos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCobrarListadosMovimientos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCobrarListadosMovimientos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CobrarListadosMovimientos> cobrarlistadosmovimientossSeleccionados=new ArrayList<CobrarListadosMovimientos>();		

		cobrarlistadosmovimientossSeleccionados=this.getCobrarListadosMovimientossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CobrarListadosMovimientosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CobrarListadosMovimientosBaseDesign.jrxml";
			
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
			
			this.generarReporteCobrarListadosMovimientoss("Todos",cobrarlistadosmovimientossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Listados Movimientos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarListadosMovimientosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTransaccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTransaccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTransaccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTransaccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAVENCE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVence_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVence_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVence_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVence_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroComprobante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroComprobante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroComprobante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroComprobante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoMoneLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoMoneLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CobrarListadosMovimientosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					sNombreCampoCategoria="nombre_transaccion";
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAVENCE:
					sNombreCampoCategoria="fecha_vence";
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoria="numero_comprobante";
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoria="numero_factura";
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL:
					sNombreCampoCategoria="debito_mone_local";
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL:
					sNombreCampoCategoria="credito_mone_local";
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CobrarListadosMovimientosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					sNombreCampoCategoriaValor="nombre_transaccion";
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAVENCE:
					sNombreCampoCategoriaValor="fecha_vence";
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoriaValor="numero_comprobante";
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoriaValor="numero_factura";
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL:
					sNombreCampoCategoriaValor="debito_mone_local";
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL:
					sNombreCampoCategoriaValor="credito_mone_local";
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarListadosMovimientosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Transaccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_transaccion");
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAVENCE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vence",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vence");
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Comprobante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_comprobante");
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_factura");
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Mone Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_mone_local");
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Mone Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_mone_local");
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CobrarListadosMovimientos> cobrarlistadosmovimientossSeleccionados=new ArrayList<CobrarListadosMovimientos>();		
		
		cobrarlistadosmovimientossSeleccionados=this.getCobrarListadosMovimientossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarlistadosmovimientos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CobrarListadosMovimientoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CobrarListadosMovimientosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CobrarListadosMovimientos cobrarlistadosmovimientos:cobrarlistadosmovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadosmovimientos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(CobrarListadosMovimientos cobrarlistadosmovimientos:cobrarlistadosmovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadosmovimientos.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(CobrarListadosMovimientos cobrarlistadosmovimientos:cobrarlistadosmovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadosmovimientos.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(CobrarListadosMovimientos cobrarlistadosmovimientos:cobrarlistadosmovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadosmovimientos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(CobrarListadosMovimientos cobrarlistadosmovimientos:cobrarlistadosmovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadosmovimientos.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION);
					iRow++;

					for(CobrarListadosMovimientos cobrarlistadosmovimientos:cobrarlistadosmovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadosmovimientos.getnombre_transaccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAVENCE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAVENCE);
					iRow++;

					for(CobrarListadosMovimientos cobrarlistadosmovimientos:cobrarlistadosmovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadosmovimientos.getfecha_vence());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(CobrarListadosMovimientos cobrarlistadosmovimientos:cobrarlistadosmovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadosmovimientos.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
					iRow++;

					for(CobrarListadosMovimientos cobrarlistadosmovimientos:cobrarlistadosmovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadosmovimientos.getnumero_comprobante());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROFACTURA);
					iRow++;

					for(CobrarListadosMovimientos cobrarlistadosmovimientos:cobrarlistadosmovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadosmovimientos.getnumero_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL);
					iRow++;

					for(CobrarListadosMovimientos cobrarlistadosmovimientos:cobrarlistadosmovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadosmovimientos.getdebito_mone_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL);
					iRow++;

					for(CobrarListadosMovimientos cobrarlistadosmovimientos:cobrarlistadosmovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadosmovimientos.getcredito_mone_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarListadosMovimientosConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(CobrarListadosMovimientos cobrarlistadosmovimientos:cobrarlistadosmovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadosmovimientos.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelCobrarListadosMovimientos(row);				
			//	iRow++;
			//}				
			
			//for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:cobrarlistadosmovimientossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCobrarListadosMovimientos(cobrarlistadosmovimientosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Listados Movimientos",JOptionPane.INFORMATION_MESSAGE);
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
				this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarListadosMovimientos(false);
			
			//SI ES MANUAL
			if(CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarListadosMovimientos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarListadosMovimientos(false);
			
			//SI ES MANUAL
			if(CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarListadosMovimientos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarListadosMovimientos(false);
			
			//SI ES MANUAL
			if(CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarListadosMovimientos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCobrarListadosMovimientos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCobrarListadosMovimientos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCobrarListadosMovimientos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCobrarListadosMovimientos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCobrarListadosMovimientos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCobrarListadosMovimientos.setMinimumSize(dimensionMinimum);
		this.jTableDatosCobrarListadosMovimientos.setMaximumSize(dimensionMaximum);
		this.jTableDatosCobrarListadosMovimientos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCobrarListadosMovimientos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCobrarListadosMovimientos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCobrarListadosMovimientos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCobrarListadosMovimientos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCobrarListadosMovimientos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCobrarListadosMovimientos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarListadosMovimientos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCobrarListadosMovimientos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCobrarListadosMovimientos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCobrarListadosMovimientos();
		
		this.inicializarActualizarBindingBotonesManualCobrarListadosMovimientos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarListadosMovimientos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarListadosMovimientos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarListadosMovimientos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarListadosMovimientos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCobrarListadosMovimientos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCobrarListadosMovimientos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCobrarListadosMovimientos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jCheckBoxPostAccionNuevoCobrarListadosMovimientos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jCheckBoxPostAccionSinCerrarCobrarListadosMovimientos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jCheckBoxPostAccionSinMensajeCobrarListadosMovimientos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCobrarListadosMovimientos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCobrarListadosMovimientos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCobrarListadosMovimientos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
				this.jInternalFrameDetalleFormCobrarListadosMovimientos.jCheckBoxPostAccionNuevoCobrarListadosMovimientos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCobrarListadosMovimientos.jCheckBoxPostAccionSinCerrarCobrarListadosMovimientos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCobrarListadosMovimientos.jCheckBoxPostAccionSinMensajeCobrarListadosMovimientos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCobrarListadosMovimientos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCobrarListadosMovimientos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCobrarListadosMovimientos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCobrarListadosMovimientos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCobrarListadosMovimientos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCobrarListadosMovimientos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCobrarListadosMovimientos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCobrarListadosMovimientos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCobrarListadosMovimientos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCobrarListadosMovimientos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCobrarListadosMovimientos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCobrarListadosMovimientos(Boolean esInicializar) throws Exception {
		try	{	
			if(CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarListadosMovimientos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCobrarListadosMovimientos() throws Exception {
		try	{
			if(CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarListadosMovimientos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarListadosMovimientos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarListadosMovimientos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCobrarListadosMovimientos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCobrarListadosMovimientos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCobrarListadosMovimientos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCobrarListadosMovimientos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCobrarListadosMovimientos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCobrarListadosMovimientos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCobrarListadosMovimientos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCobrarListadosMovimientos.addItem(reporte);
			}
			
			
			if(!this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCobrarListadosMovimientos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCobrarListadosMovimientos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCobrarListadosMovimientos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCobrarListadosMovimientos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCobrarListadosMovimientos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCobrarListadosMovimientos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCobrarListadosMovimientos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCobrarListadosMovimientos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCobrarListadosMovimientos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarListadosMovimientos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarListadosMovimientos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarListadosMovimientos!=null) {
				this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarListadosMovimientos!=null) {
				this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCobrarListadosMovimientos!=null) {
				
				if(this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CobrarListadosMovimientosConstantesFunciones.getTiposSeleccionarCobrarListadosMovimientos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CobrarListadosMovimientosConstantesFunciones.getTiposSeleccionarCobrarListadosMovimientos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CobrarListadosMovimientosConstantesFunciones.getTiposSeleccionarCobrarListadosMovimientos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCobrarListadosMovimientos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_emision_desdeBusquedaCobrarListadosMovimientos=new Date(this.jDateChooserfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.getDate().getTime());
		this.fecha_emision_hastaBusquedaCobrarListadosMovimientos=new Date(this.jDateChooserfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCobrarListadosMovimientos(Boolean esInicializar) throws Exception {				
		if(CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarListadosMovimientos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCobrarListadosMovimientos() throws Exception {
		this.inicializarActualizarBindingTablaCobrarListadosMovimientos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCobrarListadosMovimientos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCobrarListadosMovimientos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCobrarListadosMovimientos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarListadosMovimientos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CobrarListadosMovimientosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCobrarListadosMovimientos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarListadosMovimientos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CobrarListadosMovimientosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCobrarListadosMovimientosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadosMovimientosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CobrarListadosMovimientosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCobrarListadosMovimientos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarListadosMovimientos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CobrarListadosMovimientosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCobrarListadosMovimientos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCobrarListadosMovimientos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cobrarlistadosmovimientoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCobrarListadosMovimientos.setModel(new CobrarListadosMovimientosModel(this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCobrarListadosMovimientos.setModel(new CobrarListadosMovimientosModel(this.cobrarlistadosmovimientoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCobrarListadosMovimientos!=null && this.jInternalFrameOrderByCobrarListadosMovimientos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCobrarListadosMovimientos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCobrarListadosMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadosMovimientos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CobrarListadosMovimientosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO,cobrarlistadosmovimientosConstantesFunciones.resaltarSeleccionarCobrarListadosMovimientos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO,cobrarlistadosmovimientosConstantesFunciones.resaltarSeleccionarCobrarListadosMovimientos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCobrarListadosMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadosMovimientos,CobrarListadosMovimientosConstantesFunciones.LABEL_ID));

		if(this.cobrarlistadosmovimientosConstantesFunciones.mostraridCobrarListadosMovimientos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarListadosMovimientosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltaridCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activaridCobrarListadosMovimientos,iSizeTabla,this,true,"idCobrarListadosMovimientos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltaridCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activaridCobrarListadosMovimientos,this,true,"idCobrarListadosMovimientos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarListadosMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadosMovimientos,CobrarListadosMovimientosConstantesFunciones.LABEL_CODIGO));

		if(this.cobrarlistadosmovimientosConstantesFunciones.mostrarcodigoCobrarListadosMovimientos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarListadosMovimientosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltarcodigoCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activarcodigoCobrarListadosMovimientos,iSizeTabla,this,true,"codigoCobrarListadosMovimientos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltarcodigoCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activarcodigoCobrarListadosMovimientos,this,true,"codigoCobrarListadosMovimientos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarListadosMovimientosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarListadosMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadosMovimientos,CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.cobrarlistadosmovimientosConstantesFunciones.mostrarnombre_completoCobrarListadosMovimientos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltarnombre_completoCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activarnombre_completoCobrarListadosMovimientos,iSizeTabla,this,true,"nombre_completoCobrarListadosMovimientos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltarnombre_completoCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activarnombre_completoCobrarListadosMovimientos,this,true,"nombre_completoCobrarListadosMovimientos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarListadosMovimientosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarListadosMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadosMovimientos,CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION));

		if(this.cobrarlistadosmovimientosConstantesFunciones.mostrarnombre_transaccionCobrarListadosMovimientos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltarnombre_transaccionCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activarnombre_transaccionCobrarListadosMovimientos,iSizeTabla,this,true,"nombre_transaccionCobrarListadosMovimientos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltarnombre_transaccionCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activarnombre_transaccionCobrarListadosMovimientos,this,true,"nombre_transaccionCobrarListadosMovimientos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarListadosMovimientosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarListadosMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadosMovimientos,CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAVENCE));

		if(this.cobrarlistadosmovimientosConstantesFunciones.mostrarfecha_venceCobrarListadosMovimientos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAVENCE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltarfecha_venceCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activarfecha_venceCobrarListadosMovimientos,iSizeTabla,this,true,"fecha_venceCobrarListadosMovimientos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltarfecha_venceCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activarfecha_venceCobrarListadosMovimientos,this,true,"fecha_venceCobrarListadosMovimientos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CobrarListadosMovimientosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarListadosMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadosMovimientos,CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISION));

		if(this.cobrarlistadosmovimientosConstantesFunciones.mostrarfecha_emisionCobrarListadosMovimientos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltarfecha_emisionCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activarfecha_emisionCobrarListadosMovimientos,iSizeTabla,this,true,"fecha_emisionCobrarListadosMovimientos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltarfecha_emisionCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activarfecha_emisionCobrarListadosMovimientos,this,true,"fecha_emisionCobrarListadosMovimientos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CobrarListadosMovimientosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarListadosMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadosMovimientos,CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE));

		if(this.cobrarlistadosmovimientosConstantesFunciones.mostrarnumero_comprobanteCobrarListadosMovimientos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltarnumero_comprobanteCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activarnumero_comprobanteCobrarListadosMovimientos,iSizeTabla,this,true,"numero_comprobanteCobrarListadosMovimientos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltarnumero_comprobanteCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activarnumero_comprobanteCobrarListadosMovimientos,this,true,"numero_comprobanteCobrarListadosMovimientos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarListadosMovimientosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarListadosMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadosMovimientos,CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROFACTURA));

		if(this.cobrarlistadosmovimientosConstantesFunciones.mostrarnumero_facturaCobrarListadosMovimientos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltarnumero_facturaCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activarnumero_facturaCobrarListadosMovimientos,iSizeTabla,this,true,"numero_facturaCobrarListadosMovimientos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltarnumero_facturaCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activarnumero_facturaCobrarListadosMovimientos,this,true,"numero_facturaCobrarListadosMovimientos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarListadosMovimientosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarListadosMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadosMovimientos,CobrarListadosMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL));

		if(this.cobrarlistadosmovimientosConstantesFunciones.mostrardebito_mone_localCobrarListadosMovimientos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarListadosMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltardebito_mone_localCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activardebito_mone_localCobrarListadosMovimientos,iSizeTabla,this,true,"debito_mone_localCobrarListadosMovimientos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltardebito_mone_localCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activardebito_mone_localCobrarListadosMovimientos,this,true,"debito_mone_localCobrarListadosMovimientos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarListadosMovimientosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarListadosMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadosMovimientos,CobrarListadosMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL));

		if(this.cobrarlistadosmovimientosConstantesFunciones.mostrarcredito_mone_localCobrarListadosMovimientos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarListadosMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltarcredito_mone_localCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activarcredito_mone_localCobrarListadosMovimientos,iSizeTabla,this,true,"credito_mone_localCobrarListadosMovimientos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltarcredito_mone_localCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activarcredito_mone_localCobrarListadosMovimientos,this,true,"credito_mone_localCobrarListadosMovimientos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarListadosMovimientosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarListadosMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadosMovimientos,CobrarListadosMovimientosConstantesFunciones.LABEL_DESCRIPCION));

		if(this.cobrarlistadosmovimientosConstantesFunciones.mostrardescripcionCobrarListadosMovimientos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarListadosMovimientosConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltardescripcionCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activardescripcionCobrarListadosMovimientos,iSizeTabla,this,true,"descripcionCobrarListadosMovimientos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarlistadosmovimientosConstantesFunciones.resaltardescripcionCobrarListadosMovimientos,this.cobrarlistadosmovimientosConstantesFunciones.activardescripcionCobrarListadosMovimientos,this,true,"descripcionCobrarListadosMovimientos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarListadosMovimientosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarListadosMovimientos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarListadosMovimientos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCobrarListadosMovimientos && this.isPermisoGuardarCambiosCobrarListadosMovimientos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCobrarListadosMovimientos.addColumn(tableColumn);
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
			
			this.jTableDatosCobrarListadosMovimientos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarListadosMovimientos && this.isPermisoGuardarCambiosCobrarListadosMovimientos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarListadosMovimientos && this.isPermisoGuardarCambiosCobrarListadosMovimientos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCobrarListadosMovimientos.moveColumn(this.jTableDatosCobrarListadosMovimientos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCobrarListadosMovimientos.moveColumn(this.jTableDatosCobrarListadosMovimientos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCobrarListadosMovimientos.moveColumn(this.jTableDatosCobrarListadosMovimientos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCobrarListadosMovimientos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCobrarListadosMovimientos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCobrarListadosMovimientos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCobrarListadosMovimientos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCobrarListadosMovimientos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCobrarListadosMovimientos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCobrarListadosMovimientos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCobrarListadosMovimientos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cobrarlistadosmovimientoss.size()-1;
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
		//this.jTableDatosCobrarListadosMovimientos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCobrarListadosMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCobrarListadosMovimientos();
			
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
				
				//this.isEsNuevoCobrarListadosMovimientos=false;
					
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
			
				if(this.cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCobrarListadosMovimientos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarListadosMovimientos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarListadosMovimientos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cobrarlistadosmovimientos.getsType().equals("DUPLICADO")
				   || this.cobrarlistadosmovimientos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCobrarListadosMovimientos=true;
				
				} else {
					this.isEsNuevoCobrarListadosMovimientos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
					if(this.cobrarlistadosmovimientos.getId()>=0 && !this.cobrarlistadosmovimientos.getIsNew()) {						
						this.isEsNuevoCobrarListadosMovimientos=false;
						
					} else {
						this.isEsNuevoCobrarListadosMovimientos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCobrarListadosMovimientos(esRelaciones);						
				
				this.seleccionarCobrarListadosMovimientos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cobrarlistadosmovimientos.getId()<0) {
					this.isEsNuevoCobrarListadosMovimientos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCobrarListadosMovimientos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCobrarListadosMovimientos(evt,rowIndex);
				}	
				
				if(this.cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CobrarListadosMovimientos: " + this.dDif); 
					}
				}								
				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCobrarListadosMovimientos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cobrarlistadosmovimientos)) {
					if(this.cobrarlistadosmovimientos.getId()>0) {
						this.cobrarlistadosmovimientos.setIsDeleted(true);
						
						this.cobrarlistadosmovimientossEliminados.add(this.cobrarlistadosmovimientos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().remove(this.cobrarlistadosmovimientos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarlistadosmovimientoss.remove(this.cobrarlistadosmovimientos);				
					}
					
					
					((CobrarListadosMovimientosModel) this.jTableDatosCobrarListadosMovimientos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarListadosMovimientos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCobrarListadosMovimientos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCobrarListadosMovimientos) {
			
			if(this.jInternalFrameDetalleFormCobrarListadosMovimientos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarListadosMovimientos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarListadosMovimientos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCobrarListadosMovimientos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCobrarListadosMovimientos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarListadosMovimientos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarListadosMovimientos(CobrarListadosMovimientos cobrarlistadosmovimientos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCobrarListadosMovimientos(cobrarlistadosmovimientos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarListadosMovimientos(CobrarListadosMovimientos cobrarlistadosmovimientos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCobrarListadosMovimientos(cobrarlistadosmovimientos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCobrarListadosMovimientos(cobrarlistadosmovimientos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCobrarListadosMovimientos(cobrarlistadosmovimientos);
	}
	
	public void setVariablesObjetoActualToFormularioCobrarListadosMovimientos(CobrarListadosMovimientos cobrarlistadosmovimientos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCobrarListadosMovimientos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelidCobrarListadosMovimientos.setText(cobrarlistadosmovimientos.getId().toString());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldcodigoCobrarListadosMovimientos.setText(cobrarlistadosmovimientos.getcodigo());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreanombre_completoCobrarListadosMovimientos.setText(cobrarlistadosmovimientos.getnombre_completo());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreanombre_transaccionCobrarListadosMovimientos.setText(cobrarlistadosmovimientos.getnombre_transaccion());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_venceCobrarListadosMovimientos.setDate(cobrarlistadosmovimientos.getfecha_vence());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_emisionCobrarListadosMovimientos.setDate(cobrarlistadosmovimientos.getfecha_emision());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldnumero_comprobanteCobrarListadosMovimientos.setText(cobrarlistadosmovimientos.getnumero_comprobante());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldnumero_facturaCobrarListadosMovimientos.setText(cobrarlistadosmovimientos.getnumero_factura());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFielddebito_mone_localCobrarListadosMovimientos.setText(cobrarlistadosmovimientos.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldcredito_mone_localCobrarListadosMovimientos.setText(cobrarlistadosmovimientos.getcredito_mone_local().toString());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreadescripcionCobrarListadosMovimientos.setText(cobrarlistadosmovimientos.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CobrarListadosMovimientos cobrarlistadosmovimientosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cobrarlistadosmovimientosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CobrarListadosMovimientos cobrarlistadosmovimientosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cobrarlistadosmovimientosLocal=this.cobrarlistadosmovimientos;
			} else {
				cobrarlistadosmovimientosLocal=this.cobrarlistadosmovimientosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cobrarlistadosmovimientosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCobrarListadosMovimientos(cobrarlistadosmovimientosLocal,true);
					
					if(cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cobrarlistadosmovimientosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cobrarlistadosmovimientosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCobrarListadosMovimientos(CobrarListadosMovimientos cobrarlistadosmovimientos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(cobrarlistadosmovimientos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(cobrarlistadosmovimientos);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarListadosMovimientos(CobrarListadosMovimientos cobrarlistadosmovimientos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(cobrarlistadosmovimientos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarListadosMovimientos(CobrarListadosMovimientos cobrarlistadosmovimientos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCobrarListadosMovimientos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelidCobrarListadosMovimientos.getText()==null || this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelidCobrarListadosMovimientos.getText()=="" || this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelidCobrarListadosMovimientos.getText()=="Id") {
				this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelidCobrarListadosMovimientos.setText("0");
			}

			if(conColumnasBase) {cobrarlistadosmovimientos.setId(Long.parseLong(this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelidCobrarListadosMovimientos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarListadosMovimientosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelIdCobrarListadosMovimientos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarlistadosmovimientos.setcodigo(this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldcodigoCobrarListadosMovimientos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarListadosMovimientosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelcodigoCobrarListadosMovimientos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarlistadosmovimientos.setnombre_completo(this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreanombre_completoCobrarListadosMovimientos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelnombre_completoCobrarListadosMovimientos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarlistadosmovimientos.setnombre_transaccion(this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreanombre_transaccionCobrarListadosMovimientos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelnombre_transaccionCobrarListadosMovimientos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarlistadosmovimientos.setfecha_vence(this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_venceCobrarListadosMovimientos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAVENCE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelfecha_venceCobrarListadosMovimientos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarlistadosmovimientos.setfecha_emision(this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_emisionCobrarListadosMovimientos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelfecha_emisionCobrarListadosMovimientos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarlistadosmovimientos.setnumero_comprobante(this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldnumero_comprobanteCobrarListadosMovimientos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelnumero_comprobanteCobrarListadosMovimientos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarlistadosmovimientos.setnumero_factura(this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldnumero_facturaCobrarListadosMovimientos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelnumero_facturaCobrarListadosMovimientos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarlistadosmovimientos.setdebito_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFielddebito_mone_localCobrarListadosMovimientos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarListadosMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabeldebito_mone_localCobrarListadosMovimientos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarlistadosmovimientos.setcredito_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldcredito_mone_localCobrarListadosMovimientos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarListadosMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelcredito_mone_localCobrarListadosMovimientos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarlistadosmovimientos.setdescripcion(this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreadescripcionCobrarListadosMovimientos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarListadosMovimientosConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabeldescripcionCobrarListadosMovimientos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarListadosMovimientos(CobrarListadosMovimientos cobrarlistadosmovimientosBean,CobrarListadosMovimientos cobrarlistadosmovimientos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCobrarListadosMovimientos(CobrarListadosMovimientos cobrarlistadosmovimientosOrigen,CobrarListadosMovimientos cobrarlistadosmovimientos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarlistadosmovimientosOrigen.getId()!=null && !cobrarlistadosmovimientosOrigen.getId().equals(0L))) {cobrarlistadosmovimientos.setId(cobrarlistadosmovimientosOrigen.getId());}}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosOrigen.getfecha_emision_desde()!=null && !cobrarlistadosmovimientosOrigen.getfecha_emision_desde().equals(new Date()))) {cobrarlistadosmovimientos.setfecha_emision_desde(cobrarlistadosmovimientosOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosOrigen.getfecha_emision_hasta()!=null && !cobrarlistadosmovimientosOrigen.getfecha_emision_hasta().equals(new Date()))) {cobrarlistadosmovimientos.setfecha_emision_hasta(cobrarlistadosmovimientosOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosOrigen.getcodigo()!=null && !cobrarlistadosmovimientosOrigen.getcodigo().equals(""))) {cobrarlistadosmovimientos.setcodigo(cobrarlistadosmovimientosOrigen.getcodigo());}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosOrigen.getnombre_completo()!=null && !cobrarlistadosmovimientosOrigen.getnombre_completo().equals(""))) {cobrarlistadosmovimientos.setnombre_completo(cobrarlistadosmovimientosOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosOrigen.getnombre_transaccion()!=null && !cobrarlistadosmovimientosOrigen.getnombre_transaccion().equals(""))) {cobrarlistadosmovimientos.setnombre_transaccion(cobrarlistadosmovimientosOrigen.getnombre_transaccion());}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosOrigen.getfecha_vence()!=null && !cobrarlistadosmovimientosOrigen.getfecha_vence().equals(new Date()))) {cobrarlistadosmovimientos.setfecha_vence(cobrarlistadosmovimientosOrigen.getfecha_vence());}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosOrigen.getfecha_emision()!=null && !cobrarlistadosmovimientosOrigen.getfecha_emision().equals(new Date()))) {cobrarlistadosmovimientos.setfecha_emision(cobrarlistadosmovimientosOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosOrigen.getnumero_comprobante()!=null && !cobrarlistadosmovimientosOrigen.getnumero_comprobante().equals(""))) {cobrarlistadosmovimientos.setnumero_comprobante(cobrarlistadosmovimientosOrigen.getnumero_comprobante());}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosOrigen.getnumero_factura()!=null && !cobrarlistadosmovimientosOrigen.getnumero_factura().equals(""))) {cobrarlistadosmovimientos.setnumero_factura(cobrarlistadosmovimientosOrigen.getnumero_factura());}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosOrigen.getdebito_mone_local()!=null && !cobrarlistadosmovimientosOrigen.getdebito_mone_local().equals(0.0))) {cobrarlistadosmovimientos.setdebito_mone_local(cobrarlistadosmovimientosOrigen.getdebito_mone_local());}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosOrigen.getcredito_mone_local()!=null && !cobrarlistadosmovimientosOrigen.getcredito_mone_local().equals(0.0))) {cobrarlistadosmovimientos.setcredito_mone_local(cobrarlistadosmovimientosOrigen.getcredito_mone_local());}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosOrigen.getdescripcion()!=null && !cobrarlistadosmovimientosOrigen.getdescripcion().equals(""))) {cobrarlistadosmovimientos.setdescripcion(cobrarlistadosmovimientosOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarListadosMovimientos(CobrarListadosMovimientos cobrarlistadosmovimientos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelidCobrarListadosMovimientos.setText(cobrarlistadosmovimientos.getId().toString());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldcodigoCobrarListadosMovimientos.setText(cobrarlistadosmovimientos.getcodigo());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreanombre_completoCobrarListadosMovimientos.setText(cobrarlistadosmovimientos.getnombre_completo());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreanombre_transaccionCobrarListadosMovimientos.setText(cobrarlistadosmovimientos.getnombre_transaccion());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_venceCobrarListadosMovimientos.setDate(cobrarlistadosmovimientos.getfecha_vence());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_emisionCobrarListadosMovimientos.setDate(cobrarlistadosmovimientos.getfecha_emision());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldnumero_comprobanteCobrarListadosMovimientos.setText(cobrarlistadosmovimientos.getnumero_comprobante());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldnumero_facturaCobrarListadosMovimientos.setText(cobrarlistadosmovimientos.getnumero_factura());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFielddebito_mone_localCobrarListadosMovimientos.setText(cobrarlistadosmovimientos.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldcredito_mone_localCobrarListadosMovimientos.setText(cobrarlistadosmovimientos.getcredito_mone_local().toString());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreadescripcionCobrarListadosMovimientos.setText(cobrarlistadosmovimientos.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarListadosMovimientos(CobrarListadosMovimientosBean cobrarlistadosmovimientosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelidCobrarListadosMovimientos.setText(cobrarlistadosmovimientosBean.getId().toString());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldcodigoCobrarListadosMovimientos.setText(cobrarlistadosmovimientosBean.getcodigo());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreanombre_completoCobrarListadosMovimientos.setText(cobrarlistadosmovimientosBean.getnombre_completo());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreanombre_transaccionCobrarListadosMovimientos.setText(cobrarlistadosmovimientosBean.getnombre_transaccion());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_venceCobrarListadosMovimientos.setDate(cobrarlistadosmovimientosBean.getfecha_vence());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_emisionCobrarListadosMovimientos.setDate(cobrarlistadosmovimientosBean.getfecha_emision());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldnumero_comprobanteCobrarListadosMovimientos.setText(cobrarlistadosmovimientosBean.getnumero_comprobante());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldnumero_facturaCobrarListadosMovimientos.setText(cobrarlistadosmovimientosBean.getnumero_factura());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFielddebito_mone_localCobrarListadosMovimientos.setText(cobrarlistadosmovimientosBean.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldcredito_mone_localCobrarListadosMovimientos.setText(cobrarlistadosmovimientosBean.getcredito_mone_local().toString());
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreadescripcionCobrarListadosMovimientos.setText(cobrarlistadosmovimientosBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCobrarListadosMovimientos(CobrarListadosMovimientosParameterReturnGeneral cobrarlistadosmovimientosReturnGeneral,CobrarListadosMovimientosBean cobrarlistadosmovimientosBean,Boolean conDefault) throws Exception { 
		try {
			CobrarListadosMovimientos cobrarlistadosmovimientosLocal=new CobrarListadosMovimientos();
			
			cobrarlistadosmovimientosLocal=cobrarlistadosmovimientosReturnGeneral.getCobrarListadosMovimientos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarlistadosmovimientosLocal.getId()!=null && !cobrarlistadosmovimientosLocal.getId().equals(0L))) {cobrarlistadosmovimientosBean.setId(cobrarlistadosmovimientosLocal.getId());}}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosLocal.getcodigo()!=null && !cobrarlistadosmovimientosLocal.getcodigo().equals(""))) {cobrarlistadosmovimientosBean.setcodigo(cobrarlistadosmovimientosLocal.getcodigo());}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosLocal.getnombre_completo()!=null && !cobrarlistadosmovimientosLocal.getnombre_completo().equals(""))) {cobrarlistadosmovimientosBean.setnombre_completo(cobrarlistadosmovimientosLocal.getnombre_completo());}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosLocal.getnombre_transaccion()!=null && !cobrarlistadosmovimientosLocal.getnombre_transaccion().equals(""))) {cobrarlistadosmovimientosBean.setnombre_transaccion(cobrarlistadosmovimientosLocal.getnombre_transaccion());}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosLocal.getfecha_vence()!=null && !cobrarlistadosmovimientosLocal.getfecha_vence().equals(new Date()))) {cobrarlistadosmovimientosBean.setfecha_vence(cobrarlistadosmovimientosLocal.getfecha_vence());}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosLocal.getfecha_emision()!=null && !cobrarlistadosmovimientosLocal.getfecha_emision().equals(new Date()))) {cobrarlistadosmovimientosBean.setfecha_emision(cobrarlistadosmovimientosLocal.getfecha_emision());}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosLocal.getnumero_comprobante()!=null && !cobrarlistadosmovimientosLocal.getnumero_comprobante().equals(""))) {cobrarlistadosmovimientosBean.setnumero_comprobante(cobrarlistadosmovimientosLocal.getnumero_comprobante());}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosLocal.getnumero_factura()!=null && !cobrarlistadosmovimientosLocal.getnumero_factura().equals(""))) {cobrarlistadosmovimientosBean.setnumero_factura(cobrarlistadosmovimientosLocal.getnumero_factura());}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosLocal.getdebito_mone_local()!=null && !cobrarlistadosmovimientosLocal.getdebito_mone_local().equals(0.0))) {cobrarlistadosmovimientosBean.setdebito_mone_local(cobrarlistadosmovimientosLocal.getdebito_mone_local());}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosLocal.getcredito_mone_local()!=null && !cobrarlistadosmovimientosLocal.getcredito_mone_local().equals(0.0))) {cobrarlistadosmovimientosBean.setcredito_mone_local(cobrarlistadosmovimientosLocal.getcredito_mone_local());}
			if(conDefault || (!conDefault && cobrarlistadosmovimientosLocal.getdescripcion()!=null && !cobrarlistadosmovimientosLocal.getdescripcion().equals(""))) {cobrarlistadosmovimientosBean.setdescripcion(cobrarlistadosmovimientosLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCobrarListadosMovimientosGenerico(Long idCobrarListadosMovimientosSeleccionado,JComboBox jComboBoxCobrarListadosMovimientos,List<CobrarListadosMovimientos> cobrarlistadosmovimientossLocal)throws Exception {
		try {
			CobrarListadosMovimientos  cobrarlistadosmovimientosTemp=null;

			for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:cobrarlistadosmovimientossLocal) {
				if(cobrarlistadosmovimientosAux.getId()!=null && cobrarlistadosmovimientosAux.getId().equals(idCobrarListadosMovimientosSeleccionado)) {
					cobrarlistadosmovimientosTemp=cobrarlistadosmovimientosAux;
					break;
				}
			}

			jComboBoxCobrarListadosMovimientos.setSelectedItem(cobrarlistadosmovimientosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCobrarListadosMovimientosGenerico(JComboBox jComboBoxCobrarListadosMovimientos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCobrarListadosMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarListadosMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCobrarListadosMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarListadosMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarListadosMovimientos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCobrarListadosMovimientos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarListadosMovimientos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCobrarListadosMovimientos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCobrarListadosMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCobrarListadosMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarlistadosmovimientos=(CobrarListadosMovimientos) cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarlistadosmovimientos =(CobrarListadosMovimientos) cobrarlistadosmovimientoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cobrarlistadosmovimientos.getIsNew() && !cobrarlistadosmovimientos.getIsChanged() && !cobrarlistadosmovimientos.getIsDeleted()) {
				sDescripcion=cobrarlistadosmovimientos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarlistadosmovimientos.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CobrarListadosMovimientos cobrarlistadosmovimientosRow=new CobrarListadosMovimientos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarlistadosmovimientosRow=(CobrarListadosMovimientos) cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarlistadosmovimientosRow=(CobrarListadosMovimientos) cobrarlistadosmovimientoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCobrarListadosMovimientos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaNuevoCobrarListadosMovimientos && this.isPermisoNuevoCobrarListadosMovimientos));			
			this.jButtonDuplicarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaDuplicarCobrarListadosMovimientos && this.isPermisoDuplicarCobrarListadosMovimientos));			
			this.jButtonCopiarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaCopiarCobrarListadosMovimientos && this.isPermisoCopiarCobrarListadosMovimientos));
			this.jButtonVerFormCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaVerFormCobrarListadosMovimientos && this.isPermisoVerFormCobrarListadosMovimientos));
			
			this.jButtonAbrirOrderByCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaOrdenCobrarListadosMovimientos && this.isPermisoOrdenCobrarListadosMovimientos));			
			
			this.jButtonNuevoRelacionesCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos && this.isPermisoNuevoCobrarListadosMovimientos));			
			this.jButtonNuevoGuardarCambiosCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaNuevoCobrarListadosMovimientos && this.isPermisoNuevoCobrarListadosMovimientos && this.isPermisoGuardarCambiosCobrarListadosMovimientos));
			
			if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonModificarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaModificarCobrarListadosMovimientos && this.isPermisoActualizarCobrarListadosMovimientos));	
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonActualizarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaActualizarCobrarListadosMovimientos && this.isPermisoActualizarCobrarListadosMovimientos));	
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonEliminarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaEliminarCobrarListadosMovimientos && this.isPermisoEliminarCobrarListadosMovimientos));
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonCancelarCobrarListadosMovimientos.setVisible(this.isVisibilidadCeldaCancelarCobrarListadosMovimientos);							
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonGuardarCambiosCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaGuardarCobrarListadosMovimientos && this.isPermisoGuardarCambiosCobrarListadosMovimientos));			
			
			}
						
			this.jButtonGuardarCambiosTablaCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos && this.isPermisoGuardarCambiosCobrarListadosMovimientos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaNuevoCobrarListadosMovimientos && this.isPermisoNuevoCobrarListadosMovimientos));						
			this.jButtonDuplicarToolBarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaDuplicarCobrarListadosMovimientos && this.isPermisoDuplicarCobrarListadosMovimientos));						
			this.jButtonCopiarToolBarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaCopiarCobrarListadosMovimientos && this.isPermisoCopiarCobrarListadosMovimientos));			
			this.jButtonVerFormToolBarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaVerFormCobrarListadosMovimientos && this.isPermisoVerFormCobrarListadosMovimientos));			
			this.jButtonAbrirOrderByToolBarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaOrdenCobrarListadosMovimientos && this.isPermisoOrdenCobrarListadosMovimientos));
			this.jButtonNuevoRelacionesToolBarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos && this.isPermisoNuevoCobrarListadosMovimientos));			
			this.jButtonNuevoGuardarCambiosToolBarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaNuevoCobrarListadosMovimientos && this.isPermisoNuevoCobrarListadosMovimientos && this.isPermisoGuardarCambiosCobrarListadosMovimientos));			
			
			if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonModificarToolBarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaModificarCobrarListadosMovimientos && this.isPermisoActualizarCobrarListadosMovimientos));	
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonActualizarToolBarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaActualizarCobrarListadosMovimientos  && this.isPermisoActualizarCobrarListadosMovimientos));	
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonEliminarToolBarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaEliminarCobrarListadosMovimientos && this.isPermisoEliminarCobrarListadosMovimientos));
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonCancelarToolBarCobrarListadosMovimientos.setVisible(this.isVisibilidadCeldaCancelarCobrarListadosMovimientos);				
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonGuardarCambiosToolBarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaGuardarCobrarListadosMovimientos && this.isPermisoGuardarCambiosCobrarListadosMovimientos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos && this.isPermisoGuardarCambiosCobrarListadosMovimientos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaNuevoCobrarListadosMovimientos && this.isPermisoNuevoCobrarListadosMovimientos));			
			this.jMenuItemDuplicarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaDuplicarCobrarListadosMovimientos && this.isPermisoDuplicarCobrarListadosMovimientos));			
			this.jMenuItemCopiarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaCopiarCobrarListadosMovimientos && this.isPermisoCopiarCobrarListadosMovimientos));			
			this.jMenuItemVerFormCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaVerFormCobrarListadosMovimientos && this.isPermisoVerFormCobrarListadosMovimientos));			
			this.jMenuItemAbrirOrderByCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaOrdenCobrarListadosMovimientos && this.isPermisoOrdenCobrarListadosMovimientos));			
			//this.jMenuItemMostrarOcultarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaOrdenCobrarListadosMovimientos && this.isPermisoOrdenCobrarListadosMovimientos));
			this.jMenuItemDetalleAbrirOrderByCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaOrdenCobrarListadosMovimientos && this.isPermisoOrdenCobrarListadosMovimientos));			
			//this.jMenuItemDetalleMostrarOcultarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaOrdenCobrarListadosMovimientos && this.isPermisoOrdenCobrarListadosMovimientos));			
			this.jMenuItemNuevoRelacionesCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos && this.isPermisoNuevoCobrarListadosMovimientos));			
			this.jMenuItemNuevoGuardarCambiosCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaNuevoCobrarListadosMovimientos && this.isPermisoNuevoCobrarListadosMovimientos && this.isPermisoGuardarCambiosCobrarListadosMovimientos));									
			
			if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jMenuItemModificarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaModificarCobrarListadosMovimientos && this.isPermisoActualizarCobrarListadosMovimientos));	
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jMenuItemActualizarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaActualizarCobrarListadosMovimientos && this.isPermisoActualizarCobrarListadosMovimientos));	
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jMenuItemEliminarCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaEliminarCobrarListadosMovimientos && this.isPermisoEliminarCobrarListadosMovimientos));
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jMenuItemCancelarCobrarListadosMovimientos.setVisible(this.isVisibilidadCeldaCancelarCobrarListadosMovimientos);				
			}
			
			this.jMenuItemGuardarCambiosCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaGuardarCobrarListadosMovimientos && this.isPermisoGuardarCambiosCobrarListadosMovimientos));						
			this.jMenuItemGuardarCambiosTablaCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos && this.isPermisoGuardarCambiosCobrarListadosMovimientos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCobrarListadosMovimientos=this.jButtonNuevoCobrarListadosMovimientos.isVisible();
			this.isVisibilidadCeldaDuplicarCobrarListadosMovimientos=this.jButtonDuplicarCobrarListadosMovimientos.isVisible();
			this.isVisibilidadCeldaCopiarCobrarListadosMovimientos=this.jButtonCopiarCobrarListadosMovimientos.isVisible();
			this.isVisibilidadCeldaVerFormCobrarListadosMovimientos=this.jButtonVerFormCobrarListadosMovimientos.isVisible();
			
			this.isVisibilidadCeldaOrdenCobrarListadosMovimientos=this.jButtonAbrirOrderByCobrarListadosMovimientos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos=this.jButtonNuevoRelacionesCobrarListadosMovimientos.isVisible();
			this.isVisibilidadCeldaModificarCobrarListadosMovimientos=this.jButtonModificarCobrarListadosMovimientos.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
			this.isVisibilidadCeldaActualizarCobrarListadosMovimientos=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonActualizarCobrarListadosMovimientos.isVisible();
			this.isVisibilidadCeldaEliminarCobrarListadosMovimientos=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonEliminarCobrarListadosMovimientos.isVisible();
			this.isVisibilidadCeldaCancelarCobrarListadosMovimientos=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonCancelarCobrarListadosMovimientos.isVisible();
			this.isVisibilidadCeldaGuardarCobrarListadosMovimientos=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonGuardarCambiosCobrarListadosMovimientos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos=this.jButtonGuardarCambiosTablaCobrarListadosMovimientos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCobrarListadosMovimientos=this.jButtonNuevoToolBarCobrarListadosMovimientos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos=this.jButtonNuevoRelacionesToolBarCobrarListadosMovimientos.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
			this.isVisibilidadCeldaModificarCobrarListadosMovimientos=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonModificarToolBarCobrarListadosMovimientos.isVisible();
			this.isVisibilidadCeldaActualizarCobrarListadosMovimientos=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonActualizarToolBarCobrarListadosMovimientos.isVisible();
			this.isVisibilidadCeldaEliminarCobrarListadosMovimientos=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonEliminarToolBarCobrarListadosMovimientos.isVisible();
			this.isVisibilidadCeldaCancelarCobrarListadosMovimientos=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonCancelarToolBarCobrarListadosMovimientos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarListadosMovimientos=this.jButtonGuardarCambiosToolBarCobrarListadosMovimientos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos=this.jButtonGuardarCambiosTablaToolBarCobrarListadosMovimientos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCobrarListadosMovimientos=this.jMenuItemNuevoCobrarListadosMovimientos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos=this.jMenuItemNuevoRelacionesCobrarListadosMovimientos.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
			this.isVisibilidadCeldaModificarCobrarListadosMovimientos=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jMenuItemModificarCobrarListadosMovimientos.isVisible();
			this.isVisibilidadCeldaActualizarCobrarListadosMovimientos=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jMenuItemActualizarCobrarListadosMovimientos.isVisible();
			this.isVisibilidadCeldaEliminarCobrarListadosMovimientos=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jMenuItemEliminarCobrarListadosMovimientos.isVisible();
			this.isVisibilidadCeldaCancelarCobrarListadosMovimientos=this.jInternalFrameDetalleFormCobrarListadosMovimientos.jMenuItemCancelarCobrarListadosMovimientos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarListadosMovimientos=this.jMenuItemGuardarCambiosCobrarListadosMovimientos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos=this.jMenuItemGuardarCambiosTablaCobrarListadosMovimientos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCobrarListadosMovimientos(Boolean esInicializar) {
		if(CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones()) {
				//if(this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarListadosMovimientos();
			}
			
			this.inicializarActualizarBindingBotonesManualCobrarListadosMovimientos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCobrarListadosMovimientos() {
		this.jButtonNuevoCobrarListadosMovimientos.setVisible(this.isPermisoNuevoCobrarListadosMovimientos);			
		this.jButtonDuplicarCobrarListadosMovimientos.setVisible(this.isPermisoDuplicarCobrarListadosMovimientos);			
		this.jButtonCopiarCobrarListadosMovimientos.setVisible(this.isPermisoCopiarCobrarListadosMovimientos);			
		this.jButtonVerFormCobrarListadosMovimientos.setVisible(this.isPermisoVerFormCobrarListadosMovimientos);			
		
		this.jButtonAbrirOrderByCobrarListadosMovimientos.setVisible(this.isPermisoOrdenCobrarListadosMovimientos);					
		
		this.jButtonNuevoRelacionesCobrarListadosMovimientos.setVisible(this.isPermisoNuevoCobrarListadosMovimientos);			
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonModificarCobrarListadosMovimientos.setVisible(this.isPermisoActualizarCobrarListadosMovimientos);	
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonActualizarCobrarListadosMovimientos.setVisible(this.isPermisoActualizarCobrarListadosMovimientos);	
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonEliminarCobrarListadosMovimientos.setVisible(this.isPermisoEliminarCobrarListadosMovimientos);
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonCancelarCobrarListadosMovimientos.setVisible(this.isVisibilidadCeldaCancelarCobrarListadosMovimientos);						
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonGuardarCambiosCobrarListadosMovimientos.setVisible(this.isPermisoGuardarCambiosCobrarListadosMovimientos);							
		}
		
		this.jButtonGuardarCambiosTablaCobrarListadosMovimientos.setVisible(this.isPermisoActualizarCobrarListadosMovimientos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarListadosMovimientos() {
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonModificarCobrarListadosMovimientos.setVisible(this.isPermisoActualizarCobrarListadosMovimientos);	
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonActualizarCobrarListadosMovimientos.setVisible(this.isPermisoActualizarCobrarListadosMovimientos);	
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonEliminarCobrarListadosMovimientos.setVisible(this.isPermisoEliminarCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonCancelarCobrarListadosMovimientos.setVisible(this.isVisibilidadCeldaCancelarCobrarListadosMovimientos);							
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonGuardarCambiosCobrarListadosMovimientos.setVisible((this.isVisibilidadCeldaGuardarCobrarListadosMovimientos && this.isPermisoGuardarCambiosCobrarListadosMovimientos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCobrarListadosMovimientos() {
		if(CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCobrarListadosMovimientos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCobrarListadosMovimientos() {
	}
	
	public void jTableDatosCobrarListadosMovimientosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCobrarListadosMovimientos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCobrarListadosMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.getcobrarlistadosmovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadosmovimientos==null) {
						this.cobrarlistadosmovimientos = new CobrarListadosMovimientos();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.cobrarlistadosmovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
				}

				if(this.cobrarlistadosmovimientos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cobrarlistadosmovimientos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadosMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCobrarListadosMovimientosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCobrarListadosMovimientos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarListadosMovimientos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarListadosMovimientos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.getcobrarlistadosmovimientos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cobrarlistadosmovimientosLogic.getConnexion());

				if(this.cobrarlistadosmovimientos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cobrarlistadosmovimientos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarListadosMovimientos=(TitledBorder)this.jScrollPanelDatosCobrarListadosMovimientos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCobrarListadosMovimientos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCobrarListadosMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.getcobrarlistadosmovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadosmovimientos==null) {
						this.cobrarlistadosmovimientos = new CobrarListadosMovimientos();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.cobrarlistadosmovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
				}

				if(this.cobrarlistadosmovimientos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cobrarlistadosmovimientos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadosMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeCobrarListadosMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.getcobrarlistadosmovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadosmovimientos==null) {
						this.cobrarlistadosmovimientos = new CobrarListadosMovimientos();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.cobrarlistadosmovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
				}

				if(this.cobrarlistadosmovimientos.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.cobrarlistadosmovimientos.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadosMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaCobrarListadosMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.getcobrarlistadosmovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadosmovimientos==null) {
						this.cobrarlistadosmovimientos = new CobrarListadosMovimientos();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.cobrarlistadosmovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
				}

				if(this.cobrarlistadosmovimientos.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.cobrarlistadosmovimientos.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadosMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCobrarListadosMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.getcobrarlistadosmovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadosmovimientos==null) {
						this.cobrarlistadosmovimientos = new CobrarListadosMovimientos();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.cobrarlistadosmovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
				}

				if(this.cobrarlistadosmovimientos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.cobrarlistadosmovimientos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadosMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoCobrarListadosMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.getcobrarlistadosmovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadosmovimientos==null) {
						this.cobrarlistadosmovimientos = new CobrarListadosMovimientos();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.cobrarlistadosmovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
				}

				if(this.cobrarlistadosmovimientos.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.cobrarlistadosmovimientos.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadosMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_transaccionCobrarListadosMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.getcobrarlistadosmovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadosmovimientos==null) {
						this.cobrarlistadosmovimientos = new CobrarListadosMovimientos();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.cobrarlistadosmovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
				}

				if(this.cobrarlistadosmovimientos.getnombre_transaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_transaccion like '%"+this.cobrarlistadosmovimientos.getnombre_transaccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadosMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_venceCobrarListadosMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.getcobrarlistadosmovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadosmovimientos==null) {
						this.cobrarlistadosmovimientos = new CobrarListadosMovimientos();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.cobrarlistadosmovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
				}

				if(this.cobrarlistadosmovimientos.getfecha_vence()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vence = '"+Funciones2.getStringPostgresDate(this.cobrarlistadosmovimientos.getfecha_vence())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadosMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionCobrarListadosMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.getcobrarlistadosmovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadosmovimientos==null) {
						this.cobrarlistadosmovimientos = new CobrarListadosMovimientos();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.cobrarlistadosmovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
				}

				if(this.cobrarlistadosmovimientos.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.cobrarlistadosmovimientos.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadosMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_comprobanteCobrarListadosMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.getcobrarlistadosmovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadosmovimientos==null) {
						this.cobrarlistadosmovimientos = new CobrarListadosMovimientos();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.cobrarlistadosmovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
				}

				if(this.cobrarlistadosmovimientos.getnumero_comprobante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_comprobante like '%"+this.cobrarlistadosmovimientos.getnumero_comprobante()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadosMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_facturaCobrarListadosMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.getcobrarlistadosmovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadosmovimientos==null) {
						this.cobrarlistadosmovimientos = new CobrarListadosMovimientos();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.cobrarlistadosmovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
				}

				if(this.cobrarlistadosmovimientos.getnumero_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_factura like '%"+this.cobrarlistadosmovimientos.getnumero_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadosMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_mone_localCobrarListadosMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.getcobrarlistadosmovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadosmovimientos==null) {
						this.cobrarlistadosmovimientos = new CobrarListadosMovimientos();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.cobrarlistadosmovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
				}

				if(this.cobrarlistadosmovimientos.getdebito_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_mone_local = "+this.cobrarlistadosmovimientos.getdebito_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadosMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_mone_localCobrarListadosMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.getcobrarlistadosmovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadosmovimientos==null) {
						this.cobrarlistadosmovimientos = new CobrarListadosMovimientos();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.cobrarlistadosmovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
				}

				if(this.cobrarlistadosmovimientos.getcredito_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_mone_local = "+this.cobrarlistadosmovimientos.getcredito_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadosMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionCobrarListadosMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.getcobrarlistadosmovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadosmovimientos==null) {
						this.cobrarlistadosmovimientos = new CobrarListadosMovimientos();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.cobrarlistadosmovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);
				}

				if(this.cobrarlistadosmovimientos.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.cobrarlistadosmovimientos.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadosMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaCobrarListadosMovimientosCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarListadosMovimientos(false,false);

			this.getCobrarListadosMovimientossBusquedaCobrarListadosMovimientos();

			this.inicializarActualizarBindingCobrarListadosMovimientos(false);

			//if(CobrarListadosMovimientosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarListadosMovimientos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCobrarListadosMovimientosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarListadosMovimientos(false,false);

			this.getCobrarListadosMovimientossFK_IdEmpresa();

			this.inicializarActualizarBindingCobrarListadosMovimientos(false);

			//if(CobrarListadosMovimientosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarListadosMovimientos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadosmovimientosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCobrarListadosMovimientos() {
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.setVisible(false);	    			
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.dispose();
			this.jInternalFrameDetalleFormCobrarListadosMovimientos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCobrarListadosMovimientos!=null) {
			this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.dispose();
			this.jInternalFrameReporteDinamicoCobrarListadosMovimientos=null;
		}
		
		if(this.jInternalFrameImportacionCobrarListadosMovimientos!=null) {
			this.jInternalFrameImportacionCobrarListadosMovimientos.setVisible(false);	    			
			this.jInternalFrameImportacionCobrarListadosMovimientos.dispose();
			this.jInternalFrameImportacionCobrarListadosMovimientos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCobrarListadosMovimientos();
			
			CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
			
			
			if(sTipo.equals("NuevoCobrarListadosMovimientos")) {
				jButtonNuevoCobrarListadosMovimientosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCobrarListadosMovimientos")) {
				jButtonDuplicarCobrarListadosMovimientosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCobrarListadosMovimientos")) {
				jButtonCopiarCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("VerFormCobrarListadosMovimientos")) {
				jButtonVerFormCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCobrarListadosMovimientos")) {
				jButtonNuevoCobrarListadosMovimientosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCobrarListadosMovimientos")) {
				jButtonDuplicarCobrarListadosMovimientosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCobrarListadosMovimientos")) {
				jButtonNuevoCobrarListadosMovimientosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCobrarListadosMovimientos")) {
				jButtonDuplicarCobrarListadosMovimientosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCobrarListadosMovimientos")) {
				jButtonNuevoCobrarListadosMovimientosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCobrarListadosMovimientos")) {
				jButtonNuevoCobrarListadosMovimientosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCobrarListadosMovimientos")) {
				jButtonNuevoCobrarListadosMovimientosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCobrarListadosMovimientos")) {
				jButtonModificarCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCobrarListadosMovimientos")) {
				jButtonModificarCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCobrarListadosMovimientos")) {
				jButtonModificarCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCobrarListadosMovimientos")) {
				jButtonActualizarCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCobrarListadosMovimientos")) {
				jButtonActualizarCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCobrarListadosMovimientos")) {
				jButtonActualizarCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("EliminarCobrarListadosMovimientos")) {
				jButtonEliminarCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCobrarListadosMovimientos")) {
				jButtonEliminarCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCobrarListadosMovimientos")) {
				jButtonEliminarCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("CancelarCobrarListadosMovimientos")) {
				jButtonCancelarCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCobrarListadosMovimientos")) {
				jButtonCancelarCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCobrarListadosMovimientos")) {
				jButtonCancelarCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("CerrarCobrarListadosMovimientos")) {
				jButtonCerrarCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCobrarListadosMovimientos")) {
				jButtonCerrarCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCobrarListadosMovimientos")) {
				jButtonCerrarCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCobrarListadosMovimientos")) {
				jButtonMostrarOcultarCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCobrarListadosMovimientos")) {
				jButtonCancelarCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCobrarListadosMovimientos")) {
				jButtonGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCobrarListadosMovimientos")) {
				jButtonGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCobrarListadosMovimientos")) {
				jButtonCopiarCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCobrarListadosMovimientos")) {
				jButtonVerFormCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCobrarListadosMovimientos")) {
				jButtonGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCobrarListadosMovimientos")) {
				jButtonCopiarCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCobrarListadosMovimientos")) {
				jButtonVerFormCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCobrarListadosMovimientos")) {
				jButtonGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCobrarListadosMovimientos")) {
				jButtonGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCobrarListadosMovimientos")) {
				jButtonGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCobrarListadosMovimientos")) {
				jButtonRecargarInformacionCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCobrarListadosMovimientos")) {
				jButtonRecargarInformacionCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCobrarListadosMovimientos")) {
				jButtonRecargarInformacionCobrarListadosMovimientosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCobrarListadosMovimientos")) {
				jButtonAnterioresCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCobrarListadosMovimientos")) {
				jButtonAnterioresCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCobrarListadosMovimientos")) {
				jButtonAnterioresCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCobrarListadosMovimientos")) {
				jButtonSiguientesCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCobrarListadosMovimientos")) {
				jButtonSiguientesCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCobrarListadosMovimientos")) {
				jButtonSiguientesCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCobrarListadosMovimientos") || sTipo.equals("MenuItemDetalleAbrirOrderByCobrarListadosMovimientos")) {
				jButtonAbrirOrderByCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCobrarListadosMovimientos") || sTipo.equals("MenuItemDetalleMostrarOcultarCobrarListadosMovimientos")) {
				jButtonMostrarOcultarCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarListadosMovimientos")) {
				jButtonNuevoGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCobrarListadosMovimientos")) {
				jButtonNuevoGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCobrarListadosMovimientos")) {
				jButtonNuevoGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCobrarListadosMovimientos")) {
				jButtonCerrarReporteDinamicoCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCobrarListadosMovimientos")) {
				jButtonGenerarReporteDinamicoCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCobrarListadosMovimientos")) {
				
				jButtonGenerarExcelReporteDinamicoCobrarListadosMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCobrarListadosMovimientos")) {
				jButtonCerrarImportacionCobrarListadosMovimientosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCobrarListadosMovimientos")) {
				
				jButtonGenerarImportacionCobrarListadosMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCobrarListadosMovimientos")) {
				
				jButtonAbrirImportacionCobrarListadosMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCobrarListadosMovimientos")) {
				jComboBoxTiposAccionesCobrarListadosMovimientosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCobrarListadosMovimientos")) {
				jComboBoxTiposRelacionesCobrarListadosMovimientosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCobrarListadosMovimientos")) {
				jComboBoxTiposAccionesCobrarListadosMovimientosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCobrarListadosMovimientos")) {
				
				jComboBoxTiposSeleccionarCobrarListadosMovimientosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCobrarListadosMovimientos")) {
				jTextFieldValorCampoGeneralCobrarListadosMovimientosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCobrarListadosMovimientos")) {
				jButtonAbrirOrderByCobrarListadosMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCobrarListadosMovimientos")) {
				jButtonAbrirOrderByCobrarListadosMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCobrarListadosMovimientos")) {
				jButtonCerrarOrderByCobrarListadosMovimientosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarListadosMovimientosBusqueda")) {
				this.jButtonidCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarListadosMovimientosUpdate")) {
				this.jButtonid_empresaCobrarListadosMovimientosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarListadosMovimientosBusqueda")) {
				this.jButtonid_empresaCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeCobrarListadosMovimientosBusqueda")) {
				this.jButtonfecha_emision_desdeCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaCobrarListadosMovimientosBusqueda")) {
				this.jButtonfecha_emision_hastaCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarListadosMovimientosBusqueda")) {
				this.jButtoncodigoCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoCobrarListadosMovimientosBusqueda")) {
				this.jButtonnombre_completoCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_transaccionCobrarListadosMovimientosBusqueda")) {
				this.jButtonnombre_transaccionCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_venceCobrarListadosMovimientosBusqueda")) {
				this.jButtonfecha_venceCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionCobrarListadosMovimientosBusqueda")) {
				this.jButtonfecha_emisionCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteCobrarListadosMovimientosBusqueda")) {
				this.jButtonnumero_comprobanteCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaCobrarListadosMovimientosBusqueda")) {
				this.jButtonnumero_facturaCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_localCobrarListadosMovimientosBusqueda")) {
				this.jButtondebito_mone_localCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_localCobrarListadosMovimientosBusqueda")) {
				this.jButtoncredito_mone_localCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionCobrarListadosMovimientosBusqueda")) {
				this.jButtondescripcionCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaCobrarListadosMovimientosCobrarListadosMovimientos")) {
				this.jButtonBusquedaCobrarListadosMovimientosCobrarListadosMovimientosActionPerformed(evt);
			}
			
			;
			
			
			CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCobrarListadosMovimientos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarListadosMovimientosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadosmovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadosmovimientos);
				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
				
				


				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarListadosMovimientos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadosMovimientos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CobrarListadosMovimientos cobrarlistadosmovimientosLocal=null;
			
			if(!this.getEsControlTabla()) {
				cobrarlistadosmovimientosLocal=this.cobrarlistadosmovimientos;
			} else {
				cobrarlistadosmovimientosLocal=this.cobrarlistadosmovimientosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadosmovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadosmovimientos);
				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
							
				
				


				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarListadosMovimientos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadosMovimientos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarListadosMovimientosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosAnterior =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarlistadosmovimientosAnterior =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
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
			
			CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
			
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
			
			


			
			CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarListadosMovimientosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadosmovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadosmovimientos);
				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
								
						
				


				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarListadosMovimientos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadosMovimientos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadosmovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadosmovimientos);
				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
								
				
				


				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarListadosMovimientos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadosMovimientos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarListadosMovimientosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosAnterior =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarlistadosmovimientosAnterior =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadosmovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadosmovimientos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarListadosMovimientosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosAnterior =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarlistadosmovimientosAnterior =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarListadosMovimientosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadosmovimientos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadosmovimientos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadosmovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadosmovimientos);
				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
							
				
				


				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarListadosMovimientos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadosMovimientos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarListadosMovimientosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadosmovimientosAnterior =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarlistadosmovimientosAnterior =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
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
			
			CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
			
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
			
			


			
			CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarListadosMovimientosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadosmovimientos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadosmovimientos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadosmovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadosmovimientos);
				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
								
				
				


				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarListadosMovimientos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadosMovimientos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarListadosMovimientosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosAnterior =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarlistadosmovimientosAnterior =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarListadosMovimientosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadosmovimientos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadosmovimientos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarListadosMovimientosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadosmovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadosmovimientos);
				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCobrarListadosMovimientos")) {
					jCheckBoxSeleccionarTodosCobrarListadosMovimientosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCobrarListadosMovimientos")) {
					jCheckBoxSeleccionadosCobrarListadosMovimientosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCobrarListadosMovimientos")) {
					
				}
				
				


				
				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarListadosMovimientos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadosMovimientos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadosmovimientos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadosmovimientos);
				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
												
				
				


				
				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarListadosMovimientos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadosMovimientos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarListadosMovimientosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadosmovimientosAnterior =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarlistadosmovimientosAnterior =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarListadosMovimientosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadosmovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadosmovimientos);
				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
				
				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
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
			
			CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
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
			
			


			
			CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarListadosMovimientosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadosmovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadosmovimientos);
				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarListadosMovimientos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadosMovimientos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadosmovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadosmovimientos);
				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
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
				
				


				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarListadosMovimientos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadosMovimientos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarListadosMovimientosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadosmovimientosAnterior =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarlistadosmovimientosAnterior =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCobrarListadosMovimientos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCobrarListadosMovimientosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCobrarListadosMovimientos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cobrarlistadosmovimientos =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cobrarlistadosmovimientos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCobrarListadosMovimientos")) {
				
				}
				
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCobrarListadosMovimientos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCobrarListadosMovimientos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCobrarListadosMovimientos")) {
			
			}
			
			CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCobrarListadosMovimientos();
			
			CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
			
			if(sTipo.equals("NuevoCobrarListadosMovimientos")) {
				jButtonNuevoCobrarListadosMovimientosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCobrarListadosMovimientos")) {
				jButtonDuplicarCobrarListadosMovimientosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCobrarListadosMovimientos")) {
				jButtonCopiarCobrarListadosMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCobrarListadosMovimientos")) {
				jButtonVerFormCobrarListadosMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCobrarListadosMovimientos")) {
				jButtonNuevoCobrarListadosMovimientosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCobrarListadosMovimientos")) {
				jButtonModificarCobrarListadosMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCobrarListadosMovimientos")) {
				jButtonActualizarCobrarListadosMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCobrarListadosMovimientos")) {
				jButtonEliminarCobrarListadosMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCobrarListadosMovimientos")) {
				jButtonGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCobrarListadosMovimientos")) {
				jButtonCancelarCobrarListadosMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCobrarListadosMovimientos")) {
				jButtonCerrarCobrarListadosMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCobrarListadosMovimientos")) {
				jButtonGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarListadosMovimientos")) {
				jButtonNuevoGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCobrarListadosMovimientos")) {
				jButtonAbrirOrderByCobrarListadosMovimientosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCobrarListadosMovimientos")) {
				jButtonRecargarInformacionCobrarListadosMovimientosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCobrarListadosMovimientos")) {
				jButtonAnterioresCobrarListadosMovimientosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCobrarListadosMovimientos")) {
				jButtonSiguientesCobrarListadosMovimientosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarListadosMovimientosBusqueda")) {
				this.jButtonidCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarListadosMovimientosUpdate")) {
				this.jButtonid_empresaCobrarListadosMovimientosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarListadosMovimientosBusqueda")) {
				this.jButtonid_empresaCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeCobrarListadosMovimientosBusqueda")) {
				this.jButtonfecha_emision_desdeCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaCobrarListadosMovimientosBusqueda")) {
				this.jButtonfecha_emision_hastaCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarListadosMovimientosBusqueda")) {
				this.jButtoncodigoCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoCobrarListadosMovimientosBusqueda")) {
				this.jButtonnombre_completoCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_transaccionCobrarListadosMovimientosBusqueda")) {
				this.jButtonnombre_transaccionCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_venceCobrarListadosMovimientosBusqueda")) {
				this.jButtonfecha_venceCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionCobrarListadosMovimientosBusqueda")) {
				this.jButtonfecha_emisionCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteCobrarListadosMovimientosBusqueda")) {
				this.jButtonnumero_comprobanteCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaCobrarListadosMovimientosBusqueda")) {
				this.jButtonnumero_facturaCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_localCobrarListadosMovimientosBusqueda")) {
				this.jButtondebito_mone_localCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_localCobrarListadosMovimientosBusqueda")) {
				this.jButtoncredito_mone_localCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionCobrarListadosMovimientosBusqueda")) {
				this.jButtondescripcionCobrarListadosMovimientosBusquedaActionPerformed(evt);
			}
			
			CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCobrarListadosMovimientos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCobrarListadosMovimientos")) {
				closingInternalFrameCobrarListadosMovimientos();
				
			} else if(sTipo.equals("jButtonCancelarCobrarListadosMovimientos")) {
				JInternalFrameBase jInternalFrameDetalleFormCobrarListadosMovimientos = (JInternalFrameBase)evt.getSource();
	            	
	            CobrarListadosMovimientosBeanSwingJInternalFrame jInternalFrameParent=(CobrarListadosMovimientosBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarListadosMovimientos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCobrarListadosMovimientosActionPerformed(null);
			}
			
			CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarlistadosmovimientos,new Object(),this.cobrarlistadosmovimientosParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCobrarListadosMovimientos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCobrarListadosMovimientos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCobrarListadosMovimientos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cobrarlistadosmovimientos)) {
			if(!esControlTabla) {
				if(CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.cobrarlistadosmovimientos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);			
				}
				
				if(this.cobrarlistadosmovimientosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCobrarListadosMovimientos(this.cobrarlistadosmovimientos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCobrarListadosMovimientos(this.cobrarlistadosmovimientosReturnGeneral,this.cobrarlistadosmovimientosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cobrarlistadosmovimientosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCobrarListadosMovimientos(classes,this.cobrarlistadosmovimientosReturnGeneral,this.cobrarlistadosmovimientosBean,false);
					}
						
					if(this.cobrarlistadosmovimientosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCobrarListadosMovimientos(this.cobrarlistadosmovimientosReturnGeneral.getCobrarListadosMovimientos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCobrarListadosMovimientos(this.cobrarlistadosmovimientosReturnGeneral.getCobrarListadosMovimientos());	
					}
						
					if(this.cobrarlistadosmovimientosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCobrarListadosMovimientos(this.cobrarlistadosmovimientosReturnGeneral.getCobrarListadosMovimientos(),classes);//this.cobrarlistadosmovimientosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCobrarListadosMovimientos(this.cobrarlistadosmovimientos,classes);//this.cobrarlistadosmovimientosBean);									
				}
			
				if(CobrarListadosMovimientosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCobrarListadosMovimientos(this.cobrarlistadosmovimientos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadosMovimientos(this.cobrarlistadosmovimientos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cobrarlistadosmovimientosAnterior!=null) {
						this.cobrarlistadosmovimientos=this.cobrarlistadosmovimientosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cobrarlistadosmovimientosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cobrarlistadosmovimientosReturnGeneral.getCobrarListadosMovimientos(),cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cobrarlistadosmovimientosReturnGeneral.getCobrarListadosMovimientos(),this.cobrarlistadosmovimientoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCobrarListadosMovimientos.repaint();
				
				//((AbstractTableModel) this.jTableDatosCobrarListadosMovimientos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCobrarListadosMovimientos();
			}
		}
	}
	
	public void actualizarVisualTableDatosCobrarListadosMovimientos() throws Exception {
		
		CobrarListadosMovimientosModel cobrarlistadosmovimientosModel=(CobrarListadosMovimientosModel)this.jTableDatosCobrarListadosMovimientos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarlistadosmovimientosModel.cobrarlistadosmovimientoss=this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cobrarlistadosmovimientosModel.cobrarlistadosmovimientoss=this.cobrarlistadosmovimientoss;
		}
		
		
		((CobrarListadosMovimientosModel) this.jTableDatosCobrarListadosMovimientos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCobrarListadosMovimientos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcobrarlistadosmovimientosAnterior(),this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcobrarlistadosmovimientosAnterior(),this.cobrarlistadosmovimientoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCobrarListadosMovimientos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCobrarListadosMovimientos(CobrarListadosMovimientos cobrarlistadosmovimientos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
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
										
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarlistadosmovimientos,new Object(),generalEntityParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CobrarListadosMovimientosConstantesFunciones.getClassesRelationshipsOfCobrarListadosMovimientos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CobrarListadosMovimientosConstantesFunciones.getClassesRelationshipsFromStringsOfCobrarListadosMovimientos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCobrarListadosMovimientos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarlistadosmovimientos,new Object(),generalEntityParameterGeneral,this.cobrarlistadosmovimientosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCobrarListadosMovimientos(CobrarListadosMovimientosBean cobrarlistadosmovimientosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCobrarListadosMovimientos(ArrayList<Classe> classes,CobrarListadosMovimientosReturnGeneral cobrarlistadosmovimientosReturnGeneral,CobrarListadosMovimientosBean cobrarlistadosmovimientosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCobrarListadosMovimientos(CobrarListadosMovimientos cobrarlistadosmovimientos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cobrarlistadosmovimientos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCobrarListadosMovimientos = new CobrarListadosMovimientosDetalleFormJInternalFrame(jDesktopPane,this.cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones(),this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.setVisible(false);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.setSelected(false);						
		
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.cobrarlistadosmovimientosLogic=this.cobrarlistadosmovimientosLogic;
		
		this.cargarCombosFrameForeignKeyCobrarListadosMovimientos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarListadosMovimientos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarListadosMovimientos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCobrarListadosMovimientos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCobrarListadosMovimientos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarListadosMovimientos"));
		
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonModificarCobrarListadosMovimientos.addActionListener(new ButtonActionListener(this,"ModificarCobrarListadosMovimientos"));

		
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonModificarToolBarCobrarListadosMovimientos.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarListadosMovimientos"));
					
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jMenuItemModificarCobrarListadosMovimientos.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarListadosMovimientos"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonActualizarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"ActualizarCobrarListadosMovimientos"));
		
		
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonActualizarToolBarCobrarListadosMovimientos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarListadosMovimientos"));
						
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jMenuItemActualizarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarListadosMovimientos"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonEliminarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"EliminarCobrarListadosMovimientos"));
		
		
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonEliminarToolBarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarListadosMovimientos"));
								
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jMenuItemEliminarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarListadosMovimientos"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonCancelarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"CancelarCobrarListadosMovimientos"));
		
		
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonCancelarToolBarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarListadosMovimientos"));
					
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jMenuItemCancelarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarListadosMovimientos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jMenuItemDetalleCerrarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarListadosMovimientos"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonGuardarCambiosToolBarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarListadosMovimientos"));
		
		
		
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonGuardarCambiosToolBarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarListadosMovimientos"));
		
		
		
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarListadosMovimientos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonidCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarListadosMovimientosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonid_empresaCobrarListadosMovimientosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarListadosMovimientosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonid_empresaCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonfecha_emision_desdeCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonfecha_emision_hastaCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtoncodigoCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonnombre_completoCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonnombre_transaccionCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonfecha_venceCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonfecha_emisionCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonnumero_comprobanteCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonnumero_facturaCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtondebito_mone_localCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtoncredito_mone_localCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtondescripcionCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCobrarListadosMovimientosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTabbedPaneRelacionesCobrarListadosMovimientos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarListadosMovimientos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCobrarListadosMovimientos"));
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarListadosMovimientos"));
		}
		
		this.jTableDatosCobrarListadosMovimientos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCobrarListadosMovimientos"));
		
		this.jTableDatosCobrarListadosMovimientos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCobrarListadosMovimientos"));
		
		this.jButtonNuevoCobrarListadosMovimientos.addActionListener(new ButtonActionListener(this,"NuevoCobrarListadosMovimientos"));
		
		this.jButtonDuplicarCobrarListadosMovimientos.addActionListener(new ButtonActionListener(this,"DuplicarCobrarListadosMovimientos"));
		
		this.jButtonCopiarCobrarListadosMovimientos.addActionListener(new ButtonActionListener(this,"CopiarCobrarListadosMovimientos"));
		
		this.jButtonVerFormCobrarListadosMovimientos.addActionListener(new ButtonActionListener(this,"VerFormCobrarListadosMovimientos"));
		
		
		this.jButtonNuevoToolBarCobrarListadosMovimientos.addActionListener(new ButtonActionListener(this,"NuevoToolBarCobrarListadosMovimientos"));
			
		this.jButtonDuplicarToolBarCobrarListadosMovimientos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCobrarListadosMovimientos"));
			
		this.jMenuItemNuevoCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCobrarListadosMovimientos"));
			
		this.jMenuItemDuplicarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCobrarListadosMovimientos"));		
		
		
		this.jButtonNuevoRelacionesCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCobrarListadosMovimientos"));
		
		
		this.jButtonNuevoRelacionesToolBarCobrarListadosMovimientos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCobrarListadosMovimientos"));
			
		this.jMenuItemNuevoRelacionesCobrarListadosMovimientos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCobrarListadosMovimientos"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonModificarCobrarListadosMovimientos.addActionListener(new ButtonActionListener(this,"ModificarCobrarListadosMovimientos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonModificarToolBarCobrarListadosMovimientos.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarListadosMovimientos"));
			
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jMenuItemModificarCobrarListadosMovimientos.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarListadosMovimientos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonActualizarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"ActualizarCobrarListadosMovimientos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonActualizarToolBarCobrarListadosMovimientos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarListadosMovimientos"));
				
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jMenuItemActualizarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarListadosMovimientos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonEliminarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"EliminarCobrarListadosMovimientos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonEliminarToolBarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarListadosMovimientos"));
						
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jMenuItemEliminarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarListadosMovimientos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonCancelarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"CancelarCobrarListadosMovimientos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonCancelarToolBarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarListadosMovimientos"));
			
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jMenuItemCancelarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarListadosMovimientos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCobrarListadosMovimientos"));		
		
		
		this.jButtonCerrarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"CerrarCobrarListadosMovimientos"));
		
		
		this.jButtonCerrarToolBarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"CerrarToolBarCobrarListadosMovimientos"));
			
		this.jMenuItemCerrarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCobrarListadosMovimientos"));
			
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jMenuItemDetalleCerrarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarListadosMovimientos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonGuardarCambiosCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"GuardarCambiosCobrarListadosMovimientos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonGuardarCambiosToolBarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarListadosMovimientos"));
		}
		
		this.jButtonCopiarToolBarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"CopiarToolBarCobrarListadosMovimientos"));
			
		this.jButtonVerFormToolBarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"VerFormToolBarCobrarListadosMovimientos"));
		
		this.jMenuItemGuardarCambiosCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCobrarListadosMovimientos"));
			
		this.jMenuItemCopiarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCobrarListadosMovimientos"));		
		
		this.jMenuItemVerFormCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCobrarListadosMovimientos"));		
		
		
		this.jButtonGuardarCambiosTablaCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarListadosMovimientos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCobrarListadosMovimientos"));
			
		this.jMenuItemGuardarCambiosTablaCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarListadosMovimientos"));		
		
		
		
		this.jButtonRecargarInformacionCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"RecargarInformacionCobrarListadosMovimientos"));
					
		this.jButtonRecargarInformacionToolBarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCobrarListadosMovimientos"));
		
		this.jMenuItemRecargarInformacionCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCobrarListadosMovimientos"));		
		
		
		
		this.jButtonAnterioresCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"AnterioresCobrarListadosMovimientos"));
		
		
		this.jButtonAnterioresToolBarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCobrarListadosMovimientos"));
		
		this.jMenuItemAnterioresCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCobrarListadosMovimientos"));		
		
		
		this.jButtonSiguientesCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"SiguientesCobrarListadosMovimientos"));
		
		
		this.jButtonSiguientesToolBarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCobrarListadosMovimientos"));
			
		this.jMenuItemSiguientesCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCobrarListadosMovimientos"));
			
		this.jMenuItemAbrirOrderByCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCobrarListadosMovimientos"));
			
		this.jMenuItemMostrarOcultarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCobrarListadosMovimientos"));
			
		this.jMenuItemDetalleAbrirOrderByCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCobrarListadosMovimientos"));
			
		this.jMenuItemDetalleMostarOcultarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCobrarListadosMovimientos"));		
		
		
		this.jButtonNuevoGuardarCambiosCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCobrarListadosMovimientos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCobrarListadosMovimientos"));
			
		this.jMenuItemNuevoGuardarCambiosCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCobrarListadosMovimientos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCobrarListadosMovimientos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCobrarListadosMovimientos"));

		this.jCheckBoxSeleccionadosCobrarListadosMovimientos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCobrarListadosMovimientos"));
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarListadosMovimientos"));
		}
		
		
		this.jComboBoxTiposRelacionesCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"TiposRelacionesCobrarListadosMovimientos"));
			
		this.jComboBoxTiposAccionesCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"TiposAccionesCobrarListadosMovimientos"));
					
		this.jComboBoxTiposSeleccionarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCobrarListadosMovimientos"));
			
		this.jTextFieldValorCampoGeneralCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCobrarListadosMovimientos"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonidCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarListadosMovimientosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonid_empresaCobrarListadosMovimientosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarListadosMovimientosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonid_empresaCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonfecha_emision_desdeCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonfecha_emision_hastaCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtoncodigoCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonnombre_completoCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonnombre_transaccionCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonfecha_venceCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonfecha_emisionCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonnumero_comprobanteCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonnumero_facturaCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtondebito_mone_localCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtoncredito_mone_localCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtondescripcionCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCobrarListadosMovimientosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.addActionListener(new ButtonActionListener(this,"BusquedaCobrarListadosMovimientosCobrarListadosMovimientos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCobrarListadosMovimientos!=null) {
				this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarListadosMovimientos"));
				this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarListadosMovimientos"));
				this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarListadosMovimientos"));
			}
			
			//this.jButtonCerrarReporteDinamicoCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarListadosMovimientos"));				
			//this.jButtonGenerarReporteDinamicoCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarListadosMovimientos"));
			//this.jButtonGenerarExcelReporteDinamicoCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarListadosMovimientos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCobrarListadosMovimientos!=null) {
				this.jInternalFrameImportacionCobrarListadosMovimientos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarListadosMovimientos"));
				this.jInternalFrameImportacionCobrarListadosMovimientos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarListadosMovimientos"));
				this.jInternalFrameImportacionCobrarListadosMovimientos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarListadosMovimientos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"AbrirOrderByCobrarListadosMovimientos"));
			
			this.jButtonAbrirOrderByToolBarCobrarListadosMovimientos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCobrarListadosMovimientos"));			
			
			if(this.jInternalFrameOrderByCobrarListadosMovimientos!=null) {
				this.jInternalFrameOrderByCobrarListadosMovimientos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarListadosMovimientos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTabbedPaneRelacionesCobrarListadosMovimientos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarListadosMovimientos"));
		
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
            		closingInternalFrameCobrarListadosMovimientos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCobrarListadosMovimientos = (JInternalFrameBase)event.getSource();
	            	
	            CobrarListadosMovimientosBeanSwingJInternalFrame jInternalFrameParent=(CobrarListadosMovimientosBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarListadosMovimientos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCobrarListadosMovimientosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCobrarListadosMovimientos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCobrarListadosMovimientosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCobrarListadosMovimientos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCobrarListadosMovimientos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarListadosMovimientosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarListadosMovimientosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarListadosMovimientosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCobrarListadosMovimientos";
		inputMap = this.jButtonNuevoCobrarListadosMovimientos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCobrarListadosMovimientos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarListadosMovimientosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarListadosMovimientosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarListadosMovimientosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarListadosMovimientosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCobrarListadosMovimientos";
		inputMap = this.jButtonNuevoRelacionesCobrarListadosMovimientos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCobrarListadosMovimientos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarListadosMovimientosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCobrarListadosMovimientos";
		inputMap = this.jButtonModificarCobrarListadosMovimientos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCobrarListadosMovimientos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCobrarListadosMovimientosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCobrarListadosMovimientos";
		inputMap = this.jButtonActualizarCobrarListadosMovimientos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCobrarListadosMovimientos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCobrarListadosMovimientosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCobrarListadosMovimientos";
		inputMap = this.jButtonEliminarCobrarListadosMovimientos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCobrarListadosMovimientos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCobrarListadosMovimientosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCobrarListadosMovimientos";
		inputMap = this.jButtonCancelarCobrarListadosMovimientos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCobrarListadosMovimientos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCobrarListadosMovimientosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCobrarListadosMovimientos";
		inputMap = this.jButtonCerrarCobrarListadosMovimientos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCobrarListadosMovimientos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCobrarListadosMovimientosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonGuardarCambiosCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCobrarListadosMovimientos";
		inputMap = this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonGuardarCambiosCobrarListadosMovimientos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonGuardarCambiosCobrarListadosMovimientos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCobrarListadosMovimientos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCobrarListadosMovimientosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCobrarListadosMovimientos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCobrarListadosMovimientosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCobrarListadosMovimientos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCobrarListadosMovimientosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCobrarListadosMovimientos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCobrarListadosMovimientosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonidCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarListadosMovimientosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonid_empresaCobrarListadosMovimientosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarListadosMovimientosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonid_empresaCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonfecha_emision_desdeCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonfecha_emision_hastaCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtoncodigoCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonnombre_completoCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonnombre_transaccionCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonfecha_venceCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonfecha_emisionCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonnumero_comprobanteCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtonnumero_facturaCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtondebito_mone_localCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtoncredito_mone_localCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localCobrarListadosMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jButtondescripcionCobrarListadosMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCobrarListadosMovimientosBusqueda"));
		
		
		this.jButtonBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.addActionListener(new ButtonActionListener(this,"BusquedaCobrarListadosMovimientosCobrarListadosMovimientos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCobrarListadosMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCobrarListadosMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCobrarListadosMovimientosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCobrarListadosMovimientos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCobrarListadosMovimientos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss()) {
					cobrarlistadosmovimientosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:cobrarlistadosmovimientoss) {
					cobrarlistadosmovimientosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCobrarListadosMovimientosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarListadosMovimientos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss()) {
						cobrarlistadosmovimientosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:cobrarlistadosmovimientoss) {
						cobrarlistadosmovimientosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:cobrarlistadosmovimientoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarListadosMovimientos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarListadosMovimientos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarListadosMovimientos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadosMovimientos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCobrarListadosMovimientosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarListadosMovimientos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCobrarListadosMovimientos.getSelectedRows();
			
			CobrarListadosMovimientos cobrarlistadosmovimientosLocal=new CobrarListadosMovimientos();
			
			//this.seleccionarTodosCobrarListadosMovimientos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cobrarlistadosmovimientosLocal =(CobrarListadosMovimientos) this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cobrarlistadosmovimientosLocal =(CobrarListadosMovimientos) this.cobrarlistadosmovimientoss.toArray()[this.jTableDatosCobrarListadosMovimientos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cobrarlistadosmovimientosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss()) {
						cobrarlistadosmovimientosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:cobrarlistadosmovimientoss) {
						cobrarlistadosmovimientosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCobrarListadosMovimientos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarListadosMovimientos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarListadosMovimientos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadosMovimientos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCobrarListadosMovimientosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCobrarListadosMovimientosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCobrarListadosMovimientosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCobrarListadosMovimientos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCobrarListadosMovimientos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss()) {
				
						if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							cobrarlistadosmovimientosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							cobrarlistadosmovimientosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarlistadosmovimientosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							cobrarlistadosmovimientosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
							existe=true;
							cobrarlistadosmovimientosAux.setnombre_transaccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAVENCE)) {
							existe=true;
							cobrarlistadosmovimientosAux.setfecha_vence(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							cobrarlistadosmovimientosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							cobrarlistadosmovimientosAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							cobrarlistadosmovimientosAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL)) {
							existe=true;
							cobrarlistadosmovimientosAux.setdebito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL)) {
							existe=true;
							cobrarlistadosmovimientosAux.setcredito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							cobrarlistadosmovimientosAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:cobrarlistadosmovimientoss) {
					
						if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							cobrarlistadosmovimientosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							cobrarlistadosmovimientosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarlistadosmovimientosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							cobrarlistadosmovimientosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
							existe=true;
							cobrarlistadosmovimientosAux.setnombre_transaccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAVENCE)) {
							existe=true;
							cobrarlistadosmovimientosAux.setfecha_vence(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							cobrarlistadosmovimientosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							cobrarlistadosmovimientosAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							cobrarlistadosmovimientosAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL)) {
							existe=true;
							cobrarlistadosmovimientosAux.setdebito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL)) {
							existe=true;
							cobrarlistadosmovimientosAux.setcredito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							cobrarlistadosmovimientosAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarListadosMovimientos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCobrarListadosMovimientosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCobrarListadosMovimientos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCobrarListadosMovimientos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCobrarListadosMovimientos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCobrarListadosMovimientos) {				
					conSplash=true;//false;										
					
					//this.startProcessCobrarListadosMovimientos(conSplash);
				
					this.generarReporteCobrarListadosMovimientossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarListadosMovimientos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCobrarListadosMovimientossSeleccionados();
				//this.jComboBoxTiposAccionesCobrarListadosMovimientos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarListadosMovimientossSeleccionados(false);
				//this.jComboBoxTiposAccionesCobrarListadosMovimientos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarListadosMovimientossSeleccionados(true);
				//this.jComboBoxTiposAccionesCobrarListadosMovimientos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarListadosMovimientos();
				
				this.exportarCobrarListadosMovimientossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarListadosMovimientos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCobrarListadosMovimientoss();
				//this.importarCobrarListadosMovimientoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarListadosMovimientos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarListadosMovimientos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCobrarListadosMovimientossSeleccionados();
				//this.jComboBoxTiposAccionesCobrarListadosMovimientos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cobrar Listados Movimientos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCobrarListadosMovimientos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCobrarListadosMovimientos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCobrarListadosMovimientos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cobrar Listados Movimientos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarListadosMovimientos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos.setSelectedIndex(0);					
				}	
			} 			
			else if(CobrarListadosMovimientosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCobrarListadosMovimientos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCobrarListadosMovimientos(conSplash);
					
						//this.actualizarParametrosGeneralCobrarListadosMovimientos();
						
						this.generarReporteProcesoAccionCobrarListadosMovimientossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCobrarListadosMovimientos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cobrar Listados MovimientosES SELECCIONADOS?", "MANTENIMIENTO DE Cobrar Listados Movimientos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCobrarListadosMovimientos();
				
						this.actualizarParametrosGeneralCobrarListadosMovimientos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cobrarlistadosmovimientosReturnGeneral=cobrarlistadosmovimientosLogic.procesarAccionCobrarListadosMovimientossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss(),this.cobrarlistadosmovimientosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCobrarListadosMovimientosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarListadosMovimientos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCobrarListadosMovimientos();
					
					CobrarListadosMovimientosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCobrarListadosMovimientosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarListadosMovimientos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCobrarListadosMovimientos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCobrarListadosMovimientosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCobrarListadosMovimientos();
			
			if(this.jInternalFrameDetalleFormCobrarListadosMovimientos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CobrarListadosMovimientos> cobrarlistadosmovimientossSeleccionados=new ArrayList<CobrarListadosMovimientos>();		
			CobrarListadosMovimientos cobrarlistadosmovimientos=new CobrarListadosMovimientos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCobrarListadosMovimientos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCobrarListadosMovimientos.getSelectedItem();
			
			
			
			
			cobrarlistadosmovimientossSeleccionados=this.getCobrarListadosMovimientossSeleccionados(true);
			//this.sTipoAccion;
			
			if(cobrarlistadosmovimientossSeleccionados.size()==1) {
				for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:cobrarlistadosmovimientossSeleccionados) {
					cobrarlistadosmovimientos=cobrarlistadosmovimientosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCobrarListadosMovimientos();
			
      		//this.finishProcessCobrarListadosMovimientos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCobrarListadosMovimientosReturnGeneral() throws Exception {
		if(this.cobrarlistadosmovimientosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cobrarlistadosmovimientosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cobrarlistadosmovimientosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cobrarlistadosmovimientosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cobrarlistadosmovimientosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cobrarlistadosmovimientosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCobrarListadosMovimientos(false);
		}
		
		if(this.cobrarlistadosmovimientosReturnGeneral.getConRetornoLista() || this.cobrarlistadosmovimientosReturnGeneral.getConRetornoObjeto()) {
			if(this.cobrarlistadosmovimientosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cobrarlistadosmovimientosLogic.setCobrarListadosMovimientoss(this.cobrarlistadosmovimientosReturnGeneral.getCobrarListadosMovimientoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingCobrarListadosMovimientos(false);
		}
	}
	
	public void actualizarParametrosGeneralCobrarListadosMovimientos() throws Exception {
		
		
	}
	
	public ArrayList<CobrarListadosMovimientos> getCobrarListadosMovimientossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CobrarListadosMovimientos> cobrarlistadosmovimientossSeleccionados=new ArrayList<CobrarListadosMovimientos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCobrarListadosMovimientos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss()) {
					if(cobrarlistadosmovimientosAux.getIsSelected()) {
						cobrarlistadosmovimientossSeleccionados.add(cobrarlistadosmovimientosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:this.cobrarlistadosmovimientoss) {
					if(cobrarlistadosmovimientosAux.getIsSelected()) {
						cobrarlistadosmovimientossSeleccionados.add(cobrarlistadosmovimientosAux);				
					}
				}
			}
			
			if(cobrarlistadosmovimientossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cobrarlistadosmovimientossSeleccionados.addAll(this.cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cobrarlistadosmovimientossSeleccionados.addAll(this.cobrarlistadosmovimientoss);				
					}
				}
			}
		} else {
			cobrarlistadosmovimientossSeleccionados.add(this.cobrarlistadosmovimientos);
		}
		
		return cobrarlistadosmovimientossSeleccionados;
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
	
	public void generarReporteCobrarListadosMovimientossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			//SI ES GROUP REPORTE NO ES NORMAL, NORMAL ES AGRUPADO
			this.generarReporteGroupReporteCobrarListadosMovimientossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCobrarListadosMovimientossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarListadosMovimientossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarListadosMovimientossSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("LISTA_COLUMNAS")) {
			//SI ES GROUP REPORTE LISTA_COLUMNAS ES NORMAL
			existe=true;
			this.generarReporteNormalCobrarListadosMovimientossSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cobrar Listados Movimientos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCobrarListadosMovimientossSeleccionados() throws Exception {
		ArrayList<CobrarListadosMovimientos> cobrarlistadosmovimientossSeleccionados=new ArrayList<CobrarListadosMovimientos>();		
		
		cobrarlistadosmovimientossSeleccionados=this.getCobrarListadosMovimientossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCobrarListadosMovimientoss("Todos",cobrarlistadosmovimientossSeleccionados);
		
	}	
	
	public void generarReporteNormalCobrarListadosMovimientossSeleccionados() throws Exception {
		ArrayList<CobrarListadosMovimientos> cobrarlistadosmovimientossSeleccionados=new ArrayList<CobrarListadosMovimientos>();		
		
		cobrarlistadosmovimientossSeleccionados=this.getCobrarListadosMovimientossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCobrarListadosMovimientoss("Todos",cobrarlistadosmovimientossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCobrarListadosMovimientossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CobrarListadosMovimientos> cobrarlistadosmovimientossSeleccionados=new ArrayList<CobrarListadosMovimientos>();
		
		cobrarlistadosmovimientossSeleccionados=this.getCobrarListadosMovimientossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCobrarListadosMovimientoss("Todos",cobrarlistadosmovimientossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	public void generarReporteGroupReporteCobrarListadosMovimientossSeleccionados() throws Exception {
		ArrayList<CobrarListadosMovimientos> cobrarlistadosmovimientossSeleccionados=new ArrayList<CobrarListadosMovimientos>();		
		
		cobrarlistadosmovimientossSeleccionados=this.getCobrarListadosMovimientossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		//GROUP REPORTE
		this.sTipoReporteExtra="GroupReporte";
			
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCobrarListadosMovimientoss("Todos",cobrarlistadosmovimientossSeleccionados);
	}	
	
	public void mostrarReporteDinamicoCobrarListadosMovimientossSeleccionados() throws Exception {
		ArrayList<CobrarListadosMovimientos> cobrarlistadosmovimientossSeleccionados=new ArrayList<CobrarListadosMovimientos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCobrarListadosMovimientos();
		
		
		cobrarlistadosmovimientossSeleccionados=this.getCobrarListadosMovimientossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCobrarListadosMovimientos();
		
		
		//this.generarReporteCobrarListadosMovimientoss("Todos",cobrarlistadosmovimientossSeleccionados ,cobrarlistadosmovimientosImplementable,cobrarlistadosmovimientosImplementableHome);
	}
	
	public void mostrarImportacionCobrarListadosMovimientoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCobrarListadosMovimientos();
		
		this.abrirFrameImportacionCobrarListadosMovimientos();		
		
			
		//this.generarReporteCobrarListadosMovimientoss("Todos",cobrarlistadosmovimientossSeleccionados ,cobrarlistadosmovimientosImplementable,cobrarlistadosmovimientosImplementableHome);
	}
	
	public void importarCobrarListadosMovimientoss() throws Exception {		
	
	}
	
	public void exportarCobrarListadosMovimientossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCobrarListadosMovimientossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCobrarListadosMovimientossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCobrarListadosMovimientossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cobrar Listados Movimientos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCobrarListadosMovimientossSeleccionados() throws Exception {
		ArrayList<CobrarListadosMovimientos> cobrarlistadosmovimientossSeleccionados=new ArrayList<CobrarListadosMovimientos>();		
		
		cobrarlistadosmovimientossSeleccionados=this.getCobrarListadosMovimientossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarlistadosmovimientos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCobrarListadosMovimientos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:cobrarlistadosmovimientossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCobrarListadosMovimientos(cobrarlistadosmovimientosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cobrarlistadosmovimientosAux.setsDetalleGeneralEntityReporte(cobrarlistadosmovimientosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Listados Movimientos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCobrarListadosMovimientos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CobrarListadosMovimientosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadosMovimientosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadosMovimientosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadosMovimientosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAVENCE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadosMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadosMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadosMovimientosConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCobrarListadosMovimientos(CobrarListadosMovimientos cobrarlistadosmovimientos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cobrarlistadosmovimientos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadosmovimientos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadosmovimientos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadosmovimientos.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadosmovimientos.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadosmovimientos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadosmovimientos.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadosmovimientos.getnombre_transaccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadosmovimientos.getfecha_vence().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadosmovimientos.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadosmovimientos.getnumero_comprobante();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadosmovimientos.getnumero_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadosmovimientos.getdebito_mone_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadosmovimientos.getcredito_mone_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadosmovimientos.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCobrarListadosMovimientossSeleccionados() throws Exception {
		ArrayList<CobrarListadosMovimientos> cobrarlistadosmovimientossSeleccionados=new ArrayList<CobrarListadosMovimientos>();		
		
		cobrarlistadosmovimientossSeleccionados=this.getCobrarListadosMovimientossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarlistadosmovimientos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CobrarListadosMovimientoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCobrarListadosMovimientos(row);				
				iRow++;
			}				
			
			for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:cobrarlistadosmovimientossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCobrarListadosMovimientos(cobrarlistadosmovimientosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Listados Movimientos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCobrarListadosMovimientossSeleccionados() throws Exception {
		ArrayList<CobrarListadosMovimientos> cobrarlistadosmovimientossSeleccionados=new ArrayList<CobrarListadosMovimientos>();		
		
		cobrarlistadosmovimientossSeleccionados=this.getCobrarListadosMovimientossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarlistadosmovimientos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cobrarlistadosmovimientoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cobrarlistadosmovimientos");
			//elementRoot.appendChild(element);
		
			for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:cobrarlistadosmovimientossSeleccionados) {
				element = document.createElement("cobrarlistadosmovimientos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCobrarListadosMovimientos(cobrarlistadosmovimientosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Listados Movimientos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCobrarListadosMovimientos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAVENCE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadosMovimientosConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCobrarListadosMovimientos(CobrarListadosMovimientos cobrarlistadosmovimientos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadosmovimientos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadosmovimientos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadosmovimientos.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadosmovimientos.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadosmovimientos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadosmovimientos.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadosmovimientos.getnombre_transaccion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadosmovimientos.getfecha_vence());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadosmovimientos.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadosmovimientos.getnumero_comprobante());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadosmovimientos.getnumero_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadosmovimientos.getdebito_mone_local());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadosmovimientos.getcredito_mone_local());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadosmovimientos.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlCobrarListadosMovimientos(CobrarListadosMovimientos cobrarlistadosmovimientos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CobrarListadosMovimientosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cobrarlistadosmovimientos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CobrarListadosMovimientosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cobrarlistadosmovimientos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CobrarListadosMovimientosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cobrarlistadosmovimientos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementfecha_emision_desde = document.createElement(CobrarListadosMovimientosConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(cobrarlistadosmovimientos.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(CobrarListadosMovimientosConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(cobrarlistadosmovimientos.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementcodigo = document.createElement(CobrarListadosMovimientosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(cobrarlistadosmovimientos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_completo = document.createElement(CobrarListadosMovimientosConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(cobrarlistadosmovimientos.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementnombre_transaccion = document.createElement(CobrarListadosMovimientosConstantesFunciones.NOMBRETRANSACCION);
		elementnombre_transaccion.appendChild(document.createTextNode(cobrarlistadosmovimientos.getnombre_transaccion().trim()));
		element.appendChild(elementnombre_transaccion);

		Element elementfecha_vence = document.createElement(CobrarListadosMovimientosConstantesFunciones.FECHAVENCE);
		elementfecha_vence.appendChild(document.createTextNode(cobrarlistadosmovimientos.getfecha_vence().toString().trim()));
		element.appendChild(elementfecha_vence);

		Element elementfecha_emision = document.createElement(CobrarListadosMovimientosConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(cobrarlistadosmovimientos.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementnumero_comprobante = document.createElement(CobrarListadosMovimientosConstantesFunciones.NUMEROCOMPROBANTE);
		elementnumero_comprobante.appendChild(document.createTextNode(cobrarlistadosmovimientos.getnumero_comprobante().trim()));
		element.appendChild(elementnumero_comprobante);

		Element elementnumero_factura = document.createElement(CobrarListadosMovimientosConstantesFunciones.NUMEROFACTURA);
		elementnumero_factura.appendChild(document.createTextNode(cobrarlistadosmovimientos.getnumero_factura().trim()));
		element.appendChild(elementnumero_factura);

		Element elementdebito_mone_local = document.createElement(CobrarListadosMovimientosConstantesFunciones.DEBITOMONELOCAL);
		elementdebito_mone_local.appendChild(document.createTextNode(cobrarlistadosmovimientos.getdebito_mone_local().toString().trim()));
		element.appendChild(elementdebito_mone_local);

		Element elementcredito_mone_local = document.createElement(CobrarListadosMovimientosConstantesFunciones.CREDITOMONELOCAL);
		elementcredito_mone_local.appendChild(document.createTextNode(cobrarlistadosmovimientos.getcredito_mone_local().toString().trim()));
		element.appendChild(elementcredito_mone_local);

		Element elementdescripcion = document.createElement(CobrarListadosMovimientosConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(cobrarlistadosmovimientos.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoCobrarListadosMovimientossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CobrarListadosMovimientos> cobrarlistadosmovimientossSeleccionados=new ArrayList<CobrarListadosMovimientos>();
		
		cobrarlistadosmovimientossSeleccionados=this.getCobrarListadosMovimientossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCobrarListadosMovimientos(cobrarlistadosmovimientossSeleccionados);
		
		this.generarReporteCobrarListadosMovimientoss("Todos",cobrarlistadosmovimientossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCobrarListadosMovimientos(ArrayList<CobrarListadosMovimientos> cobrarlistadosmovimientossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CobrarListadosMovimientos cobrarlistadosmovimientosAux:cobrarlistadosmovimientossSeleccionados) {
				cobrarlistadosmovimientosAux.setsDetalleGeneralEntityReporte(cobrarlistadosmovimientosAux.toString());
			
				if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cobrarlistadosmovimientosAux.setsDescripcionGeneralEntityReporte1(cobrarlistadosmovimientosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					cobrarlistadosmovimientosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarlistadosmovimientosAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					cobrarlistadosmovimientosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarlistadosmovimientosAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					cobrarlistadosmovimientosAux.setsDescripcionGeneralEntityReporte1(cobrarlistadosmovimientosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					cobrarlistadosmovimientosAux.setsDescripcionGeneralEntityReporte1(cobrarlistadosmovimientosAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
					existe=true;
					cobrarlistadosmovimientosAux.setsDescripcionGeneralEntityReporte1(cobrarlistadosmovimientosAux.getnombre_transaccion());
				}
				 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAVENCE)) {
					existe=true;
					cobrarlistadosmovimientosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarlistadosmovimientosAux.getfecha_vence()));
				}
				 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					cobrarlistadosmovimientosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarlistadosmovimientosAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
					existe=true;
					cobrarlistadosmovimientosAux.setsDescripcionGeneralEntityReporte1(cobrarlistadosmovimientosAux.getnumero_comprobante());
				}
				 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROFACTURA)) {
					existe=true;
					cobrarlistadosmovimientosAux.setsDescripcionGeneralEntityReporte1(cobrarlistadosmovimientosAux.getnumero_factura());
				}
				 else if(sTipoSeleccionar.equals(CobrarListadosMovimientosConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					cobrarlistadosmovimientosAux.setsDescripcionGeneralEntityReporte1(cobrarlistadosmovimientosAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadosMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCobrarListadosMovimientos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCobrarListadosMovimientos=true;
				this.isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos=true;
				this.isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos=true;
			}
			
			this.isVisibilidadCeldaModificarCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaActualizarCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaEliminarCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaCancelarCobrarListadosMovimientos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarListadosMovimientos=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarListadosMovimientos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaModificarCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaActualizarCobrarListadosMovimientos=true;
			this.isVisibilidadCeldaEliminarCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaCancelarCobrarListadosMovimientos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarListadosMovimientos=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarListadosMovimientos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaModificarCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaActualizarCobrarListadosMovimientos=true;
			this.isVisibilidadCeldaEliminarCobrarListadosMovimientos=true;
			this.isVisibilidadCeldaCancelarCobrarListadosMovimientos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarListadosMovimientos=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarListadosMovimientos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaModificarCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaActualizarCobrarListadosMovimientos=true;
			this.isVisibilidadCeldaEliminarCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaCancelarCobrarListadosMovimientos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarListadosMovimientos=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarListadosMovimientos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCobrarListadosMovimientos=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos=true;
			this.isVisibilidadCeldaModificarCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaActualizarCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaEliminarCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaCancelarCobrarListadosMovimientos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarListadosMovimientos=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarListadosMovimientos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaActualizarCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaEliminarCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaCancelarCobrarListadosMovimientos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarListadosMovimientos=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarListadosMovimientos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaModificarCobrarListadosMovimientos=true;
			this.isVisibilidadCeldaActualizarCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaEliminarCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaCancelarCobrarListadosMovimientos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarListadosMovimientos=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarListadosMovimientos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CobrarListadosMovimientosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCobrarListadosMovimientos=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos=true;
		} else {
			this.actualizarEstadoPanelsCobrarListadosMovimientos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCobrarListadosMovimientos=false;
			//this.isVisibilidadCeldaVerFormCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaDuplicarCobrarListadosMovimientos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos=false;
		} else {
			this.isVisibilidadCeldaNuevoCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
			if(!cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos=false;												
			}
			
			this.jButtonCerrarCobrarListadosMovimientos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos=false;
		}
		
		if(!this.permiteMantenimiento(this.cobrarlistadosmovimientos)) {
			this.isVisibilidadCeldaActualizarCobrarListadosMovimientos=false;
			this.isVisibilidadCeldaEliminarCobrarListadosMovimientos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoCobrarListadosMovimientos=false;
		this.isVisibilidadCeldaNuevoRelacionesCobrarListadosMovimientos=false;
		this.isVisibilidadCeldaGuardarCambiosCobrarListadosMovimientos=false;
		//this.isVisibilidadCeldaModificarCobrarListadosMovimientos=true;
		this.isVisibilidadCeldaActualizarCobrarListadosMovimientos=false;
		this.isVisibilidadCeldaEliminarCobrarListadosMovimientos=false;
		//this.isVisibilidadCeldaCancelarCobrarListadosMovimientos=true;			
		this.isVisibilidadCeldaGuardarCobrarListadosMovimientos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarListadosMovimientos() {
	}
	
	public void actualizarEstadoPanelsCobrarListadosMovimientos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCobrarListadosMovimientos!=null) {
				this.jScrollPanelDatosEdicionCobrarListadosMovimientos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarListadosMovimientos!=null) {
				this.jTabbedPaneBusquedasCobrarListadosMovimientos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarListadosMovimientos!=null) {
				this.jScrollPanelDatosCobrarListadosMovimientos.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarListadosMovimientos!=null) {
				this.jPanelPaginacionCobrarListadosMovimientos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarListadosMovimientos!=null) {
				this.jPanelParametrosReportesCobrarListadosMovimientos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCobrarListadosMovimientos!=null) {
				this.jScrollPanelDatosEdicionCobrarListadosMovimientos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarListadosMovimientos!=null) {
				this.jTabbedPaneBusquedasCobrarListadosMovimientos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCobrarListadosMovimientos!=null) {
				this.jScrollPanelDatosCobrarListadosMovimientos.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarListadosMovimientos!=null) {
				this.jPanelPaginacionCobrarListadosMovimientos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarListadosMovimientos!=null) {
				this.jPanelParametrosReportesCobrarListadosMovimientos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCobrarListadosMovimientos!=null) {
				this.jScrollPanelDatosEdicionCobrarListadosMovimientos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarListadosMovimientos!=null) {
				this.jTabbedPaneBusquedasCobrarListadosMovimientos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarListadosMovimientos!=null) {
				this.jScrollPanelDatosCobrarListadosMovimientos.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarListadosMovimientos!=null) {
				this.jPanelPaginacionCobrarListadosMovimientos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarListadosMovimientos!=null) {
				this.jPanelParametrosReportesCobrarListadosMovimientos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCobrarListadosMovimientos!=null) {
				this.jScrollPanelDatosEdicionCobrarListadosMovimientos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarListadosMovimientos!=null) {
				this.jTabbedPaneBusquedasCobrarListadosMovimientos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarListadosMovimientos!=null) {
				this.jScrollPanelDatosCobrarListadosMovimientos.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarListadosMovimientos!=null) {
				this.jPanelPaginacionCobrarListadosMovimientos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarListadosMovimientos!=null) {
				this.jPanelParametrosReportesCobrarListadosMovimientos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCobrarListadosMovimientos!=null) {
				this.jScrollPanelDatosEdicionCobrarListadosMovimientos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarListadosMovimientos!=null) {
				this.jTabbedPaneBusquedasCobrarListadosMovimientos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarListadosMovimientos!=null) {
				this.jScrollPanelDatosCobrarListadosMovimientos.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarListadosMovimientos!=null) {
				this.jPanelPaginacionCobrarListadosMovimientos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarListadosMovimientos!=null) {
				this.jPanelParametrosReportesCobrarListadosMovimientos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCobrarListadosMovimientos!=null) {
				this.jScrollPanelDatosEdicionCobrarListadosMovimientos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarListadosMovimientos!=null) {
				this.jTabbedPaneBusquedasCobrarListadosMovimientos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarListadosMovimientos!=null) {
				this.jScrollPanelDatosCobrarListadosMovimientos.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarListadosMovimientos!=null) {
				this.jPanelPaginacionCobrarListadosMovimientos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarListadosMovimientos!=null) {
				this.jPanelParametrosReportesCobrarListadosMovimientos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCobrarListadosMovimientos!=null) {
				this.jScrollPanelDatosEdicionCobrarListadosMovimientos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarListadosMovimientos!=null) {
				this.jTabbedPaneBusquedasCobrarListadosMovimientos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarListadosMovimientos!=null) {
				this.jScrollPanelDatosCobrarListadosMovimientos.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarListadosMovimientos!=null) {
				this.jPanelPaginacionCobrarListadosMovimientos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarListadosMovimientos!=null) {
				this.jPanelParametrosReportesCobrarListadosMovimientos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCobrarListadosMovimientos!=null) {
					this.jTabbedPaneBusquedasCobrarListadosMovimientos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCobrarListadosMovimientos!=null) {
				this.jPanelParametrosReportesCobrarListadosMovimientos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarListadosMovimientos!=null) {
				this.jTabbedPaneBusquedasCobrarListadosMovimientos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCobrarListadosMovimientos!=null) {
				this.jPanelParametrosReportesCobrarListadosMovimientos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaCobrarListadosMovimientos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaCobrarListadosMovimientos) {this.jTabbedPaneBusquedasCobrarListadosMovimientos.remove(jPanelBusquedaCobrarListadosMovimientosCobrarListadosMovimientos);}
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
			
			this.inicializarActualizarBindingTablaCobrarListadosMovimientos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCobrarListadosMovimientos() {
		this.updateBorderResaltarBusquedasFormularioCobrarListadosMovimientos();
		this.updateVisibilidadBusquedasFormularioCobrarListadosMovimientos();
		this.updateHabilitarBusquedasFormularioCobrarListadosMovimientos();
	}
	
	public void updateBorderResaltarBusquedasFormularioCobrarListadosMovimientos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCobrarListadosMovimientos.getComponents().length>0) {
	

		if(this.cobrarlistadosmovimientosConstantesFunciones.resaltarBusquedaCobrarListadosMovimientosCobrarListadosMovimientos!=null) {
			index= this.jTabbedPaneBusquedasCobrarListadosMovimientos.indexOfComponent(this.jPanelBusquedaCobrarListadosMovimientosCobrarListadosMovimientos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarListadosMovimientos.getComponent(index);
				jPanel.setBorder(this.cobrarlistadosmovimientosConstantesFunciones.resaltarBusquedaCobrarListadosMovimientosCobrarListadosMovimientos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCobrarListadosMovimientos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCobrarListadosMovimientos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarListadosMovimientos.indexOfComponent(this.jPanelBusquedaCobrarListadosMovimientosCobrarListadosMovimientos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarListadosMovimientos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarBusquedaCobrarListadosMovimientosCobrarListadosMovimientos);
			if(!this.cobrarlistadosmovimientosConstantesFunciones.mostrarBusquedaCobrarListadosMovimientosCobrarListadosMovimientos && index>-1) {
				this.jTabbedPaneBusquedasCobrarListadosMovimientos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCobrarListadosMovimientos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCobrarListadosMovimientos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarListadosMovimientos.indexOfComponent(this.jPanelBusquedaCobrarListadosMovimientosCobrarListadosMovimientos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarListadosMovimientos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cobrarlistadosmovimientosConstantesFunciones.activarBusquedaCobrarListadosMovimientosCobrarListadosMovimientos);
				this.jTabbedPaneBusquedasCobrarListadosMovimientos.setEnabledAt(index,this.cobrarlistadosmovimientosConstantesFunciones.activarBusquedaCobrarListadosMovimientosCobrarListadosMovimientos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCobrarListadosMovimientos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaCobrarListadosMovimientos")) {
			index= this.jTabbedPaneBusquedasCobrarListadosMovimientos.indexOfComponent(this.jPanelBusquedaCobrarListadosMovimientosCobrarListadosMovimientos);

			this.jTabbedPaneBusquedasCobrarListadosMovimientos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarListadosMovimientos.getComponent(index);

			this.cobrarlistadosmovimientosConstantesFunciones.setResaltarBusquedaCobrarListadosMovimientosCobrarListadosMovimientos(resaltar);

			jPanel.setBorder(this.cobrarlistadosmovimientosConstantesFunciones.resaltarBusquedaCobrarListadosMovimientosCobrarListadosMovimientos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCobrarListadosMovimientos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCobrarListadosMovimientos() throws Exception {

		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCobrarListadosMovimientos();
		this.updateVisibilidadResaltarControlesFormularioCobrarListadosMovimientos();
		this.updateHabilitarResaltarControlesFormularioCobrarListadosMovimientos();
		
	}
	
	public void updateBorderResaltarControlesFormularioCobrarListadosMovimientos() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cobrarlistadosmovimientosConstantesFunciones.resaltaridCobrarListadosMovimientos!=null && this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelidCobrarListadosMovimientos.setBorder(this.cobrarlistadosmovimientosConstantesFunciones.resaltaridCobrarListadosMovimientos);}
		if(this.cobrarlistadosmovimientosConstantesFunciones.resaltarid_empresaCobrarListadosMovimientos!=null && this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxid_empresaCobrarListadosMovimientos.setBorder(this.cobrarlistadosmovimientosConstantesFunciones.resaltarid_empresaCobrarListadosMovimientos);}
		if(this.cobrarlistadosmovimientosConstantesFunciones.resaltarfecha_emision_desdeCobrarListadosMovimientos!=null && this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_emision_desdeCobrarListadosMovimientos.setBorder(this.cobrarlistadosmovimientosConstantesFunciones.resaltarfecha_emision_desdeCobrarListadosMovimientos);}
		if(this.cobrarlistadosmovimientosConstantesFunciones.resaltarfecha_emision_hastaCobrarListadosMovimientos!=null && this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_emision_hastaCobrarListadosMovimientos.setBorder(this.cobrarlistadosmovimientosConstantesFunciones.resaltarfecha_emision_hastaCobrarListadosMovimientos);}
		if(this.cobrarlistadosmovimientosConstantesFunciones.resaltarcodigoCobrarListadosMovimientos!=null && this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldcodigoCobrarListadosMovimientos.setBorder(this.cobrarlistadosmovimientosConstantesFunciones.resaltarcodigoCobrarListadosMovimientos);}
		if(this.cobrarlistadosmovimientosConstantesFunciones.resaltarnombre_completoCobrarListadosMovimientos!=null && this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreanombre_completoCobrarListadosMovimientos.setBorder(this.cobrarlistadosmovimientosConstantesFunciones.resaltarnombre_completoCobrarListadosMovimientos);}
		if(this.cobrarlistadosmovimientosConstantesFunciones.resaltarnombre_transaccionCobrarListadosMovimientos!=null && this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreanombre_transaccionCobrarListadosMovimientos.setBorder(this.cobrarlistadosmovimientosConstantesFunciones.resaltarnombre_transaccionCobrarListadosMovimientos);}
		if(this.cobrarlistadosmovimientosConstantesFunciones.resaltarfecha_venceCobrarListadosMovimientos!=null && this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_venceCobrarListadosMovimientos.setBorder(this.cobrarlistadosmovimientosConstantesFunciones.resaltarfecha_venceCobrarListadosMovimientos);}
		if(this.cobrarlistadosmovimientosConstantesFunciones.resaltarfecha_emisionCobrarListadosMovimientos!=null && this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_emisionCobrarListadosMovimientos.setBorder(this.cobrarlistadosmovimientosConstantesFunciones.resaltarfecha_emisionCobrarListadosMovimientos);}
		if(this.cobrarlistadosmovimientosConstantesFunciones.resaltarnumero_comprobanteCobrarListadosMovimientos!=null && this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldnumero_comprobanteCobrarListadosMovimientos.setBorder(this.cobrarlistadosmovimientosConstantesFunciones.resaltarnumero_comprobanteCobrarListadosMovimientos);}
		if(this.cobrarlistadosmovimientosConstantesFunciones.resaltarnumero_facturaCobrarListadosMovimientos!=null && this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldnumero_facturaCobrarListadosMovimientos.setBorder(this.cobrarlistadosmovimientosConstantesFunciones.resaltarnumero_facturaCobrarListadosMovimientos);}
		if(this.cobrarlistadosmovimientosConstantesFunciones.resaltardebito_mone_localCobrarListadosMovimientos!=null && this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFielddebito_mone_localCobrarListadosMovimientos.setBorder(this.cobrarlistadosmovimientosConstantesFunciones.resaltardebito_mone_localCobrarListadosMovimientos);}
		if(this.cobrarlistadosmovimientosConstantesFunciones.resaltarcredito_mone_localCobrarListadosMovimientos!=null && this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldcredito_mone_localCobrarListadosMovimientos.setBorder(this.cobrarlistadosmovimientosConstantesFunciones.resaltarcredito_mone_localCobrarListadosMovimientos);}
		if(this.cobrarlistadosmovimientosConstantesFunciones.resaltardescripcionCobrarListadosMovimientos!=null && this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreadescripcionCobrarListadosMovimientos.setBorder(this.cobrarlistadosmovimientosConstantesFunciones.resaltardescripcionCobrarListadosMovimientos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCobrarListadosMovimientos() throws Exception {		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
	
		//this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelidCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostraridCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jPanelidCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostraridCobrarListadosMovimientos);
		//this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxid_empresaCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarid_empresaCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jPanelid_empresaCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarid_empresaCobrarListadosMovimientos);
		//this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_emision_desdeCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarfecha_emision_desdeCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jPanelfecha_emision_desdeCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarfecha_emision_desdeCobrarListadosMovimientos);
		//this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_emision_hastaCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarfecha_emision_hastaCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jPanelfecha_emision_hastaCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarfecha_emision_hastaCobrarListadosMovimientos);
		//this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldcodigoCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarcodigoCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jPanelcodigoCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarcodigoCobrarListadosMovimientos);
		//this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreanombre_completoCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarnombre_completoCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jPanelnombre_completoCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarnombre_completoCobrarListadosMovimientos);
		//this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreanombre_transaccionCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarnombre_transaccionCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jPanelnombre_transaccionCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarnombre_transaccionCobrarListadosMovimientos);
		//this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_venceCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarfecha_venceCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jPanelfecha_venceCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarfecha_venceCobrarListadosMovimientos);
		//this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_emisionCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarfecha_emisionCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jPanelfecha_emisionCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarfecha_emisionCobrarListadosMovimientos);
		//this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldnumero_comprobanteCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarnumero_comprobanteCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jPanelnumero_comprobanteCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarnumero_comprobanteCobrarListadosMovimientos);
		//this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldnumero_facturaCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarnumero_facturaCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jPanelnumero_facturaCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarnumero_facturaCobrarListadosMovimientos);
		//this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFielddebito_mone_localCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrardebito_mone_localCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jPaneldebito_mone_localCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrardebito_mone_localCobrarListadosMovimientos);
		//this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldcredito_mone_localCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarcredito_mone_localCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jPanelcredito_mone_localCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrarcredito_mone_localCobrarListadosMovimientos);
		//this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreadescripcionCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrardescripcionCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jPaneldescripcionCobrarListadosMovimientos.setVisible(this.cobrarlistadosmovimientosConstantesFunciones.mostrardescripcionCobrarListadosMovimientos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCobrarListadosMovimientos() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarListadosMovimientos!=null) {
	
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jLabelidCobrarListadosMovimientos.setEnabled(this.cobrarlistadosmovimientosConstantesFunciones.activaridCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jComboBoxid_empresaCobrarListadosMovimientos.setEnabled(this.cobrarlistadosmovimientosConstantesFunciones.activarid_empresaCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_emision_desdeCobrarListadosMovimientos.setEnabled(this.cobrarlistadosmovimientosConstantesFunciones.activarfecha_emision_desdeCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_emision_hastaCobrarListadosMovimientos.setEnabled(this.cobrarlistadosmovimientosConstantesFunciones.activarfecha_emision_hastaCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldcodigoCobrarListadosMovimientos.setEnabled(this.cobrarlistadosmovimientosConstantesFunciones.activarcodigoCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreanombre_completoCobrarListadosMovimientos.setEnabled(this.cobrarlistadosmovimientosConstantesFunciones.activarnombre_completoCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreanombre_transaccionCobrarListadosMovimientos.setEnabled(this.cobrarlistadosmovimientosConstantesFunciones.activarnombre_transaccionCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_venceCobrarListadosMovimientos.setEnabled(this.cobrarlistadosmovimientosConstantesFunciones.activarfecha_venceCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jDateChooserfecha_emisionCobrarListadosMovimientos.setEnabled(this.cobrarlistadosmovimientosConstantesFunciones.activarfecha_emisionCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldnumero_comprobanteCobrarListadosMovimientos.setEnabled(this.cobrarlistadosmovimientosConstantesFunciones.activarnumero_comprobanteCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldnumero_facturaCobrarListadosMovimientos.setEnabled(this.cobrarlistadosmovimientosConstantesFunciones.activarnumero_facturaCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFielddebito_mone_localCobrarListadosMovimientos.setEnabled(this.cobrarlistadosmovimientosConstantesFunciones.activardebito_mone_localCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextFieldcredito_mone_localCobrarListadosMovimientos.setEnabled(this.cobrarlistadosmovimientosConstantesFunciones.activarcredito_mone_localCobrarListadosMovimientos);
		this.jInternalFrameDetalleFormCobrarListadosMovimientos.jTextAreadescripcionCobrarListadosMovimientos.setEnabled(this.cobrarlistadosmovimientosConstantesFunciones.activardescripcionCobrarListadosMovimientos);
		}
	}
	
		
}