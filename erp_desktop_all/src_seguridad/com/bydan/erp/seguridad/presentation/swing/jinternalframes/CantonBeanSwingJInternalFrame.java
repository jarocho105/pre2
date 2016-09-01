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

import com.bydan.erp.seguridad.util.CantonConstantesFunciones;
import com.bydan.erp.seguridad.util.CantonParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.CantonParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.CantonBean;
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

import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CantonBeanSwingJInternalFrame extends CantonJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CantonBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Canton> cantonValidator = new ClassValidator<Canton>(Canton.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Canton canton;	
	public Canton cantonAux;
	public Canton cantonAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Canton cantonTotales;
	public Long idCantonActual;
	public Long iIdNuevoCanton=0L;
	public int rowIndexActual=0;
	
	
	
	
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

		
	
	
	
	
	

	public Boolean isTienePermisosBarrio=false;

	public Boolean getIsTienePermisosBarrio() {
		return isTienePermisosBarrio;
	}

	public void setIsTienePermisosBarrio(Boolean isTienePermisosBarrio) {
		this.isTienePermisosBarrio= isTienePermisosBarrio;
	}


	public Boolean isTienePermisosParroquia=false;

	public Boolean getIsTienePermisosParroquia() {
		return isTienePermisosParroquia;
	}

	public void setIsTienePermisosParroquia(Boolean isTienePermisosParroquia) {
		this.isTienePermisosParroquia= isTienePermisosParroquia;
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
	
	public Boolean isPermisoTodoCanton;
	public Boolean isPermisoNuevoCanton;
	public Boolean isPermisoActualizarCanton;
	public Boolean isPermisoActualizarOriginalCanton;
	public Boolean isPermisoEliminarCanton;
	public Boolean isPermisoGuardarCambiosCanton;
	public Boolean isPermisoConsultaCanton;
	public Boolean isPermisoBusquedaCanton;
	public Boolean isPermisoReporteCanton;
	public Boolean isPermisoPaginacionMedioCanton;
	public Boolean isPermisoPaginacionAltoCanton;
	public Boolean isPermisoPaginacionTodoCanton;
	public Boolean isPermisoCopiarCanton;
	public Boolean isPermisoVerFormCanton;
	public Boolean isPermisoDuplicarCanton;
	public Boolean isPermisoOrdenCanton;
	
	
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
	
	public CantonParameterReturnGeneral cantonReturnGeneral;
	public CantonParameterReturnGeneral cantonParameterGeneral;
	
	

	public BarrioLogic barrioLogic=null;

	public BarrioLogic getBarrioLogic() {
		return barrioLogic;
	}

	public void setBarrioLogic(BarrioLogic barrioLogic) {
		this.barrioLogic = barrioLogic;
	}


	public ParroquiaLogic parroquiaLogic=null;

	public ParroquiaLogic getParroquiaLogic() {
		return parroquiaLogic;
	}

	public void setParroquiaLogic(ParroquiaLogic parroquiaLogic) {
		this.parroquiaLogic = parroquiaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCanton=false;
	public Boolean esParaAccionDesdeFormularioCanton=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CantonSessionBeanAdditional cantonSessionBeanAdditional=null;
	
	public CantonSessionBeanAdditional getCantonSessionBeanAdditional() {
		return this.cantonSessionBeanAdditional;
	}
	
	public void setCantonSessionBeanAdditional(CantonSessionBeanAdditional cantonSessionBeanAdditional) {
		try {
			this.cantonSessionBeanAdditional=cantonSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CantonBeanSwingJInternalFrameAdditional cantonBeanSwingJInternalFrameAdditional=null;
	//public class CantonBeanSwingJInternalFrame
	
	public CantonBeanSwingJInternalFrameAdditional getCantonBeanSwingJInternalFrameAdditional() {
		return this.cantonBeanSwingJInternalFrameAdditional;
	}
	
	public void setCantonBeanSwingJInternalFrameAdditional(CantonBeanSwingJInternalFrameAdditional cantonBeanSwingJInternalFrameAdditional) {
		try {
			this.cantonBeanSwingJInternalFrameAdditional=cantonBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CantonLogic cantonLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Canton cantonBean;
	public CantonConstantesFunciones cantonConstantesFunciones;
	//public CantonParameterReturnGeneral cantonReturnGeneral;
	
	//FK
	
	public ProvinciaLogic provinciaLogic;
	
	//PARAMETROS
	
	
	//public List<Canton> cantons;	
	//public List<Canton> cantonsEliminados;
	//public List<Canton> cantonsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCanton=false;
	public Boolean isVisibilidadCeldaDuplicarCanton=true;
	public Boolean isVisibilidadCeldaCopiarCanton=true;
	public Boolean isVisibilidadCeldaVerFormCanton=true;
	public Boolean isVisibilidadCeldaOrdenCanton=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCanton=false;
	public Boolean isVisibilidadCeldaModificarCanton=false;
	public Boolean isVisibilidadCeldaActualizarCanton=false;
	public Boolean isVisibilidadCeldaEliminarCanton=false;
	public Boolean isVisibilidadCeldaCancelarCanton=false;
	public Boolean isVisibilidadCeldaGuardarCanton=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCanton=false;	
	
	
	public Boolean isVisibilidadFK_IdProvincia=false;
	
	public Long getiIdNuevoCanton() {
		return this.iIdNuevoCanton;
	}

	public void setiIdNuevoCanton(Long iIdNuevoCanton) {
		this.iIdNuevoCanton = iIdNuevoCanton;
	}
	
	public Long getidCantonActual() {
		return this.idCantonActual;
	}

	public void setidCantonActual(Long idCantonActual) {
		this.idCantonActual = idCantonActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Canton getcanton() {
		return this.canton;
	}

	public void setcanton(Canton canton) {
		this.canton = canton;
	}
	
	public Canton getcantonAux() {
		return this.cantonAux;
	}

	public void setcantonAux(Canton cantonAux) {
		this.cantonAux = cantonAux;
	}				
	
	public Canton getcantonAnterior() {
		return this.cantonAnterior;
	}

	public void setcantonAnterior(Canton cantonAnterior) {
		this.cantonAnterior = cantonAnterior;
	}	
	
	public Canton getcantonTotales() {
		return this.cantonTotales;
	}

	public void setcantonTotales(Canton cantonTotales) {
		this.cantonTotales = cantonTotales;
	}	
	
	public Canton getcantonBean() {
		return this.cantonBean;
	}

	public void setcantonBean(Canton cantonBean) {
		this.cantonBean = cantonBean;
	}	
	
	public CantonParameterReturnGeneral getcantonReturnGeneral() {
		return this.cantonReturnGeneral;
	}

	public void setcantonReturnGeneral(CantonParameterReturnGeneral cantonReturnGeneral) {
		this.cantonReturnGeneral = cantonReturnGeneral;
	}	
	
	
	public Long id_provinciaFK_IdProvincia=-1L;

	public Long getid_provinciaFK_IdProvincia() {
		return this.id_provinciaFK_IdProvincia;
	}

	public void setid_provinciaFK_IdProvincia(Long id_provinciaFK_IdProvincia) {
		this.id_provinciaFK_IdProvincia = id_provinciaFK_IdProvincia;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CantonLogic getCantonLogic()	{		
		return cantonLogic;
	}

	public void setCantonLogic(CantonLogic cantonLogic) {
		this.cantonLogic = cantonLogic;
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
	
	public Boolean getIsEsNuevoCanton() {
		return isEsNuevoCanton;
	}

	public void setIsEsNuevoCanton(Boolean isEsNuevoCanton) {
		this.isEsNuevoCanton = isEsNuevoCanton;
	}

	public Boolean getEsParaAccionDesdeFormularioCanton() {
		return esParaAccionDesdeFormularioCanton;
	}
	
	public void setEsParaAccionDesdeFormularioCanton(Boolean esParaAccionDesdeFormularioCanton) {
		this.esParaAccionDesdeFormularioCanton = esParaAccionDesdeFormularioCanton;
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

			if(this.cantonSessionBean==null) {
				this.cantonSessionBean=new CantonSessionBean();
			}

			if(!this.cantonSessionBean.getisBusquedaDesdeForeignKeySesionProvincia()) {
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
					provinciaLogic.getEntityWithConnection(cantonSessionBean.getlidProvinciaActual());
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

					if(this.canton!=null) {
						this.canton.setProvincia(provinciaTemp);
					}

					if(this.jInternalFrameDetalleFormCanton!=null) {
						this.jInternalFrameDetalleFormCanton.jComboBoxid_provinciaCanton.setSelectedItem(provinciaTemp);
					}
				} else {
					//jComboBoxid_provinciaCanton.setSelectedItem(provinciaTemp);
					if(this.jInternalFrameDetalleFormCanton!=null) {
						if(this.jInternalFrameDetalleFormCanton.jComboBoxid_provinciaCanton.getItemCount()>0) {
							this.jInternalFrameDetalleFormCanton.jComboBoxid_provinciaCanton.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProvincia") || sFormularioTipoBusqueda.equals("Todos")){
					if(provinciaTemp!=null && jComboBoxid_provinciaFK_IdProvinciaCanton!=null) {
						jComboBoxid_provinciaFK_IdProvinciaCanton.setSelectedItem(provinciaTemp);
					} else {
						if(jComboBoxid_provinciaFK_IdProvinciaCanton!=null) {
							//jComboBoxid_provinciaFK_IdProvinciaCanton.setSelectedItem(provinciaTemp);
							if(jComboBoxid_provinciaFK_IdProvinciaCanton.getItemCount()>0) {
								jComboBoxid_provinciaFK_IdProvinciaCanton.setSelectedIndex(0);
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
	public void setActualProvinciaForeignKeyGenerico(Long idProvinciaSeleccionado,JComboBox jComboBoxid_provinciaCantonGenerico)throws Exception
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
				jComboBoxid_provinciaCantonGenerico.setSelectedItem(provinciaTemp);
			} else {
				if(jComboBoxid_provinciaCantonGenerico!=null && jComboBoxid_provinciaCantonGenerico.getItemCount()>0) {
					jComboBoxid_provinciaCantonGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProvinciaForeignKey(Canton canton,JComboBox jComboBoxid_provinciaCantonGenerico)throws Exception
	{
		try
		{
			Provincia  provinciaAux=new Provincia();

			if(jComboBoxid_provinciaCantonGenerico==null) {
				provinciaAux=(Provincia)this.jInternalFrameDetalleFormCanton.jComboBoxid_provinciaCanton.getSelectedItem();
			} else {
				provinciaAux=(Provincia)jComboBoxid_provinciaCantonGenerico.getSelectedItem();
			}

			if(provinciaAux!=null && provinciaAux.getId()!=null) {
				canton.setid_provincia(provinciaAux.getId());
				canton.setprovincia_descripcion(CantonConstantesFunciones.getProvinciaDescripcion(provinciaAux));
				canton.setProvincia(provinciaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProvinciasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProvincia=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CantonJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCanton!=null) { 
							this.jInternalFrameDetalleFormCanton.jComboBoxid_provinciaCanton.removeAllItems();

							for(Provincia provincia:this.provinciasForeignKey) {
								this.jInternalFrameDetalleFormCanton.jComboBoxid_provinciaCanton.addItem(provincia);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCanton!=null) { 
					}

					if(!CantonJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProvincia") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CantonJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_provinciaFK_IdProvinciaCanton.removeAllItems();

							for(Provincia provincia:this.provinciasForeignKey) {
								this.jComboBoxid_provinciaFK_IdProvinciaCanton.addItem(provincia);
							}
						}

						if(!CantonJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameProvinciaForeignKey(Provincia provincia,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCanton!=null) {
							this.jInternalFrameDetalleFormCanton.jComboBoxid_provinciaCanton.setSelectedItem(provincia);
						}
					} else {
						if(this.jInternalFrameDetalleFormCanton!=null) {
							this.jInternalFrameDetalleFormCanton.jComboBoxid_provinciaCanton.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_provinciaFK_IdProvinciaCanton.setSelectedItem(provincia);
						} else {
							this.jComboBoxid_provinciaFK_IdProvinciaCanton.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCanton() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CantonConstantesFunciones.refrescarForeignKeysDescripcionesCanton(this.cantonLogic.getCantons());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CantonConstantesFunciones.refrescarForeignKeysDescripcionesCanton(this.cantons);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Provincia.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cantonLogic.setCantons(this.cantons);
			cantonLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CantonParameterReturnGeneral getCantonParameterGeneral() {
		return this.cantonParameterGeneral;
	}
	
	public void setCantonParameterGeneral(CantonParameterReturnGeneral cantonParameterGeneral) {
		this.cantonParameterGeneral = cantonParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCanton() {
		return isPermisoTodoCanton;
	}

	public void setIsPermisoTodoCanton(Boolean isPermisoTodoCanton) {
		this.isPermisoTodoCanton = isPermisoTodoCanton;
	}

	public Boolean getIsPermisoNuevoCanton() {
		return isPermisoNuevoCanton;
	}

	public void setIsPermisoNuevoCanton(Boolean isPermisoNuevoCanton) {
		this.isPermisoNuevoCanton = isPermisoNuevoCanton;
	}

	public Boolean getIsPermisoActualizarCanton() {
		return isPermisoActualizarCanton;
	}

	public void setIsPermisoActualizarCanton(Boolean isPermisoActualizarCanton) {
		this.isPermisoActualizarCanton = isPermisoActualizarCanton;
	}

	public Boolean getIsPermisoEliminarCanton() {
		return isPermisoEliminarCanton;
	}

	public void setIsPermisoEliminarCanton(Boolean isPermisoEliminarCanton) {
		this.isPermisoEliminarCanton = isPermisoEliminarCanton;
	}

	public Boolean getIsPermisoGuardarCambiosCanton() {
		return isPermisoGuardarCambiosCanton;
	}

	public void setIsPermisoGuardarCambiosCanton(Boolean isPermisoGuardarCambiosCanton) {
		this.isPermisoGuardarCambiosCanton = isPermisoGuardarCambiosCanton;
	}
	
	public Boolean getIsPermisoConsultaCanton() {
		return isPermisoConsultaCanton;
	}

	public void setIsPermisoConsultaCanton(Boolean isPermisoConsultaCanton) {
		this.isPermisoConsultaCanton = isPermisoConsultaCanton;
	}

	public Boolean getIsPermisoBusquedaCanton() {
		return isPermisoBusquedaCanton;
	}

	public void setIsPermisoBusquedaCanton(Boolean isPermisoBusquedaCanton) {
		this.isPermisoBusquedaCanton = isPermisoBusquedaCanton;
	}

	public Boolean getIsPermisoReporteCanton() {
		return isPermisoReporteCanton;
	}

	public void setIsPermisoReporteCanton(Boolean isPermisoReporteCanton) {
		this.isPermisoReporteCanton = isPermisoReporteCanton;
	}
	
	public Boolean getIsPermisoPaginacionMedioCanton() {
		return isPermisoPaginacionMedioCanton;
	}

	public void setIsPermisoPaginacionMedioCanton(Boolean isPermisoPaginacionMedioCanton) {
		this.isPermisoPaginacionMedioCanton = isPermisoPaginacionMedioCanton;
	}
	
	public Boolean getIsPermisoPaginacionTodoCanton() {
		return isPermisoPaginacionTodoCanton;
	}

	public void setIsPermisoPaginacionTodoCanton(Boolean isPermisoPaginacionTodoCanton) {
		this.isPermisoPaginacionTodoCanton = isPermisoPaginacionTodoCanton;
	}
	
	public Boolean getIsPermisoPaginacionAltoCanton() {
		return isPermisoPaginacionAltoCanton;
	}

	public void setIsPermisoPaginacionAltoCanton(Boolean isPermisoPaginacionAltoCanton) {
		this.isPermisoPaginacionAltoCanton = isPermisoPaginacionAltoCanton;
	}
	
	public Boolean getIsPermisoCopiarCanton() {
		return isPermisoCopiarCanton;
	}

	public void setIsPermisoCopiarCanton(Boolean isPermisoCopiarCanton) {
		this.isPermisoCopiarCanton = isPermisoCopiarCanton;
	}
	
	public Boolean getIsPermisoVerFormCanton() {
		return isPermisoVerFormCanton;
	}

	public void setIsPermisoVerFormCanton(Boolean isPermisoVerFormCanton) {
		this.isPermisoVerFormCanton = isPermisoVerFormCanton;
	}
	
	public Boolean getIsPermisoDuplicarCanton() {
		return isPermisoDuplicarCanton;
	}

	public void setIsPermisoDuplicarCanton(Boolean isPermisoDuplicarCanton) {
		this.isPermisoDuplicarCanton = isPermisoDuplicarCanton;
	}
	
	public Boolean getIsPermisoOrdenCanton() {
		return isPermisoOrdenCanton;
	}

	public void setIsPermisoOrdenCanton(Boolean isPermisoOrdenCanton) {
		this.isPermisoOrdenCanton = isPermisoOrdenCanton;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCanton() {
		return isVisibilidadCeldaNuevoCanton;
	}

	public void setIsVisibilidadCeldaNuevoCanton(Boolean isVisibilidadCeldaNuevoCanton) {
		this.isVisibilidadCeldaNuevoCanton = isVisibilidadCeldaNuevoCanton;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCanton() {
		return isVisibilidadCeldaDuplicarCanton;
	}

	public void setIsVisibilidadCeldaDuplicarCanton(Boolean isVisibilidadCeldaDuplicarCanton) {
		this.isVisibilidadCeldaDuplicarCanton = isVisibilidadCeldaDuplicarCanton;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCanton() {
		return isVisibilidadCeldaCopiarCanton;
	}

	public void setIsVisibilidadCeldaCopiarCanton(Boolean isVisibilidadCeldaCopiarCanton) {
		this.isVisibilidadCeldaCopiarCanton = isVisibilidadCeldaCopiarCanton;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCanton() {
		return isVisibilidadCeldaVerFormCanton;
	}

	public void setIsVisibilidadCeldaVerFormCanton(Boolean isVisibilidadCeldaVerFormCanton) {
		this.isVisibilidadCeldaVerFormCanton = isVisibilidadCeldaVerFormCanton;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCanton() {
		return isVisibilidadCeldaOrdenCanton;
	}

	public void setIsVisibilidadCeldaOrdenCanton(Boolean isVisibilidadCeldaOrdenCanton) {
		this.isVisibilidadCeldaOrdenCanton = isVisibilidadCeldaOrdenCanton;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCanton() {
		return isVisibilidadCeldaNuevoRelacionesCanton;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCanton(Boolean isVisibilidadCeldaNuevoRelacionesCanton) {
		this.isVisibilidadCeldaNuevoRelacionesCanton = isVisibilidadCeldaNuevoRelacionesCanton;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCanton() {
		return isVisibilidadCeldaModificarCanton;
	}

	public void setIsVisibilidadCeldaModificarCanton(Boolean isVisibilidadCeldaModificarCanton) {
		this.isVisibilidadCeldaModificarCanton = isVisibilidadCeldaModificarCanton;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCanton() {
		return isVisibilidadCeldaActualizarCanton;
	}

	public void setIsVisibilidadCeldaActualizarCanton(Boolean isVisibilidadCeldaActualizarCanton) {
		this.isVisibilidadCeldaActualizarCanton = isVisibilidadCeldaActualizarCanton;
	}

	public Boolean getIsVisibilidadCeldaEliminarCanton() {
		return isVisibilidadCeldaEliminarCanton;
	}

	public void setIsVisibilidadCeldaEliminarCanton(Boolean isVisibilidadCeldaEliminarCanton) {
		this.isVisibilidadCeldaEliminarCanton = isVisibilidadCeldaEliminarCanton;
	}

	public Boolean getIsVisibilidadCeldaCancelarCanton() {
		return isVisibilidadCeldaCancelarCanton;
	}

	public void setIsVisibilidadCeldaCancelarCanton(Boolean isVisibilidadCeldaCancelarCanton) {
		this.isVisibilidadCeldaCancelarCanton = isVisibilidadCeldaCancelarCanton;
	}

	public Boolean getIsVisibilidadCeldaGuardarCanton() {
		return isVisibilidadCeldaGuardarCanton;
	}

	public void setIsVisibilidadCeldaGuardarCanton(Boolean isVisibilidadCeldaGuardarCanton) {
		this.isVisibilidadCeldaGuardarCanton = isVisibilidadCeldaGuardarCanton;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCanton() {
		return isVisibilidadCeldaGuardarCambiosCanton;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCanton(Boolean isVisibilidadCeldaGuardarCambiosCanton) {
		this.isVisibilidadCeldaGuardarCambiosCanton = isVisibilidadCeldaGuardarCambiosCanton;
	}
		
	public CantonSessionBean getcantonSessionBean() {
		return this.cantonSessionBean;
	}
	
	public void setcantonSessionBean(CantonSessionBean cantonSessionBean) {
		this.cantonSessionBean=cantonSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdProvincia() {
		return this.isVisibilidadFK_IdProvincia;
	}

	public void setisVisibilidadFK_IdProvincia(Boolean isVisibilidadFK_IdProvincia) {
		this.isVisibilidadFK_IdProvincia=isVisibilidadFK_IdProvincia;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCanton(Canton canton)throws Exception {
		try {
			
				this.setActualParaGuardarProvinciaForeignKey(canton,null);
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
	
	public void bugActualizarReferenciaActual(Canton canton,Canton cantonAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCanton(canton);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cantonAux.setId(canton.getId());
		cantonAux.setVersionRow(canton.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCanton();
		
			int intSelectedRow = this.jTableDatosCanton.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.canton =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.canton =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CantonJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCanton(this.canton,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCanton(this.canton);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cantonValidator.getInvalidValues(this.canton);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cantonLogic.setDatosCliente(datosCliente);
			cantonLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cantonAux=new  Canton();
				
				cantonAux.setIsNew(true);
				cantonAux.setIsChanged(true);
				
				cantonAux.setCantonOriginal(this.canton);
				
				cantonAux.setId(this.canton.getId());	
				cantonAux.setVersionRow(this.canton.getVersionRow());	
				cantonAux.setid_provincia(this.canton.getid_provincia());	
				cantonAux.setcodigo(this.canton.getcodigo());	
				cantonAux.setnombre(this.canton.getnombre());	
				cantonAux.setes_activo(this.canton.getes_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cantonSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cantonSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cantonAux,cantonLogic.getCantons());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cantonAux,cantons);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cantonSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cantonSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cantonLogic.saveCantons();//WithConnection
						//cantonLogic.getSetVersionRowCantons();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.canton,cantonAux);
					
					this.refrescarForeignKeysDescripcionesCanton();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cantonSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios().addAll(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barriosEliminados);
							this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiaLogic.getParroquias().addAll(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrios.addAll(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barriosEliminados);
							this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquias.addAll(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.cantonSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cantonLogic.saveCantonRelaciones(cantonAux,this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios(),this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiaLogic.getParroquias());//WithConnection
								//cantonLogic.getSetVersionRowCantons();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.canton,cantonAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrioLogic.setBarrios(new ArrayList<Barrio>());
							this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiaLogic.setParroquias(new ArrayList<Parroquia>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrios= new ArrayList<Barrio>();
							this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquias= new ArrayList<Parroquia>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.quitarFilaTotales();}
							cantonAux.setBarrios(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios());

							if(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.quitarFilaTotales();}
							cantonAux.setParroquias(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiaLogic.getParroquias());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cantonSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cantonSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cantonAux,cantonLogic.getCantons());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cantonAux,cantons);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.canton,cantonAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cantonAux=new  Canton();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cantonSessionBean.getEsGuardarRelacionado() 
					|| (this.cantonSessionBean.getEsGuardarRelacionado() && this.canton.getId()>=0)) {
						
					cantonAux.setIsNew(false);
				}
				
				cantonAux.setIsDeleted(false);
			
				cantonAux.setId(this.canton.getId());	
				cantonAux.setVersionRow(this.canton.getVersionRow());	
				cantonAux.setid_provincia(this.canton.getid_provincia());	
				cantonAux.setcodigo(this.canton.getcodigo());	
				cantonAux.setnombre(this.canton.getnombre());	
				cantonAux.setes_activo(this.canton.getes_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cantonAux,cantonLogic.getCantons());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cantonAux,cantons);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cantonSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cantonSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cantonLogic.saveCantons();//WithConnection
						//cantonLogic.getSetVersionRowCantons();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.canton,cantonAux);
					
					this.refrescarForeignKeysDescripcionesCanton();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cantonSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios().addAll(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barriosEliminados);
							this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiaLogic.getParroquias().addAll(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrios.addAll(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barriosEliminados);
							this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquias.addAll(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.cantonSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cantonLogic.saveCantonRelaciones(cantonAux,this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios(),this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiaLogic.getParroquias());//WithConnection
								//cantonLogic.getSetVersionRowCantons();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.canton,cantonAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrioLogic.setBarrios(new ArrayList<Barrio>());
							this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiaLogic.setParroquias(new ArrayList<Parroquia>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrios= new ArrayList<Barrio>();
							this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquias= new ArrayList<Parroquia>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.quitarFilaTotales();}
							cantonAux.setBarrios(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios());

							if(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.quitarFilaTotales();}
							cantonAux.setParroquias(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiaLogic.getParroquias());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cantonSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cantonSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cantonAux,cantonLogic.getCantons());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cantonAux,cantons);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.canton,cantonAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cantonAux=new  Canton();
				
				cantonAux.setIsNew(false);
				cantonAux.setIsChanged(false);
				
				cantonAux.setIsDeleted(true);
				
				cantonAux.setId(this.canton.getId());	
				cantonAux.setVersionRow(this.canton.getVersionRow());	
				cantonAux.setid_provincia(this.canton.getid_provincia());	
				cantonAux.setcodigo(this.canton.getcodigo());	
				cantonAux.setnombre(this.canton.getnombre());	
				cantonAux.setes_activo(this.canton.getes_activo());	
				
				if(this.cantonSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cantonAux.getId()>=0) {	
						this.cantonsEliminados.add(cantonAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cantonAux,cantonLogic.getCantons());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cantonAux,cantons);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cantonSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cantonSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cantonLogic.saveCantons();//WithConnection
						//cantonLogic.getSetVersionRowCantons();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cantonSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios().addAll(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barriosEliminados);
							this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiaLogic.getParroquias().addAll(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrios.addAll(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barriosEliminados);
							this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquias.addAll(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.cantonSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cantonLogic.saveCantonRelaciones(cantonAux,this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios(),this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiaLogic.getParroquias());//WithConnection
								//cantonLogic.getSetVersionRowCantons();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrioLogic.setBarrios(new ArrayList<Barrio>());
							this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiaLogic.setParroquias(new ArrayList<Parroquia>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrios= new ArrayList<Barrio>();
							this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquias= new ArrayList<Parroquia>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.quitarFilaTotales();}
							cantonAux.setBarrios(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios());

							if(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.quitarFilaTotales();}
							cantonAux.setParroquias(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiaLogic.getParroquias());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.cantonSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cantonSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cantonAux,cantonLogic.getCantons());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cantonAux,cantons);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.getCantons().addAll(this.cantonsEliminados);
					
					cantonLogic.saveCantons();//WithConnection
					//cantonLogic.getSetVersionRowCantons();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCanton();
				
				this.cantonsEliminados= new ArrayList<Canton>();		
			}
			
			if(this.cantonSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cantonSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Canton GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Canton",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.canton=cantonAux;
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
      		//this.finishProcessCanton();
      	}
		
	}	
	
	public void actualizarRelaciones(Canton cantonLocal) throws Exception {
		
		if(this.cantonSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				cantonLocal.setBarrios(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios());
				cantonLocal.setParroquias(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiaLogic.getParroquias());
			
			} else {
			
				cantonLocal.setBarrios(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrios);
				cantonLocal.setParroquias(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquias);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Canton cantonLocal) throws Exception {	
		if(this.cantonSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ProvinciaDetalleFormJInternalFrame.class)) {
				ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrameLocal=(ProvinciaBeanSwingJInternalFrame) ((ProvinciaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				provinciaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProvincia(provinciaBeanSwingJInternalFrameLocal.getprovincia(),true);
				provinciaBeanSwingJInternalFrameLocal.actualizarLista(provinciaBeanSwingJInternalFrameLocal.provincia,this.provinciasForeignKey);

				provinciaBeanSwingJInternalFrameLocal.actualizarRelaciones(provinciaBeanSwingJInternalFrameLocal.provincia);

				cantonLocal.setProvincia(provinciaBeanSwingJInternalFrameLocal.provincia);

				this.addItemDefectoCombosForeignKeyProvincia();
				this.cargarCombosFrameProvinciasForeignKey("Formulario");
				this.setActualProvinciaForeignKey(provinciaBeanSwingJInternalFrameLocal.provincia.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCantonActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCanton.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.canton =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.canton =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cantonValidator.getInvalidValues(this.canton);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Canton canton,List<Canton> cantons) throws Exception {
		try	{		
			CantonConstantesFunciones.actualizarLista(canton,cantons,this.cantonSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Canton canton,List<Canton> cantons) throws Exception {
		try	{			
			CantonConstantesFunciones.actualizarSelectedLista(canton,cantons);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Canton> cantonsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cantonsLocal=this.cantonLogic.getCantons();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cantonsLocal=this.cantons;
			}
			//ARCHITECTURE
		
			for(Canton cantonLocal:cantonsLocal) {
				if(this.permiteMantenimiento(cantonLocal) && cantonLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CantonConstantesFunciones.getCantonLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CantonConstantesFunciones.IDPROVINCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCanton.jLabelid_provinciaCanton,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CantonConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCanton.jLabelcodigoCanton,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CantonConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCanton.jLabelnombreCanton,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CantonConstantesFunciones.ESACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCanton.jLabeles_activoCanton,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCanton!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCanton.jLabelid_provinciaCanton,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCanton.jLabelcodigoCanton,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCanton.jLabelnombreCanton,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCanton.jLabeles_activoCanton,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Barrio")) {
			if(this.canton==null) {
				this.canton= new Canton();
			}

			if(this.cantonSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoCanton
				this.setVariablesFormularioToObjetoActualCanton(this.canton,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysCanton(this.canton);

				this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.getbarrio().setCanton(this.canton);
			}

			return;
		}
		 else  if(sTipo.equals("Parroquia")) {
			if(this.canton==null) {
				this.canton= new Canton();
			}

			if(this.cantonSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoCanton
				this.setVariablesFormularioToObjetoActualCanton(this.canton,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysCanton(this.canton);

				this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.getparroquia().setCanton(this.canton);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoCanton--;	
		
		
		this.cantonAux=new Canton();
		
		this.cantonAux.setId(this.iIdNuevoCanton);
		this.cantonAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cantonLogic.getCantons().add(this.cantonAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cantons.add(this.cantonAux);
		}
		//ARCHITECTURE
		
		this.canton=this.cantonAux;
		
		if(CantonJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCanton(this.canton);
			this.setVariablesObjetoActualToFormularioForeignKeyCanton(this.canton);
		}
				
		//this.setDefaultControlesCanton();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCanton();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCanton();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCanton();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCanton(this.cantonBean,this.canton,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCanton(this.canton);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CantonConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cantonSessionBean.getConGuardarRelaciones()) {
			classes=CantonConstantesFunciones.getClassesRelationshipsOfCanton(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cantonReturnGeneral=cantonLogic.procesarEventosCantonsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cantonLogic.getCantons(),this.canton,this.cantonParameterGeneral,this.isEsNuevoCanton,classes);//this.cantonLogic.getCanton()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCanton(this.cantonReturnGeneral,this.cantonBean,false);
		
		if(this.cantonReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCanton(this.cantonReturnGeneral.getCanton());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCanton(this.cantonReturnGeneral.getCanton());
		}
		
		if(this.cantonReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCanton(this.cantonReturnGeneral.getCanton(),classes);//this.cantonBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCanton(this.canton,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCanton();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCanton();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CantonBeanSwingJInternalFrameAdditional.RecargarFormCanton(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCanton(false);
						
			if(cantonSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrioSessionBean.getEsGuardarRelacionado() && BarrioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonBarrioActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiaSessionBean.getEsGuardarRelacionado() && ParroquiaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParroquiaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(CantonJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCanton();
			}
			
			this.actualizarVisualTableDatosCanton();
			
			this.jTableDatosCanton.setRowSelectionInterval(this.getIndiceNuevoCanton(), this.getIndiceNuevoCanton());
			
			this.seleccionarFilaTablaCantonActual();
						
			this.actualizarEstadoCeldasBotonesCanton("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCanton(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCanton.jTextFieldcodigoCanton.setEnabled(isHabilitar && this.cantonConstantesFunciones.activarcodigoCanton);
		this.jInternalFrameDetalleFormCanton.jTextAreanombreCanton.setEnabled(isHabilitar && this.cantonConstantesFunciones.activarnombreCanton);
		this.jInternalFrameDetalleFormCanton.jCheckBoxes_activoCanton.setEnabled(isHabilitar && this.cantonConstantesFunciones.activares_activoCanton);	
		
		this.jInternalFrameDetalleFormCanton.jComboBoxid_provinciaCanton.setEnabled(isHabilitar && this.cantonConstantesFunciones.activarid_provinciaCanton);
	};
	
	public void setDefaultControlesCanton() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCanton(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cantonSessionBean.setConGuardarRelaciones(true);			
			this.cantonSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCanton.jTabbedPaneRelacionesCanton.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrioSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.cantonSessionBean.setConGuardarRelaciones(false);			
			this.cantonSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCanton.jTabbedPaneRelacionesCanton.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrioSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoCanton() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Canton cantonAux:this.cantonLogic.getCantons()) {
				if(cantonAux.getId().equals(this.iIdNuevoCanton)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Canton cantonAux:this.cantons) {
				if(cantonAux.getId().equals(this.iIdNuevoCanton)) {
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
	
	public int getIndiceActualCanton(Canton canton,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Canton cantonAux:this.cantonLogic.getCantons()) {
				if(cantonAux.getId().equals(canton.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Canton cantonAux:this.cantons) {
				if(cantonAux.getId().equals(canton.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCanton(Canton cantonOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Canton cantonAux:this.cantonLogic.getCantons()) {
				if(cantonAux.getCantonOriginal().getId().equals(cantonOriginal.getId())) {
					existe=true;
					cantonOriginal.setId(cantonAux.getId());
					cantonOriginal.setVersionRow(cantonAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Canton cantonAux:this.cantons) {
				if(cantonAux.getCantonOriginal().getId().equals(cantonOriginal.getId())) {
					existe=true;
					cantonOriginal.setId(cantonAux.getId());
					cantonOriginal.setVersionRow(cantonAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCanton(Boolean esParaCancelar) throws Exception {
		cantonsAux=new ArrayList<Canton>();
		cantonAux=new Canton();
		
		if(!this.cantonSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Canton cantonAux:this.cantonLogic.getCantons()) {
					if(cantonAux.getId()<0) {
						cantonsAux.add(cantonAux);
					}		
				}
				this.iIdNuevoCanton=0L;
				this.cantonLogic.getCantons().removeAll(cantonsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Canton cantonAux:this.cantons) {
					if(cantonAux.getId()<0) {
						cantonsAux.add(cantonAux);
					}		
				}
				this.iIdNuevoCanton=0L;
				this.cantons.removeAll(cantonsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCanton 
					&& this.cantonLogic.getCantons().size()>0
					) {
					cantonAux=this.cantonLogic.getCantons().get(this.cantonLogic.getCantons().size() - 1);
				
					if(cantonAux.getId()<0) {
						this.cantonLogic.getCantons().remove(cantonAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCanton && this.cantons.size()>0) {
					cantonAux=this.cantons.get(this.cantons.size() - 1);
				
					if(cantonAux.getId()<0) {
						this.cantons.remove(cantonAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCanton(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(canton.getId()<0) {
				this.cantonLogic.getCantons().remove(this.canton);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(canton.getId()<0) {
				this.cantons.remove(this.canton);
			}
		}			
	}
	
	public void setEstadosInicialesCanton(List<Canton> cantonsAux) throws Exception {
		CantonConstantesFunciones.setEstadosInicialesCanton(cantonsAux);
	}
	
	public void setEstadosInicialesCanton(Canton cantonAux) throws Exception {
		CantonConstantesFunciones.setEstadosInicialesCanton(cantonAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCantonActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCanton("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCantonActual()) {
				if(!this.isEsNuevoCanton) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCanton("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCanton=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCantonActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Canton ?", "MANTENIMIENTO DE Canton", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCanton("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Canton canton) throws Exception {
		CantonConstantesFunciones.seleccionarAsignar(this.canton,canton);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCanton=this.isPermisoActualizarOriginalCanton;
			
			
			this.seleccionarAsignar(canton);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CantonConstantesFunciones.quitarEspaciosCanton(this.canton,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCanton("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cantonSessionBean.setsFuncionBusquedaRapida(this.cantonSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCanton) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCanton(esParaCancelar);				
				this.cancelarNuevoCanton(esParaCancelar);								
			}
			
			this.canton=new Canton();
			
			this.inicializarCanton();
			
			this.actualizarEstadoCeldasBotonesCanton("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCanton() throws Exception {
		try {
			CantonConstantesFunciones.inicializarCanton(this.canton);
			
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
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cantonLogic.getCantons().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCantons(String sAccionBusqueda,List<Canton> cantonsParaReportes) throws Exception {
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
					sPathReporteFinal="Canton"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CantonMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CantonMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Canton"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cantones");		
		parameters.put("busquedapor", CantonConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Barrio.class));
			classes.add(new Classe(Parroquia.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					CantonLogic cantonLogicAuxiliar=new CantonLogic();
					cantonLogicAuxiliar.setDatosCliente(cantonLogic.getDatosCliente());				
					cantonLogicAuxiliar.setCantons(cantonsParaReportes);
					
					cantonLogicAuxiliar.cargarRelacionesLoteForeignKeyCantonWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					cantonsParaReportes=cantonLogicAuxiliar.getCantons();
					
					//cantonLogic.getNewConnexionToDeep();
					
					//for (Canton canton:cantonsParaReportes) {
					//	cantonLogic.deepLoad(canton, false, DeepLoadType.INCLUDE, classes);
					//}						
					//cantonLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//cantonLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileBarrio = AuxiliarReportes.class.getResourceAsStream("BarrioDetalleRelacionesDesign.jasper");
			parameters.put("subreport_barrio", reportFileBarrio);

			InputStream reportFileParroquia = AuxiliarReportes.class.getResourceAsStream("ParroquiaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parroquia", reportFileParroquia);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCanton=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CantonConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CantonConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCanton=new JRBeanArrayDataSource(CantonJInternalFrame.TraerCantonBeans(cantonsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCanton);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CantonConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CantonConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CantonBean.TraerCantonBeans(cantonsParaReportes).toArray()));
							
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
				this.generarExcelReporteCantons(sAccionBusqueda,sTipoArchivoReporte,cantonsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCantons(sAccionBusqueda,sTipoArchivoReporte,cantonsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCantonActionPerformed(null);
					//this.generarExcelReporteCantons(sAccionBusqueda,sTipoArchivoReporte,cantonsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCantons(sAccionBusqueda,sTipoArchivoReporte,cantonsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCantons(sAccionBusqueda,sTipoArchivoReporte,cantonsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCantons(sAccionBusqueda,sTipoArchivoReporte,cantonsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCantons(String sAccionBusqueda,String sTipoArchivoReporte,List<Canton> cantonsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"canton";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Cantons");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCanton("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Canton canton : cantonsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CantonConstantesFunciones.generarExcelReporteDataCanton("NORMAL",row,workbook,canton,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cantonSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Canton",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCanton(String sTipo,Row row,Workbook workbook) {
		
		CantonConstantesFunciones.generarExcelReporteHeaderCanton(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCantons(String sAccionBusqueda,String sTipoArchivoReporte,List<Canton> cantonsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"canton_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Cantons");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Canton canton : cantonsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CantonConstantesFunciones.getCantonDescripcion(canton));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CantonConstantesFunciones.LABEL_IDPROVINCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CantonConstantesFunciones.LABEL_IDPROVINCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(canton.getprovincia_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CantonConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CantonConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(canton.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CantonConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CantonConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(canton.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CantonConstantesFunciones.LABEL_ESACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CantonConstantesFunciones.LABEL_ESACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(canton.getes_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cantonSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Canton",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCantons(String sAccionBusqueda,String sTipoArchivoReporte,List<Canton> cantonsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Canton> cantonsRespaldo=null;
		
		classes=CantonConstantesFunciones.getClassesRelationshipsOfCanton(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cantonLogic.setDatosCliente(this.datosCliente);
		this.cantonLogic.setDatosDeep(this.datosDeep);
		this.cantonLogic.setIsConDeep(true);
		
		cantonsRespaldo=this.cantonLogic.getCantons();
		
		this.cantonLogic.setCantons(cantonsParaReportes);	
		this.cantonLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cantonsParaReportes=this.cantonLogic.getCantons();
		this.cantonLogic.setCantons(cantonsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"canton_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Cantons");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCanton("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Canton canton : cantonsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCanton("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CantonConstantesFunciones.generarExcelReporteDataCanton("NORMAL",row,workbook,canton,cellStyleDataAux);
		
			
			


				//Barrio
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(BarrioConstantesFunciones.SCLASSWEBTITULO))) {

				if(canton.getBarrios()!=null && canton.getBarrios().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(BarrioConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					BarrioConstantesFunciones.generarExcelReporteHeaderBarrio("RELACIONADO",row,workbook);
				}

				if(canton.getBarrios()!=null) {
					i2=0;
					for(Barrio barrio : canton.getBarrios()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						BarrioConstantesFunciones.generarExcelReporteDataBarrio("RELACIONADO",row,workbook,barrio,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Parroquia
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParroquiaConstantesFunciones.SCLASSWEBTITULO))) {

				if(canton.getParroquias()!=null && canton.getParroquias().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParroquiaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParroquiaConstantesFunciones.generarExcelReporteHeaderParroquia("RELACIONADO",row,workbook);
				}

				if(canton.getParroquias()!=null) {
					i2=0;
					for(Parroquia parroquia : canton.getParroquias()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParroquiaConstantesFunciones.generarExcelReporteDataParroquia("RELACIONADO",row,workbook,parroquia,cellStyleDataAuxHijo);
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
		cell.setCellValue(CantonConstantesFunciones.getCantonDescripcion(canton));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cantonSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Canton",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCanton.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCanton.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCanton.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCanton.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCanton() throws Exception {		
		this.startProcessCanton(true);
	}
	
	public void startProcessCanton(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCanton ,this.jPanelParametrosReportesCanton, this.jScrollPanelDatosCanton,this.jPanelPaginacionCanton, this.jScrollPanelDatosEdicionCanton, this.jPanelAccionesCanton,this.jPanelAccionesFormularioCanton,this.jmenuBarCanton,this.jmenuBarDetalleCanton,this.jTtoolBarCanton,this.jTtoolBarDetalleCanton);		
		
		final JTabbedPane jTabbedPaneBusquedasCanton=this.jTabbedPaneBusquedasCanton; 
		
		final JPanel jPanelParametrosReportesCanton=this.jPanelParametrosReportesCanton;
		//final JScrollPane jScrollPanelDatosCanton=this.jScrollPanelDatosCanton;
		final JTable jTableDatosCanton=this.jTableDatosCanton;		
		final JPanel jPanelPaginacionCanton=this.jPanelPaginacionCanton;
		//final JScrollPane jScrollPanelDatosEdicionCanton=this.jScrollPanelDatosEdicionCanton;
		final JPanel jPanelAccionesCanton=this.jPanelAccionesCanton;
		
		JPanel jPanelCamposAuxiliarCanton=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCanton=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCanton!=null) {
			jPanelCamposAuxiliarCanton=this.jInternalFrameDetalleFormCanton.jPanelCamposCanton;
			jPanelAccionesFormularioAuxiliarCanton=this.jInternalFrameDetalleFormCanton.jPanelAccionesFormularioCanton;
		}
		
		final JPanel jPanelCamposCanton=jPanelCamposAuxiliarCanton;
		final JPanel jPanelAccionesFormularioCanton=jPanelAccionesFormularioAuxiliarCanton;
		
		
		final JMenuBar jmenuBarCanton=this.jmenuBarCanton;
		final JToolBar jTtoolBarCanton=this.jTtoolBarCanton;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCanton=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCanton=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCanton!=null) {
			jmenuBarDetalleAuxiliarCanton=this.jInternalFrameDetalleFormCanton.jmenuBarDetalleCanton;
			jTtoolBarDetalleAuxiliarCanton=this.jInternalFrameDetalleFormCanton.jTtoolBarDetalleCanton;
		}
		
		final JMenuBar jmenuBarDetalleCanton=jmenuBarDetalleAuxiliarCanton;
		final JToolBar jTtoolBarDetalleCanton=jTtoolBarDetalleAuxiliarCanton;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCanton;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCanton;
			processRunnable.jTableDatos=jTableDatosCanton;
			processRunnable.jPanelCampos=jPanelCamposCanton;
			processRunnable.jPanelPaginacion=jPanelPaginacionCanton;
			processRunnable.jPanelAcciones=jPanelAccionesCanton;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCanton;
			
			
			processRunnable.jmenuBar=jmenuBarCanton;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCanton;
			processRunnable.jTtoolBar=jTtoolBarCanton;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCanton;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCanton ,jPanelParametrosReportesCanton,jTableDatosCanton, /*jScrollPanelDatosCanton,*/jPanelCamposCanton,jPanelPaginacionCanton, /*jScrollPanelDatosEdicionCanton,*/ jPanelAccionesCanton,jPanelAccionesFormularioCanton,jmenuBarCanton,jmenuBarDetalleCanton,jTtoolBarCanton,jTtoolBarDetalleCanton);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCanton ,jPanelParametrosReportesCanton, jScrollPanelDatosCanton,jPanelPaginacionCanton, jScrollPanelDatosEdicionCanton, jPanelAccionesCanton,jPanelAccionesFormularioCanton,jmenuBarCanton,jmenuBarDetalleCanton,jTtoolBarCanton,jTtoolBarDetalleCanton);
						
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
	
	public void finishProcessCanton() {// throws Exception 
		this.finishProcessCanton(true);
	}
	
	public void finishProcessCanton(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCanton ,this.jPanelParametrosReportesCanton, this.jScrollPanelDatosCanton,this.jPanelPaginacionCanton, this.jScrollPanelDatosEdicionCanton, this.jPanelAccionesCanton,this.jPanelAccionesFormularioCanton,this.jmenuBarCanton,this.jmenuBarDetalleCanton,this.jTtoolBarCanton,this.jTtoolBarDetalleCanton);		
		
		final JTabbedPane jTabbedPaneBusquedasCanton=this.jTabbedPaneBusquedasCanton; 
		
		final JPanel jPanelParametrosReportesCanton=this.jPanelParametrosReportesCanton;
		//final JScrollPane jScrollPanelDatosCanton=this.jScrollPanelDatosCanton;
		final JTable jTableDatosCanton=this.jTableDatosCanton;		
		final JPanel jPanelPaginacionCanton=this.jPanelPaginacionCanton;
		//final JScrollPane jScrollPanelDatosEdicionCanton=this.jScrollPanelDatosEdicionCanton;
		final JPanel jPanelAccionesCanton=this.jPanelAccionesCanton;
		
		JPanel jPanelCamposAuxiliarCanton=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCanton=new JPanel();
		
		if(this.jInternalFrameDetalleFormCanton!=null) {
			jPanelCamposAuxiliarCanton=this.jInternalFrameDetalleFormCanton.jPanelCamposCanton;
			jPanelAccionesFormularioAuxiliarCanton=this.jInternalFrameDetalleFormCanton.jPanelAccionesFormularioCanton;
		}
		
		final JPanel jPanelCamposCanton=jPanelCamposAuxiliarCanton;
		final JPanel jPanelAccionesFormularioCanton=jPanelAccionesFormularioAuxiliarCanton;
		
		
		final JMenuBar jmenuBarCanton=this.jmenuBarCanton;		
		final JToolBar jTtoolBarCanton=this.jTtoolBarCanton;
				
		JMenuBar jmenuBarDetalleAuxiliarCanton=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCanton=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCanton!=null) {
			jmenuBarDetalleAuxiliarCanton=this.jInternalFrameDetalleFormCanton.jmenuBarDetalleCanton;
			jTtoolBarDetalleAuxiliarCanton=this.jInternalFrameDetalleFormCanton.jTtoolBarDetalleCanton;		
		}
		
		final JMenuBar jmenuBarDetalleCanton=jmenuBarDetalleAuxiliarCanton;
		final JToolBar jTtoolBarDetalleCanton=jTtoolBarDetalleAuxiliarCanton;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCanton;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCanton;
			processRunnable.jTableDatos=jTableDatosCanton;
			processRunnable.jPanelCampos=jPanelCamposCanton;
			processRunnable.jPanelPaginacion=jPanelPaginacionCanton;
			processRunnable.jPanelAcciones=jPanelAccionesCanton;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCanton;
			
			
			processRunnable.jmenuBar=jmenuBarCanton;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCanton;
			processRunnable.jTtoolBar=jTtoolBarCanton;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCanton;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCanton ,jPanelParametrosReportesCanton, jTableDatosCanton,/*jScrollPanelDatosCanton,*/jPanelCamposCanton,jPanelPaginacionCanton, /*jScrollPanelDatosEdicionCanton,*/ jPanelAccionesCanton,jPanelAccionesFormularioCanton,jmenuBarCanton,jmenuBarDetalleCanton,jTtoolBarCanton,jTtoolBarDetalleCanton));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCanton(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCanton(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCanton(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCanton(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCanton,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCanton,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCanton(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCanton,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCanton,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cantonConstantesFunciones.getsFinalQueryCanton();
		String  finalQueryPaginacionTodos=this.cantonConstantesFunciones.getsFinalQueryCanton();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CantonConstantesFunciones.getArrayColumnasGlobalesNoCanton(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CantonConstantesFunciones.getArrayColumnasGlobalesCanton(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CantonConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cantonsEliminados= new ArrayList<Canton>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCanton();
		
				///*CantonSessionBean*/this.cantonSessionBean=new CantonSessionBean();
			
			if(this.cantonSessionBean==null) {
				this.cantonSessionBean=new CantonSessionBean();
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
					this.iNumeroPaginacion=CantonConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CantonConstantesFunciones.getClassesForeignKeysOfCanton(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/canton."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cantonsAux= new ArrayList<Canton>();
			
				
			cantonLogic.setDatosCliente(this.datosCliente);
			cantonLogic.setDatosDeep(this.datosDeep);
			cantonLogic.setIsConDeep(true);
			
			
			cantonLogic.getCantonDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cantonLogic.getTodosCantons(finalQueryGlobal,pagination);
					
					//cantonLogic.getTodosCantonsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cantonLogic.getCantons()==null|| cantonLogic.getCantons().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cantonsAux= new ArrayList<Canton>();
							cantonsAux.addAll(cantonLogic.getCantons());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cantonsAux= new ArrayList<Canton>();
							cantonsAux.addAll(cantons);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cantonLogic.getTodosCantons(finalQueryGlobal+"",this.pagination);												
							
							//cantonLogic.getTodosCantonsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCantons("Todos",cantonLogic.getCantons() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cantonLogic.setCantons(new ArrayList<Canton>());					
							cantonLogic.getCantons().addAll(cantonsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cantons=new ArrayList<Canton>();
							cantons.addAll(cantonsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCanton=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCanton=this.idActual;
				
				} else if(this.idCantonActual!=null && this.idCantonActual!=0L) {
					idCanton=idCantonActual;
				}
				
					
				this.sDetalleReporte=CantonConstantesFunciones.getDetalleIndicePorId(idCanton);
				
				this.cantons=new ArrayList<Canton>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cantonLogic.getEntity(idCanton);
					
					//cantonLogic.getEntityWithConnection(idCanton);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cantonLogic.setCantons(new ArrayList<Canton>());
					cantonLogic.getCantons().add(cantonLogic.getCanton());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cantons=new ArrayList<Canton>();
					this.cantons.add(canton);
				}
				
				if(cantonLogic.getCanton()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdProvincia")) {
				this.sDetalleReporte=CantonConstantesFunciones.getDetalleIndiceFK_IdProvincia(id_provinciaFK_IdProvincia);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cantonLogic.getCantonsFK_IdProvincia(finalQueryGlobal,pagination,id_provinciaFK_IdProvincia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CantonConstantesFunciones.getDetalleIndiceFK_IdProvincia(id_provinciaFK_IdProvincia);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CantonConstantesFunciones.getDetalleIndiceFK_IdProvincia(id_provinciaFK_IdProvincia);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cantonLogic.getCantons()==null||cantonLogic.getCantons().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cantons==null|| cantons.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cantonsAux=new ArrayList<Canton>();
						cantonsAux.addAll(cantonLogic.getCantons());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cantonsAux=new ArrayList<Canton>();
							cantonsAux.addAll(cantons);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cantonLogic.getCantonsFK_IdProvincia(finalQueryGlobal,pagination,id_provinciaFK_IdProvincia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CantonConstantesFunciones.getDetalleIndiceFK_IdProvincia(id_provinciaFK_IdProvincia);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CantonConstantesFunciones.getDetalleIndiceFK_IdProvincia(id_provinciaFK_IdProvincia);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCantons("FK_IdProvincia",cantonLogic.getCantons());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCantons("FK_IdProvincia",cantons);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cantonLogic.setCantons(new ArrayList<Canton>());
						cantonLogic.getCantons().addAll(cantonsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cantons=new ArrayList<Canton>();
							cantons.addAll(cantonsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCanton();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCanton();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cantonLogic.getCantons().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cantons.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cantonLogic.getCantons().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cantons.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Canton canton) {
		Boolean permite=true;
		
		if(this.canton.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CantonConstantesFunciones.getOrderByListaCanton();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CantonConstantesFunciones.getOrderByListaCanton();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Canton canton:cantonLogic.getCantons()) {
				if(canton.getsType().equals(Constantes2.S_TOTALES)) {
					cantonTotales=canton;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Canton canton:this.cantons) {
				if(canton.getsType().equals(Constantes2.S_TOTALES)) {
					cantonTotales=canton;
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
			this.cantonAux=new Canton();
			this.cantonAux.setsType(Constantes2.S_TOTALES);
			this.cantonAux.setIsNew(false);
			this.cantonAux.setIsChanged(false);
			this.cantonAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CantonConstantesFunciones.TotalizarValoresFilaCanton(this.cantonLogic.getCantons(),this.cantonAux);
				
				this.cantonLogic.getCantons().add(this.cantonAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CantonConstantesFunciones.TotalizarValoresFilaCanton(this.cantons,this.cantonAux);
				
				this.cantons.add(this.cantonAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cantonTotales=new Canton();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cantonLogic.getCantons().remove(cantonTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cantons.remove(cantonTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cantonTotales=new Canton();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Canton canton:cantonLogic.getCantons()) {
				if(canton.getsType().equals(Constantes2.S_TOTALES)) {
					cantonTotales=canton;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CantonConstantesFunciones.TotalizarValoresFilaCanton(this.cantonLogic.getCantons(),cantonTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Canton canton:this.cantons) {
				if(canton.getsType().equals(Constantes2.S_TOTALES)) {
					cantonTotales=canton;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CantonConstantesFunciones.TotalizarValoresFilaCanton(this.cantons,cantonTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCantonsFK_IdProvincia()throws Exception {
		try {
			sAccionBusqueda="FK_IdProvincia";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCantonsFK_IdProvincia(String sFinalQuery,Long id_provincia)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cantonLogic.getCantonsFK_IdProvincia(sFinalQuery,this.pagination,id_provincia);
				
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
	
	public void inicializarPermisosCanton() {
		this.isPermisoTodoCanton=false;
		this.isPermisoNuevoCanton=false;
		this.isPermisoActualizarCanton=false;
		this.isPermisoActualizarOriginalCanton=false;
		this.isPermisoEliminarCanton=false;
		this.isPermisoGuardarCambiosCanton=false;
		this.isPermisoConsultaCanton=false;
		this.isPermisoBusquedaCanton=false;
		this.isPermisoReporteCanton=false;		
		this.isPermisoOrdenCanton=false;		
		this.isPermisoPaginacionMedioCanton=false;		
		this.isPermisoPaginacionAltoCanton=false;
		this.isPermisoPaginacionTodoCanton=false;
		this.isPermisoCopiarCanton=false;		
		this.isPermisoVerFormCanton=false;		
		this.isPermisoDuplicarCanton=false;		
		this.isPermisoOrdenCanton=false;		
	}
	
	public void setPermisosUsuarioCanton(Boolean isPermiso) {
		this.isPermisoTodoCanton=isPermiso;
		this.isPermisoNuevoCanton=isPermiso;
		this.isPermisoActualizarCanton=isPermiso;
		this.isPermisoActualizarOriginalCanton=isPermiso;
		this.isPermisoEliminarCanton=isPermiso;
		this.isPermisoGuardarCambiosCanton=isPermiso;
		this.isPermisoConsultaCanton=isPermiso;
		this.isPermisoBusquedaCanton=isPermiso;
		this.isPermisoReporteCanton=isPermiso;
		this.isPermisoOrdenCanton=isPermiso;		
		this.isPermisoPaginacionMedioCanton=isPermiso;		
		this.isPermisoPaginacionAltoCanton=isPermiso;		
		this.isPermisoPaginacionTodoCanton=isPermiso;		
		this.isPermisoCopiarCanton=isPermiso;		
		this.isPermisoVerFormCanton=isPermiso;		
		this.isPermisoDuplicarCanton=isPermiso;
		this.isPermisoOrdenCanton=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCanton(Boolean isPermiso) {
		//this.isPermisoTodoCanton=isPermiso;
		this.isPermisoNuevoCanton=isPermiso;
		this.isPermisoActualizarCanton=isPermiso;
		this.isPermisoActualizarOriginalCanton=isPermiso;
		this.isPermisoEliminarCanton=isPermiso;
		this.isPermisoGuardarCambiosCanton=isPermiso;
		//this.isPermisoConsultaCanton=isPermiso;
		//this.isPermisoBusquedaCanton=isPermiso;
		//this.isPermisoReporteCanton=isPermiso;
		//this.isPermisoOrdenCanton=isPermiso;		
		//this.isPermisoPaginacionMedioCanton=isPermiso;		
		//this.isPermisoPaginacionAltoCanton=isPermiso;		
		//this.isPermisoPaginacionTodoCanton=isPermiso;		
		//this.isPermisoCopiarCanton=isPermiso;		
		//this.isPermisoDuplicarCanton=isPermiso;
		//this.isPermisoOrdenCanton=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCantonClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(BarrioConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParroquiaConstantesFunciones.SNOMBREOPCION);
		
		if(CantonJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosBarrio=false;
		this.isTienePermisosBarrio=this.verificarGetPermisosUsuarioOpcionCantonClaseRelacionada(this.opcionsRelacionadas,BarrioConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParroquia=false;
		this.isTienePermisosParroquia=this.verificarGetPermisosUsuarioOpcionCantonClaseRelacionada(this.opcionsRelacionadas,ParroquiaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebCanton(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCantonClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosBarrio=conPermiso;
		this.isTienePermisosParroquia=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioCantonClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCantonClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCantonClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosBarrio && this.jInternalFrameDetalleFormCanton!=null && this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCanton.jTabbedPaneRelacionesCanton.remove(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParroquia && this.jInternalFrameDetalleFormCanton!=null && this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCanton.jTabbedPaneRelacionesCanton.remove(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioCanton() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CantonJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cantonSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CantonConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCanton=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCanton=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCanton=this.isPermisoActualizarCanton;
			this.isPermisoEliminarCanton=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCanton=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCanton=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCanton=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCanton=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCanton=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCanton=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCanton=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCanton=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCanton=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCanton=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCanton=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCanton=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCanton=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cantonSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCanton.setToolTipText(this.jTableDatosCanton.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCanton(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCanton(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CantonJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CantonJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCanton() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosBarrio && this.cantonConstantesFunciones.mostrarBarrioCanton && !CantonConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Barrio");
			reporte.setsDescripcion("Barrio");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParroquia && this.cantonConstantesFunciones.mostrarParroquiaCanton && !CantonConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parroquia");
			reporte.setsDescripcion("Parroquia");
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
	public void inicializarCombosForeignKeyCantonListas()throws Exception {
		try	{						
			
				this.provinciasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCantonListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CantonJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCantonListas(false);
			} else {
			
				this.cargarCombosForeignKeyProvinciaListas(cargarCombosDependencia,sFinalQueryCombo);
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

			if((this.provinciasForeignKey==null||this.provinciasForeignKey.size()<=0)) {
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
	
	public void cargarCombosLoteForeignKeyCantonListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CantonParameterReturnGeneral cantonReturnGeneral=new CantonParameterReturnGeneral();
						
			


				String finalQueryGlobalProvincia="";

				if(((this.provinciasForeignKey==null||this.provinciasForeignKey.size()<=0) && this.cantonConstantesFunciones.cargarid_provinciaCanton)
					 || (this.esRecargarFks && this.cantonConstantesFunciones.cargarid_provinciaCanton)) {

					if(!this.cantonSessionBean.getisBusquedaDesdeForeignKeySesionProvincia()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProvinciaConstantesFunciones.getArrayColumnasGlobalesProvincia(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProvincia=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProvinciaConstantesFunciones.TABLENAME);

						finalQueryGlobalProvincia=Funciones.GetFinalQueryAppend(finalQueryGlobalProvincia, "");
						finalQueryGlobalProvincia+=ProvinciaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProvinciasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProvincia=" WHERE " + ConstantesSql.ID + "="+cantonSessionBean.getlidProvinciaActual();
					}
				} else {
					finalQueryGlobalProvincia="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cantonReturnGeneral=cantonLogic.cargarCombosLoteForeignKeyCanton(finalQueryGlobalProvincia);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalProvincia.equals("NONE")) {
				this.provinciasForeignKey=cantonReturnGeneral.getprovinciasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCanton()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyProvincia();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyProvincia()throws Exception {
		try {
			if(this.cantonSessionBean==null) {
				this.cantonSessionBean=new CantonSessionBean();
			}

			if(!this.cantonSessionBean.getisBusquedaDesdeForeignKeySesionProvincia()) {
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
	
	public void initActionsCombosTodosForeignKeyCanton()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCanton(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCanton()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCanton();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCanton(Canton canton)throws Exception {	
		try {
			
			this.setActualProvinciaForeignKey(canton.getid_provincia(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCanton(Canton canton,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCanton()throws Exception {	
		try {
			
			this.setActualProvinciaForeignKey(this.cantonConstantesFunciones.getid_provincia(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCanton()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCanton()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCanton()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCanton()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCanton()throws Exception {
		try {
			

			this.cargarCombosFrameProvinciasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCanton(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameProvinciasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCanton()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCanton.jComboBoxid_provinciaCanton!=null && this.jInternalFrameDetalleFormCanton.jComboBoxid_provinciaCanton.getItemCount()>0) {
				this.jInternalFrameDetalleFormCanton.jComboBoxid_provinciaCanton.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public CantonBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CantonBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CantonBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cantonSessionBean=new CantonSessionBean(); 
		this.cantonConstantesFunciones=new CantonConstantesFunciones(); 
		this.cantonBean=new Canton();//(this.cantonConstantesFunciones); 		
		this.cantonReturnGeneral=new CantonParameterReturnGeneral(); 
		
		this.cantonSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cantonSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CantonBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CantonBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CantonBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCanton(true);
			
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
			
			this.cantonConstantesFunciones=new CantonConstantesFunciones(); 
			this.cantonBean=new Canton();//this.cantonConstantesFunciones); 			
			this.cantonReturnGeneral=new CantonParameterReturnGeneral(); 
		
			CantonBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Canton Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.canton=new Canton();
			this.cantons = new ArrayList<Canton>();
			this.cantonsAux = new ArrayList<Canton>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic=new CantonLogic();
				this.cantonLogic.getNewConnexionToDeep("");
			}
			
			//this.cantonSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cantonSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCanton);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCanton!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCanton);	
					}
					
					if(this.jInternalFrameImportacionCanton!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCanton);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCanton!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCanton);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCanton!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCanton);
				this.jInternalFrameDetalleFormCanton.setVisible(false);
				this.jInternalFrameDetalleFormCanton.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCanton!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCanton);
					this.jInternalFrameReporteDinamicoCanton.setVisible(false);
					this.jInternalFrameReporteDinamicoCanton.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCanton!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCanton);
					this.jInternalFrameImportacionCanton.setVisible(false);
					this.jInternalFrameImportacionCanton.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCanton!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCanton);
					this.jInternalFrameOrderByCanton.setVisible(false);
					this.jInternalFrameOrderByCanton.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCantonActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CantonConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cantonReturnGeneral=new CantonParameterReturnGeneral();
			
			this.cantonParameterGeneral=new CantonParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cantonLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cantonSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CantonJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cantonSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(BarrioConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParroquiaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CantonConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cantonSessionBean.getEsGuardarRelacionado(),this.cantonSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CantonConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cantonSessionBean.getEsGuardarRelacionado(),this.cantonSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCanton=false;
			this.isVisibilidadCeldaDuplicarCanton=true;
			this.isVisibilidadCeldaCopiarCanton=true;
			this.isVisibilidadCeldaVerFormCanton=true;
			this.isVisibilidadCeldaOrdenCanton=true;
			this.isVisibilidadCeldaNuevoRelacionesCanton=false;
			this.isVisibilidadCeldaModificarCanton=false;
			this.isVisibilidadCeldaActualizarCanton=false;
			this.isVisibilidadCeldaEliminarCanton=false;
			this.isVisibilidadCeldaCancelarCanton=false;
			this.isVisibilidadCeldaGuardarCanton=false;
			this.isVisibilidadCeldaGuardarCambiosCanton=false;
			
			
			this.isVisibilidadFK_IdProvincia=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCanton("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCanton();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCanton(false);
			
			this.setPermisosUsuarioCanton();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cantonSessionBean.getEsGuardarRelacionado() 
				|| (this.cantonSessionBean.getEsGuardarRelacionado() && this.cantonSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCantonClasesRelacionadas();
			}
			
			if(this.cantonSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCantonClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CantonJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCanton();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCanton();
			}
			
			if(!this.isPermisoBusquedaCanton) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCanton.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cantonSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCanton,this.isPermisoPaginacionMedioCanton,this.isPermisoPaginacionTodoCanton);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CantonConstantesFunciones.getTiposSeleccionarCanton());
				
				this.tiposColumnasSelect=CantonConstantesFunciones.getTiposSeleccionarCanton(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectCanton();				
				//this.tiposRelacionesSelect=CantonConstantesFunciones.getTiposRelacionesCanton(true);
				
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
			//if(!this.cantonSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCanton();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioCanton(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioCanton(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCanton() ;
			
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
			
			
			this.barrioLogic=new BarrioLogic();
			this.parroquiaLogic=new ParroquiaLogic(); 
			jasperPrint = null;												
			
			//FK
			
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
				cantonImplementable= (CantonImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CantonConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cantonImplementableHome= (CantonImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CantonConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cantons= new ArrayList<Canton>();
			this.cantonsEliminados= new ArrayList<Canton>();
						
			this.isEsNuevoCanton=false;
			this.esParaAccionDesdeFormularioCanton=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.provinciasForeignKey=new ArrayList<Provincia>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCanton(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCanton();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cantonSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CantonBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CantonConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCanton("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCanton(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCanton!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCanton();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCanton();
			}
			
			CantonBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCanton.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCanton.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCanton.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCanton(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Canton: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCanton() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(BarrioConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(BarrioConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ParroquiaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParroquiaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCanton")) {
				iIndex=this.jInternalFrameDetalleFormCanton.jTabbedPaneRelacionesCanton.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCanton.jTabbedPaneRelacionesCanton.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCanton.getSelectedRow();	
				
				

				if(sTitle.equals("Barrios")) {
					if(!BarrioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessCanton();

						this.cargarParteTabPanelRelacionadaBarrio(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Parroquias")) {
					if(!ParroquiaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessCanton();

						this.cargarParteTabPanelRelacionadaParroquia(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCanton();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaBarrio(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormCanton.cargarSessionConBeanSwingJInternalFrameBarrio(false,true,iIndex);
		this.jButtonBarrioActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaBarrio();

		//this.jTabbedPaneRelacionesCanton.updateUI();
		//this.jTabbedPaneRelacionesCanton.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesCanton.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaParroquia(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormCanton.cargarSessionConBeanSwingJInternalFrameParroquia(false,true,iIndex);
		this.jButtonParroquiaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParroquia();

		//this.jTabbedPaneRelacionesCanton.updateUI();
		//this.jTabbedPaneRelacionesCanton.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesCanton.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Barrio")) {
				int row=this.jTableDatosCanton.getSelectedRow();
				jButtonBarrioActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Parroquia")) {
				int row=this.jTableDatosCanton.getSelectedRow();
				jButtonParroquiaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.cantonSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Barrio")) {

					if(this.isTienePermisosBarrio && this.cantonConstantesFunciones.mostrarBarrioCanton && !CantonConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Barrios"+"("+BarrioConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Barrios");

						if(cantonConstantesFunciones.resaltarBarrioCanton!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(cantonConstantesFunciones.resaltarBarrioCanton);
						}

						jmenuItem.setEnabled(this.cantonConstantesFunciones.activarBarrioCanton);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Barrio"));

						

						this.jInternalFrameDetalleFormCanton.jmenuDetalleCanton.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parroquia")) {

					if(this.isTienePermisosParroquia && this.cantonConstantesFunciones.mostrarParroquiaCanton && !CantonConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parroquias"+"("+ParroquiaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parroquias");

						if(cantonConstantesFunciones.resaltarParroquiaCanton!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(cantonConstantesFunciones.resaltarParroquiaCanton);
						}

						jmenuItem.setEnabled(this.cantonConstantesFunciones.activarParroquiaCanton);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Parroquia"));

						

						this.jInternalFrameDetalleFormCanton.jmenuDetalleCanton.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyCanton(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCanton(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCanton(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCantonListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCanton();
		
		this.cargarCombosFrameForeignKeyCanton();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCanton();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCanton();
		}
	}
	
	

	public void cargarCombosForeignKeyProvincia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProvinciaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProvincia();
				this.cargarCombosFrameProvinciasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProvincia(this.provinciasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCantonActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cantonSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCanton==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
			
			
			if(jTableDatosCanton.getRowCount()>=1) {
				jTableDatosCanton.removeRowSelectionInterval(0, jTableDatosCanton.getRowCount()-1);						
			}
			
			this.isEsNuevoCanton=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCanton(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCanton(true);			
			//this.canton=new Canton();
			//this.canton.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCanton(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCanton() ;
			
			if(CantonJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCanton(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.canton);	
			this.actualizarInformacion("INFO_PADRE",false,this.canton);				
			
			CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
			
			if(this.cantonSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Canton: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCantonActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Canton> cantonsSeleccionados=new ArrayList<Canton>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCanton.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCanton.getSelectedRows().length;			
			}
			
			cantonsSeleccionados=this.getCantonsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCanton--;			
				//Canton cantonAux= new Canton();			
				//cantonAux.setId(this.iIdNuevoCanton);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Canton cantonOrigen=new Canton();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Canton cantonOrigen : cantonsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCanton.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cantonOrigen =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cantonOrigen =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCanton();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.canton.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCanton(cantonOrigen,this.canton,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCanton(this.canton);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cantonLogic.getCantons().add(this.cantonAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cantons.add(this.cantonAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCanton(false);
				
				this.jTableDatosCanton.setRowSelectionInterval(this.getIndiceNuevoCanton(), this.getIndiceNuevoCanton());
				
				int iLastRow =  this.jTableDatosCanton.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCanton.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCanton.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCanton(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCantonActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Canton> cantonsSeleccionados=new ArrayList<Canton>();									
		
			Canton cantonOrigen=new Canton();
			Canton cantonDestino=new Canton();
				
			cantonsSeleccionados=this.getCantonsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCanton.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cantonsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCanton.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cantonOrigen =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cantonOrigen =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cantonDestino =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cantonDestino =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cantonOrigen =cantonsSeleccionados.get(0);
				cantonDestino =cantonsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCanton(cantonOrigen,cantonDestino,true,false);
				
				cantonDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cantonDestino,cantonLogic.getCantons());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cantonDestino,cantons);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCanton(false);
				
				//this.jTableDatosCanton.setRowSelectionInterval(this.getIndiceNuevoCanton(), this.getIndiceNuevoCanton());
				
				int iLastRow =  this.jTableDatosCanton.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCanton.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCanton.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCanton(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCantonActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCanton==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCanton.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCantonActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCanton.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCanton.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCanton.setVisible(!isVisible);
			this.jPanelPaginacionCanton.setVisible(!isVisible);
			this.jPanelAccionesCanton.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCantonActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCanton();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCantonActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCanton();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCantonActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCanton();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCantonActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCanton();
			
			this.abrirFrameOrderByCanton();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCantonActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCanton();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCanton(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCanton);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCanton.isMaximum()) {
					this.jInternalFrameDetalleFormCanton.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCanton.setSize(this.jInternalFrameDetalleFormCanton.iWidthFormulario,this.jInternalFrameDetalleFormCanton.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCanton.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCanton.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCanton.isMaximum()) {
						this.jInternalFrameDetalleFormCanton.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCanton.jContentPaneDetalleCanton.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCanton.jTabbedPaneRelacionesCanton.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCanton.jContentPaneDetalleCanton.getWidth(),CantonConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCanton.jTabbedPaneRelacionesCanton.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCanton.jContentPaneDetalleCanton.getWidth(),CantonConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCanton.jTabbedPaneRelacionesCanton.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCanton.jContentPaneDetalleCanton.getWidth(),CantonConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(BarrioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaBarrio();
					}

					if(ParroquiaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParroquia();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCanton.setVisible(true);
	        this.jInternalFrameDetalleFormCanton.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCanton() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCanton==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCanton=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCanton,false,this);
				} else {
					this.jInternalFrameOrderByCanton=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCanton,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCanton);
				this.jInternalFrameOrderByCanton.setVisible(false);
				this.jInternalFrameOrderByCanton.setSelected(false);
				
				this.jInternalFrameOrderByCanton.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCanton"));
				
				this.inicializarActualizarBindingTablaOrderByCanton();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCanton() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCanton==null) {
				
				this.jInternalFrameImportacionCanton=new ImportacionJInternalFrame(CantonConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCanton);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCanton);
				this.jInternalFrameImportacionCanton.setVisible(false);
				this.jInternalFrameImportacionCanton.setSelected(false);


				this.jInternalFrameImportacionCanton.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCanton"));
				this.jInternalFrameImportacionCanton.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCanton"));
				this.jInternalFrameImportacionCanton.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCanton"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCanton() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCanton==null) {
				this.jInternalFrameReporteDinamicoCanton=new ReporteDinamicoJInternalFrame(CantonConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCanton);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCanton);
				this.jInternalFrameReporteDinamicoCanton.setVisible(false);
				this.jInternalFrameReporteDinamicoCanton.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCanton.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCanton"));
				this.jInternalFrameReporteDinamicoCanton.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCanton"));
				this.jInternalFrameReporteDinamicoCanton.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCanton"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCanton();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaBarrio() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.jScrollPanelDatosBarrio.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormCanton.jContentPaneDetalleCanton.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.jScrollPanelDatosBarrio.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.jScrollPanelDatosBarrio.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.jScrollPanelDatosBarrio.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaParroquia() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.jScrollPanelDatosParroquia.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormCanton.jContentPaneDetalleCanton.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.jScrollPanelDatosParroquia.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.jScrollPanelDatosParroquia.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.jScrollPanelDatosParroquia.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleCanton() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCanton);
			
	       	this.jInternalFrameDetalleFormCanton.setVisible(false);
	        this.jInternalFrameDetalleFormCanton.setSelected(false);
			
			//this.jInternalFrameDetalleFormCanton.dispose();
			//this.jInternalFrameDetalleFormCanton=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCanton() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCanton.setVisible(true);
	        this.jInternalFrameReporteDinamicoCanton.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCanton() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCanton.setVisible(true);
	        this.jInternalFrameImportacionCanton.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCanton() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCanton.setVisible(true);
	        this.jInternalFrameOrderByCanton.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCanton() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCanton.setVisible(false);
	        this.jInternalFrameOrderByCanton.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCanton() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCanton.setVisible(false);
	        this.jInternalFrameReporteDinamicoCanton.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCanton() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCanton.setVisible(false);
	        this.jInternalFrameImportacionCanton.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCantonActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCanton(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCanton(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCanton.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCanton(true);
			//this.isEsNuevoCanton=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.canton =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.canton =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCanton("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCanton(false) ;
			
			if(cantonSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrioSessionBean.getEsGuardarRelacionado() && BarrioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonBarrioActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiaSessionBean.getEsGuardarRelacionado() && ParroquiaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParroquiaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(CantonJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCanton(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCanton(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCantonActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCanton.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.canton =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.canton =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCanton(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCanton==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCanton.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCanton(true);
			//this.isEsNuevoCanton=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.canton =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.canton =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.canton.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCanton("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCanton(false) ;
			
			if(CantonJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCanton(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCanton(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaProvincia(List<Provincia> provinciasForeignKey)throws Exception{
		TableColumn tableColumnProvincia=this.jTableDatosCanton.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCanton,CantonConstantesFunciones.LABEL_IDPROVINCIA));
		TableCellEditor tableCellEditorProvincia =tableColumnProvincia.getCellEditor();

		ProvinciaTableCell provinciaTableCellFk=(ProvinciaTableCell)tableCellEditorProvincia;

		if(provinciaTableCellFk!=null) {
			provinciaTableCellFk.setprovinciasForeignKey(provinciasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCanton.getSelectedRow();

		//if(intSelectedRow<=0) {
			//provinciaTableCellFk.setRowActual(intSelectedRow);
			//provinciaTableCellFk.setprovinciasForeignKeyActual(provinciasForeignKey);
		//}


		if(provinciaTableCellFk!=null) {
			provinciaTableCellFk.RecargarProvinciasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCantonActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCanton(false);
			
			//if(!this.isEsNuevoCanton) {								
				int intSelectedRow = this.jTableDatosCanton.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.canton =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.canton =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CantonJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCanton(this.canton,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCanton(this.canton);
				
			}
			
			if(this.permiteMantenimiento(this.canton)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cantonSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCanton=true;
					this.inicializarActualizarBindingTablaCanton(false);
					this.isEsNuevoCanton=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCanton=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCanton=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCanton(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCanton(false);
				
				this.habilitarDeshabilitarControlesCanton(false);
			
												
				
				if(CantonJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCanton();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCantonActionPerformed(evt,cantonSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCanton(this.canton,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCanton.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cantonSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.canton.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Canton.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Canton.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCantonActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCanton.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.canton =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				this.canton.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.canton =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				this.canton.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.canton)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cantonSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CantonModel) this.jTableDatosCanton.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCanton=true;
				this.inicializarActualizarBindingTablaCanton(false);
				this.isEsNuevoCanton=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCanton(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCanton(false);
				
				this.habilitarDeshabilitarControlesCanton(false);
				
				
				
				if(CantonJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCanton();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCantonActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCanton.getRowCount()>=1) {
				jTableDatosCanton.removeRowSelectionInterval(0, jTableDatosCanton.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCanton(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCanton(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCanton(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCanton(false) ;
			
			this.isEsNuevoCanton=false;
			
			if(CantonJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCanton();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCantonActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCanton(false);
				
				//SI ES MANUAL
				if(CantonJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCanton();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCantonActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCanton--;			
			//Canton cantonAux= new Canton();			
			//cantonAux.setId(this.iIdNuevoCanton);
			
			if(this.jInternalFrameDetalleFormCanton==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCanton();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCanton(this.canton);
			
			this.canton.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cantonLogic.getCantons().add(this.cantonAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cantons.add(this.cantonAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCanton(false);
			
			this.jTableDatosCanton.setRowSelectionInterval(this.getIndiceNuevoCanton(), this.getIndiceNuevoCanton());
			
			int iLastRow =  this.jTableDatosCanton.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCanton.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCanton.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCanton(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCantonActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCanton(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCanton(false);
			
			//SI ES MANUAL
			if(CantonJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCanton();
			}
			
			//this.abrirFrameTreeCanton();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCantonActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE CantonES ?", "MANTENIMIENTO DE Canton", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCanton.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCanton();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cantonReturnGeneral=cantonLogic.procesarImportacionCantonsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cantonParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCantonReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCantonActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCanton.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCanton.setFileImportacion(this.jInternalFrameImportacionCanton.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCanton.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCanton.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCanton.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCanton.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCantonActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Canton> cantonsSeleccionados=new ArrayList<Canton>();		

		cantonsSeleccionados=this.getCantonsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCanton.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCanton.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CantonBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CantonBaseDesign.jrxml";
			
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
			
			this.generarReporteCantons("Todos",cantonsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cantonSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Canton",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCanton.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCanton.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CantonConstantesFunciones.LABEL_IDPROVINCIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Provincia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Provincia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Provincia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Provincia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CantonConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CantonConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CantonConstantesFunciones.LABEL_ESACTIVO:
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
		
		if(this.jInternalFrameReporteDinamicoCanton.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCanton.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCanton.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CantonConstantesFunciones.LABEL_IDPROVINCIA:
					sNombreCampoCategoria="id_provincia";
					break;

				case CantonConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CantonConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case CantonConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoria="es_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCanton.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CantonConstantesFunciones.LABEL_IDPROVINCIA:
					sNombreCampoCategoriaValor="id_provincia";
					break;

				case CantonConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CantonConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case CantonConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoriaValor="es_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCanton.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCanton.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CantonConstantesFunciones.LABEL_IDPROVINCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Provincia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_provincia");
					break;

				case CantonConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CantonConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case CantonConstantesFunciones.LABEL_ESACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoCantonActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Canton> cantonsSeleccionados=new ArrayList<Canton>();		
		
		cantonsSeleccionados=this.getCantonsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"canton";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Cantons");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCanton.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCanton.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CantonConstantesFunciones.LABEL_IDPROVINCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CantonConstantesFunciones.LABEL_IDPROVINCIA);
					iRow++;

					for(Canton canton:cantonsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(canton.getprovincia_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CantonConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CantonConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Canton canton:cantonsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(canton.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CantonConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CantonConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Canton canton:cantonsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(canton.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CantonConstantesFunciones.LABEL_ESACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CantonConstantesFunciones.LABEL_ESACTIVO);
					iRow++;

					for(Canton canton:cantonsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(canton.getes_activo());
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
			//	this.getFilaCabeceraExportarExcelCanton(row);				
			//	iRow++;
			//}				
			
			//for(Canton cantonAux:cantonsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCanton(cantonAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cantonSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Canton",JOptionPane.INFORMATION_MESSAGE);
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
				this.cantonLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCanton(false);
			
			//SI ES MANUAL
			if(CantonJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCanton();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCantonActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCanton(false);
			
			//SI ES MANUAL
			if(CantonJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCanton();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCantonActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCanton(false);
			
			//SI ES MANUAL
			if(CantonJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCanton();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCanton() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCanton.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCanton.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCanton.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCanton.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCanton.setMinimumSize(dimensionMinimum);
		this.jTableDatosCanton.setMaximumSize(dimensionMaximum);
		this.jTableDatosCanton.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCanton(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCanton(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCanton(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCanton(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCanton(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cantonSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCanton(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCanton(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCanton(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CantonJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CantonJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCanton() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCanton();
		
		this.inicializarActualizarBindingBotonesManualCanton(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cantonSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCanton();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCanton() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCanton(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCanton(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCanton.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCanton.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCanton.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCanton!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCanton.jCheckBoxPostAccionNuevoCanton.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCanton.jCheckBoxPostAccionSinCerrarCanton.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCanton.jCheckBoxPostAccionSinMensajeCanton.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCanton.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCanton.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCanton.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCanton!=null) {
				this.jInternalFrameDetalleFormCanton.jCheckBoxPostAccionNuevoCanton.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCanton.jCheckBoxPostAccionSinCerrarCanton.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCanton.jCheckBoxPostAccionSinMensajeCanton.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCanton.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCanton.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCanton!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCanton.jComboBoxTiposAccionesFormularioCanton.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCanton.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCanton!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCanton.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCanton.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCanton.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCanton.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCanton.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCanton!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCanton.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCanton.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCanton.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCanton(Boolean esInicializar) throws Exception {
		try	{	
			if(CantonJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCanton(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCanton() throws Exception {
		try	{
			if(CantonJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCanton();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCanton() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCanton.jComboBoxTiposAccionesFormularioCanton.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCanton.jComboBoxTiposAccionesFormularioCanton.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCanton() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCanton.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCanton.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCanton.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCanton.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCanton.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCanton.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCanton.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCanton.addItem(reporte);
			}
			
			
			if(!this.cantonSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCanton.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCanton.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCanton.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCanton.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCanton.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCanton.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCanton!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCanton.jComboBoxTiposAccionesFormularioCanton.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCanton.jComboBoxTiposAccionesFormularioCanton.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCanton.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCanton.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCanton.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCanton();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCanton() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCanton!=null) {
				this.jInternalFrameReporteDinamicoCanton.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCanton.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCanton!=null) {
				this.jInternalFrameReporteDinamicoCanton.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCanton.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCanton!=null) {
				
				if(this.jInternalFrameReporteDinamicoCanton.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCanton.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCanton.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCanton.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCanton.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCanton.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCanton()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_provinciaFK_IdProvinciaCanton.getSelectedItem()!=null){this.id_provinciaFK_IdProvincia=((Provincia)this.jComboBoxid_provinciaFK_IdProvinciaCanton.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCanton(Boolean esInicializar) throws Exception {				
		if(CantonJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCanton();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCanton() throws Exception {
		this.inicializarActualizarBindingTablaCanton(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCanton() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCanton.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCanton.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCanton.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CantonPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCanton.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCanton.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CantonPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCantonOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCantonOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CantonPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCanton.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCanton.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CantonPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCanton.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCanton(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cantonLogic.getCantons().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cantons.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CantonJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCanton.setModel(new CantonModel(this.cantonLogic.getCantons(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCanton.setModel(new CantonModel(this.cantons,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCanton!=null && this.jInternalFrameOrderByCanton.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCanton();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCanton.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCanton,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CantonPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CantonConstantesFunciones.SCLASSWEBTITULO,cantonConstantesFunciones.resaltarSeleccionarCanton,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CantonConstantesFunciones.SCLASSWEBTITULO,cantonConstantesFunciones.resaltarSeleccionarCanton,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCanton.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCanton,CantonConstantesFunciones.LABEL_ID));

		if(this.cantonConstantesFunciones.mostraridCanton && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CantonConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cantonConstantesFunciones.resaltaridCanton,this.cantonConstantesFunciones.activaridCanton,this,true,"idCanton","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cantonConstantesFunciones.resaltaridCanton,this.cantonConstantesFunciones.activaridCanton,this,true,"idCanton","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCanton.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCanton,CantonConstantesFunciones.LABEL_IDPROVINCIA));

		if(this.cantonConstantesFunciones.mostrarid_provinciaCanton && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CantonConstantesFunciones.LABEL_IDPROVINCIA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProvinciaTableCell(this.provinciasForeignKey,this.cantonConstantesFunciones.resaltarid_provinciaCanton,this,this.cantonConstantesFunciones.activarid_provinciaCanton));
			tableColumn.setCellEditor(new ProvinciaTableCell(this.provinciasForeignKey,this.cantonConstantesFunciones.resaltarid_provinciaCanton,this,this.cantonConstantesFunciones.activarid_provinciaCanton,true,"id_provinciaCanton","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CantonPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCanton.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCanton,CantonConstantesFunciones.LABEL_CODIGO));

		if(this.cantonConstantesFunciones.mostrarcodigoCanton && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CantonConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cantonConstantesFunciones.resaltarcodigoCanton,this.cantonConstantesFunciones.activarcodigoCanton,this,true,"codigoCanton","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cantonConstantesFunciones.resaltarcodigoCanton,this.cantonConstantesFunciones.activarcodigoCanton,this,true,"codigoCanton","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CantonPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCanton.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCanton,CantonConstantesFunciones.LABEL_NOMBRE));

		if(this.cantonConstantesFunciones.mostrarnombreCanton && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CantonConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cantonConstantesFunciones.resaltarnombreCanton,this.cantonConstantesFunciones.activarnombreCanton,this,true,"nombreCanton","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cantonConstantesFunciones.resaltarnombreCanton,this.cantonConstantesFunciones.activarnombreCanton,this,true,"nombreCanton","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CantonPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCanton.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCanton,CantonConstantesFunciones.LABEL_ESACTIVO));

		if(this.cantonConstantesFunciones.mostrares_activoCanton && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CantonConstantesFunciones.LABEL_ESACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.cantonConstantesFunciones.resaltares_activoCanton,this.cantonConstantesFunciones.activares_activoCanton));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.cantonConstantesFunciones.resaltares_activoCanton,this.cantonConstantesFunciones.activares_activoCanton,this,true,"es_activoCanton","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CantonPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cantonSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosBarrio && this.cantonConstantesFunciones.mostrarBarrioCanton && !CantonConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Barrios");
				tableColumn.setHeaderValue("Barrios");
				tableColumn.setCellRenderer(new BarrioTableCell(cantonConstantesFunciones.resaltarBarrioCanton,this,this.cantonConstantesFunciones.activarBarrioCanton));
				tableColumn.setCellEditor(new BarrioTableCell(cantonConstantesFunciones.resaltarBarrioCanton,this,this.cantonConstantesFunciones.activarBarrioCanton));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosCanton.addColumn(tableColumn);
			}

			if(this.isTienePermisosParroquia && this.cantonConstantesFunciones.mostrarParroquiaCanton && !CantonConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parroquias");
				tableColumn.setHeaderValue("Parroquias");
				tableColumn.setCellRenderer(new ParroquiaTableCell(cantonConstantesFunciones.resaltarParroquiaCanton,this,this.cantonConstantesFunciones.activarParroquiaCanton));
				tableColumn.setCellEditor(new ParroquiaTableCell(cantonConstantesFunciones.resaltarParroquiaCanton,this,this.cantonConstantesFunciones.activarParroquiaCanton));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosCanton.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cantonSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cantonSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCanton.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cantonSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cantonSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCanton.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCanton && this.isPermisoGuardarCambiosCanton) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cantonSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cantonSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCanton.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.cantonSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosCanton.addColumn(tableColumn);
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
			
			this.jTableDatosCanton.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCanton && this.isPermisoGuardarCambiosCanton) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.cantonSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCanton && this.isPermisoGuardarCambiosCanton) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCanton.moveColumn(this.jTableDatosCanton.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCanton.moveColumn(this.jTableDatosCanton.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.cantonSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosCanton.moveColumn(this.jTableDatosCanton.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCanton.moveColumn(this.jTableDatosCanton.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCanton.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCanton.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCanton,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CantonJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCanton.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCanton.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CantonJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CantonJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCanton.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCanton.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCanton.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=cantonLogic.getCantons().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cantons.size()-1;
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
		//this.jTableDatosCanton.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCanton.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCanton();
			
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
				
				//this.isEsNuevoCanton=false;
					
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
			
				if(this.cantonSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCanton==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCanton.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCanton.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.canton =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.canton =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.canton.getsType().equals("DUPLICADO")
				   || this.canton.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCanton=true;
				
				} else {
					this.isEsNuevoCanton=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cantonSessionBean.getEsGuardarRelacionado()) {
					if(this.canton.getId()>=0 && !this.canton.getIsNew()) {						
						this.isEsNuevoCanton=false;
						
					} else {
						this.isEsNuevoCanton=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCanton(esRelaciones);						
				
				this.seleccionarCanton(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.canton.getId()<0) {
					this.isEsNuevoCanton=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCanton(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCanton(evt,rowIndex);
				}	
				
				if(this.cantonSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Canton: " + this.dDif); 
					}
				}								
				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCanton(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.canton)) {
					if(this.canton.getId()>0) {
						this.canton.setIsDeleted(true);
						
						this.cantonsEliminados.add(this.canton);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cantonLogic.getCantons().remove(this.canton);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cantons.remove(this.canton);				
					}
					
					
					((CantonModel) this.jTableDatosCanton.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCanton(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCanton(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCanton) {
			
			if(this.jInternalFrameDetalleFormCanton==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCanton.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCanton.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.canton =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.canton =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CantonJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCanton(this.canton);
				}
				
				//ARCHITECTURE
				try {
					

					//Provincia
					if(!this.cantonConstantesFunciones.cargarid_provinciaCanton || this.cantonConstantesFunciones.event_dependid_provinciaCanton) {
						//this.cargarCombosProvinciasForeignKeyLista(" where id="+this.canton.getid_provincia());
									//this.inicializarActualizarBindingCanton(false,false);
						this.provinciasForeignKey=new ArrayList<Provincia>();

						if(canton.getProvincia()!=null) {
							this.provinciasForeignKey.add(canton.getProvincia());
						}

						this.addItemDefectoCombosForeignKeyProvincia();
						this.cargarCombosFrameProvinciasForeignKey("Todos");
					}
					this.setActualProvinciaForeignKey(this.canton.getid_provincia(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCanton("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCanton(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCanton() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCanton(Canton canton) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCanton(canton,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCanton(Canton canton,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCanton(canton);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCanton(canton,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCanton(canton);
	}
	
	public void setVariablesObjetoActualToFormularioCanton(Canton canton) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCanton==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCanton.jLabelidCanton.setText(canton.getId().toString());
			this.jInternalFrameDetalleFormCanton.jTextFieldcodigoCanton.setText(canton.getcodigo());
			this.jInternalFrameDetalleFormCanton.jTextAreanombreCanton.setText(canton.getnombre());
			this.jInternalFrameDetalleFormCanton.jCheckBoxes_activoCanton.setSelected(canton.getes_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Canton cantonLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cantonLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Canton cantonLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cantonLocal=this.canton;
			} else {
				cantonLocal=this.cantonAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cantonLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCanton(cantonLocal,true);
					
					if(cantonSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cantonLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cantonSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cantonLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCanton(Canton canton,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCanton(canton,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCanton(canton);
	}
	
	public void setVariablesFormularioToObjetoActualCanton(Canton canton,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCanton(canton,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCanton(Canton canton,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCanton==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCanton.jLabelidCanton.getText()==null || this.jInternalFrameDetalleFormCanton.jLabelidCanton.getText()=="" || this.jInternalFrameDetalleFormCanton.jLabelidCanton.getText()=="Id") {
				this.jInternalFrameDetalleFormCanton.jLabelidCanton.setText("0");
			}

			if(conColumnasBase) {canton.setId(Long.parseLong(this.jInternalFrameDetalleFormCanton.jLabelidCanton.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CantonConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCanton.jLabelIdCanton,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			canton.setcodigo(this.jInternalFrameDetalleFormCanton.jTextFieldcodigoCanton.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CantonConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCanton.jLabelcodigoCanton,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			canton.setnombre(this.jInternalFrameDetalleFormCanton.jTextAreanombreCanton.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CantonConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCanton.jLabelnombreCanton,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			canton.setes_activo(this.jInternalFrameDetalleFormCanton.jCheckBoxes_activoCanton.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CantonConstantesFunciones.LABEL_ESACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCanton.jLabeles_activoCanton,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCanton(Canton cantonBean,Canton canton,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cantonBean.getid_provincia()!=null && !cantonBean.getid_provincia().equals(-1L))) {canton.setid_provincia(cantonBean.getid_provincia());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCanton(Canton cantonOrigen,Canton canton,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cantonOrigen.getId()!=null && !cantonOrigen.getId().equals(0L))) {canton.setId(cantonOrigen.getId());}}
			if(conDefault || (!conDefault && cantonOrigen.getid_provincia()!=null && !cantonOrigen.getid_provincia().equals(-1L))) {canton.setid_provincia(cantonOrigen.getid_provincia());}
			if(conDefault || (!conDefault && cantonOrigen.getcodigo()!=null && !cantonOrigen.getcodigo().equals(""))) {canton.setcodigo(cantonOrigen.getcodigo());}
			if(conDefault || (!conDefault && cantonOrigen.getnombre()!=null && !cantonOrigen.getnombre().equals(""))) {canton.setnombre(cantonOrigen.getnombre());}
			if(conDefault || (!conDefault && cantonOrigen.getes_activo()!=null && !cantonOrigen.getes_activo().equals(false))) {canton.setes_activo(cantonOrigen.getes_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCanton(Canton canton) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCanton.jLabelidCanton.setText(canton.getId().toString());
			this.jInternalFrameDetalleFormCanton.jTextFieldcodigoCanton.setText(canton.getcodigo());
			this.jInternalFrameDetalleFormCanton.jTextAreanombreCanton.setText(canton.getnombre());
			this.jInternalFrameDetalleFormCanton.jCheckBoxes_activoCanton.setSelected(canton.getes_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCanton(CantonBean cantonBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCanton.jLabelidCanton.setText(cantonBean.getId().toString());
			this.jInternalFrameDetalleFormCanton.jTextFieldcodigoCanton.setText(cantonBean.getcodigo());
			this.jInternalFrameDetalleFormCanton.jTextAreanombreCanton.setText(cantonBean.getnombre());
			this.jInternalFrameDetalleFormCanton.jCheckBoxes_activoCanton.setSelected(cantonBean.getes_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCanton(CantonParameterReturnGeneral cantonReturnGeneral,CantonBean cantonBean,Boolean conDefault) throws Exception { 
		try {
			Canton cantonLocal=new Canton();
			
			cantonLocal=cantonReturnGeneral.getCanton();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cantonLocal.getId()!=null && !cantonLocal.getId().equals(0L))) {cantonBean.setId(cantonLocal.getId());}}
			if(conDefault || (!conDefault && cantonLocal.getid_provincia()!=null && !cantonLocal.getid_provincia().equals(-1L))) {cantonBean.setid_provincia(cantonLocal.getid_provincia());}
			if(conDefault || (!conDefault && cantonLocal.getcodigo()!=null && !cantonLocal.getcodigo().equals(""))) {cantonBean.setcodigo(cantonLocal.getcodigo());}
			if(conDefault || (!conDefault && cantonLocal.getnombre()!=null && !cantonLocal.getnombre().equals(""))) {cantonBean.setnombre(cantonLocal.getnombre());}
			if(conDefault || (!conDefault && cantonLocal.getes_activo()!=null && !cantonLocal.getes_activo().equals(false))) {cantonBean.setes_activo(cantonLocal.getes_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCantonGenerico(Long idCantonSeleccionado,JComboBox jComboBoxCanton,List<Canton> cantonsLocal)throws Exception {
		try {
			Canton  cantonTemp=null;

			for(Canton cantonAux:cantonsLocal) {
				if(cantonAux.getId()!=null && cantonAux.getId().equals(idCantonSeleccionado)) {
					cantonTemp=cantonAux;
					break;
				}
			}

			jComboBoxCanton.setSelectedItem(cantonTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCantonGenerico(JComboBox jComboBoxCanton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCanton.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCanton.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCanton.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCanton.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCanton.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCanton.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCanton.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCanton.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCanton.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCanton.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Barrio")) {
			jButtonBarrioActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Parroquia")) {
			jButtonParroquiaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			canton=(Canton) cantonLogic.getCantons().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			canton =(Canton) cantons.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Provincia")) {
			//sDescripcion=this.getActualProvinciaForeignKeyDescripcion((Long)value);
			if(!canton.getIsNew() && !canton.getIsChanged() && !canton.getIsDeleted()) {
				sDescripcion=canton.getprovincia_descripcion();
			} else {
				//sDescripcion=this.getActualProvinciaForeignKeyDescripcion((Long)value);
				sDescripcion=canton.getprovincia_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Canton cantonRow=new Canton();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cantonRow=(Canton) cantonLogic.getCantons().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cantonRow=(Canton) cantons.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonBarrioActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Canton canton) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormCanton==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.canton = (Canton)this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.canton = (Canton)this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(canton!=null) {
						this.canton = canton;
					} else {
						this.canton = new Canton();
					}
				}

				if(this.isTienePermisosBarrio && this.permiteMantenimiento(this.canton)) {
					BarrioBeanSwingJInternalFrame barrioBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFramePopup=new BarrioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						barrioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFramePopup;
					} else {
						barrioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame;
					}

					List<Canton> cantons=new ArrayList<Canton>();
					cantons.add(this.canton);
					if(!esRelacionado) {
						//barrioBeanSwingJInternalFrame.barrioSessionBean.setConGuardarRelaciones(false);
						//barrioBeanSwingJInternalFrame.barrioSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					barrioBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormCanton.cargarBarrioBeanSwingJInternalFrame(cantons,this.canton,barrioBeanSwingJInternalFrame,/*conInicializar,*/barrioBeanSwingJInternalFrame.barrioSessionBean.getConGuardarRelaciones(),barrioBeanSwingJInternalFrame.barrioSessionBean.getEsGuardarRelacionado());
					barrioBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						barrioBeanSwingJInternalFrame.actualizarEstadoPanelsBarrio("no_relacionado");

						barrioBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(BarrioConstantesFunciones.ITAMANIOFILATABLA + (BarrioConstantesFunciones.ITAMANIOFILATABLA/2));

						barrioBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderCanton=(TitledBorder)this.jScrollPanelDatosCanton.getBorder();
						TitledBorder titledBorderBarrio=(TitledBorder)barrioBeanSwingJInternalFrame.jScrollPanelDatosBarrio.getBorder();

						titledBorderBarrio.setTitle(titledBorderCanton.getTitle() + " -> Barrio");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,barrioBeanSwingJInternalFrame);
						}

						barrioBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(barrioBeanSwingJInternalFrame);

						barrioBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.cantonSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Barrio",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParroquiaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Canton canton) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormCanton==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.canton = (Canton)this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.canton = (Canton)this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(canton!=null) {
						this.canton = canton;
					} else {
						this.canton = new Canton();
					}
				}

				if(this.isTienePermisosParroquia && this.permiteMantenimiento(this.canton)) {
					ParroquiaBeanSwingJInternalFrame parroquiaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFramePopup=new ParroquiaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parroquiaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFramePopup;
					} else {
						parroquiaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame;
					}

					List<Canton> cantons=new ArrayList<Canton>();
					cantons.add(this.canton);
					if(!esRelacionado) {
						//parroquiaBeanSwingJInternalFrame.parroquiaSessionBean.setConGuardarRelaciones(false);
						//parroquiaBeanSwingJInternalFrame.parroquiaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parroquiaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormCanton.cargarParroquiaBeanSwingJInternalFrame(cantons,this.canton,parroquiaBeanSwingJInternalFrame,/*conInicializar,*/parroquiaBeanSwingJInternalFrame.parroquiaSessionBean.getConGuardarRelaciones(),parroquiaBeanSwingJInternalFrame.parroquiaSessionBean.getEsGuardarRelacionado());
					parroquiaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parroquiaBeanSwingJInternalFrame.actualizarEstadoPanelsParroquia("no_relacionado");

						parroquiaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParroquiaConstantesFunciones.ITAMANIOFILATABLA + (ParroquiaConstantesFunciones.ITAMANIOFILATABLA/2));

						parroquiaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderCanton=(TitledBorder)this.jScrollPanelDatosCanton.getBorder();
						TitledBorder titledBorderParroquia=(TitledBorder)parroquiaBeanSwingJInternalFrame.jScrollPanelDatosParroquia.getBorder();

						titledBorderParroquia.setTitle(titledBorderCanton.getTitle() + " -> Parroquia");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parroquiaBeanSwingJInternalFrame);
						}

						parroquiaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parroquiaBeanSwingJInternalFrame);

						parroquiaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.cantonSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parroquia",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCanton(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCanton.setVisible((this.isVisibilidadCeldaNuevoCanton && this.isPermisoNuevoCanton));			
			this.jButtonDuplicarCanton.setVisible((this.isVisibilidadCeldaDuplicarCanton && this.isPermisoDuplicarCanton));			
			this.jButtonCopiarCanton.setVisible((this.isVisibilidadCeldaCopiarCanton && this.isPermisoCopiarCanton));
			this.jButtonVerFormCanton.setVisible((this.isVisibilidadCeldaVerFormCanton && this.isPermisoVerFormCanton));
			
			this.jButtonAbrirOrderByCanton.setVisible((this.isVisibilidadCeldaOrdenCanton && this.isPermisoOrdenCanton));			
			
			this.jButtonNuevoRelacionesCanton.setVisible((this.isVisibilidadCeldaNuevoRelacionesCanton && this.isPermisoNuevoCanton));			
			this.jButtonNuevoGuardarCambiosCanton.setVisible((this.isVisibilidadCeldaNuevoCanton && this.isPermisoNuevoCanton && this.isPermisoGuardarCambiosCanton));
			
			if(this.jInternalFrameDetalleFormCanton!=null) {
			this.jInternalFrameDetalleFormCanton.jButtonModificarCanton.setVisible((this.isVisibilidadCeldaModificarCanton && this.isPermisoActualizarCanton));	
			this.jInternalFrameDetalleFormCanton.jButtonActualizarCanton.setVisible((this.isVisibilidadCeldaActualizarCanton && this.isPermisoActualizarCanton));	
			this.jInternalFrameDetalleFormCanton.jButtonEliminarCanton.setVisible((this.isVisibilidadCeldaEliminarCanton && this.isPermisoEliminarCanton));
			this.jInternalFrameDetalleFormCanton.jButtonCancelarCanton.setVisible(this.isVisibilidadCeldaCancelarCanton);							
			this.jInternalFrameDetalleFormCanton.jButtonGuardarCambiosCanton.setVisible((this.isVisibilidadCeldaGuardarCanton && this.isPermisoGuardarCambiosCanton));			
			
			}
						
			this.jButtonGuardarCambiosTablaCanton.setVisible((this.isVisibilidadCeldaGuardarCambiosCanton && this.isPermisoGuardarCambiosCanton));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCanton.setVisible((this.isVisibilidadCeldaNuevoCanton && this.isPermisoNuevoCanton));						
			this.jButtonDuplicarToolBarCanton.setVisible((this.isVisibilidadCeldaDuplicarCanton && this.isPermisoDuplicarCanton));						
			this.jButtonCopiarToolBarCanton.setVisible((this.isVisibilidadCeldaCopiarCanton && this.isPermisoCopiarCanton));			
			this.jButtonVerFormToolBarCanton.setVisible((this.isVisibilidadCeldaVerFormCanton && this.isPermisoVerFormCanton));			
			this.jButtonAbrirOrderByToolBarCanton.setVisible((this.isVisibilidadCeldaOrdenCanton && this.isPermisoOrdenCanton));
			this.jButtonNuevoRelacionesToolBarCanton.setVisible((this.isVisibilidadCeldaNuevoRelacionesCanton && this.isPermisoNuevoCanton));			
			this.jButtonNuevoGuardarCambiosToolBarCanton.setVisible((this.isVisibilidadCeldaNuevoCanton && this.isPermisoNuevoCanton && this.isPermisoGuardarCambiosCanton));			
			
			if(this.jInternalFrameDetalleFormCanton!=null) {
			this.jInternalFrameDetalleFormCanton.jButtonModificarToolBarCanton.setVisible((this.isVisibilidadCeldaModificarCanton && this.isPermisoActualizarCanton));	
			this.jInternalFrameDetalleFormCanton.jButtonActualizarToolBarCanton.setVisible((this.isVisibilidadCeldaActualizarCanton  && this.isPermisoActualizarCanton));	
			this.jInternalFrameDetalleFormCanton.jButtonEliminarToolBarCanton.setVisible((this.isVisibilidadCeldaEliminarCanton && this.isPermisoEliminarCanton));
			this.jInternalFrameDetalleFormCanton.jButtonCancelarToolBarCanton.setVisible(this.isVisibilidadCeldaCancelarCanton);				
			this.jInternalFrameDetalleFormCanton.jButtonGuardarCambiosToolBarCanton.setVisible((this.isVisibilidadCeldaGuardarCanton && this.isPermisoGuardarCambiosCanton));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCanton.setVisible((this.isVisibilidadCeldaGuardarCambiosCanton && this.isPermisoGuardarCambiosCanton));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCanton.setVisible((this.isVisibilidadCeldaNuevoCanton && this.isPermisoNuevoCanton));			
			this.jMenuItemDuplicarCanton.setVisible((this.isVisibilidadCeldaDuplicarCanton && this.isPermisoDuplicarCanton));			
			this.jMenuItemCopiarCanton.setVisible((this.isVisibilidadCeldaCopiarCanton && this.isPermisoCopiarCanton));			
			this.jMenuItemVerFormCanton.setVisible((this.isVisibilidadCeldaVerFormCanton && this.isPermisoVerFormCanton));			
			this.jMenuItemAbrirOrderByCanton.setVisible((this.isVisibilidadCeldaOrdenCanton && this.isPermisoOrdenCanton));			
			//this.jMenuItemMostrarOcultarCanton.setVisible((this.isVisibilidadCeldaOrdenCanton && this.isPermisoOrdenCanton));
			this.jMenuItemDetalleAbrirOrderByCanton.setVisible((this.isVisibilidadCeldaOrdenCanton && this.isPermisoOrdenCanton));			
			//this.jMenuItemDetalleMostrarOcultarCanton.setVisible((this.isVisibilidadCeldaOrdenCanton && this.isPermisoOrdenCanton));			
			this.jMenuItemNuevoRelacionesCanton.setVisible((this.isVisibilidadCeldaNuevoRelacionesCanton && this.isPermisoNuevoCanton));			
			this.jMenuItemNuevoGuardarCambiosCanton.setVisible((this.isVisibilidadCeldaNuevoCanton && this.isPermisoNuevoCanton && this.isPermisoGuardarCambiosCanton));									
			
			if(this.jInternalFrameDetalleFormCanton!=null) {
			this.jInternalFrameDetalleFormCanton.jMenuItemModificarCanton.setVisible((this.isVisibilidadCeldaModificarCanton && this.isPermisoActualizarCanton));	
			this.jInternalFrameDetalleFormCanton.jMenuItemActualizarCanton.setVisible((this.isVisibilidadCeldaActualizarCanton && this.isPermisoActualizarCanton));	
			this.jInternalFrameDetalleFormCanton.jMenuItemEliminarCanton.setVisible((this.isVisibilidadCeldaEliminarCanton && this.isPermisoEliminarCanton));
			this.jInternalFrameDetalleFormCanton.jMenuItemCancelarCanton.setVisible(this.isVisibilidadCeldaCancelarCanton);				
			}
			
			this.jMenuItemGuardarCambiosCanton.setVisible((this.isVisibilidadCeldaGuardarCanton && this.isPermisoGuardarCambiosCanton));						
			this.jMenuItemGuardarCambiosTablaCanton.setVisible((this.isVisibilidadCeldaGuardarCambiosCanton && this.isPermisoGuardarCambiosCanton));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCanton=this.jButtonNuevoCanton.isVisible();
			this.isVisibilidadCeldaDuplicarCanton=this.jButtonDuplicarCanton.isVisible();
			this.isVisibilidadCeldaCopiarCanton=this.jButtonCopiarCanton.isVisible();
			this.isVisibilidadCeldaVerFormCanton=this.jButtonVerFormCanton.isVisible();
			
			this.isVisibilidadCeldaOrdenCanton=this.jButtonAbrirOrderByCanton.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCanton=this.jButtonNuevoRelacionesCanton.isVisible();
			this.isVisibilidadCeldaModificarCanton=this.jButtonModificarCanton.isVisible();
			
			if(this.jInternalFrameDetalleFormCanton!=null) {
			this.isVisibilidadCeldaActualizarCanton=this.jInternalFrameDetalleFormCanton.jButtonActualizarCanton.isVisible();
			this.isVisibilidadCeldaEliminarCanton=this.jInternalFrameDetalleFormCanton.jButtonEliminarCanton.isVisible();
			this.isVisibilidadCeldaCancelarCanton=this.jInternalFrameDetalleFormCanton.jButtonCancelarCanton.isVisible();
			this.isVisibilidadCeldaGuardarCanton=this.jInternalFrameDetalleFormCanton.jButtonGuardarCambiosCanton.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCanton=this.jButtonGuardarCambiosTablaCanton.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCanton=this.jButtonNuevoToolBarCanton.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCanton=this.jButtonNuevoRelacionesToolBarCanton.isVisible();
			
			if(this.jInternalFrameDetalleFormCanton!=null) {
			this.isVisibilidadCeldaModificarCanton=this.jInternalFrameDetalleFormCanton.jButtonModificarToolBarCanton.isVisible();
			this.isVisibilidadCeldaActualizarCanton=this.jInternalFrameDetalleFormCanton.jButtonActualizarToolBarCanton.isVisible();
			this.isVisibilidadCeldaEliminarCanton=this.jInternalFrameDetalleFormCanton.jButtonEliminarToolBarCanton.isVisible();
			this.isVisibilidadCeldaCancelarCanton=this.jInternalFrameDetalleFormCanton.jButtonCancelarToolBarCanton.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCanton=this.jButtonGuardarCambiosToolBarCanton.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCanton=this.jButtonGuardarCambiosTablaToolBarCanton.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCanton=this.jMenuItemNuevoCanton.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCanton=this.jMenuItemNuevoRelacionesCanton.isVisible();
			
			if(this.jInternalFrameDetalleFormCanton!=null) {
			this.isVisibilidadCeldaModificarCanton=this.jInternalFrameDetalleFormCanton.jMenuItemModificarCanton.isVisible();
			this.isVisibilidadCeldaActualizarCanton=this.jInternalFrameDetalleFormCanton.jMenuItemActualizarCanton.isVisible();
			this.isVisibilidadCeldaEliminarCanton=this.jInternalFrameDetalleFormCanton.jMenuItemEliminarCanton.isVisible();
			this.isVisibilidadCeldaCancelarCanton=this.jInternalFrameDetalleFormCanton.jMenuItemCancelarCanton.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCanton=this.jMenuItemGuardarCambiosCanton.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCanton=this.jMenuItemGuardarCambiosTablaCanton.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCanton(Boolean esInicializar) {
		if(CantonJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cantonSessionBean.getConGuardarRelaciones()) {
				//if(this.cantonSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCanton();
			}
			
			this.inicializarActualizarBindingBotonesManualCanton(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCanton() {
		this.jButtonNuevoCanton.setVisible(this.isPermisoNuevoCanton);			
		this.jButtonDuplicarCanton.setVisible(this.isPermisoDuplicarCanton);			
		this.jButtonCopiarCanton.setVisible(this.isPermisoCopiarCanton);			
		this.jButtonVerFormCanton.setVisible(this.isPermisoVerFormCanton);			
		
		this.jButtonAbrirOrderByCanton.setVisible(this.isPermisoOrdenCanton);					
		
		this.jButtonNuevoRelacionesCanton.setVisible(this.isPermisoNuevoCanton);			
		
		if(this.jInternalFrameDetalleFormCanton!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCanton.jButtonModificarCanton.setVisible(this.isPermisoActualizarCanton);	
			this.jInternalFrameDetalleFormCanton.jButtonActualizarCanton.setVisible(this.isPermisoActualizarCanton);	
			this.jInternalFrameDetalleFormCanton.jButtonEliminarCanton.setVisible(this.isPermisoEliminarCanton);
			this.jInternalFrameDetalleFormCanton.jButtonCancelarCanton.setVisible(this.isVisibilidadCeldaCancelarCanton);						
			this.jInternalFrameDetalleFormCanton.jButtonGuardarCambiosCanton.setVisible(this.isPermisoGuardarCambiosCanton);							
		}
		
		this.jButtonGuardarCambiosTablaCanton.setVisible(this.isPermisoActualizarCanton);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCanton() {
		this.jInternalFrameDetalleFormCanton.jButtonModificarCanton.setVisible(this.isPermisoActualizarCanton);	
		this.jInternalFrameDetalleFormCanton.jButtonActualizarCanton.setVisible(this.isPermisoActualizarCanton);	
		this.jInternalFrameDetalleFormCanton.jButtonEliminarCanton.setVisible(this.isPermisoEliminarCanton);
		this.jInternalFrameDetalleFormCanton.jButtonCancelarCanton.setVisible(this.isVisibilidadCeldaCancelarCanton);							
		this.jInternalFrameDetalleFormCanton.jButtonGuardarCambiosCanton.setVisible((this.isVisibilidadCeldaGuardarCanton && this.isPermisoGuardarCambiosCanton));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCanton() {
		if(CantonJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCanton();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCanton() {
	}
	
	public void jTableDatosCantonListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCanton(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCantonBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCanton.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCanton(this.getcanton(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCanton(this.canton);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.canton =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.canton =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.canton==null) {
						this.canton = new Canton();
					}

					this.setVariablesFormularioToObjetoActualCanton(this.canton,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCanton(this.canton);
				}

				if(this.canton.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.canton.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCanton(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_provinciaCantonUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoprovincia=true;

			idTienePermisoprovincia=this.tienePermisosUsuarioEnPaginaWebCanton(ProvinciaConstantesFunciones.CLASSNAME);

			if(idTienePermisoprovincia) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCanton.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCanton.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCanton.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.canton =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.canton =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCanton(this.getcanton(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCanton(this.canton);

				this.provinciaBeanSwingJInternalFrame=new ProvinciaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.provinciaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.provinciaBeanSwingJInternalFrame.getProvinciaLogic().setConnexion(this.cantonLogic.getConnexion());

				if(this.canton.getid_provincia()!=null) {
					this.provinciaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.provinciaBeanSwingJInternalFrame.setIdActual(this.canton.getid_provincia());
					this.provinciaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.provinciaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.provinciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProvincia();
				}

				JInternalFrameBase jinternalFrame =this.provinciaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCanton=(TitledBorder)this.jScrollPanelDatosCanton.getBorder();
				TitledBorder titledBorderprovincia=(TitledBorder)this.provinciaBeanSwingJInternalFrame.jScrollPanelDatosProvincia.getBorder();

				titledBorderprovincia.setTitle(titledBorderCanton.getTitle() + " -> Provincia");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_provinciaCantonBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCanton.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCanton(this.getcanton(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCanton(this.canton);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.canton =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.canton =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.canton==null) {
						this.canton = new Canton();
					}

					this.setVariablesFormularioToObjetoActualCanton(this.canton,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCanton(this.canton);
				}

				if(this.canton.getid_provincia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_provincia = "+this.canton.getid_provincia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCanton(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCantonBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCanton.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCanton(this.getcanton(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCanton(this.canton);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.canton =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.canton =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.canton==null) {
						this.canton = new Canton();
					}

					this.setVariablesFormularioToObjetoActualCanton(this.canton,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCanton(this.canton);
				}

				if(this.canton.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.canton.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCanton(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCantonBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCanton.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCanton(this.getcanton(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCanton(this.canton);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.canton =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.canton =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.canton==null) {
						this.canton = new Canton();
					}

					this.setVariablesFormularioToObjetoActualCanton(this.canton,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCanton(this.canton);
				}

				if(this.canton.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.canton.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCanton(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_activoCantonBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCanton.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCanton(this.getcanton(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCanton(this.canton);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.canton =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.canton =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.canton==null) {
						this.canton = new Canton();
					}

					this.setVariablesFormularioToObjetoActualCanton(this.canton,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCanton(this.canton);
				}

				if(this.canton.getes_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_activo = "+this.canton.getes_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCanton(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdProvinciaCantonActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCanton(false,false);

			this.getCantonsFK_IdProvincia();

			this.inicializarActualizarBindingCanton(false);

			//if(CantonBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCanton(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cantonLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCanton() {
		if(this.jInternalFrameDetalleFormCanton!=null) {
		

		if(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormCanton!=null) {
			this.jInternalFrameDetalleFormCanton.setVisible(false);	    			
			this.jInternalFrameDetalleFormCanton.dispose();
			this.jInternalFrameDetalleFormCanton=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCanton!=null) {
			this.jInternalFrameReporteDinamicoCanton.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCanton.dispose();
			this.jInternalFrameReporteDinamicoCanton=null;
		}
		
		if(this.jInternalFrameImportacionCanton!=null) {
			this.jInternalFrameImportacionCanton.setVisible(false);	    			
			this.jInternalFrameImportacionCanton.dispose();
			this.jInternalFrameImportacionCanton=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCanton();
			
			CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
			
			
			if(sTipo.equals("NuevoCanton")) {
				jButtonNuevoCantonActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCanton")) {
				jButtonDuplicarCantonActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCanton")) {
				jButtonCopiarCantonActionPerformed(evt);
			} else if(sTipo.equals("VerFormCanton")) {
				jButtonVerFormCantonActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCanton")) {
				jButtonNuevoCantonActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCanton")) {
				jButtonDuplicarCantonActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCanton")) {
				jButtonNuevoCantonActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCanton")) {
				jButtonDuplicarCantonActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCanton")) {
				jButtonNuevoCantonActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCanton")) {
				jButtonNuevoCantonActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCanton")) {
				jButtonNuevoCantonActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCanton")) {
				jButtonModificarCantonActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCanton")) {
				jButtonModificarCantonActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCanton")) {
				jButtonModificarCantonActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCanton")) {
				jButtonActualizarCantonActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCanton")) {
				jButtonActualizarCantonActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCanton")) {
				jButtonActualizarCantonActionPerformed(evt);
			} else if(sTipo.equals("EliminarCanton")) {
				jButtonEliminarCantonActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCanton")) {
				jButtonEliminarCantonActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCanton")) {
				jButtonEliminarCantonActionPerformed(evt);
			} else if(sTipo.equals("CancelarCanton")) {
				jButtonCancelarCantonActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCanton")) {
				jButtonCancelarCantonActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCanton")) {
				jButtonCancelarCantonActionPerformed(evt);
			} else if(sTipo.equals("CerrarCanton")) {
				jButtonCerrarCantonActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCanton")) {
				jButtonCerrarCantonActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCanton")) {
				jButtonCerrarCantonActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCanton")) {
				jButtonMostrarOcultarCantonActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCanton")) {
				jButtonCancelarCantonActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCanton")) {
				jButtonGuardarCambiosCantonActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCanton")) {
				jButtonGuardarCambiosCantonActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCanton")) {
				jButtonCopiarCantonActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCanton")) {
				jButtonVerFormCantonActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCanton")) {
				jButtonGuardarCambiosCantonActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCanton")) {
				jButtonCopiarCantonActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCanton")) {
				jButtonVerFormCantonActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCanton")) {
				jButtonGuardarCambiosCantonActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCanton")) {
				jButtonGuardarCambiosCantonActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCanton")) {
				jButtonGuardarCambiosCantonActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCanton")) {
				jButtonRecargarInformacionCantonActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCanton")) {
				jButtonRecargarInformacionCantonActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCanton")) {
				jButtonRecargarInformacionCantonActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCanton")) {
				jButtonAnterioresCantonActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCanton")) {
				jButtonAnterioresCantonActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCanton")) {
				jButtonAnterioresCantonActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCanton")) {
				jButtonSiguientesCantonActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCanton")) {
				jButtonSiguientesCantonActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCanton")) {
				jButtonSiguientesCantonActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCanton") || sTipo.equals("MenuItemDetalleAbrirOrderByCanton")) {
				jButtonAbrirOrderByCantonActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCanton") || sTipo.equals("MenuItemDetalleMostrarOcultarCanton")) {
				jButtonMostrarOcultarCantonActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCanton")) {
				jButtonNuevoGuardarCambiosCantonActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCanton")) {
				jButtonNuevoGuardarCambiosCantonActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCanton")) {
				jButtonNuevoGuardarCambiosCantonActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCanton")) {
				jButtonCerrarReporteDinamicoCantonActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCanton")) {
				jButtonGenerarReporteDinamicoCantonActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCanton")) {
				
				jButtonGenerarExcelReporteDinamicoCantonActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCanton")) {
				jButtonCerrarImportacionCantonActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCanton")) {
				
				jButtonGenerarImportacionCantonActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCanton")) {
				
				jButtonAbrirImportacionCantonActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCanton")) {
				jComboBoxTiposAccionesCantonActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCanton")) {
				jComboBoxTiposRelacionesCantonActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCanton")) {
				jComboBoxTiposAccionesCantonActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCanton")) {
				
				jComboBoxTiposSeleccionarCantonActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCanton")) {
				jTextFieldValorCampoGeneralCantonActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCanton")) {
				jButtonAbrirOrderByCantonActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCanton")) {
				jButtonAbrirOrderByCantonActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCanton")) {
				jButtonCerrarOrderByCantonActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCantonBusqueda")) {
				this.jButtonidCantonBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_provinciaCantonUpdate")) {
				this.jButtonid_provinciaCantonUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_provinciaCantonBusqueda")) {
				this.jButtonid_provinciaCantonBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCantonBusqueda")) {
				this.jButtoncodigoCantonBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCantonBusqueda")) {
				this.jButtonnombreCantonBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_activoCantonBusqueda")) {
				this.jButtones_activoCantonBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdProvinciaCanton")) {
				this.jButtonFK_IdProvinciaCantonActionPerformed(evt);
			}
			
			;
			
			
			CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCanton();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCantonActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.canton);
				
				this.actualizarInformacion("INFO_PADRE",false,this.canton);
				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
				
				


				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Canton.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Canton.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Canton cantonLocal=null;
			
			if(!this.getEsControlTabla()) {
				cantonLocal=this.canton;
			} else {
				cantonLocal=this.cantonAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.canton);
				
				this.actualizarInformacion("INFO_PADRE",false,this.canton);
				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
							
				
				


				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Canton.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Canton.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCantonActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCanton.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonAnterior =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cantonAnterior =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
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
			
			CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
			
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
			
			


			
			CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCantonActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.canton);
				
				this.actualizarInformacion("INFO_PADRE",false,this.canton);
				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
								
						
				


				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Canton.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Canton.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.canton);
				
				this.actualizarInformacion("INFO_PADRE",false,this.canton);
				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
								
				
				


				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Canton.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Canton.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCantonActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCanton.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonAnterior =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cantonAnterior =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.canton);
				
				this.actualizarInformacion("INFO_PADRE",false,this.canton);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCantonActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCanton.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonAnterior =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cantonAnterior =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCantonActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.canton);
			
			this.actualizarInformacion("INFO_PADRE",false,this.canton);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.canton);
				
				this.actualizarInformacion("INFO_PADRE",false,this.canton);
				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
							
				
				


				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Canton.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Canton.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCantonActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCanton.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cantonAnterior =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cantonAnterior =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
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
			
			CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
			
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
			
			


			
			CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCantonActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.canton);
			
			this.actualizarInformacion("INFO_PADRE",false,this.canton);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.canton);
				
				this.actualizarInformacion("INFO_PADRE",false,this.canton);
				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
								
				
				


				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Canton.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Canton.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCantonActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCanton.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonAnterior =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cantonAnterior =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCantonActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.canton);
			
			this.actualizarInformacion("INFO_PADRE",false,this.canton);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCantonActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.canton);
				
				this.actualizarInformacion("INFO_PADRE",false,this.canton);
				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCanton")) {
					jCheckBoxSeleccionarTodosCantonItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCanton")) {
					jCheckBoxSeleccionadosCantonItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCanton")) {
					
				}
				
				


				
				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Canton.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Canton.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.canton);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.canton);
				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
												
				
				


				
				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Canton.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Canton.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCantonActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCanton.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cantonAnterior =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cantonAnterior =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCantonActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.canton);
				
				this.actualizarInformacion("INFO_PADRE",false,this.canton);
				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
				
				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
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
			
			CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
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
			
			


			
			CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCantonActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.canton);
				
				this.actualizarInformacion("INFO_PADRE",false,this.canton);
				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Canton.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Canton.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.canton);
				
				this.actualizarInformacion("INFO_PADRE",false,this.canton);
				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
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
				
				


				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Canton.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Canton.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCantonActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCanton.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cantonAnterior =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cantonAnterior =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCanton")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCantonListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCanton.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.canton =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.canton =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.canton);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCanton")) {
				
				}
				
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCanton")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCanton.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCanton")) {
			
			}
			
			CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCanton();
			
			CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
			
			if(sTipo.equals("NuevoCanton")) {
				jButtonNuevoCantonActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCanton")) {
				jButtonDuplicarCantonActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCanton")) {
				jButtonCopiarCantonActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCanton")) {
				jButtonVerFormCantonActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCanton")) {
				jButtonNuevoCantonActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCanton")) {
				jButtonModificarCantonActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCanton")) {
				jButtonActualizarCantonActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCanton")) {
				jButtonEliminarCantonActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCanton")) {
				jButtonGuardarCambiosCantonActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCanton")) {
				jButtonCancelarCantonActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCanton")) {
				jButtonCerrarCantonActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCanton")) {
				jButtonGuardarCambiosCantonActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCanton")) {
				jButtonNuevoGuardarCambiosCantonActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCanton")) {
				jButtonAbrirOrderByCantonActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCanton")) {
				jButtonRecargarInformacionCantonActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCanton")) {
				jButtonAnterioresCantonActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCanton")) {
				jButtonSiguientesCantonActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCantonBusqueda")) {
				this.jButtonidCantonBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_provinciaCantonUpdate")) {
				this.jButtonid_provinciaCantonUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_provinciaCantonBusqueda")) {
				this.jButtonid_provinciaCantonBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCantonBusqueda")) {
				this.jButtoncodigoCantonBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCantonBusqueda")) {
				this.jButtonnombreCantonBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_activoCantonBusqueda")) {
				this.jButtones_activoCantonBusquedaActionPerformed(evt);
			}
			
			CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCanton();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCanton")) {
				closingInternalFrameCanton();
				
			} else if(sTipo.equals("jButtonCancelarCanton")) {
				JInternalFrameBase jInternalFrameDetalleFormCanton = (JInternalFrameBase)evt.getSource();
	            	
	            CantonBeanSwingJInternalFrame jInternalFrameParent=(CantonBeanSwingJInternalFrame)jInternalFrameDetalleFormCanton.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCantonActionPerformed(null);
			}
			
			CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.canton,new Object(),this.cantonParameterGeneral,this.cantonReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCanton(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCanton(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCanton(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.canton)) {
			if(!esControlTabla) {
				if(CantonJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCanton(this.canton,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCanton(this.canton);			
				}
				
				if(this.cantonSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCanton(this.canton,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cantonReturnGeneral=cantonLogic.procesarEventosCantonsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cantonLogic.getCantons(),this.canton,this.cantonParameterGeneral,this.isEsNuevoCanton,classes);//this.cantonLogic.getCanton()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCanton(this.cantonReturnGeneral,this.cantonBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cantonSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCanton(classes,this.cantonReturnGeneral,this.cantonBean,false);
					}
						
					if(this.cantonReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCanton(this.cantonReturnGeneral.getCanton());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCanton(this.cantonReturnGeneral.getCanton());	
					}
						
					if(this.cantonReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCanton(this.cantonReturnGeneral.getCanton(),classes);//this.cantonBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCanton(this.canton,classes);//this.cantonBean);									
				}
			
				if(CantonJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCanton(this.canton,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCanton(this.canton);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cantonAnterior!=null) {
						this.canton=this.cantonAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cantonReturnGeneral=cantonLogic.procesarEventosCantonsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cantonLogic.getCantons(),this.canton,this.cantonParameterGeneral,this.isEsNuevoCanton,classes);//this.cantonLogic.getCanton()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cantonSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cantonSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cantonReturnGeneral.getCanton(),cantonLogic.getCantons());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cantonReturnGeneral.getCanton(),this.cantons);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCanton.repaint();
				
				//((AbstractTableModel) this.jTableDatosCanton.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCanton();
			}
		}
	}
	
	public void actualizarVisualTableDatosCanton() throws Exception {
		
		CantonModel cantonModel=(CantonModel)this.jTableDatosCanton.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cantonModel.cantons=this.cantonLogic.getCantons();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cantonModel.cantons=this.cantons;
		}
		
		
		((CantonModel) this.jTableDatosCanton.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCanton() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcantonAnterior(),this.cantonLogic.getCantons());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcantonAnterior(),this.cantons);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCanton();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCanton(Canton canton,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Barrio.class)) {
					this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrioLogic.setBarrios(canton.getBarrios());
					this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.inicializarActualizarBindingTablaBarrio(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Parroquia.class)) {
					this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiaLogic.setParroquias(canton.getParroquias());
					this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.inicializarActualizarBindingTablaParroquia(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
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
										
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.canton,new Object(),generalEntityParameterGeneral,this.cantonReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cantonSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CantonConstantesFunciones.getClassesRelationshipsOfCanton(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CantonConstantesFunciones.getClassesRelationshipsFromStringsOfCanton(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCanton(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CantonBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.canton,new Object(),generalEntityParameterGeneral,this.cantonReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CantonConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCanton(CantonBean cantonBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Barrio.class)) {
					this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrioLogic.setBarrios(canton.getBarrios());
					this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.inicializarActualizarBindingTablaBarrio(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Parroquia.class)) {
					this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiaLogic.setParroquias(canton.getParroquias());
					this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.inicializarActualizarBindingTablaParroquia(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCanton(ArrayList<Classe> classes,CantonReturnGeneral cantonReturnGeneral,CantonBean cantonBean,Boolean conDefault) throws Exception {
		
			this.cantonBean.setBarrios(cantonReturnGeneral.getCanton().getBarrios());
			this.cantonBean.setParroquias(cantonReturnGeneral.getCanton().getParroquias());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCanton(Canton canton,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Barrio.class)) {
					canton.setBarrios(this.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Parroquia.class)) {
					canton.setParroquias(this.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.parroquiaLogic.getParroquias());
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
		if(!paraTabla && !this.permiteMantenimiento(this.canton)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCanton = new CantonDetalleFormJInternalFrame(jDesktopPane,this.cantonSessionBean.getConGuardarRelaciones(),this.cantonSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCanton);
		this.jInternalFrameDetalleFormCanton.setVisible(false);
		this.jInternalFrameDetalleFormCanton.setSelected(false);						
		
		this.jInternalFrameDetalleFormCanton.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCanton.cantonLogic=this.cantonLogic;
		
		this.cargarCombosFrameForeignKeyCanton("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCanton();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCanton();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCanton("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCanton();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCanton.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCanton"));
		
		this.jInternalFrameDetalleFormCanton.jButtonModificarCanton.addActionListener(new ButtonActionListener(this,"ModificarCanton"));

		
		this.jInternalFrameDetalleFormCanton.jButtonModificarToolBarCanton.addActionListener(new ButtonActionListener(this,"ModificarToolBarCanton"));
					
		this.jInternalFrameDetalleFormCanton.jMenuItemModificarCanton.addActionListener(new ButtonActionListener(this,"MenuItemModificarCanton"));		
		
		
		
		this.jInternalFrameDetalleFormCanton.jButtonActualizarCanton.addActionListener (new ButtonActionListener(this,"ActualizarCanton"));
		
		
		this.jInternalFrameDetalleFormCanton.jButtonActualizarToolBarCanton.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCanton"));
						
		this.jInternalFrameDetalleFormCanton.jMenuItemActualizarCanton.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCanton"));		
		
		
		
		this.jInternalFrameDetalleFormCanton.jButtonEliminarCanton.addActionListener (new ButtonActionListener(this,"EliminarCanton"));
		
		
		this.jInternalFrameDetalleFormCanton.jButtonEliminarToolBarCanton.addActionListener (new ButtonActionListener(this,"EliminarToolBarCanton"));
								
		this.jInternalFrameDetalleFormCanton.jMenuItemEliminarCanton.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCanton"));		
		
		
		
		this.jInternalFrameDetalleFormCanton.jButtonCancelarCanton.addActionListener (new ButtonActionListener(this,"CancelarCanton"));
		
		
		this.jInternalFrameDetalleFormCanton.jButtonCancelarToolBarCanton.addActionListener (new ButtonActionListener(this,"CancelarToolBarCanton"));
					
		this.jInternalFrameDetalleFormCanton.jMenuItemCancelarCanton.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCanton"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCanton.jMenuItemDetalleCerrarCanton.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCanton"));		
		
		
		
		this.jInternalFrameDetalleFormCanton.jButtonGuardarCambiosToolBarCanton.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCanton"));
		
		
		
		this.jInternalFrameDetalleFormCanton.jButtonGuardarCambiosToolBarCanton.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCanton"));
		
		
		
		this.jInternalFrameDetalleFormCanton.jComboBoxTiposAccionesFormularioCanton.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCanton"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCanton.jButtonidCantonBusqueda.addActionListener(new ButtonActionListener(this,"idCantonBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCanton.jButtonid_provinciaCantonUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaCantonUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCanton.jButtonid_provinciaCantonBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaCantonBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCanton.jButtoncodigoCantonBusqueda.addActionListener(new ButtonActionListener(this,"codigoCantonBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCanton.jButtonnombreCantonBusqueda.addActionListener(new ButtonActionListener(this,"nombreCantonBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCanton.jButtones_activoCantonBusqueda.addActionListener(new ButtonActionListener(this,"es_activoCantonBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCanton.jTabbedPaneRelacionesCanton.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCanton"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCanton"));
		
		if(this.jInternalFrameDetalleFormCanton!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCanton.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCanton"));
		}
		
		this.jTableDatosCanton.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCanton"));
		
		this.jTableDatosCanton.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCanton"));
		
		this.jButtonNuevoCanton.addActionListener(new ButtonActionListener(this,"NuevoCanton"));
		
		this.jButtonDuplicarCanton.addActionListener(new ButtonActionListener(this,"DuplicarCanton"));
		
		this.jButtonCopiarCanton.addActionListener(new ButtonActionListener(this,"CopiarCanton"));
		
		this.jButtonVerFormCanton.addActionListener(new ButtonActionListener(this,"VerFormCanton"));
		
		
		this.jButtonNuevoToolBarCanton.addActionListener(new ButtonActionListener(this,"NuevoToolBarCanton"));
			
		this.jButtonDuplicarToolBarCanton.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCanton"));
			
		this.jMenuItemNuevoCanton.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCanton"));
			
		this.jMenuItemDuplicarCanton.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCanton"));		
		
		
		this.jButtonNuevoRelacionesCanton.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCanton"));
		
		
		this.jButtonNuevoRelacionesToolBarCanton.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCanton"));
			
		this.jMenuItemNuevoRelacionesCanton.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCanton"));		
		
		
		if(this.jInternalFrameDetalleFormCanton!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCanton.jButtonModificarCanton.addActionListener(new ButtonActionListener(this,"ModificarCanton"));
		}
		
		
		if(this.jInternalFrameDetalleFormCanton!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCanton.jButtonModificarToolBarCanton.addActionListener(new ButtonActionListener(this,"ModificarToolBarCanton"));
			
			this.jInternalFrameDetalleFormCanton.jMenuItemModificarCanton.addActionListener(new ButtonActionListener(this,"MenuItemModificarCanton"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCanton!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCanton.jButtonActualizarCanton.addActionListener (new ButtonActionListener(this,"ActualizarCanton"));
		}
		
		
		if(this.jInternalFrameDetalleFormCanton!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCanton.jButtonActualizarToolBarCanton.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCanton"));
				
			this.jInternalFrameDetalleFormCanton.jMenuItemActualizarCanton.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCanton"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCanton!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCanton.jButtonEliminarCanton.addActionListener (new ButtonActionListener(this,"EliminarCanton"));
		}
		
		
		if(this.jInternalFrameDetalleFormCanton!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCanton.jButtonEliminarToolBarCanton.addActionListener (new ButtonActionListener(this,"EliminarToolBarCanton"));
						
			this.jInternalFrameDetalleFormCanton.jMenuItemEliminarCanton.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCanton"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCanton!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCanton.jButtonCancelarCanton.addActionListener (new ButtonActionListener(this,"CancelarCanton"));
		}
		
		
		if(this.jInternalFrameDetalleFormCanton!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCanton.jButtonCancelarToolBarCanton.addActionListener (new ButtonActionListener(this,"CancelarToolBarCanton"));
			
			this.jInternalFrameDetalleFormCanton.jMenuItemCancelarCanton.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCanton"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCanton.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCanton"));		
		
		
		this.jButtonCerrarCanton.addActionListener (new ButtonActionListener(this,"CerrarCanton"));
		
		
		this.jButtonCerrarToolBarCanton.addActionListener (new ButtonActionListener(this,"CerrarToolBarCanton"));
			
		this.jMenuItemCerrarCanton.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCanton"));
			
		if(this.jInternalFrameDetalleFormCanton!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCanton.jMenuItemDetalleCerrarCanton.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCanton"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCanton!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCanton.jButtonGuardarCambiosCanton.addActionListener (new ButtonActionListener(this,"GuardarCambiosCanton"));
		}
		
		
		if(this.jInternalFrameDetalleFormCanton!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCanton.jButtonGuardarCambiosToolBarCanton.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCanton"));
		}
		
		this.jButtonCopiarToolBarCanton.addActionListener (new ButtonActionListener(this,"CopiarToolBarCanton"));
			
		this.jButtonVerFormToolBarCanton.addActionListener (new ButtonActionListener(this,"VerFormToolBarCanton"));
		
		this.jMenuItemGuardarCambiosCanton.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCanton"));
			
		this.jMenuItemCopiarCanton.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCanton"));		
		
		this.jMenuItemVerFormCanton.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCanton"));		
		
		
		this.jButtonGuardarCambiosTablaCanton.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCanton"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCanton.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCanton"));
			
		this.jMenuItemGuardarCambiosTablaCanton.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCanton"));		
		
		
		
		this.jButtonRecargarInformacionCanton.addActionListener (new ButtonActionListener(this,"RecargarInformacionCanton"));
					
		this.jButtonRecargarInformacionToolBarCanton.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCanton"));
		
		this.jMenuItemRecargarInformacionCanton.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCanton"));		
		
		
		
		this.jButtonAnterioresCanton.addActionListener (new ButtonActionListener(this,"AnterioresCanton"));
		
		
		this.jButtonAnterioresToolBarCanton.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCanton"));
		
		this.jMenuItemAnterioresCanton.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCanton"));		
		
		
		this.jButtonSiguientesCanton.addActionListener (new ButtonActionListener(this,"SiguientesCanton"));
		
		
		this.jButtonSiguientesToolBarCanton.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCanton"));
			
		this.jMenuItemSiguientesCanton.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCanton"));
			
		this.jMenuItemAbrirOrderByCanton.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCanton"));
			
		this.jMenuItemMostrarOcultarCanton.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCanton"));
			
		this.jMenuItemDetalleAbrirOrderByCanton.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCanton"));
			
		this.jMenuItemDetalleMostarOcultarCanton.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCanton"));		
		
		
		this.jButtonNuevoGuardarCambiosCanton.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCanton"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCanton.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCanton"));
			
		this.jMenuItemNuevoGuardarCambiosCanton.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCanton"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCanton.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCanton"));

		this.jCheckBoxSeleccionadosCanton.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCanton"));
		
		if(this.jInternalFrameDetalleFormCanton!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCanton.jComboBoxTiposAccionesFormularioCanton.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCanton"));
		}
		
		
		this.jComboBoxTiposRelacionesCanton.addActionListener (new ButtonActionListener(this,"TiposRelacionesCanton"));
			
		this.jComboBoxTiposAccionesCanton.addActionListener (new ButtonActionListener(this,"TiposAccionesCanton"));
					
		this.jComboBoxTiposSeleccionarCanton.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCanton"));
			
		this.jTextFieldValorCampoGeneralCanton.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCanton"));		
		
		
		if(this.jInternalFrameDetalleFormCanton!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCanton.jButtonidCantonBusqueda.addActionListener(new ButtonActionListener(this,"idCantonBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCanton.jButtonid_provinciaCantonUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaCantonUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCanton.jButtonid_provinciaCantonBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaCantonBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCanton.jButtoncodigoCantonBusqueda.addActionListener(new ButtonActionListener(this,"codigoCantonBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCanton.jButtonnombreCantonBusqueda.addActionListener(new ButtonActionListener(this,"nombreCantonBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCanton.jButtones_activoCantonBusqueda.addActionListener(new ButtonActionListener(this,"es_activoCantonBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdProvinciaCanton.addActionListener(new ButtonActionListener(this,"FK_IdProvinciaCanton"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCanton!=null) {
				this.jInternalFrameReporteDinamicoCanton.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCanton"));
				this.jInternalFrameReporteDinamicoCanton.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCanton"));
				this.jInternalFrameReporteDinamicoCanton.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCanton"));
			}
			
			//this.jButtonCerrarReporteDinamicoCanton.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCanton"));				
			//this.jButtonGenerarReporteDinamicoCanton.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCanton"));
			//this.jButtonGenerarExcelReporteDinamicoCanton.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCanton"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCanton!=null) {
				this.jInternalFrameImportacionCanton.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCanton"));
				this.jInternalFrameImportacionCanton.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCanton"));
				this.jInternalFrameImportacionCanton.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCanton"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCanton.addActionListener (new ButtonActionListener(this,"AbrirOrderByCanton"));
			
			this.jButtonAbrirOrderByToolBarCanton.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCanton"));			
			
			if(this.jInternalFrameOrderByCanton!=null) {
				this.jInternalFrameOrderByCanton.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCanton"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCanton!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCanton!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCanton.jTabbedPaneRelacionesCanton.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCanton"));
		
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
            		closingInternalFrameCanton();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCanton.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCanton = (JInternalFrameBase)event.getSource();
	            	
	            CantonBeanSwingJInternalFrame jInternalFrameParent=(CantonBeanSwingJInternalFrame)jInternalFrameDetalleFormCanton.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCantonActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCanton.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCantonListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCanton.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCanton.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCantonActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCantonActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCantonActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCanton";
		inputMap = this.jButtonNuevoCanton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCanton.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCantonActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCantonActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCantonActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCantonActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCanton";
		inputMap = this.jButtonNuevoRelacionesCanton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCanton.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCantonActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCanton";
		inputMap = this.jButtonModificarCanton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCanton.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCantonActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCanton";
		inputMap = this.jButtonActualizarCanton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCanton.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCantonActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCanton";
		inputMap = this.jButtonEliminarCanton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCanton.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCantonActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCanton";
		inputMap = this.jButtonCancelarCanton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCanton.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCantonActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCanton";
		inputMap = this.jButtonCerrarCanton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCanton.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCantonActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCanton.jButtonGuardarCambiosCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCanton";
		inputMap = this.jInternalFrameDetalleFormCanton.jButtonGuardarCambiosCanton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCanton.jButtonGuardarCambiosCanton.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCantonActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCanton.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCantonItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCanton.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCantonActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCanton.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCantonActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCanton.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCantonActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCanton.jButtonidCantonBusqueda.addActionListener(new ButtonActionListener(this,"idCantonBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCanton.jButtonid_provinciaCantonUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaCantonUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCanton.jButtonid_provinciaCantonBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaCantonBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCanton.jButtoncodigoCantonBusqueda.addActionListener(new ButtonActionListener(this,"codigoCantonBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCanton.jButtonnombreCantonBusqueda.addActionListener(new ButtonActionListener(this,"nombreCantonBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCanton.jButtones_activoCantonBusqueda.addActionListener(new ButtonActionListener(this,"es_activoCantonBusqueda"));
		
		
		this.jButtonFK_IdProvinciaCanton.addActionListener(new ButtonActionListener(this,"FK_IdProvinciaCanton"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCanton.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCantonActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCantonActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCanton.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCanton(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Canton cantonAux:this.cantonLogic.getCantons()) {
					cantonAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Canton cantonAux:cantons) {
					cantonAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCantonItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCanton(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Canton cantonAux:this.cantonLogic.getCantons()) {
						cantonAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Canton cantonAux:cantons) {
						cantonAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Canton cantonAux:this.cantonLogic.getCantons()) {
					
						if(sTipoSeleccionar.equals(CantonConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							cantonAux.setes_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Canton cantonAux:cantons) {
						
						if(sTipoSeleccionar.equals(CantonConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							cantonAux.setes_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCanton(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCanton.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCanton.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCanton,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCantonItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCanton(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCanton.getSelectedRows();
			
			Canton cantonLocal=new Canton();
			
			//this.seleccionarTodosCanton(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cantonLocal =(Canton) this.cantonLogic.getCantons().toArray()[this.jTableDatosCanton.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cantonLocal =(Canton) this.cantons.toArray()[this.jTableDatosCanton.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cantonLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Canton cantonAux:this.cantonLogic.getCantons()) {
						cantonAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Canton cantonAux:cantons) {
						cantonAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCanton(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCanton.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCanton.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCanton,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCantonItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCantonParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCantonActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCanton(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCanton.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Canton cantonAux:this.cantonLogic.getCantons()) {
				
						if(sTipoSeleccionar.equals(CantonConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cantonAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CantonConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cantonAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Canton cantonAux:cantons) {
					
						if(sTipoSeleccionar.equals(CantonConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cantonAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CantonConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cantonAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCanton(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCantonActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCanton(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCanton=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCanton.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCanton.jComboBoxTiposAccionesFormularioCanton.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCanton) {				
					conSplash=true;//false;										
					
					//this.startProcessCanton(conSplash);
				
					this.generarReporteCantonsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCanton.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCanton.jComboBoxTiposAccionesFormularioCanton.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCantonsSeleccionados();
				//this.jComboBoxTiposAccionesCanton.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCantonsSeleccionados(false);
				//this.jComboBoxTiposAccionesCanton.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCantonsSeleccionados(true);
				//this.jComboBoxTiposAccionesCanton.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCanton();
				
				this.exportarCantonsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCanton.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCanton.jComboBoxTiposAccionesFormularioCanton.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCantons();
				//this.importarCantons();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCanton.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCanton.jComboBoxTiposAccionesFormularioCanton.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCanton();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCantonsSeleccionados();
				//this.jComboBoxTiposAccionesCanton.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Canton", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCanton();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCanton)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCanton(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Canton",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCanton.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCanton.jComboBoxTiposAccionesFormularioCanton.setSelectedIndex(0);					
				}	
			} 			
			else if(CantonBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCanton) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCanton(conSplash);
					
						//this.actualizarParametrosGeneralCanton();
						
						this.generarReporteProcesoAccionCantonsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCanton.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCanton.jComboBoxTiposAccionesFormularioCanton.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CantonBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO CantonES SELECCIONADOS?", "MANTENIMIENTO DE Canton", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCanton();
				
						this.actualizarParametrosGeneralCanton();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cantonReturnGeneral=cantonLogic.procesarAccionCantonsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cantonLogic.getCantons(),this.cantonParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCantonReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCanton.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCanton.jComboBoxTiposAccionesFormularioCanton.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCanton();
					
					CantonBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCantonReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCanton.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCanton.jComboBoxTiposAccionesFormularioCanton.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCanton(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCantonActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCanton();
			
			if(this.jInternalFrameDetalleFormCanton==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Canton> cantonsSeleccionados=new ArrayList<Canton>();		
			Canton canton=new Canton();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCanton(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCanton.getSelectedItem();
			
			
			
			
			cantonsSeleccionados=this.getCantonsSeleccionados(true);
			//this.sTipoAccion;
			
			if(cantonsSeleccionados.size()==1) {
				for(Canton cantonAux:cantonsSeleccionados) {
					canton=cantonAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Barrio")) {
					jButtonBarrioActionPerformed(null,rowIndex,true,false,canton);
				}
				else if(this.sTipoRelacion.equals("Parroquia")) {
					jButtonParroquiaActionPerformed(null,rowIndex,true,false,canton);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCanton();
			
      		//this.finishProcessCanton(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCantonReturnGeneral() throws Exception {
		if(this.cantonReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cantonReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cantonReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cantonReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cantonReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cantonReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCanton(false);
		}
		
		if(this.cantonReturnGeneral.getConRetornoLista() || this.cantonReturnGeneral.getConRetornoObjeto()) {
			if(this.cantonReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cantonLogic.setCantons(this.cantonReturnGeneral.getCantons());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cantonReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cantonLogic.setCanton(this.cantonReturnGeneral.getCanton());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCanton(false);
		}
	}
	
	public void actualizarParametrosGeneralCanton() throws Exception {
		
		
	}
	
	public ArrayList<Canton> getCantonsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Canton> cantonsSeleccionados=new ArrayList<Canton>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCanton) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Canton cantonAux:cantonLogic.getCantons()) {
					if(cantonAux.getIsSelected()) {
						cantonsSeleccionados.add(cantonAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Canton cantonAux:this.cantons) {
					if(cantonAux.getIsSelected()) {
						cantonsSeleccionados.add(cantonAux);				
					}
				}
			}
			
			if(cantonsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cantonsSeleccionados.addAll(this.cantonLogic.getCantons());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cantonsSeleccionados.addAll(this.cantons);				
					}
				}
			}
		} else {
			cantonsSeleccionados.add(this.canton);
		}
		
		return cantonsSeleccionados;
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
	
	public void generarReporteCantonsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCantonsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCantonsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCantonsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCantonsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesCantonsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Canton",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCantonsSeleccionados() throws Exception {
		ArrayList<Canton> cantonsSeleccionados=new ArrayList<Canton>();		
		
		cantonsSeleccionados=this.getCantonsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCantons("Todos",cantonsSeleccionados);
		
	}	
	
	public void generarReporteNormalCantonsSeleccionados() throws Exception {
		ArrayList<Canton> cantonsSeleccionados=new ArrayList<Canton>();		
		
		cantonsSeleccionados=this.getCantonsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCantons("Todos",cantonsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCantonsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Canton> cantonsSeleccionados=new ArrayList<Canton>();
		
		cantonsSeleccionados=this.getCantonsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCantons("Todos",cantonsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCantonsSeleccionados() throws Exception {
		ArrayList<Canton> cantonsSeleccionados=new ArrayList<Canton>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCanton();
		
		
		cantonsSeleccionados=this.getCantonsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCanton();
		
		
		//this.generarReporteCantons("Todos",cantonsSeleccionados ,cantonImplementable,cantonImplementableHome);
	}
	
	public void mostrarImportacionCantons() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCanton();
		
		this.abrirFrameImportacionCanton();		
		
			
		//this.generarReporteCantons("Todos",cantonsSeleccionados ,cantonImplementable,cantonImplementableHome);
	}
	
	public void importarCantons() throws Exception {		
	
	}
	
	public void exportarCantonsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCantonsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCantonsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCantonsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Canton",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCantonsSeleccionados() throws Exception {
		ArrayList<Canton> cantonsSeleccionados=new ArrayList<Canton>();		
		
		cantonsSeleccionados=this.getCantonsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"canton."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCanton(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Canton cantonAux:cantonsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCanton(cantonAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cantonAux.setsDetalleGeneralEntityReporte(cantonAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cantonSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Canton",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCanton(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CantonConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CantonConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CantonConstantesFunciones.LABEL_IDPROVINCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CantonConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CantonConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CantonConstantesFunciones.LABEL_ESACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCanton(Canton canton,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=canton.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=canton.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=canton.getprovincia_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=canton.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=canton.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=canton.getes_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCantonsSeleccionados() throws Exception {
		ArrayList<Canton> cantonsSeleccionados=new ArrayList<Canton>();		
		
		cantonsSeleccionados=this.getCantonsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"canton.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Cantons");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCanton(row);				
				iRow++;
			}				
			
			for(Canton cantonAux:cantonsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCanton(cantonAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cantonSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Canton",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCantonsSeleccionados() throws Exception {
		ArrayList<Canton> cantonsSeleccionados=new ArrayList<Canton>();		
		
		cantonsSeleccionados=this.getCantonsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"canton.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cantons");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("canton");
			//elementRoot.appendChild(element);
		
			for(Canton cantonAux:cantonsSeleccionados) {
				element = document.createElement("canton");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCanton(cantonAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cantonSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Canton",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCanton(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CantonConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CantonConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CantonConstantesFunciones.LABEL_IDPROVINCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(CantonConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CantonConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CantonConstantesFunciones.LABEL_ESACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCanton(Canton canton,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(canton.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(canton.getprovincia_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(canton.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(canton.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(canton.getes_activo());				
	}
	
	public void setFilaDatosExportarXmlCanton(Canton canton,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CantonConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(canton.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CantonConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(canton.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementprovincia_descripcion = document.createElement(CantonConstantesFunciones.IDPROVINCIA);
		elementprovincia_descripcion.appendChild(document.createTextNode(canton.getprovincia_descripcion()));
		element.appendChild(elementprovincia_descripcion);

		Element elementcodigo = document.createElement(CantonConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(canton.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(CantonConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(canton.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementes_activo = document.createElement(CantonConstantesFunciones.ESACTIVO);
		elementes_activo.appendChild(document.createTextNode(canton.getes_activo().toString().trim()));
		element.appendChild(elementes_activo);
	}
	
	public void generarReporteGroupGenericoCantonsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Canton> cantonsSeleccionados=new ArrayList<Canton>();
		
		cantonsSeleccionados=this.getCantonsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCanton(cantonsSeleccionados);
		
		this.generarReporteCantons("Todos",cantonsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCanton(ArrayList<Canton> cantonsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Canton cantonAux:cantonsSeleccionados) {
				cantonAux.setsDetalleGeneralEntityReporte(cantonAux.toString());
			
				if(sTipoSeleccionar.equals(CantonConstantesFunciones.LABEL_IDPROVINCIA)) {
					existe=true;
					cantonAux.setsDescripcionGeneralEntityReporte1(cantonAux.getprovincia_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CantonConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					cantonAux.setsDescripcionGeneralEntityReporte1(cantonAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CantonConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					cantonAux.setsDescripcionGeneralEntityReporte1(cantonAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(CantonConstantesFunciones.LABEL_ESACTIVO)) {
					existe=true;
					cantonAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(cantonAux.getes_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CantonConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCanton(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCanton=true;
				this.isVisibilidadCeldaNuevoRelacionesCanton=true;
				this.isVisibilidadCeldaGuardarCambiosCanton=true;
			}
			
			this.isVisibilidadCeldaModificarCanton=false;
			this.isVisibilidadCeldaActualizarCanton=false;
			this.isVisibilidadCeldaEliminarCanton=false;
			this.isVisibilidadCeldaCancelarCanton=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCanton=true;
				} else {
					this.isVisibilidadCeldaGuardarCanton=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCanton=false;
			this.isVisibilidadCeldaNuevoRelacionesCanton=false;
			this.isVisibilidadCeldaGuardarCambiosCanton=false;
			this.isVisibilidadCeldaModificarCanton=false;
			this.isVisibilidadCeldaActualizarCanton=true;
			this.isVisibilidadCeldaEliminarCanton=false;
			this.isVisibilidadCeldaCancelarCanton=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCanton=true;
				} else {
					this.isVisibilidadCeldaGuardarCanton=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCanton=false;
			this.isVisibilidadCeldaNuevoRelacionesCanton=false;
			this.isVisibilidadCeldaGuardarCambiosCanton=false;
			this.isVisibilidadCeldaModificarCanton=false;
			this.isVisibilidadCeldaActualizarCanton=true;
			this.isVisibilidadCeldaEliminarCanton=true;
			this.isVisibilidadCeldaCancelarCanton=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCanton=true;
				} else {
					this.isVisibilidadCeldaGuardarCanton=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCanton=false;
			this.isVisibilidadCeldaNuevoRelacionesCanton=false;
			this.isVisibilidadCeldaGuardarCambiosCanton=false;
			this.isVisibilidadCeldaModificarCanton=false;
			this.isVisibilidadCeldaActualizarCanton=true;
			this.isVisibilidadCeldaEliminarCanton=false;
			this.isVisibilidadCeldaCancelarCanton=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCanton=false;
				} else {
					this.isVisibilidadCeldaGuardarCanton=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCanton=true;
			this.isVisibilidadCeldaNuevoRelacionesCanton=true;
			this.isVisibilidadCeldaGuardarCambiosCanton=true;
			this.isVisibilidadCeldaModificarCanton=false;
			this.isVisibilidadCeldaActualizarCanton=false;
			this.isVisibilidadCeldaEliminarCanton=false;
			this.isVisibilidadCeldaCancelarCanton=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCanton=true;
				} else {
					this.isVisibilidadCeldaGuardarCanton=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCanton=false;
			this.isVisibilidadCeldaNuevoRelacionesCanton=false;
			this.isVisibilidadCeldaGuardarCambiosCanton=false;
			this.isVisibilidadCeldaActualizarCanton=false;
			this.isVisibilidadCeldaEliminarCanton=false;
			this.isVisibilidadCeldaCancelarCanton=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCanton=false;
				} else {
					this.isVisibilidadCeldaGuardarCanton=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCanton=false;
			this.isVisibilidadCeldaNuevoRelacionesCanton=false;
			this.isVisibilidadCeldaGuardarCambiosCanton=false;
			this.isVisibilidadCeldaModificarCanton=true;
			this.isVisibilidadCeldaActualizarCanton=false;
			this.isVisibilidadCeldaEliminarCanton=false;
			this.isVisibilidadCeldaCancelarCanton=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCanton=false;
				} else {
					this.isVisibilidadCeldaGuardarCanton=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CantonJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCanton=true;
			this.isVisibilidadCeldaNuevoRelacionesCanton=true;
			this.isVisibilidadCeldaGuardarCambiosCanton=true;
		} else {
			this.actualizarEstadoPanelsCanton(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCanton=false;
			//this.isVisibilidadCeldaVerFormCanton=false;
			this.isVisibilidadCeldaDuplicarCanton=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cantonSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCanton=false;
		} else {
			this.isVisibilidadCeldaNuevoCanton=false;
			this.isVisibilidadCeldaGuardarCambiosCanton=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cantonSessionBean.getEsGuardarRelacionado()) {
			if(!cantonSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCanton=false;												
			}
			
			this.jButtonCerrarCanton.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCanton=false;
		}
		
		if(!this.permiteMantenimiento(this.canton)) {
			this.isVisibilidadCeldaActualizarCanton=false;
			this.isVisibilidadCeldaEliminarCanton=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCanton() {
		this.isVisibilidadCeldaNuevoCanton=false;
		this.isVisibilidadCeldaGuardarCambiosCanton=false;
	}
	
	public void actualizarEstadoPanelsCanton(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCanton!=null) {
				this.jScrollPanelDatosEdicionCanton.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCanton!=null) {
				this.jTabbedPaneBusquedasCanton.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCanton!=null) {
				this.jScrollPanelDatosCanton.setVisible(true);
			}
			
			if(this.jPanelPaginacionCanton!=null) {
				this.jPanelPaginacionCanton.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCanton!=null) {
				this.jPanelParametrosReportesCanton.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCanton!=null) {
				this.jScrollPanelDatosEdicionCanton.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCanton!=null) {
				this.jTabbedPaneBusquedasCanton.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCanton!=null) {
				this.jScrollPanelDatosCanton.setVisible(false);
			}
			
			if(this.jPanelPaginacionCanton!=null) {
				this.jPanelPaginacionCanton.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCanton!=null) {
				this.jPanelParametrosReportesCanton.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCanton!=null) {
				this.jScrollPanelDatosEdicionCanton.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCanton!=null) {
				this.jTabbedPaneBusquedasCanton.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCanton!=null) {
				this.jScrollPanelDatosCanton.setVisible(false);
			}
			
			if(this.jPanelPaginacionCanton!=null) {
				this.jPanelPaginacionCanton.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCanton!=null) {
				this.jPanelParametrosReportesCanton.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCanton!=null) {
				this.jScrollPanelDatosEdicionCanton.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCanton!=null) {
				this.jTabbedPaneBusquedasCanton.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCanton!=null) {
				this.jScrollPanelDatosCanton.setVisible(false);
			}
			
			if(this.jPanelPaginacionCanton!=null) {
				this.jPanelPaginacionCanton.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCanton!=null) {
				this.jPanelParametrosReportesCanton.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCanton!=null) {
				this.jScrollPanelDatosEdicionCanton.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCanton!=null) {
				this.jTabbedPaneBusquedasCanton.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCanton!=null) {
				this.jScrollPanelDatosCanton.setVisible(true);
			}
			
			if(this.jPanelPaginacionCanton!=null) {
				this.jPanelPaginacionCanton.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCanton!=null) {
				this.jPanelParametrosReportesCanton.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCanton!=null) {
				this.jScrollPanelDatosEdicionCanton.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCanton!=null) {
				this.jTabbedPaneBusquedasCanton.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCanton!=null) {
				this.jScrollPanelDatosCanton.setVisible(true);
			}
			
			if(this.jPanelPaginacionCanton!=null) {
				this.jPanelPaginacionCanton.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCanton!=null) {
				this.jPanelParametrosReportesCanton.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCanton!=null) {
				this.jScrollPanelDatosEdicionCanton.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCanton!=null) {
				this.jTabbedPaneBusquedasCanton.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCanton!=null) {
				this.jScrollPanelDatosCanton.setVisible(true);
			}
			
			if(this.jPanelPaginacionCanton!=null) {
				this.jPanelPaginacionCanton.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCanton!=null) {
				this.jPanelParametrosReportesCanton.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cantonSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCanton!=null) {
					this.jTabbedPaneBusquedasCanton.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCanton!=null) {
				this.jPanelParametrosReportesCanton.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cantonSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCanton!=null) {
				this.jTabbedPaneBusquedasCanton.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCanton!=null) {
				this.jPanelParametrosReportesCanton.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaProvincia(Boolean isParaProvincia){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProvinciaNegation=!isParaProvincia;

			this.isVisibilidadFK_IdProvincia=isParaProvincia;
			if(!this.isVisibilidadFK_IdProvincia) {this.jTabbedPaneBusquedasCanton.remove(jPanelFK_IdProvinciaCanton);}
		}
		
	}
	
	

	public String registrarSesionCantonParaBarrios() throws Exception {
		Boolean isPaginaPopupBarrio=false;

		try {

			if(this.cantonSessionBean==null) {
				this.cantonSessionBean=new CantonSessionBean();
			}

			if(this.jInternalFrameDetalleFormCanton.barrioSessionBean==null) {
				this.jInternalFrameDetalleFormCanton.barrioSessionBean=new BarrioSessionBean();
			}

			this.jInternalFrameDetalleFormCanton.barrioSessionBean.setsPathNavegacionActual(cantonSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+BarrioConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormCanton.barrioSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupBarrio=this.jInternalFrameDetalleFormCanton.barrioSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormCanton.barrioSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeBarrio(true);
			this.jInternalFrameDetalleFormCanton.barrioSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeBarrio(CantonConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormCanton.barrioSessionBean.setisBusquedaDesdeForeignKeySesionCanton(true);
			this.jInternalFrameDetalleFormCanton.barrioSessionBean.setlidCantonActual(this.idCantonActual);

			cantonSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCanton(true);
			cantonSessionBean.setlIdCantonActualForeignKey(this.idCantonActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionCantonParaParroquias() throws Exception {
		Boolean isPaginaPopupParroquia=false;

		try {

			if(this.cantonSessionBean==null) {
				this.cantonSessionBean=new CantonSessionBean();
			}

			if(this.jInternalFrameDetalleFormCanton.parroquiaSessionBean==null) {
				this.jInternalFrameDetalleFormCanton.parroquiaSessionBean=new ParroquiaSessionBean();
			}

			this.jInternalFrameDetalleFormCanton.parroquiaSessionBean.setsPathNavegacionActual(cantonSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParroquiaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormCanton.parroquiaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParroquia=this.jInternalFrameDetalleFormCanton.parroquiaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormCanton.parroquiaSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormCanton.parroquiaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParroquia(false);
			this.jInternalFrameDetalleFormCanton.parroquiaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParroquia(CantonConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormCanton.parroquiaSessionBean.setisBusquedaDesdeForeignKeySesionCanton(true);
			this.jInternalFrameDetalleFormCanton.parroquiaSessionBean.setlidCantonActual(this.idCantonActual);

			cantonSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCanton(true);
			cantonSessionBean.setlIdCantonActualForeignKey(this.idCantonActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CantonSessionBean cantonSessionBean=new CantonSessionBean();
		
		if(this.cantonSessionBean==null) {
			this.cantonSessionBean=new CantonSessionBean();
		}
		
		this.cantonSessionBean.setsUltimaBusquedaCanton(this.getsAccionBusqueda());
		this.cantonSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cantonSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdProvincia")) {
			cantonSessionBean.setid_provincia(this.getid_provinciaFK_IdProvincia());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CantonSessionBean cantonSessionBean=new CantonSessionBean();
		
		if(this.cantonSessionBean==null) {
			this.cantonSessionBean=new CantonSessionBean();
		}
		
		if(this.cantonSessionBean.getsUltimaBusquedaCanton()!=null&&!this.cantonSessionBean.getsUltimaBusquedaCanton().equals("")) {
			this.setsAccionBusqueda(cantonSessionBean.getsUltimaBusquedaCanton());
			this.setiNumeroPaginacion(cantonSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cantonSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdProvincia")) {
				this.setid_provinciaFK_IdProvincia(cantonSessionBean.getid_provincia());
				cantonSessionBean.setid_provincia(-1L);
			}
		}
		
		this.cantonSessionBean.setsUltimaBusquedaCanton("");
		this.cantonSessionBean.setiNumeroPaginacion(CantonConstantesFunciones.INUMEROPAGINACION);
		this.cantonSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCanton(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCanton() {
		this.updateBorderResaltarBusquedasFormularioCanton();
		this.updateVisibilidadBusquedasFormularioCanton();
		this.updateHabilitarBusquedasFormularioCanton();
	}
	
	public void updateBorderResaltarBusquedasFormularioCanton() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCanton.getComponents().length>0) {
	

		if(this.cantonConstantesFunciones.resaltarFK_IdProvinciaCanton!=null) {
			index= this.jTabbedPaneBusquedasCanton.indexOfComponent(this.jPanelFK_IdProvinciaCanton);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCanton.getComponent(index);
				jPanel.setBorder(this.cantonConstantesFunciones.resaltarFK_IdProvinciaCanton);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCanton() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCanton.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCanton.indexOfComponent(this.jPanelFK_IdProvinciaCanton);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCanton.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cantonConstantesFunciones.mostrarFK_IdProvinciaCanton);
			if(!this.cantonConstantesFunciones.mostrarFK_IdProvinciaCanton && index>-1) {
				this.jTabbedPaneBusquedasCanton.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCanton() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCanton.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCanton.indexOfComponent(this.jPanelFK_IdProvinciaCanton);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCanton.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cantonConstantesFunciones.activarFK_IdProvinciaCanton);
				this.jTabbedPaneBusquedasCanton.setEnabledAt(index,this.cantonConstantesFunciones.activarFK_IdProvinciaCanton);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCanton(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdProvincia")) {
			index= this.jTabbedPaneBusquedasCanton.indexOfComponent(this.jPanelFK_IdProvinciaCanton);

			this.jTabbedPaneBusquedasCanton.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCanton.getComponent(index);

			this.cantonConstantesFunciones.setResaltarFK_IdProvinciaCanton(resaltar);

			jPanel.setBorder(this.cantonConstantesFunciones.resaltarFK_IdProvinciaCanton);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCanton.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCanton() throws Exception {

		if(this.jInternalFrameDetalleFormCanton==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCanton();
		this.updateVisibilidadResaltarControlesFormularioCanton();
		this.updateHabilitarResaltarControlesFormularioCanton();
		
	}
	
	public void updateBorderResaltarControlesFormularioCanton() throws Exception {
		if(this.jInternalFrameDetalleFormCanton==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cantonConstantesFunciones.resaltaridCanton!=null && this.jInternalFrameDetalleFormCanton!=null) {this.jInternalFrameDetalleFormCanton.jLabelidCanton.setBorder(this.cantonConstantesFunciones.resaltaridCanton);}
		if(this.cantonConstantesFunciones.resaltarid_provinciaCanton!=null && this.jInternalFrameDetalleFormCanton!=null) {this.jInternalFrameDetalleFormCanton.jComboBoxid_provinciaCanton.setBorder(this.cantonConstantesFunciones.resaltarid_provinciaCanton);}
		if(this.cantonConstantesFunciones.resaltarcodigoCanton!=null && this.jInternalFrameDetalleFormCanton!=null) {this.jInternalFrameDetalleFormCanton.jTextFieldcodigoCanton.setBorder(this.cantonConstantesFunciones.resaltarcodigoCanton);}
		if(this.cantonConstantesFunciones.resaltarnombreCanton!=null && this.jInternalFrameDetalleFormCanton!=null) {this.jInternalFrameDetalleFormCanton.jTextAreanombreCanton.setBorder(this.cantonConstantesFunciones.resaltarnombreCanton);}
		if(this.cantonConstantesFunciones.resaltares_activoCanton!=null && this.jInternalFrameDetalleFormCanton!=null) {this.jInternalFrameDetalleFormCanton.jCheckBoxes_activoCanton.setBorderPainted(true);this.jInternalFrameDetalleFormCanton.jCheckBoxes_activoCanton.setBorder(this.cantonConstantesFunciones.resaltares_activoCanton);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCanton() throws Exception {		
		if(this.jInternalFrameDetalleFormCanton==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCanton!=null) {
	
		//this.jInternalFrameDetalleFormCanton.jLabelidCanton.setVisible(this.cantonConstantesFunciones.mostraridCanton);
		this.jInternalFrameDetalleFormCanton.jPanelidCanton.setVisible(this.cantonConstantesFunciones.mostraridCanton);
		//this.jInternalFrameDetalleFormCanton.jComboBoxid_provinciaCanton.setVisible(this.cantonConstantesFunciones.mostrarid_provinciaCanton);
		this.jInternalFrameDetalleFormCanton.jPanelid_provinciaCanton.setVisible(this.cantonConstantesFunciones.mostrarid_provinciaCanton);
		//this.jInternalFrameDetalleFormCanton.jTextFieldcodigoCanton.setVisible(this.cantonConstantesFunciones.mostrarcodigoCanton);
		this.jInternalFrameDetalleFormCanton.jPanelcodigoCanton.setVisible(this.cantonConstantesFunciones.mostrarcodigoCanton);
		//this.jInternalFrameDetalleFormCanton.jTextAreanombreCanton.setVisible(this.cantonConstantesFunciones.mostrarnombreCanton);
		this.jInternalFrameDetalleFormCanton.jPanelnombreCanton.setVisible(this.cantonConstantesFunciones.mostrarnombreCanton);
		//this.jInternalFrameDetalleFormCanton.jCheckBoxes_activoCanton.setVisible(this.cantonConstantesFunciones.mostrares_activoCanton);
		this.jInternalFrameDetalleFormCanton.jPaneles_activoCanton.setVisible(this.cantonConstantesFunciones.mostrares_activoCanton);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCanton() throws Exception {
		if(this.jInternalFrameDetalleFormCanton==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCanton!=null) {
	
		this.jInternalFrameDetalleFormCanton.jLabelidCanton.setEnabled(this.cantonConstantesFunciones.activaridCanton);
		this.jInternalFrameDetalleFormCanton.jComboBoxid_provinciaCanton.setEnabled(this.cantonConstantesFunciones.activarid_provinciaCanton);
		this.jInternalFrameDetalleFormCanton.jTextFieldcodigoCanton.setEnabled(this.cantonConstantesFunciones.activarcodigoCanton);
		this.jInternalFrameDetalleFormCanton.jTextAreanombreCanton.setEnabled(this.cantonConstantesFunciones.activarnombreCanton);
		this.jInternalFrameDetalleFormCanton.jCheckBoxes_activoCanton.setEnabled(this.cantonConstantesFunciones.activares_activoCanton);
		}
	}
	
		
}