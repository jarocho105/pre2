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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.activosfijos.util.ActivosFijosPorRamosConstantesFunciones;
import com.bydan.erp.activosfijos.util.report.ActivosFijosPorRamosParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.report.ActivosFijosPorRamosParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.report.ActivosFijosPorRamosBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.activosfijos.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.activosfijos.util.*;

import com.bydan.erp.activosfijos.util.report.*;
import com.bydan.erp.activosfijos.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ActivosFijosPorRamosBeanSwingJInternalFrame extends ActivosFijosPorRamosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ActivosFijosPorRamosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ActivosFijosPorRamos> activosfijosporramosValidator = new ClassValidator<ActivosFijosPorRamos>(ActivosFijosPorRamos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ActivosFijosPorRamos activosfijosporramos;	
	public ActivosFijosPorRamos activosfijosporramosAux;
	public ActivosFijosPorRamos activosfijosporramosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ActivosFijosPorRamos activosfijosporramosTotales;
	public Long idActivosFijosPorRamosActual;
	public Long iIdNuevoActivosFijosPorRamos=0L;
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

	public String sFinalQueryComboTipoRamoActivoFijo="";

	public List<TipoRamoActivoFijo> tiporamoactivofijosForeignKey;

	public List<TipoRamoActivoFijo> gettiporamoactivofijosForeignKey() {
		return tiporamoactivofijosForeignKey;
	}

	public void settiporamoactivofijosForeignKey(List<TipoRamoActivoFijo> tiporamoactivofijosForeignKey) {
		this.tiporamoactivofijosForeignKey = tiporamoactivofijosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoRamoActivoFijo tiporamoactivofijoForeignKey;

	public TipoRamoActivoFijo gettiporamoactivofijoForeignKey() {
		return tiporamoactivofijoForeignKey;
	}

	public void settiporamoactivofijoForeignKey(TipoRamoActivoFijo tiporamoactivofijoForeignKey) {
		this.tiporamoactivofijoForeignKey = tiporamoactivofijoForeignKey;
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
	
	public Boolean isPermisoTodoActivosFijosPorRamos;
	public Boolean isPermisoNuevoActivosFijosPorRamos;
	public Boolean isPermisoActualizarActivosFijosPorRamos;
	public Boolean isPermisoActualizarOriginalActivosFijosPorRamos;
	public Boolean isPermisoEliminarActivosFijosPorRamos;
	public Boolean isPermisoGuardarCambiosActivosFijosPorRamos;
	public Boolean isPermisoConsultaActivosFijosPorRamos;
	public Boolean isPermisoBusquedaActivosFijosPorRamos;
	public Boolean isPermisoReporteActivosFijosPorRamos;
	public Boolean isPermisoPaginacionMedioActivosFijosPorRamos;
	public Boolean isPermisoPaginacionAltoActivosFijosPorRamos;
	public Boolean isPermisoPaginacionTodoActivosFijosPorRamos;
	public Boolean isPermisoCopiarActivosFijosPorRamos;
	public Boolean isPermisoVerFormActivosFijosPorRamos;
	public Boolean isPermisoDuplicarActivosFijosPorRamos;
	public Boolean isPermisoOrdenActivosFijosPorRamos;
	
	
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
	
	public ActivosFijosPorRamosParameterReturnGeneral activosfijosporramosReturnGeneral;
	public ActivosFijosPorRamosParameterReturnGeneral activosfijosporramosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoActivosFijosPorRamos=false;
	public Boolean esParaAccionDesdeFormularioActivosFijosPorRamos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ActivosFijosPorRamosSessionBeanAdditional activosfijosporramosSessionBeanAdditional=null;
	
	public ActivosFijosPorRamosSessionBeanAdditional getActivosFijosPorRamosSessionBeanAdditional() {
		return this.activosfijosporramosSessionBeanAdditional;
	}
	
	public void setActivosFijosPorRamosSessionBeanAdditional(ActivosFijosPorRamosSessionBeanAdditional activosfijosporramosSessionBeanAdditional) {
		try {
			this.activosfijosporramosSessionBeanAdditional=activosfijosporramosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ActivosFijosPorRamosBeanSwingJInternalFrameAdditional activosfijosporramosBeanSwingJInternalFrameAdditional=null;
	//public class ActivosFijosPorRamosBeanSwingJInternalFrame
	
	public ActivosFijosPorRamosBeanSwingJInternalFrameAdditional getActivosFijosPorRamosBeanSwingJInternalFrameAdditional() {
		return this.activosfijosporramosBeanSwingJInternalFrameAdditional;
	}
	
	public void setActivosFijosPorRamosBeanSwingJInternalFrameAdditional(ActivosFijosPorRamosBeanSwingJInternalFrameAdditional activosfijosporramosBeanSwingJInternalFrameAdditional) {
		try {
			this.activosfijosporramosBeanSwingJInternalFrameAdditional=activosfijosporramosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ActivosFijosPorRamosLogic activosfijosporramosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ActivosFijosPorRamos activosfijosporramosBean;
	public ActivosFijosPorRamosConstantesFunciones activosfijosporramosConstantesFunciones;
	//public ActivosFijosPorRamosParameterReturnGeneral activosfijosporramosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoRamoActivoFijoLogic tiporamoactivofijoLogic;
	
	//PARAMETROS
	
	
	//public List<ActivosFijosPorRamos> activosfijosporramoss;	
	//public List<ActivosFijosPorRamos> activosfijosporramossEliminados;
	//public List<ActivosFijosPorRamos> activosfijosporramossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoActivosFijosPorRamos=false;
	public Boolean isVisibilidadCeldaDuplicarActivosFijosPorRamos=true;
	public Boolean isVisibilidadCeldaCopiarActivosFijosPorRamos=true;
	public Boolean isVisibilidadCeldaVerFormActivosFijosPorRamos=true;
	public Boolean isVisibilidadCeldaOrdenActivosFijosPorRamos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos=false;
	public Boolean isVisibilidadCeldaModificarActivosFijosPorRamos=false;
	public Boolean isVisibilidadCeldaActualizarActivosFijosPorRamos=false;
	public Boolean isVisibilidadCeldaEliminarActivosFijosPorRamos=false;
	public Boolean isVisibilidadCeldaCancelarActivosFijosPorRamos=false;
	public Boolean isVisibilidadCeldaGuardarActivosFijosPorRamos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos=false;	
	
	
	public Boolean isVisibilidadBusquedaActivosFijosPorRamos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoRamoActivoFijo=false;
	
	public Long getiIdNuevoActivosFijosPorRamos() {
		return this.iIdNuevoActivosFijosPorRamos;
	}

	public void setiIdNuevoActivosFijosPorRamos(Long iIdNuevoActivosFijosPorRamos) {
		this.iIdNuevoActivosFijosPorRamos = iIdNuevoActivosFijosPorRamos;
	}
	
	public Long getidActivosFijosPorRamosActual() {
		return this.idActivosFijosPorRamosActual;
	}

	public void setidActivosFijosPorRamosActual(Long idActivosFijosPorRamosActual) {
		this.idActivosFijosPorRamosActual = idActivosFijosPorRamosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ActivosFijosPorRamos getactivosfijosporramos() {
		return this.activosfijosporramos;
	}

	public void setactivosfijosporramos(ActivosFijosPorRamos activosfijosporramos) {
		this.activosfijosporramos = activosfijosporramos;
	}
	
	public ActivosFijosPorRamos getactivosfijosporramosAux() {
		return this.activosfijosporramosAux;
	}

	public void setactivosfijosporramosAux(ActivosFijosPorRamos activosfijosporramosAux) {
		this.activosfijosporramosAux = activosfijosporramosAux;
	}				
	
	public ActivosFijosPorRamos getactivosfijosporramosAnterior() {
		return this.activosfijosporramosAnterior;
	}

	public void setactivosfijosporramosAnterior(ActivosFijosPorRamos activosfijosporramosAnterior) {
		this.activosfijosporramosAnterior = activosfijosporramosAnterior;
	}	
	
	public ActivosFijosPorRamos getactivosfijosporramosTotales() {
		return this.activosfijosporramosTotales;
	}

	public void setactivosfijosporramosTotales(ActivosFijosPorRamos activosfijosporramosTotales) {
		this.activosfijosporramosTotales = activosfijosporramosTotales;
	}	
	
	public ActivosFijosPorRamos getactivosfijosporramosBean() {
		return this.activosfijosporramosBean;
	}

	public void setactivosfijosporramosBean(ActivosFijosPorRamos activosfijosporramosBean) {
		this.activosfijosporramosBean = activosfijosporramosBean;
	}	
	
	public ActivosFijosPorRamosParameterReturnGeneral getactivosfijosporramosReturnGeneral() {
		return this.activosfijosporramosReturnGeneral;
	}

	public void setactivosfijosporramosReturnGeneral(ActivosFijosPorRamosParameterReturnGeneral activosfijosporramosReturnGeneral) {
		this.activosfijosporramosReturnGeneral = activosfijosporramosReturnGeneral;
	}	
	
	
	public Long id_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamos=-1L;

	public Long getid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamos() {
		return this.id_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamos;
	}

	public void setid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamos(Long id_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamos) {
		this.id_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamos = id_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamos;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijo=-1L;

	public Long getid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijo() {
		return this.id_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijo;
	}

	public void setid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijo(Long id_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijo) {
		this.id_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijo = id_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ActivosFijosPorRamosLogic getActivosFijosPorRamosLogic()	{		
		return activosfijosporramosLogic;
	}

	public void setActivosFijosPorRamosLogic(ActivosFijosPorRamosLogic activosfijosporramosLogic) {
		this.activosfijosporramosLogic = activosfijosporramosLogic;
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
	
	public Boolean getIsEsNuevoActivosFijosPorRamos() {
		return isEsNuevoActivosFijosPorRamos;
	}

	public void setIsEsNuevoActivosFijosPorRamos(Boolean isEsNuevoActivosFijosPorRamos) {
		this.isEsNuevoActivosFijosPorRamos = isEsNuevoActivosFijosPorRamos;
	}

	public Boolean getEsParaAccionDesdeFormularioActivosFijosPorRamos() {
		return esParaAccionDesdeFormularioActivosFijosPorRamos;
	}
	
	public void setEsParaAccionDesdeFormularioActivosFijosPorRamos(Boolean esParaAccionDesdeFormularioActivosFijosPorRamos) {
		this.esParaAccionDesdeFormularioActivosFijosPorRamos = esParaAccionDesdeFormularioActivosFijosPorRamos;
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

			if(this.activosfijosporramosSessionBean==null) {
				this.activosfijosporramosSessionBean=new ActivosFijosPorRamosSessionBean();
			}

			if(!this.activosfijosporramosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(activosfijosporramosSessionBean.getlidEmpresaActual());
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

	public void cargarCombosTipoRamoActivoFijosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tiporamoactivofijosForeignKey=new ArrayList<TipoRamoActivoFijo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoRamoActivoFijoLogic tiporamoactivofijoLogic=new TipoRamoActivoFijoLogic();

			//tiporamoactivofijoLogic.getTipoRamoActivoFijoDataAccess().setIsForForeingKeyData(true);

			if(this.activosfijosporramosSessionBean==null) {
				this.activosfijosporramosSessionBean=new ActivosFijosPorRamosSessionBean();
			}

			if(!this.activosfijosporramosSessionBean.getisBusquedaDesdeForeignKeySesionTipoRamoActivoFijo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tiporamoactivofijoLogic.getTipoRamoActivoFijoDataAccess().setIsForForeingKeyData(true);

					tiporamoactivofijoLogic.getTodosTipoRamoActivoFijosWithConnection(sFinalQuery,new Pagination());

					this.tiporamoactivofijosForeignKey=tiporamoactivofijoLogic.getTipoRamoActivoFijos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoRamoActivoFijo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporamoactivofijoLogic.getEntityWithConnection(activosfijosporramosSessionBean.getlidTipoRamoActivoFijoActual());
					this.tiporamoactivofijosForeignKey.add(tiporamoactivofijoLogic.getTipoRamoActivoFijo());
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

					if(this.activosfijosporramos!=null) {
						this.activosfijosporramos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
						this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_empresaActivosFijosPorRamos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaActivosFijosPorRamos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
						if(this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_empresaActivosFijosPorRamos.getItemCount()>0) {
							this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_empresaActivosFijosPorRamos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaActivosFijosPorRamosGenerico)throws Exception
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
				jComboBoxid_empresaActivosFijosPorRamosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaActivosFijosPorRamosGenerico!=null && jComboBoxid_empresaActivosFijosPorRamosGenerico.getItemCount()>0) {
					jComboBoxid_empresaActivosFijosPorRamosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoRamoActivoFijoForeignKey(Long idTipoRamoActivoFijoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoRamoActivoFijo  tiporamoactivofijoTemp=null;

			for(TipoRamoActivoFijo tiporamoactivofijoAux:tiporamoactivofijosForeignKey) {
				if(tiporamoactivofijoAux.getId()!=null && tiporamoactivofijoAux.getId().equals(idTipoRamoActivoFijoSeleccionado)) {
					tiporamoactivofijoTemp=tiporamoactivofijoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tiporamoactivofijoTemp!=null) {

					if(this.activosfijosporramos!=null) {
						this.activosfijosporramos.setTipoRamoActivoFijo(tiporamoactivofijoTemp);
					}

					if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
						this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.setSelectedItem(tiporamoactivofijoTemp);
					}
				} else {
					//jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.setSelectedItem(tiporamoactivofijoTemp);
					if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
						if(this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.getItemCount()>0) {
							this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaActivosFijosPorRamos") || sFormularioTipoBusqueda.equals("Todos")){
					if(tiporamoactivofijoTemp!=null && jComboBoxid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos!=null) {
						jComboBoxid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos.setSelectedItem(tiporamoactivofijoTemp);
					} else {
						if(jComboBoxid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos!=null) {
							//jComboBoxid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos.setSelectedItem(tiporamoactivofijoTemp);
							if(jComboBoxid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos.getItemCount()>0) {
								jComboBoxid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos.setSelectedIndex(0);
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

	public String getActualTipoRamoActivoFijoForeignKeyDescripcion(Long idTipoRamoActivoFijoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoRamoActivoFijo  tiporamoactivofijoTemp=null;

			for(TipoRamoActivoFijo tiporamoactivofijoAux:tiporamoactivofijosForeignKey) {
				if(tiporamoactivofijoAux.getId()!=null && tiporamoactivofijoAux.getId().equals(idTipoRamoActivoFijoSeleccionado)) {
					tiporamoactivofijoTemp=tiporamoactivofijoAux;
					break;
				}
			}


			sDescripcion=TipoRamoActivoFijoConstantesFunciones.getTipoRamoActivoFijoDescripcion(tiporamoactivofijoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoRamoActivoFijoForeignKeyGenerico(Long idTipoRamoActivoFijoSeleccionado,JComboBox jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamosGenerico)throws Exception
	{
		try
		{
			TipoRamoActivoFijo  tiporamoactivofijoTemp=null;

			for(TipoRamoActivoFijo tiporamoactivofijoAux:tiporamoactivofijosForeignKey) {
				if(tiporamoactivofijoAux.getId()!=null && tiporamoactivofijoAux.getId().equals(idTipoRamoActivoFijoSeleccionado)) {
					tiporamoactivofijoTemp=tiporamoactivofijoAux;
					break;
				}
			}

			if(tiporamoactivofijoTemp!=null) {
				jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamosGenerico.setSelectedItem(tiporamoactivofijoTemp);
			} else {
				if(jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamosGenerico!=null && jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamosGenerico.getItemCount()>0) {
					jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ActivosFijosPorRamos activosfijosporramos,JComboBox jComboBoxid_empresaActivosFijosPorRamosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaActivosFijosPorRamosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_empresaActivosFijosPorRamos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaActivosFijosPorRamosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				activosfijosporramos.setid_empresa(empresaAux.getId());
				activosfijosporramos.setempresa_descripcion(ActivosFijosPorRamosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				activosfijosporramos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoRamoActivoFijoForeignKey(ActivosFijosPorRamos activosfijosporramos,JComboBox jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamosGenerico)throws Exception
	{
		try
		{
			TipoRamoActivoFijo  tiporamoactivofijoAux=new TipoRamoActivoFijo();

			if(jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamosGenerico==null) {
				tiporamoactivofijoAux=(TipoRamoActivoFijo)this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.getSelectedItem();
			} else {
				tiporamoactivofijoAux=(TipoRamoActivoFijo)jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamosGenerico.getSelectedItem();
			}

			if(tiporamoactivofijoAux!=null && tiporamoactivofijoAux.getId()!=null) {
				activosfijosporramos.setid_tipo_ramo_activo_fijo(tiporamoactivofijoAux.getId());
				activosfijosporramos.settiporamoactivofijo_descripcion(ActivosFijosPorRamosConstantesFunciones.getTipoRamoActivoFijoDescripcion(tiporamoactivofijoAux));
				activosfijosporramos.setTipoRamoActivoFijo(tiporamoactivofijoAux);			}
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

					if(!ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { 
							this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_empresaActivosFijosPorRamos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_empresaActivosFijosPorRamos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { 
					}

					if(!ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoRamoActivoFijosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoRamoActivoFijo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { 
							this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.removeAllItems();

							for(TipoRamoActivoFijo tiporamoactivofijo:this.tiporamoactivofijosForeignKey) {
								this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.addItem(tiporamoactivofijo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { 
					}

					if(!ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaActivosFijosPorRamos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos.removeAllItems();

							for(TipoRamoActivoFijo tiporamoactivofijo:this.tiporamoactivofijosForeignKey) {
								this.jComboBoxid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos.addItem(tiporamoactivofijo);
							}
						}

						if(!ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
							this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_empresaActivosFijosPorRamos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
							this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_empresaActivosFijosPorRamos.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoRamoActivoFijoForeignKey(TipoRamoActivoFijo tiporamoactivofijo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
							this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.setSelectedItem(tiporamoactivofijo);
						}
					} else {
						if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
							this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos.setSelectedItem(tiporamoactivofijo);
						} else {
							this.jComboBoxid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesActivosFijosPorRamos() throws Exception {
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
		
	public ActivosFijosPorRamosParameterReturnGeneral getActivosFijosPorRamosParameterGeneral() {
		return this.activosfijosporramosParameterGeneral;
	}
	
	public void setActivosFijosPorRamosParameterGeneral(ActivosFijosPorRamosParameterReturnGeneral activosfijosporramosParameterGeneral) {
		this.activosfijosporramosParameterGeneral = activosfijosporramosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoActivosFijosPorRamos() {
		return isPermisoTodoActivosFijosPorRamos;
	}

	public void setIsPermisoTodoActivosFijosPorRamos(Boolean isPermisoTodoActivosFijosPorRamos) {
		this.isPermisoTodoActivosFijosPorRamos = isPermisoTodoActivosFijosPorRamos;
	}

	public Boolean getIsPermisoNuevoActivosFijosPorRamos() {
		return isPermisoNuevoActivosFijosPorRamos;
	}

	public void setIsPermisoNuevoActivosFijosPorRamos(Boolean isPermisoNuevoActivosFijosPorRamos) {
		this.isPermisoNuevoActivosFijosPorRamos = isPermisoNuevoActivosFijosPorRamos;
	}

	public Boolean getIsPermisoActualizarActivosFijosPorRamos() {
		return isPermisoActualizarActivosFijosPorRamos;
	}

	public void setIsPermisoActualizarActivosFijosPorRamos(Boolean isPermisoActualizarActivosFijosPorRamos) {
		this.isPermisoActualizarActivosFijosPorRamos = isPermisoActualizarActivosFijosPorRamos;
	}

	public Boolean getIsPermisoEliminarActivosFijosPorRamos() {
		return isPermisoEliminarActivosFijosPorRamos;
	}

	public void setIsPermisoEliminarActivosFijosPorRamos(Boolean isPermisoEliminarActivosFijosPorRamos) {
		this.isPermisoEliminarActivosFijosPorRamos = isPermisoEliminarActivosFijosPorRamos;
	}

	public Boolean getIsPermisoGuardarCambiosActivosFijosPorRamos() {
		return isPermisoGuardarCambiosActivosFijosPorRamos;
	}

	public void setIsPermisoGuardarCambiosActivosFijosPorRamos(Boolean isPermisoGuardarCambiosActivosFijosPorRamos) {
		this.isPermisoGuardarCambiosActivosFijosPorRamos = isPermisoGuardarCambiosActivosFijosPorRamos;
	}
	
	public Boolean getIsPermisoConsultaActivosFijosPorRamos() {
		return isPermisoConsultaActivosFijosPorRamos;
	}

	public void setIsPermisoConsultaActivosFijosPorRamos(Boolean isPermisoConsultaActivosFijosPorRamos) {
		this.isPermisoConsultaActivosFijosPorRamos = isPermisoConsultaActivosFijosPorRamos;
	}

	public Boolean getIsPermisoBusquedaActivosFijosPorRamos() {
		return isPermisoBusquedaActivosFijosPorRamos;
	}

	public void setIsPermisoBusquedaActivosFijosPorRamos(Boolean isPermisoBusquedaActivosFijosPorRamos) {
		this.isPermisoBusquedaActivosFijosPorRamos = isPermisoBusquedaActivosFijosPorRamos;
	}

	public Boolean getIsPermisoReporteActivosFijosPorRamos() {
		return isPermisoReporteActivosFijosPorRamos;
	}

	public void setIsPermisoReporteActivosFijosPorRamos(Boolean isPermisoReporteActivosFijosPorRamos) {
		this.isPermisoReporteActivosFijosPorRamos = isPermisoReporteActivosFijosPorRamos;
	}
	
	public Boolean getIsPermisoPaginacionMedioActivosFijosPorRamos() {
		return isPermisoPaginacionMedioActivosFijosPorRamos;
	}

	public void setIsPermisoPaginacionMedioActivosFijosPorRamos(Boolean isPermisoPaginacionMedioActivosFijosPorRamos) {
		this.isPermisoPaginacionMedioActivosFijosPorRamos = isPermisoPaginacionMedioActivosFijosPorRamos;
	}
	
	public Boolean getIsPermisoPaginacionTodoActivosFijosPorRamos() {
		return isPermisoPaginacionTodoActivosFijosPorRamos;
	}

	public void setIsPermisoPaginacionTodoActivosFijosPorRamos(Boolean isPermisoPaginacionTodoActivosFijosPorRamos) {
		this.isPermisoPaginacionTodoActivosFijosPorRamos = isPermisoPaginacionTodoActivosFijosPorRamos;
	}
	
	public Boolean getIsPermisoPaginacionAltoActivosFijosPorRamos() {
		return isPermisoPaginacionAltoActivosFijosPorRamos;
	}

	public void setIsPermisoPaginacionAltoActivosFijosPorRamos(Boolean isPermisoPaginacionAltoActivosFijosPorRamos) {
		this.isPermisoPaginacionAltoActivosFijosPorRamos = isPermisoPaginacionAltoActivosFijosPorRamos;
	}
	
	public Boolean getIsPermisoCopiarActivosFijosPorRamos() {
		return isPermisoCopiarActivosFijosPorRamos;
	}

	public void setIsPermisoCopiarActivosFijosPorRamos(Boolean isPermisoCopiarActivosFijosPorRamos) {
		this.isPermisoCopiarActivosFijosPorRamos = isPermisoCopiarActivosFijosPorRamos;
	}
	
	public Boolean getIsPermisoVerFormActivosFijosPorRamos() {
		return isPermisoVerFormActivosFijosPorRamos;
	}

	public void setIsPermisoVerFormActivosFijosPorRamos(Boolean isPermisoVerFormActivosFijosPorRamos) {
		this.isPermisoVerFormActivosFijosPorRamos = isPermisoVerFormActivosFijosPorRamos;
	}
	
	public Boolean getIsPermisoDuplicarActivosFijosPorRamos() {
		return isPermisoDuplicarActivosFijosPorRamos;
	}

	public void setIsPermisoDuplicarActivosFijosPorRamos(Boolean isPermisoDuplicarActivosFijosPorRamos) {
		this.isPermisoDuplicarActivosFijosPorRamos = isPermisoDuplicarActivosFijosPorRamos;
	}
	
	public Boolean getIsPermisoOrdenActivosFijosPorRamos() {
		return isPermisoOrdenActivosFijosPorRamos;
	}

	public void setIsPermisoOrdenActivosFijosPorRamos(Boolean isPermisoOrdenActivosFijosPorRamos) {
		this.isPermisoOrdenActivosFijosPorRamos = isPermisoOrdenActivosFijosPorRamos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoActivosFijosPorRamos() {
		return isVisibilidadCeldaNuevoActivosFijosPorRamos;
	}

	public void setIsVisibilidadCeldaNuevoActivosFijosPorRamos(Boolean isVisibilidadCeldaNuevoActivosFijosPorRamos) {
		this.isVisibilidadCeldaNuevoActivosFijosPorRamos = isVisibilidadCeldaNuevoActivosFijosPorRamos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarActivosFijosPorRamos() {
		return isVisibilidadCeldaDuplicarActivosFijosPorRamos;
	}

	public void setIsVisibilidadCeldaDuplicarActivosFijosPorRamos(Boolean isVisibilidadCeldaDuplicarActivosFijosPorRamos) {
		this.isVisibilidadCeldaDuplicarActivosFijosPorRamos = isVisibilidadCeldaDuplicarActivosFijosPorRamos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarActivosFijosPorRamos() {
		return isVisibilidadCeldaCopiarActivosFijosPorRamos;
	}

	public void setIsVisibilidadCeldaCopiarActivosFijosPorRamos(Boolean isVisibilidadCeldaCopiarActivosFijosPorRamos) {
		this.isVisibilidadCeldaCopiarActivosFijosPorRamos = isVisibilidadCeldaCopiarActivosFijosPorRamos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormActivosFijosPorRamos() {
		return isVisibilidadCeldaVerFormActivosFijosPorRamos;
	}

	public void setIsVisibilidadCeldaVerFormActivosFijosPorRamos(Boolean isVisibilidadCeldaVerFormActivosFijosPorRamos) {
		this.isVisibilidadCeldaVerFormActivosFijosPorRamos = isVisibilidadCeldaVerFormActivosFijosPorRamos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenActivosFijosPorRamos() {
		return isVisibilidadCeldaOrdenActivosFijosPorRamos;
	}

	public void setIsVisibilidadCeldaOrdenActivosFijosPorRamos(Boolean isVisibilidadCeldaOrdenActivosFijosPorRamos) {
		this.isVisibilidadCeldaOrdenActivosFijosPorRamos = isVisibilidadCeldaOrdenActivosFijosPorRamos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos() {
		return isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos(Boolean isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos) {
		this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos = isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarActivosFijosPorRamos() {
		return isVisibilidadCeldaModificarActivosFijosPorRamos;
	}

	public void setIsVisibilidadCeldaModificarActivosFijosPorRamos(Boolean isVisibilidadCeldaModificarActivosFijosPorRamos) {
		this.isVisibilidadCeldaModificarActivosFijosPorRamos = isVisibilidadCeldaModificarActivosFijosPorRamos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarActivosFijosPorRamos() {
		return isVisibilidadCeldaActualizarActivosFijosPorRamos;
	}

	public void setIsVisibilidadCeldaActualizarActivosFijosPorRamos(Boolean isVisibilidadCeldaActualizarActivosFijosPorRamos) {
		this.isVisibilidadCeldaActualizarActivosFijosPorRamos = isVisibilidadCeldaActualizarActivosFijosPorRamos;
	}

	public Boolean getIsVisibilidadCeldaEliminarActivosFijosPorRamos() {
		return isVisibilidadCeldaEliminarActivosFijosPorRamos;
	}

	public void setIsVisibilidadCeldaEliminarActivosFijosPorRamos(Boolean isVisibilidadCeldaEliminarActivosFijosPorRamos) {
		this.isVisibilidadCeldaEliminarActivosFijosPorRamos = isVisibilidadCeldaEliminarActivosFijosPorRamos;
	}

	public Boolean getIsVisibilidadCeldaCancelarActivosFijosPorRamos() {
		return isVisibilidadCeldaCancelarActivosFijosPorRamos;
	}

	public void setIsVisibilidadCeldaCancelarActivosFijosPorRamos(Boolean isVisibilidadCeldaCancelarActivosFijosPorRamos) {
		this.isVisibilidadCeldaCancelarActivosFijosPorRamos = isVisibilidadCeldaCancelarActivosFijosPorRamos;
	}

	public Boolean getIsVisibilidadCeldaGuardarActivosFijosPorRamos() {
		return isVisibilidadCeldaGuardarActivosFijosPorRamos;
	}

	public void setIsVisibilidadCeldaGuardarActivosFijosPorRamos(Boolean isVisibilidadCeldaGuardarActivosFijosPorRamos) {
		this.isVisibilidadCeldaGuardarActivosFijosPorRamos = isVisibilidadCeldaGuardarActivosFijosPorRamos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosActivosFijosPorRamos() {
		return isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosActivosFijosPorRamos(Boolean isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos) {
		this.isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos = isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos;
	}
		
	public ActivosFijosPorRamosSessionBean getactivosfijosporramosSessionBean() {
		return this.activosfijosporramosSessionBean;
	}
	
	public void setactivosfijosporramosSessionBean(ActivosFijosPorRamosSessionBean activosfijosporramosSessionBean) {
		this.activosfijosporramosSessionBean=activosfijosporramosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaActivosFijosPorRamos() {
		return this.isVisibilidadBusquedaActivosFijosPorRamos;
	}

	public void setisVisibilidadBusquedaActivosFijosPorRamos(Boolean isVisibilidadBusquedaActivosFijosPorRamos) {
		this.isVisibilidadBusquedaActivosFijosPorRamos=isVisibilidadBusquedaActivosFijosPorRamos;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTipoRamoActivoFijo() {
		return this.isVisibilidadFK_IdTipoRamoActivoFijo;
	}

	public void setisVisibilidadFK_IdTipoRamoActivoFijo(Boolean isVisibilidadFK_IdTipoRamoActivoFijo) {
		this.isVisibilidadFK_IdTipoRamoActivoFijo=isVisibilidadFK_IdTipoRamoActivoFijo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(ActivosFijosPorRamos activosfijosporramos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(activosfijosporramos,null);
				this.setActualParaGuardarTipoRamoActivoFijoForeignKey(activosfijosporramos,null);
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
	
	public void bugActualizarReferenciaActual(ActivosFijosPorRamos activosfijosporramos,ActivosFijosPorRamos activosfijosporramosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalActivosFijosPorRamos(activosfijosporramos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		activosfijosporramosAux.setId(activosfijosporramos.getId());
		activosfijosporramosAux.setVersionRow(activosfijosporramos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ActivosFijosPorRamos activosfijosporramosLocal) throws Exception {
		
		if(this.activosfijosporramosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ActivosFijosPorRamos activosfijosporramosLocal) throws Exception {	
		if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				activosfijosporramosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoRamoActivoFijoDetalleFormJInternalFrame.class)) {
				TipoRamoActivoFijoBeanSwingJInternalFrame tiporamoactivofijoBeanSwingJInternalFrameLocal=(TipoRamoActivoFijoBeanSwingJInternalFrame) ((TipoRamoActivoFijoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tiporamoactivofijoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoRamoActivoFijo(tiporamoactivofijoBeanSwingJInternalFrameLocal.gettiporamoactivofijo(),true);
				tiporamoactivofijoBeanSwingJInternalFrameLocal.actualizarLista(tiporamoactivofijoBeanSwingJInternalFrameLocal.tiporamoactivofijo,this.tiporamoactivofijosForeignKey);

				tiporamoactivofijoBeanSwingJInternalFrameLocal.actualizarRelaciones(tiporamoactivofijoBeanSwingJInternalFrameLocal.tiporamoactivofijo);

				activosfijosporramosLocal.setTipoRamoActivoFijo(tiporamoactivofijoBeanSwingJInternalFrameLocal.tiporamoactivofijo);

				this.addItemDefectoCombosForeignKeyTipoRamoActivoFijo();
				this.cargarCombosFrameTipoRamoActivoFijosForeignKey("Formulario");
				this.setActualTipoRamoActivoFijoForeignKey(tiporamoactivofijoBeanSwingJInternalFrameLocal.tiporamoactivofijo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarActivosFijosPorRamosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = activosfijosporramosValidator.getInvalidValues(this.activosfijosporramos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ActivosFijosPorRamos activosfijosporramos,List<ActivosFijosPorRamos> activosfijosporramoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ActivosFijosPorRamos activosfijosporramos,List<ActivosFijosPorRamos> activosfijosporramoss) throws Exception {
		try	{			
			ActivosFijosPorRamosConstantesFunciones.actualizarSelectedLista(activosfijosporramos,activosfijosporramoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ActivosFijosPorRamos> activosfijosporramossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				activosfijosporramossLocal=this.activosfijosporramosLogic.getActivosFijosPorRamoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				activosfijosporramossLocal=this.activosfijosporramoss;
			}
			//ARCHITECTURE
		
			for(ActivosFijosPorRamos activosfijosporramosLocal:activosfijosporramossLocal) {
				if(this.permiteMantenimiento(activosfijosporramosLocal) && activosfijosporramosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ActivosFijosPorRamosConstantesFunciones.getActivosFijosPorRamosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ActivosFijosPorRamosConstantesFunciones.NOMBRESUBGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelnombre_sub_grupoActivosFijosPorRamos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorRamosConstantesFunciones.NOMBREDETALLEGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelnombre_detalle_grupoActivosFijosPorRamos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorRamosConstantesFunciones.CLAVE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelclaveActivosFijosPorRamos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorRamosConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelnombreActivosFijosPorRamos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorRamosConstantesFunciones.FECHACOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelfecha_compraActivosFijosPorRamos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorRamosConstantesFunciones.VIDAUTIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelvida_utilActivosFijosPorRamos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorRamosConstantesFunciones.COSTODECOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelcosto_de_compraActivosFijosPorRamos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorRamosConstantesFunciones.MARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelmarcaActivosFijosPorRamos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorRamosConstantesFunciones.MODELO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelmodeloActivosFijosPorRamos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorRamosConstantesFunciones.NUMEROMATRICULA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelnumero_matriculaActivosFijosPorRamos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorRamosConstantesFunciones.NUMEROMOTOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelnumero_motorActivosFijosPorRamos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorRamosConstantesFunciones.NUMEROCHASIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelnumero_chasisActivosFijosPorRamos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorRamosConstantesFunciones.NUMEROPLACA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelnumero_placaActivosFijosPorRamos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorRamosConstantesFunciones.VALORCOMERCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelvalor_comercialActivosFijosPorRamos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelnombre_sub_grupoActivosFijosPorRamos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelnombre_detalle_grupoActivosFijosPorRamos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelclaveActivosFijosPorRamos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelnombreActivosFijosPorRamos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelfecha_compraActivosFijosPorRamos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelvida_utilActivosFijosPorRamos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelcosto_de_compraActivosFijosPorRamos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelmarcaActivosFijosPorRamos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelmodeloActivosFijosPorRamos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelnumero_matriculaActivosFijosPorRamos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelnumero_motorActivosFijosPorRamos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelnumero_chasisActivosFijosPorRamos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelnumero_placaActivosFijosPorRamos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelvalor_comercialActivosFijosPorRamos,"");
		
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
		this.iIdNuevoActivosFijosPorRamos--;	
		
		
		this.activosfijosporramosAux=new ActivosFijosPorRamos();
		
		this.activosfijosporramosAux.setId(this.iIdNuevoActivosFijosPorRamos);
		this.activosfijosporramosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.activosfijosporramosLogic.getActivosFijosPorRamoss().add(this.activosfijosporramosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.activosfijosporramoss.add(this.activosfijosporramosAux);
		}
		//ARCHITECTURE
		
		this.activosfijosporramos=this.activosfijosporramosAux;
		
		if(ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioActivosFijosPorRamos(this.activosfijosporramos);
			this.setVariablesObjetoActualToFormularioForeignKeyActivosFijosPorRamos(this.activosfijosporramos);
		}
				
		//this.setDefaultControlesActivosFijosPorRamos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyActivosFijosPorRamos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyActivosFijosPorRamos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyActivosFijosPorRamos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualActivosFijosPorRamos(this.activosfijosporramosBean,this.activosfijosporramos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanActivosFijosPorRamos(this.activosfijosporramosReturnGeneral,this.activosfijosporramosBean,false);
		
		if(this.activosfijosporramosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyActivosFijosPorRamos(this.activosfijosporramosReturnGeneral.getActivosFijosPorRamos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioActivosFijosPorRamos(this.activosfijosporramosReturnGeneral.getActivosFijosPorRamos());
		}
		
		if(this.activosfijosporramosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioActivosFijosPorRamos(this.activosfijosporramosReturnGeneral.getActivosFijosPorRamos(),classes);//this.activosfijosporramosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyActivosFijosPorRamos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyActivosFijosPorRamos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.RecargarFormActivosFijosPorRamos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingActivosFijosPorRamos(false);
						
			if(activosfijosporramosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualActivosFijosPorRamos();
			}
			
			this.actualizarVisualTableDatosActivosFijosPorRamos();
			
			this.jTableDatosActivosFijosPorRamos.setRowSelectionInterval(this.getIndiceNuevoActivosFijosPorRamos(), this.getIndiceNuevoActivosFijosPorRamos());
			
			this.seleccionarFilaTablaActivosFijosPorRamosActual();
						
			this.actualizarEstadoCeldasBotonesActivosFijosPorRamos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesActivosFijosPorRamos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombre_sub_grupoActivosFijosPorRamos.setEnabled(isHabilitar && this.activosfijosporramosConstantesFunciones.activarnombre_sub_grupoActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombre_detalle_grupoActivosFijosPorRamos.setEnabled(isHabilitar && this.activosfijosporramosConstantesFunciones.activarnombre_detalle_grupoActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldclaveActivosFijosPorRamos.setEnabled(isHabilitar && this.activosfijosporramosConstantesFunciones.activarclaveActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombreActivosFijosPorRamos.setEnabled(isHabilitar && this.activosfijosporramosConstantesFunciones.activarnombreActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jDateChooserfecha_compraActivosFijosPorRamos.setEnabled(isHabilitar && this.activosfijosporramosConstantesFunciones.activarfecha_compraActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldvida_utilActivosFijosPorRamos.setEnabled(isHabilitar && this.activosfijosporramosConstantesFunciones.activarvida_utilActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldcosto_de_compraActivosFijosPorRamos.setEnabled(isHabilitar && this.activosfijosporramosConstantesFunciones.activarcosto_de_compraActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreamarcaActivosFijosPorRamos.setEnabled(isHabilitar && this.activosfijosporramosConstantesFunciones.activarmarcaActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreamodeloActivosFijosPorRamos.setEnabled(isHabilitar && this.activosfijosporramosConstantesFunciones.activarmodeloActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_matriculaActivosFijosPorRamos.setEnabled(isHabilitar && this.activosfijosporramosConstantesFunciones.activarnumero_matriculaActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_motorActivosFijosPorRamos.setEnabled(isHabilitar && this.activosfijosporramosConstantesFunciones.activarnumero_motorActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_chasisActivosFijosPorRamos.setEnabled(isHabilitar && this.activosfijosporramosConstantesFunciones.activarnumero_chasisActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_placaActivosFijosPorRamos.setEnabled(isHabilitar && this.activosfijosporramosConstantesFunciones.activarnumero_placaActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldvalor_comercialActivosFijosPorRamos.setEnabled(isHabilitar && this.activosfijosporramosConstantesFunciones.activarvalor_comercialActivosFijosPorRamos);	
		//
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_empresaActivosFijosPorRamos.setEnabled(isHabilitar && this.activosfijosporramosConstantesFunciones.activarid_empresaActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.setEnabled(isHabilitar && this.activosfijosporramosConstantesFunciones.activarid_tipo_ramo_activo_fijoActivosFijosPorRamos);
	};
	
	public void setDefaultControlesActivosFijosPorRamos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoActivosFijosPorRamos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.activosfijosporramosSessionBean.setConGuardarRelaciones(true);			
			this.activosfijosporramosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTabbedPaneRelacionesActivosFijosPorRamos.setVisible(true);
			
					
		} else {
			//this.activosfijosporramosSessionBean.setConGuardarRelaciones(false);			
			this.activosfijosporramosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTabbedPaneRelacionesActivosFijosPorRamos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoActivosFijosPorRamos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ActivosFijosPorRamos activosfijosporramosAux:this.activosfijosporramosLogic.getActivosFijosPorRamoss()) {
				if(activosfijosporramosAux.getId().equals(this.iIdNuevoActivosFijosPorRamos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ActivosFijosPorRamos activosfijosporramosAux:this.activosfijosporramoss) {
				if(activosfijosporramosAux.getId().equals(this.iIdNuevoActivosFijosPorRamos)) {
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
	
	public int getIndiceActualActivosFijosPorRamos(ActivosFijosPorRamos activosfijosporramos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ActivosFijosPorRamos activosfijosporramosAux:this.activosfijosporramosLogic.getActivosFijosPorRamoss()) {
				if(activosfijosporramosAux.getId().equals(activosfijosporramos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ActivosFijosPorRamos activosfijosporramosAux:this.activosfijosporramoss) {
				if(activosfijosporramosAux.getId().equals(activosfijosporramos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalActivosFijosPorRamos(ActivosFijosPorRamos activosfijosporramosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ActivosFijosPorRamos activosfijosporramosAux:this.activosfijosporramosLogic.getActivosFijosPorRamoss()) {
				if(activosfijosporramosAux.getActivosFijosPorRamosOriginal().getId().equals(activosfijosporramosOriginal.getId())) {
					existe=true;
					activosfijosporramosOriginal.setId(activosfijosporramosAux.getId());
					activosfijosporramosOriginal.setVersionRow(activosfijosporramosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ActivosFijosPorRamos activosfijosporramosAux:this.activosfijosporramoss) {
				if(activosfijosporramosAux.getActivosFijosPorRamosOriginal().getId().equals(activosfijosporramosOriginal.getId())) {
					existe=true;
					activosfijosporramosOriginal.setId(activosfijosporramosAux.getId());
					activosfijosporramosOriginal.setVersionRow(activosfijosporramosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosActivosFijosPorRamos(Boolean esParaCancelar) throws Exception {
		activosfijosporramossAux=new ArrayList<ActivosFijosPorRamos>();
		activosfijosporramosAux=new ActivosFijosPorRamos();
		
		if(!this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ActivosFijosPorRamos activosfijosporramosAux:this.activosfijosporramosLogic.getActivosFijosPorRamoss()) {
					if(activosfijosporramosAux.getId()<0) {
						activosfijosporramossAux.add(activosfijosporramosAux);
					}		
				}
				this.iIdNuevoActivosFijosPorRamos=0L;
				this.activosfijosporramosLogic.getActivosFijosPorRamoss().removeAll(activosfijosporramossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ActivosFijosPorRamos activosfijosporramosAux:this.activosfijosporramoss) {
					if(activosfijosporramosAux.getId()<0) {
						activosfijosporramossAux.add(activosfijosporramosAux);
					}		
				}
				this.iIdNuevoActivosFijosPorRamos=0L;
				this.activosfijosporramoss.removeAll(activosfijosporramossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoActivosFijosPorRamos 
					&& this.activosfijosporramosLogic.getActivosFijosPorRamoss().size()>0
					) {
					activosfijosporramosAux=this.activosfijosporramosLogic.getActivosFijosPorRamoss().get(this.activosfijosporramosLogic.getActivosFijosPorRamoss().size() - 1);
				
					if(activosfijosporramosAux.getId()<0) {
						this.activosfijosporramosLogic.getActivosFijosPorRamoss().remove(activosfijosporramosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoActivosFijosPorRamos && this.activosfijosporramoss.size()>0) {
					activosfijosporramosAux=this.activosfijosporramoss.get(this.activosfijosporramoss.size() - 1);
				
					if(activosfijosporramosAux.getId()<0) {
						this.activosfijosporramoss.remove(activosfijosporramosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoActivosFijosPorRamos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(activosfijosporramos.getId()<0) {
				this.activosfijosporramosLogic.getActivosFijosPorRamoss().remove(this.activosfijosporramos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(activosfijosporramos.getId()<0) {
				this.activosfijosporramoss.remove(this.activosfijosporramos);
			}
		}			
	}
	
	public void setEstadosInicialesActivosFijosPorRamos(List<ActivosFijosPorRamos> activosfijosporramossAux) throws Exception {
		ActivosFijosPorRamosConstantesFunciones.setEstadosInicialesActivosFijosPorRamos(activosfijosporramossAux);
	}
	
	public void setEstadosInicialesActivosFijosPorRamos(ActivosFijosPorRamos activosfijosporramosAux) throws Exception {
		ActivosFijosPorRamosConstantesFunciones.setEstadosInicialesActivosFijosPorRamos(activosfijosporramosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarActivosFijosPorRamosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesActivosFijosPorRamos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarActivosFijosPorRamosActual()) {
				if(!this.isEsNuevoActivosFijosPorRamos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesActivosFijosPorRamos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoActivosFijosPorRamos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarActivosFijosPorRamosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Activos Fijos Por Ramos ?", "MANTENIMIENTO DE Activos Fijos Por Ramos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesActivosFijosPorRamos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ActivosFijosPorRamos activosfijosporramos) throws Exception {
		ActivosFijosPorRamosConstantesFunciones.seleccionarAsignar(this.activosfijosporramos,activosfijosporramos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarActivosFijosPorRamos=this.isPermisoActualizarOriginalActivosFijosPorRamos;
			
			
			this.seleccionarAsignar(activosfijosporramos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesActivosFijosPorRamos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.activosfijosporramosSessionBean.setsFuncionBusquedaRapida(this.activosfijosporramosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoActivosFijosPorRamos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosActivosFijosPorRamos(esParaCancelar);				
				this.cancelarNuevoActivosFijosPorRamos(esParaCancelar);								
			}
			
			this.activosfijosporramos=new ActivosFijosPorRamos();
			
			this.inicializarActivosFijosPorRamos();
			
			this.actualizarEstadoCeldasBotonesActivosFijosPorRamos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarActivosFijosPorRamos() throws Exception {
		try {
			ActivosFijosPorRamosConstantesFunciones.inicializarActivosFijosPorRamos(this.activosfijosporramos);
			
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
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.activosfijosporramosLogic.getActivosFijosPorRamoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteActivosFijosPorRamoss(String sAccionBusqueda,List<ActivosFijosPorRamos> activosfijosporramossParaReportes) throws Exception {
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
					sPathReporteFinal="ActivosFijosPorRamos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ActivosFijosPorRamosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ActivosFijosPorRamosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ActivosFijosPorRamos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Activos Fijos Por Ramoses");		
		parameters.put("busquedapor", ActivosFijosPorRamosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceActivosFijosPorRamos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ActivosFijosPorRamosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ActivosFijosPorRamosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceActivosFijosPorRamos=new JRBeanArrayDataSource(ActivosFijosPorRamosJInternalFrame.TraerActivosFijosPorRamosBeans(activosfijosporramossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceActivosFijosPorRamos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ActivosFijosPorRamosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ActivosFijosPorRamosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ActivosFijosPorRamosBean.TraerActivosFijosPorRamosBeans(activosfijosporramossParaReportes).toArray()));
							
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
				this.generarExcelReporteActivosFijosPorRamoss(sAccionBusqueda,sTipoArchivoReporte,activosfijosporramossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalActivosFijosPorRamoss(sAccionBusqueda,sTipoArchivoReporte,activosfijosporramossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoActivosFijosPorRamosActionPerformed(null);
					//this.generarExcelReporteActivosFijosPorRamoss(sAccionBusqueda,sTipoArchivoReporte,activosfijosporramossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalActivosFijosPorRamoss(sAccionBusqueda,sTipoArchivoReporte,activosfijosporramossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesActivosFijosPorRamoss(sAccionBusqueda,sTipoArchivoReporte,activosfijosporramossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesActivosFijosPorRamoss(sAccionBusqueda,sTipoArchivoReporte,activosfijosporramossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteActivosFijosPorRamoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ActivosFijosPorRamos> activosfijosporramossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"activosfijosporramos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ActivosFijosPorRamoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderActivosFijosPorRamos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ActivosFijosPorRamos activosfijosporramos : activosfijosporramossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ActivosFijosPorRamosConstantesFunciones.generarExcelReporteDataActivosFijosPorRamos("NORMAL",row,workbook,activosfijosporramos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos Por Ramos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderActivosFijosPorRamos(String sTipo,Row row,Workbook workbook) {
		
		ActivosFijosPorRamosConstantesFunciones.generarExcelReporteHeaderActivosFijosPorRamos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalActivosFijosPorRamoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ActivosFijosPorRamos> activosfijosporramossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"activosfijosporramos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ActivosFijosPorRamoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ActivosFijosPorRamos activosfijosporramos : activosfijosporramossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.getActivosFijosPorRamosDescripcion(activosfijosporramos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorRamosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporramos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorRamosConstantesFunciones.LABEL_IDTIPORAMOACTIVOFIJO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_IDTIPORAMOACTIVOFIJO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporramos.gettiporamoactivofijo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRESUBGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRESUBGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporramos.getnombre_sub_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporramos.getnombre_detalle_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorRamosConstantesFunciones.LABEL_CLAVE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_CLAVE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporramos.getclave());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporramos.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorRamosConstantesFunciones.LABEL_FECHACOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_FECHACOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporramos.getfecha_compra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorRamosConstantesFunciones.LABEL_VIDAUTIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_VIDAUTIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporramos.getvida_util());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorRamosConstantesFunciones.LABEL_COSTODECOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_COSTODECOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporramos.getcosto_de_compra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorRamosConstantesFunciones.LABEL_MARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_MARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporramos.getmarca());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorRamosConstantesFunciones.LABEL_MODELO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_MODELO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporramos.getmodelo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMATRICULA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMATRICULA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporramos.getnumero_matricula());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMOTOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMOTOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporramos.getnumero_motor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROCHASIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROCHASIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporramos.getnumero_chasis());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROPLACA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROPLACA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporramos.getnumero_placa());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorRamosConstantesFunciones.LABEL_VALORCOMERCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_VALORCOMERCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporramos.getvalor_comercial());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos Por Ramos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesActivosFijosPorRamoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ActivosFijosPorRamos> activosfijosporramossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ActivosFijosPorRamos> activosfijosporramossRespaldo=null;
		
		classes=ActivosFijosPorRamosConstantesFunciones.getClassesRelationshipsOfActivosFijosPorRamos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.activosfijosporramosLogic.setDatosCliente(this.datosCliente);
		this.activosfijosporramosLogic.setDatosDeep(this.datosDeep);
		this.activosfijosporramosLogic.setIsConDeep(true);
		
		activosfijosporramossRespaldo=this.activosfijosporramosLogic.getActivosFijosPorRamoss();
		
		this.activosfijosporramosLogic.setActivosFijosPorRamoss(activosfijosporramossParaReportes);	
		this.activosfijosporramosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		activosfijosporramossParaReportes=this.activosfijosporramosLogic.getActivosFijosPorRamoss();
		this.activosfijosporramosLogic.setActivosFijosPorRamoss(activosfijosporramossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"activosfijosporramos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ActivosFijosPorRamoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderActivosFijosPorRamos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ActivosFijosPorRamos activosfijosporramos : activosfijosporramossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderActivosFijosPorRamos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ActivosFijosPorRamosConstantesFunciones.generarExcelReporteDataActivosFijosPorRamos("NORMAL",row,workbook,activosfijosporramos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.getActivosFijosPorRamosDescripcion(activosfijosporramos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos Por Ramos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessActivosFijosPorRamos() throws Exception {		
		this.startProcessActivosFijosPorRamos(true);
	}
	
	public void startProcessActivosFijosPorRamos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasActivosFijosPorRamos ,this.jPanelParametrosReportesActivosFijosPorRamos, this.jScrollPanelDatosActivosFijosPorRamos,this.jPanelPaginacionActivosFijosPorRamos, this.jScrollPanelDatosEdicionActivosFijosPorRamos, this.jPanelAccionesActivosFijosPorRamos,this.jPanelAccionesFormularioActivosFijosPorRamos,this.jmenuBarActivosFijosPorRamos,this.jmenuBarDetalleActivosFijosPorRamos,this.jTtoolBarActivosFijosPorRamos,this.jTtoolBarDetalleActivosFijosPorRamos);		
		
		final JTabbedPane jTabbedPaneBusquedasActivosFijosPorRamos=this.jTabbedPaneBusquedasActivosFijosPorRamos; 
		
		final JPanel jPanelParametrosReportesActivosFijosPorRamos=this.jPanelParametrosReportesActivosFijosPorRamos;
		//final JScrollPane jScrollPanelDatosActivosFijosPorRamos=this.jScrollPanelDatosActivosFijosPorRamos;
		final JTable jTableDatosActivosFijosPorRamos=this.jTableDatosActivosFijosPorRamos;		
		final JPanel jPanelPaginacionActivosFijosPorRamos=this.jPanelPaginacionActivosFijosPorRamos;
		//final JScrollPane jScrollPanelDatosEdicionActivosFijosPorRamos=this.jScrollPanelDatosEdicionActivosFijosPorRamos;
		final JPanel jPanelAccionesActivosFijosPorRamos=this.jPanelAccionesActivosFijosPorRamos;
		
		JPanel jPanelCamposAuxiliarActivosFijosPorRamos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarActivosFijosPorRamos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
			jPanelCamposAuxiliarActivosFijosPorRamos=this.jInternalFrameDetalleFormActivosFijosPorRamos.jPanelCamposActivosFijosPorRamos;
			jPanelAccionesFormularioAuxiliarActivosFijosPorRamos=this.jInternalFrameDetalleFormActivosFijosPorRamos.jPanelAccionesFormularioActivosFijosPorRamos;
		}
		
		final JPanel jPanelCamposActivosFijosPorRamos=jPanelCamposAuxiliarActivosFijosPorRamos;
		final JPanel jPanelAccionesFormularioActivosFijosPorRamos=jPanelAccionesFormularioAuxiliarActivosFijosPorRamos;
		
		
		final JMenuBar jmenuBarActivosFijosPorRamos=this.jmenuBarActivosFijosPorRamos;
		final JToolBar jTtoolBarActivosFijosPorRamos=this.jTtoolBarActivosFijosPorRamos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarActivosFijosPorRamos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarActivosFijosPorRamos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
			jmenuBarDetalleAuxiliarActivosFijosPorRamos=this.jInternalFrameDetalleFormActivosFijosPorRamos.jmenuBarDetalleActivosFijosPorRamos;
			jTtoolBarDetalleAuxiliarActivosFijosPorRamos=this.jInternalFrameDetalleFormActivosFijosPorRamos.jTtoolBarDetalleActivosFijosPorRamos;
		}
		
		final JMenuBar jmenuBarDetalleActivosFijosPorRamos=jmenuBarDetalleAuxiliarActivosFijosPorRamos;
		final JToolBar jTtoolBarDetalleActivosFijosPorRamos=jTtoolBarDetalleAuxiliarActivosFijosPorRamos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasActivosFijosPorRamos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesActivosFijosPorRamos;
			processRunnable.jTableDatos=jTableDatosActivosFijosPorRamos;
			processRunnable.jPanelCampos=jPanelCamposActivosFijosPorRamos;
			processRunnable.jPanelPaginacion=jPanelPaginacionActivosFijosPorRamos;
			processRunnable.jPanelAcciones=jPanelAccionesActivosFijosPorRamos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioActivosFijosPorRamos;
			
			
			processRunnable.jmenuBar=jmenuBarActivosFijosPorRamos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleActivosFijosPorRamos;
			processRunnable.jTtoolBar=jTtoolBarActivosFijosPorRamos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleActivosFijosPorRamos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasActivosFijosPorRamos ,jPanelParametrosReportesActivosFijosPorRamos,jTableDatosActivosFijosPorRamos, /*jScrollPanelDatosActivosFijosPorRamos,*/jPanelCamposActivosFijosPorRamos,jPanelPaginacionActivosFijosPorRamos, /*jScrollPanelDatosEdicionActivosFijosPorRamos,*/ jPanelAccionesActivosFijosPorRamos,jPanelAccionesFormularioActivosFijosPorRamos,jmenuBarActivosFijosPorRamos,jmenuBarDetalleActivosFijosPorRamos,jTtoolBarActivosFijosPorRamos,jTtoolBarDetalleActivosFijosPorRamos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasActivosFijosPorRamos ,jPanelParametrosReportesActivosFijosPorRamos, jScrollPanelDatosActivosFijosPorRamos,jPanelPaginacionActivosFijosPorRamos, jScrollPanelDatosEdicionActivosFijosPorRamos, jPanelAccionesActivosFijosPorRamos,jPanelAccionesFormularioActivosFijosPorRamos,jmenuBarActivosFijosPorRamos,jmenuBarDetalleActivosFijosPorRamos,jTtoolBarActivosFijosPorRamos,jTtoolBarDetalleActivosFijosPorRamos);
						
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
	
	public void finishProcessActivosFijosPorRamos() {// throws Exception 
		this.finishProcessActivosFijosPorRamos(true);
	}
	
	public void finishProcessActivosFijosPorRamos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasActivosFijosPorRamos ,this.jPanelParametrosReportesActivosFijosPorRamos, this.jScrollPanelDatosActivosFijosPorRamos,this.jPanelPaginacionActivosFijosPorRamos, this.jScrollPanelDatosEdicionActivosFijosPorRamos, this.jPanelAccionesActivosFijosPorRamos,this.jPanelAccionesFormularioActivosFijosPorRamos,this.jmenuBarActivosFijosPorRamos,this.jmenuBarDetalleActivosFijosPorRamos,this.jTtoolBarActivosFijosPorRamos,this.jTtoolBarDetalleActivosFijosPorRamos);		
		
		final JTabbedPane jTabbedPaneBusquedasActivosFijosPorRamos=this.jTabbedPaneBusquedasActivosFijosPorRamos; 
		
		final JPanel jPanelParametrosReportesActivosFijosPorRamos=this.jPanelParametrosReportesActivosFijosPorRamos;
		//final JScrollPane jScrollPanelDatosActivosFijosPorRamos=this.jScrollPanelDatosActivosFijosPorRamos;
		final JTable jTableDatosActivosFijosPorRamos=this.jTableDatosActivosFijosPorRamos;		
		final JPanel jPanelPaginacionActivosFijosPorRamos=this.jPanelPaginacionActivosFijosPorRamos;
		//final JScrollPane jScrollPanelDatosEdicionActivosFijosPorRamos=this.jScrollPanelDatosEdicionActivosFijosPorRamos;
		final JPanel jPanelAccionesActivosFijosPorRamos=this.jPanelAccionesActivosFijosPorRamos;
		
		JPanel jPanelCamposAuxiliarActivosFijosPorRamos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarActivosFijosPorRamos=new JPanel();
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
			jPanelCamposAuxiliarActivosFijosPorRamos=this.jInternalFrameDetalleFormActivosFijosPorRamos.jPanelCamposActivosFijosPorRamos;
			jPanelAccionesFormularioAuxiliarActivosFijosPorRamos=this.jInternalFrameDetalleFormActivosFijosPorRamos.jPanelAccionesFormularioActivosFijosPorRamos;
		}
		
		final JPanel jPanelCamposActivosFijosPorRamos=jPanelCamposAuxiliarActivosFijosPorRamos;
		final JPanel jPanelAccionesFormularioActivosFijosPorRamos=jPanelAccionesFormularioAuxiliarActivosFijosPorRamos;
		
		
		final JMenuBar jmenuBarActivosFijosPorRamos=this.jmenuBarActivosFijosPorRamos;		
		final JToolBar jTtoolBarActivosFijosPorRamos=this.jTtoolBarActivosFijosPorRamos;
				
		JMenuBar jmenuBarDetalleAuxiliarActivosFijosPorRamos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarActivosFijosPorRamos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
			jmenuBarDetalleAuxiliarActivosFijosPorRamos=this.jInternalFrameDetalleFormActivosFijosPorRamos.jmenuBarDetalleActivosFijosPorRamos;
			jTtoolBarDetalleAuxiliarActivosFijosPorRamos=this.jInternalFrameDetalleFormActivosFijosPorRamos.jTtoolBarDetalleActivosFijosPorRamos;		
		}
		
		final JMenuBar jmenuBarDetalleActivosFijosPorRamos=jmenuBarDetalleAuxiliarActivosFijosPorRamos;
		final JToolBar jTtoolBarDetalleActivosFijosPorRamos=jTtoolBarDetalleAuxiliarActivosFijosPorRamos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasActivosFijosPorRamos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesActivosFijosPorRamos;
			processRunnable.jTableDatos=jTableDatosActivosFijosPorRamos;
			processRunnable.jPanelCampos=jPanelCamposActivosFijosPorRamos;
			processRunnable.jPanelPaginacion=jPanelPaginacionActivosFijosPorRamos;
			processRunnable.jPanelAcciones=jPanelAccionesActivosFijosPorRamos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioActivosFijosPorRamos;
			
			
			processRunnable.jmenuBar=jmenuBarActivosFijosPorRamos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleActivosFijosPorRamos;
			processRunnable.jTtoolBar=jTtoolBarActivosFijosPorRamos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleActivosFijosPorRamos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasActivosFijosPorRamos ,jPanelParametrosReportesActivosFijosPorRamos, jTableDatosActivosFijosPorRamos,/*jScrollPanelDatosActivosFijosPorRamos,*/jPanelCamposActivosFijosPorRamos,jPanelPaginacionActivosFijosPorRamos, /*jScrollPanelDatosEdicionActivosFijosPorRamos,*/ jPanelAccionesActivosFijosPorRamos,jPanelAccionesFormularioActivosFijosPorRamos,jmenuBarActivosFijosPorRamos,jmenuBarDetalleActivosFijosPorRamos,jTtoolBarActivosFijosPorRamos,jTtoolBarDetalleActivosFijosPorRamos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesActivosFijosPorRamos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarActivosFijosPorRamos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuActivosFijosPorRamos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarActivosFijosPorRamos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarActivosFijosPorRamos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleActivosFijosPorRamos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuActivosFijosPorRamos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarActivosFijosPorRamos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleActivosFijosPorRamos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.activosfijosporramosConstantesFunciones.getsFinalQueryActivosFijosPorRamos();
		String  finalQueryPaginacionTodos=this.activosfijosporramosConstantesFunciones.getsFinalQueryActivosFijosPorRamos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ActivosFijosPorRamosConstantesFunciones.getArrayColumnasGlobalesNoActivosFijosPorRamos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ActivosFijosPorRamosConstantesFunciones.getArrayColumnasGlobalesActivosFijosPorRamos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ActivosFijosPorRamosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.activosfijosporramossEliminados= new ArrayList<ActivosFijosPorRamos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessActivosFijosPorRamos();
		
				///*ActivosFijosPorRamosSessionBean*/this.activosfijosporramosSessionBean=new ActivosFijosPorRamosSessionBean();
			
			if(this.activosfijosporramosSessionBean==null) {
				this.activosfijosporramosSessionBean=new ActivosFijosPorRamosSessionBean();
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
					this.iNumeroPaginacion=ActivosFijosPorRamosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ActivosFijosPorRamosConstantesFunciones.getClassesForeignKeysOfActivosFijosPorRamos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/activosfijosporramos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			activosfijosporramossAux= new ArrayList<ActivosFijosPorRamos>();
			
				
			activosfijosporramosLogic.setDatosCliente(this.datosCliente);
			activosfijosporramosLogic.setDatosDeep(this.datosDeep);
			activosfijosporramosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaActivosFijosPorRamos")) {
				this.sDetalleReporte=ActivosFijosPorRamosConstantesFunciones.getDetalleIndiceBusquedaActivosFijosPorRamos(id_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					activosfijosporramosLogic.getActivosFijosPorRamossBusquedaActivosFijosPorRamos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ActivosFijosPorRamosConstantesFunciones.getDetalleIndiceBusquedaActivosFijosPorRamos(id_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ActivosFijosPorRamosConstantesFunciones.getDetalleIndiceBusquedaActivosFijosPorRamos(id_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=activosfijosporramosLogic.getActivosFijosPorRamoss()==null||activosfijosporramosLogic.getActivosFijosPorRamoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=activosfijosporramoss==null|| activosfijosporramoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						activosfijosporramossAux=new ArrayList<ActivosFijosPorRamos>();
						activosfijosporramossAux.addAll(activosfijosporramosLogic.getActivosFijosPorRamoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							activosfijosporramossAux=new ArrayList<ActivosFijosPorRamos>();
							activosfijosporramossAux.addAll(activosfijosporramoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							activosfijosporramosLogic.getActivosFijosPorRamossBusquedaActivosFijosPorRamos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ActivosFijosPorRamosConstantesFunciones.getDetalleIndiceBusquedaActivosFijosPorRamos(id_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ActivosFijosPorRamosConstantesFunciones.getDetalleIndiceBusquedaActivosFijosPorRamos(id_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteActivosFijosPorRamoss("BusquedaActivosFijosPorRamos",activosfijosporramosLogic.getActivosFijosPorRamoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteActivosFijosPorRamoss("BusquedaActivosFijosPorRamos",activosfijosporramoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						activosfijosporramosLogic.setActivosFijosPorRamoss(new ArrayList<ActivosFijosPorRamos>());
						activosfijosporramosLogic.getActivosFijosPorRamoss().addAll(activosfijosporramossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							activosfijosporramoss=new ArrayList<ActivosFijosPorRamos>();
							activosfijosporramoss.addAll(activosfijosporramossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesActivosFijosPorRamos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessActivosFijosPorRamos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=activosfijosporramosLogic.getActivosFijosPorRamoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=activosfijosporramoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=activosfijosporramosLogic.getActivosFijosPorRamoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=activosfijosporramoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ActivosFijosPorRamos activosfijosporramos) {
		Boolean permite=true;
		
		if(this.activosfijosporramos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ActivosFijosPorRamosConstantesFunciones.getOrderByListaActivosFijosPorRamos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ActivosFijosPorRamosConstantesFunciones.getOrderByListaActivosFijosPorRamos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ActivosFijosPorRamos activosfijosporramos:activosfijosporramosLogic.getActivosFijosPorRamoss()) {
				if(activosfijosporramos.getsType().equals(Constantes2.S_TOTALES)) {
					activosfijosporramosTotales=activosfijosporramos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ActivosFijosPorRamos activosfijosporramos:this.activosfijosporramoss) {
				if(activosfijosporramos.getsType().equals(Constantes2.S_TOTALES)) {
					activosfijosporramosTotales=activosfijosporramos;
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
			this.activosfijosporramosAux=new ActivosFijosPorRamos();
			this.activosfijosporramosAux.setsType(Constantes2.S_TOTALES);
			this.activosfijosporramosAux.setIsNew(false);
			this.activosfijosporramosAux.setIsChanged(false);
			this.activosfijosporramosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ActivosFijosPorRamosConstantesFunciones.TotalizarValoresFilaActivosFijosPorRamos(this.activosfijosporramosLogic.getActivosFijosPorRamoss(),this.activosfijosporramosAux);
				
				//this.activosfijosporramosLogic.getActivosFijosPorRamoss().add(this.activosfijosporramosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ActivosFijosPorRamosConstantesFunciones.TotalizarValoresFilaActivosFijosPorRamos(this.activosfijosporramoss,this.activosfijosporramosAux);
				
				this.activosfijosporramoss.add(this.activosfijosporramosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		activosfijosporramosTotales=new ActivosFijosPorRamos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.activosfijosporramosLogic.getActivosFijosPorRamoss().remove(activosfijosporramosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.activosfijosporramoss.remove(activosfijosporramosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		activosfijosporramosTotales=new ActivosFijosPorRamos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ActivosFijosPorRamos activosfijosporramos:activosfijosporramosLogic.getActivosFijosPorRamoss()) {
				if(activosfijosporramos.getsType().equals(Constantes2.S_TOTALES)) {
					activosfijosporramosTotales=activosfijosporramos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ActivosFijosPorRamosConstantesFunciones.TotalizarValoresFilaActivosFijosPorRamos(this.activosfijosporramosLogic.getActivosFijosPorRamoss(),activosfijosporramosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ActivosFijosPorRamos activosfijosporramos:this.activosfijosporramoss) {
				if(activosfijosporramos.getsType().equals(Constantes2.S_TOTALES)) {
					activosfijosporramosTotales=activosfijosporramos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ActivosFijosPorRamosConstantesFunciones.TotalizarValoresFilaActivosFijosPorRamos(this.activosfijosporramoss,activosfijosporramosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getActivosFijosPorRamossBusquedaActivosFijosPorRamos()throws Exception {
		try {
			sAccionBusqueda="BusquedaActivosFijosPorRamos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getActivosFijosPorRamossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getActivosFijosPorRamossFK_IdTipoRamoActivoFijo()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoRamoActivoFijo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getActivosFijosPorRamossBusquedaActivosFijosPorRamos(String sFinalQuery,Long id_tipo_ramo_activo_fijo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//activosfijosporramosLogic.getActivosFijosPorRamossBusquedaActivosFijosPorRamos(sFinalQuery,this.pagination,id_tipo_ramo_activo_fijo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getActivosFijosPorRamossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//activosfijosporramosLogic.getActivosFijosPorRamossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getActivosFijosPorRamossFK_IdTipoRamoActivoFijo(String sFinalQuery,Long id_tipo_ramo_activo_fijo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//activosfijosporramosLogic.getActivosFijosPorRamossFK_IdTipoRamoActivoFijo(sFinalQuery,this.pagination,id_tipo_ramo_activo_fijo);
				
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
	
	public void inicializarPermisosActivosFijosPorRamos() {
		this.isPermisoTodoActivosFijosPorRamos=false;
		this.isPermisoNuevoActivosFijosPorRamos=false;
		this.isPermisoActualizarActivosFijosPorRamos=false;
		this.isPermisoActualizarOriginalActivosFijosPorRamos=false;
		this.isPermisoEliminarActivosFijosPorRamos=false;
		this.isPermisoGuardarCambiosActivosFijosPorRamos=false;
		this.isPermisoConsultaActivosFijosPorRamos=true;
		this.isPermisoBusquedaActivosFijosPorRamos=true;
		this.isPermisoReporteActivosFijosPorRamos=true;
		this.isPermisoOrdenActivosFijosPorRamos=false;		
		this.isPermisoPaginacionMedioActivosFijosPorRamos=false;		
		this.isPermisoPaginacionAltoActivosFijosPorRamos=false;		
		this.isPermisoPaginacionTodoActivosFijosPorRamos=false;		
		this.isPermisoCopiarActivosFijosPorRamos=false;		
		this.isPermisoVerFormActivosFijosPorRamos=false;		
		this.isPermisoDuplicarActivosFijosPorRamos=false;
		this.isPermisoOrdenActivosFijosPorRamos=false;
	}
	
	public void setPermisosUsuarioActivosFijosPorRamos(Boolean isPermiso) {
		this.isPermisoTodoActivosFijosPorRamos=isPermiso;
		this.isPermisoNuevoActivosFijosPorRamos=isPermiso;
		this.isPermisoActualizarActivosFijosPorRamos=isPermiso;
		this.isPermisoActualizarOriginalActivosFijosPorRamos=isPermiso;
		this.isPermisoEliminarActivosFijosPorRamos=isPermiso;
		this.isPermisoGuardarCambiosActivosFijosPorRamos=isPermiso;
		this.isPermisoConsultaActivosFijosPorRamos=isPermiso;
		this.isPermisoBusquedaActivosFijosPorRamos=isPermiso;
		this.isPermisoReporteActivosFijosPorRamos=isPermiso;
		this.isPermisoOrdenActivosFijosPorRamos=isPermiso;		
		this.isPermisoPaginacionMedioActivosFijosPorRamos=isPermiso;		
		this.isPermisoPaginacionAltoActivosFijosPorRamos=isPermiso;		
		this.isPermisoPaginacionTodoActivosFijosPorRamos=isPermiso;		
		this.isPermisoCopiarActivosFijosPorRamos=isPermiso;		
		this.isPermisoVerFormActivosFijosPorRamos=isPermiso;		
		this.isPermisoDuplicarActivosFijosPorRamos=isPermiso;
		this.isPermisoOrdenActivosFijosPorRamos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioActivosFijosPorRamos(Boolean isPermiso) {
		//this.isPermisoTodoActivosFijosPorRamos=isPermiso;
		this.isPermisoNuevoActivosFijosPorRamos=isPermiso;
		this.isPermisoActualizarActivosFijosPorRamos=isPermiso;
		this.isPermisoActualizarOriginalActivosFijosPorRamos=isPermiso;
		this.isPermisoEliminarActivosFijosPorRamos=isPermiso;
		this.isPermisoGuardarCambiosActivosFijosPorRamos=isPermiso;
		//this.isPermisoConsultaActivosFijosPorRamos=isPermiso;
		//this.isPermisoBusquedaActivosFijosPorRamos=isPermiso;
		//this.isPermisoReporteActivosFijosPorRamos=isPermiso;
		//this.isPermisoOrdenActivosFijosPorRamos=isPermiso;		
		//this.isPermisoPaginacionMedioActivosFijosPorRamos=isPermiso;		
		//this.isPermisoPaginacionAltoActivosFijosPorRamos=isPermiso;		
		//this.isPermisoPaginacionTodoActivosFijosPorRamos=isPermiso;		
		//this.isPermisoCopiarActivosFijosPorRamos=isPermiso;		
		//this.isPermisoDuplicarActivosFijosPorRamos=isPermiso;
		//this.isPermisoOrdenActivosFijosPorRamos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioActivosFijosPorRamosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ActivosFijosPorRamosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebActivosFijosPorRamos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioActivosFijosPorRamosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioActivosFijosPorRamosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionActivosFijosPorRamosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioActivosFijosPorRamosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioActivosFijosPorRamos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ActivosFijosPorRamosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ActivosFijosPorRamosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoActivosFijosPorRamos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarActivosFijosPorRamos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalActivosFijosPorRamos=this.isPermisoActualizarActivosFijosPorRamos;
			this.isPermisoEliminarActivosFijosPorRamos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosActivosFijosPorRamos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaActivosFijosPorRamos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaActivosFijosPorRamos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoActivosFijosPorRamos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteActivosFijosPorRamos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenActivosFijosPorRamos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioActivosFijosPorRamos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoActivosFijosPorRamos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoActivosFijosPorRamos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarActivosFijosPorRamos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormActivosFijosPorRamos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarActivosFijosPorRamos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenActivosFijosPorRamos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosActivosFijosPorRamos.setToolTipText(this.jTableDatosActivosFijosPorRamos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioActivosFijosPorRamos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioActivosFijosPorRamos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ActivosFijosPorRamosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ActivosFijosPorRamosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioActivosFijosPorRamos() throws Exception {
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
	public void inicializarCombosForeignKeyActivosFijosPorRamosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tiporamoactivofijosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyActivosFijosPorRamosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ActivosFijosPorRamosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoRamoActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoRamoActivoFijoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tiporamoactivofijosForeignKey==null||this.tiporamoactivofijosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoRamoActivoFijoConstantesFunciones.getArrayColumnasGlobalesTipoRamoActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRamoActivoFijoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoRamoActivoFijoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoRamoActivoFijosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyActivosFijosPorRamos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoRamoActivoFijo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.activosfijosporramosSessionBean==null) {
				this.activosfijosporramosSessionBean=new ActivosFijosPorRamosSessionBean();
			}

			if(!this.activosfijosporramosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTipoRamoActivoFijo()throws Exception {
		try {

			if(!this.activosfijosporramosSessionBean.getisBusquedaDesdeForeignKeySesionTipoRamoActivoFijo()) {
				TipoRamoActivoFijo tiporamoactivofijo=new TipoRamoActivoFijo();
				TipoRamoActivoFijoConstantesFunciones.setTipoRamoActivoFijoDescripcion(tiporamoactivofijo,Constantes.SMENSAJE_ESCOJA_OPCION);
				tiporamoactivofijo.setId(null);

				if(!TipoRamoActivoFijoConstantesFunciones.ExisteEnLista(this.tiporamoactivofijosForeignKey,tiporamoactivofijo,true)) {

					this.tiporamoactivofijosForeignKey.add(0,tiporamoactivofijo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyActivosFijosPorRamos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyActivosFijosPorRamos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyActivosFijosPorRamos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyActivosFijosPorRamos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyActivosFijosPorRamos(ActivosFijosPorRamos activosfijosporramos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyActivosFijosPorRamos(ActivosFijosPorRamos activosfijosporramos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyActivosFijosPorRamos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyActivosFijosPorRamos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyActivosFijosPorRamos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyActivosFijosPorRamos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroActivosFijosPorRamos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyActivosFijosPorRamos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoRamoActivoFijosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyActivosFijosPorRamos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoRamoActivoFijosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyActivosFijosPorRamos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_empresaActivosFijosPorRamos!=null && this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_empresaActivosFijosPorRamos.getItemCount()>0) {
				this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_empresaActivosFijosPorRamos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos!=null && this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.getItemCount()>0) {
				this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public ActivosFijosPorRamosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ActivosFijosPorRamosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ActivosFijosPorRamosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.activosfijosporramosSessionBean=new ActivosFijosPorRamosSessionBean(); 
		this.activosfijosporramosConstantesFunciones=new ActivosFijosPorRamosConstantesFunciones(); 
		this.activosfijosporramosBean=new ActivosFijosPorRamos();//(this.activosfijosporramosConstantesFunciones); 		
		this.activosfijosporramosReturnGeneral=new ActivosFijosPorRamosParameterReturnGeneral(); 
		
		this.activosfijosporramosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.activosfijosporramosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ActivosFijosPorRamosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ActivosFijosPorRamosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ActivosFijosPorRamosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessActivosFijosPorRamos(true);
			
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
			
			this.activosfijosporramosConstantesFunciones=new ActivosFijosPorRamosConstantesFunciones(); 
			this.activosfijosporramosBean=new ActivosFijosPorRamos();//this.activosfijosporramosConstantesFunciones); 			
			this.activosfijosporramosReturnGeneral=new ActivosFijosPorRamosParameterReturnGeneral(); 
		
			ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Activos Fijos Por Ramos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.activosfijosporramos=new ActivosFijosPorRamos();
			this.activosfijosporramoss = new ArrayList<ActivosFijosPorRamos>();
			this.activosfijosporramossAux = new ArrayList<ActivosFijosPorRamos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic=new ActivosFijosPorRamosLogic();
				this.activosfijosporramosLogic.getNewConnexionToDeep("");
			}
			
			//this.activosfijosporramosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.activosfijosporramosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormActivosFijosPorRamos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoActivosFijosPorRamos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoActivosFijosPorRamos);	
					}
					
					if(this.jInternalFrameImportacionActivosFijosPorRamos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionActivosFijosPorRamos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByActivosFijosPorRamos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByActivosFijosPorRamos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormActivosFijosPorRamos);
				this.jInternalFrameDetalleFormActivosFijosPorRamos.setVisible(false);
				this.jInternalFrameDetalleFormActivosFijosPorRamos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoActivosFijosPorRamos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoActivosFijosPorRamos);
					this.jInternalFrameReporteDinamicoActivosFijosPorRamos.setVisible(false);
					this.jInternalFrameReporteDinamicoActivosFijosPorRamos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionActivosFijosPorRamos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionActivosFijosPorRamos);
					this.jInternalFrameImportacionActivosFijosPorRamos.setVisible(false);
					this.jInternalFrameImportacionActivosFijosPorRamos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByActivosFijosPorRamos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByActivosFijosPorRamos);
					this.jInternalFrameOrderByActivosFijosPorRamos.setVisible(false);
					this.jInternalFrameOrderByActivosFijosPorRamos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idActivosFijosPorRamosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ActivosFijosPorRamosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.activosfijosporramosReturnGeneral=new ActivosFijosPorRamosParameterReturnGeneral();
			
			this.activosfijosporramosParameterGeneral=new ActivosFijosPorRamosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.activosfijosporramosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ActivosFijosPorRamosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ActivosFijosPorRamosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.activosfijosporramosSessionBean.getEsGuardarRelacionado(),this.activosfijosporramosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ActivosFijosPorRamosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.activosfijosporramosSessionBean.getEsGuardarRelacionado(),this.activosfijosporramosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoActivosFijosPorRamos=false;
			this.isVisibilidadCeldaDuplicarActivosFijosPorRamos=true;
			this.isVisibilidadCeldaCopiarActivosFijosPorRamos=true;
			this.isVisibilidadCeldaVerFormActivosFijosPorRamos=true;
			this.isVisibilidadCeldaOrdenActivosFijosPorRamos=true;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos=false;
			this.isVisibilidadCeldaModificarActivosFijosPorRamos=false;
			this.isVisibilidadCeldaActualizarActivosFijosPorRamos=false;
			this.isVisibilidadCeldaEliminarActivosFijosPorRamos=false;
			this.isVisibilidadCeldaCancelarActivosFijosPorRamos=false;
			this.isVisibilidadCeldaGuardarActivosFijosPorRamos=false;
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos=false;
			
			
			this.isVisibilidadBusquedaActivosFijosPorRamos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoRamoActivoFijo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesActivosFijosPorRamos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosActivosFijosPorRamos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioActivosFijosPorRamos(false);
			
			this.setPermisosUsuarioActivosFijosPorRamos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.activosfijosporramosSessionBean.getEsGuardarRelacionado() 
				|| (this.activosfijosporramosSessionBean.getEsGuardarRelacionado() && this.activosfijosporramosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioActivosFijosPorRamosClasesRelacionadas();
			}
			
			if(this.activosfijosporramosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioActivosFijosPorRamosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosActivosFijosPorRamos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualActivosFijosPorRamos();
			}
			
			if(!this.isPermisoBusquedaActivosFijosPorRamos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasActivosFijosPorRamos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ActivosFijosPorRamosConstantesFunciones.getTiposSeleccionarActivosFijosPorRamos());
				
				this.tiposColumnasSelect=ActivosFijosPorRamosConstantesFunciones.getTiposSeleccionarActivosFijosPorRamos(true);
				
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
			//if(!this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioActivosFijosPorRamos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioActivosFijosPorRamos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioActivosFijosPorRamos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesActivosFijosPorRamos() ;
			
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
			this.tiporamoactivofijoLogic=new TipoRamoActivoFijoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				activosfijosporramosImplementable= (ActivosFijosPorRamosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ActivosFijosPorRamosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				activosfijosporramosImplementableHome= (ActivosFijosPorRamosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ActivosFijosPorRamosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.activosfijosporramoss= new ArrayList<ActivosFijosPorRamos>();
			this.activosfijosporramossEliminados= new ArrayList<ActivosFijosPorRamos>();
						
			this.isEsNuevoActivosFijosPorRamos=false;
			this.esParaAccionDesdeFormularioActivosFijosPorRamos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tiporamoactivofijosForeignKey=new ArrayList<TipoRamoActivoFijo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyActivosFijosPorRamos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroActivosFijosPorRamos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ActivosFijosPorRamosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesActivosFijosPorRamos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingActivosFijosPorRamos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioActivosFijosPorRamos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioActivosFijosPorRamos();
			}
			
			ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasActivosFijosPorRamos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasActivosFijosPorRamos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasActivosFijosPorRamos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessActivosFijosPorRamos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ActivosFijosPorRamos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectActivosFijosPorRamos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesActivosFijosPorRamos")) {
				iIndex=this.jInternalFrameDetalleFormActivosFijosPorRamos.jTabbedPaneRelacionesActivosFijosPorRamos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormActivosFijosPorRamos.jTabbedPaneRelacionesActivosFijosPorRamos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessActivosFijosPorRamos();	
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
	
	public void cargarCombosForeignKeyActivosFijosPorRamos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyActivosFijosPorRamos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyActivosFijosPorRamos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyActivosFijosPorRamosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyActivosFijosPorRamos();
		
		this.cargarCombosFrameForeignKeyActivosFijosPorRamos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyActivosFijosPorRamos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyActivosFijosPorRamos();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoRamoActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoRamoActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoRamoActivoFijo();
				this.cargarCombosFrameTipoRamoActivoFijosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoRamoActivoFijo(this.tiporamoactivofijosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoActivosFijosPorRamosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.activosfijosporramosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormActivosFijosPorRamos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
			
			
			if(jTableDatosActivosFijosPorRamos.getRowCount()>=1) {
				jTableDatosActivosFijosPorRamos.removeRowSelectionInterval(0, jTableDatosActivosFijosPorRamos.getRowCount()-1);						
			}
			
			this.isEsNuevoActivosFijosPorRamos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoActivosFijosPorRamos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesActivosFijosPorRamos(true);			
			//this.activosfijosporramos=new ActivosFijosPorRamos();
			//this.activosfijosporramos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesActivosFijosPorRamos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualActivosFijosPorRamos() ;
			
			if(ActivosFijosPorRamosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleActivosFijosPorRamos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.activosfijosporramos);	
			this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporramos);				
			
			ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
			
			if(this.activosfijosporramosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ActivosFijosPorRamos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarActivosFijosPorRamosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ActivosFijosPorRamos> activosfijosporramossSeleccionados=new ArrayList<ActivosFijosPorRamos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosActivosFijosPorRamos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosActivosFijosPorRamos.getSelectedRows().length;			
			}
			
			activosfijosporramossSeleccionados=this.getActivosFijosPorRamossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoActivosFijosPorRamos--;			
				//ActivosFijosPorRamos activosfijosporramosAux= new ActivosFijosPorRamos();			
				//activosfijosporramosAux.setId(this.iIdNuevoActivosFijosPorRamos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ActivosFijosPorRamos activosfijosporramosOrigen=new ActivosFijosPorRamos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ActivosFijosPorRamos activosfijosporramosOrigen : activosfijosporramossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							activosfijosporramosOrigen =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							activosfijosporramosOrigen =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaActivosFijosPorRamos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.activosfijosporramos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosActivosFijosPorRamos(activosfijosporramosOrigen,this.activosfijosporramos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.activosfijosporramosLogic.getActivosFijosPorRamoss().add(this.activosfijosporramosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.activosfijosporramoss.add(this.activosfijosporramosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaActivosFijosPorRamos(false);
				
				this.jTableDatosActivosFijosPorRamos.setRowSelectionInterval(this.getIndiceNuevoActivosFijosPorRamos(), this.getIndiceNuevoActivosFijosPorRamos());
				
				int iLastRow =  this.jTableDatosActivosFijosPorRamos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosActivosFijosPorRamos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosActivosFijosPorRamos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaActivosFijosPorRamos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ActivosFijosPorRamos> activosfijosporramossSeleccionados=new ArrayList<ActivosFijosPorRamos>();									
		
			ActivosFijosPorRamos activosfijosporramosOrigen=new ActivosFijosPorRamos();
			ActivosFijosPorRamos activosfijosporramosDestino=new ActivosFijosPorRamos();
				
			activosfijosporramossSeleccionados=this.getActivosFijosPorRamossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosActivosFijosPorRamos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || activosfijosporramossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosActivosFijosPorRamos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						activosfijosporramosOrigen =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						activosfijosporramosOrigen =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						activosfijosporramosDestino =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						activosfijosporramosDestino =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				activosfijosporramosOrigen =activosfijosporramossSeleccionados.get(0);
				activosfijosporramosDestino =activosfijosporramossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosActivosFijosPorRamos(activosfijosporramosOrigen,activosfijosporramosDestino,true,false);
				
				activosfijosporramosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(activosfijosporramosDestino,activosfijosporramosLogic.getActivosFijosPorRamoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(activosfijosporramosDestino,activosfijosporramoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaActivosFijosPorRamos(false);
				
				//this.jTableDatosActivosFijosPorRamos.setRowSelectionInterval(this.getIndiceNuevoActivosFijosPorRamos(), this.getIndiceNuevoActivosFijosPorRamos());
				
				int iLastRow =  this.jTableDatosActivosFijosPorRamos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosActivosFijosPorRamos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosActivosFijosPorRamos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaActivosFijosPorRamos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormActivosFijosPorRamos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormActivosFijosPorRamos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesActivosFijosPorRamos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasActivosFijosPorRamos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesActivosFijosPorRamos.setVisible(!isVisible);
			this.jPanelPaginacionActivosFijosPorRamos.setVisible(!isVisible);
			this.jPanelAccionesActivosFijosPorRamos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameActivosFijosPorRamos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoActivosFijosPorRamos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionActivosFijosPorRamos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByActivosFijosPorRamos();
			
			this.abrirFrameOrderByActivosFijosPorRamos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByActivosFijosPorRamos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleActivosFijosPorRamos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormActivosFijosPorRamos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormActivosFijosPorRamos.isMaximum()) {
					this.jInternalFrameDetalleFormActivosFijosPorRamos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormActivosFijosPorRamos.setSize(this.jInternalFrameDetalleFormActivosFijosPorRamos.iWidthFormulario,this.jInternalFrameDetalleFormActivosFijosPorRamos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormActivosFijosPorRamos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormActivosFijosPorRamos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormActivosFijosPorRamos.isMaximum()) {
						this.jInternalFrameDetalleFormActivosFijosPorRamos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormActivosFijosPorRamos.jContentPaneDetalleActivosFijosPorRamos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormActivosFijosPorRamos.jTabbedPaneRelacionesActivosFijosPorRamos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormActivosFijosPorRamos.jContentPaneDetalleActivosFijosPorRamos.getWidth(),ActivosFijosPorRamosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormActivosFijosPorRamos.jTabbedPaneRelacionesActivosFijosPorRamos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormActivosFijosPorRamos.jContentPaneDetalleActivosFijosPorRamos.getWidth(),ActivosFijosPorRamosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormActivosFijosPorRamos.jTabbedPaneRelacionesActivosFijosPorRamos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormActivosFijosPorRamos.jContentPaneDetalleActivosFijosPorRamos.getWidth(),ActivosFijosPorRamosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormActivosFijosPorRamos.setVisible(true);
	        this.jInternalFrameDetalleFormActivosFijosPorRamos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByActivosFijosPorRamos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByActivosFijosPorRamos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByActivosFijosPorRamos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByActivosFijosPorRamos,false,this);
				} else {
					this.jInternalFrameOrderByActivosFijosPorRamos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByActivosFijosPorRamos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByActivosFijosPorRamos);
				this.jInternalFrameOrderByActivosFijosPorRamos.setVisible(false);
				this.jInternalFrameOrderByActivosFijosPorRamos.setSelected(false);
				
				this.jInternalFrameOrderByActivosFijosPorRamos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByActivosFijosPorRamos"));
				
				this.inicializarActualizarBindingTablaOrderByActivosFijosPorRamos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionActivosFijosPorRamos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionActivosFijosPorRamos==null) {
				
				this.jInternalFrameImportacionActivosFijosPorRamos=new ImportacionJInternalFrame(ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionActivosFijosPorRamos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionActivosFijosPorRamos);
				this.jInternalFrameImportacionActivosFijosPorRamos.setVisible(false);
				this.jInternalFrameImportacionActivosFijosPorRamos.setSelected(false);


				this.jInternalFrameImportacionActivosFijosPorRamos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionActivosFijosPorRamos"));
				this.jInternalFrameImportacionActivosFijosPorRamos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionActivosFijosPorRamos"));
				this.jInternalFrameImportacionActivosFijosPorRamos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionActivosFijosPorRamos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoActivosFijosPorRamos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoActivosFijosPorRamos==null) {
				this.jInternalFrameReporteDinamicoActivosFijosPorRamos=new ReporteDinamicoJInternalFrame(ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoActivosFijosPorRamos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoActivosFijosPorRamos);
				this.jInternalFrameReporteDinamicoActivosFijosPorRamos.setVisible(false);
				this.jInternalFrameReporteDinamicoActivosFijosPorRamos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoActivosFijosPorRamos"));
				this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoActivosFijosPorRamos"));
				this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoActivosFijosPorRamos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualActivosFijosPorRamos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleActivosFijosPorRamos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormActivosFijosPorRamos);
			
	       	this.jInternalFrameDetalleFormActivosFijosPorRamos.setVisible(false);
	        this.jInternalFrameDetalleFormActivosFijosPorRamos.setSelected(false);
			
			//this.jInternalFrameDetalleFormActivosFijosPorRamos.dispose();
			//this.jInternalFrameDetalleFormActivosFijosPorRamos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoActivosFijosPorRamos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoActivosFijosPorRamos.setVisible(true);
	        this.jInternalFrameReporteDinamicoActivosFijosPorRamos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionActivosFijosPorRamos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionActivosFijosPorRamos.setVisible(true);
	        this.jInternalFrameImportacionActivosFijosPorRamos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByActivosFijosPorRamos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByActivosFijosPorRamos.setVisible(true);
	        this.jInternalFrameOrderByActivosFijosPorRamos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByActivosFijosPorRamos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByActivosFijosPorRamos.setVisible(false);
	        this.jInternalFrameOrderByActivosFijosPorRamos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoActivosFijosPorRamos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoActivosFijosPorRamos.setVisible(false);
	        this.jInternalFrameReporteDinamicoActivosFijosPorRamos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionActivosFijosPorRamos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionActivosFijosPorRamos.setVisible(false);
	        this.jInternalFrameImportacionActivosFijosPorRamos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarActivosFijosPorRamos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarActivosFijosPorRamos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesActivosFijosPorRamos(true);
			//this.isEsNuevoActivosFijosPorRamos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesActivosFijosPorRamos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesActivosFijosPorRamos(false) ;
			
			if(activosfijosporramosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ActivosFijosPorRamosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleActivosFijosPorRamos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualActivosFijosPorRamos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaActivosFijosPorRamosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarActivosFijosPorRamos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormActivosFijosPorRamos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesActivosFijosPorRamos(true);
			//this.isEsNuevoActivosFijosPorRamos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.activosfijosporramos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesActivosFijosPorRamos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesActivosFijosPorRamos(false) ;
			
			if(ActivosFijosPorRamosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleActivosFijosPorRamos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualActivosFijosPorRamos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoRamoActivoFijo(List<TipoRamoActivoFijo> tiporamoactivofijosForeignKey)throws Exception{
		TableColumn tableColumnTipoRamoActivoFijo=this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorRamos,ActivosFijosPorRamosConstantesFunciones.LABEL_IDTIPORAMOACTIVOFIJO));
		TableCellEditor tableCellEditorTipoRamoActivoFijo =tableColumnTipoRamoActivoFijo.getCellEditor();

		TipoRamoActivoFijoTableCell tiporamoactivofijoTableCellFk=(TipoRamoActivoFijoTableCell)tableCellEditorTipoRamoActivoFijo;

		if(tiporamoactivofijoTableCellFk!=null) {
			tiporamoactivofijoTableCellFk.settiporamoactivofijosForeignKey(tiporamoactivofijosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosActivosFijosPorRamos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tiporamoactivofijoTableCellFk.setRowActual(intSelectedRow);
			//tiporamoactivofijoTableCellFk.settiporamoactivofijosForeignKeyActual(tiporamoactivofijosForeignKey);
		//}


		if(tiporamoactivofijoTableCellFk!=null) {
			tiporamoactivofijoTableCellFk.RecargarTipoRamoActivoFijosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesActivosFijosPorRamos(false);
			
			//if(!this.isEsNuevoActivosFijosPorRamos) {								
				int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
				
			}
			
			if(this.permiteMantenimiento(this.activosfijosporramos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoActivosFijosPorRamos=true;
					this.inicializarActualizarBindingTablaActivosFijosPorRamos(false);
					this.isEsNuevoActivosFijosPorRamos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoActivosFijosPorRamos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoActivosFijosPorRamos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesActivosFijosPorRamos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualActivosFijosPorRamos(false);
				
				this.habilitarDeshabilitarControlesActivosFijosPorRamos(false);
			
												
				
				if(ActivosFijosPorRamosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleActivosFijosPorRamos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoActivosFijosPorRamosActionPerformed(evt,activosfijosporramosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualActivosFijosPorRamos(this.activosfijosporramos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosActivosFijosPorRamos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,activosfijosporramosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.activosfijosporramos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorRamos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorRamos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				this.activosfijosporramos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				this.activosfijosporramos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.activosfijosporramos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ActivosFijosPorRamosModel) this.jTableDatosActivosFijosPorRamos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoActivosFijosPorRamos=true;
				this.inicializarActualizarBindingTablaActivosFijosPorRamos(false);
				this.isEsNuevoActivosFijosPorRamos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesActivosFijosPorRamos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualActivosFijosPorRamos(false);
				
				this.habilitarDeshabilitarControlesActivosFijosPorRamos(false);
				
				
				
				if(ActivosFijosPorRamosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleActivosFijosPorRamos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosActivosFijosPorRamos.getRowCount()>=1) {
				jTableDatosActivosFijosPorRamos.removeRowSelectionInterval(0, jTableDatosActivosFijosPorRamos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesActivosFijosPorRamos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaActivosFijosPorRamos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesActivosFijosPorRamos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualActivosFijosPorRamos(false) ;
			
			this.isEsNuevoActivosFijosPorRamos=false;
			
			if(ActivosFijosPorRamosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleActivosFijosPorRamos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingActivosFijosPorRamos(false);
				
				//SI ES MANUAL
				if(ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualActivosFijosPorRamos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoActivosFijosPorRamos--;			
			//ActivosFijosPorRamos activosfijosporramosAux= new ActivosFijosPorRamos();			
			//activosfijosporramosAux.setId(this.iIdNuevoActivosFijosPorRamos);
			
			if(this.jInternalFrameDetalleFormActivosFijosPorRamos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaActivosFijosPorRamos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
			
			this.activosfijosporramos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.activosfijosporramosLogic.getActivosFijosPorRamoss().add(this.activosfijosporramosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.activosfijosporramoss.add(this.activosfijosporramosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaActivosFijosPorRamos(false);
			
			this.jTableDatosActivosFijosPorRamos.setRowSelectionInterval(this.getIndiceNuevoActivosFijosPorRamos(), this.getIndiceNuevoActivosFijosPorRamos());
			
			int iLastRow =  this.jTableDatosActivosFijosPorRamos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosActivosFijosPorRamos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosActivosFijosPorRamos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaActivosFijosPorRamos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingActivosFijosPorRamos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingActivosFijosPorRamos(false);
			
			//SI ES MANUAL
			if(ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualActivosFijosPorRamos();
			}
			
			//this.abrirFrameTreeActivosFijosPorRamos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionActivosFijosPorRamos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionActivosFijosPorRamos.setFileImportacion(this.jInternalFrameImportacionActivosFijosPorRamos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionActivosFijosPorRamos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionActivosFijosPorRamos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionActivosFijosPorRamos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionActivosFijosPorRamos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ActivosFijosPorRamos> activosfijosporramossSeleccionados=new ArrayList<ActivosFijosPorRamos>();		

		activosfijosporramossSeleccionados=this.getActivosFijosPorRamossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ActivosFijosPorRamosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ActivosFijosPorRamosBaseDesign.jrxml";
			
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
			
			this.generarReporteActivosFijosPorRamoss("Todos",activosfijosporramossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos Por Ramos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSubGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSubGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSubGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSubGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreDetalleGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreDetalleGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreDetalleGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreDetalleGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_CLAVE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ave_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ave_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ave_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ave_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_FECHACOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_VIDAUTIL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_daUtil_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_daUtil_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_daUtil_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_daUtil_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_COSTODECOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoDeCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoDeCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoDeCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoDeCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_MARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_MODELO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_delo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_delo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_delo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_delo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMATRICULA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMatricula_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMatricula_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMatricula_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMatricula_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMOTOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMotor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMotor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMotor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMotor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROCHASIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroChasis_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroChasis_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroChasis_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroChasis_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROPLACA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPlaca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPlaca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPlaca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPlaca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_VALORCOMERCIAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorComercial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorComercial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorComercial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorComercial_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					sNombreCampoCategoria="nombre_sub_grupo";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					sNombreCampoCategoria="nombre_detalle_grupo";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_CLAVE:
					sNombreCampoCategoria="clave";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_FECHACOMPRA:
					sNombreCampoCategoria="fecha_compra";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_VIDAUTIL:
					sNombreCampoCategoria="vida_util";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_COSTODECOMPRA:
					sNombreCampoCategoria="costo_de_compra";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_MARCA:
					sNombreCampoCategoria="marca";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_MODELO:
					sNombreCampoCategoria="modelo";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMATRICULA:
					sNombreCampoCategoria="numero_matricula";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMOTOR:
					sNombreCampoCategoria="numero_motor";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROCHASIS:
					sNombreCampoCategoria="numero_chasis";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROPLACA:
					sNombreCampoCategoria="numero_placa";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_VALORCOMERCIAL:
					sNombreCampoCategoria="valor_comercial";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					sNombreCampoCategoriaValor="nombre_sub_grupo";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					sNombreCampoCategoriaValor="nombre_detalle_grupo";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_CLAVE:
					sNombreCampoCategoriaValor="clave";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_FECHACOMPRA:
					sNombreCampoCategoriaValor="fecha_compra";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_VIDAUTIL:
					sNombreCampoCategoriaValor="vida_util";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_COSTODECOMPRA:
					sNombreCampoCategoriaValor="costo_de_compra";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_MARCA:
					sNombreCampoCategoriaValor="marca";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_MODELO:
					sNombreCampoCategoriaValor="modelo";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMATRICULA:
					sNombreCampoCategoriaValor="numero_matricula";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMOTOR:
					sNombreCampoCategoriaValor="numero_motor";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROCHASIS:
					sNombreCampoCategoriaValor="numero_chasis";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROPLACA:
					sNombreCampoCategoriaValor="numero_placa";
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_VALORCOMERCIAL:
					sNombreCampoCategoriaValor="valor_comercial";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sub Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sub_grupo");
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Detalle Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_detalle_grupo");
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_CLAVE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Clave",sNombreCampoCategoria,sNombreCampoCategoriaValor,"clave");
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_FECHACOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_compra");
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_VIDAUTIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Va Util",sNombreCampoCategoria,sNombreCampoCategoriaValor,"vida_util");
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_COSTODECOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_de_compra");
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_MARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"marca");
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_MODELO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modelo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"modelo");
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMATRICULA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Matricula",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_matricula");
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMOTOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Motor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_motor");
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROCHASIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Chasis",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_chasis");
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROPLACA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Placa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_placa");
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_VALORCOMERCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Comercial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_comercial");
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
	
	public void jButtonGenerarExcelReporteDinamicoActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ActivosFijosPorRamos> activosfijosporramossSeleccionados=new ArrayList<ActivosFijosPorRamos>();		
		
		activosfijosporramossSeleccionados=this.getActivosFijosPorRamossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"activosfijosporramos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ActivosFijosPorRamoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ActivosFijosPorRamosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ActivosFijosPorRamos activosfijosporramos:activosfijosporramossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporramos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_IDTIPORAMOACTIVOFIJO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_IDTIPORAMOACTIVOFIJO);
					iRow++;

					for(ActivosFijosPorRamos activosfijosporramos:activosfijosporramossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporramos.gettiporamoactivofijo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRESUBGRUPO);
					iRow++;

					for(ActivosFijosPorRamos activosfijosporramos:activosfijosporramossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporramos.getnombre_sub_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
					iRow++;

					for(ActivosFijosPorRamos activosfijosporramos:activosfijosporramossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporramos.getnombre_detalle_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_CLAVE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_CLAVE);
					iRow++;

					for(ActivosFijosPorRamos activosfijosporramos:activosfijosporramossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporramos.getclave());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ActivosFijosPorRamos activosfijosporramos:activosfijosporramossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporramos.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_FECHACOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_FECHACOMPRA);
					iRow++;

					for(ActivosFijosPorRamos activosfijosporramos:activosfijosporramossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporramos.getfecha_compra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_VIDAUTIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_VIDAUTIL);
					iRow++;

					for(ActivosFijosPorRamos activosfijosporramos:activosfijosporramossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporramos.getvida_util());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_COSTODECOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_COSTODECOMPRA);
					iRow++;

					for(ActivosFijosPorRamos activosfijosporramos:activosfijosporramossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporramos.getcosto_de_compra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_MARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_MARCA);
					iRow++;

					for(ActivosFijosPorRamos activosfijosporramos:activosfijosporramossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporramos.getmarca());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_MODELO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_MODELO);
					iRow++;

					for(ActivosFijosPorRamos activosfijosporramos:activosfijosporramossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporramos.getmodelo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMATRICULA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMATRICULA);
					iRow++;

					for(ActivosFijosPorRamos activosfijosporramos:activosfijosporramossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporramos.getnumero_matricula());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMOTOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMOTOR);
					iRow++;

					for(ActivosFijosPorRamos activosfijosporramos:activosfijosporramossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporramos.getnumero_motor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROCHASIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROCHASIS);
					iRow++;

					for(ActivosFijosPorRamos activosfijosporramos:activosfijosporramossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporramos.getnumero_chasis());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROPLACA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROPLACA);
					iRow++;

					for(ActivosFijosPorRamos activosfijosporramos:activosfijosporramossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporramos.getnumero_placa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorRamosConstantesFunciones.LABEL_VALORCOMERCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_VALORCOMERCIAL);
					iRow++;

					for(ActivosFijosPorRamos activosfijosporramos:activosfijosporramossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporramos.getvalor_comercial());
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
			//	this.getFilaCabeceraExportarExcelActivosFijosPorRamos(row);				
			//	iRow++;
			//}				
			
			//for(ActivosFijosPorRamos activosfijosporramosAux:activosfijosporramossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelActivosFijosPorRamos(activosfijosporramosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos Por Ramos",JOptionPane.INFORMATION_MESSAGE);
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
				this.activosfijosporramosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingActivosFijosPorRamos(false);
			
			//SI ES MANUAL
			if(ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualActivosFijosPorRamos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingActivosFijosPorRamos(false);
			
			//SI ES MANUAL
			if(ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualActivosFijosPorRamos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingActivosFijosPorRamos(false);
			
			//SI ES MANUAL
			if(ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualActivosFijosPorRamos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaActivosFijosPorRamos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosActivosFijosPorRamos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosActivosFijosPorRamos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosActivosFijosPorRamos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosActivosFijosPorRamos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosActivosFijosPorRamos.setMinimumSize(dimensionMinimum);
		this.jTableDatosActivosFijosPorRamos.setMaximumSize(dimensionMaximum);
		this.jTableDatosActivosFijosPorRamos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingActivosFijosPorRamos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingActivosFijosPorRamos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingActivosFijosPorRamos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaActivosFijosPorRamos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesActivosFijosPorRamos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasActivosFijosPorRamos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesActivosFijosPorRamos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesActivosFijosPorRamos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualActivosFijosPorRamos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaActivosFijosPorRamos();
		
		this.inicializarActualizarBindingBotonesManualActivosFijosPorRamos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualActivosFijosPorRamos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesActivosFijosPorRamos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualActivosFijosPorRamos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualActivosFijosPorRamos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosActivosFijosPorRamos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosActivosFijosPorRamos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteActivosFijosPorRamos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormActivosFijosPorRamos.jCheckBoxPostAccionNuevoActivosFijosPorRamos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormActivosFijosPorRamos.jCheckBoxPostAccionSinCerrarActivosFijosPorRamos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormActivosFijosPorRamos.jCheckBoxPostAccionSinMensajeActivosFijosPorRamos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosActivosFijosPorRamos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosActivosFijosPorRamos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteActivosFijosPorRamos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
				this.jInternalFrameDetalleFormActivosFijosPorRamos.jCheckBoxPostAccionNuevoActivosFijosPorRamos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormActivosFijosPorRamos.jCheckBoxPostAccionSinCerrarActivosFijosPorRamos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormActivosFijosPorRamos.jCheckBoxPostAccionSinMensajeActivosFijosPorRamos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionActivosFijosPorRamos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionActivosFijosPorRamos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxTiposAccionesFormularioActivosFijosPorRamos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesActivosFijosPorRamos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoActivosFijosPorRamos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesActivosFijosPorRamos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesActivosFijosPorRamos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarActivosFijosPorRamos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesActivosFijosPorRamos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoActivosFijosPorRamos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesActivosFijosPorRamos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralActivosFijosPorRamos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesActivosFijosPorRamos(Boolean esInicializar) throws Exception {
		try	{	
			if(ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualActivosFijosPorRamos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesActivosFijosPorRamos() throws Exception {
		try	{
			if(ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualActivosFijosPorRamos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleActivosFijosPorRamos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxTiposAccionesFormularioActivosFijosPorRamos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxTiposAccionesFormularioActivosFijosPorRamos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualActivosFijosPorRamos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesActivosFijosPorRamos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesActivosFijosPorRamos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesActivosFijosPorRamos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesActivosFijosPorRamos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesActivosFijosPorRamos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesActivosFijosPorRamos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionActivosFijosPorRamos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionActivosFijosPorRamos.addItem(reporte);
			}
			
			
			if(!this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionActivosFijosPorRamos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionActivosFijosPorRamos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesActivosFijosPorRamos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesActivosFijosPorRamos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesActivosFijosPorRamos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesActivosFijosPorRamos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxTiposAccionesFormularioActivosFijosPorRamos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxTiposAccionesFormularioActivosFijosPorRamos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarActivosFijosPorRamos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarActivosFijosPorRamos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarActivosFijosPorRamos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualActivosFijosPorRamos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualActivosFijosPorRamos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoActivosFijosPorRamos!=null) {
				this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoActivosFijosPorRamos!=null) {
				this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoActivosFijosPorRamos!=null) {
				
				if(this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ActivosFijosPorRamosConstantesFunciones.getTiposSeleccionarActivosFijosPorRamos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ActivosFijosPorRamosConstantesFunciones.getTiposSeleccionarActivosFijosPorRamos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ActivosFijosPorRamosConstantesFunciones.getTiposSeleccionarActivosFijosPorRamos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualActivosFijosPorRamos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos.getSelectedItem()!=null){this.id_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamos=((TipoRamoActivoFijo)this.jComboBoxid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasActivosFijosPorRamos(Boolean esInicializar) throws Exception {				
		if(ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualActivosFijosPorRamos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaActivosFijosPorRamos() throws Exception {
		this.inicializarActualizarBindingTablaActivosFijosPorRamos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByActivosFijosPorRamos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByActivosFijosPorRamos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByActivosFijosPorRamos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByActivosFijosPorRamos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ActivosFijosPorRamosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByActivosFijosPorRamos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByActivosFijosPorRamos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ActivosFijosPorRamosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosActivosFijosPorRamosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorRamosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ActivosFijosPorRamosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByActivosFijosPorRamos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByActivosFijosPorRamos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ActivosFijosPorRamosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByActivosFijosPorRamos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaActivosFijosPorRamos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=activosfijosporramosLogic.getActivosFijosPorRamoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=activosfijosporramoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosActivosFijosPorRamos.setModel(new ActivosFijosPorRamosModel(this.activosfijosporramosLogic.getActivosFijosPorRamoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosActivosFijosPorRamos.setModel(new ActivosFijosPorRamosModel(this.activosfijosporramoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByActivosFijosPorRamos!=null && this.jInternalFrameOrderByActivosFijosPorRamos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByActivosFijosPorRamos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorRamos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorRamosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO,activosfijosporramosConstantesFunciones.resaltarSeleccionarActivosFijosPorRamos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO,activosfijosporramosConstantesFunciones.resaltarSeleccionarActivosFijosPorRamos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorRamos,ActivosFijosPorRamosConstantesFunciones.LABEL_ID));

		if(this.activosfijosporramosConstantesFunciones.mostraridActivosFijosPorRamos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorRamosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.activosfijosporramosConstantesFunciones.resaltaridActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activaridActivosFijosPorRamos,iSizeTabla,this,true,"idActivosFijosPorRamos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporramosConstantesFunciones.resaltaridActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activaridActivosFijosPorRamos,this,true,"idActivosFijosPorRamos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorRamos,ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRESUBGRUPO));

		if(this.activosfijosporramosConstantesFunciones.mostrarnombre_sub_grupoActivosFijosPorRamos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRESUBGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.activosfijosporramosConstantesFunciones.resaltarnombre_sub_grupoActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarnombre_sub_grupoActivosFijosPorRamos,iSizeTabla,this,true,"nombre_sub_grupoActivosFijosPorRamos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporramosConstantesFunciones.resaltarnombre_sub_grupoActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarnombre_sub_grupoActivosFijosPorRamos,this,true,"nombre_sub_grupoActivosFijosPorRamos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorRamosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorRamos,ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO));

		if(this.activosfijosporramosConstantesFunciones.mostrarnombre_detalle_grupoActivosFijosPorRamos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.activosfijosporramosConstantesFunciones.resaltarnombre_detalle_grupoActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarnombre_detalle_grupoActivosFijosPorRamos,iSizeTabla,this,true,"nombre_detalle_grupoActivosFijosPorRamos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporramosConstantesFunciones.resaltarnombre_detalle_grupoActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarnombre_detalle_grupoActivosFijosPorRamos,this,true,"nombre_detalle_grupoActivosFijosPorRamos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorRamosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorRamos,ActivosFijosPorRamosConstantesFunciones.LABEL_CLAVE));

		if(this.activosfijosporramosConstantesFunciones.mostrarclaveActivosFijosPorRamos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorRamosConstantesFunciones.LABEL_CLAVE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.activosfijosporramosConstantesFunciones.resaltarclaveActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarclaveActivosFijosPorRamos,iSizeTabla,this,true,"claveActivosFijosPorRamos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporramosConstantesFunciones.resaltarclaveActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarclaveActivosFijosPorRamos,this,true,"claveActivosFijosPorRamos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorRamosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorRamos,ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRE));

		if(this.activosfijosporramosConstantesFunciones.mostrarnombreActivosFijosPorRamos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.activosfijosporramosConstantesFunciones.resaltarnombreActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarnombreActivosFijosPorRamos,iSizeTabla,this,true,"nombreActivosFijosPorRamos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporramosConstantesFunciones.resaltarnombreActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarnombreActivosFijosPorRamos,this,true,"nombreActivosFijosPorRamos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorRamosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorRamos,ActivosFijosPorRamosConstantesFunciones.LABEL_FECHACOMPRA));

		if(this.activosfijosporramosConstantesFunciones.mostrarfecha_compraActivosFijosPorRamos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorRamosConstantesFunciones.LABEL_FECHACOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.activosfijosporramosConstantesFunciones.resaltarfecha_compraActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarfecha_compraActivosFijosPorRamos,iSizeTabla,this,true,"fecha_compraActivosFijosPorRamos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.activosfijosporramosConstantesFunciones.resaltarfecha_compraActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarfecha_compraActivosFijosPorRamos,this,true,"fecha_compraActivosFijosPorRamos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorRamosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorRamos,ActivosFijosPorRamosConstantesFunciones.LABEL_VIDAUTIL));

		if(this.activosfijosporramosConstantesFunciones.mostrarvida_utilActivosFijosPorRamos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorRamosConstantesFunciones.LABEL_VIDAUTIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.activosfijosporramosConstantesFunciones.resaltarvida_utilActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarvida_utilActivosFijosPorRamos,iSizeTabla,this,true,"vida_utilActivosFijosPorRamos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporramosConstantesFunciones.resaltarvida_utilActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarvida_utilActivosFijosPorRamos,this,true,"vida_utilActivosFijosPorRamos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorRamosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorRamos,ActivosFijosPorRamosConstantesFunciones.LABEL_COSTODECOMPRA));

		if(this.activosfijosporramosConstantesFunciones.mostrarcosto_de_compraActivosFijosPorRamos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorRamosConstantesFunciones.LABEL_COSTODECOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.activosfijosporramosConstantesFunciones.resaltarcosto_de_compraActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarcosto_de_compraActivosFijosPorRamos,iSizeTabla,this,true,"costo_de_compraActivosFijosPorRamos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporramosConstantesFunciones.resaltarcosto_de_compraActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarcosto_de_compraActivosFijosPorRamos,this,true,"costo_de_compraActivosFijosPorRamos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorRamosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorRamos,ActivosFijosPorRamosConstantesFunciones.LABEL_MARCA));

		if(this.activosfijosporramosConstantesFunciones.mostrarmarcaActivosFijosPorRamos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorRamosConstantesFunciones.LABEL_MARCA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.activosfijosporramosConstantesFunciones.resaltarmarcaActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarmarcaActivosFijosPorRamos,iSizeTabla,this,true,"marcaActivosFijosPorRamos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporramosConstantesFunciones.resaltarmarcaActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarmarcaActivosFijosPorRamos,this,true,"marcaActivosFijosPorRamos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorRamosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorRamos,ActivosFijosPorRamosConstantesFunciones.LABEL_MODELO));

		if(this.activosfijosporramosConstantesFunciones.mostrarmodeloActivosFijosPorRamos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorRamosConstantesFunciones.LABEL_MODELO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.activosfijosporramosConstantesFunciones.resaltarmodeloActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarmodeloActivosFijosPorRamos,iSizeTabla,this,true,"modeloActivosFijosPorRamos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporramosConstantesFunciones.resaltarmodeloActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarmodeloActivosFijosPorRamos,this,true,"modeloActivosFijosPorRamos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorRamosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorRamos,ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMATRICULA));

		if(this.activosfijosporramosConstantesFunciones.mostrarnumero_matriculaActivosFijosPorRamos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMATRICULA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.activosfijosporramosConstantesFunciones.resaltarnumero_matriculaActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarnumero_matriculaActivosFijosPorRamos,iSizeTabla,this,true,"numero_matriculaActivosFijosPorRamos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporramosConstantesFunciones.resaltarnumero_matriculaActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarnumero_matriculaActivosFijosPorRamos,this,true,"numero_matriculaActivosFijosPorRamos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorRamosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorRamos,ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMOTOR));

		if(this.activosfijosporramosConstantesFunciones.mostrarnumero_motorActivosFijosPorRamos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMOTOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.activosfijosporramosConstantesFunciones.resaltarnumero_motorActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarnumero_motorActivosFijosPorRamos,iSizeTabla,this,true,"numero_motorActivosFijosPorRamos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporramosConstantesFunciones.resaltarnumero_motorActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarnumero_motorActivosFijosPorRamos,this,true,"numero_motorActivosFijosPorRamos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorRamosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorRamos,ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROCHASIS));

		if(this.activosfijosporramosConstantesFunciones.mostrarnumero_chasisActivosFijosPorRamos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROCHASIS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.activosfijosporramosConstantesFunciones.resaltarnumero_chasisActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarnumero_chasisActivosFijosPorRamos,iSizeTabla,this,true,"numero_chasisActivosFijosPorRamos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporramosConstantesFunciones.resaltarnumero_chasisActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarnumero_chasisActivosFijosPorRamos,this,true,"numero_chasisActivosFijosPorRamos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorRamosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorRamos,ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROPLACA));

		if(this.activosfijosporramosConstantesFunciones.mostrarnumero_placaActivosFijosPorRamos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROPLACA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.activosfijosporramosConstantesFunciones.resaltarnumero_placaActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarnumero_placaActivosFijosPorRamos,iSizeTabla,this,true,"numero_placaActivosFijosPorRamos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporramosConstantesFunciones.resaltarnumero_placaActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarnumero_placaActivosFijosPorRamos,this,true,"numero_placaActivosFijosPorRamos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorRamosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorRamos,ActivosFijosPorRamosConstantesFunciones.LABEL_VALORCOMERCIAL));

		if(this.activosfijosporramosConstantesFunciones.mostrarvalor_comercialActivosFijosPorRamos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorRamosConstantesFunciones.LABEL_VALORCOMERCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.activosfijosporramosConstantesFunciones.resaltarvalor_comercialActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarvalor_comercialActivosFijosPorRamos,iSizeTabla,this,true,"valor_comercialActivosFijosPorRamos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporramosConstantesFunciones.resaltarvalor_comercialActivosFijosPorRamos,this.activosfijosporramosConstantesFunciones.activarvalor_comercialActivosFijosPorRamos,this,true,"valor_comercialActivosFijosPorRamos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorRamosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.activosfijosporramosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.activosfijosporramosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.activosfijosporramosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosActivosFijosPorRamos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.activosfijosporramosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.activosfijosporramosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosActivosFijosPorRamos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarActivosFijosPorRamos && this.isPermisoGuardarCambiosActivosFijosPorRamos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.activosfijosporramosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.activosfijosporramosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosActivosFijosPorRamos.addColumn(tableColumn);
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
			
			this.jTableDatosActivosFijosPorRamos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarActivosFijosPorRamos && this.isPermisoGuardarCambiosActivosFijosPorRamos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarActivosFijosPorRamos && this.isPermisoGuardarCambiosActivosFijosPorRamos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosActivosFijosPorRamos.moveColumn(this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosActivosFijosPorRamos.moveColumn(this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosActivosFijosPorRamos.moveColumn(this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosActivosFijosPorRamos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosActivosFijosPorRamos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosActivosFijosPorRamos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosActivosFijosPorRamos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosActivosFijosPorRamos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosActivosFijosPorRamos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=activosfijosporramosLogic.getActivosFijosPorRamoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=activosfijosporramoss.size()-1;
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
		//this.jTableDatosActivosFijosPorRamos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosActivosFijosPorRamos();
			
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
				
				//this.isEsNuevoActivosFijosPorRamos=false;
					
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
			
				if(this.activosfijosporramosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormActivosFijosPorRamos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosActivosFijosPorRamos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosActivosFijosPorRamos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.activosfijosporramos.getsType().equals("DUPLICADO")
				   || this.activosfijosporramos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoActivosFijosPorRamos=true;
				
				} else {
					this.isEsNuevoActivosFijosPorRamos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
					if(this.activosfijosporramos.getId()>=0 && !this.activosfijosporramos.getIsNew()) {						
						this.isEsNuevoActivosFijosPorRamos=false;
						
					} else {
						this.isEsNuevoActivosFijosPorRamos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoActivosFijosPorRamos(esRelaciones);						
				
				this.seleccionarActivosFijosPorRamos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.activosfijosporramos.getId()<0) {
					this.isEsNuevoActivosFijosPorRamos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarActivosFijosPorRamos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarActivosFijosPorRamos(evt,rowIndex);
				}	
				
				if(this.activosfijosporramosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ActivosFijosPorRamos: " + this.dDif); 
					}
				}								
				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarActivosFijosPorRamos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.activosfijosporramos)) {
					if(this.activosfijosporramos.getId()>0) {
						this.activosfijosporramos.setIsDeleted(true);
						
						this.activosfijosporramossEliminados.add(this.activosfijosporramos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.activosfijosporramosLogic.getActivosFijosPorRamoss().remove(this.activosfijosporramos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.activosfijosporramoss.remove(this.activosfijosporramos);				
					}
					
					
					((ActivosFijosPorRamosModel) this.jTableDatosActivosFijosPorRamos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaActivosFijosPorRamos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarActivosFijosPorRamos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoActivosFijosPorRamos) {
			
			if(this.jInternalFrameDetalleFormActivosFijosPorRamos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosActivosFijosPorRamos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosActivosFijosPorRamos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioActivosFijosPorRamos(this.activosfijosporramos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesActivosFijosPorRamos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesActivosFijosPorRamos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualActivosFijosPorRamos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoActivosFijosPorRamos(ActivosFijosPorRamos activosfijosporramos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoActivosFijosPorRamos(activosfijosporramos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoActivosFijosPorRamos(ActivosFijosPorRamos activosfijosporramos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioActivosFijosPorRamos(activosfijosporramos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyActivosFijosPorRamos(activosfijosporramos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyActivosFijosPorRamos(activosfijosporramos);
	}
	
	public void setVariablesObjetoActualToFormularioActivosFijosPorRamos(ActivosFijosPorRamos activosfijosporramos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormActivosFijosPorRamos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelidActivosFijosPorRamos.setText(activosfijosporramos.getId().toString());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombre_sub_grupoActivosFijosPorRamos.setText(activosfijosporramos.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombre_detalle_grupoActivosFijosPorRamos.setText(activosfijosporramos.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldclaveActivosFijosPorRamos.setText(activosfijosporramos.getclave());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombreActivosFijosPorRamos.setText(activosfijosporramos.getnombre());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jDateChooserfecha_compraActivosFijosPorRamos.setDate(activosfijosporramos.getfecha_compra());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldvida_utilActivosFijosPorRamos.setText(activosfijosporramos.getvida_util().toString());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldcosto_de_compraActivosFijosPorRamos.setText(activosfijosporramos.getcosto_de_compra().toString());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreamarcaActivosFijosPorRamos.setText(activosfijosporramos.getmarca());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreamodeloActivosFijosPorRamos.setText(activosfijosporramos.getmodelo());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_matriculaActivosFijosPorRamos.setText(activosfijosporramos.getnumero_matricula());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_motorActivosFijosPorRamos.setText(activosfijosporramos.getnumero_motor());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_chasisActivosFijosPorRamos.setText(activosfijosporramos.getnumero_chasis());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_placaActivosFijosPorRamos.setText(activosfijosporramos.getnumero_placa());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldvalor_comercialActivosFijosPorRamos.setText(activosfijosporramos.getvalor_comercial().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ActivosFijosPorRamos activosfijosporramosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,activosfijosporramosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ActivosFijosPorRamos activosfijosporramosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				activosfijosporramosLocal=this.activosfijosporramos;
			} else {
				activosfijosporramosLocal=this.activosfijosporramosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(activosfijosporramosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoActivosFijosPorRamos(activosfijosporramosLocal,true);
					
					if(activosfijosporramosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(activosfijosporramosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(activosfijosporramosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoActivosFijosPorRamos(ActivosFijosPorRamos activosfijosporramos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(activosfijosporramos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(activosfijosporramos);
	}
	
	public void setVariablesFormularioToObjetoActualActivosFijosPorRamos(ActivosFijosPorRamos activosfijosporramos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(activosfijosporramos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualActivosFijosPorRamos(ActivosFijosPorRamos activosfijosporramos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormActivosFijosPorRamos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelidActivosFijosPorRamos.getText()==null || this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelidActivosFijosPorRamos.getText()=="" || this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelidActivosFijosPorRamos.getText()=="Id") {
				this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelidActivosFijosPorRamos.setText("0");
			}

			if(conColumnasBase) {activosfijosporramos.setId(Long.parseLong(this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelidActivosFijosPorRamos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorRamosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelIdActivosFijosPorRamos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporramos.setnombre_sub_grupo(this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombre_sub_grupoActivosFijosPorRamos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRESUBGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelnombre_sub_grupoActivosFijosPorRamos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporramos.setnombre_detalle_grupo(this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombre_detalle_grupoActivosFijosPorRamos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelnombre_detalle_grupoActivosFijosPorRamos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporramos.setclave(this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldclaveActivosFijosPorRamos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorRamosConstantesFunciones.LABEL_CLAVE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelclaveActivosFijosPorRamos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporramos.setnombre(this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombreActivosFijosPorRamos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelnombreActivosFijosPorRamos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporramos.setfecha_compra(this.jInternalFrameDetalleFormActivosFijosPorRamos.jDateChooserfecha_compraActivosFijosPorRamos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorRamosConstantesFunciones.LABEL_FECHACOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelfecha_compraActivosFijosPorRamos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporramos.setvida_util(Double.parseDouble(this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldvida_utilActivosFijosPorRamos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorRamosConstantesFunciones.LABEL_VIDAUTIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelvida_utilActivosFijosPorRamos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporramos.setcosto_de_compra(Double.parseDouble(this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldcosto_de_compraActivosFijosPorRamos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorRamosConstantesFunciones.LABEL_COSTODECOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelcosto_de_compraActivosFijosPorRamos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporramos.setmarca(this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreamarcaActivosFijosPorRamos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorRamosConstantesFunciones.LABEL_MARCA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelmarcaActivosFijosPorRamos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporramos.setmodelo(this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreamodeloActivosFijosPorRamos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorRamosConstantesFunciones.LABEL_MODELO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelmodeloActivosFijosPorRamos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporramos.setnumero_matricula(this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_matriculaActivosFijosPorRamos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMATRICULA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelnumero_matriculaActivosFijosPorRamos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporramos.setnumero_motor(this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_motorActivosFijosPorRamos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMOTOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelnumero_motorActivosFijosPorRamos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporramos.setnumero_chasis(this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_chasisActivosFijosPorRamos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROCHASIS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelnumero_chasisActivosFijosPorRamos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporramos.setnumero_placa(this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_placaActivosFijosPorRamos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROPLACA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelnumero_placaActivosFijosPorRamos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporramos.setvalor_comercial(Double.parseDouble(this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldvalor_comercialActivosFijosPorRamos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorRamosConstantesFunciones.LABEL_VALORCOMERCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelvalor_comercialActivosFijosPorRamos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualActivosFijosPorRamos(ActivosFijosPorRamos activosfijosporramosBean,ActivosFijosPorRamos activosfijosporramos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosActivosFijosPorRamos(ActivosFijosPorRamos activosfijosporramosOrigen,ActivosFijosPorRamos activosfijosporramos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && activosfijosporramosOrigen.getId()!=null && !activosfijosporramosOrigen.getId().equals(0L))) {activosfijosporramos.setId(activosfijosporramosOrigen.getId());}}
			if(conDefault || (!conDefault && activosfijosporramosOrigen.getnombre_sub_grupo()!=null && !activosfijosporramosOrigen.getnombre_sub_grupo().equals(""))) {activosfijosporramos.setnombre_sub_grupo(activosfijosporramosOrigen.getnombre_sub_grupo());}
			if(conDefault || (!conDefault && activosfijosporramosOrigen.getnombre_detalle_grupo()!=null && !activosfijosporramosOrigen.getnombre_detalle_grupo().equals(""))) {activosfijosporramos.setnombre_detalle_grupo(activosfijosporramosOrigen.getnombre_detalle_grupo());}
			if(conDefault || (!conDefault && activosfijosporramosOrigen.getclave()!=null && !activosfijosporramosOrigen.getclave().equals(""))) {activosfijosporramos.setclave(activosfijosporramosOrigen.getclave());}
			if(conDefault || (!conDefault && activosfijosporramosOrigen.getnombre()!=null && !activosfijosporramosOrigen.getnombre().equals(""))) {activosfijosporramos.setnombre(activosfijosporramosOrigen.getnombre());}
			if(conDefault || (!conDefault && activosfijosporramosOrigen.getfecha_compra()!=null && !activosfijosporramosOrigen.getfecha_compra().equals(new Date()))) {activosfijosporramos.setfecha_compra(activosfijosporramosOrigen.getfecha_compra());}
			if(conDefault || (!conDefault && activosfijosporramosOrigen.getvida_util()!=null && !activosfijosporramosOrigen.getvida_util().equals(0.0))) {activosfijosporramos.setvida_util(activosfijosporramosOrigen.getvida_util());}
			if(conDefault || (!conDefault && activosfijosporramosOrigen.getcosto_de_compra()!=null && !activosfijosporramosOrigen.getcosto_de_compra().equals(0.0))) {activosfijosporramos.setcosto_de_compra(activosfijosporramosOrigen.getcosto_de_compra());}
			if(conDefault || (!conDefault && activosfijosporramosOrigen.getmarca()!=null && !activosfijosporramosOrigen.getmarca().equals(""))) {activosfijosporramos.setmarca(activosfijosporramosOrigen.getmarca());}
			if(conDefault || (!conDefault && activosfijosporramosOrigen.getmodelo()!=null && !activosfijosporramosOrigen.getmodelo().equals(""))) {activosfijosporramos.setmodelo(activosfijosporramosOrigen.getmodelo());}
			if(conDefault || (!conDefault && activosfijosporramosOrigen.getnumero_matricula()!=null && !activosfijosporramosOrigen.getnumero_matricula().equals(""))) {activosfijosporramos.setnumero_matricula(activosfijosporramosOrigen.getnumero_matricula());}
			if(conDefault || (!conDefault && activosfijosporramosOrigen.getnumero_motor()!=null && !activosfijosporramosOrigen.getnumero_motor().equals(""))) {activosfijosporramos.setnumero_motor(activosfijosporramosOrigen.getnumero_motor());}
			if(conDefault || (!conDefault && activosfijosporramosOrigen.getnumero_chasis()!=null && !activosfijosporramosOrigen.getnumero_chasis().equals(""))) {activosfijosporramos.setnumero_chasis(activosfijosporramosOrigen.getnumero_chasis());}
			if(conDefault || (!conDefault && activosfijosporramosOrigen.getnumero_placa()!=null && !activosfijosporramosOrigen.getnumero_placa().equals(""))) {activosfijosporramos.setnumero_placa(activosfijosporramosOrigen.getnumero_placa());}
			if(conDefault || (!conDefault && activosfijosporramosOrigen.getvalor_comercial()!=null && !activosfijosporramosOrigen.getvalor_comercial().equals(0.0))) {activosfijosporramos.setvalor_comercial(activosfijosporramosOrigen.getvalor_comercial());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioActivosFijosPorRamos(ActivosFijosPorRamos activosfijosporramos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelidActivosFijosPorRamos.setText(activosfijosporramos.getId().toString());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombre_sub_grupoActivosFijosPorRamos.setText(activosfijosporramos.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombre_detalle_grupoActivosFijosPorRamos.setText(activosfijosporramos.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldclaveActivosFijosPorRamos.setText(activosfijosporramos.getclave());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombreActivosFijosPorRamos.setText(activosfijosporramos.getnombre());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jDateChooserfecha_compraActivosFijosPorRamos.setDate(activosfijosporramos.getfecha_compra());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldvida_utilActivosFijosPorRamos.setText(activosfijosporramos.getvida_util().toString());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldcosto_de_compraActivosFijosPorRamos.setText(activosfijosporramos.getcosto_de_compra().toString());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreamarcaActivosFijosPorRamos.setText(activosfijosporramos.getmarca());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreamodeloActivosFijosPorRamos.setText(activosfijosporramos.getmodelo());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_matriculaActivosFijosPorRamos.setText(activosfijosporramos.getnumero_matricula());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_motorActivosFijosPorRamos.setText(activosfijosporramos.getnumero_motor());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_chasisActivosFijosPorRamos.setText(activosfijosporramos.getnumero_chasis());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_placaActivosFijosPorRamos.setText(activosfijosporramos.getnumero_placa());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldvalor_comercialActivosFijosPorRamos.setText(activosfijosporramos.getvalor_comercial().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioActivosFijosPorRamos(ActivosFijosPorRamosBean activosfijosporramosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelidActivosFijosPorRamos.setText(activosfijosporramosBean.getId().toString());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombre_sub_grupoActivosFijosPorRamos.setText(activosfijosporramosBean.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombre_detalle_grupoActivosFijosPorRamos.setText(activosfijosporramosBean.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldclaveActivosFijosPorRamos.setText(activosfijosporramosBean.getclave());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombreActivosFijosPorRamos.setText(activosfijosporramosBean.getnombre());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jDateChooserfecha_compraActivosFijosPorRamos.setDate(activosfijosporramosBean.getfecha_compra());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldvida_utilActivosFijosPorRamos.setText(activosfijosporramosBean.getvida_util().toString());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldcosto_de_compraActivosFijosPorRamos.setText(activosfijosporramosBean.getcosto_de_compra().toString());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreamarcaActivosFijosPorRamos.setText(activosfijosporramosBean.getmarca());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreamodeloActivosFijosPorRamos.setText(activosfijosporramosBean.getmodelo());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_matriculaActivosFijosPorRamos.setText(activosfijosporramosBean.getnumero_matricula());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_motorActivosFijosPorRamos.setText(activosfijosporramosBean.getnumero_motor());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_chasisActivosFijosPorRamos.setText(activosfijosporramosBean.getnumero_chasis());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_placaActivosFijosPorRamos.setText(activosfijosporramosBean.getnumero_placa());
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldvalor_comercialActivosFijosPorRamos.setText(activosfijosporramosBean.getvalor_comercial().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanActivosFijosPorRamos(ActivosFijosPorRamosParameterReturnGeneral activosfijosporramosReturnGeneral,ActivosFijosPorRamosBean activosfijosporramosBean,Boolean conDefault) throws Exception { 
		try {
			ActivosFijosPorRamos activosfijosporramosLocal=new ActivosFijosPorRamos();
			
			activosfijosporramosLocal=activosfijosporramosReturnGeneral.getActivosFijosPorRamos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && activosfijosporramosLocal.getId()!=null && !activosfijosporramosLocal.getId().equals(0L))) {activosfijosporramosBean.setId(activosfijosporramosLocal.getId());}}
			if(conDefault || (!conDefault && activosfijosporramosLocal.getnombre_sub_grupo()!=null && !activosfijosporramosLocal.getnombre_sub_grupo().equals(""))) {activosfijosporramosBean.setnombre_sub_grupo(activosfijosporramosLocal.getnombre_sub_grupo());}
			if(conDefault || (!conDefault && activosfijosporramosLocal.getnombre_detalle_grupo()!=null && !activosfijosporramosLocal.getnombre_detalle_grupo().equals(""))) {activosfijosporramosBean.setnombre_detalle_grupo(activosfijosporramosLocal.getnombre_detalle_grupo());}
			if(conDefault || (!conDefault && activosfijosporramosLocal.getclave()!=null && !activosfijosporramosLocal.getclave().equals(""))) {activosfijosporramosBean.setclave(activosfijosporramosLocal.getclave());}
			if(conDefault || (!conDefault && activosfijosporramosLocal.getnombre()!=null && !activosfijosporramosLocal.getnombre().equals(""))) {activosfijosporramosBean.setnombre(activosfijosporramosLocal.getnombre());}
			if(conDefault || (!conDefault && activosfijosporramosLocal.getfecha_compra()!=null && !activosfijosporramosLocal.getfecha_compra().equals(new Date()))) {activosfijosporramosBean.setfecha_compra(activosfijosporramosLocal.getfecha_compra());}
			if(conDefault || (!conDefault && activosfijosporramosLocal.getvida_util()!=null && !activosfijosporramosLocal.getvida_util().equals(0.0))) {activosfijosporramosBean.setvida_util(activosfijosporramosLocal.getvida_util());}
			if(conDefault || (!conDefault && activosfijosporramosLocal.getcosto_de_compra()!=null && !activosfijosporramosLocal.getcosto_de_compra().equals(0.0))) {activosfijosporramosBean.setcosto_de_compra(activosfijosporramosLocal.getcosto_de_compra());}
			if(conDefault || (!conDefault && activosfijosporramosLocal.getmarca()!=null && !activosfijosporramosLocal.getmarca().equals(""))) {activosfijosporramosBean.setmarca(activosfijosporramosLocal.getmarca());}
			if(conDefault || (!conDefault && activosfijosporramosLocal.getmodelo()!=null && !activosfijosporramosLocal.getmodelo().equals(""))) {activosfijosporramosBean.setmodelo(activosfijosporramosLocal.getmodelo());}
			if(conDefault || (!conDefault && activosfijosporramosLocal.getnumero_matricula()!=null && !activosfijosporramosLocal.getnumero_matricula().equals(""))) {activosfijosporramosBean.setnumero_matricula(activosfijosporramosLocal.getnumero_matricula());}
			if(conDefault || (!conDefault && activosfijosporramosLocal.getnumero_motor()!=null && !activosfijosporramosLocal.getnumero_motor().equals(""))) {activosfijosporramosBean.setnumero_motor(activosfijosporramosLocal.getnumero_motor());}
			if(conDefault || (!conDefault && activosfijosporramosLocal.getnumero_chasis()!=null && !activosfijosporramosLocal.getnumero_chasis().equals(""))) {activosfijosporramosBean.setnumero_chasis(activosfijosporramosLocal.getnumero_chasis());}
			if(conDefault || (!conDefault && activosfijosporramosLocal.getnumero_placa()!=null && !activosfijosporramosLocal.getnumero_placa().equals(""))) {activosfijosporramosBean.setnumero_placa(activosfijosporramosLocal.getnumero_placa());}
			if(conDefault || (!conDefault && activosfijosporramosLocal.getvalor_comercial()!=null && !activosfijosporramosLocal.getvalor_comercial().equals(0.0))) {activosfijosporramosBean.setvalor_comercial(activosfijosporramosLocal.getvalor_comercial());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxActivosFijosPorRamosGenerico(Long idActivosFijosPorRamosSeleccionado,JComboBox jComboBoxActivosFijosPorRamos,List<ActivosFijosPorRamos> activosfijosporramossLocal)throws Exception {
		try {
			ActivosFijosPorRamos  activosfijosporramosTemp=null;

			for(ActivosFijosPorRamos activosfijosporramosAux:activosfijosporramossLocal) {
				if(activosfijosporramosAux.getId()!=null && activosfijosporramosAux.getId().equals(idActivosFijosPorRamosSeleccionado)) {
					activosfijosporramosTemp=activosfijosporramosAux;
					break;
				}
			}

			jComboBoxActivosFijosPorRamos.setSelectedItem(activosfijosporramosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxActivosFijosPorRamosGenerico(JComboBox jComboBoxActivosFijosPorRamos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxActivosFijosPorRamos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxActivosFijosPorRamos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxActivosFijosPorRamos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxActivosFijosPorRamos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			activosfijosporramos=(ActivosFijosPorRamos) activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			activosfijosporramos =(ActivosFijosPorRamos) activosfijosporramoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!activosfijosporramos.getIsNew() && !activosfijosporramos.getIsChanged() && !activosfijosporramos.getIsDeleted()) {
				sDescripcion=activosfijosporramos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=activosfijosporramos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoRamoActivoFijo")) {
			//sDescripcion=this.getActualTipoRamoActivoFijoForeignKeyDescripcion((Long)value);
			if(!activosfijosporramos.getIsNew() && !activosfijosporramos.getIsChanged() && !activosfijosporramos.getIsDeleted()) {
				sDescripcion=activosfijosporramos.gettiporamoactivofijo_descripcion();
			} else {
				//sDescripcion=this.getActualTipoRamoActivoFijoForeignKeyDescripcion((Long)value);
				sDescripcion=activosfijosporramos.gettiporamoactivofijo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ActivosFijosPorRamos activosfijosporramosRow=new ActivosFijosPorRamos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			activosfijosporramosRow=(ActivosFijosPorRamos) activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			activosfijosporramosRow=(ActivosFijosPorRamos) activosfijosporramoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualActivosFijosPorRamos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaNuevoActivosFijosPorRamos && this.isPermisoNuevoActivosFijosPorRamos));			
			this.jButtonDuplicarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaDuplicarActivosFijosPorRamos && this.isPermisoDuplicarActivosFijosPorRamos));			
			this.jButtonCopiarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaCopiarActivosFijosPorRamos && this.isPermisoCopiarActivosFijosPorRamos));
			this.jButtonVerFormActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaVerFormActivosFijosPorRamos && this.isPermisoVerFormActivosFijosPorRamos));
			
			this.jButtonAbrirOrderByActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaOrdenActivosFijosPorRamos && this.isPermisoOrdenActivosFijosPorRamos));			
			
			this.jButtonNuevoRelacionesActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos && this.isPermisoNuevoActivosFijosPorRamos));			
			this.jButtonNuevoGuardarCambiosActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaNuevoActivosFijosPorRamos && this.isPermisoNuevoActivosFijosPorRamos && this.isPermisoGuardarCambiosActivosFijosPorRamos));
			
			if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonModificarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaModificarActivosFijosPorRamos && this.isPermisoActualizarActivosFijosPorRamos));	
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonActualizarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaActualizarActivosFijosPorRamos && this.isPermisoActualizarActivosFijosPorRamos));	
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonEliminarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaEliminarActivosFijosPorRamos && this.isPermisoEliminarActivosFijosPorRamos));
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonCancelarActivosFijosPorRamos.setVisible(this.isVisibilidadCeldaCancelarActivosFijosPorRamos);							
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonGuardarCambiosActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaGuardarActivosFijosPorRamos && this.isPermisoGuardarCambiosActivosFijosPorRamos));			
			
			}
						
			this.jButtonGuardarCambiosTablaActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos && this.isPermisoGuardarCambiosActivosFijosPorRamos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaNuevoActivosFijosPorRamos && this.isPermisoNuevoActivosFijosPorRamos));						
			this.jButtonDuplicarToolBarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaDuplicarActivosFijosPorRamos && this.isPermisoDuplicarActivosFijosPorRamos));						
			this.jButtonCopiarToolBarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaCopiarActivosFijosPorRamos && this.isPermisoCopiarActivosFijosPorRamos));			
			this.jButtonVerFormToolBarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaVerFormActivosFijosPorRamos && this.isPermisoVerFormActivosFijosPorRamos));			
			this.jButtonAbrirOrderByToolBarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaOrdenActivosFijosPorRamos && this.isPermisoOrdenActivosFijosPorRamos));
			this.jButtonNuevoRelacionesToolBarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos && this.isPermisoNuevoActivosFijosPorRamos));			
			this.jButtonNuevoGuardarCambiosToolBarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaNuevoActivosFijosPorRamos && this.isPermisoNuevoActivosFijosPorRamos && this.isPermisoGuardarCambiosActivosFijosPorRamos));			
			
			if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonModificarToolBarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaModificarActivosFijosPorRamos && this.isPermisoActualizarActivosFijosPorRamos));	
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonActualizarToolBarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaActualizarActivosFijosPorRamos  && this.isPermisoActualizarActivosFijosPorRamos));	
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonEliminarToolBarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaEliminarActivosFijosPorRamos && this.isPermisoEliminarActivosFijosPorRamos));
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonCancelarToolBarActivosFijosPorRamos.setVisible(this.isVisibilidadCeldaCancelarActivosFijosPorRamos);				
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonGuardarCambiosToolBarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaGuardarActivosFijosPorRamos && this.isPermisoGuardarCambiosActivosFijosPorRamos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos && this.isPermisoGuardarCambiosActivosFijosPorRamos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaNuevoActivosFijosPorRamos && this.isPermisoNuevoActivosFijosPorRamos));			
			this.jMenuItemDuplicarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaDuplicarActivosFijosPorRamos && this.isPermisoDuplicarActivosFijosPorRamos));			
			this.jMenuItemCopiarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaCopiarActivosFijosPorRamos && this.isPermisoCopiarActivosFijosPorRamos));			
			this.jMenuItemVerFormActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaVerFormActivosFijosPorRamos && this.isPermisoVerFormActivosFijosPorRamos));			
			this.jMenuItemAbrirOrderByActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaOrdenActivosFijosPorRamos && this.isPermisoOrdenActivosFijosPorRamos));			
			//this.jMenuItemMostrarOcultarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaOrdenActivosFijosPorRamos && this.isPermisoOrdenActivosFijosPorRamos));
			this.jMenuItemDetalleAbrirOrderByActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaOrdenActivosFijosPorRamos && this.isPermisoOrdenActivosFijosPorRamos));			
			//this.jMenuItemDetalleMostrarOcultarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaOrdenActivosFijosPorRamos && this.isPermisoOrdenActivosFijosPorRamos));			
			this.jMenuItemNuevoRelacionesActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos && this.isPermisoNuevoActivosFijosPorRamos));			
			this.jMenuItemNuevoGuardarCambiosActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaNuevoActivosFijosPorRamos && this.isPermisoNuevoActivosFijosPorRamos && this.isPermisoGuardarCambiosActivosFijosPorRamos));									
			
			if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jMenuItemModificarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaModificarActivosFijosPorRamos && this.isPermisoActualizarActivosFijosPorRamos));	
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jMenuItemActualizarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaActualizarActivosFijosPorRamos && this.isPermisoActualizarActivosFijosPorRamos));	
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jMenuItemEliminarActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaEliminarActivosFijosPorRamos && this.isPermisoEliminarActivosFijosPorRamos));
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jMenuItemCancelarActivosFijosPorRamos.setVisible(this.isVisibilidadCeldaCancelarActivosFijosPorRamos);				
			}
			
			this.jMenuItemGuardarCambiosActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaGuardarActivosFijosPorRamos && this.isPermisoGuardarCambiosActivosFijosPorRamos));						
			this.jMenuItemGuardarCambiosTablaActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos && this.isPermisoGuardarCambiosActivosFijosPorRamos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoActivosFijosPorRamos=this.jButtonNuevoActivosFijosPorRamos.isVisible();
			this.isVisibilidadCeldaDuplicarActivosFijosPorRamos=this.jButtonDuplicarActivosFijosPorRamos.isVisible();
			this.isVisibilidadCeldaCopiarActivosFijosPorRamos=this.jButtonCopiarActivosFijosPorRamos.isVisible();
			this.isVisibilidadCeldaVerFormActivosFijosPorRamos=this.jButtonVerFormActivosFijosPorRamos.isVisible();
			
			this.isVisibilidadCeldaOrdenActivosFijosPorRamos=this.jButtonAbrirOrderByActivosFijosPorRamos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos=this.jButtonNuevoRelacionesActivosFijosPorRamos.isVisible();
			this.isVisibilidadCeldaModificarActivosFijosPorRamos=this.jButtonModificarActivosFijosPorRamos.isVisible();
			
			if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
			this.isVisibilidadCeldaActualizarActivosFijosPorRamos=this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonActualizarActivosFijosPorRamos.isVisible();
			this.isVisibilidadCeldaEliminarActivosFijosPorRamos=this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonEliminarActivosFijosPorRamos.isVisible();
			this.isVisibilidadCeldaCancelarActivosFijosPorRamos=this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonCancelarActivosFijosPorRamos.isVisible();
			this.isVisibilidadCeldaGuardarActivosFijosPorRamos=this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonGuardarCambiosActivosFijosPorRamos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos=this.jButtonGuardarCambiosTablaActivosFijosPorRamos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoActivosFijosPorRamos=this.jButtonNuevoToolBarActivosFijosPorRamos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos=this.jButtonNuevoRelacionesToolBarActivosFijosPorRamos.isVisible();
			
			if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
			this.isVisibilidadCeldaModificarActivosFijosPorRamos=this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonModificarToolBarActivosFijosPorRamos.isVisible();
			this.isVisibilidadCeldaActualizarActivosFijosPorRamos=this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonActualizarToolBarActivosFijosPorRamos.isVisible();
			this.isVisibilidadCeldaEliminarActivosFijosPorRamos=this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonEliminarToolBarActivosFijosPorRamos.isVisible();
			this.isVisibilidadCeldaCancelarActivosFijosPorRamos=this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonCancelarToolBarActivosFijosPorRamos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarActivosFijosPorRamos=this.jButtonGuardarCambiosToolBarActivosFijosPorRamos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos=this.jButtonGuardarCambiosTablaToolBarActivosFijosPorRamos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoActivosFijosPorRamos=this.jMenuItemNuevoActivosFijosPorRamos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos=this.jMenuItemNuevoRelacionesActivosFijosPorRamos.isVisible();
			
			if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
			this.isVisibilidadCeldaModificarActivosFijosPorRamos=this.jInternalFrameDetalleFormActivosFijosPorRamos.jMenuItemModificarActivosFijosPorRamos.isVisible();
			this.isVisibilidadCeldaActualizarActivosFijosPorRamos=this.jInternalFrameDetalleFormActivosFijosPorRamos.jMenuItemActualizarActivosFijosPorRamos.isVisible();
			this.isVisibilidadCeldaEliminarActivosFijosPorRamos=this.jInternalFrameDetalleFormActivosFijosPorRamos.jMenuItemEliminarActivosFijosPorRamos.isVisible();
			this.isVisibilidadCeldaCancelarActivosFijosPorRamos=this.jInternalFrameDetalleFormActivosFijosPorRamos.jMenuItemCancelarActivosFijosPorRamos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarActivosFijosPorRamos=this.jMenuItemGuardarCambiosActivosFijosPorRamos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos=this.jMenuItemGuardarCambiosTablaActivosFijosPorRamos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesActivosFijosPorRamos(Boolean esInicializar) {
		if(ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.activosfijosporramosSessionBean.getConGuardarRelaciones()) {
				//if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesActivosFijosPorRamos();
			}
			
			this.inicializarActualizarBindingBotonesManualActivosFijosPorRamos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualActivosFijosPorRamos() {
		this.jButtonNuevoActivosFijosPorRamos.setVisible(this.isPermisoNuevoActivosFijosPorRamos);			
		this.jButtonDuplicarActivosFijosPorRamos.setVisible(this.isPermisoDuplicarActivosFijosPorRamos);			
		this.jButtonCopiarActivosFijosPorRamos.setVisible(this.isPermisoCopiarActivosFijosPorRamos);			
		this.jButtonVerFormActivosFijosPorRamos.setVisible(this.isPermisoVerFormActivosFijosPorRamos);			
		
		this.jButtonAbrirOrderByActivosFijosPorRamos.setVisible(this.isPermisoOrdenActivosFijosPorRamos);					
		
		this.jButtonNuevoRelacionesActivosFijosPorRamos.setVisible(this.isPermisoNuevoActivosFijosPorRamos);			
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonModificarActivosFijosPorRamos.setVisible(this.isPermisoActualizarActivosFijosPorRamos);	
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonActualizarActivosFijosPorRamos.setVisible(this.isPermisoActualizarActivosFijosPorRamos);	
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonEliminarActivosFijosPorRamos.setVisible(this.isPermisoEliminarActivosFijosPorRamos);
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonCancelarActivosFijosPorRamos.setVisible(this.isVisibilidadCeldaCancelarActivosFijosPorRamos);						
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonGuardarCambiosActivosFijosPorRamos.setVisible(this.isPermisoGuardarCambiosActivosFijosPorRamos);							
		}
		
		this.jButtonGuardarCambiosTablaActivosFijosPorRamos.setVisible(this.isPermisoActualizarActivosFijosPorRamos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleActivosFijosPorRamos() {
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonModificarActivosFijosPorRamos.setVisible(this.isPermisoActualizarActivosFijosPorRamos);	
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonActualizarActivosFijosPorRamos.setVisible(this.isPermisoActualizarActivosFijosPorRamos);	
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonEliminarActivosFijosPorRamos.setVisible(this.isPermisoEliminarActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonCancelarActivosFijosPorRamos.setVisible(this.isVisibilidadCeldaCancelarActivosFijosPorRamos);							
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonGuardarCambiosActivosFijosPorRamos.setVisible((this.isVisibilidadCeldaGuardarActivosFijosPorRamos && this.isPermisoGuardarCambiosActivosFijosPorRamos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosActivosFijosPorRamos() {
		if(ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualActivosFijosPorRamos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesActivosFijosPorRamos() {
	}
	
	public void jTableDatosActivosFijosPorRamosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarActivosFijosPorRamos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidActivosFijosPorRamosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.getactivosfijosporramos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporramos==null) {
						this.activosfijosporramos = new ActivosFijosPorRamos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
				}

				if(this.activosfijosporramos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.activosfijosporramos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorRamos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaActivosFijosPorRamosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebActivosFijosPorRamos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosActivosFijosPorRamos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosActivosFijosPorRamos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.getactivosfijosporramos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.activosfijosporramosLogic.getConnexion());

				if(this.activosfijosporramos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.activosfijosporramos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderActivosFijosPorRamos=(TitledBorder)this.jScrollPanelDatosActivosFijosPorRamos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderActivosFijosPorRamos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaActivosFijosPorRamosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.getactivosfijosporramos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporramos==null) {
						this.activosfijosporramos = new ActivosFijosPorRamos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
				}

				if(this.activosfijosporramos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.activosfijosporramos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorRamos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotiporamoactivofijo=true;

			idTienePermisotiporamoactivofijo=this.tienePermisosUsuarioEnPaginaWebActivosFijosPorRamos(TipoRamoActivoFijoConstantesFunciones.CLASSNAME);

			if(idTienePermisotiporamoactivofijo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosActivosFijosPorRamos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosActivosFijosPorRamos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.getactivosfijosporramos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);

				this.tiporamoactivofijoBeanSwingJInternalFrame=new TipoRamoActivoFijoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tiporamoactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tiporamoactivofijoBeanSwingJInternalFrame.getTipoRamoActivoFijoLogic().setConnexion(this.activosfijosporramosLogic.getConnexion());

				if(this.activosfijosporramos.getid_tipo_ramo_activo_fijo()!=null) {
					this.tiporamoactivofijoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tiporamoactivofijoBeanSwingJInternalFrame.setIdActual(this.activosfijosporramos.getid_tipo_ramo_activo_fijo());
					this.tiporamoactivofijoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tiporamoactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tiporamoactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoRamoActivoFijo();
				}

				JInternalFrameBase jinternalFrame =this.tiporamoactivofijoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderActivosFijosPorRamos=(TitledBorder)this.jScrollPanelDatosActivosFijosPorRamos.getBorder();
				TitledBorder titledBordertiporamoactivofijo=(TitledBorder)this.tiporamoactivofijoBeanSwingJInternalFrame.jScrollPanelDatosTipoRamoActivoFijo.getBorder();

				titledBordertiporamoactivofijo.setTitle(titledBorderActivosFijosPorRamos.getTitle() + " -> Tipo Ramo Activo Fijo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.getactivosfijosporramos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporramos==null) {
						this.activosfijosporramos = new ActivosFijosPorRamos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
				}

				if(this.activosfijosporramos.getid_tipo_ramo_activo_fijo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_ramo_activo_fijo = "+this.activosfijosporramos.getid_tipo_ramo_activo_fijo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorRamos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sub_grupoActivosFijosPorRamosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.getactivosfijosporramos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporramos==null) {
						this.activosfijosporramos = new ActivosFijosPorRamos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
				}

				if(this.activosfijosporramos.getnombre_sub_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sub_grupo like '%"+this.activosfijosporramos.getnombre_sub_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorRamos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_detalle_grupoActivosFijosPorRamosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.getactivosfijosporramos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporramos==null) {
						this.activosfijosporramos = new ActivosFijosPorRamos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
				}

				if(this.activosfijosporramos.getnombre_detalle_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_detalle_grupo like '%"+this.activosfijosporramos.getnombre_detalle_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorRamos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonclaveActivosFijosPorRamosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.getactivosfijosporramos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporramos==null) {
						this.activosfijosporramos = new ActivosFijosPorRamos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
				}

				if(this.activosfijosporramos.getclave()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where clave like '%"+this.activosfijosporramos.getclave()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorRamos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreActivosFijosPorRamosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.getactivosfijosporramos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporramos==null) {
						this.activosfijosporramos = new ActivosFijosPorRamos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
				}

				if(this.activosfijosporramos.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.activosfijosporramos.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorRamos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_compraActivosFijosPorRamosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.getactivosfijosporramos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporramos==null) {
						this.activosfijosporramos = new ActivosFijosPorRamos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
				}

				if(this.activosfijosporramos.getfecha_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_compra = '"+Funciones2.getStringPostgresDate(this.activosfijosporramos.getfecha_compra())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorRamos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvida_utilActivosFijosPorRamosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.getactivosfijosporramos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporramos==null) {
						this.activosfijosporramos = new ActivosFijosPorRamos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
				}

				if(this.activosfijosporramos.getvida_util()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where vida_util = "+this.activosfijosporramos.getvida_util().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorRamos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_de_compraActivosFijosPorRamosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.getactivosfijosporramos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporramos==null) {
						this.activosfijosporramos = new ActivosFijosPorRamos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
				}

				if(this.activosfijosporramos.getcosto_de_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_de_compra = "+this.activosfijosporramos.getcosto_de_compra().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorRamos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmarcaActivosFijosPorRamosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.getactivosfijosporramos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporramos==null) {
						this.activosfijosporramos = new ActivosFijosPorRamos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
				}

				if(this.activosfijosporramos.getmarca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where marca like '%"+this.activosfijosporramos.getmarca()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorRamos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmodeloActivosFijosPorRamosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.getactivosfijosporramos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporramos==null) {
						this.activosfijosporramos = new ActivosFijosPorRamos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
				}

				if(this.activosfijosporramos.getmodelo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where modelo like '%"+this.activosfijosporramos.getmodelo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorRamos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_matriculaActivosFijosPorRamosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.getactivosfijosporramos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporramos==null) {
						this.activosfijosporramos = new ActivosFijosPorRamos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
				}

				if(this.activosfijosporramos.getnumero_matricula()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_matricula like '%"+this.activosfijosporramos.getnumero_matricula()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorRamos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_motorActivosFijosPorRamosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.getactivosfijosporramos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporramos==null) {
						this.activosfijosporramos = new ActivosFijosPorRamos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
				}

				if(this.activosfijosporramos.getnumero_motor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_motor like '%"+this.activosfijosporramos.getnumero_motor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorRamos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_chasisActivosFijosPorRamosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.getactivosfijosporramos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporramos==null) {
						this.activosfijosporramos = new ActivosFijosPorRamos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
				}

				if(this.activosfijosporramos.getnumero_chasis()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_chasis like '%"+this.activosfijosporramos.getnumero_chasis()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorRamos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_placaActivosFijosPorRamosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.getactivosfijosporramos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporramos==null) {
						this.activosfijosporramos = new ActivosFijosPorRamos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
				}

				if(this.activosfijosporramos.getnumero_placa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_placa like '%"+this.activosfijosporramos.getnumero_placa()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorRamos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_comercialActivosFijosPorRamosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.getactivosfijosporramos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporramos==null) {
						this.activosfijosporramos = new ActivosFijosPorRamos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);
				}

				if(this.activosfijosporramos.getvalor_comercial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_comercial = "+this.activosfijosporramos.getvalor_comercial().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorRamos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaActivosFijosPorRamosActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingActivosFijosPorRamos(false,false);

			this.getActivosFijosPorRamossBusquedaActivosFijosPorRamos();

			this.inicializarActualizarBindingActivosFijosPorRamos(false);

			//if(ActivosFijosPorRamosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingActivosFijosPorRamos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingActivosFijosPorRamos(false,false);

			this.getActivosFijosPorRamossFK_IdEmpresa();

			this.inicializarActualizarBindingActivosFijosPorRamos(false);

			//if(ActivosFijosPorRamosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingActivosFijosPorRamos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoRamoActivoFijoActivosFijosPorRamosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingActivosFijosPorRamos(false,false);

			this.getActivosFijosPorRamossFK_IdTipoRamoActivoFijo();

			this.inicializarActualizarBindingActivosFijosPorRamos(false);

			//if(ActivosFijosPorRamosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingActivosFijosPorRamos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporramosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameActivosFijosPorRamos() {
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
			this.jInternalFrameDetalleFormActivosFijosPorRamos.setVisible(false);	    			
			this.jInternalFrameDetalleFormActivosFijosPorRamos.dispose();
			this.jInternalFrameDetalleFormActivosFijosPorRamos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoActivosFijosPorRamos!=null) {
			this.jInternalFrameReporteDinamicoActivosFijosPorRamos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoActivosFijosPorRamos.dispose();
			this.jInternalFrameReporteDinamicoActivosFijosPorRamos=null;
		}
		
		if(this.jInternalFrameImportacionActivosFijosPorRamos!=null) {
			this.jInternalFrameImportacionActivosFijosPorRamos.setVisible(false);	    			
			this.jInternalFrameImportacionActivosFijosPorRamos.dispose();
			this.jInternalFrameImportacionActivosFijosPorRamos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessActivosFijosPorRamos();
			
			ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
			
			
			if(sTipo.equals("NuevoActivosFijosPorRamos")) {
				jButtonNuevoActivosFijosPorRamosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarActivosFijosPorRamos")) {
				jButtonDuplicarActivosFijosPorRamosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarActivosFijosPorRamos")) {
				jButtonCopiarActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("VerFormActivosFijosPorRamos")) {
				jButtonVerFormActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarActivosFijosPorRamos")) {
				jButtonNuevoActivosFijosPorRamosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarActivosFijosPorRamos")) {
				jButtonDuplicarActivosFijosPorRamosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoActivosFijosPorRamos")) {
				jButtonNuevoActivosFijosPorRamosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarActivosFijosPorRamos")) {
				jButtonDuplicarActivosFijosPorRamosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesActivosFijosPorRamos")) {
				jButtonNuevoActivosFijosPorRamosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarActivosFijosPorRamos")) {
				jButtonNuevoActivosFijosPorRamosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesActivosFijosPorRamos")) {
				jButtonNuevoActivosFijosPorRamosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarActivosFijosPorRamos")) {
				jButtonModificarActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarActivosFijosPorRamos")) {
				jButtonModificarActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarActivosFijosPorRamos")) {
				jButtonModificarActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarActivosFijosPorRamos")) {
				jButtonActualizarActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarActivosFijosPorRamos")) {
				jButtonActualizarActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarActivosFijosPorRamos")) {
				jButtonActualizarActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("EliminarActivosFijosPorRamos")) {
				jButtonEliminarActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarActivosFijosPorRamos")) {
				jButtonEliminarActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarActivosFijosPorRamos")) {
				jButtonEliminarActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("CancelarActivosFijosPorRamos")) {
				jButtonCancelarActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarActivosFijosPorRamos")) {
				jButtonCancelarActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarActivosFijosPorRamos")) {
				jButtonCancelarActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("CerrarActivosFijosPorRamos")) {
				jButtonCerrarActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarActivosFijosPorRamos")) {
				jButtonCerrarActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarActivosFijosPorRamos")) {
				jButtonCerrarActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarActivosFijosPorRamos")) {
				jButtonMostrarOcultarActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarActivosFijosPorRamos")) {
				jButtonCancelarActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosActivosFijosPorRamos")) {
				jButtonGuardarCambiosActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarActivosFijosPorRamos")) {
				jButtonGuardarCambiosActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarActivosFijosPorRamos")) {
				jButtonCopiarActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarActivosFijosPorRamos")) {
				jButtonVerFormActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosActivosFijosPorRamos")) {
				jButtonGuardarCambiosActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarActivosFijosPorRamos")) {
				jButtonCopiarActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormActivosFijosPorRamos")) {
				jButtonVerFormActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaActivosFijosPorRamos")) {
				jButtonGuardarCambiosActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarActivosFijosPorRamos")) {
				jButtonGuardarCambiosActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaActivosFijosPorRamos")) {
				jButtonGuardarCambiosActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionActivosFijosPorRamos")) {
				jButtonRecargarInformacionActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarActivosFijosPorRamos")) {
				jButtonRecargarInformacionActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionActivosFijosPorRamos")) {
				jButtonRecargarInformacionActivosFijosPorRamosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresActivosFijosPorRamos")) {
				jButtonAnterioresActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarActivosFijosPorRamos")) {
				jButtonAnterioresActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreActivosFijosPorRamos")) {
				jButtonAnterioresActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesActivosFijosPorRamos")) {
				jButtonSiguientesActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarActivosFijosPorRamos")) {
				jButtonSiguientesActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesActivosFijosPorRamos")) {
				jButtonSiguientesActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByActivosFijosPorRamos") || sTipo.equals("MenuItemDetalleAbrirOrderByActivosFijosPorRamos")) {
				jButtonAbrirOrderByActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarActivosFijosPorRamos") || sTipo.equals("MenuItemDetalleMostrarOcultarActivosFijosPorRamos")) {
				jButtonMostrarOcultarActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosActivosFijosPorRamos")) {
				jButtonNuevoGuardarCambiosActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarActivosFijosPorRamos")) {
				jButtonNuevoGuardarCambiosActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosActivosFijosPorRamos")) {
				jButtonNuevoGuardarCambiosActivosFijosPorRamosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoActivosFijosPorRamos")) {
				jButtonCerrarReporteDinamicoActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoActivosFijosPorRamos")) {
				jButtonGenerarReporteDinamicoActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoActivosFijosPorRamos")) {
				
				jButtonGenerarExcelReporteDinamicoActivosFijosPorRamosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionActivosFijosPorRamos")) {
				jButtonCerrarImportacionActivosFijosPorRamosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionActivosFijosPorRamos")) {
				
				jButtonGenerarImportacionActivosFijosPorRamosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionActivosFijosPorRamos")) {
				
				jButtonAbrirImportacionActivosFijosPorRamosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesActivosFijosPorRamos")) {
				jComboBoxTiposAccionesActivosFijosPorRamosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesActivosFijosPorRamos")) {
				jComboBoxTiposRelacionesActivosFijosPorRamosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioActivosFijosPorRamos")) {
				jComboBoxTiposAccionesActivosFijosPorRamosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarActivosFijosPorRamos")) {
				
				jComboBoxTiposSeleccionarActivosFijosPorRamosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralActivosFijosPorRamos")) {
				jTextFieldValorCampoGeneralActivosFijosPorRamosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByActivosFijosPorRamos")) {
				jButtonAbrirOrderByActivosFijosPorRamosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarActivosFijosPorRamos")) {
				jButtonAbrirOrderByActivosFijosPorRamosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByActivosFijosPorRamos")) {
				jButtonCerrarOrderByActivosFijosPorRamosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idActivosFijosPorRamosBusqueda")) {
				this.jButtonidActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaActivosFijosPorRamosUpdate")) {
				this.jButtonid_empresaActivosFijosPorRamosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaActivosFijosPorRamosBusqueda")) {
				this.jButtonid_empresaActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_ramo_activo_fijoActivosFijosPorRamosUpdate")) {
				this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_ramo_activo_fijoActivosFijosPorRamosBusqueda")) {
				this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sub_grupoActivosFijosPorRamosBusqueda")) {
				this.jButtonnombre_sub_grupoActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_detalle_grupoActivosFijosPorRamosBusqueda")) {
				this.jButtonnombre_detalle_grupoActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("claveActivosFijosPorRamosBusqueda")) {
				this.jButtonclaveActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreActivosFijosPorRamosBusqueda")) {
				this.jButtonnombreActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_compraActivosFijosPorRamosBusqueda")) {
				this.jButtonfecha_compraActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("vida_utilActivosFijosPorRamosBusqueda")) {
				this.jButtonvida_utilActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_de_compraActivosFijosPorRamosBusqueda")) {
				this.jButtoncosto_de_compraActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("marcaActivosFijosPorRamosBusqueda")) {
				this.jButtonmarcaActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("modeloActivosFijosPorRamosBusqueda")) {
				this.jButtonmodeloActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_matriculaActivosFijosPorRamosBusqueda")) {
				this.jButtonnumero_matriculaActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_motorActivosFijosPorRamosBusqueda")) {
				this.jButtonnumero_motorActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chasisActivosFijosPorRamosBusqueda")) {
				this.jButtonnumero_chasisActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_placaActivosFijosPorRamosBusqueda")) {
				this.jButtonnumero_placaActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_comercialActivosFijosPorRamosBusqueda")) {
				this.jButtonvalor_comercialActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaActivosFijosPorRamosActivosFijosPorRamos")) {
				this.jButtonBusquedaActivosFijosPorRamosActivosFijosPorRamosActionPerformed(evt);
			}
			
			;
			
			
			ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessActivosFijosPorRamos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActivosFijosPorRamosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporramos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporramos);
				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
				
				


				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorRamos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorRamos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ActivosFijosPorRamos activosfijosporramosLocal=null;
			
			if(!this.getEsControlTabla()) {
				activosfijosporramosLocal=this.activosfijosporramos;
			} else {
				activosfijosporramosLocal=this.activosfijosporramosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporramos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporramos);
				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
							
				
				


				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorRamos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorRamos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosPorRamosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosAnterior =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijosporramosAnterior =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
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
			
			ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
			
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
			
			


			
			ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActivosFijosPorRamosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporramos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporramos);
				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
								
						
				


				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorRamos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorRamos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporramos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporramos);
				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
								
				
				


				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorRamos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorRamos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosPorRamosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosAnterior =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijosporramosAnterior =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporramos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporramos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosPorRamosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosAnterior =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijosporramosAnterior =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosPorRamosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporramos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporramos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporramos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporramos);
				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
							
				
				


				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorRamos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorRamos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActivosFijosPorRamosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporramosAnterior =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.activosfijosporramosAnterior =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
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
			
			ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
			
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
			
			


			
			ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosPorRamosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporramos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporramos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporramos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporramos);
				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
								
				
				


				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorRamos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorRamos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosPorRamosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosAnterior =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijosporramosAnterior =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosPorRamosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporramos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporramos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActivosFijosPorRamosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporramos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporramos);
				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosActivosFijosPorRamos")) {
					jCheckBoxSeleccionarTodosActivosFijosPorRamosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosActivosFijosPorRamos")) {
					jCheckBoxSeleccionadosActivosFijosPorRamosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarActivosFijosPorRamos")) {
					
				}
				
				


				
				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorRamos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorRamos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporramos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporramos);
				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
												
				
				


				
				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorRamos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorRamos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActivosFijosPorRamosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporramosAnterior =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.activosfijosporramosAnterior =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActivosFijosPorRamosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporramos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporramos);
				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
				
				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
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
			
			ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
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
			
			


			
			ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActivosFijosPorRamosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporramos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporramos);
				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorRamos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorRamos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporramos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporramos);
				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
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
				
				


				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorRamos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorRamos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosPorRamosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporramosAnterior =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijosporramosAnterior =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarActivosFijosPorRamos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosActivosFijosPorRamosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosActivosFijosPorRamos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.activosfijosporramos =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.activosfijosporramos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarActivosFijosPorRamos")) {
				
				}
				
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarActivosFijosPorRamos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosActivosFijosPorRamos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarActivosFijosPorRamos")) {
			
			}
			
			ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessActivosFijosPorRamos();
			
			ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
			
			if(sTipo.equals("NuevoActivosFijosPorRamos")) {
				jButtonNuevoActivosFijosPorRamosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarActivosFijosPorRamos")) {
				jButtonDuplicarActivosFijosPorRamosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarActivosFijosPorRamos")) {
				jButtonCopiarActivosFijosPorRamosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormActivosFijosPorRamos")) {
				jButtonVerFormActivosFijosPorRamosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesActivosFijosPorRamos")) {
				jButtonNuevoActivosFijosPorRamosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarActivosFijosPorRamos")) {
				jButtonModificarActivosFijosPorRamosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarActivosFijosPorRamos")) {
				jButtonActualizarActivosFijosPorRamosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarActivosFijosPorRamos")) {
				jButtonEliminarActivosFijosPorRamosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaActivosFijosPorRamos")) {
				jButtonGuardarCambiosActivosFijosPorRamosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarActivosFijosPorRamos")) {
				jButtonCancelarActivosFijosPorRamosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarActivosFijosPorRamos")) {
				jButtonCerrarActivosFijosPorRamosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosActivosFijosPorRamos")) {
				jButtonGuardarCambiosActivosFijosPorRamosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosActivosFijosPorRamos")) {
				jButtonNuevoGuardarCambiosActivosFijosPorRamosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByActivosFijosPorRamos")) {
				jButtonAbrirOrderByActivosFijosPorRamosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionActivosFijosPorRamos")) {
				jButtonRecargarInformacionActivosFijosPorRamosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresActivosFijosPorRamos")) {
				jButtonAnterioresActivosFijosPorRamosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesActivosFijosPorRamos")) {
				jButtonSiguientesActivosFijosPorRamosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idActivosFijosPorRamosBusqueda")) {
				this.jButtonidActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaActivosFijosPorRamosUpdate")) {
				this.jButtonid_empresaActivosFijosPorRamosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaActivosFijosPorRamosBusqueda")) {
				this.jButtonid_empresaActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_ramo_activo_fijoActivosFijosPorRamosUpdate")) {
				this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_ramo_activo_fijoActivosFijosPorRamosBusqueda")) {
				this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sub_grupoActivosFijosPorRamosBusqueda")) {
				this.jButtonnombre_sub_grupoActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_detalle_grupoActivosFijosPorRamosBusqueda")) {
				this.jButtonnombre_detalle_grupoActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("claveActivosFijosPorRamosBusqueda")) {
				this.jButtonclaveActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreActivosFijosPorRamosBusqueda")) {
				this.jButtonnombreActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_compraActivosFijosPorRamosBusqueda")) {
				this.jButtonfecha_compraActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("vida_utilActivosFijosPorRamosBusqueda")) {
				this.jButtonvida_utilActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_de_compraActivosFijosPorRamosBusqueda")) {
				this.jButtoncosto_de_compraActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("marcaActivosFijosPorRamosBusqueda")) {
				this.jButtonmarcaActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("modeloActivosFijosPorRamosBusqueda")) {
				this.jButtonmodeloActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_matriculaActivosFijosPorRamosBusqueda")) {
				this.jButtonnumero_matriculaActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_motorActivosFijosPorRamosBusqueda")) {
				this.jButtonnumero_motorActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chasisActivosFijosPorRamosBusqueda")) {
				this.jButtonnumero_chasisActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_placaActivosFijosPorRamosBusqueda")) {
				this.jButtonnumero_placaActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_comercialActivosFijosPorRamosBusqueda")) {
				this.jButtonvalor_comercialActivosFijosPorRamosBusquedaActionPerformed(evt);
			}
			
			ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessActivosFijosPorRamos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameActivosFijosPorRamos")) {
				closingInternalFrameActivosFijosPorRamos();
				
			} else if(sTipo.equals("jButtonCancelarActivosFijosPorRamos")) {
				JInternalFrameBase jInternalFrameDetalleFormActivosFijosPorRamos = (JInternalFrameBase)evt.getSource();
	            	
	            ActivosFijosPorRamosBeanSwingJInternalFrame jInternalFrameParent=(ActivosFijosPorRamosBeanSwingJInternalFrame)jInternalFrameDetalleFormActivosFijosPorRamos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarActivosFijosPorRamosActionPerformed(null);
			}
			
			ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.activosfijosporramos,new Object(),this.activosfijosporramosParameterGeneral,this.activosfijosporramosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormActivosFijosPorRamos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormActivosFijosPorRamos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormActivosFijosPorRamos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.activosfijosporramos)) {
			if(!esControlTabla) {
				if(ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);			
				}
				
				if(this.activosfijosporramosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanActivosFijosPorRamos(this.activosfijosporramosReturnGeneral,this.activosfijosporramosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.activosfijosporramosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanActivosFijosPorRamos(classes,this.activosfijosporramosReturnGeneral,this.activosfijosporramosBean,false);
					}
						
					if(this.activosfijosporramosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyActivosFijosPorRamos(this.activosfijosporramosReturnGeneral.getActivosFijosPorRamos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioActivosFijosPorRamos(this.activosfijosporramosReturnGeneral.getActivosFijosPorRamos());	
					}
						
					if(this.activosfijosporramosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioActivosFijosPorRamos(this.activosfijosporramosReturnGeneral.getActivosFijosPorRamos(),classes);//this.activosfijosporramosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioActivosFijosPorRamos(this.activosfijosporramos,classes);//this.activosfijosporramosBean);									
				}
			
				if(ActivosFijosPorRamosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorRamos(this.activosfijosporramos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorRamos(this.activosfijosporramos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.activosfijosporramosAnterior!=null) {
						this.activosfijosporramos=this.activosfijosporramosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.activosfijosporramosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.activosfijosporramosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.activosfijosporramosReturnGeneral.getActivosFijosPorRamos(),activosfijosporramosLogic.getActivosFijosPorRamoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.activosfijosporramosReturnGeneral.getActivosFijosPorRamos(),this.activosfijosporramoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosActivosFijosPorRamos.repaint();
				
				//((AbstractTableModel) this.jTableDatosActivosFijosPorRamos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosActivosFijosPorRamos();
			}
		}
	}
	
	public void actualizarVisualTableDatosActivosFijosPorRamos() throws Exception {
		
		ActivosFijosPorRamosModel activosfijosporramosModel=(ActivosFijosPorRamosModel)this.jTableDatosActivosFijosPorRamos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			activosfijosporramosModel.activosfijosporramoss=this.activosfijosporramosLogic.getActivosFijosPorRamoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			activosfijosporramosModel.activosfijosporramoss=this.activosfijosporramoss;
		}
		
		
		((ActivosFijosPorRamosModel) this.jTableDatosActivosFijosPorRamos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaActivosFijosPorRamos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getactivosfijosporramosAnterior(),this.activosfijosporramosLogic.getActivosFijosPorRamoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getactivosfijosporramosAnterior(),this.activosfijosporramoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosActivosFijosPorRamos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioActivosFijosPorRamos(ActivosFijosPorRamos activosfijosporramos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
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
										
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.activosfijosporramos,new Object(),generalEntityParameterGeneral,this.activosfijosporramosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.activosfijosporramosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ActivosFijosPorRamosConstantesFunciones.getClassesRelationshipsOfActivosFijosPorRamos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ActivosFijosPorRamosConstantesFunciones.getClassesRelationshipsFromStringsOfActivosFijosPorRamos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormActivosFijosPorRamos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.activosfijosporramos,new Object(),generalEntityParameterGeneral,this.activosfijosporramosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioActivosFijosPorRamos(ActivosFijosPorRamosBean activosfijosporramosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanActivosFijosPorRamos(ArrayList<Classe> classes,ActivosFijosPorRamosReturnGeneral activosfijosporramosReturnGeneral,ActivosFijosPorRamosBean activosfijosporramosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualActivosFijosPorRamos(ActivosFijosPorRamos activosfijosporramos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.activosfijosporramos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormActivosFijosPorRamos = new ActivosFijosPorRamosDetalleFormJInternalFrame(jDesktopPane,this.activosfijosporramosSessionBean.getConGuardarRelaciones(),this.activosfijosporramosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.setVisible(false);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.setSelected(false);						
		
		this.jInternalFrameDetalleFormActivosFijosPorRamos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormActivosFijosPorRamos.activosfijosporramosLogic=this.activosfijosporramosLogic;
		
		this.cargarCombosFrameForeignKeyActivosFijosPorRamos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleActivosFijosPorRamos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleActivosFijosPorRamos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyActivosFijosPorRamos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyActivosFijosPorRamos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormActivosFijosPorRamos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarActivosFijosPorRamos"));
		
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonModificarActivosFijosPorRamos.addActionListener(new ButtonActionListener(this,"ModificarActivosFijosPorRamos"));

		
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonModificarToolBarActivosFijosPorRamos.addActionListener(new ButtonActionListener(this,"ModificarToolBarActivosFijosPorRamos"));
					
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jMenuItemModificarActivosFijosPorRamos.addActionListener(new ButtonActionListener(this,"MenuItemModificarActivosFijosPorRamos"));		
		
		
		
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonActualizarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"ActualizarActivosFijosPorRamos"));
		
		
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonActualizarToolBarActivosFijosPorRamos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarActivosFijosPorRamos"));
						
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jMenuItemActualizarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarActivosFijosPorRamos"));		
		
		
		
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonEliminarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"EliminarActivosFijosPorRamos"));
		
		
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonEliminarToolBarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"EliminarToolBarActivosFijosPorRamos"));
								
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jMenuItemEliminarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarActivosFijosPorRamos"));		
		
		
		
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonCancelarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"CancelarActivosFijosPorRamos"));
		
		
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonCancelarToolBarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"CancelarToolBarActivosFijosPorRamos"));
					
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jMenuItemCancelarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarActivosFijosPorRamos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jMenuItemDetalleCerrarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarActivosFijosPorRamos"));		
		
		
		
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonGuardarCambiosToolBarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarActivosFijosPorRamos"));
		
		
		
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonGuardarCambiosToolBarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarActivosFijosPorRamos"));
		
		
		
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxTiposAccionesFormularioActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioActivosFijosPorRamos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonidActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"idActivosFijosPorRamosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonid_empresaActivosFijosPorRamosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaActivosFijosPorRamosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonid_empresaActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaActivosFijosPorRamosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_ramo_activo_fijoActivosFijosPorRamosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_ramo_activo_fijoActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonnombre_sub_grupoActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonnombre_detalle_grupoActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonclaveActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"claveActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonnombreActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"nombreActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonfecha_compraActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonvida_utilActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtoncosto_de_compraActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonmarcaActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"marcaActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonmodeloActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"modeloActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonnumero_matriculaActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"numero_matriculaActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonnumero_motorActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"numero_motorActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonnumero_chasisActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"numero_chasisActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonnumero_placaActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"numero_placaActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonvalor_comercialActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"valor_comercialActivosFijosPorRamosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTabbedPaneRelacionesActivosFijosPorRamos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesActivosFijosPorRamos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameActivosFijosPorRamos"));
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorRamos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarActivosFijosPorRamos"));
		}
		
		this.jTableDatosActivosFijosPorRamos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarActivosFijosPorRamos"));
		
		this.jTableDatosActivosFijosPorRamos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarActivosFijosPorRamos"));
		
		this.jButtonNuevoActivosFijosPorRamos.addActionListener(new ButtonActionListener(this,"NuevoActivosFijosPorRamos"));
		
		this.jButtonDuplicarActivosFijosPorRamos.addActionListener(new ButtonActionListener(this,"DuplicarActivosFijosPorRamos"));
		
		this.jButtonCopiarActivosFijosPorRamos.addActionListener(new ButtonActionListener(this,"CopiarActivosFijosPorRamos"));
		
		this.jButtonVerFormActivosFijosPorRamos.addActionListener(new ButtonActionListener(this,"VerFormActivosFijosPorRamos"));
		
		
		this.jButtonNuevoToolBarActivosFijosPorRamos.addActionListener(new ButtonActionListener(this,"NuevoToolBarActivosFijosPorRamos"));
			
		this.jButtonDuplicarToolBarActivosFijosPorRamos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarActivosFijosPorRamos"));
			
		this.jMenuItemNuevoActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoActivosFijosPorRamos"));
			
		this.jMenuItemDuplicarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarActivosFijosPorRamos"));		
		
		
		this.jButtonNuevoRelacionesActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesActivosFijosPorRamos"));
		
		
		this.jButtonNuevoRelacionesToolBarActivosFijosPorRamos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarActivosFijosPorRamos"));
			
		this.jMenuItemNuevoRelacionesActivosFijosPorRamos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesActivosFijosPorRamos"));		
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonModificarActivosFijosPorRamos.addActionListener(new ButtonActionListener(this,"ModificarActivosFijosPorRamos"));
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonModificarToolBarActivosFijosPorRamos.addActionListener(new ButtonActionListener(this,"ModificarToolBarActivosFijosPorRamos"));
			
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jMenuItemModificarActivosFijosPorRamos.addActionListener(new ButtonActionListener(this,"MenuItemModificarActivosFijosPorRamos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonActualizarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"ActualizarActivosFijosPorRamos"));
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonActualizarToolBarActivosFijosPorRamos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarActivosFijosPorRamos"));
				
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jMenuItemActualizarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarActivosFijosPorRamos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonEliminarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"EliminarActivosFijosPorRamos"));
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonEliminarToolBarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"EliminarToolBarActivosFijosPorRamos"));
						
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jMenuItemEliminarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarActivosFijosPorRamos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonCancelarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"CancelarActivosFijosPorRamos"));
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonCancelarToolBarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"CancelarToolBarActivosFijosPorRamos"));
			
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jMenuItemCancelarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarActivosFijosPorRamos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarActivosFijosPorRamos"));		
		
		
		this.jButtonCerrarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"CerrarActivosFijosPorRamos"));
		
		
		this.jButtonCerrarToolBarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"CerrarToolBarActivosFijosPorRamos"));
			
		this.jMenuItemCerrarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarActivosFijosPorRamos"));
			
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jMenuItemDetalleCerrarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarActivosFijosPorRamos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonGuardarCambiosActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"GuardarCambiosActivosFijosPorRamos"));
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonGuardarCambiosToolBarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarActivosFijosPorRamos"));
		}
		
		this.jButtonCopiarToolBarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"CopiarToolBarActivosFijosPorRamos"));
			
		this.jButtonVerFormToolBarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"VerFormToolBarActivosFijosPorRamos"));
		
		this.jMenuItemGuardarCambiosActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosActivosFijosPorRamos"));
			
		this.jMenuItemCopiarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarActivosFijosPorRamos"));		
		
		this.jMenuItemVerFormActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormActivosFijosPorRamos"));		
		
		
		this.jButtonGuardarCambiosTablaActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaActivosFijosPorRamos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarActivosFijosPorRamos"));
			
		this.jMenuItemGuardarCambiosTablaActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaActivosFijosPorRamos"));		
		
		
		
		this.jButtonRecargarInformacionActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"RecargarInformacionActivosFijosPorRamos"));
					
		this.jButtonRecargarInformacionToolBarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarActivosFijosPorRamos"));
		
		this.jMenuItemRecargarInformacionActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionActivosFijosPorRamos"));		
		
		
		
		this.jButtonAnterioresActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"AnterioresActivosFijosPorRamos"));
		
		
		this.jButtonAnterioresToolBarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarActivosFijosPorRamos"));
		
		this.jMenuItemAnterioresActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresActivosFijosPorRamos"));		
		
		
		this.jButtonSiguientesActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"SiguientesActivosFijosPorRamos"));
		
		
		this.jButtonSiguientesToolBarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarActivosFijosPorRamos"));
			
		this.jMenuItemSiguientesActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesActivosFijosPorRamos"));
			
		this.jMenuItemAbrirOrderByActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByActivosFijosPorRamos"));
			
		this.jMenuItemMostrarOcultarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarActivosFijosPorRamos"));
			
		this.jMenuItemDetalleAbrirOrderByActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByActivosFijosPorRamos"));
			
		this.jMenuItemDetalleMostarOcultarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarActivosFijosPorRamos"));		
		
		
		this.jButtonNuevoGuardarCambiosActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosActivosFijosPorRamos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarActivosFijosPorRamos"));
			
		this.jMenuItemNuevoGuardarCambiosActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosActivosFijosPorRamos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosActivosFijosPorRamos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosActivosFijosPorRamos"));

		this.jCheckBoxSeleccionadosActivosFijosPorRamos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosActivosFijosPorRamos"));
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxTiposAccionesFormularioActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioActivosFijosPorRamos"));
		}
		
		
		this.jComboBoxTiposRelacionesActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"TiposRelacionesActivosFijosPorRamos"));
			
		this.jComboBoxTiposAccionesActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"TiposAccionesActivosFijosPorRamos"));
					
		this.jComboBoxTiposSeleccionarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarActivosFijosPorRamos"));
			
		this.jTextFieldValorCampoGeneralActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralActivosFijosPorRamos"));		
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonidActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"idActivosFijosPorRamosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonid_empresaActivosFijosPorRamosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaActivosFijosPorRamosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonid_empresaActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaActivosFijosPorRamosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_ramo_activo_fijoActivosFijosPorRamosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_ramo_activo_fijoActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonnombre_sub_grupoActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonnombre_detalle_grupoActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonclaveActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"claveActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonnombreActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"nombreActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonfecha_compraActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonvida_utilActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtoncosto_de_compraActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonmarcaActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"marcaActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonmodeloActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"modeloActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonnumero_matriculaActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"numero_matriculaActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonnumero_motorActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"numero_motorActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonnumero_chasisActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"numero_chasisActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonnumero_placaActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"numero_placaActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonvalor_comercialActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"valor_comercialActivosFijosPorRamosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaActivosFijosPorRamosActivosFijosPorRamos.addActionListener(new ButtonActionListener(this,"BusquedaActivosFijosPorRamosActivosFijosPorRamos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoActivosFijosPorRamos!=null) {
				this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoActivosFijosPorRamos"));
				this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoActivosFijosPorRamos"));
				this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoActivosFijosPorRamos"));
			}
			
			//this.jButtonCerrarReporteDinamicoActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoActivosFijosPorRamos"));				
			//this.jButtonGenerarReporteDinamicoActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoActivosFijosPorRamos"));
			//this.jButtonGenerarExcelReporteDinamicoActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoActivosFijosPorRamos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionActivosFijosPorRamos!=null) {
				this.jInternalFrameImportacionActivosFijosPorRamos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionActivosFijosPorRamos"));
				this.jInternalFrameImportacionActivosFijosPorRamos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionActivosFijosPorRamos"));
				this.jInternalFrameImportacionActivosFijosPorRamos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionActivosFijosPorRamos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"AbrirOrderByActivosFijosPorRamos"));
			
			this.jButtonAbrirOrderByToolBarActivosFijosPorRamos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarActivosFijosPorRamos"));			
			
			if(this.jInternalFrameOrderByActivosFijosPorRamos!=null) {
				this.jInternalFrameOrderByActivosFijosPorRamos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByActivosFijosPorRamos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorRamos.jTabbedPaneRelacionesActivosFijosPorRamos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesActivosFijosPorRamos"));
		
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
            		closingInternalFrameActivosFijosPorRamos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormActivosFijosPorRamos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormActivosFijosPorRamos = (JInternalFrameBase)event.getSource();
	            	
	            ActivosFijosPorRamosBeanSwingJInternalFrame jInternalFrameParent=(ActivosFijosPorRamosBeanSwingJInternalFrame)jInternalFrameDetalleFormActivosFijosPorRamos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarActivosFijosPorRamosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosActivosFijosPorRamos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosActivosFijosPorRamosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosActivosFijosPorRamos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosActivosFijosPorRamos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActivosFijosPorRamosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActivosFijosPorRamosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActivosFijosPorRamosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoActivosFijosPorRamos";
		inputMap = this.jButtonNuevoActivosFijosPorRamos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoActivosFijosPorRamos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoActivosFijosPorRamosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActivosFijosPorRamosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActivosFijosPorRamosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActivosFijosPorRamosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesActivosFijosPorRamos";
		inputMap = this.jButtonNuevoRelacionesActivosFijosPorRamos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesActivosFijosPorRamos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoActivosFijosPorRamosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarActivosFijosPorRamos";
		inputMap = this.jButtonModificarActivosFijosPorRamos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarActivosFijosPorRamos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarActivosFijosPorRamosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarActivosFijosPorRamos";
		inputMap = this.jButtonActualizarActivosFijosPorRamos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarActivosFijosPorRamos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarActivosFijosPorRamosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarActivosFijosPorRamos";
		inputMap = this.jButtonEliminarActivosFijosPorRamos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarActivosFijosPorRamos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarActivosFijosPorRamosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarActivosFijosPorRamos";
		inputMap = this.jButtonCancelarActivosFijosPorRamos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarActivosFijosPorRamos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarActivosFijosPorRamosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarActivosFijosPorRamos";
		inputMap = this.jButtonCerrarActivosFijosPorRamos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarActivosFijosPorRamos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarActivosFijosPorRamosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonGuardarCambiosActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosActivosFijosPorRamos";
		inputMap = this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonGuardarCambiosActivosFijosPorRamos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonGuardarCambiosActivosFijosPorRamos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosActivosFijosPorRamosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosActivosFijosPorRamos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosActivosFijosPorRamosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesActivosFijosPorRamos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesActivosFijosPorRamosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarActivosFijosPorRamos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarActivosFijosPorRamosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralActivosFijosPorRamos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralActivosFijosPorRamosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonidActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"idActivosFijosPorRamosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonid_empresaActivosFijosPorRamosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaActivosFijosPorRamosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonid_empresaActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaActivosFijosPorRamosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_ramo_activo_fijoActivosFijosPorRamosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_ramo_activo_fijoActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonnombre_sub_grupoActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonnombre_detalle_grupoActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonclaveActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"claveActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonnombreActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"nombreActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonfecha_compraActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonvida_utilActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtoncosto_de_compraActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonmarcaActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"marcaActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonmodeloActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"modeloActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonnumero_matriculaActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"numero_matriculaActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonnumero_motorActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"numero_motorActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonnumero_chasisActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"numero_chasisActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonnumero_placaActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"numero_placaActivosFijosPorRamosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jButtonvalor_comercialActivosFijosPorRamosBusqueda.addActionListener(new ButtonActionListener(this,"valor_comercialActivosFijosPorRamosBusqueda"));
		
		
		this.jButtonBusquedaActivosFijosPorRamosActivosFijosPorRamos.addActionListener(new ButtonActionListener(this,"BusquedaActivosFijosPorRamosActivosFijosPorRamos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionActivosFijosPorRamos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionActivosFijosPorRamosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarActivosFijosPorRamosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarActivosFijosPorRamos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosActivosFijosPorRamos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ActivosFijosPorRamos activosfijosporramosAux:this.activosfijosporramosLogic.getActivosFijosPorRamoss()) {
					activosfijosporramosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ActivosFijosPorRamos activosfijosporramosAux:activosfijosporramoss) {
					activosfijosporramosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosActivosFijosPorRamosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingActivosFijosPorRamos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ActivosFijosPorRamos activosfijosporramosAux:this.activosfijosporramosLogic.getActivosFijosPorRamoss()) {
						activosfijosporramosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ActivosFijosPorRamos activosfijosporramosAux:activosfijosporramoss) {
						activosfijosporramosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ActivosFijosPorRamos activosfijosporramosAux:this.activosfijosporramosLogic.getActivosFijosPorRamoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ActivosFijosPorRamos activosfijosporramosAux:activosfijosporramoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaActivosFijosPorRamos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosActivosFijosPorRamos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosActivosFijosPorRamos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorRamos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosActivosFijosPorRamosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingActivosFijosPorRamos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosActivosFijosPorRamos.getSelectedRows();
			
			ActivosFijosPorRamos activosfijosporramosLocal=new ActivosFijosPorRamos();
			
			//this.seleccionarTodosActivosFijosPorRamos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					activosfijosporramosLocal =(ActivosFijosPorRamos) this.activosfijosporramosLogic.getActivosFijosPorRamoss().toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					activosfijosporramosLocal =(ActivosFijosPorRamos) this.activosfijosporramoss.toArray()[this.jTableDatosActivosFijosPorRamos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				activosfijosporramosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ActivosFijosPorRamos activosfijosporramosAux:this.activosfijosporramosLogic.getActivosFijosPorRamoss()) {
						activosfijosporramosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ActivosFijosPorRamos activosfijosporramosAux:activosfijosporramoss) {
						activosfijosporramosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaActivosFijosPorRamos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosActivosFijosPorRamos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosActivosFijosPorRamos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorRamos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualActivosFijosPorRamosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarActivosFijosPorRamosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralActivosFijosPorRamosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingActivosFijosPorRamos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralActivosFijosPorRamos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ActivosFijosPorRamos activosfijosporramosAux:this.activosfijosporramosLogic.getActivosFijosPorRamoss()) {
				
						if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
							existe=true;
							activosfijosporramosAux.setnombre_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
							existe=true;
							activosfijosporramosAux.setnombre_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_CLAVE)) {
							existe=true;
							activosfijosporramosAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							activosfijosporramosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_FECHACOMPRA)) {
							existe=true;
							activosfijosporramosAux.setfecha_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_VIDAUTIL)) {
							existe=true;
							activosfijosporramosAux.setvida_util(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_COSTODECOMPRA)) {
							existe=true;
							activosfijosporramosAux.setcosto_de_compra(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_MARCA)) {
							existe=true;
							activosfijosporramosAux.setmarca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_MODELO)) {
							existe=true;
							activosfijosporramosAux.setmodelo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMATRICULA)) {
							existe=true;
							activosfijosporramosAux.setnumero_matricula(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMOTOR)) {
							existe=true;
							activosfijosporramosAux.setnumero_motor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROCHASIS)) {
							existe=true;
							activosfijosporramosAux.setnumero_chasis(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROPLACA)) {
							existe=true;
							activosfijosporramosAux.setnumero_placa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_VALORCOMERCIAL)) {
							existe=true;
							activosfijosporramosAux.setvalor_comercial(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ActivosFijosPorRamos activosfijosporramosAux:activosfijosporramoss) {
					
						if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
							existe=true;
							activosfijosporramosAux.setnombre_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
							existe=true;
							activosfijosporramosAux.setnombre_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_CLAVE)) {
							existe=true;
							activosfijosporramosAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							activosfijosporramosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_FECHACOMPRA)) {
							existe=true;
							activosfijosporramosAux.setfecha_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_VIDAUTIL)) {
							existe=true;
							activosfijosporramosAux.setvida_util(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_COSTODECOMPRA)) {
							existe=true;
							activosfijosporramosAux.setcosto_de_compra(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_MARCA)) {
							existe=true;
							activosfijosporramosAux.setmarca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_MODELO)) {
							existe=true;
							activosfijosporramosAux.setmodelo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMATRICULA)) {
							existe=true;
							activosfijosporramosAux.setnumero_matricula(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMOTOR)) {
							existe=true;
							activosfijosporramosAux.setnumero_motor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROCHASIS)) {
							existe=true;
							activosfijosporramosAux.setnumero_chasis(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROPLACA)) {
							existe=true;
							activosfijosporramosAux.setnumero_placa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_VALORCOMERCIAL)) {
							existe=true;
							activosfijosporramosAux.setvalor_comercial(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaActivosFijosPorRamos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesActivosFijosPorRamosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingActivosFijosPorRamos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioActivosFijosPorRamos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesActivosFijosPorRamos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxTiposAccionesFormularioActivosFijosPorRamos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteActivosFijosPorRamos) {				
					conSplash=true;//false;										
					
					//this.startProcessActivosFijosPorRamos(conSplash);
				
					this.generarReporteActivosFijosPorRamossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesActivosFijosPorRamos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxTiposAccionesFormularioActivosFijosPorRamos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoActivosFijosPorRamossSeleccionados();
				//this.jComboBoxTiposAccionesActivosFijosPorRamos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoActivosFijosPorRamossSeleccionados(false);
				//this.jComboBoxTiposAccionesActivosFijosPorRamos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoActivosFijosPorRamossSeleccionados(true);
				//this.jComboBoxTiposAccionesActivosFijosPorRamos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessActivosFijosPorRamos();
				
				this.exportarActivosFijosPorRamossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesActivosFijosPorRamos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxTiposAccionesFormularioActivosFijosPorRamos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionActivosFijosPorRamoss();
				//this.importarActivosFijosPorRamoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesActivosFijosPorRamos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxTiposAccionesFormularioActivosFijosPorRamos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessActivosFijosPorRamos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelActivosFijosPorRamossSeleccionados();
				//this.jComboBoxTiposAccionesActivosFijosPorRamos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Activos Fijos Por Ramos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessActivosFijosPorRamos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoActivosFijosPorRamos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyActivosFijosPorRamos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Activos Fijos Por Ramos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesActivosFijosPorRamos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxTiposAccionesFormularioActivosFijosPorRamos.setSelectedIndex(0);					
				}	
			} 			
			else if(ActivosFijosPorRamosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteActivosFijosPorRamos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessActivosFijosPorRamos(conSplash);
					
						//this.actualizarParametrosGeneralActivosFijosPorRamos();
						
						this.generarReporteProcesoAccionActivosFijosPorRamossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesActivosFijosPorRamos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxTiposAccionesFormularioActivosFijosPorRamos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Activos Fijos Por RamosES SELECCIONADOS?", "MANTENIMIENTO DE Activos Fijos Por Ramos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessActivosFijosPorRamos();
				
						this.actualizarParametrosGeneralActivosFijosPorRamos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.activosfijosporramosReturnGeneral=activosfijosporramosLogic.procesarAccionActivosFijosPorRamossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.activosfijosporramosLogic.getActivosFijosPorRamoss(),this.activosfijosporramosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarActivosFijosPorRamosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesActivosFijosPorRamos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxTiposAccionesFormularioActivosFijosPorRamos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralActivosFijosPorRamos();
					
					ActivosFijosPorRamosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarActivosFijosPorRamosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesActivosFijosPorRamos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxTiposAccionesFormularioActivosFijosPorRamos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessActivosFijosPorRamos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesActivosFijosPorRamosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessActivosFijosPorRamos();
			
			if(this.jInternalFrameDetalleFormActivosFijosPorRamos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ActivosFijosPorRamos> activosfijosporramossSeleccionados=new ArrayList<ActivosFijosPorRamos>();		
			ActivosFijosPorRamos activosfijosporramos=new ActivosFijosPorRamos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingActivosFijosPorRamos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesActivosFijosPorRamos.getSelectedItem();
			
			
			
			
			activosfijosporramossSeleccionados=this.getActivosFijosPorRamossSeleccionados(true);
			//this.sTipoAccion;
			
			if(activosfijosporramossSeleccionados.size()==1) {
				for(ActivosFijosPorRamos activosfijosporramosAux:activosfijosporramossSeleccionados) {
					activosfijosporramos=activosfijosporramosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessActivosFijosPorRamos();
			
      		//this.finishProcessActivosFijosPorRamos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarActivosFijosPorRamosReturnGeneral() throws Exception {
		if(this.activosfijosporramosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.activosfijosporramosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.activosfijosporramosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.activosfijosporramosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.activosfijosporramosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.activosfijosporramosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingActivosFijosPorRamos(false);
		}
		
		if(this.activosfijosporramosReturnGeneral.getConRetornoLista() || this.activosfijosporramosReturnGeneral.getConRetornoObjeto()) {
			if(this.activosfijosporramosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.activosfijosporramosLogic.setActivosFijosPorRamoss(this.activosfijosporramosReturnGeneral.getActivosFijosPorRamoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingActivosFijosPorRamos(false);
		}
	}
	
	public void actualizarParametrosGeneralActivosFijosPorRamos() throws Exception {
		
		
	}
	
	public ArrayList<ActivosFijosPorRamos> getActivosFijosPorRamossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ActivosFijosPorRamos> activosfijosporramossSeleccionados=new ArrayList<ActivosFijosPorRamos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioActivosFijosPorRamos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ActivosFijosPorRamos activosfijosporramosAux:activosfijosporramosLogic.getActivosFijosPorRamoss()) {
					if(activosfijosporramosAux.getIsSelected()) {
						activosfijosporramossSeleccionados.add(activosfijosporramosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ActivosFijosPorRamos activosfijosporramosAux:this.activosfijosporramoss) {
					if(activosfijosporramosAux.getIsSelected()) {
						activosfijosporramossSeleccionados.add(activosfijosporramosAux);				
					}
				}
			}
			
			if(activosfijosporramossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						activosfijosporramossSeleccionados.addAll(this.activosfijosporramosLogic.getActivosFijosPorRamoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						activosfijosporramossSeleccionados.addAll(this.activosfijosporramoss);				
					}
				}
			}
		} else {
			activosfijosporramossSeleccionados.add(this.activosfijosporramos);
		}
		
		return activosfijosporramossSeleccionados;
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
	
	public void generarReporteActivosFijosPorRamossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalActivosFijosPorRamossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoActivosFijosPorRamossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoActivosFijosPorRamossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoActivosFijosPorRamossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Activos Fijos Por Ramos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesActivosFijosPorRamossSeleccionados() throws Exception {
		ArrayList<ActivosFijosPorRamos> activosfijosporramossSeleccionados=new ArrayList<ActivosFijosPorRamos>();		
		
		activosfijosporramossSeleccionados=this.getActivosFijosPorRamossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteActivosFijosPorRamoss("Todos",activosfijosporramossSeleccionados);
		
	}	
	
	public void generarReporteNormalActivosFijosPorRamossSeleccionados() throws Exception {
		ArrayList<ActivosFijosPorRamos> activosfijosporramossSeleccionados=new ArrayList<ActivosFijosPorRamos>();		
		
		activosfijosporramossSeleccionados=this.getActivosFijosPorRamossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteActivosFijosPorRamoss("Todos",activosfijosporramossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionActivosFijosPorRamossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ActivosFijosPorRamos> activosfijosporramossSeleccionados=new ArrayList<ActivosFijosPorRamos>();
		
		activosfijosporramossSeleccionados=this.getActivosFijosPorRamossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteActivosFijosPorRamoss("Todos",activosfijosporramossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoActivosFijosPorRamossSeleccionados() throws Exception {
		ArrayList<ActivosFijosPorRamos> activosfijosporramossSeleccionados=new ArrayList<ActivosFijosPorRamos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoActivosFijosPorRamos();
		
		
		activosfijosporramossSeleccionados=this.getActivosFijosPorRamossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoActivosFijosPorRamos();
		
		
		//this.generarReporteActivosFijosPorRamoss("Todos",activosfijosporramossSeleccionados ,activosfijosporramosImplementable,activosfijosporramosImplementableHome);
	}
	
	public void mostrarImportacionActivosFijosPorRamoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionActivosFijosPorRamos();
		
		this.abrirFrameImportacionActivosFijosPorRamos();		
		
			
		//this.generarReporteActivosFijosPorRamoss("Todos",activosfijosporramossSeleccionados ,activosfijosporramosImplementable,activosfijosporramosImplementableHome);
	}
	
	public void importarActivosFijosPorRamoss() throws Exception {		
	
	}
	
	public void exportarActivosFijosPorRamossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelActivosFijosPorRamossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoActivosFijosPorRamossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlActivosFijosPorRamossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Activos Fijos Por Ramos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoActivosFijosPorRamossSeleccionados() throws Exception {
		ArrayList<ActivosFijosPorRamos> activosfijosporramossSeleccionados=new ArrayList<ActivosFijosPorRamos>();		
		
		activosfijosporramossSeleccionados=this.getActivosFijosPorRamossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"activosfijosporramos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarActivosFijosPorRamos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ActivosFijosPorRamos activosfijosporramosAux:activosfijosporramossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarActivosFijosPorRamos(activosfijosporramosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//activosfijosporramosAux.setsDetalleGeneralEntityReporte(activosfijosporramosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos Por Ramos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarActivosFijosPorRamos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ActivosFijosPorRamosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorRamosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorRamosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorRamosConstantesFunciones.LABEL_IDTIPORAMOACTIVOFIJO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRESUBGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorRamosConstantesFunciones.LABEL_CLAVE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorRamosConstantesFunciones.LABEL_FECHACOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorRamosConstantesFunciones.LABEL_VIDAUTIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorRamosConstantesFunciones.LABEL_COSTODECOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorRamosConstantesFunciones.LABEL_MARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorRamosConstantesFunciones.LABEL_MODELO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMATRICULA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMOTOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROCHASIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROPLACA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorRamosConstantesFunciones.LABEL_VALORCOMERCIAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarActivosFijosPorRamos(ActivosFijosPorRamos activosfijosporramos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=activosfijosporramos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporramos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporramos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporramos.gettiporamoactivofijo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporramos.getnombre_sub_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporramos.getnombre_detalle_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporramos.getclave();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporramos.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporramos.getfecha_compra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporramos.getvida_util().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporramos.getcosto_de_compra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporramos.getmarca();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporramos.getmodelo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporramos.getnumero_matricula();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporramos.getnumero_motor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporramos.getnumero_chasis();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporramos.getnumero_placa();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporramos.getvalor_comercial().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelActivosFijosPorRamossSeleccionados() throws Exception {
		ArrayList<ActivosFijosPorRamos> activosfijosporramossSeleccionados=new ArrayList<ActivosFijosPorRamos>();		
		
		activosfijosporramossSeleccionados=this.getActivosFijosPorRamossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"activosfijosporramos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ActivosFijosPorRamoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelActivosFijosPorRamos(row);				
				iRow++;
			}				
			
			for(ActivosFijosPorRamos activosfijosporramosAux:activosfijosporramossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelActivosFijosPorRamos(activosfijosporramosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos Por Ramos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlActivosFijosPorRamossSeleccionados() throws Exception {
		ArrayList<ActivosFijosPorRamos> activosfijosporramossSeleccionados=new ArrayList<ActivosFijosPorRamos>();		
		
		activosfijosporramossSeleccionados=this.getActivosFijosPorRamossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"activosfijosporramos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("activosfijosporramoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("activosfijosporramos");
			//elementRoot.appendChild(element);
		
			for(ActivosFijosPorRamos activosfijosporramosAux:activosfijosporramossSeleccionados) {
				element = document.createElement("activosfijosporramos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlActivosFijosPorRamos(activosfijosporramosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos Por Ramos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelActivosFijosPorRamos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_IDTIPORAMOACTIVOFIJO);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRESUBGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_CLAVE);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_FECHACOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_VIDAUTIL);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_COSTODECOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_MARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_MODELO);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMATRICULA);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMOTOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROCHASIS);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROPLACA);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorRamosConstantesFunciones.LABEL_VALORCOMERCIAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelActivosFijosPorRamos(ActivosFijosPorRamos activosfijosporramos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporramos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporramos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporramos.gettiporamoactivofijo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporramos.getnombre_sub_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporramos.getnombre_detalle_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporramos.getclave());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporramos.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporramos.getfecha_compra());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporramos.getvida_util());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporramos.getcosto_de_compra());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporramos.getmarca());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporramos.getmodelo());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporramos.getnumero_matricula());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporramos.getnumero_motor());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporramos.getnumero_chasis());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporramos.getnumero_placa());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporramos.getvalor_comercial());				
	}
	
	public void setFilaDatosExportarXmlActivosFijosPorRamos(ActivosFijosPorRamos activosfijosporramos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ActivosFijosPorRamosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(activosfijosporramos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ActivosFijosPorRamosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(activosfijosporramos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ActivosFijosPorRamosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(activosfijosporramos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtiporamoactivofijo_descripcion = document.createElement(ActivosFijosPorRamosConstantesFunciones.IDTIPORAMOACTIVOFIJO);
		elementtiporamoactivofijo_descripcion.appendChild(document.createTextNode(activosfijosporramos.gettiporamoactivofijo_descripcion()));
		element.appendChild(elementtiporamoactivofijo_descripcion);

		Element elementnombre_sub_grupo = document.createElement(ActivosFijosPorRamosConstantesFunciones.NOMBRESUBGRUPO);
		elementnombre_sub_grupo.appendChild(document.createTextNode(activosfijosporramos.getnombre_sub_grupo().trim()));
		element.appendChild(elementnombre_sub_grupo);

		Element elementnombre_detalle_grupo = document.createElement(ActivosFijosPorRamosConstantesFunciones.NOMBREDETALLEGRUPO);
		elementnombre_detalle_grupo.appendChild(document.createTextNode(activosfijosporramos.getnombre_detalle_grupo().trim()));
		element.appendChild(elementnombre_detalle_grupo);

		Element elementclave = document.createElement(ActivosFijosPorRamosConstantesFunciones.CLAVE);
		elementclave.appendChild(document.createTextNode(activosfijosporramos.getclave().trim()));
		element.appendChild(elementclave);

		Element elementnombre = document.createElement(ActivosFijosPorRamosConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(activosfijosporramos.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementfecha_compra = document.createElement(ActivosFijosPorRamosConstantesFunciones.FECHACOMPRA);
		elementfecha_compra.appendChild(document.createTextNode(activosfijosporramos.getfecha_compra().toString().trim()));
		element.appendChild(elementfecha_compra);

		Element elementvida_util = document.createElement(ActivosFijosPorRamosConstantesFunciones.VIDAUTIL);
		elementvida_util.appendChild(document.createTextNode(activosfijosporramos.getvida_util().toString().trim()));
		element.appendChild(elementvida_util);

		Element elementcosto_de_compra = document.createElement(ActivosFijosPorRamosConstantesFunciones.COSTODECOMPRA);
		elementcosto_de_compra.appendChild(document.createTextNode(activosfijosporramos.getcosto_de_compra().toString().trim()));
		element.appendChild(elementcosto_de_compra);

		Element elementmarca = document.createElement(ActivosFijosPorRamosConstantesFunciones.MARCA);
		elementmarca.appendChild(document.createTextNode(activosfijosporramos.getmarca().trim()));
		element.appendChild(elementmarca);

		Element elementmodelo = document.createElement(ActivosFijosPorRamosConstantesFunciones.MODELO);
		elementmodelo.appendChild(document.createTextNode(activosfijosporramos.getmodelo().trim()));
		element.appendChild(elementmodelo);

		Element elementnumero_matricula = document.createElement(ActivosFijosPorRamosConstantesFunciones.NUMEROMATRICULA);
		elementnumero_matricula.appendChild(document.createTextNode(activosfijosporramos.getnumero_matricula().trim()));
		element.appendChild(elementnumero_matricula);

		Element elementnumero_motor = document.createElement(ActivosFijosPorRamosConstantesFunciones.NUMEROMOTOR);
		elementnumero_motor.appendChild(document.createTextNode(activosfijosporramos.getnumero_motor().trim()));
		element.appendChild(elementnumero_motor);

		Element elementnumero_chasis = document.createElement(ActivosFijosPorRamosConstantesFunciones.NUMEROCHASIS);
		elementnumero_chasis.appendChild(document.createTextNode(activosfijosporramos.getnumero_chasis().trim()));
		element.appendChild(elementnumero_chasis);

		Element elementnumero_placa = document.createElement(ActivosFijosPorRamosConstantesFunciones.NUMEROPLACA);
		elementnumero_placa.appendChild(document.createTextNode(activosfijosporramos.getnumero_placa().trim()));
		element.appendChild(elementnumero_placa);

		Element elementvalor_comercial = document.createElement(ActivosFijosPorRamosConstantesFunciones.VALORCOMERCIAL);
		elementvalor_comercial.appendChild(document.createTextNode(activosfijosporramos.getvalor_comercial().toString().trim()));
		element.appendChild(elementvalor_comercial);
	}
	
	public void generarReporteGroupGenericoActivosFijosPorRamossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ActivosFijosPorRamos> activosfijosporramossSeleccionados=new ArrayList<ActivosFijosPorRamos>();
		
		activosfijosporramossSeleccionados=this.getActivosFijosPorRamossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoActivosFijosPorRamos(activosfijosporramossSeleccionados);
		
		this.generarReporteActivosFijosPorRamoss("Todos",activosfijosporramossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoActivosFijosPorRamos(ArrayList<ActivosFijosPorRamos> activosfijosporramossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ActivosFijosPorRamos activosfijosporramosAux:activosfijosporramossSeleccionados) {
				activosfijosporramosAux.setsDetalleGeneralEntityReporte(activosfijosporramosAux.toString());
			
				if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					activosfijosporramosAux.setsDescripcionGeneralEntityReporte1(activosfijosporramosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_IDTIPORAMOACTIVOFIJO)) {
					existe=true;
					activosfijosporramosAux.setsDescripcionGeneralEntityReporte1(activosfijosporramosAux.gettiporamoactivofijo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
					existe=true;
					activosfijosporramosAux.setsDescripcionGeneralEntityReporte1(activosfijosporramosAux.getnombre_sub_grupo());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
					existe=true;
					activosfijosporramosAux.setsDescripcionGeneralEntityReporte1(activosfijosporramosAux.getnombre_detalle_grupo());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_CLAVE)) {
					existe=true;
					activosfijosporramosAux.setsDescripcionGeneralEntityReporte1(activosfijosporramosAux.getclave());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					activosfijosporramosAux.setsDescripcionGeneralEntityReporte1(activosfijosporramosAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_FECHACOMPRA)) {
					existe=true;
					activosfijosporramosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(activosfijosporramosAux.getfecha_compra()));
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_MARCA)) {
					existe=true;
					activosfijosporramosAux.setsDescripcionGeneralEntityReporte1(activosfijosporramosAux.getmarca());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_MODELO)) {
					existe=true;
					activosfijosporramosAux.setsDescripcionGeneralEntityReporte1(activosfijosporramosAux.getmodelo());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMATRICULA)) {
					existe=true;
					activosfijosporramosAux.setsDescripcionGeneralEntityReporte1(activosfijosporramosAux.getnumero_matricula());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMOTOR)) {
					existe=true;
					activosfijosporramosAux.setsDescripcionGeneralEntityReporte1(activosfijosporramosAux.getnumero_motor());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROCHASIS)) {
					existe=true;
					activosfijosporramosAux.setsDescripcionGeneralEntityReporte1(activosfijosporramosAux.getnumero_chasis());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROPLACA)) {
					existe=true;
					activosfijosporramosAux.setsDescripcionGeneralEntityReporte1(activosfijosporramosAux.getnumero_placa());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorRamosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesActivosFijosPorRamos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoActivosFijosPorRamos=true;
				this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos=true;
				this.isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos=true;
			}
			
			this.isVisibilidadCeldaModificarActivosFijosPorRamos=false;
			this.isVisibilidadCeldaActualizarActivosFijosPorRamos=false;
			this.isVisibilidadCeldaEliminarActivosFijosPorRamos=false;
			this.isVisibilidadCeldaCancelarActivosFijosPorRamos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActivosFijosPorRamos=true;
				} else {
					this.isVisibilidadCeldaGuardarActivosFijosPorRamos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoActivosFijosPorRamos=false;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos=false;
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos=false;
			this.isVisibilidadCeldaModificarActivosFijosPorRamos=false;
			this.isVisibilidadCeldaActualizarActivosFijosPorRamos=true;
			this.isVisibilidadCeldaEliminarActivosFijosPorRamos=false;
			this.isVisibilidadCeldaCancelarActivosFijosPorRamos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActivosFijosPorRamos=true;
				} else {
					this.isVisibilidadCeldaGuardarActivosFijosPorRamos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoActivosFijosPorRamos=false;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos=false;
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos=false;
			this.isVisibilidadCeldaModificarActivosFijosPorRamos=false;
			this.isVisibilidadCeldaActualizarActivosFijosPorRamos=true;
			this.isVisibilidadCeldaEliminarActivosFijosPorRamos=true;
			this.isVisibilidadCeldaCancelarActivosFijosPorRamos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActivosFijosPorRamos=true;
				} else {
					this.isVisibilidadCeldaGuardarActivosFijosPorRamos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoActivosFijosPorRamos=false;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos=false;
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos=false;
			this.isVisibilidadCeldaModificarActivosFijosPorRamos=false;
			this.isVisibilidadCeldaActualizarActivosFijosPorRamos=true;
			this.isVisibilidadCeldaEliminarActivosFijosPorRamos=false;
			this.isVisibilidadCeldaCancelarActivosFijosPorRamos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActivosFijosPorRamos=false;
				} else {
					this.isVisibilidadCeldaGuardarActivosFijosPorRamos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoActivosFijosPorRamos=true;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos=true;
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos=true;
			this.isVisibilidadCeldaModificarActivosFijosPorRamos=false;
			this.isVisibilidadCeldaActualizarActivosFijosPorRamos=false;
			this.isVisibilidadCeldaEliminarActivosFijosPorRamos=false;
			this.isVisibilidadCeldaCancelarActivosFijosPorRamos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActivosFijosPorRamos=true;
				} else {
					this.isVisibilidadCeldaGuardarActivosFijosPorRamos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoActivosFijosPorRamos=false;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos=false;
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos=false;
			this.isVisibilidadCeldaActualizarActivosFijosPorRamos=false;
			this.isVisibilidadCeldaEliminarActivosFijosPorRamos=false;
			this.isVisibilidadCeldaCancelarActivosFijosPorRamos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActivosFijosPorRamos=false;
				} else {
					this.isVisibilidadCeldaGuardarActivosFijosPorRamos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoActivosFijosPorRamos=false;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos=false;
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos=false;
			this.isVisibilidadCeldaModificarActivosFijosPorRamos=true;
			this.isVisibilidadCeldaActualizarActivosFijosPorRamos=false;
			this.isVisibilidadCeldaEliminarActivosFijosPorRamos=false;
			this.isVisibilidadCeldaCancelarActivosFijosPorRamos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActivosFijosPorRamos=false;
				} else {
					this.isVisibilidadCeldaGuardarActivosFijosPorRamos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ActivosFijosPorRamosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoActivosFijosPorRamos=true;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos=true;
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos=true;
		} else {
			this.actualizarEstadoPanelsActivosFijosPorRamos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarActivosFijosPorRamos=false;
			//this.isVisibilidadCeldaVerFormActivosFijosPorRamos=false;
			this.isVisibilidadCeldaDuplicarActivosFijosPorRamos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!activosfijosporramosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos=false;
		} else {
			this.isVisibilidadCeldaNuevoActivosFijosPorRamos=false;
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
			if(!activosfijosporramosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos=false;												
			}
			
			this.jButtonCerrarActivosFijosPorRamos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos=false;
		}
		
		if(!this.permiteMantenimiento(this.activosfijosporramos)) {
			this.isVisibilidadCeldaActualizarActivosFijosPorRamos=false;
			this.isVisibilidadCeldaEliminarActivosFijosPorRamos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoActivosFijosPorRamos=false;
		this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorRamos=false;
		this.isVisibilidadCeldaGuardarCambiosActivosFijosPorRamos=false;
		//this.isVisibilidadCeldaModificarActivosFijosPorRamos=true;
		this.isVisibilidadCeldaActualizarActivosFijosPorRamos=false;
		this.isVisibilidadCeldaEliminarActivosFijosPorRamos=false;
		//this.isVisibilidadCeldaCancelarActivosFijosPorRamos=true;			
		this.isVisibilidadCeldaGuardarActivosFijosPorRamos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesActivosFijosPorRamos() {
	}
	
	public void actualizarEstadoPanelsActivosFijosPorRamos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionActivosFijosPorRamos!=null) {
				this.jScrollPanelDatosEdicionActivosFijosPorRamos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActivosFijosPorRamos!=null) {
				this.jTabbedPaneBusquedasActivosFijosPorRamos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosActivosFijosPorRamos!=null) {
				this.jScrollPanelDatosActivosFijosPorRamos.setVisible(true);
			}
			
			if(this.jPanelPaginacionActivosFijosPorRamos!=null) {
				this.jPanelPaginacionActivosFijosPorRamos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesActivosFijosPorRamos!=null) {
				this.jPanelParametrosReportesActivosFijosPorRamos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionActivosFijosPorRamos!=null) {
				this.jScrollPanelDatosEdicionActivosFijosPorRamos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActivosFijosPorRamos!=null) {
				this.jTabbedPaneBusquedasActivosFijosPorRamos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosActivosFijosPorRamos!=null) {
				this.jScrollPanelDatosActivosFijosPorRamos.setVisible(false);
			}
			
			if(this.jPanelPaginacionActivosFijosPorRamos!=null) {
				this.jPanelPaginacionActivosFijosPorRamos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesActivosFijosPorRamos!=null) {
				this.jPanelParametrosReportesActivosFijosPorRamos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionActivosFijosPorRamos!=null) {
				this.jScrollPanelDatosEdicionActivosFijosPorRamos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActivosFijosPorRamos!=null) {
				this.jTabbedPaneBusquedasActivosFijosPorRamos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosActivosFijosPorRamos!=null) {
				this.jScrollPanelDatosActivosFijosPorRamos.setVisible(false);
			}
			
			if(this.jPanelPaginacionActivosFijosPorRamos!=null) {
				this.jPanelPaginacionActivosFijosPorRamos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesActivosFijosPorRamos!=null) {
				this.jPanelParametrosReportesActivosFijosPorRamos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionActivosFijosPorRamos!=null) {
				this.jScrollPanelDatosEdicionActivosFijosPorRamos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActivosFijosPorRamos!=null) {
				this.jTabbedPaneBusquedasActivosFijosPorRamos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosActivosFijosPorRamos!=null) {
				this.jScrollPanelDatosActivosFijosPorRamos.setVisible(false);
			}
			
			if(this.jPanelPaginacionActivosFijosPorRamos!=null) {
				this.jPanelPaginacionActivosFijosPorRamos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesActivosFijosPorRamos!=null) {
				this.jPanelParametrosReportesActivosFijosPorRamos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionActivosFijosPorRamos!=null) {
				this.jScrollPanelDatosEdicionActivosFijosPorRamos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActivosFijosPorRamos!=null) {
				this.jTabbedPaneBusquedasActivosFijosPorRamos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosActivosFijosPorRamos!=null) {
				this.jScrollPanelDatosActivosFijosPorRamos.setVisible(true);
			}
			
			if(this.jPanelPaginacionActivosFijosPorRamos!=null) {
				this.jPanelPaginacionActivosFijosPorRamos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesActivosFijosPorRamos!=null) {
				this.jPanelParametrosReportesActivosFijosPorRamos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionActivosFijosPorRamos!=null) {
				this.jScrollPanelDatosEdicionActivosFijosPorRamos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActivosFijosPorRamos!=null) {
				this.jTabbedPaneBusquedasActivosFijosPorRamos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosActivosFijosPorRamos!=null) {
				this.jScrollPanelDatosActivosFijosPorRamos.setVisible(true);
			}
			
			if(this.jPanelPaginacionActivosFijosPorRamos!=null) {
				this.jPanelPaginacionActivosFijosPorRamos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesActivosFijosPorRamos!=null) {
				this.jPanelParametrosReportesActivosFijosPorRamos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionActivosFijosPorRamos!=null) {
				this.jScrollPanelDatosEdicionActivosFijosPorRamos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActivosFijosPorRamos!=null) {
				this.jTabbedPaneBusquedasActivosFijosPorRamos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosActivosFijosPorRamos!=null) {
				this.jScrollPanelDatosActivosFijosPorRamos.setVisible(true);
			}
			
			if(this.jPanelPaginacionActivosFijosPorRamos!=null) {
				this.jPanelPaginacionActivosFijosPorRamos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesActivosFijosPorRamos!=null) {
				this.jPanelParametrosReportesActivosFijosPorRamos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasActivosFijosPorRamos!=null) {
					this.jTabbedPaneBusquedasActivosFijosPorRamos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesActivosFijosPorRamos!=null) {
				this.jPanelParametrosReportesActivosFijosPorRamos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActivosFijosPorRamos!=null) {
				this.jTabbedPaneBusquedasActivosFijosPorRamos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesActivosFijosPorRamos!=null) {
				this.jPanelParametrosReportesActivosFijosPorRamos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaActivosFijosPorRamos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaActivosFijosPorRamos) {this.jTabbedPaneBusquedasActivosFijosPorRamos.remove(jPanelBusquedaActivosFijosPorRamosActivosFijosPorRamos);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoRamoActivoFijo(Boolean isParaTipoRamoActivoFijo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoRamoActivoFijoNegation=!isParaTipoRamoActivoFijo;

			this.isVisibilidadBusquedaActivosFijosPorRamos=isParaTipoRamoActivoFijo;
			if(!this.isVisibilidadBusquedaActivosFijosPorRamos) {this.jTabbedPaneBusquedasActivosFijosPorRamos.remove(jPanelBusquedaActivosFijosPorRamosActivosFijosPorRamos);}
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
			
			this.inicializarActualizarBindingTablaActivosFijosPorRamos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioActivosFijosPorRamos() {
		this.updateBorderResaltarBusquedasFormularioActivosFijosPorRamos();
		this.updateVisibilidadBusquedasFormularioActivosFijosPorRamos();
		this.updateHabilitarBusquedasFormularioActivosFijosPorRamos();
	}
	
	public void updateBorderResaltarBusquedasFormularioActivosFijosPorRamos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasActivosFijosPorRamos.getComponents().length>0) {
	

		if(this.activosfijosporramosConstantesFunciones.resaltarBusquedaActivosFijosPorRamosActivosFijosPorRamos!=null) {
			index= this.jTabbedPaneBusquedasActivosFijosPorRamos.indexOfComponent(this.jPanelBusquedaActivosFijosPorRamosActivosFijosPorRamos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasActivosFijosPorRamos.getComponent(index);
				jPanel.setBorder(this.activosfijosporramosConstantesFunciones.resaltarBusquedaActivosFijosPorRamosActivosFijosPorRamos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioActivosFijosPorRamos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasActivosFijosPorRamos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasActivosFijosPorRamos.indexOfComponent(this.jPanelBusquedaActivosFijosPorRamosActivosFijosPorRamos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasActivosFijosPorRamos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.activosfijosporramosConstantesFunciones.mostrarBusquedaActivosFijosPorRamosActivosFijosPorRamos);
			if(!this.activosfijosporramosConstantesFunciones.mostrarBusquedaActivosFijosPorRamosActivosFijosPorRamos && index>-1) {
				this.jTabbedPaneBusquedasActivosFijosPorRamos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioActivosFijosPorRamos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasActivosFijosPorRamos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasActivosFijosPorRamos.indexOfComponent(this.jPanelBusquedaActivosFijosPorRamosActivosFijosPorRamos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasActivosFijosPorRamos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.activosfijosporramosConstantesFunciones.activarBusquedaActivosFijosPorRamosActivosFijosPorRamos);
				this.jTabbedPaneBusquedasActivosFijosPorRamos.setEnabledAt(index,this.activosfijosporramosConstantesFunciones.activarBusquedaActivosFijosPorRamosActivosFijosPorRamos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaActivosFijosPorRamos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaActivosFijosPorRamos")) {
			index= this.jTabbedPaneBusquedasActivosFijosPorRamos.indexOfComponent(this.jPanelBusquedaActivosFijosPorRamosActivosFijosPorRamos);

			this.jTabbedPaneBusquedasActivosFijosPorRamos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasActivosFijosPorRamos.getComponent(index);

			this.activosfijosporramosConstantesFunciones.setResaltarBusquedaActivosFijosPorRamosActivosFijosPorRamos(resaltar);

			jPanel.setBorder(this.activosfijosporramosConstantesFunciones.resaltarBusquedaActivosFijosPorRamosActivosFijosPorRamos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarActivosFijosPorRamos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioActivosFijosPorRamos() throws Exception {

		if(this.jInternalFrameDetalleFormActivosFijosPorRamos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioActivosFijosPorRamos();
		this.updateVisibilidadResaltarControlesFormularioActivosFijosPorRamos();
		this.updateHabilitarResaltarControlesFormularioActivosFijosPorRamos();
		
	}
	
	public void updateBorderResaltarControlesFormularioActivosFijosPorRamos() throws Exception {
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.activosfijosporramosConstantesFunciones.resaltaridActivosFijosPorRamos!=null && this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelidActivosFijosPorRamos.setBorder(this.activosfijosporramosConstantesFunciones.resaltaridActivosFijosPorRamos);}
		if(this.activosfijosporramosConstantesFunciones.resaltarid_empresaActivosFijosPorRamos!=null && this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_empresaActivosFijosPorRamos.setBorder(this.activosfijosporramosConstantesFunciones.resaltarid_empresaActivosFijosPorRamos);}
		if(this.activosfijosporramosConstantesFunciones.resaltarid_tipo_ramo_activo_fijoActivosFijosPorRamos!=null && this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.setBorder(this.activosfijosporramosConstantesFunciones.resaltarid_tipo_ramo_activo_fijoActivosFijosPorRamos);}
		if(this.activosfijosporramosConstantesFunciones.resaltarnombre_sub_grupoActivosFijosPorRamos!=null && this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombre_sub_grupoActivosFijosPorRamos.setBorder(this.activosfijosporramosConstantesFunciones.resaltarnombre_sub_grupoActivosFijosPorRamos);}
		if(this.activosfijosporramosConstantesFunciones.resaltarnombre_detalle_grupoActivosFijosPorRamos!=null && this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombre_detalle_grupoActivosFijosPorRamos.setBorder(this.activosfijosporramosConstantesFunciones.resaltarnombre_detalle_grupoActivosFijosPorRamos);}
		if(this.activosfijosporramosConstantesFunciones.resaltarclaveActivosFijosPorRamos!=null && this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldclaveActivosFijosPorRamos.setBorder(this.activosfijosporramosConstantesFunciones.resaltarclaveActivosFijosPorRamos);}
		if(this.activosfijosporramosConstantesFunciones.resaltarnombreActivosFijosPorRamos!=null && this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombreActivosFijosPorRamos.setBorder(this.activosfijosporramosConstantesFunciones.resaltarnombreActivosFijosPorRamos);}
		if(this.activosfijosporramosConstantesFunciones.resaltarfecha_compraActivosFijosPorRamos!=null && this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {this.jInternalFrameDetalleFormActivosFijosPorRamos.jDateChooserfecha_compraActivosFijosPorRamos.setBorder(this.activosfijosporramosConstantesFunciones.resaltarfecha_compraActivosFijosPorRamos);}
		if(this.activosfijosporramosConstantesFunciones.resaltarvida_utilActivosFijosPorRamos!=null && this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldvida_utilActivosFijosPorRamos.setBorder(this.activosfijosporramosConstantesFunciones.resaltarvida_utilActivosFijosPorRamos);}
		if(this.activosfijosporramosConstantesFunciones.resaltarcosto_de_compraActivosFijosPorRamos!=null && this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldcosto_de_compraActivosFijosPorRamos.setBorder(this.activosfijosporramosConstantesFunciones.resaltarcosto_de_compraActivosFijosPorRamos);}
		if(this.activosfijosporramosConstantesFunciones.resaltarmarcaActivosFijosPorRamos!=null && this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreamarcaActivosFijosPorRamos.setBorder(this.activosfijosporramosConstantesFunciones.resaltarmarcaActivosFijosPorRamos);}
		if(this.activosfijosporramosConstantesFunciones.resaltarmodeloActivosFijosPorRamos!=null && this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreamodeloActivosFijosPorRamos.setBorder(this.activosfijosporramosConstantesFunciones.resaltarmodeloActivosFijosPorRamos);}
		if(this.activosfijosporramosConstantesFunciones.resaltarnumero_matriculaActivosFijosPorRamos!=null && this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_matriculaActivosFijosPorRamos.setBorder(this.activosfijosporramosConstantesFunciones.resaltarnumero_matriculaActivosFijosPorRamos);}
		if(this.activosfijosporramosConstantesFunciones.resaltarnumero_motorActivosFijosPorRamos!=null && this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_motorActivosFijosPorRamos.setBorder(this.activosfijosporramosConstantesFunciones.resaltarnumero_motorActivosFijosPorRamos);}
		if(this.activosfijosporramosConstantesFunciones.resaltarnumero_chasisActivosFijosPorRamos!=null && this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_chasisActivosFijosPorRamos.setBorder(this.activosfijosporramosConstantesFunciones.resaltarnumero_chasisActivosFijosPorRamos);}
		if(this.activosfijosporramosConstantesFunciones.resaltarnumero_placaActivosFijosPorRamos!=null && this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_placaActivosFijosPorRamos.setBorder(this.activosfijosporramosConstantesFunciones.resaltarnumero_placaActivosFijosPorRamos);}
		if(this.activosfijosporramosConstantesFunciones.resaltarvalor_comercialActivosFijosPorRamos!=null && this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldvalor_comercialActivosFijosPorRamos.setBorder(this.activosfijosporramosConstantesFunciones.resaltarvalor_comercialActivosFijosPorRamos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioActivosFijosPorRamos() throws Exception {		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
	
		//this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelidActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostraridActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jPanelidActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostraridActivosFijosPorRamos);
		//this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_empresaActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarid_empresaActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jPanelid_empresaActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarid_empresaActivosFijosPorRamos);
		//this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarid_tipo_ramo_activo_fijoActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jPanelid_tipo_ramo_activo_fijoActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarid_tipo_ramo_activo_fijoActivosFijosPorRamos);
		//this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombre_sub_grupoActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarnombre_sub_grupoActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jPanelnombre_sub_grupoActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarnombre_sub_grupoActivosFijosPorRamos);
		//this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombre_detalle_grupoActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarnombre_detalle_grupoActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jPanelnombre_detalle_grupoActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarnombre_detalle_grupoActivosFijosPorRamos);
		//this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldclaveActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarclaveActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jPanelclaveActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarclaveActivosFijosPorRamos);
		//this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombreActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarnombreActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jPanelnombreActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarnombreActivosFijosPorRamos);
		//this.jInternalFrameDetalleFormActivosFijosPorRamos.jDateChooserfecha_compraActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarfecha_compraActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jPanelfecha_compraActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarfecha_compraActivosFijosPorRamos);
		//this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldvida_utilActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarvida_utilActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jPanelvida_utilActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarvida_utilActivosFijosPorRamos);
		//this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldcosto_de_compraActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarcosto_de_compraActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jPanelcosto_de_compraActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarcosto_de_compraActivosFijosPorRamos);
		//this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreamarcaActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarmarcaActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jPanelmarcaActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarmarcaActivosFijosPorRamos);
		//this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreamodeloActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarmodeloActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jPanelmodeloActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarmodeloActivosFijosPorRamos);
		//this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_matriculaActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarnumero_matriculaActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jPanelnumero_matriculaActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarnumero_matriculaActivosFijosPorRamos);
		//this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_motorActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarnumero_motorActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jPanelnumero_motorActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarnumero_motorActivosFijosPorRamos);
		//this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_chasisActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarnumero_chasisActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jPanelnumero_chasisActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarnumero_chasisActivosFijosPorRamos);
		//this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_placaActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarnumero_placaActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jPanelnumero_placaActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarnumero_placaActivosFijosPorRamos);
		//this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldvalor_comercialActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarvalor_comercialActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jPanelvalor_comercialActivosFijosPorRamos.setVisible(this.activosfijosporramosConstantesFunciones.mostrarvalor_comercialActivosFijosPorRamos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioActivosFijosPorRamos() throws Exception {
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormActivosFijosPorRamos!=null) {
	
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jLabelidActivosFijosPorRamos.setEnabled(this.activosfijosporramosConstantesFunciones.activaridActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_empresaActivosFijosPorRamos.setEnabled(this.activosfijosporramosConstantesFunciones.activarid_empresaActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.setEnabled(this.activosfijosporramosConstantesFunciones.activarid_tipo_ramo_activo_fijoActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombre_sub_grupoActivosFijosPorRamos.setEnabled(this.activosfijosporramosConstantesFunciones.activarnombre_sub_grupoActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombre_detalle_grupoActivosFijosPorRamos.setEnabled(this.activosfijosporramosConstantesFunciones.activarnombre_detalle_grupoActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldclaveActivosFijosPorRamos.setEnabled(this.activosfijosporramosConstantesFunciones.activarclaveActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreanombreActivosFijosPorRamos.setEnabled(this.activosfijosporramosConstantesFunciones.activarnombreActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jDateChooserfecha_compraActivosFijosPorRamos.setEnabled(this.activosfijosporramosConstantesFunciones.activarfecha_compraActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldvida_utilActivosFijosPorRamos.setEnabled(this.activosfijosporramosConstantesFunciones.activarvida_utilActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldcosto_de_compraActivosFijosPorRamos.setEnabled(this.activosfijosporramosConstantesFunciones.activarcosto_de_compraActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreamarcaActivosFijosPorRamos.setEnabled(this.activosfijosporramosConstantesFunciones.activarmarcaActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextAreamodeloActivosFijosPorRamos.setEnabled(this.activosfijosporramosConstantesFunciones.activarmodeloActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_matriculaActivosFijosPorRamos.setEnabled(this.activosfijosporramosConstantesFunciones.activarnumero_matriculaActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_motorActivosFijosPorRamos.setEnabled(this.activosfijosporramosConstantesFunciones.activarnumero_motorActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_chasisActivosFijosPorRamos.setEnabled(this.activosfijosporramosConstantesFunciones.activarnumero_chasisActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldnumero_placaActivosFijosPorRamos.setEnabled(this.activosfijosporramosConstantesFunciones.activarnumero_placaActivosFijosPorRamos);
		this.jInternalFrameDetalleFormActivosFijosPorRamos.jTextFieldvalor_comercialActivosFijosPorRamos.setEnabled(this.activosfijosporramosConstantesFunciones.activarvalor_comercialActivosFijosPorRamos);
		}
	}
	
		
}