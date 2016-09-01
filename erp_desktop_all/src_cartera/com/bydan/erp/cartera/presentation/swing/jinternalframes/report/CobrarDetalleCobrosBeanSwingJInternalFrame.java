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

//import com.bydan.erp.cartera.util.CobrarDetalleCobrosConstantesFunciones;
import com.bydan.erp.cartera.util.report.CobrarDetalleCobrosParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.CobrarDetalleCobrosParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.CobrarDetalleCobrosBean;
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
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;

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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CobrarDetalleCobrosBeanSwingJInternalFrame extends CobrarDetalleCobrosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CobrarDetalleCobrosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CobrarDetalleCobros> cobrardetallecobrosValidator = new ClassValidator<CobrarDetalleCobros>(CobrarDetalleCobros.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CobrarDetalleCobros cobrardetallecobros;	
	public CobrarDetalleCobros cobrardetallecobrosAux;
	public CobrarDetalleCobros cobrardetallecobrosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CobrarDetalleCobros cobrardetallecobrosTotales;
	public Long idCobrarDetalleCobrosActual;
	public Long iIdNuevoCobrarDetalleCobros=0L;
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

	public String sFinalQueryComboZona="";

	public List<Zona> zonasForeignKey;

	public List<Zona> getzonasForeignKey() {
		return zonasForeignKey;
	}

	public void setzonasForeignKey(List<Zona> zonasForeignKey) {
		this.zonasForeignKey = zonasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Zona zonaForeignKey;

	public Zona getzonaForeignKey() {
		return zonaForeignKey;
	}

	public void setzonaForeignKey(Zona zonaForeignKey) {
		this.zonaForeignKey = zonaForeignKey;
	}

	public String sFinalQueryComboGrupoCliente="";

	public List<GrupoCliente> grupoclientesForeignKey;

	public List<GrupoCliente> getgrupoclientesForeignKey() {
		return grupoclientesForeignKey;
	}

	public void setgrupoclientesForeignKey(List<GrupoCliente> grupoclientesForeignKey) {
		this.grupoclientesForeignKey = grupoclientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public GrupoCliente grupoclienteForeignKey;

	public GrupoCliente getgrupoclienteForeignKey() {
		return grupoclienteForeignKey;
	}

	public void setgrupoclienteForeignKey(GrupoCliente grupoclienteForeignKey) {
		this.grupoclienteForeignKey = grupoclienteForeignKey;
	}

	public String sFinalQueryComboVendedor="";

	public List<Vendedor> vendedorsForeignKey;

	public List<Vendedor> getvendedorsForeignKey() {
		return vendedorsForeignKey;
	}

	public void setvendedorsForeignKey(List<Vendedor> vendedorsForeignKey) {
		this.vendedorsForeignKey = vendedorsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Vendedor vendedorForeignKey;

	public Vendedor getvendedorForeignKey() {
		return vendedorForeignKey;
	}

	public void setvendedorForeignKey(Vendedor vendedorForeignKey) {
		this.vendedorForeignKey = vendedorForeignKey;
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
	
	public Boolean isPermisoTodoCobrarDetalleCobros;
	public Boolean isPermisoNuevoCobrarDetalleCobros;
	public Boolean isPermisoActualizarCobrarDetalleCobros;
	public Boolean isPermisoActualizarOriginalCobrarDetalleCobros;
	public Boolean isPermisoEliminarCobrarDetalleCobros;
	public Boolean isPermisoGuardarCambiosCobrarDetalleCobros;
	public Boolean isPermisoConsultaCobrarDetalleCobros;
	public Boolean isPermisoBusquedaCobrarDetalleCobros;
	public Boolean isPermisoReporteCobrarDetalleCobros;
	public Boolean isPermisoPaginacionMedioCobrarDetalleCobros;
	public Boolean isPermisoPaginacionAltoCobrarDetalleCobros;
	public Boolean isPermisoPaginacionTodoCobrarDetalleCobros;
	public Boolean isPermisoCopiarCobrarDetalleCobros;
	public Boolean isPermisoVerFormCobrarDetalleCobros;
	public Boolean isPermisoDuplicarCobrarDetalleCobros;
	public Boolean isPermisoOrdenCobrarDetalleCobros;
	
	
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
	
	public CobrarDetalleCobrosParameterReturnGeneral cobrardetallecobrosReturnGeneral;
	public CobrarDetalleCobrosParameterReturnGeneral cobrardetallecobrosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCobrarDetalleCobros=false;
	public Boolean esParaAccionDesdeFormularioCobrarDetalleCobros=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CobrarDetalleCobrosSessionBeanAdditional cobrardetallecobrosSessionBeanAdditional=null;
	
	public CobrarDetalleCobrosSessionBeanAdditional getCobrarDetalleCobrosSessionBeanAdditional() {
		return this.cobrardetallecobrosSessionBeanAdditional;
	}
	
	public void setCobrarDetalleCobrosSessionBeanAdditional(CobrarDetalleCobrosSessionBeanAdditional cobrardetallecobrosSessionBeanAdditional) {
		try {
			this.cobrardetallecobrosSessionBeanAdditional=cobrardetallecobrosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CobrarDetalleCobrosBeanSwingJInternalFrameAdditional cobrardetallecobrosBeanSwingJInternalFrameAdditional=null;
	//public class CobrarDetalleCobrosBeanSwingJInternalFrame
	
	public CobrarDetalleCobrosBeanSwingJInternalFrameAdditional getCobrarDetalleCobrosBeanSwingJInternalFrameAdditional() {
		return this.cobrardetallecobrosBeanSwingJInternalFrameAdditional;
	}
	
	public void setCobrarDetalleCobrosBeanSwingJInternalFrameAdditional(CobrarDetalleCobrosBeanSwingJInternalFrameAdditional cobrardetallecobrosBeanSwingJInternalFrameAdditional) {
		try {
			this.cobrardetallecobrosBeanSwingJInternalFrameAdditional=cobrardetallecobrosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CobrarDetalleCobrosLogic cobrardetallecobrosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CobrarDetalleCobros cobrardetallecobrosBean;
	public CobrarDetalleCobrosConstantesFunciones cobrardetallecobrosConstantesFunciones;
	//public CobrarDetalleCobrosParameterReturnGeneral cobrardetallecobrosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public PaisLogic paisLogic;
	public CiudadLogic ciudadLogic;
	public ZonaLogic zonaLogic;
	public GrupoClienteLogic grupoclienteLogic;
	public VendedorLogic vendedorLogic;
	
	//PARAMETROS
	
	
	//public List<CobrarDetalleCobros> cobrardetallecobross;	
	//public List<CobrarDetalleCobros> cobrardetallecobrossEliminados;
	//public List<CobrarDetalleCobros> cobrardetallecobrossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCobrarDetalleCobros=false;
	public Boolean isVisibilidadCeldaDuplicarCobrarDetalleCobros=true;
	public Boolean isVisibilidadCeldaCopiarCobrarDetalleCobros=true;
	public Boolean isVisibilidadCeldaVerFormCobrarDetalleCobros=true;
	public Boolean isVisibilidadCeldaOrdenCobrarDetalleCobros=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros=false;
	public Boolean isVisibilidadCeldaModificarCobrarDetalleCobros=false;
	public Boolean isVisibilidadCeldaActualizarCobrarDetalleCobros=false;
	public Boolean isVisibilidadCeldaEliminarCobrarDetalleCobros=false;
	public Boolean isVisibilidadCeldaCancelarCobrarDetalleCobros=false;
	public Boolean isVisibilidadCeldaGuardarCobrarDetalleCobros=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros=false;	
	
	
	public Boolean isVisibilidadBusquedaCobrarDetalleCobros=false;
	public Boolean isVisibilidadFK_IdCiudad=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdGrupoCliente=false;
	public Boolean isVisibilidadFK_IdPais=false;
	public Boolean isVisibilidadFK_IdVendedor=false;
	public Boolean isVisibilidadFK_IdZona=false;
	
	public Long getiIdNuevoCobrarDetalleCobros() {
		return this.iIdNuevoCobrarDetalleCobros;
	}

	public void setiIdNuevoCobrarDetalleCobros(Long iIdNuevoCobrarDetalleCobros) {
		this.iIdNuevoCobrarDetalleCobros = iIdNuevoCobrarDetalleCobros;
	}
	
	public Long getidCobrarDetalleCobrosActual() {
		return this.idCobrarDetalleCobrosActual;
	}

	public void setidCobrarDetalleCobrosActual(Long idCobrarDetalleCobrosActual) {
		this.idCobrarDetalleCobrosActual = idCobrarDetalleCobrosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CobrarDetalleCobros getcobrardetallecobros() {
		return this.cobrardetallecobros;
	}

	public void setcobrardetallecobros(CobrarDetalleCobros cobrardetallecobros) {
		this.cobrardetallecobros = cobrardetallecobros;
	}
	
	public CobrarDetalleCobros getcobrardetallecobrosAux() {
		return this.cobrardetallecobrosAux;
	}

	public void setcobrardetallecobrosAux(CobrarDetalleCobros cobrardetallecobrosAux) {
		this.cobrardetallecobrosAux = cobrardetallecobrosAux;
	}				
	
	public CobrarDetalleCobros getcobrardetallecobrosAnterior() {
		return this.cobrardetallecobrosAnterior;
	}

	public void setcobrardetallecobrosAnterior(CobrarDetalleCobros cobrardetallecobrosAnterior) {
		this.cobrardetallecobrosAnterior = cobrardetallecobrosAnterior;
	}	
	
	public CobrarDetalleCobros getcobrardetallecobrosTotales() {
		return this.cobrardetallecobrosTotales;
	}

	public void setcobrardetallecobrosTotales(CobrarDetalleCobros cobrardetallecobrosTotales) {
		this.cobrardetallecobrosTotales = cobrardetallecobrosTotales;
	}	
	
	public CobrarDetalleCobros getcobrardetallecobrosBean() {
		return this.cobrardetallecobrosBean;
	}

	public void setcobrardetallecobrosBean(CobrarDetalleCobros cobrardetallecobrosBean) {
		this.cobrardetallecobrosBean = cobrardetallecobrosBean;
	}	
	
	public CobrarDetalleCobrosParameterReturnGeneral getcobrardetallecobrosReturnGeneral() {
		return this.cobrardetallecobrosReturnGeneral;
	}

	public void setcobrardetallecobrosReturnGeneral(CobrarDetalleCobrosParameterReturnGeneral cobrardetallecobrosReturnGeneral) {
		this.cobrardetallecobrosReturnGeneral = cobrardetallecobrosReturnGeneral;
	}	
	
	
	public Long id_paisBusquedaCobrarDetalleCobros=-1L;

	public Long getid_paisBusquedaCobrarDetalleCobros() {
		return this.id_paisBusquedaCobrarDetalleCobros;
	}

	public void setid_paisBusquedaCobrarDetalleCobros(Long id_paisBusquedaCobrarDetalleCobros) {
		this.id_paisBusquedaCobrarDetalleCobros = id_paisBusquedaCobrarDetalleCobros;
	}

;
	public Long id_ciudadBusquedaCobrarDetalleCobros=-1L;

	public Long getid_ciudadBusquedaCobrarDetalleCobros() {
		return this.id_ciudadBusquedaCobrarDetalleCobros;
	}

	public void setid_ciudadBusquedaCobrarDetalleCobros(Long id_ciudadBusquedaCobrarDetalleCobros) {
		this.id_ciudadBusquedaCobrarDetalleCobros = id_ciudadBusquedaCobrarDetalleCobros;
	}

;
	public Long id_zonaBusquedaCobrarDetalleCobros=-1L;

	public Long getid_zonaBusquedaCobrarDetalleCobros() {
		return this.id_zonaBusquedaCobrarDetalleCobros;
	}

	public void setid_zonaBusquedaCobrarDetalleCobros(Long id_zonaBusquedaCobrarDetalleCobros) {
		this.id_zonaBusquedaCobrarDetalleCobros = id_zonaBusquedaCobrarDetalleCobros;
	}

;
	public Long id_grupo_clienteBusquedaCobrarDetalleCobros=-1L;

	public Long getid_grupo_clienteBusquedaCobrarDetalleCobros() {
		return this.id_grupo_clienteBusquedaCobrarDetalleCobros;
	}

	public void setid_grupo_clienteBusquedaCobrarDetalleCobros(Long id_grupo_clienteBusquedaCobrarDetalleCobros) {
		this.id_grupo_clienteBusquedaCobrarDetalleCobros = id_grupo_clienteBusquedaCobrarDetalleCobros;
	}

;
	public Long id_vendedorBusquedaCobrarDetalleCobros=-1L;

	public Long getid_vendedorBusquedaCobrarDetalleCobros() {
		return this.id_vendedorBusquedaCobrarDetalleCobros;
	}

	public void setid_vendedorBusquedaCobrarDetalleCobros(Long id_vendedorBusquedaCobrarDetalleCobros) {
		this.id_vendedorBusquedaCobrarDetalleCobros = id_vendedorBusquedaCobrarDetalleCobros;
	}

;
	public Date fecha_emisionBusquedaCobrarDetalleCobros=new Date();

	public Date getfecha_emisionBusquedaCobrarDetalleCobros() {
		return this.fecha_emisionBusquedaCobrarDetalleCobros;
	}

	public void setfecha_emisionBusquedaCobrarDetalleCobros(Date fecha_emisionBusquedaCobrarDetalleCobros) {
		this.fecha_emisionBusquedaCobrarDetalleCobros = fecha_emisionBusquedaCobrarDetalleCobros;
	}

;
	public Date fecha_emision_hastaBusquedaCobrarDetalleCobros=new Date();

	public Date getfecha_emision_hastaBusquedaCobrarDetalleCobros() {
		return this.fecha_emision_hastaBusquedaCobrarDetalleCobros;
	}

	public void setfecha_emision_hastaBusquedaCobrarDetalleCobros(Date fecha_emision_hastaBusquedaCobrarDetalleCobros) {
		this.fecha_emision_hastaBusquedaCobrarDetalleCobros = fecha_emision_hastaBusquedaCobrarDetalleCobros;
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

	public Long id_grupo_clienteFK_IdGrupoCliente=-1L;

	public Long getid_grupo_clienteFK_IdGrupoCliente() {
		return this.id_grupo_clienteFK_IdGrupoCliente;
	}

	public void setid_grupo_clienteFK_IdGrupoCliente(Long id_grupo_clienteFK_IdGrupoCliente) {
		this.id_grupo_clienteFK_IdGrupoCliente = id_grupo_clienteFK_IdGrupoCliente;
	}

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

	public Long id_vendedorFK_IdVendedor=-1L;

	public Long getid_vendedorFK_IdVendedor() {
		return this.id_vendedorFK_IdVendedor;
	}

	public void setid_vendedorFK_IdVendedor(Long id_vendedorFK_IdVendedor) {
		this.id_vendedorFK_IdVendedor = id_vendedorFK_IdVendedor;
	}

	public Long id_zonaFK_IdZona=-1L;

	public Long getid_zonaFK_IdZona() {
		return this.id_zonaFK_IdZona;
	}

	public void setid_zonaFK_IdZona(Long id_zonaFK_IdZona) {
		this.id_zonaFK_IdZona = id_zonaFK_IdZona;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CobrarDetalleCobrosLogic getCobrarDetalleCobrosLogic()	{		
		return cobrardetallecobrosLogic;
	}

	public void setCobrarDetalleCobrosLogic(CobrarDetalleCobrosLogic cobrardetallecobrosLogic) {
		this.cobrardetallecobrosLogic = cobrardetallecobrosLogic;
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
	
	public Boolean getIsEsNuevoCobrarDetalleCobros() {
		return isEsNuevoCobrarDetalleCobros;
	}

	public void setIsEsNuevoCobrarDetalleCobros(Boolean isEsNuevoCobrarDetalleCobros) {
		this.isEsNuevoCobrarDetalleCobros = isEsNuevoCobrarDetalleCobros;
	}

	public Boolean getEsParaAccionDesdeFormularioCobrarDetalleCobros() {
		return esParaAccionDesdeFormularioCobrarDetalleCobros;
	}
	
	public void setEsParaAccionDesdeFormularioCobrarDetalleCobros(Boolean esParaAccionDesdeFormularioCobrarDetalleCobros) {
		this.esParaAccionDesdeFormularioCobrarDetalleCobros = esParaAccionDesdeFormularioCobrarDetalleCobros;
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

			if(this.cobrardetallecobrosSessionBean==null) {
				this.cobrardetallecobrosSessionBean=new CobrarDetalleCobrosSessionBean();
			}

			if(!this.cobrardetallecobrosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cobrardetallecobrosSessionBean.getlidEmpresaActual());
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

			//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.cobrardetallecobrosSessionBean==null) {
				this.cobrardetallecobrosSessionBean=new CobrarDetalleCobrosSessionBean();
			}

			if(!this.cobrardetallecobrosSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
					paisLogic.getEntityWithConnection(cobrardetallecobrosSessionBean.getlidPaisActual());
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

			if(this.cobrardetallecobrosSessionBean==null) {
				this.cobrardetallecobrosSessionBean=new CobrarDetalleCobrosSessionBean();
			}

			if(!this.cobrardetallecobrosSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
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
					ciudadLogic.getEntityWithConnection(cobrardetallecobrosSessionBean.getlidCiudadActual());
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

	public void cargarCombosZonasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.zonasForeignKey=new ArrayList<Zona>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ZonaLogic zonaLogic=new ZonaLogic();

			//zonaLogic.getZonaDataAccess().setIsForForeingKeyData(true);

			if(this.cobrardetallecobrosSessionBean==null) {
				this.cobrardetallecobrosSessionBean=new CobrarDetalleCobrosSessionBean();
			}

			if(!this.cobrardetallecobrosSessionBean.getisBusquedaDesdeForeignKeySesionZona()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//zonaLogic.getZonaDataAccess().setIsForForeingKeyData(true);

					zonaLogic.getTodosZonasWithConnection(sFinalQuery,new Pagination());

					this.zonasForeignKey=zonaLogic.getZonas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaZona(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					zonaLogic.getEntityWithConnection(cobrardetallecobrosSessionBean.getlidZonaActual());
					this.zonasForeignKey.add(zonaLogic.getZona());
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

	public void cargarCombosGrupoClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.grupoclientesForeignKey=new ArrayList<GrupoCliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			GrupoClienteLogic grupoclienteLogic=new GrupoClienteLogic();

			//grupoclienteLogic.getGrupoClienteDataAccess().setIsForForeingKeyData(true);

			if(this.cobrardetallecobrosSessionBean==null) {
				this.cobrardetallecobrosSessionBean=new CobrarDetalleCobrosSessionBean();
			}

			if(!this.cobrardetallecobrosSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//grupoclienteLogic.getGrupoClienteDataAccess().setIsForForeingKeyData(true);

					grupoclienteLogic.getTodosGrupoClientesWithConnection(sFinalQuery,new Pagination());

					this.grupoclientesForeignKey=grupoclienteLogic.getGrupoClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaGrupoCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteLogic.getEntityWithConnection(cobrardetallecobrosSessionBean.getlidGrupoClienteActual());
					this.grupoclientesForeignKey.add(grupoclienteLogic.getGrupoCliente());
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

	public void cargarCombosVendedorsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.vendedorsForeignKey=new ArrayList<Vendedor>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			VendedorLogic vendedorLogic=new VendedorLogic();

			//vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

			if(this.cobrardetallecobrosSessionBean==null) {
				this.cobrardetallecobrosSessionBean=new CobrarDetalleCobrosSessionBean();
			}

			if(!this.cobrardetallecobrosSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

					vendedorLogic.getTodosVendedorsWithConnection(sFinalQuery,new Pagination());

					this.vendedorsForeignKey=vendedorLogic.getVendedors();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaVendedor(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorLogic.getEntityWithConnection(cobrardetallecobrosSessionBean.getlidVendedorActual());
					this.vendedorsForeignKey.add(vendedorLogic.getVendedor());
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

					if(this.cobrardetallecobros!=null) {
						this.cobrardetallecobros.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
						this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_empresaCobrarDetalleCobros.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCobrarDetalleCobros.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_empresaCobrarDetalleCobros.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_empresaCobrarDetalleCobros.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCobrarDetalleCobrosGenerico)throws Exception
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
				jComboBoxid_empresaCobrarDetalleCobrosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCobrarDetalleCobrosGenerico!=null && jComboBoxid_empresaCobrarDetalleCobrosGenerico.getItemCount()>0) {
					jComboBoxid_empresaCobrarDetalleCobrosGenerico.setSelectedIndex(0);
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

					if(this.cobrardetallecobros!=null) {
						this.cobrardetallecobros.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
						this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_paisCobrarDetalleCobros.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisCobrarDetalleCobros.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_paisCobrarDetalleCobros.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_paisCobrarDetalleCobros.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCobrarDetalleCobros") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros!=null) {
						jComboBoxid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros!=null) {
							//jComboBoxid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedItem(paisTemp);
							if(jComboBoxid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros.getItemCount()>0) {
								jComboBoxid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedIndex(0);
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
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisCobrarDetalleCobrosGenerico)throws Exception
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
				jComboBoxid_paisCobrarDetalleCobrosGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisCobrarDetalleCobrosGenerico!=null && jComboBoxid_paisCobrarDetalleCobrosGenerico.getItemCount()>0) {
					jComboBoxid_paisCobrarDetalleCobrosGenerico.setSelectedIndex(0);
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

					if(this.cobrardetallecobros!=null) {
						this.cobrardetallecobros.setCiudad(ciudadTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
						this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_ciudadCobrarDetalleCobros.setSelectedItem(ciudadTemp);
					}
				} else {
					//jComboBoxid_ciudadCobrarDetalleCobros.setSelectedItem(ciudadTemp);
					if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_ciudadCobrarDetalleCobros.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_ciudadCobrarDetalleCobros.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCobrarDetalleCobros") || sFormularioTipoBusqueda.equals("Todos")){
					if(ciudadTemp!=null && jComboBoxid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros!=null) {
						jComboBoxid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedItem(ciudadTemp);
					} else {
						if(jComboBoxid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros!=null) {
							//jComboBoxid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedItem(ciudadTemp);
							if(jComboBoxid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros.getItemCount()>0) {
								jComboBoxid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedIndex(0);
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
	public void setActualCiudadForeignKeyGenerico(Long idCiudadSeleccionado,JComboBox jComboBoxid_ciudadCobrarDetalleCobrosGenerico)throws Exception
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
				jComboBoxid_ciudadCobrarDetalleCobrosGenerico.setSelectedItem(ciudadTemp);
			} else {
				if(jComboBoxid_ciudadCobrarDetalleCobrosGenerico!=null && jComboBoxid_ciudadCobrarDetalleCobrosGenerico.getItemCount()>0) {
					jComboBoxid_ciudadCobrarDetalleCobrosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualZonaForeignKey(Long idZonaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Zona  zonaTemp=null;

			for(Zona zonaAux:zonasForeignKey) {
				if(zonaAux.getId()!=null && zonaAux.getId().equals(idZonaSeleccionado)) {
					zonaTemp=zonaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(zonaTemp!=null) {

					if(this.cobrardetallecobros!=null) {
						this.cobrardetallecobros.setZona(zonaTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
						this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_zonaCobrarDetalleCobros.setSelectedItem(zonaTemp);
					}
				} else {
					//jComboBoxid_zonaCobrarDetalleCobros.setSelectedItem(zonaTemp);
					if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_zonaCobrarDetalleCobros.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_zonaCobrarDetalleCobros.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCobrarDetalleCobros") || sFormularioTipoBusqueda.equals("Todos")){
					if(zonaTemp!=null && jComboBoxid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros!=null) {
						jComboBoxid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedItem(zonaTemp);
					} else {
						if(jComboBoxid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros!=null) {
							//jComboBoxid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedItem(zonaTemp);
							if(jComboBoxid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.getItemCount()>0) {
								jComboBoxid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedIndex(0);
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

	public String getActualZonaForeignKeyDescripcion(Long idZonaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Zona  zonaTemp=null;

			for(Zona zonaAux:zonasForeignKey) {
				if(zonaAux.getId()!=null && zonaAux.getId().equals(idZonaSeleccionado)) {
					zonaTemp=zonaAux;
					break;
				}
			}


			sDescripcion=ZonaConstantesFunciones.getZonaDescripcion(zonaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualZonaForeignKeyGenerico(Long idZonaSeleccionado,JComboBox jComboBoxid_zonaCobrarDetalleCobrosGenerico)throws Exception
	{
		try
		{
			Zona  zonaTemp=null;

			for(Zona zonaAux:zonasForeignKey) {
				if(zonaAux.getId()!=null && zonaAux.getId().equals(idZonaSeleccionado)) {
					zonaTemp=zonaAux;
					break;
				}
			}

			if(zonaTemp!=null) {
				jComboBoxid_zonaCobrarDetalleCobrosGenerico.setSelectedItem(zonaTemp);
			} else {
				if(jComboBoxid_zonaCobrarDetalleCobrosGenerico!=null && jComboBoxid_zonaCobrarDetalleCobrosGenerico.getItemCount()>0) {
					jComboBoxid_zonaCobrarDetalleCobrosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualGrupoClienteForeignKey(Long idGrupoClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesForeignKey) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(grupoclienteTemp!=null) {

					if(this.cobrardetallecobros!=null) {
						this.cobrardetallecobros.setGrupoCliente(grupoclienteTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
						this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_grupo_clienteCobrarDetalleCobros.setSelectedItem(grupoclienteTemp);
					}
				} else {
					//jComboBoxid_grupo_clienteCobrarDetalleCobros.setSelectedItem(grupoclienteTemp);
					if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_grupo_clienteCobrarDetalleCobros.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_grupo_clienteCobrarDetalleCobros.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCobrarDetalleCobros") || sFormularioTipoBusqueda.equals("Todos")){
					if(grupoclienteTemp!=null && jComboBoxid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros!=null) {
						jComboBoxid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedItem(grupoclienteTemp);
					} else {
						if(jComboBoxid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros!=null) {
							//jComboBoxid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedItem(grupoclienteTemp);
							if(jComboBoxid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros.getItemCount()>0) {
								jComboBoxid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedIndex(0);
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

	public String getActualGrupoClienteForeignKeyDescripcion(Long idGrupoClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesForeignKey) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}


			sDescripcion=GrupoClienteConstantesFunciones.getGrupoClienteDescripcion(grupoclienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualGrupoClienteForeignKeyGenerico(Long idGrupoClienteSeleccionado,JComboBox jComboBoxid_grupo_clienteCobrarDetalleCobrosGenerico)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesForeignKey) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}

			if(grupoclienteTemp!=null) {
				jComboBoxid_grupo_clienteCobrarDetalleCobrosGenerico.setSelectedItem(grupoclienteTemp);
			} else {
				if(jComboBoxid_grupo_clienteCobrarDetalleCobrosGenerico!=null && jComboBoxid_grupo_clienteCobrarDetalleCobrosGenerico.getItemCount()>0) {
					jComboBoxid_grupo_clienteCobrarDetalleCobrosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualVendedorForeignKey(Long idVendedorSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(vendedorTemp!=null) {

					if(this.cobrardetallecobros!=null) {
						this.cobrardetallecobros.setVendedor(vendedorTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
						this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_vendedorCobrarDetalleCobros.setSelectedItem(vendedorTemp);
					}
				} else {
					//jComboBoxid_vendedorCobrarDetalleCobros.setSelectedItem(vendedorTemp);
					if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_vendedorCobrarDetalleCobros.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_vendedorCobrarDetalleCobros.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCobrarDetalleCobros") || sFormularioTipoBusqueda.equals("Todos")){
					if(vendedorTemp!=null && jComboBoxid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros!=null) {
						jComboBoxid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedItem(vendedorTemp);
					} else {
						if(jComboBoxid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros!=null) {
							//jComboBoxid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedItem(vendedorTemp);
							if(jComboBoxid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros.getItemCount()>0) {
								jComboBoxid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedIndex(0);
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

	public String getActualVendedorForeignKeyDescripcion(Long idVendedorSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}


			sDescripcion=VendedorConstantesFunciones.getVendedorDescripcion(vendedorTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualVendedorForeignKeyGenerico(Long idVendedorSeleccionado,JComboBox jComboBoxid_vendedorCobrarDetalleCobrosGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}

			if(vendedorTemp!=null) {
				jComboBoxid_vendedorCobrarDetalleCobrosGenerico.setSelectedItem(vendedorTemp);
			} else {
				if(jComboBoxid_vendedorCobrarDetalleCobrosGenerico!=null && jComboBoxid_vendedorCobrarDetalleCobrosGenerico.getItemCount()>0) {
					jComboBoxid_vendedorCobrarDetalleCobrosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CobrarDetalleCobros cobrardetallecobros,JComboBox jComboBoxid_empresaCobrarDetalleCobrosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCobrarDetalleCobrosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_empresaCobrarDetalleCobros.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCobrarDetalleCobrosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cobrardetallecobros.setid_empresa(empresaAux.getId());
				cobrardetallecobros.setempresa_descripcion(CobrarDetalleCobrosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cobrardetallecobros.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(CobrarDetalleCobros cobrardetallecobros,JComboBox jComboBoxid_paisCobrarDetalleCobrosGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisCobrarDetalleCobrosGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_paisCobrarDetalleCobros.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisCobrarDetalleCobrosGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				cobrardetallecobros.setid_pais(paisAux.getId());
				cobrardetallecobros.setpais_descripcion(CobrarDetalleCobrosConstantesFunciones.getPaisDescripcion(paisAux));
				cobrardetallecobros.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCiudadForeignKey(CobrarDetalleCobros cobrardetallecobros,JComboBox jComboBoxid_ciudadCobrarDetalleCobrosGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadAux=new Ciudad();

			if(jComboBoxid_ciudadCobrarDetalleCobrosGenerico==null) {
				ciudadAux=(Ciudad)this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_ciudadCobrarDetalleCobros.getSelectedItem();
			} else {
				ciudadAux=(Ciudad)jComboBoxid_ciudadCobrarDetalleCobrosGenerico.getSelectedItem();
			}

			if(ciudadAux!=null && ciudadAux.getId()!=null) {
				cobrardetallecobros.setid_ciudad(ciudadAux.getId());
				cobrardetallecobros.setciudad_descripcion(CobrarDetalleCobrosConstantesFunciones.getCiudadDescripcion(ciudadAux));
				cobrardetallecobros.setCiudad(ciudadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarZonaForeignKey(CobrarDetalleCobros cobrardetallecobros,JComboBox jComboBoxid_zonaCobrarDetalleCobrosGenerico)throws Exception
	{
		try
		{
			Zona  zonaAux=new Zona();

			if(jComboBoxid_zonaCobrarDetalleCobrosGenerico==null) {
				zonaAux=(Zona)this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_zonaCobrarDetalleCobros.getSelectedItem();
			} else {
				zonaAux=(Zona)jComboBoxid_zonaCobrarDetalleCobrosGenerico.getSelectedItem();
			}

			if(zonaAux!=null && zonaAux.getId()!=null) {
				cobrardetallecobros.setid_zona(zonaAux.getId());
				cobrardetallecobros.setzona_descripcion(CobrarDetalleCobrosConstantesFunciones.getZonaDescripcion(zonaAux));
				cobrardetallecobros.setZona(zonaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarGrupoClienteForeignKey(CobrarDetalleCobros cobrardetallecobros,JComboBox jComboBoxid_grupo_clienteCobrarDetalleCobrosGenerico)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteAux=new GrupoCliente();

			if(jComboBoxid_grupo_clienteCobrarDetalleCobrosGenerico==null) {
				grupoclienteAux=(GrupoCliente)this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_grupo_clienteCobrarDetalleCobros.getSelectedItem();
			} else {
				grupoclienteAux=(GrupoCliente)jComboBoxid_grupo_clienteCobrarDetalleCobrosGenerico.getSelectedItem();
			}

			if(grupoclienteAux!=null && grupoclienteAux.getId()!=null) {
				cobrardetallecobros.setid_grupo_cliente(grupoclienteAux.getId());
				cobrardetallecobros.setgrupocliente_descripcion(CobrarDetalleCobrosConstantesFunciones.getGrupoClienteDescripcion(grupoclienteAux));
				cobrardetallecobros.setGrupoCliente(grupoclienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarVendedorForeignKey(CobrarDetalleCobros cobrardetallecobros,JComboBox jComboBoxid_vendedorCobrarDetalleCobrosGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorAux=new Vendedor();

			if(jComboBoxid_vendedorCobrarDetalleCobrosGenerico==null) {
				vendedorAux=(Vendedor)this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_vendedorCobrarDetalleCobros.getSelectedItem();
			} else {
				vendedorAux=(Vendedor)jComboBoxid_vendedorCobrarDetalleCobrosGenerico.getSelectedItem();
			}

			if(vendedorAux!=null && vendedorAux.getId()!=null) {
				cobrardetallecobros.setid_vendedor(vendedorAux.getId());
				cobrardetallecobros.setvendedor_descripcion(CobrarDetalleCobrosConstantesFunciones.getVendedorDescripcion(vendedorAux));
				cobrardetallecobros.setVendedor(vendedorAux);			}
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

					if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { 
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_empresaCobrarDetalleCobros.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_empresaCobrarDetalleCobros.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { 
					}

					if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { 
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_paisCobrarDetalleCobros.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_paisCobrarDetalleCobros.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { 
					}

					if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCobrarDetalleCobros") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros.addItem(pais);
							}
						}

						if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { 
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_ciudadCobrarDetalleCobros.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_ciudadCobrarDetalleCobros.addItem(ciudad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { 
					}

					if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCobrarDetalleCobros") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jComboBoxid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros.addItem(ciudad);
							}
						}

						if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameZonasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingZona=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { 
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_zonaCobrarDetalleCobros.removeAllItems();

							for(Zona zona:this.zonasForeignKey) {
								this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_zonaCobrarDetalleCobros.addItem(zona);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { 
					}

					if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCobrarDetalleCobros") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.removeAllItems();

							for(Zona zona:this.zonasForeignKey) {
								this.jComboBoxid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.addItem(zona);
							}
						}

						if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameGrupoClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingGrupoCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { 
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_grupo_clienteCobrarDetalleCobros.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_grupo_clienteCobrarDetalleCobros.addItem(grupocliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { 
					}

					if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCobrarDetalleCobros") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jComboBoxid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros.addItem(grupocliente);
							}
						}

						if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameVendedorsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingVendedor=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { 
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_vendedorCobrarDetalleCobros.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_vendedorCobrarDetalleCobros.addItem(vendedor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { 
					}

					if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCobrarDetalleCobros") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jComboBoxid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros.addItem(vendedor);
							}
						}

						if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_empresaCobrarDetalleCobros.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_empresaCobrarDetalleCobros.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_paisCobrarDetalleCobros.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_paisCobrarDetalleCobros.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_ciudadCobrarDetalleCobros.setSelectedItem(ciudad);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_ciudadCobrarDetalleCobros.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedItem(ciudad);
						} else {
							this.jComboBoxid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameZonaForeignKey(Zona zona,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_zonaCobrarDetalleCobros.setSelectedItem(zona);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_zonaCobrarDetalleCobros.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedItem(zona);
						} else {
							this.jComboBoxid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameGrupoClienteForeignKey(GrupoCliente grupocliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_grupo_clienteCobrarDetalleCobros.setSelectedItem(grupocliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_grupo_clienteCobrarDetalleCobros.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedItem(grupocliente);
						} else {
							this.jComboBoxid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameVendedorForeignKey(Vendedor vendedor,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_vendedorCobrarDetalleCobros.setSelectedItem(vendedor);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_vendedorCobrarDetalleCobros.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedItem(vendedor);
						} else {
							this.jComboBoxid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCobrarDetalleCobros() throws Exception {
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
		
	public CobrarDetalleCobrosParameterReturnGeneral getCobrarDetalleCobrosParameterGeneral() {
		return this.cobrardetallecobrosParameterGeneral;
	}
	
	public void setCobrarDetalleCobrosParameterGeneral(CobrarDetalleCobrosParameterReturnGeneral cobrardetallecobrosParameterGeneral) {
		this.cobrardetallecobrosParameterGeneral = cobrardetallecobrosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCobrarDetalleCobros() {
		return isPermisoTodoCobrarDetalleCobros;
	}

	public void setIsPermisoTodoCobrarDetalleCobros(Boolean isPermisoTodoCobrarDetalleCobros) {
		this.isPermisoTodoCobrarDetalleCobros = isPermisoTodoCobrarDetalleCobros;
	}

	public Boolean getIsPermisoNuevoCobrarDetalleCobros() {
		return isPermisoNuevoCobrarDetalleCobros;
	}

	public void setIsPermisoNuevoCobrarDetalleCobros(Boolean isPermisoNuevoCobrarDetalleCobros) {
		this.isPermisoNuevoCobrarDetalleCobros = isPermisoNuevoCobrarDetalleCobros;
	}

	public Boolean getIsPermisoActualizarCobrarDetalleCobros() {
		return isPermisoActualizarCobrarDetalleCobros;
	}

	public void setIsPermisoActualizarCobrarDetalleCobros(Boolean isPermisoActualizarCobrarDetalleCobros) {
		this.isPermisoActualizarCobrarDetalleCobros = isPermisoActualizarCobrarDetalleCobros;
	}

	public Boolean getIsPermisoEliminarCobrarDetalleCobros() {
		return isPermisoEliminarCobrarDetalleCobros;
	}

	public void setIsPermisoEliminarCobrarDetalleCobros(Boolean isPermisoEliminarCobrarDetalleCobros) {
		this.isPermisoEliminarCobrarDetalleCobros = isPermisoEliminarCobrarDetalleCobros;
	}

	public Boolean getIsPermisoGuardarCambiosCobrarDetalleCobros() {
		return isPermisoGuardarCambiosCobrarDetalleCobros;
	}

	public void setIsPermisoGuardarCambiosCobrarDetalleCobros(Boolean isPermisoGuardarCambiosCobrarDetalleCobros) {
		this.isPermisoGuardarCambiosCobrarDetalleCobros = isPermisoGuardarCambiosCobrarDetalleCobros;
	}
	
	public Boolean getIsPermisoConsultaCobrarDetalleCobros() {
		return isPermisoConsultaCobrarDetalleCobros;
	}

	public void setIsPermisoConsultaCobrarDetalleCobros(Boolean isPermisoConsultaCobrarDetalleCobros) {
		this.isPermisoConsultaCobrarDetalleCobros = isPermisoConsultaCobrarDetalleCobros;
	}

	public Boolean getIsPermisoBusquedaCobrarDetalleCobros() {
		return isPermisoBusquedaCobrarDetalleCobros;
	}

	public void setIsPermisoBusquedaCobrarDetalleCobros(Boolean isPermisoBusquedaCobrarDetalleCobros) {
		this.isPermisoBusquedaCobrarDetalleCobros = isPermisoBusquedaCobrarDetalleCobros;
	}

	public Boolean getIsPermisoReporteCobrarDetalleCobros() {
		return isPermisoReporteCobrarDetalleCobros;
	}

	public void setIsPermisoReporteCobrarDetalleCobros(Boolean isPermisoReporteCobrarDetalleCobros) {
		this.isPermisoReporteCobrarDetalleCobros = isPermisoReporteCobrarDetalleCobros;
	}
	
	public Boolean getIsPermisoPaginacionMedioCobrarDetalleCobros() {
		return isPermisoPaginacionMedioCobrarDetalleCobros;
	}

	public void setIsPermisoPaginacionMedioCobrarDetalleCobros(Boolean isPermisoPaginacionMedioCobrarDetalleCobros) {
		this.isPermisoPaginacionMedioCobrarDetalleCobros = isPermisoPaginacionMedioCobrarDetalleCobros;
	}
	
	public Boolean getIsPermisoPaginacionTodoCobrarDetalleCobros() {
		return isPermisoPaginacionTodoCobrarDetalleCobros;
	}

	public void setIsPermisoPaginacionTodoCobrarDetalleCobros(Boolean isPermisoPaginacionTodoCobrarDetalleCobros) {
		this.isPermisoPaginacionTodoCobrarDetalleCobros = isPermisoPaginacionTodoCobrarDetalleCobros;
	}
	
	public Boolean getIsPermisoPaginacionAltoCobrarDetalleCobros() {
		return isPermisoPaginacionAltoCobrarDetalleCobros;
	}

	public void setIsPermisoPaginacionAltoCobrarDetalleCobros(Boolean isPermisoPaginacionAltoCobrarDetalleCobros) {
		this.isPermisoPaginacionAltoCobrarDetalleCobros = isPermisoPaginacionAltoCobrarDetalleCobros;
	}
	
	public Boolean getIsPermisoCopiarCobrarDetalleCobros() {
		return isPermisoCopiarCobrarDetalleCobros;
	}

	public void setIsPermisoCopiarCobrarDetalleCobros(Boolean isPermisoCopiarCobrarDetalleCobros) {
		this.isPermisoCopiarCobrarDetalleCobros = isPermisoCopiarCobrarDetalleCobros;
	}
	
	public Boolean getIsPermisoVerFormCobrarDetalleCobros() {
		return isPermisoVerFormCobrarDetalleCobros;
	}

	public void setIsPermisoVerFormCobrarDetalleCobros(Boolean isPermisoVerFormCobrarDetalleCobros) {
		this.isPermisoVerFormCobrarDetalleCobros = isPermisoVerFormCobrarDetalleCobros;
	}
	
	public Boolean getIsPermisoDuplicarCobrarDetalleCobros() {
		return isPermisoDuplicarCobrarDetalleCobros;
	}

	public void setIsPermisoDuplicarCobrarDetalleCobros(Boolean isPermisoDuplicarCobrarDetalleCobros) {
		this.isPermisoDuplicarCobrarDetalleCobros = isPermisoDuplicarCobrarDetalleCobros;
	}
	
	public Boolean getIsPermisoOrdenCobrarDetalleCobros() {
		return isPermisoOrdenCobrarDetalleCobros;
	}

	public void setIsPermisoOrdenCobrarDetalleCobros(Boolean isPermisoOrdenCobrarDetalleCobros) {
		this.isPermisoOrdenCobrarDetalleCobros = isPermisoOrdenCobrarDetalleCobros;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCobrarDetalleCobros() {
		return isVisibilidadCeldaNuevoCobrarDetalleCobros;
	}

	public void setIsVisibilidadCeldaNuevoCobrarDetalleCobros(Boolean isVisibilidadCeldaNuevoCobrarDetalleCobros) {
		this.isVisibilidadCeldaNuevoCobrarDetalleCobros = isVisibilidadCeldaNuevoCobrarDetalleCobros;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCobrarDetalleCobros() {
		return isVisibilidadCeldaDuplicarCobrarDetalleCobros;
	}

	public void setIsVisibilidadCeldaDuplicarCobrarDetalleCobros(Boolean isVisibilidadCeldaDuplicarCobrarDetalleCobros) {
		this.isVisibilidadCeldaDuplicarCobrarDetalleCobros = isVisibilidadCeldaDuplicarCobrarDetalleCobros;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCobrarDetalleCobros() {
		return isVisibilidadCeldaCopiarCobrarDetalleCobros;
	}

	public void setIsVisibilidadCeldaCopiarCobrarDetalleCobros(Boolean isVisibilidadCeldaCopiarCobrarDetalleCobros) {
		this.isVisibilidadCeldaCopiarCobrarDetalleCobros = isVisibilidadCeldaCopiarCobrarDetalleCobros;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCobrarDetalleCobros() {
		return isVisibilidadCeldaVerFormCobrarDetalleCobros;
	}

	public void setIsVisibilidadCeldaVerFormCobrarDetalleCobros(Boolean isVisibilidadCeldaVerFormCobrarDetalleCobros) {
		this.isVisibilidadCeldaVerFormCobrarDetalleCobros = isVisibilidadCeldaVerFormCobrarDetalleCobros;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCobrarDetalleCobros() {
		return isVisibilidadCeldaOrdenCobrarDetalleCobros;
	}

	public void setIsVisibilidadCeldaOrdenCobrarDetalleCobros(Boolean isVisibilidadCeldaOrdenCobrarDetalleCobros) {
		this.isVisibilidadCeldaOrdenCobrarDetalleCobros = isVisibilidadCeldaOrdenCobrarDetalleCobros;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros() {
		return isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros(Boolean isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros) {
		this.isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros = isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCobrarDetalleCobros() {
		return isVisibilidadCeldaModificarCobrarDetalleCobros;
	}

	public void setIsVisibilidadCeldaModificarCobrarDetalleCobros(Boolean isVisibilidadCeldaModificarCobrarDetalleCobros) {
		this.isVisibilidadCeldaModificarCobrarDetalleCobros = isVisibilidadCeldaModificarCobrarDetalleCobros;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCobrarDetalleCobros() {
		return isVisibilidadCeldaActualizarCobrarDetalleCobros;
	}

	public void setIsVisibilidadCeldaActualizarCobrarDetalleCobros(Boolean isVisibilidadCeldaActualizarCobrarDetalleCobros) {
		this.isVisibilidadCeldaActualizarCobrarDetalleCobros = isVisibilidadCeldaActualizarCobrarDetalleCobros;
	}

	public Boolean getIsVisibilidadCeldaEliminarCobrarDetalleCobros() {
		return isVisibilidadCeldaEliminarCobrarDetalleCobros;
	}

	public void setIsVisibilidadCeldaEliminarCobrarDetalleCobros(Boolean isVisibilidadCeldaEliminarCobrarDetalleCobros) {
		this.isVisibilidadCeldaEliminarCobrarDetalleCobros = isVisibilidadCeldaEliminarCobrarDetalleCobros;
	}

	public Boolean getIsVisibilidadCeldaCancelarCobrarDetalleCobros() {
		return isVisibilidadCeldaCancelarCobrarDetalleCobros;
	}

	public void setIsVisibilidadCeldaCancelarCobrarDetalleCobros(Boolean isVisibilidadCeldaCancelarCobrarDetalleCobros) {
		this.isVisibilidadCeldaCancelarCobrarDetalleCobros = isVisibilidadCeldaCancelarCobrarDetalleCobros;
	}

	public Boolean getIsVisibilidadCeldaGuardarCobrarDetalleCobros() {
		return isVisibilidadCeldaGuardarCobrarDetalleCobros;
	}

	public void setIsVisibilidadCeldaGuardarCobrarDetalleCobros(Boolean isVisibilidadCeldaGuardarCobrarDetalleCobros) {
		this.isVisibilidadCeldaGuardarCobrarDetalleCobros = isVisibilidadCeldaGuardarCobrarDetalleCobros;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCobrarDetalleCobros() {
		return isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCobrarDetalleCobros(Boolean isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros) {
		this.isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros = isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros;
	}
		
	public CobrarDetalleCobrosSessionBean getcobrardetallecobrosSessionBean() {
		return this.cobrardetallecobrosSessionBean;
	}
	
	public void setcobrardetallecobrosSessionBean(CobrarDetalleCobrosSessionBean cobrardetallecobrosSessionBean) {
		this.cobrardetallecobrosSessionBean=cobrardetallecobrosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaCobrarDetalleCobros() {
		return this.isVisibilidadBusquedaCobrarDetalleCobros;
	}

	public void setisVisibilidadBusquedaCobrarDetalleCobros(Boolean isVisibilidadBusquedaCobrarDetalleCobros) {
		this.isVisibilidadBusquedaCobrarDetalleCobros=isVisibilidadBusquedaCobrarDetalleCobros;
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

	public Boolean getisVisibilidadFK_IdGrupoCliente() {
		return this.isVisibilidadFK_IdGrupoCliente;
	}

	public void setisVisibilidadFK_IdGrupoCliente(Boolean isVisibilidadFK_IdGrupoCliente) {
		this.isVisibilidadFK_IdGrupoCliente=isVisibilidadFK_IdGrupoCliente;
	}

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	public Boolean getisVisibilidadFK_IdVendedor() {
		return this.isVisibilidadFK_IdVendedor;
	}

	public void setisVisibilidadFK_IdVendedor(Boolean isVisibilidadFK_IdVendedor) {
		this.isVisibilidadFK_IdVendedor=isVisibilidadFK_IdVendedor;
	}

	public Boolean getisVisibilidadFK_IdZona() {
		return this.isVisibilidadFK_IdZona;
	}

	public void setisVisibilidadFK_IdZona(Boolean isVisibilidadFK_IdZona) {
		this.isVisibilidadFK_IdZona=isVisibilidadFK_IdZona;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(CobrarDetalleCobros cobrardetallecobros)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cobrardetallecobros,null);
				this.setActualParaGuardarPaisForeignKey(cobrardetallecobros,null);
				this.setActualParaGuardarCiudadForeignKey(cobrardetallecobros,null);
				this.setActualParaGuardarZonaForeignKey(cobrardetallecobros,null);
				this.setActualParaGuardarGrupoClienteForeignKey(cobrardetallecobros,null);
				this.setActualParaGuardarVendedorForeignKey(cobrardetallecobros,null);
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
	
	public void bugActualizarReferenciaActual(CobrarDetalleCobros cobrardetallecobros,CobrarDetalleCobros cobrardetallecobrosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCobrarDetalleCobros(cobrardetallecobros);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cobrardetallecobrosAux.setId(cobrardetallecobros.getId());
		cobrardetallecobrosAux.setVersionRow(cobrardetallecobros.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(CobrarDetalleCobros cobrardetallecobrosLocal) throws Exception {
		
		if(this.cobrardetallecobrosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CobrarDetalleCobros cobrardetallecobrosLocal) throws Exception {	
		if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cobrardetallecobrosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				cobrardetallecobrosLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CiudadDetalleFormJInternalFrame.class)) {
				CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrameLocal=(CiudadBeanSwingJInternalFrame) ((CiudadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ciudadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCiudad(ciudadBeanSwingJInternalFrameLocal.getciudad(),true);
				ciudadBeanSwingJInternalFrameLocal.actualizarLista(ciudadBeanSwingJInternalFrameLocal.ciudad,this.ciudadsForeignKey);

				ciudadBeanSwingJInternalFrameLocal.actualizarRelaciones(ciudadBeanSwingJInternalFrameLocal.ciudad);

				cobrardetallecobrosLocal.setCiudad(ciudadBeanSwingJInternalFrameLocal.ciudad);

				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey("Formulario");
				this.setActualCiudadForeignKey(ciudadBeanSwingJInternalFrameLocal.ciudad.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ZonaDetalleFormJInternalFrame.class)) {
				ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrameLocal=(ZonaBeanSwingJInternalFrame) ((ZonaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				zonaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoZona(zonaBeanSwingJInternalFrameLocal.getzona(),true);
				zonaBeanSwingJInternalFrameLocal.actualizarLista(zonaBeanSwingJInternalFrameLocal.zona,this.zonasForeignKey);

				zonaBeanSwingJInternalFrameLocal.actualizarRelaciones(zonaBeanSwingJInternalFrameLocal.zona);

				cobrardetallecobrosLocal.setZona(zonaBeanSwingJInternalFrameLocal.zona);

				this.addItemDefectoCombosForeignKeyZona();
				this.cargarCombosFrameZonasForeignKey("Formulario");
				this.setActualZonaForeignKey(zonaBeanSwingJInternalFrameLocal.zona.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(GrupoClienteDetalleFormJInternalFrame.class)) {
				GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrameLocal=(GrupoClienteBeanSwingJInternalFrame) ((GrupoClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				grupoclienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.getgrupocliente(),true);
				grupoclienteBeanSwingJInternalFrameLocal.actualizarLista(grupoclienteBeanSwingJInternalFrameLocal.grupocliente,this.grupoclientesForeignKey);

				grupoclienteBeanSwingJInternalFrameLocal.actualizarRelaciones(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				cobrardetallecobrosLocal.setGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				this.addItemDefectoCombosForeignKeyGrupoCliente();
				this.cargarCombosFrameGrupoClientesForeignKey("Formulario");
				this.setActualGrupoClienteForeignKey(grupoclienteBeanSwingJInternalFrameLocal.grupocliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(VendedorDetalleFormJInternalFrame.class)) {
				VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrameLocal=(VendedorBeanSwingJInternalFrame) ((VendedorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				vendedorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoVendedor(vendedorBeanSwingJInternalFrameLocal.getvendedor(),true);
				vendedorBeanSwingJInternalFrameLocal.actualizarLista(vendedorBeanSwingJInternalFrameLocal.vendedor,this.vendedorsForeignKey);

				vendedorBeanSwingJInternalFrameLocal.actualizarRelaciones(vendedorBeanSwingJInternalFrameLocal.vendedor);

				cobrardetallecobrosLocal.setVendedor(vendedorBeanSwingJInternalFrameLocal.vendedor);

				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey("Formulario");
				this.setActualVendedorForeignKey(vendedorBeanSwingJInternalFrameLocal.vendedor.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCobrarDetalleCobrosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cobrardetallecobrosValidator.getInvalidValues(this.cobrardetallecobros);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CobrarDetalleCobros cobrardetallecobros,List<CobrarDetalleCobros> cobrardetallecobross) throws Exception {
	}		
	
	public void actualizarSelectedLista(CobrarDetalleCobros cobrardetallecobros,List<CobrarDetalleCobros> cobrardetallecobross) throws Exception {
		try	{			
			CobrarDetalleCobrosConstantesFunciones.actualizarSelectedLista(cobrardetallecobros,cobrardetallecobross);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CobrarDetalleCobros> cobrardetallecobrossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cobrardetallecobrossLocal=this.cobrardetallecobrosLogic.getCobrarDetalleCobross();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cobrardetallecobrossLocal=this.cobrardetallecobross;
			}
			//ARCHITECTURE
		
			for(CobrarDetalleCobros cobrardetallecobrosLocal:cobrardetallecobrossLocal) {
				if(this.permiteMantenimiento(cobrardetallecobrosLocal) && cobrardetallecobrosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CobrarDetalleCobrosConstantesFunciones.getCobrarDetalleCobrosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CobrarDetalleCobrosConstantesFunciones.NOMBREVENDEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelnombre_vendedorCobrarDetalleCobros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarDetalleCobrosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelcodigoCobrarDetalleCobros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarDetalleCobrosConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelnombreCobrarDetalleCobros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarDetalleCobrosConstantesFunciones.APELLIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelapellidoCobrarDetalleCobros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarDetalleCobrosConstantesFunciones.TOTALFACTURAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabeltotal_facturasCobrarDetalleCobros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarDetalleCobrosConstantesFunciones.TOTALABONOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabeltotal_abonosCobrarDetalleCobros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarDetalleCobrosConstantesFunciones.TOTALFACTURASACTUAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabeltotal_facturas_actualCobrarDetalleCobros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarDetalleCobrosConstantesFunciones.ABONOSANTERIOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelabonos_anteriorCobrarDetalleCobros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarDetalleCobrosConstantesFunciones.ABONOSACTUAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelabonos_actualCobrarDetalleCobros,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelnombre_vendedorCobrarDetalleCobros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelcodigoCobrarDetalleCobros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelnombreCobrarDetalleCobros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelapellidoCobrarDetalleCobros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabeltotal_facturasCobrarDetalleCobros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabeltotal_abonosCobrarDetalleCobros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabeltotal_facturas_actualCobrarDetalleCobros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelabonos_anteriorCobrarDetalleCobros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelabonos_actualCobrarDetalleCobros,"");
		
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
		this.iIdNuevoCobrarDetalleCobros--;	
		
		
		this.cobrardetallecobrosAux=new CobrarDetalleCobros();
		
		this.cobrardetallecobrosAux.setId(this.iIdNuevoCobrarDetalleCobros);
		this.cobrardetallecobrosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrardetallecobrosLogic.getCobrarDetalleCobross().add(this.cobrardetallecobrosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cobrardetallecobross.add(this.cobrardetallecobrosAux);
		}
		//ARCHITECTURE
		
		this.cobrardetallecobros=this.cobrardetallecobrosAux;
		
		if(CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCobrarDetalleCobros(this.cobrardetallecobros);
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarDetalleCobros(this.cobrardetallecobros);
		}
				
		//this.setDefaultControlesCobrarDetalleCobros();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCobrarDetalleCobros();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCobrarDetalleCobros();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarDetalleCobros();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarDetalleCobros(this.cobrardetallecobrosBean,this.cobrardetallecobros,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCobrarDetalleCobros(this.cobrardetallecobrosReturnGeneral,this.cobrardetallecobrosBean,false);
		
		if(this.cobrardetallecobrosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarDetalleCobros(this.cobrardetallecobrosReturnGeneral.getCobrarDetalleCobros());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCobrarDetalleCobros(this.cobrardetallecobrosReturnGeneral.getCobrarDetalleCobros());
		}
		
		if(this.cobrardetallecobrosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCobrarDetalleCobros(this.cobrardetallecobrosReturnGeneral.getCobrarDetalleCobros(),classes);//this.cobrardetallecobrosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCobrarDetalleCobros();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCobrarDetalleCobros();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.RecargarFormCobrarDetalleCobros(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCobrarDetalleCobros(false);
						
			if(cobrardetallecobrosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarDetalleCobros();
			}
			
			this.actualizarVisualTableDatosCobrarDetalleCobros();
			
			this.jTableDatosCobrarDetalleCobros.setRowSelectionInterval(this.getIndiceNuevoCobrarDetalleCobros(), this.getIndiceNuevoCobrarDetalleCobros());
			
			this.seleccionarFilaTablaCobrarDetalleCobrosActual();
						
			this.actualizarEstadoCeldasBotonesCobrarDetalleCobros("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCobrarDetalleCobros(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jDateChooserfecha_emisionCobrarDetalleCobros.setEnabled(isHabilitar && this.cobrardetallecobrosConstantesFunciones.activarfecha_emisionCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jDateChooserfecha_emision_hastaCobrarDetalleCobros.setEnabled(isHabilitar && this.cobrardetallecobrosConstantesFunciones.activarfecha_emision_hastaCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreanombre_vendedorCobrarDetalleCobros.setEnabled(isHabilitar && this.cobrardetallecobrosConstantesFunciones.activarnombre_vendedorCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldcodigoCobrarDetalleCobros.setEnabled(isHabilitar && this.cobrardetallecobrosConstantesFunciones.activarcodigoCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreanombreCobrarDetalleCobros.setEnabled(isHabilitar && this.cobrardetallecobrosConstantesFunciones.activarnombreCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreaapellidoCobrarDetalleCobros.setEnabled(isHabilitar && this.cobrardetallecobrosConstantesFunciones.activarapellidoCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_facturasCobrarDetalleCobros.setEnabled(isHabilitar && this.cobrardetallecobrosConstantesFunciones.activartotal_facturasCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_abonosCobrarDetalleCobros.setEnabled(isHabilitar && this.cobrardetallecobrosConstantesFunciones.activartotal_abonosCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_facturas_actualCobrarDetalleCobros.setEnabled(isHabilitar && this.cobrardetallecobrosConstantesFunciones.activartotal_facturas_actualCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldabonos_anteriorCobrarDetalleCobros.setEnabled(isHabilitar && this.cobrardetallecobrosConstantesFunciones.activarabonos_anteriorCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldabonos_actualCobrarDetalleCobros.setEnabled(isHabilitar && this.cobrardetallecobrosConstantesFunciones.activarabonos_actualCobrarDetalleCobros);	
		//
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_empresaCobrarDetalleCobros.setEnabled(isHabilitar && this.cobrardetallecobrosConstantesFunciones.activarid_empresaCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_paisCobrarDetalleCobros.setEnabled(isHabilitar && this.cobrardetallecobrosConstantesFunciones.activarid_paisCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_ciudadCobrarDetalleCobros.setEnabled(isHabilitar && this.cobrardetallecobrosConstantesFunciones.activarid_ciudadCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_zonaCobrarDetalleCobros.setEnabled(isHabilitar && this.cobrardetallecobrosConstantesFunciones.activarid_zonaCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_grupo_clienteCobrarDetalleCobros.setEnabled(isHabilitar && this.cobrardetallecobrosConstantesFunciones.activarid_grupo_clienteCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_vendedorCobrarDetalleCobros.setEnabled(isHabilitar && this.cobrardetallecobrosConstantesFunciones.activarid_vendedorCobrarDetalleCobros);
	};
	
	public void setDefaultControlesCobrarDetalleCobros() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCobrarDetalleCobros(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cobrardetallecobrosSessionBean.setConGuardarRelaciones(true);			
			this.cobrardetallecobrosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTabbedPaneRelacionesCobrarDetalleCobros.setVisible(true);
			
					
		} else {
			//this.cobrardetallecobrosSessionBean.setConGuardarRelaciones(false);			
			this.cobrardetallecobrosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTabbedPaneRelacionesCobrarDetalleCobros.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCobrarDetalleCobros() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarDetalleCobros cobrardetallecobrosAux:this.cobrardetallecobrosLogic.getCobrarDetalleCobross()) {
				if(cobrardetallecobrosAux.getId().equals(this.iIdNuevoCobrarDetalleCobros)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarDetalleCobros cobrardetallecobrosAux:this.cobrardetallecobross) {
				if(cobrardetallecobrosAux.getId().equals(this.iIdNuevoCobrarDetalleCobros)) {
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
	
	public int getIndiceActualCobrarDetalleCobros(CobrarDetalleCobros cobrardetallecobros,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarDetalleCobros cobrardetallecobrosAux:this.cobrardetallecobrosLogic.getCobrarDetalleCobross()) {
				if(cobrardetallecobrosAux.getId().equals(cobrardetallecobros.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarDetalleCobros cobrardetallecobrosAux:this.cobrardetallecobross) {
				if(cobrardetallecobrosAux.getId().equals(cobrardetallecobros.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCobrarDetalleCobros(CobrarDetalleCobros cobrardetallecobrosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarDetalleCobros cobrardetallecobrosAux:this.cobrardetallecobrosLogic.getCobrarDetalleCobross()) {
				if(cobrardetallecobrosAux.getCobrarDetalleCobrosOriginal().getId().equals(cobrardetallecobrosOriginal.getId())) {
					existe=true;
					cobrardetallecobrosOriginal.setId(cobrardetallecobrosAux.getId());
					cobrardetallecobrosOriginal.setVersionRow(cobrardetallecobrosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarDetalleCobros cobrardetallecobrosAux:this.cobrardetallecobross) {
				if(cobrardetallecobrosAux.getCobrarDetalleCobrosOriginal().getId().equals(cobrardetallecobrosOriginal.getId())) {
					existe=true;
					cobrardetallecobrosOriginal.setId(cobrardetallecobrosAux.getId());
					cobrardetallecobrosOriginal.setVersionRow(cobrardetallecobrosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCobrarDetalleCobros(Boolean esParaCancelar) throws Exception {
		cobrardetallecobrossAux=new ArrayList<CobrarDetalleCobros>();
		cobrardetallecobrosAux=new CobrarDetalleCobros();
		
		if(!this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarDetalleCobros cobrardetallecobrosAux:this.cobrardetallecobrosLogic.getCobrarDetalleCobross()) {
					if(cobrardetallecobrosAux.getId()<0) {
						cobrardetallecobrossAux.add(cobrardetallecobrosAux);
					}		
				}
				this.iIdNuevoCobrarDetalleCobros=0L;
				this.cobrardetallecobrosLogic.getCobrarDetalleCobross().removeAll(cobrardetallecobrossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarDetalleCobros cobrardetallecobrosAux:this.cobrardetallecobross) {
					if(cobrardetallecobrosAux.getId()<0) {
						cobrardetallecobrossAux.add(cobrardetallecobrosAux);
					}		
				}
				this.iIdNuevoCobrarDetalleCobros=0L;
				this.cobrardetallecobross.removeAll(cobrardetallecobrossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCobrarDetalleCobros 
					&& this.cobrardetallecobrosLogic.getCobrarDetalleCobross().size()>0
					) {
					cobrardetallecobrosAux=this.cobrardetallecobrosLogic.getCobrarDetalleCobross().get(this.cobrardetallecobrosLogic.getCobrarDetalleCobross().size() - 1);
				
					if(cobrardetallecobrosAux.getId()<0) {
						this.cobrardetallecobrosLogic.getCobrarDetalleCobross().remove(cobrardetallecobrosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCobrarDetalleCobros && this.cobrardetallecobross.size()>0) {
					cobrardetallecobrosAux=this.cobrardetallecobross.get(this.cobrardetallecobross.size() - 1);
				
					if(cobrardetallecobrosAux.getId()<0) {
						this.cobrardetallecobross.remove(cobrardetallecobrosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCobrarDetalleCobros(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cobrardetallecobros.getId()<0) {
				this.cobrardetallecobrosLogic.getCobrarDetalleCobross().remove(this.cobrardetallecobros);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cobrardetallecobros.getId()<0) {
				this.cobrardetallecobross.remove(this.cobrardetallecobros);
			}
		}			
	}
	
	public void setEstadosInicialesCobrarDetalleCobros(List<CobrarDetalleCobros> cobrardetallecobrossAux) throws Exception {
		CobrarDetalleCobrosConstantesFunciones.setEstadosInicialesCobrarDetalleCobros(cobrardetallecobrossAux);
	}
	
	public void setEstadosInicialesCobrarDetalleCobros(CobrarDetalleCobros cobrardetallecobrosAux) throws Exception {
		CobrarDetalleCobrosConstantesFunciones.setEstadosInicialesCobrarDetalleCobros(cobrardetallecobrosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCobrarDetalleCobrosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCobrarDetalleCobros("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCobrarDetalleCobrosActual()) {
				if(!this.isEsNuevoCobrarDetalleCobros) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCobrarDetalleCobros("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCobrarDetalleCobros=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCobrarDetalleCobrosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cobrar Detalle Cobros ?", "MANTENIMIENTO DE Cobrar Detalle Cobros", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCobrarDetalleCobros("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CobrarDetalleCobros cobrardetallecobros) throws Exception {
		CobrarDetalleCobrosConstantesFunciones.seleccionarAsignar(this.cobrardetallecobros,cobrardetallecobros);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCobrarDetalleCobros=this.isPermisoActualizarOriginalCobrarDetalleCobros;
			
			
			this.seleccionarAsignar(cobrardetallecobros);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesCobrarDetalleCobros("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cobrardetallecobrosSessionBean.setsFuncionBusquedaRapida(this.cobrardetallecobrosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCobrarDetalleCobros) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCobrarDetalleCobros(esParaCancelar);				
				this.cancelarNuevoCobrarDetalleCobros(esParaCancelar);								
			}
			
			this.cobrardetallecobros=new CobrarDetalleCobros();
			
			this.inicializarCobrarDetalleCobros();
			
			this.actualizarEstadoCeldasBotonesCobrarDetalleCobros("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCobrarDetalleCobros() throws Exception {
		try {
			CobrarDetalleCobrosConstantesFunciones.inicializarCobrarDetalleCobros(this.cobrardetallecobros);
			
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
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cobrardetallecobrosLogic.getCobrarDetalleCobross().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCobrarDetalleCobross(String sAccionBusqueda,List<CobrarDetalleCobros> cobrardetallecobrossParaReportes) throws Exception {
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
					sPathReporteFinal="CobrarDetalleCobros"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CobrarDetalleCobrosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CobrarDetalleCobrosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CobrarDetalleCobros"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cobrar Detalle Cobroses");		
		parameters.put("busquedapor", CobrarDetalleCobrosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCobrarDetalleCobros=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CobrarDetalleCobrosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CobrarDetalleCobrosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCobrarDetalleCobros=new JRBeanArrayDataSource(CobrarDetalleCobrosJInternalFrame.TraerCobrarDetalleCobrosBeans(cobrardetallecobrossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCobrarDetalleCobros);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CobrarDetalleCobrosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CobrarDetalleCobrosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CobrarDetalleCobrosBean.TraerCobrarDetalleCobrosBeans(cobrardetallecobrossParaReportes).toArray()));
							
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
				this.generarExcelReporteCobrarDetalleCobross(sAccionBusqueda,sTipoArchivoReporte,cobrardetallecobrossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCobrarDetalleCobross(sAccionBusqueda,sTipoArchivoReporte,cobrardetallecobrossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCobrarDetalleCobrosActionPerformed(null);
					//this.generarExcelReporteCobrarDetalleCobross(sAccionBusqueda,sTipoArchivoReporte,cobrardetallecobrossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCobrarDetalleCobross(sAccionBusqueda,sTipoArchivoReporte,cobrardetallecobrossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCobrarDetalleCobross(sAccionBusqueda,sTipoArchivoReporte,cobrardetallecobrossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCobrarDetalleCobross(sAccionBusqueda,sTipoArchivoReporte,cobrardetallecobrossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCobrarDetalleCobross(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarDetalleCobros> cobrardetallecobrossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrardetallecobros";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarDetalleCobross");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarDetalleCobros("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CobrarDetalleCobros cobrardetallecobros : cobrardetallecobrossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CobrarDetalleCobrosConstantesFunciones.generarExcelReporteDataCobrarDetalleCobros("NORMAL",row,workbook,cobrardetallecobros,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Detalle Cobros",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCobrarDetalleCobros(String sTipo,Row row,Workbook workbook) {
		
		CobrarDetalleCobrosConstantesFunciones.generarExcelReporteHeaderCobrarDetalleCobros(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCobrarDetalleCobross(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarDetalleCobros> cobrardetallecobrossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrardetallecobros_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarDetalleCobross");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CobrarDetalleCobros cobrardetallecobros : cobrardetallecobrossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.getCobrarDetalleCobrosDescripcion(cobrardetallecobros));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarDetalleCobrosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrardetallecobros.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarDetalleCobrosConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrardetallecobros.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarDetalleCobrosConstantesFunciones.LABEL_IDCIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_IDCIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrardetallecobros.getciudad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarDetalleCobrosConstantesFunciones.LABEL_IDZONA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_IDZONA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrardetallecobros.getzona_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarDetalleCobrosConstantesFunciones.LABEL_IDGRUPOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrardetallecobros.getgrupocliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarDetalleCobrosConstantesFunciones.LABEL_IDVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_IDVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrardetallecobros.getvendedor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrardetallecobros.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrardetallecobros.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBREVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBREVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrardetallecobros.getnombre_vendedor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarDetalleCobrosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrardetallecobros.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrardetallecobros.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarDetalleCobrosConstantesFunciones.LABEL_APELLIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_APELLIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrardetallecobros.getapellido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrardetallecobros.gettotal_facturas());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALABONOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALABONOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrardetallecobros.gettotal_abonos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURASACTUAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURASACTUAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrardetallecobros.gettotal_facturas_actual());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSANTERIOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSANTERIOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrardetallecobros.getabonos_anterior());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSACTUAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSACTUAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrardetallecobros.getabonos_actual());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Detalle Cobros",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCobrarDetalleCobross(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarDetalleCobros> cobrardetallecobrossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CobrarDetalleCobros> cobrardetallecobrossRespaldo=null;
		
		classes=CobrarDetalleCobrosConstantesFunciones.getClassesRelationshipsOfCobrarDetalleCobros(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cobrardetallecobrosLogic.setDatosCliente(this.datosCliente);
		this.cobrardetallecobrosLogic.setDatosDeep(this.datosDeep);
		this.cobrardetallecobrosLogic.setIsConDeep(true);
		
		cobrardetallecobrossRespaldo=this.cobrardetallecobrosLogic.getCobrarDetalleCobross();
		
		this.cobrardetallecobrosLogic.setCobrarDetalleCobross(cobrardetallecobrossParaReportes);	
		this.cobrardetallecobrosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cobrardetallecobrossParaReportes=this.cobrardetallecobrosLogic.getCobrarDetalleCobross();
		this.cobrardetallecobrosLogic.setCobrarDetalleCobross(cobrardetallecobrossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrardetallecobros_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarDetalleCobross");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarDetalleCobros("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CobrarDetalleCobros cobrardetallecobros : cobrardetallecobrossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCobrarDetalleCobros("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CobrarDetalleCobrosConstantesFunciones.generarExcelReporteDataCobrarDetalleCobros("NORMAL",row,workbook,cobrardetallecobros,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.getCobrarDetalleCobrosDescripcion(cobrardetallecobros));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Detalle Cobros",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCobrarDetalleCobros() throws Exception {		
		this.startProcessCobrarDetalleCobros(true);
	}
	
	public void startProcessCobrarDetalleCobros(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCobrarDetalleCobros ,this.jPanelParametrosReportesCobrarDetalleCobros, this.jScrollPanelDatosCobrarDetalleCobros,this.jPanelPaginacionCobrarDetalleCobros, this.jScrollPanelDatosEdicionCobrarDetalleCobros, this.jPanelAccionesCobrarDetalleCobros,this.jPanelAccionesFormularioCobrarDetalleCobros,this.jmenuBarCobrarDetalleCobros,this.jmenuBarDetalleCobrarDetalleCobros,this.jTtoolBarCobrarDetalleCobros,this.jTtoolBarDetalleCobrarDetalleCobros);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarDetalleCobros=this.jTabbedPaneBusquedasCobrarDetalleCobros; 
		
		final JPanel jPanelParametrosReportesCobrarDetalleCobros=this.jPanelParametrosReportesCobrarDetalleCobros;
		//final JScrollPane jScrollPanelDatosCobrarDetalleCobros=this.jScrollPanelDatosCobrarDetalleCobros;
		final JTable jTableDatosCobrarDetalleCobros=this.jTableDatosCobrarDetalleCobros;		
		final JPanel jPanelPaginacionCobrarDetalleCobros=this.jPanelPaginacionCobrarDetalleCobros;
		//final JScrollPane jScrollPanelDatosEdicionCobrarDetalleCobros=this.jScrollPanelDatosEdicionCobrarDetalleCobros;
		final JPanel jPanelAccionesCobrarDetalleCobros=this.jPanelAccionesCobrarDetalleCobros;
		
		JPanel jPanelCamposAuxiliarCobrarDetalleCobros=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCobrarDetalleCobros=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
			jPanelCamposAuxiliarCobrarDetalleCobros=this.jInternalFrameDetalleFormCobrarDetalleCobros.jPanelCamposCobrarDetalleCobros;
			jPanelAccionesFormularioAuxiliarCobrarDetalleCobros=this.jInternalFrameDetalleFormCobrarDetalleCobros.jPanelAccionesFormularioCobrarDetalleCobros;
		}
		
		final JPanel jPanelCamposCobrarDetalleCobros=jPanelCamposAuxiliarCobrarDetalleCobros;
		final JPanel jPanelAccionesFormularioCobrarDetalleCobros=jPanelAccionesFormularioAuxiliarCobrarDetalleCobros;
		
		
		final JMenuBar jmenuBarCobrarDetalleCobros=this.jmenuBarCobrarDetalleCobros;
		final JToolBar jTtoolBarCobrarDetalleCobros=this.jTtoolBarCobrarDetalleCobros;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCobrarDetalleCobros=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarDetalleCobros=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
			jmenuBarDetalleAuxiliarCobrarDetalleCobros=this.jInternalFrameDetalleFormCobrarDetalleCobros.jmenuBarDetalleCobrarDetalleCobros;
			jTtoolBarDetalleAuxiliarCobrarDetalleCobros=this.jInternalFrameDetalleFormCobrarDetalleCobros.jTtoolBarDetalleCobrarDetalleCobros;
		}
		
		final JMenuBar jmenuBarDetalleCobrarDetalleCobros=jmenuBarDetalleAuxiliarCobrarDetalleCobros;
		final JToolBar jTtoolBarDetalleCobrarDetalleCobros=jTtoolBarDetalleAuxiliarCobrarDetalleCobros;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarDetalleCobros;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarDetalleCobros;
			processRunnable.jTableDatos=jTableDatosCobrarDetalleCobros;
			processRunnable.jPanelCampos=jPanelCamposCobrarDetalleCobros;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarDetalleCobros;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarDetalleCobros;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarDetalleCobros;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarDetalleCobros;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarDetalleCobros;
			processRunnable.jTtoolBar=jTtoolBarCobrarDetalleCobros;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarDetalleCobros;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarDetalleCobros ,jPanelParametrosReportesCobrarDetalleCobros,jTableDatosCobrarDetalleCobros, /*jScrollPanelDatosCobrarDetalleCobros,*/jPanelCamposCobrarDetalleCobros,jPanelPaginacionCobrarDetalleCobros, /*jScrollPanelDatosEdicionCobrarDetalleCobros,*/ jPanelAccionesCobrarDetalleCobros,jPanelAccionesFormularioCobrarDetalleCobros,jmenuBarCobrarDetalleCobros,jmenuBarDetalleCobrarDetalleCobros,jTtoolBarCobrarDetalleCobros,jTtoolBarDetalleCobrarDetalleCobros);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarDetalleCobros ,jPanelParametrosReportesCobrarDetalleCobros, jScrollPanelDatosCobrarDetalleCobros,jPanelPaginacionCobrarDetalleCobros, jScrollPanelDatosEdicionCobrarDetalleCobros, jPanelAccionesCobrarDetalleCobros,jPanelAccionesFormularioCobrarDetalleCobros,jmenuBarCobrarDetalleCobros,jmenuBarDetalleCobrarDetalleCobros,jTtoolBarCobrarDetalleCobros,jTtoolBarDetalleCobrarDetalleCobros);
						
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
	
	public void finishProcessCobrarDetalleCobros() {// throws Exception 
		this.finishProcessCobrarDetalleCobros(true);
	}
	
	public void finishProcessCobrarDetalleCobros(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCobrarDetalleCobros ,this.jPanelParametrosReportesCobrarDetalleCobros, this.jScrollPanelDatosCobrarDetalleCobros,this.jPanelPaginacionCobrarDetalleCobros, this.jScrollPanelDatosEdicionCobrarDetalleCobros, this.jPanelAccionesCobrarDetalleCobros,this.jPanelAccionesFormularioCobrarDetalleCobros,this.jmenuBarCobrarDetalleCobros,this.jmenuBarDetalleCobrarDetalleCobros,this.jTtoolBarCobrarDetalleCobros,this.jTtoolBarDetalleCobrarDetalleCobros);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarDetalleCobros=this.jTabbedPaneBusquedasCobrarDetalleCobros; 
		
		final JPanel jPanelParametrosReportesCobrarDetalleCobros=this.jPanelParametrosReportesCobrarDetalleCobros;
		//final JScrollPane jScrollPanelDatosCobrarDetalleCobros=this.jScrollPanelDatosCobrarDetalleCobros;
		final JTable jTableDatosCobrarDetalleCobros=this.jTableDatosCobrarDetalleCobros;		
		final JPanel jPanelPaginacionCobrarDetalleCobros=this.jPanelPaginacionCobrarDetalleCobros;
		//final JScrollPane jScrollPanelDatosEdicionCobrarDetalleCobros=this.jScrollPanelDatosEdicionCobrarDetalleCobros;
		final JPanel jPanelAccionesCobrarDetalleCobros=this.jPanelAccionesCobrarDetalleCobros;
		
		JPanel jPanelCamposAuxiliarCobrarDetalleCobros=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCobrarDetalleCobros=new JPanel();
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
			jPanelCamposAuxiliarCobrarDetalleCobros=this.jInternalFrameDetalleFormCobrarDetalleCobros.jPanelCamposCobrarDetalleCobros;
			jPanelAccionesFormularioAuxiliarCobrarDetalleCobros=this.jInternalFrameDetalleFormCobrarDetalleCobros.jPanelAccionesFormularioCobrarDetalleCobros;
		}
		
		final JPanel jPanelCamposCobrarDetalleCobros=jPanelCamposAuxiliarCobrarDetalleCobros;
		final JPanel jPanelAccionesFormularioCobrarDetalleCobros=jPanelAccionesFormularioAuxiliarCobrarDetalleCobros;
		
		
		final JMenuBar jmenuBarCobrarDetalleCobros=this.jmenuBarCobrarDetalleCobros;		
		final JToolBar jTtoolBarCobrarDetalleCobros=this.jTtoolBarCobrarDetalleCobros;
				
		JMenuBar jmenuBarDetalleAuxiliarCobrarDetalleCobros=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarDetalleCobros=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
			jmenuBarDetalleAuxiliarCobrarDetalleCobros=this.jInternalFrameDetalleFormCobrarDetalleCobros.jmenuBarDetalleCobrarDetalleCobros;
			jTtoolBarDetalleAuxiliarCobrarDetalleCobros=this.jInternalFrameDetalleFormCobrarDetalleCobros.jTtoolBarDetalleCobrarDetalleCobros;		
		}
		
		final JMenuBar jmenuBarDetalleCobrarDetalleCobros=jmenuBarDetalleAuxiliarCobrarDetalleCobros;
		final JToolBar jTtoolBarDetalleCobrarDetalleCobros=jTtoolBarDetalleAuxiliarCobrarDetalleCobros;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarDetalleCobros;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarDetalleCobros;
			processRunnable.jTableDatos=jTableDatosCobrarDetalleCobros;
			processRunnable.jPanelCampos=jPanelCamposCobrarDetalleCobros;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarDetalleCobros;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarDetalleCobros;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarDetalleCobros;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarDetalleCobros;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarDetalleCobros;
			processRunnable.jTtoolBar=jTtoolBarCobrarDetalleCobros;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarDetalleCobros;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCobrarDetalleCobros ,jPanelParametrosReportesCobrarDetalleCobros, jTableDatosCobrarDetalleCobros,/*jScrollPanelDatosCobrarDetalleCobros,*/jPanelCamposCobrarDetalleCobros,jPanelPaginacionCobrarDetalleCobros, /*jScrollPanelDatosEdicionCobrarDetalleCobros,*/ jPanelAccionesCobrarDetalleCobros,jPanelAccionesFormularioCobrarDetalleCobros,jmenuBarCobrarDetalleCobros,jmenuBarDetalleCobrarDetalleCobros,jTtoolBarCobrarDetalleCobros,jTtoolBarDetalleCobrarDetalleCobros));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCobrarDetalleCobros(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCobrarDetalleCobros(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCobrarDetalleCobros(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCobrarDetalleCobros(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCobrarDetalleCobros,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCobrarDetalleCobros,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCobrarDetalleCobros(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCobrarDetalleCobros,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCobrarDetalleCobros,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cobrardetallecobrosConstantesFunciones.getsFinalQueryCobrarDetalleCobros();
		String  finalQueryPaginacionTodos=this.cobrardetallecobrosConstantesFunciones.getsFinalQueryCobrarDetalleCobros();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CobrarDetalleCobrosConstantesFunciones.getArrayColumnasGlobalesNoCobrarDetalleCobros(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CobrarDetalleCobrosConstantesFunciones.getArrayColumnasGlobalesCobrarDetalleCobros(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CobrarDetalleCobrosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cobrardetallecobrossEliminados= new ArrayList<CobrarDetalleCobros>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCobrarDetalleCobros();
		
				///*CobrarDetalleCobrosSessionBean*/this.cobrardetallecobrosSessionBean=new CobrarDetalleCobrosSessionBean();
			
			if(this.cobrardetallecobrosSessionBean==null) {
				this.cobrardetallecobrosSessionBean=new CobrarDetalleCobrosSessionBean();
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
					this.iNumeroPaginacion=CobrarDetalleCobrosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CobrarDetalleCobrosConstantesFunciones.getClassesForeignKeysOfCobrarDetalleCobros(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cobrardetallecobros."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cobrardetallecobrossAux= new ArrayList<CobrarDetalleCobros>();
			
				
			cobrardetallecobrosLogic.setDatosCliente(this.datosCliente);
			cobrardetallecobrosLogic.setDatosDeep(this.datosDeep);
			cobrardetallecobrosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaCobrarDetalleCobros")) {
				this.sDetalleReporte=CobrarDetalleCobrosConstantesFunciones.getDetalleIndiceBusquedaCobrarDetalleCobros(id_paisBusquedaCobrarDetalleCobros,id_ciudadBusquedaCobrarDetalleCobros,id_zonaBusquedaCobrarDetalleCobros,id_grupo_clienteBusquedaCobrarDetalleCobros,id_vendedorBusquedaCobrarDetalleCobros,fecha_emisionBusquedaCobrarDetalleCobros,fecha_emision_hastaBusquedaCobrarDetalleCobros);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cobrardetallecobrosLogic.getCobrarDetalleCobrossBusquedaCobrarDetalleCobros(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_paisBusquedaCobrarDetalleCobros,id_ciudadBusquedaCobrarDetalleCobros,id_zonaBusquedaCobrarDetalleCobros,id_grupo_clienteBusquedaCobrarDetalleCobros,id_vendedorBusquedaCobrarDetalleCobros,fecha_emisionBusquedaCobrarDetalleCobros,fecha_emision_hastaBusquedaCobrarDetalleCobros);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarDetalleCobrosConstantesFunciones.getDetalleIndiceBusquedaCobrarDetalleCobros(id_paisBusquedaCobrarDetalleCobros,id_ciudadBusquedaCobrarDetalleCobros,id_zonaBusquedaCobrarDetalleCobros,id_grupo_clienteBusquedaCobrarDetalleCobros,id_vendedorBusquedaCobrarDetalleCobros,fecha_emisionBusquedaCobrarDetalleCobros,fecha_emision_hastaBusquedaCobrarDetalleCobros);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarDetalleCobrosConstantesFunciones.getDetalleIndiceBusquedaCobrarDetalleCobros(id_paisBusquedaCobrarDetalleCobros,id_ciudadBusquedaCobrarDetalleCobros,id_zonaBusquedaCobrarDetalleCobros,id_grupo_clienteBusquedaCobrarDetalleCobros,id_vendedorBusquedaCobrarDetalleCobros,fecha_emisionBusquedaCobrarDetalleCobros,fecha_emision_hastaBusquedaCobrarDetalleCobros);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cobrardetallecobrosLogic.getCobrarDetalleCobross()==null||cobrardetallecobrosLogic.getCobrarDetalleCobross().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cobrardetallecobross==null|| cobrardetallecobross.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrardetallecobrossAux=new ArrayList<CobrarDetalleCobros>();
						cobrardetallecobrossAux.addAll(cobrardetallecobrosLogic.getCobrarDetalleCobross());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrardetallecobrossAux=new ArrayList<CobrarDetalleCobros>();
							cobrardetallecobrossAux.addAll(cobrardetallecobross);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cobrardetallecobrosLogic.getCobrarDetalleCobrossBusquedaCobrarDetalleCobros(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_paisBusquedaCobrarDetalleCobros,id_ciudadBusquedaCobrarDetalleCobros,id_zonaBusquedaCobrarDetalleCobros,id_grupo_clienteBusquedaCobrarDetalleCobros,id_vendedorBusquedaCobrarDetalleCobros,fecha_emisionBusquedaCobrarDetalleCobros,fecha_emision_hastaBusquedaCobrarDetalleCobros);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarDetalleCobrosConstantesFunciones.getDetalleIndiceBusquedaCobrarDetalleCobros(id_paisBusquedaCobrarDetalleCobros,id_ciudadBusquedaCobrarDetalleCobros,id_zonaBusquedaCobrarDetalleCobros,id_grupo_clienteBusquedaCobrarDetalleCobros,id_vendedorBusquedaCobrarDetalleCobros,fecha_emisionBusquedaCobrarDetalleCobros,fecha_emision_hastaBusquedaCobrarDetalleCobros);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarDetalleCobrosConstantesFunciones.getDetalleIndiceBusquedaCobrarDetalleCobros(id_paisBusquedaCobrarDetalleCobros,id_ciudadBusquedaCobrarDetalleCobros,id_zonaBusquedaCobrarDetalleCobros,id_grupo_clienteBusquedaCobrarDetalleCobros,id_vendedorBusquedaCobrarDetalleCobros,fecha_emisionBusquedaCobrarDetalleCobros,fecha_emision_hastaBusquedaCobrarDetalleCobros);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCobrarDetalleCobross("BusquedaCobrarDetalleCobros",cobrardetallecobrosLogic.getCobrarDetalleCobross());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCobrarDetalleCobross("BusquedaCobrarDetalleCobros",cobrardetallecobross);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrardetallecobrosLogic.setCobrarDetalleCobross(new ArrayList<CobrarDetalleCobros>());
						cobrardetallecobrosLogic.getCobrarDetalleCobross().addAll(cobrardetallecobrossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrardetallecobross=new ArrayList<CobrarDetalleCobros>();
							cobrardetallecobross.addAll(cobrardetallecobrossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCobrarDetalleCobros();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCobrarDetalleCobros();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrardetallecobrosLogic.getCobrarDetalleCobross().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrardetallecobross.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrardetallecobrosLogic.getCobrarDetalleCobross().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrardetallecobross.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CobrarDetalleCobros cobrardetallecobros) {
		Boolean permite=true;
		
		if(this.cobrardetallecobros.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CobrarDetalleCobrosConstantesFunciones.getOrderByListaCobrarDetalleCobros();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CobrarDetalleCobrosConstantesFunciones.getOrderByListaCobrarDetalleCobros();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarDetalleCobros cobrardetallecobros:cobrardetallecobrosLogic.getCobrarDetalleCobross()) {
				if(cobrardetallecobros.getsType().equals(Constantes2.S_TOTALES)) {
					cobrardetallecobrosTotales=cobrardetallecobros;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarDetalleCobros cobrardetallecobros:this.cobrardetallecobross) {
				if(cobrardetallecobros.getsType().equals(Constantes2.S_TOTALES)) {
					cobrardetallecobrosTotales=cobrardetallecobros;
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
			this.cobrardetallecobrosAux=new CobrarDetalleCobros();
			this.cobrardetallecobrosAux.setsType(Constantes2.S_TOTALES);
			this.cobrardetallecobrosAux.setIsNew(false);
			this.cobrardetallecobrosAux.setIsChanged(false);
			this.cobrardetallecobrosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//CobrarDetalleCobrosConstantesFunciones.TotalizarValoresFilaCobrarDetalleCobros(this.cobrardetallecobrosLogic.getCobrarDetalleCobross(),this.cobrardetallecobrosAux);
				
				//this.cobrardetallecobrosLogic.getCobrarDetalleCobross().add(this.cobrardetallecobrosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CobrarDetalleCobrosConstantesFunciones.TotalizarValoresFilaCobrarDetalleCobros(this.cobrardetallecobross,this.cobrardetallecobrosAux);
				
				this.cobrardetallecobross.add(this.cobrardetallecobrosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cobrardetallecobrosTotales=new CobrarDetalleCobros();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrardetallecobrosLogic.getCobrarDetalleCobross().remove(cobrardetallecobrosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrardetallecobross.remove(cobrardetallecobrosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cobrardetallecobrosTotales=new CobrarDetalleCobros();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarDetalleCobros cobrardetallecobros:cobrardetallecobrosLogic.getCobrarDetalleCobross()) {
				if(cobrardetallecobros.getsType().equals(Constantes2.S_TOTALES)) {
					cobrardetallecobrosTotales=cobrardetallecobros;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarDetalleCobrosConstantesFunciones.TotalizarValoresFilaCobrarDetalleCobros(this.cobrardetallecobrosLogic.getCobrarDetalleCobross(),cobrardetallecobrosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarDetalleCobros cobrardetallecobros:this.cobrardetallecobross) {
				if(cobrardetallecobros.getsType().equals(Constantes2.S_TOTALES)) {
					cobrardetallecobrosTotales=cobrardetallecobros;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarDetalleCobrosConstantesFunciones.TotalizarValoresFilaCobrarDetalleCobros(this.cobrardetallecobross,cobrardetallecobrosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCobrarDetalleCobrossBusquedaCobrarDetalleCobros()throws Exception {
		try {
			sAccionBusqueda="BusquedaCobrarDetalleCobros";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarDetalleCobrossFK_IdCiudad()throws Exception {
		try {
			sAccionBusqueda="FK_IdCiudad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarDetalleCobrossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarDetalleCobrossFK_IdGrupoCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdGrupoCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarDetalleCobrossFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarDetalleCobrossFK_IdVendedor()throws Exception {
		try {
			sAccionBusqueda="FK_IdVendedor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarDetalleCobrossFK_IdZona()throws Exception {
		try {
			sAccionBusqueda="FK_IdZona";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCobrarDetalleCobrossBusquedaCobrarDetalleCobros(String sFinalQuery,Long id_pais,Long id_ciudad,Long id_zona,Long id_grupo_cliente,Long id_vendedor,Date fecha_emision,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrardetallecobrosLogic.getCobrarDetalleCobrossBusquedaCobrarDetalleCobros(sFinalQuery,this.pagination,id_pais,id_ciudad,id_zona,id_grupo_cliente,id_vendedor,fecha_emision,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarDetalleCobrossFK_IdCiudad(String sFinalQuery,Long id_ciudad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrardetallecobrosLogic.getCobrarDetalleCobrossFK_IdCiudad(sFinalQuery,this.pagination,id_ciudad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarDetalleCobrossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrardetallecobrosLogic.getCobrarDetalleCobrossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarDetalleCobrossFK_IdGrupoCliente(String sFinalQuery,Long id_grupo_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrardetallecobrosLogic.getCobrarDetalleCobrossFK_IdGrupoCliente(sFinalQuery,this.pagination,id_grupo_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarDetalleCobrossFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrardetallecobrosLogic.getCobrarDetalleCobrossFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarDetalleCobrossFK_IdVendedor(String sFinalQuery,Long id_vendedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrardetallecobrosLogic.getCobrarDetalleCobrossFK_IdVendedor(sFinalQuery,this.pagination,id_vendedor);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarDetalleCobrossFK_IdZona(String sFinalQuery,Long id_zona)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrardetallecobrosLogic.getCobrarDetalleCobrossFK_IdZona(sFinalQuery,this.pagination,id_zona);
				
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
	
	public void inicializarPermisosCobrarDetalleCobros() {
		this.isPermisoTodoCobrarDetalleCobros=false;
		this.isPermisoNuevoCobrarDetalleCobros=false;
		this.isPermisoActualizarCobrarDetalleCobros=false;
		this.isPermisoActualizarOriginalCobrarDetalleCobros=false;
		this.isPermisoEliminarCobrarDetalleCobros=false;
		this.isPermisoGuardarCambiosCobrarDetalleCobros=false;
		this.isPermisoConsultaCobrarDetalleCobros=true;
		this.isPermisoBusquedaCobrarDetalleCobros=true;
		this.isPermisoReporteCobrarDetalleCobros=true;
		this.isPermisoOrdenCobrarDetalleCobros=false;		
		this.isPermisoPaginacionMedioCobrarDetalleCobros=false;		
		this.isPermisoPaginacionAltoCobrarDetalleCobros=false;		
		this.isPermisoPaginacionTodoCobrarDetalleCobros=false;		
		this.isPermisoCopiarCobrarDetalleCobros=false;		
		this.isPermisoVerFormCobrarDetalleCobros=false;		
		this.isPermisoDuplicarCobrarDetalleCobros=false;
		this.isPermisoOrdenCobrarDetalleCobros=false;
	}
	
	public void setPermisosUsuarioCobrarDetalleCobros(Boolean isPermiso) {
		this.isPermisoTodoCobrarDetalleCobros=isPermiso;
		this.isPermisoNuevoCobrarDetalleCobros=isPermiso;
		this.isPermisoActualizarCobrarDetalleCobros=isPermiso;
		this.isPermisoActualizarOriginalCobrarDetalleCobros=isPermiso;
		this.isPermisoEliminarCobrarDetalleCobros=isPermiso;
		this.isPermisoGuardarCambiosCobrarDetalleCobros=isPermiso;
		this.isPermisoConsultaCobrarDetalleCobros=isPermiso;
		this.isPermisoBusquedaCobrarDetalleCobros=isPermiso;
		this.isPermisoReporteCobrarDetalleCobros=isPermiso;
		this.isPermisoOrdenCobrarDetalleCobros=isPermiso;		
		this.isPermisoPaginacionMedioCobrarDetalleCobros=isPermiso;		
		this.isPermisoPaginacionAltoCobrarDetalleCobros=isPermiso;		
		this.isPermisoPaginacionTodoCobrarDetalleCobros=isPermiso;		
		this.isPermisoCopiarCobrarDetalleCobros=isPermiso;		
		this.isPermisoVerFormCobrarDetalleCobros=isPermiso;		
		this.isPermisoDuplicarCobrarDetalleCobros=isPermiso;
		this.isPermisoOrdenCobrarDetalleCobros=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCobrarDetalleCobros(Boolean isPermiso) {
		//this.isPermisoTodoCobrarDetalleCobros=isPermiso;
		this.isPermisoNuevoCobrarDetalleCobros=isPermiso;
		this.isPermisoActualizarCobrarDetalleCobros=isPermiso;
		this.isPermisoActualizarOriginalCobrarDetalleCobros=isPermiso;
		this.isPermisoEliminarCobrarDetalleCobros=isPermiso;
		this.isPermisoGuardarCambiosCobrarDetalleCobros=isPermiso;
		//this.isPermisoConsultaCobrarDetalleCobros=isPermiso;
		//this.isPermisoBusquedaCobrarDetalleCobros=isPermiso;
		//this.isPermisoReporteCobrarDetalleCobros=isPermiso;
		//this.isPermisoOrdenCobrarDetalleCobros=isPermiso;		
		//this.isPermisoPaginacionMedioCobrarDetalleCobros=isPermiso;		
		//this.isPermisoPaginacionAltoCobrarDetalleCobros=isPermiso;		
		//this.isPermisoPaginacionTodoCobrarDetalleCobros=isPermiso;		
		//this.isPermisoCopiarCobrarDetalleCobros=isPermiso;		
		//this.isPermisoDuplicarCobrarDetalleCobros=isPermiso;
		//this.isPermisoOrdenCobrarDetalleCobros=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCobrarDetalleCobrosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CobrarDetalleCobrosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCobrarDetalleCobros(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCobrarDetalleCobrosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCobrarDetalleCobrosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCobrarDetalleCobrosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCobrarDetalleCobrosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCobrarDetalleCobros() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CobrarDetalleCobrosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CobrarDetalleCobrosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCobrarDetalleCobros=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCobrarDetalleCobros=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCobrarDetalleCobros=this.isPermisoActualizarCobrarDetalleCobros;
			this.isPermisoEliminarCobrarDetalleCobros=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCobrarDetalleCobros=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCobrarDetalleCobros=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCobrarDetalleCobros=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCobrarDetalleCobros=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCobrarDetalleCobros=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarDetalleCobros=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCobrarDetalleCobros=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCobrarDetalleCobros=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCobrarDetalleCobros=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCobrarDetalleCobros=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCobrarDetalleCobros=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCobrarDetalleCobros=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarDetalleCobros=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCobrarDetalleCobros.setToolTipText(this.jTableDatosCobrarDetalleCobros.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCobrarDetalleCobros(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCobrarDetalleCobros(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CobrarDetalleCobrosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CobrarDetalleCobrosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCobrarDetalleCobros() throws Exception {
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
	public void inicializarCombosForeignKeyCobrarDetalleCobrosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.paissForeignKey=new ArrayList();
				this.ciudadsForeignKey=new ArrayList();
				this.zonasForeignKey=new ArrayList();
				this.grupoclientesForeignKey=new ArrayList();
				this.vendedorsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCobrarDetalleCobrosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CobrarDetalleCobrosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyZonaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyGrupoClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyZonaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.zonasForeignKey==null||this.zonasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ZonaConstantesFunciones.getArrayColumnasGlobalesZona(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ZonaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ZonaConstantesFunciones.SFINALQUERY;

				this.cargarCombosZonasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyGrupoClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.grupoclientesForeignKey==null||this.grupoclientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=GrupoClienteConstantesFunciones.getArrayColumnasGlobalesGrupoCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,GrupoClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=GrupoClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosGrupoClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyVendedorListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.vendedorsForeignKey==null||this.vendedorsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=VendedorConstantesFunciones.getArrayColumnasGlobalesVendedor(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,VendedorConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=VendedorConstantesFunciones.SFINALQUERY;

				this.cargarCombosVendedorsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyCobrarDetalleCobros()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyPais();
			this.addItemDefectoCombosForeignKeyCiudad();
			this.addItemDefectoCombosForeignKeyZona();
			this.addItemDefectoCombosForeignKeyGrupoCliente();
			this.addItemDefectoCombosForeignKeyVendedor();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cobrardetallecobrosSessionBean==null) {
				this.cobrardetallecobrosSessionBean=new CobrarDetalleCobrosSessionBean();
			}

			if(!this.cobrardetallecobrosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.cobrardetallecobrosSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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

			if(!this.cobrardetallecobrosSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
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

	public void addItemDefectoCombosForeignKeyZona()throws Exception {
		try {

			if(!this.cobrardetallecobrosSessionBean.getisBusquedaDesdeForeignKeySesionZona()) {
				Zona zona=new Zona();
				ZonaConstantesFunciones.setZonaDescripcion(zona,Constantes.SMENSAJE_ESCOJA_OPCION);
				zona.setId(null);

				if(!ZonaConstantesFunciones.ExisteEnLista(this.zonasForeignKey,zona,true)) {

					this.zonasForeignKey.add(0,zona);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyGrupoCliente()throws Exception {
		try {

			if(!this.cobrardetallecobrosSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
				GrupoCliente grupocliente=new GrupoCliente();
				GrupoClienteConstantesFunciones.setGrupoClienteDescripcion(grupocliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				grupocliente.setId(null);

				if(!GrupoClienteConstantesFunciones.ExisteEnLista(this.grupoclientesForeignKey,grupocliente,true)) {

					this.grupoclientesForeignKey.add(0,grupocliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyVendedor()throws Exception {
		try {

			if(!this.cobrardetallecobrosSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
				Vendedor vendedor=new Vendedor();
				VendedorConstantesFunciones.setVendedorDescripcion(vendedor,Constantes.SMENSAJE_ESCOJA_OPCION);
				vendedor.setId(null);

				if(!VendedorConstantesFunciones.ExisteEnLista(this.vendedorsForeignKey,vendedor,true)) {

					this.vendedorsForeignKey.add(0,vendedor);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCobrarDetalleCobros()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCobrarDetalleCobros(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCobrarDetalleCobros()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarDetalleCobros();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCobrarDetalleCobros(CobrarDetalleCobros cobrardetallecobros)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCobrarDetalleCobros(CobrarDetalleCobros cobrardetallecobros,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCobrarDetalleCobros()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarDetalleCobros()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCobrarDetalleCobros()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCobrarDetalleCobros()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCobrarDetalleCobros()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCobrarDetalleCobros()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFramePaissForeignKey("Todos");
			this.cargarCombosFrameCiudadsForeignKey("Todos");
			this.cargarCombosFrameZonasForeignKey("Todos");
			this.cargarCombosFrameGrupoClientesForeignKey("Todos");
			this.cargarCombosFrameVendedorsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCobrarDetalleCobros(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameZonasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameGrupoClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCobrarDetalleCobros()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_empresaCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_empresaCobrarDetalleCobros.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_empresaCobrarDetalleCobros.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_paisCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_paisCobrarDetalleCobros.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_paisCobrarDetalleCobros.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_ciudadCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_ciudadCobrarDetalleCobros.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_ciudadCobrarDetalleCobros.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_zonaCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_zonaCobrarDetalleCobros.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_zonaCobrarDetalleCobros.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_grupo_clienteCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_grupo_clienteCobrarDetalleCobros.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_grupo_clienteCobrarDetalleCobros.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_vendedorCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_vendedorCobrarDetalleCobros.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_vendedorCobrarDetalleCobros.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public CobrarDetalleCobrosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CobrarDetalleCobrosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CobrarDetalleCobrosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cobrardetallecobrosSessionBean=new CobrarDetalleCobrosSessionBean(); 
		this.cobrardetallecobrosConstantesFunciones=new CobrarDetalleCobrosConstantesFunciones(); 
		this.cobrardetallecobrosBean=new CobrarDetalleCobros();//(this.cobrardetallecobrosConstantesFunciones); 		
		this.cobrardetallecobrosReturnGeneral=new CobrarDetalleCobrosParameterReturnGeneral(); 
		
		this.cobrardetallecobrosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrardetallecobrosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CobrarDetalleCobrosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CobrarDetalleCobrosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CobrarDetalleCobrosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCobrarDetalleCobros(true);
			
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
			
			this.cobrardetallecobrosConstantesFunciones=new CobrarDetalleCobrosConstantesFunciones(); 
			this.cobrardetallecobrosBean=new CobrarDetalleCobros();//this.cobrardetallecobrosConstantesFunciones); 			
			this.cobrardetallecobrosReturnGeneral=new CobrarDetalleCobrosParameterReturnGeneral(); 
		
			CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Detalle Cobros Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cobrardetallecobros=new CobrarDetalleCobros();
			this.cobrardetallecobross = new ArrayList<CobrarDetalleCobros>();
			this.cobrardetallecobrossAux = new ArrayList<CobrarDetalleCobros>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic=new CobrarDetalleCobrosLogic();
				this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
			}
			
			//this.cobrardetallecobrosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cobrardetallecobrosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCobrarDetalleCobros);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCobrarDetalleCobros!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarDetalleCobros);	
					}
					
					if(this.jInternalFrameImportacionCobrarDetalleCobros!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarDetalleCobros);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCobrarDetalleCobros!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCobrarDetalleCobros);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarDetalleCobros);
				this.jInternalFrameDetalleFormCobrarDetalleCobros.setVisible(false);
				this.jInternalFrameDetalleFormCobrarDetalleCobros.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarDetalleCobros!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarDetalleCobros);
					this.jInternalFrameReporteDinamicoCobrarDetalleCobros.setVisible(false);
					this.jInternalFrameReporteDinamicoCobrarDetalleCobros.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCobrarDetalleCobros!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCobrarDetalleCobros);
					this.jInternalFrameImportacionCobrarDetalleCobros.setVisible(false);
					this.jInternalFrameImportacionCobrarDetalleCobros.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCobrarDetalleCobros!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCobrarDetalleCobros);
					this.jInternalFrameOrderByCobrarDetalleCobros.setVisible(false);
					this.jInternalFrameOrderByCobrarDetalleCobros.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCobrarDetalleCobrosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CobrarDetalleCobrosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cobrardetallecobrosReturnGeneral=new CobrarDetalleCobrosParameterReturnGeneral();
			
			this.cobrardetallecobrosParameterGeneral=new CobrarDetalleCobrosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cobrardetallecobrosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CobrarDetalleCobrosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarDetalleCobrosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado(),this.cobrardetallecobrosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarDetalleCobrosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado(),this.cobrardetallecobrosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCobrarDetalleCobros=false;
			this.isVisibilidadCeldaDuplicarCobrarDetalleCobros=true;
			this.isVisibilidadCeldaCopiarCobrarDetalleCobros=true;
			this.isVisibilidadCeldaVerFormCobrarDetalleCobros=true;
			this.isVisibilidadCeldaOrdenCobrarDetalleCobros=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros=false;
			this.isVisibilidadCeldaModificarCobrarDetalleCobros=false;
			this.isVisibilidadCeldaActualizarCobrarDetalleCobros=false;
			this.isVisibilidadCeldaEliminarCobrarDetalleCobros=false;
			this.isVisibilidadCeldaCancelarCobrarDetalleCobros=false;
			this.isVisibilidadCeldaGuardarCobrarDetalleCobros=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros=false;
			
			
			this.isVisibilidadBusquedaCobrarDetalleCobros=true;
			this.isVisibilidadFK_IdCiudad=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdGrupoCliente=true;
			this.isVisibilidadFK_IdPais=true;
			this.isVisibilidadFK_IdVendedor=true;
			this.isVisibilidadFK_IdZona=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCobrarDetalleCobros("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCobrarDetalleCobros();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCobrarDetalleCobros(false);
			
			this.setPermisosUsuarioCobrarDetalleCobros();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado() 
				|| (this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado() && this.cobrardetallecobrosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCobrarDetalleCobrosClasesRelacionadas();
			}
			
			if(this.cobrardetallecobrosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCobrarDetalleCobrosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCobrarDetalleCobros();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCobrarDetalleCobros();
			}
			
			if(!this.isPermisoBusquedaCobrarDetalleCobros) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCobrarDetalleCobros.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CobrarDetalleCobrosConstantesFunciones.getTiposSeleccionarCobrarDetalleCobros());
				
				this.tiposColumnasSelect=CobrarDetalleCobrosConstantesFunciones.getTiposSeleccionarCobrarDetalleCobros(true);
				
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
			//if(!this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCobrarDetalleCobros();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioCobrarDetalleCobros(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioCobrarDetalleCobros(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarDetalleCobros() ;
			
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
			this.zonaLogic=new ZonaLogic();
			this.grupoclienteLogic=new GrupoClienteLogic();
			this.vendedorLogic=new VendedorLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cobrardetallecobrosImplementable= (CobrarDetalleCobrosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarDetalleCobrosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cobrardetallecobrosImplementableHome= (CobrarDetalleCobrosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarDetalleCobrosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cobrardetallecobross= new ArrayList<CobrarDetalleCobros>();
			this.cobrardetallecobrossEliminados= new ArrayList<CobrarDetalleCobros>();
						
			this.isEsNuevoCobrarDetalleCobros=false;
			this.esParaAccionDesdeFormularioCobrarDetalleCobros=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.paissForeignKey=new ArrayList<Pais>() ;
			this.ciudadsForeignKey=new ArrayList<Ciudad>() ;
			this.zonasForeignKey=new ArrayList<Zona>() ;
			this.grupoclientesForeignKey=new ArrayList<GrupoCliente>() ;
			this.vendedorsForeignKey=new ArrayList<Vendedor>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCobrarDetalleCobros(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCobrarDetalleCobros();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CobrarDetalleCobrosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCobrarDetalleCobros("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCobrarDetalleCobros(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCobrarDetalleCobros();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCobrarDetalleCobros();
			}
			
			CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCobrarDetalleCobros.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCobrarDetalleCobros.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCobrarDetalleCobros.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCobrarDetalleCobros(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CobrarDetalleCobros: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCobrarDetalleCobros() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCobrarDetalleCobros")) {
				iIndex=this.jInternalFrameDetalleFormCobrarDetalleCobros.jTabbedPaneRelacionesCobrarDetalleCobros.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCobrarDetalleCobros.jTabbedPaneRelacionesCobrarDetalleCobros.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCobrarDetalleCobros();	
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
	
	public void cargarCombosForeignKeyCobrarDetalleCobros(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCobrarDetalleCobros(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCobrarDetalleCobros(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCobrarDetalleCobrosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCobrarDetalleCobros();
		
		this.cargarCombosFrameForeignKeyCobrarDetalleCobros();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCobrarDetalleCobros();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCobrarDetalleCobros();
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

	public void cargarCombosForeignKeyZona(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyZonaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyZona();
				this.cargarCombosFrameZonasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaZona(this.zonasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyGrupoCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyGrupoClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyGrupoCliente();
				this.cargarCombosFrameGrupoClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaGrupoCliente(this.grupoclientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyVendedor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaVendedor(this.vendedorsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCobrarDetalleCobrosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cobrardetallecobrosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCobrarDetalleCobros==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
			
			
			if(jTableDatosCobrarDetalleCobros.getRowCount()>=1) {
				jTableDatosCobrarDetalleCobros.removeRowSelectionInterval(0, jTableDatosCobrarDetalleCobros.getRowCount()-1);						
			}
			
			this.isEsNuevoCobrarDetalleCobros=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCobrarDetalleCobros(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCobrarDetalleCobros(true);			
			//this.cobrardetallecobros=new CobrarDetalleCobros();
			//this.cobrardetallecobros.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarDetalleCobros(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarDetalleCobros() ;
			
			if(CobrarDetalleCobrosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarDetalleCobros(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cobrardetallecobros);	
			this.actualizarInformacion("INFO_PADRE",false,this.cobrardetallecobros);				
			
			CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
			
			if(this.cobrardetallecobrosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CobrarDetalleCobros: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCobrarDetalleCobrosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CobrarDetalleCobros> cobrardetallecobrossSeleccionados=new ArrayList<CobrarDetalleCobros>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCobrarDetalleCobros.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCobrarDetalleCobros.getSelectedRows().length;			
			}
			
			cobrardetallecobrossSeleccionados=this.getCobrarDetalleCobrossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCobrarDetalleCobros--;			
				//CobrarDetalleCobros cobrardetallecobrosAux= new CobrarDetalleCobros();			
				//cobrardetallecobrosAux.setId(this.iIdNuevoCobrarDetalleCobros);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CobrarDetalleCobros cobrardetallecobrosOrigen=new CobrarDetalleCobros();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CobrarDetalleCobros cobrardetallecobrosOrigen : cobrardetallecobrossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cobrardetallecobrosOrigen =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrardetallecobrosOrigen =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCobrarDetalleCobros();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cobrardetallecobros.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCobrarDetalleCobros(cobrardetallecobrosOrigen,this.cobrardetallecobros,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrardetallecobrosLogic.getCobrarDetalleCobross().add(this.cobrardetallecobrosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrardetallecobross.add(this.cobrardetallecobrosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCobrarDetalleCobros(false);
				
				this.jTableDatosCobrarDetalleCobros.setRowSelectionInterval(this.getIndiceNuevoCobrarDetalleCobros(), this.getIndiceNuevoCobrarDetalleCobros());
				
				int iLastRow =  this.jTableDatosCobrarDetalleCobros.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarDetalleCobros.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarDetalleCobros.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarDetalleCobros(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CobrarDetalleCobros> cobrardetallecobrossSeleccionados=new ArrayList<CobrarDetalleCobros>();									
		
			CobrarDetalleCobros cobrardetallecobrosOrigen=new CobrarDetalleCobros();
			CobrarDetalleCobros cobrardetallecobrosDestino=new CobrarDetalleCobros();
				
			cobrardetallecobrossSeleccionados=this.getCobrarDetalleCobrossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCobrarDetalleCobros.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cobrardetallecobrossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCobrarDetalleCobros.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrardetallecobrosOrigen =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrardetallecobrosOrigen =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrardetallecobrosDestino =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrardetallecobrosDestino =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cobrardetallecobrosOrigen =cobrardetallecobrossSeleccionados.get(0);
				cobrardetallecobrosDestino =cobrardetallecobrossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCobrarDetalleCobros(cobrardetallecobrosOrigen,cobrardetallecobrosDestino,true,false);
				
				cobrardetallecobrosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cobrardetallecobrosDestino,cobrardetallecobrosLogic.getCobrarDetalleCobross());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cobrardetallecobrosDestino,cobrardetallecobross);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCobrarDetalleCobros(false);
				
				//this.jTableDatosCobrarDetalleCobros.setRowSelectionInterval(this.getIndiceNuevoCobrarDetalleCobros(), this.getIndiceNuevoCobrarDetalleCobros());
				
				int iLastRow =  this.jTableDatosCobrarDetalleCobros.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarDetalleCobros.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarDetalleCobros.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarDetalleCobros(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarDetalleCobros==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCobrarDetalleCobros.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCobrarDetalleCobros.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCobrarDetalleCobros.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCobrarDetalleCobros.setVisible(!isVisible);
			this.jPanelPaginacionCobrarDetalleCobros.setVisible(!isVisible);
			this.jPanelAccionesCobrarDetalleCobros.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCobrarDetalleCobros();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCobrarDetalleCobros();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCobrarDetalleCobros();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCobrarDetalleCobros();
			
			this.abrirFrameOrderByCobrarDetalleCobros();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCobrarDetalleCobros();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCobrarDetalleCobros(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarDetalleCobros);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCobrarDetalleCobros.isMaximum()) {
					this.jInternalFrameDetalleFormCobrarDetalleCobros.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCobrarDetalleCobros.setSize(this.jInternalFrameDetalleFormCobrarDetalleCobros.iWidthFormulario,this.jInternalFrameDetalleFormCobrarDetalleCobros.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCobrarDetalleCobros.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCobrarDetalleCobros.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCobrarDetalleCobros.isMaximum()) {
						this.jInternalFrameDetalleFormCobrarDetalleCobros.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCobrarDetalleCobros.jContentPaneDetalleCobrarDetalleCobros.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCobrarDetalleCobros.jTabbedPaneRelacionesCobrarDetalleCobros.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCobrarDetalleCobros.jContentPaneDetalleCobrarDetalleCobros.getWidth(),CobrarDetalleCobrosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarDetalleCobros.jTabbedPaneRelacionesCobrarDetalleCobros.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCobrarDetalleCobros.jContentPaneDetalleCobrarDetalleCobros.getWidth(),CobrarDetalleCobrosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarDetalleCobros.jTabbedPaneRelacionesCobrarDetalleCobros.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCobrarDetalleCobros.jContentPaneDetalleCobrarDetalleCobros.getWidth(),CobrarDetalleCobrosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCobrarDetalleCobros.setVisible(true);
	        this.jInternalFrameDetalleFormCobrarDetalleCobros.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCobrarDetalleCobros() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCobrarDetalleCobros==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCobrarDetalleCobros=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarDetalleCobros,false,this);
				} else {
					this.jInternalFrameOrderByCobrarDetalleCobros=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarDetalleCobros,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCobrarDetalleCobros);
				this.jInternalFrameOrderByCobrarDetalleCobros.setVisible(false);
				this.jInternalFrameOrderByCobrarDetalleCobros.setSelected(false);
				
				this.jInternalFrameOrderByCobrarDetalleCobros.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarDetalleCobros"));
				
				this.inicializarActualizarBindingTablaOrderByCobrarDetalleCobros();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCobrarDetalleCobros() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCobrarDetalleCobros==null) {
				
				this.jInternalFrameImportacionCobrarDetalleCobros=new ImportacionJInternalFrame(CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarDetalleCobros);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCobrarDetalleCobros);
				this.jInternalFrameImportacionCobrarDetalleCobros.setVisible(false);
				this.jInternalFrameImportacionCobrarDetalleCobros.setSelected(false);


				this.jInternalFrameImportacionCobrarDetalleCobros.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarDetalleCobros"));
				this.jInternalFrameImportacionCobrarDetalleCobros.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarDetalleCobros"));
				this.jInternalFrameImportacionCobrarDetalleCobros.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarDetalleCobros"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCobrarDetalleCobros() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCobrarDetalleCobros==null) {
				this.jInternalFrameReporteDinamicoCobrarDetalleCobros=new ReporteDinamicoJInternalFrame(CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarDetalleCobros);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarDetalleCobros);
				this.jInternalFrameReporteDinamicoCobrarDetalleCobros.setVisible(false);
				this.jInternalFrameReporteDinamicoCobrarDetalleCobros.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarDetalleCobros"));
				this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarDetalleCobros"));
				this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarDetalleCobros"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarDetalleCobros();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCobrarDetalleCobros() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarDetalleCobros);
			
	       	this.jInternalFrameDetalleFormCobrarDetalleCobros.setVisible(false);
	        this.jInternalFrameDetalleFormCobrarDetalleCobros.setSelected(false);
			
			//this.jInternalFrameDetalleFormCobrarDetalleCobros.dispose();
			//this.jInternalFrameDetalleFormCobrarDetalleCobros=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCobrarDetalleCobros() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCobrarDetalleCobros.setVisible(true);
	        this.jInternalFrameReporteDinamicoCobrarDetalleCobros.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCobrarDetalleCobros() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCobrarDetalleCobros.setVisible(true);
	        this.jInternalFrameImportacionCobrarDetalleCobros.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCobrarDetalleCobros() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCobrarDetalleCobros.setVisible(true);
	        this.jInternalFrameOrderByCobrarDetalleCobros.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCobrarDetalleCobros() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCobrarDetalleCobros.setVisible(false);
	        this.jInternalFrameOrderByCobrarDetalleCobros.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCobrarDetalleCobros() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCobrarDetalleCobros.setVisible(false);
	        this.jInternalFrameReporteDinamicoCobrarDetalleCobros.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCobrarDetalleCobros() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCobrarDetalleCobros.setVisible(false);
	        this.jInternalFrameImportacionCobrarDetalleCobros.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCobrarDetalleCobros(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCobrarDetalleCobros(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCobrarDetalleCobros(true);
			//this.isEsNuevoCobrarDetalleCobros=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCobrarDetalleCobros("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarDetalleCobros(false) ;
			
			if(cobrardetallecobrosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CobrarDetalleCobrosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarDetalleCobros(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarDetalleCobros(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCobrarDetalleCobrosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCobrarDetalleCobros(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarDetalleCobros==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCobrarDetalleCobros(true);
			//this.isEsNuevoCobrarDetalleCobros=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cobrardetallecobros.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCobrarDetalleCobros("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCobrarDetalleCobros(false) ;
			
			if(CobrarDetalleCobrosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarDetalleCobros(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarDetalleCobros(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarDetalleCobros,CobrarDetalleCobrosConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCobrarDetalleCobros.getSelectedRow();

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
		TableColumn tableColumnCiudad=this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarDetalleCobros,CobrarDetalleCobrosConstantesFunciones.LABEL_IDCIUDAD));
		TableCellEditor tableCellEditorCiudad =tableColumnCiudad.getCellEditor();

		CiudadTableCell ciudadTableCellFk=(CiudadTableCell)tableCellEditorCiudad;

		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.setciudadsForeignKey(ciudadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCobrarDetalleCobros.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ciudadTableCellFk.setRowActual(intSelectedRow);
			//ciudadTableCellFk.setciudadsForeignKeyActual(ciudadsForeignKey);
		//}


		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.RecargarCiudadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaZona(List<Zona> zonasForeignKey)throws Exception{
		TableColumn tableColumnZona=this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarDetalleCobros,CobrarDetalleCobrosConstantesFunciones.LABEL_IDZONA));
		TableCellEditor tableCellEditorZona =tableColumnZona.getCellEditor();

		ZonaTableCell zonaTableCellFk=(ZonaTableCell)tableCellEditorZona;

		if(zonaTableCellFk!=null) {
			zonaTableCellFk.setzonasForeignKey(zonasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCobrarDetalleCobros.getSelectedRow();

		//if(intSelectedRow<=0) {
			//zonaTableCellFk.setRowActual(intSelectedRow);
			//zonaTableCellFk.setzonasForeignKeyActual(zonasForeignKey);
		//}


		if(zonaTableCellFk!=null) {
			zonaTableCellFk.RecargarZonasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaGrupoCliente(List<GrupoCliente> grupoclientesForeignKey)throws Exception{
		TableColumn tableColumnGrupoCliente=this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarDetalleCobros,CobrarDetalleCobrosConstantesFunciones.LABEL_IDGRUPOCLIENTE));
		TableCellEditor tableCellEditorGrupoCliente =tableColumnGrupoCliente.getCellEditor();

		GrupoClienteTableCell grupoclienteTableCellFk=(GrupoClienteTableCell)tableCellEditorGrupoCliente;

		if(grupoclienteTableCellFk!=null) {
			grupoclienteTableCellFk.setgrupoclientesForeignKey(grupoclientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCobrarDetalleCobros.getSelectedRow();

		//if(intSelectedRow<=0) {
			//grupoclienteTableCellFk.setRowActual(intSelectedRow);
			//grupoclienteTableCellFk.setgrupoclientesForeignKeyActual(grupoclientesForeignKey);
		//}


		if(grupoclienteTableCellFk!=null) {
			grupoclienteTableCellFk.RecargarGrupoClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaVendedor(List<Vendedor> vendedorsForeignKey)throws Exception{
		TableColumn tableColumnVendedor=this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarDetalleCobros,CobrarDetalleCobrosConstantesFunciones.LABEL_IDVENDEDOR));
		TableCellEditor tableCellEditorVendedor =tableColumnVendedor.getCellEditor();

		VendedorTableCell vendedorTableCellFk=(VendedorTableCell)tableCellEditorVendedor;

		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.setvendedorsForeignKey(vendedorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCobrarDetalleCobros.getSelectedRow();

		//if(intSelectedRow<=0) {
			//vendedorTableCellFk.setRowActual(intSelectedRow);
			//vendedorTableCellFk.setvendedorsForeignKeyActual(vendedorsForeignKey);
		//}


		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.RecargarVendedorsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCobrarDetalleCobros(false);
			
			//if(!this.isEsNuevoCobrarDetalleCobros) {								
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
				
			}
			
			if(this.permiteMantenimiento(this.cobrardetallecobros)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCobrarDetalleCobros=true;
					this.inicializarActualizarBindingTablaCobrarDetalleCobros(false);
					this.isEsNuevoCobrarDetalleCobros=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCobrarDetalleCobros=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCobrarDetalleCobros=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarDetalleCobros(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarDetalleCobros(false);
				
				this.habilitarDeshabilitarControlesCobrarDetalleCobros(false);
			
												
				
				if(CobrarDetalleCobrosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCobrarDetalleCobros();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCobrarDetalleCobrosActionPerformed(evt,cobrardetallecobrosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCobrarDetalleCobros(this.cobrardetallecobros,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCobrarDetalleCobros.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cobrardetallecobrosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cobrardetallecobros.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CobrarDetalleCobros.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarDetalleCobros.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				this.cobrardetallecobros.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				this.cobrardetallecobros.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cobrardetallecobros)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CobrarDetalleCobrosModel) this.jTableDatosCobrarDetalleCobros.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCobrarDetalleCobros=true;
				this.inicializarActualizarBindingTablaCobrarDetalleCobros(false);
				this.isEsNuevoCobrarDetalleCobros=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarDetalleCobros(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarDetalleCobros(false);
				
				this.habilitarDeshabilitarControlesCobrarDetalleCobros(false);
				
				
				
				if(CobrarDetalleCobrosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCobrarDetalleCobros();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCobrarDetalleCobros.getRowCount()>=1) {
				jTableDatosCobrarDetalleCobros.removeRowSelectionInterval(0, jTableDatosCobrarDetalleCobros.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCobrarDetalleCobros(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCobrarDetalleCobros(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarDetalleCobros(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarDetalleCobros(false) ;
			
			this.isEsNuevoCobrarDetalleCobros=false;
			
			if(CobrarDetalleCobrosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCobrarDetalleCobros();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCobrarDetalleCobros(false);
				
				//SI ES MANUAL
				if(CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCobrarDetalleCobros();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCobrarDetalleCobros--;			
			//CobrarDetalleCobros cobrardetallecobrosAux= new CobrarDetalleCobros();			
			//cobrardetallecobrosAux.setId(this.iIdNuevoCobrarDetalleCobros);
			
			if(this.jInternalFrameDetalleFormCobrarDetalleCobros==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCobrarDetalleCobros();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
			
			this.cobrardetallecobros.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cobrardetallecobrosLogic.getCobrarDetalleCobross().add(this.cobrardetallecobrosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cobrardetallecobross.add(this.cobrardetallecobrosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCobrarDetalleCobros(false);
			
			this.jTableDatosCobrarDetalleCobros.setRowSelectionInterval(this.getIndiceNuevoCobrarDetalleCobros(), this.getIndiceNuevoCobrarDetalleCobros());
			
			int iLastRow =  this.jTableDatosCobrarDetalleCobros.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCobrarDetalleCobros.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCobrarDetalleCobros.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCobrarDetalleCobros(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCobrarDetalleCobros(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarDetalleCobros(false);
			
			//SI ES MANUAL
			if(CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarDetalleCobros();
			}
			
			//this.abrirFrameTreeCobrarDetalleCobros();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCobrarDetalleCobros.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCobrarDetalleCobros.setFileImportacion(this.jInternalFrameImportacionCobrarDetalleCobros.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCobrarDetalleCobros.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCobrarDetalleCobros.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCobrarDetalleCobros.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCobrarDetalleCobros.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CobrarDetalleCobros> cobrardetallecobrossSeleccionados=new ArrayList<CobrarDetalleCobros>();		

		cobrardetallecobrossSeleccionados=this.getCobrarDetalleCobrossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CobrarDetalleCobrosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CobrarDetalleCobrosBaseDesign.jrxml";
			
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
			
			this.generarReporteCobrarDetalleCobross("Todos",cobrardetallecobrossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Detalle Cobros",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreVendedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreVendedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreVendedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreVendedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_APELLIDO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talFacturas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talFacturas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talFacturas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talFacturas_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALABONOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talAbonos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talAbonos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talAbonos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talAbonos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURASACTUAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talFacturasActual_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talFacturasActual_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talFacturasActual_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talFacturasActual_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSANTERIOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_onosAnterior_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_onosAnterior_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_onosAnterior_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_onosAnterior_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSACTUAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_onosActual_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_onosActual_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_onosActual_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_onosActual_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					sNombreCampoCategoria="nombre_vendedor";
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoria="apellido";
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURAS:
					sNombreCampoCategoria="total_facturas";
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALABONOS:
					sNombreCampoCategoria="total_abonos";
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURASACTUAL:
					sNombreCampoCategoria="total_facturas_actual";
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSANTERIOR:
					sNombreCampoCategoria="abonos_anterior";
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSACTUAL:
					sNombreCampoCategoria="abonos_actual";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					sNombreCampoCategoriaValor="nombre_vendedor";
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoriaValor="apellido";
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURAS:
					sNombreCampoCategoriaValor="total_facturas";
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALABONOS:
					sNombreCampoCategoriaValor="total_abonos";
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURASACTUAL:
					sNombreCampoCategoriaValor="total_facturas_actual";
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSANTERIOR:
					sNombreCampoCategoriaValor="abonos_anterior";
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSACTUAL:
					sNombreCampoCategoriaValor="abonos_actual";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Vendedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_vendedor");
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_APELLIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apello",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellido");
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Facturas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_facturas");
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALABONOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Abonos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_abonos");
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURASACTUAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Facturas Actual",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_facturas_actual");
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSANTERIOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Abonos Anterior",sNombreCampoCategoria,sNombreCampoCategoriaValor,"abonos_anterior");
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSACTUAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Abonos Actual",sNombreCampoCategoria,sNombreCampoCategoriaValor,"abonos_actual");
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
	
	public void jButtonGenerarExcelReporteDinamicoCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CobrarDetalleCobros> cobrardetallecobrossSeleccionados=new ArrayList<CobrarDetalleCobros>();		
		
		cobrardetallecobrossSeleccionados=this.getCobrarDetalleCobrossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrardetallecobros";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CobrarDetalleCobross");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CobrarDetalleCobrosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CobrarDetalleCobros cobrardetallecobros:cobrardetallecobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrardetallecobros.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(CobrarDetalleCobros cobrardetallecobros:cobrardetallecobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrardetallecobros.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_IDCIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_IDCIUDAD);
					iRow++;

					for(CobrarDetalleCobros cobrardetallecobros:cobrardetallecobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrardetallecobros.getciudad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_IDZONA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_IDZONA);
					iRow++;

					for(CobrarDetalleCobros cobrardetallecobros:cobrardetallecobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrardetallecobros.getzona_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_IDGRUPOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
					iRow++;

					for(CobrarDetalleCobros cobrardetallecobros:cobrardetallecobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrardetallecobros.getgrupocliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_IDVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_IDVENDEDOR);
					iRow++;

					for(CobrarDetalleCobros cobrardetallecobros:cobrardetallecobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrardetallecobros.getvendedor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(CobrarDetalleCobros cobrardetallecobros:cobrardetallecobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrardetallecobros.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(CobrarDetalleCobros cobrardetallecobros:cobrardetallecobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrardetallecobros.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBREVENDEDOR);
					iRow++;

					for(CobrarDetalleCobros cobrardetallecobros:cobrardetallecobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrardetallecobros.getnombre_vendedor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(CobrarDetalleCobros cobrardetallecobros:cobrardetallecobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrardetallecobros.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(CobrarDetalleCobros cobrardetallecobros:cobrardetallecobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrardetallecobros.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_APELLIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_APELLIDO);
					iRow++;

					for(CobrarDetalleCobros cobrardetallecobros:cobrardetallecobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrardetallecobros.getapellido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURAS);
					iRow++;

					for(CobrarDetalleCobros cobrardetallecobros:cobrardetallecobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrardetallecobros.gettotal_facturas());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALABONOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALABONOS);
					iRow++;

					for(CobrarDetalleCobros cobrardetallecobros:cobrardetallecobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrardetallecobros.gettotal_abonos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURASACTUAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURASACTUAL);
					iRow++;

					for(CobrarDetalleCobros cobrardetallecobros:cobrardetallecobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrardetallecobros.gettotal_facturas_actual());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSANTERIOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSANTERIOR);
					iRow++;

					for(CobrarDetalleCobros cobrardetallecobros:cobrardetallecobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrardetallecobros.getabonos_anterior());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSACTUAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSACTUAL);
					iRow++;

					for(CobrarDetalleCobros cobrardetallecobros:cobrardetallecobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrardetallecobros.getabonos_actual());
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
			//	this.getFilaCabeceraExportarExcelCobrarDetalleCobros(row);				
			//	iRow++;
			//}				
			
			//for(CobrarDetalleCobros cobrardetallecobrosAux:cobrardetallecobrossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCobrarDetalleCobros(cobrardetallecobrosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Detalle Cobros",JOptionPane.INFORMATION_MESSAGE);
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
				this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarDetalleCobros(false);
			
			//SI ES MANUAL
			if(CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarDetalleCobros();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarDetalleCobros(false);
			
			//SI ES MANUAL
			if(CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarDetalleCobros();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarDetalleCobros(false);
			
			//SI ES MANUAL
			if(CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarDetalleCobros();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCobrarDetalleCobros() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCobrarDetalleCobros.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCobrarDetalleCobros.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCobrarDetalleCobros.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCobrarDetalleCobros.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCobrarDetalleCobros.setMinimumSize(dimensionMinimum);
		this.jTableDatosCobrarDetalleCobros.setMaximumSize(dimensionMaximum);
		this.jTableDatosCobrarDetalleCobros.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCobrarDetalleCobros(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCobrarDetalleCobros(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCobrarDetalleCobros(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCobrarDetalleCobros(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCobrarDetalleCobros(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCobrarDetalleCobros(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarDetalleCobros(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCobrarDetalleCobros(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCobrarDetalleCobros() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCobrarDetalleCobros();
		
		this.inicializarActualizarBindingBotonesManualCobrarDetalleCobros(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarDetalleCobros();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarDetalleCobros() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarDetalleCobros(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarDetalleCobros(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCobrarDetalleCobros.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCobrarDetalleCobros.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCobrarDetalleCobros.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCobrarDetalleCobros.jCheckBoxPostAccionNuevoCobrarDetalleCobros.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCobrarDetalleCobros.jCheckBoxPostAccionSinCerrarCobrarDetalleCobros.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCobrarDetalleCobros.jCheckBoxPostAccionSinMensajeCobrarDetalleCobros.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCobrarDetalleCobros.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCobrarDetalleCobros.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCobrarDetalleCobros.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
				this.jInternalFrameDetalleFormCobrarDetalleCobros.jCheckBoxPostAccionNuevoCobrarDetalleCobros.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCobrarDetalleCobros.jCheckBoxPostAccionSinCerrarCobrarDetalleCobros.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCobrarDetalleCobros.jCheckBoxPostAccionSinMensajeCobrarDetalleCobros.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCobrarDetalleCobros.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCobrarDetalleCobros.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxTiposAccionesFormularioCobrarDetalleCobros.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCobrarDetalleCobros.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCobrarDetalleCobros!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCobrarDetalleCobros.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCobrarDetalleCobros.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCobrarDetalleCobros.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCobrarDetalleCobros.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCobrarDetalleCobros!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCobrarDetalleCobros.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCobrarDetalleCobros.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCobrarDetalleCobros(Boolean esInicializar) throws Exception {
		try	{	
			if(CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarDetalleCobros(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCobrarDetalleCobros() throws Exception {
		try	{
			if(CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarDetalleCobros();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarDetalleCobros() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxTiposAccionesFormularioCobrarDetalleCobros.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxTiposAccionesFormularioCobrarDetalleCobros.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarDetalleCobros() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCobrarDetalleCobros.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCobrarDetalleCobros.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCobrarDetalleCobros.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCobrarDetalleCobros.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCobrarDetalleCobros.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCobrarDetalleCobros.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCobrarDetalleCobros.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCobrarDetalleCobros.addItem(reporte);
			}
			
			
			if(!this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCobrarDetalleCobros.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCobrarDetalleCobros.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCobrarDetalleCobros.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCobrarDetalleCobros.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCobrarDetalleCobros.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCobrarDetalleCobros.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxTiposAccionesFormularioCobrarDetalleCobros.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxTiposAccionesFormularioCobrarDetalleCobros.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCobrarDetalleCobros.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCobrarDetalleCobros.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCobrarDetalleCobros.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarDetalleCobros();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarDetalleCobros() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarDetalleCobros!=null) {
				this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarDetalleCobros!=null) {
				this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCobrarDetalleCobros!=null) {
				
				if(this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CobrarDetalleCobrosConstantesFunciones.getTiposSeleccionarCobrarDetalleCobros(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CobrarDetalleCobrosConstantesFunciones.getTiposSeleccionarCobrarDetalleCobros(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CobrarDetalleCobrosConstantesFunciones.getTiposSeleccionarCobrarDetalleCobros(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCobrarDetalleCobros()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros.getSelectedItem()!=null){this.id_paisBusquedaCobrarDetalleCobros=((Pais)this.jComboBoxid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros.getSelectedItem()).getId();}
		if(this.jComboBoxid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros.getSelectedItem()!=null){this.id_ciudadBusquedaCobrarDetalleCobros=((Ciudad)this.jComboBoxid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros.getSelectedItem()).getId();}
		if(this.jComboBoxid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.getSelectedItem()!=null){this.id_zonaBusquedaCobrarDetalleCobros=((Zona)this.jComboBoxid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.getSelectedItem()).getId();}
		if(this.jComboBoxid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros.getSelectedItem()!=null){this.id_grupo_clienteBusquedaCobrarDetalleCobros=((GrupoCliente)this.jComboBoxid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros.getSelectedItem()).getId();}
		if(this.jComboBoxid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros.getSelectedItem()!=null){this.id_vendedorBusquedaCobrarDetalleCobros=((Vendedor)this.jComboBoxid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros.getSelectedItem()).getId();}
		this.fecha_emisionBusquedaCobrarDetalleCobros=new Date(this.jDateChooserfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros.getDate().getTime());
		this.fecha_emision_hastaBusquedaCobrarDetalleCobros=new Date(this.jDateChooserfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCobrarDetalleCobros(Boolean esInicializar) throws Exception {				
		if(CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarDetalleCobros();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCobrarDetalleCobros() throws Exception {
		this.inicializarActualizarBindingTablaCobrarDetalleCobros(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCobrarDetalleCobros() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCobrarDetalleCobros.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCobrarDetalleCobros.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarDetalleCobros.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CobrarDetalleCobrosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCobrarDetalleCobros.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarDetalleCobros.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CobrarDetalleCobrosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCobrarDetalleCobrosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarDetalleCobrosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CobrarDetalleCobrosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCobrarDetalleCobros.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarDetalleCobros.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CobrarDetalleCobrosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCobrarDetalleCobros.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCobrarDetalleCobros(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cobrardetallecobrosLogic.getCobrarDetalleCobross().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cobrardetallecobross.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCobrarDetalleCobros.setModel(new CobrarDetalleCobrosModel(this.cobrardetallecobrosLogic.getCobrarDetalleCobross(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCobrarDetalleCobros.setModel(new CobrarDetalleCobrosModel(this.cobrardetallecobross,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCobrarDetalleCobros!=null && this.jInternalFrameOrderByCobrarDetalleCobros.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCobrarDetalleCobros();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarDetalleCobros,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CobrarDetalleCobrosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO,cobrardetallecobrosConstantesFunciones.resaltarSeleccionarCobrarDetalleCobros,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO,cobrardetallecobrosConstantesFunciones.resaltarSeleccionarCobrarDetalleCobros,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarDetalleCobros,CobrarDetalleCobrosConstantesFunciones.LABEL_ID));

		if(this.cobrardetallecobrosConstantesFunciones.mostraridCobrarDetalleCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarDetalleCobrosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrardetallecobrosConstantesFunciones.resaltaridCobrarDetalleCobros,this.cobrardetallecobrosConstantesFunciones.activaridCobrarDetalleCobros,iSizeTabla,this,true,"idCobrarDetalleCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrardetallecobrosConstantesFunciones.resaltaridCobrarDetalleCobros,this.cobrardetallecobrosConstantesFunciones.activaridCobrarDetalleCobros,this,true,"idCobrarDetalleCobros","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarDetalleCobros,CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBREVENDEDOR));

		if(this.cobrardetallecobrosConstantesFunciones.mostrarnombre_vendedorCobrarDetalleCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBREVENDEDOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrardetallecobrosConstantesFunciones.resaltarnombre_vendedorCobrarDetalleCobros,this.cobrardetallecobrosConstantesFunciones.activarnombre_vendedorCobrarDetalleCobros,iSizeTabla,this,true,"nombre_vendedorCobrarDetalleCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrardetallecobrosConstantesFunciones.resaltarnombre_vendedorCobrarDetalleCobros,this.cobrardetallecobrosConstantesFunciones.activarnombre_vendedorCobrarDetalleCobros,this,true,"nombre_vendedorCobrarDetalleCobros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarDetalleCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarDetalleCobros,CobrarDetalleCobrosConstantesFunciones.LABEL_CODIGO));

		if(this.cobrardetallecobrosConstantesFunciones.mostrarcodigoCobrarDetalleCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarDetalleCobrosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrardetallecobrosConstantesFunciones.resaltarcodigoCobrarDetalleCobros,this.cobrardetallecobrosConstantesFunciones.activarcodigoCobrarDetalleCobros,iSizeTabla,this,true,"codigoCobrarDetalleCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrardetallecobrosConstantesFunciones.resaltarcodigoCobrarDetalleCobros,this.cobrardetallecobrosConstantesFunciones.activarcodigoCobrarDetalleCobros,this,true,"codigoCobrarDetalleCobros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarDetalleCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarDetalleCobros,CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBRE));

		if(this.cobrardetallecobrosConstantesFunciones.mostrarnombreCobrarDetalleCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrardetallecobrosConstantesFunciones.resaltarnombreCobrarDetalleCobros,this.cobrardetallecobrosConstantesFunciones.activarnombreCobrarDetalleCobros,iSizeTabla,this,true,"nombreCobrarDetalleCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrardetallecobrosConstantesFunciones.resaltarnombreCobrarDetalleCobros,this.cobrardetallecobrosConstantesFunciones.activarnombreCobrarDetalleCobros,this,true,"nombreCobrarDetalleCobros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarDetalleCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarDetalleCobros,CobrarDetalleCobrosConstantesFunciones.LABEL_APELLIDO));

		if(this.cobrardetallecobrosConstantesFunciones.mostrarapellidoCobrarDetalleCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarDetalleCobrosConstantesFunciones.LABEL_APELLIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrardetallecobrosConstantesFunciones.resaltarapellidoCobrarDetalleCobros,this.cobrardetallecobrosConstantesFunciones.activarapellidoCobrarDetalleCobros,iSizeTabla,this,true,"apellidoCobrarDetalleCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrardetallecobrosConstantesFunciones.resaltarapellidoCobrarDetalleCobros,this.cobrardetallecobrosConstantesFunciones.activarapellidoCobrarDetalleCobros,this,true,"apellidoCobrarDetalleCobros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarDetalleCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarDetalleCobros,CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURAS));

		if(this.cobrardetallecobrosConstantesFunciones.mostrartotal_facturasCobrarDetalleCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrardetallecobrosConstantesFunciones.resaltartotal_facturasCobrarDetalleCobros,this.cobrardetallecobrosConstantesFunciones.activartotal_facturasCobrarDetalleCobros,iSizeTabla,this,true,"total_facturasCobrarDetalleCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrardetallecobrosConstantesFunciones.resaltartotal_facturasCobrarDetalleCobros,this.cobrardetallecobrosConstantesFunciones.activartotal_facturasCobrarDetalleCobros,this,true,"total_facturasCobrarDetalleCobros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarDetalleCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarDetalleCobros,CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALABONOS));

		if(this.cobrardetallecobrosConstantesFunciones.mostrartotal_abonosCobrarDetalleCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALABONOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrardetallecobrosConstantesFunciones.resaltartotal_abonosCobrarDetalleCobros,this.cobrardetallecobrosConstantesFunciones.activartotal_abonosCobrarDetalleCobros,iSizeTabla,this,true,"total_abonosCobrarDetalleCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrardetallecobrosConstantesFunciones.resaltartotal_abonosCobrarDetalleCobros,this.cobrardetallecobrosConstantesFunciones.activartotal_abonosCobrarDetalleCobros,this,true,"total_abonosCobrarDetalleCobros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarDetalleCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarDetalleCobros,CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURASACTUAL));

		if(this.cobrardetallecobrosConstantesFunciones.mostrartotal_facturas_actualCobrarDetalleCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURASACTUAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrardetallecobrosConstantesFunciones.resaltartotal_facturas_actualCobrarDetalleCobros,this.cobrardetallecobrosConstantesFunciones.activartotal_facturas_actualCobrarDetalleCobros,iSizeTabla,this,true,"total_facturas_actualCobrarDetalleCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrardetallecobrosConstantesFunciones.resaltartotal_facturas_actualCobrarDetalleCobros,this.cobrardetallecobrosConstantesFunciones.activartotal_facturas_actualCobrarDetalleCobros,this,true,"total_facturas_actualCobrarDetalleCobros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarDetalleCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarDetalleCobros,CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSANTERIOR));

		if(this.cobrardetallecobrosConstantesFunciones.mostrarabonos_anteriorCobrarDetalleCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSANTERIOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrardetallecobrosConstantesFunciones.resaltarabonos_anteriorCobrarDetalleCobros,this.cobrardetallecobrosConstantesFunciones.activarabonos_anteriorCobrarDetalleCobros,iSizeTabla,this,true,"abonos_anteriorCobrarDetalleCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrardetallecobrosConstantesFunciones.resaltarabonos_anteriorCobrarDetalleCobros,this.cobrardetallecobrosConstantesFunciones.activarabonos_anteriorCobrarDetalleCobros,this,true,"abonos_anteriorCobrarDetalleCobros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarDetalleCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarDetalleCobros,CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSACTUAL));

		if(this.cobrardetallecobrosConstantesFunciones.mostrarabonos_actualCobrarDetalleCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSACTUAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrardetallecobrosConstantesFunciones.resaltarabonos_actualCobrarDetalleCobros,this.cobrardetallecobrosConstantesFunciones.activarabonos_actualCobrarDetalleCobros,iSizeTabla,this,true,"abonos_actualCobrarDetalleCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrardetallecobrosConstantesFunciones.resaltarabonos_actualCobrarDetalleCobros,this.cobrardetallecobrosConstantesFunciones.activarabonos_actualCobrarDetalleCobros,this,true,"abonos_actualCobrarDetalleCobros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarDetalleCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarDetalleCobros.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarDetalleCobros.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCobrarDetalleCobros && this.isPermisoGuardarCambiosCobrarDetalleCobros) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCobrarDetalleCobros.addColumn(tableColumn);
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
			
			this.jTableDatosCobrarDetalleCobros.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarDetalleCobros && this.isPermisoGuardarCambiosCobrarDetalleCobros) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarDetalleCobros && this.isPermisoGuardarCambiosCobrarDetalleCobros) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCobrarDetalleCobros.moveColumn(this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCobrarDetalleCobros.moveColumn(this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCobrarDetalleCobros.moveColumn(this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCobrarDetalleCobros.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCobrarDetalleCobros.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCobrarDetalleCobros,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCobrarDetalleCobros.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCobrarDetalleCobros.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCobrarDetalleCobros.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=cobrardetallecobrosLogic.getCobrarDetalleCobross().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cobrardetallecobross.size()-1;
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
		//this.jTableDatosCobrarDetalleCobros.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCobrarDetalleCobros();
			
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
				
				//this.isEsNuevoCobrarDetalleCobros=false;
					
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
			
				if(this.cobrardetallecobrosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCobrarDetalleCobros==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarDetalleCobros.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarDetalleCobros.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cobrardetallecobros.getsType().equals("DUPLICADO")
				   || this.cobrardetallecobros.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCobrarDetalleCobros=true;
				
				} else {
					this.isEsNuevoCobrarDetalleCobros=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
					if(this.cobrardetallecobros.getId()>=0 && !this.cobrardetallecobros.getIsNew()) {						
						this.isEsNuevoCobrarDetalleCobros=false;
						
					} else {
						this.isEsNuevoCobrarDetalleCobros=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCobrarDetalleCobros(esRelaciones);						
				
				this.seleccionarCobrarDetalleCobros(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cobrardetallecobros.getId()<0) {
					this.isEsNuevoCobrarDetalleCobros=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCobrarDetalleCobros(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCobrarDetalleCobros(evt,rowIndex);
				}	
				
				if(this.cobrardetallecobrosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CobrarDetalleCobros: " + this.dDif); 
					}
				}								
				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCobrarDetalleCobros(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cobrardetallecobros)) {
					if(this.cobrardetallecobros.getId()>0) {
						this.cobrardetallecobros.setIsDeleted(true);
						
						this.cobrardetallecobrossEliminados.add(this.cobrardetallecobros);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrardetallecobrosLogic.getCobrarDetalleCobross().remove(this.cobrardetallecobros);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrardetallecobross.remove(this.cobrardetallecobros);				
					}
					
					
					((CobrarDetalleCobrosModel) this.jTableDatosCobrarDetalleCobros.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarDetalleCobros(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCobrarDetalleCobros(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCobrarDetalleCobros) {
			
			if(this.jInternalFrameDetalleFormCobrarDetalleCobros==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarDetalleCobros.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarDetalleCobros.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCobrarDetalleCobros(this.cobrardetallecobros);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCobrarDetalleCobros("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCobrarDetalleCobros(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarDetalleCobros() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarDetalleCobros(CobrarDetalleCobros cobrardetallecobros) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCobrarDetalleCobros(cobrardetallecobros,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarDetalleCobros(CobrarDetalleCobros cobrardetallecobros,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCobrarDetalleCobros(cobrardetallecobros);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCobrarDetalleCobros(cobrardetallecobros,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCobrarDetalleCobros(cobrardetallecobros);
	}
	
	public void setVariablesObjetoActualToFormularioCobrarDetalleCobros(CobrarDetalleCobros cobrardetallecobros) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCobrarDetalleCobros==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelidCobrarDetalleCobros.setText(cobrardetallecobros.getId().toString());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreanombre_vendedorCobrarDetalleCobros.setText(cobrardetallecobros.getnombre_vendedor());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldcodigoCobrarDetalleCobros.setText(cobrardetallecobros.getcodigo());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreanombreCobrarDetalleCobros.setText(cobrardetallecobros.getnombre());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreaapellidoCobrarDetalleCobros.setText(cobrardetallecobros.getapellido());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_facturasCobrarDetalleCobros.setText(cobrardetallecobros.gettotal_facturas().toString());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_abonosCobrarDetalleCobros.setText(cobrardetallecobros.gettotal_abonos().toString());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_facturas_actualCobrarDetalleCobros.setText(cobrardetallecobros.gettotal_facturas_actual().toString());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldabonos_anteriorCobrarDetalleCobros.setText(cobrardetallecobros.getabonos_anterior().toString());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldabonos_actualCobrarDetalleCobros.setText(cobrardetallecobros.getabonos_actual().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CobrarDetalleCobros cobrardetallecobrosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cobrardetallecobrosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CobrarDetalleCobros cobrardetallecobrosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cobrardetallecobrosLocal=this.cobrardetallecobros;
			} else {
				cobrardetallecobrosLocal=this.cobrardetallecobrosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cobrardetallecobrosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCobrarDetalleCobros(cobrardetallecobrosLocal,true);
					
					if(cobrardetallecobrosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cobrardetallecobrosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cobrardetallecobrosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCobrarDetalleCobros(CobrarDetalleCobros cobrardetallecobros,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(cobrardetallecobros,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(cobrardetallecobros);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarDetalleCobros(CobrarDetalleCobros cobrardetallecobros,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(cobrardetallecobros,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarDetalleCobros(CobrarDetalleCobros cobrardetallecobros,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCobrarDetalleCobros==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelidCobrarDetalleCobros.getText()==null || this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelidCobrarDetalleCobros.getText()=="" || this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelidCobrarDetalleCobros.getText()=="Id") {
				this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelidCobrarDetalleCobros.setText("0");
			}

			if(conColumnasBase) {cobrardetallecobros.setId(Long.parseLong(this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelidCobrarDetalleCobros.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarDetalleCobrosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelIdCobrarDetalleCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrardetallecobros.setnombre_vendedor(this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreanombre_vendedorCobrarDetalleCobros.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBREVENDEDOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelnombre_vendedorCobrarDetalleCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrardetallecobros.setcodigo(this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldcodigoCobrarDetalleCobros.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarDetalleCobrosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelcodigoCobrarDetalleCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrardetallecobros.setnombre(this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreanombreCobrarDetalleCobros.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelnombreCobrarDetalleCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrardetallecobros.setapellido(this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreaapellidoCobrarDetalleCobros.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarDetalleCobrosConstantesFunciones.LABEL_APELLIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelapellidoCobrarDetalleCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrardetallecobros.settotal_facturas(Double.parseDouble(this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_facturasCobrarDetalleCobros.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabeltotal_facturasCobrarDetalleCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrardetallecobros.settotal_abonos(Double.parseDouble(this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_abonosCobrarDetalleCobros.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALABONOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabeltotal_abonosCobrarDetalleCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrardetallecobros.settotal_facturas_actual(Double.parseDouble(this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_facturas_actualCobrarDetalleCobros.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURASACTUAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabeltotal_facturas_actualCobrarDetalleCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrardetallecobros.setabonos_anterior(Double.parseDouble(this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldabonos_anteriorCobrarDetalleCobros.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSANTERIOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelabonos_anteriorCobrarDetalleCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrardetallecobros.setabonos_actual(Double.parseDouble(this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldabonos_actualCobrarDetalleCobros.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSACTUAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelabonos_actualCobrarDetalleCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarDetalleCobros(CobrarDetalleCobros cobrardetallecobrosBean,CobrarDetalleCobros cobrardetallecobros,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCobrarDetalleCobros(CobrarDetalleCobros cobrardetallecobrosOrigen,CobrarDetalleCobros cobrardetallecobros,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrardetallecobrosOrigen.getId()!=null && !cobrardetallecobrosOrigen.getId().equals(0L))) {cobrardetallecobros.setId(cobrardetallecobrosOrigen.getId());}}
			if(conDefault || (!conDefault && cobrardetallecobrosOrigen.getfecha_emision()!=null && !cobrardetallecobrosOrigen.getfecha_emision().equals(new Date()))) {cobrardetallecobros.setfecha_emision(cobrardetallecobrosOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && cobrardetallecobrosOrigen.getfecha_emision_hasta()!=null && !cobrardetallecobrosOrigen.getfecha_emision_hasta().equals(new Date()))) {cobrardetallecobros.setfecha_emision_hasta(cobrardetallecobrosOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && cobrardetallecobrosOrigen.getnombre_vendedor()!=null && !cobrardetallecobrosOrigen.getnombre_vendedor().equals(""))) {cobrardetallecobros.setnombre_vendedor(cobrardetallecobrosOrigen.getnombre_vendedor());}
			if(conDefault || (!conDefault && cobrardetallecobrosOrigen.getcodigo()!=null && !cobrardetallecobrosOrigen.getcodigo().equals(""))) {cobrardetallecobros.setcodigo(cobrardetallecobrosOrigen.getcodigo());}
			if(conDefault || (!conDefault && cobrardetallecobrosOrigen.getnombre()!=null && !cobrardetallecobrosOrigen.getnombre().equals(""))) {cobrardetallecobros.setnombre(cobrardetallecobrosOrigen.getnombre());}
			if(conDefault || (!conDefault && cobrardetallecobrosOrigen.getapellido()!=null && !cobrardetallecobrosOrigen.getapellido().equals(""))) {cobrardetallecobros.setapellido(cobrardetallecobrosOrigen.getapellido());}
			if(conDefault || (!conDefault && cobrardetallecobrosOrigen.gettotal_facturas()!=null && !cobrardetallecobrosOrigen.gettotal_facturas().equals(0.0))) {cobrardetallecobros.settotal_facturas(cobrardetallecobrosOrigen.gettotal_facturas());}
			if(conDefault || (!conDefault && cobrardetallecobrosOrigen.gettotal_abonos()!=null && !cobrardetallecobrosOrigen.gettotal_abonos().equals(0.0))) {cobrardetallecobros.settotal_abonos(cobrardetallecobrosOrigen.gettotal_abonos());}
			if(conDefault || (!conDefault && cobrardetallecobrosOrigen.gettotal_facturas_actual()!=null && !cobrardetallecobrosOrigen.gettotal_facturas_actual().equals(0.0))) {cobrardetallecobros.settotal_facturas_actual(cobrardetallecobrosOrigen.gettotal_facturas_actual());}
			if(conDefault || (!conDefault && cobrardetallecobrosOrigen.getabonos_anterior()!=null && !cobrardetallecobrosOrigen.getabonos_anterior().equals(0.0))) {cobrardetallecobros.setabonos_anterior(cobrardetallecobrosOrigen.getabonos_anterior());}
			if(conDefault || (!conDefault && cobrardetallecobrosOrigen.getabonos_actual()!=null && !cobrardetallecobrosOrigen.getabonos_actual().equals(0.0))) {cobrardetallecobros.setabonos_actual(cobrardetallecobrosOrigen.getabonos_actual());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarDetalleCobros(CobrarDetalleCobros cobrardetallecobros) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelidCobrarDetalleCobros.setText(cobrardetallecobros.getId().toString());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreanombre_vendedorCobrarDetalleCobros.setText(cobrardetallecobros.getnombre_vendedor());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldcodigoCobrarDetalleCobros.setText(cobrardetallecobros.getcodigo());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreanombreCobrarDetalleCobros.setText(cobrardetallecobros.getnombre());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreaapellidoCobrarDetalleCobros.setText(cobrardetallecobros.getapellido());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_facturasCobrarDetalleCobros.setText(cobrardetallecobros.gettotal_facturas().toString());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_abonosCobrarDetalleCobros.setText(cobrardetallecobros.gettotal_abonos().toString());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_facturas_actualCobrarDetalleCobros.setText(cobrardetallecobros.gettotal_facturas_actual().toString());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldabonos_anteriorCobrarDetalleCobros.setText(cobrardetallecobros.getabonos_anterior().toString());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldabonos_actualCobrarDetalleCobros.setText(cobrardetallecobros.getabonos_actual().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarDetalleCobros(CobrarDetalleCobrosBean cobrardetallecobrosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelidCobrarDetalleCobros.setText(cobrardetallecobrosBean.getId().toString());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreanombre_vendedorCobrarDetalleCobros.setText(cobrardetallecobrosBean.getnombre_vendedor());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldcodigoCobrarDetalleCobros.setText(cobrardetallecobrosBean.getcodigo());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreanombreCobrarDetalleCobros.setText(cobrardetallecobrosBean.getnombre());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreaapellidoCobrarDetalleCobros.setText(cobrardetallecobrosBean.getapellido());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_facturasCobrarDetalleCobros.setText(cobrardetallecobrosBean.gettotal_facturas().toString());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_abonosCobrarDetalleCobros.setText(cobrardetallecobrosBean.gettotal_abonos().toString());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_facturas_actualCobrarDetalleCobros.setText(cobrardetallecobrosBean.gettotal_facturas_actual().toString());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldabonos_anteriorCobrarDetalleCobros.setText(cobrardetallecobrosBean.getabonos_anterior().toString());
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldabonos_actualCobrarDetalleCobros.setText(cobrardetallecobrosBean.getabonos_actual().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCobrarDetalleCobros(CobrarDetalleCobrosParameterReturnGeneral cobrardetallecobrosReturnGeneral,CobrarDetalleCobrosBean cobrardetallecobrosBean,Boolean conDefault) throws Exception { 
		try {
			CobrarDetalleCobros cobrardetallecobrosLocal=new CobrarDetalleCobros();
			
			cobrardetallecobrosLocal=cobrardetallecobrosReturnGeneral.getCobrarDetalleCobros();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrardetallecobrosLocal.getId()!=null && !cobrardetallecobrosLocal.getId().equals(0L))) {cobrardetallecobrosBean.setId(cobrardetallecobrosLocal.getId());}}
			if(conDefault || (!conDefault && cobrardetallecobrosLocal.getnombre_vendedor()!=null && !cobrardetallecobrosLocal.getnombre_vendedor().equals(""))) {cobrardetallecobrosBean.setnombre_vendedor(cobrardetallecobrosLocal.getnombre_vendedor());}
			if(conDefault || (!conDefault && cobrardetallecobrosLocal.getcodigo()!=null && !cobrardetallecobrosLocal.getcodigo().equals(""))) {cobrardetallecobrosBean.setcodigo(cobrardetallecobrosLocal.getcodigo());}
			if(conDefault || (!conDefault && cobrardetallecobrosLocal.getnombre()!=null && !cobrardetallecobrosLocal.getnombre().equals(""))) {cobrardetallecobrosBean.setnombre(cobrardetallecobrosLocal.getnombre());}
			if(conDefault || (!conDefault && cobrardetallecobrosLocal.getapellido()!=null && !cobrardetallecobrosLocal.getapellido().equals(""))) {cobrardetallecobrosBean.setapellido(cobrardetallecobrosLocal.getapellido());}
			if(conDefault || (!conDefault && cobrardetallecobrosLocal.gettotal_facturas()!=null && !cobrardetallecobrosLocal.gettotal_facturas().equals(0.0))) {cobrardetallecobrosBean.settotal_facturas(cobrardetallecobrosLocal.gettotal_facturas());}
			if(conDefault || (!conDefault && cobrardetallecobrosLocal.gettotal_abonos()!=null && !cobrardetallecobrosLocal.gettotal_abonos().equals(0.0))) {cobrardetallecobrosBean.settotal_abonos(cobrardetallecobrosLocal.gettotal_abonos());}
			if(conDefault || (!conDefault && cobrardetallecobrosLocal.gettotal_facturas_actual()!=null && !cobrardetallecobrosLocal.gettotal_facturas_actual().equals(0.0))) {cobrardetallecobrosBean.settotal_facturas_actual(cobrardetallecobrosLocal.gettotal_facturas_actual());}
			if(conDefault || (!conDefault && cobrardetallecobrosLocal.getabonos_anterior()!=null && !cobrardetallecobrosLocal.getabonos_anterior().equals(0.0))) {cobrardetallecobrosBean.setabonos_anterior(cobrardetallecobrosLocal.getabonos_anterior());}
			if(conDefault || (!conDefault && cobrardetallecobrosLocal.getabonos_actual()!=null && !cobrardetallecobrosLocal.getabonos_actual().equals(0.0))) {cobrardetallecobrosBean.setabonos_actual(cobrardetallecobrosLocal.getabonos_actual());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCobrarDetalleCobrosGenerico(Long idCobrarDetalleCobrosSeleccionado,JComboBox jComboBoxCobrarDetalleCobros,List<CobrarDetalleCobros> cobrardetallecobrossLocal)throws Exception {
		try {
			CobrarDetalleCobros  cobrardetallecobrosTemp=null;

			for(CobrarDetalleCobros cobrardetallecobrosAux:cobrardetallecobrossLocal) {
				if(cobrardetallecobrosAux.getId()!=null && cobrardetallecobrosAux.getId().equals(idCobrarDetalleCobrosSeleccionado)) {
					cobrardetallecobrosTemp=cobrardetallecobrosAux;
					break;
				}
			}

			jComboBoxCobrarDetalleCobros.setSelectedItem(cobrardetallecobrosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCobrarDetalleCobrosGenerico(JComboBox jComboBoxCobrarDetalleCobros,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarDetalleCobros.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCobrarDetalleCobros.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarDetalleCobros.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCobrarDetalleCobros.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrardetallecobros=(CobrarDetalleCobros) cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrardetallecobros =(CobrarDetalleCobros) cobrardetallecobross.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cobrardetallecobros.getIsNew() && !cobrardetallecobros.getIsChanged() && !cobrardetallecobros.getIsDeleted()) {
				sDescripcion=cobrardetallecobros.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cobrardetallecobros.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!cobrardetallecobros.getIsNew() && !cobrardetallecobros.getIsChanged() && !cobrardetallecobros.getIsDeleted()) {
				sDescripcion=cobrardetallecobros.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=cobrardetallecobros.getpais_descripcion();
			}
		}

		if(sTipo.equals("Ciudad")) {
			//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
			if(!cobrardetallecobros.getIsNew() && !cobrardetallecobros.getIsChanged() && !cobrardetallecobros.getIsDeleted()) {
				sDescripcion=cobrardetallecobros.getciudad_descripcion();
			} else {
				//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
				sDescripcion=cobrardetallecobros.getciudad_descripcion();
			}
		}

		if(sTipo.equals("Zona")) {
			//sDescripcion=this.getActualZonaForeignKeyDescripcion((Long)value);
			if(!cobrardetallecobros.getIsNew() && !cobrardetallecobros.getIsChanged() && !cobrardetallecobros.getIsDeleted()) {
				sDescripcion=cobrardetallecobros.getzona_descripcion();
			} else {
				//sDescripcion=this.getActualZonaForeignKeyDescripcion((Long)value);
				sDescripcion=cobrardetallecobros.getzona_descripcion();
			}
		}

		if(sTipo.equals("GrupoCliente")) {
			//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
			if(!cobrardetallecobros.getIsNew() && !cobrardetallecobros.getIsChanged() && !cobrardetallecobros.getIsDeleted()) {
				sDescripcion=cobrardetallecobros.getgrupocliente_descripcion();
			} else {
				//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
				sDescripcion=cobrardetallecobros.getgrupocliente_descripcion();
			}
		}

		if(sTipo.equals("Vendedor")) {
			//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
			if(!cobrardetallecobros.getIsNew() && !cobrardetallecobros.getIsChanged() && !cobrardetallecobros.getIsDeleted()) {
				sDescripcion=cobrardetallecobros.getvendedor_descripcion();
			} else {
				//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
				sDescripcion=cobrardetallecobros.getvendedor_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CobrarDetalleCobros cobrardetallecobrosRow=new CobrarDetalleCobros();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrardetallecobrosRow=(CobrarDetalleCobros) cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrardetallecobrosRow=(CobrarDetalleCobros) cobrardetallecobross.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCobrarDetalleCobros(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaNuevoCobrarDetalleCobros && this.isPermisoNuevoCobrarDetalleCobros));			
			this.jButtonDuplicarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaDuplicarCobrarDetalleCobros && this.isPermisoDuplicarCobrarDetalleCobros));			
			this.jButtonCopiarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaCopiarCobrarDetalleCobros && this.isPermisoCopiarCobrarDetalleCobros));
			this.jButtonVerFormCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaVerFormCobrarDetalleCobros && this.isPermisoVerFormCobrarDetalleCobros));
			
			this.jButtonAbrirOrderByCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaOrdenCobrarDetalleCobros && this.isPermisoOrdenCobrarDetalleCobros));			
			
			this.jButtonNuevoRelacionesCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros && this.isPermisoNuevoCobrarDetalleCobros));			
			this.jButtonNuevoGuardarCambiosCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaNuevoCobrarDetalleCobros && this.isPermisoNuevoCobrarDetalleCobros && this.isPermisoGuardarCambiosCobrarDetalleCobros));
			
			if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonModificarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaModificarCobrarDetalleCobros && this.isPermisoActualizarCobrarDetalleCobros));	
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonActualizarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaActualizarCobrarDetalleCobros && this.isPermisoActualizarCobrarDetalleCobros));	
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonEliminarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaEliminarCobrarDetalleCobros && this.isPermisoEliminarCobrarDetalleCobros));
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonCancelarCobrarDetalleCobros.setVisible(this.isVisibilidadCeldaCancelarCobrarDetalleCobros);							
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonGuardarCambiosCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaGuardarCobrarDetalleCobros && this.isPermisoGuardarCambiosCobrarDetalleCobros));			
			
			}
						
			this.jButtonGuardarCambiosTablaCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros && this.isPermisoGuardarCambiosCobrarDetalleCobros));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaNuevoCobrarDetalleCobros && this.isPermisoNuevoCobrarDetalleCobros));						
			this.jButtonDuplicarToolBarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaDuplicarCobrarDetalleCobros && this.isPermisoDuplicarCobrarDetalleCobros));						
			this.jButtonCopiarToolBarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaCopiarCobrarDetalleCobros && this.isPermisoCopiarCobrarDetalleCobros));			
			this.jButtonVerFormToolBarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaVerFormCobrarDetalleCobros && this.isPermisoVerFormCobrarDetalleCobros));			
			this.jButtonAbrirOrderByToolBarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaOrdenCobrarDetalleCobros && this.isPermisoOrdenCobrarDetalleCobros));
			this.jButtonNuevoRelacionesToolBarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros && this.isPermisoNuevoCobrarDetalleCobros));			
			this.jButtonNuevoGuardarCambiosToolBarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaNuevoCobrarDetalleCobros && this.isPermisoNuevoCobrarDetalleCobros && this.isPermisoGuardarCambiosCobrarDetalleCobros));			
			
			if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonModificarToolBarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaModificarCobrarDetalleCobros && this.isPermisoActualizarCobrarDetalleCobros));	
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonActualizarToolBarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaActualizarCobrarDetalleCobros  && this.isPermisoActualizarCobrarDetalleCobros));	
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonEliminarToolBarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaEliminarCobrarDetalleCobros && this.isPermisoEliminarCobrarDetalleCobros));
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonCancelarToolBarCobrarDetalleCobros.setVisible(this.isVisibilidadCeldaCancelarCobrarDetalleCobros);				
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonGuardarCambiosToolBarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaGuardarCobrarDetalleCobros && this.isPermisoGuardarCambiosCobrarDetalleCobros));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros && this.isPermisoGuardarCambiosCobrarDetalleCobros));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaNuevoCobrarDetalleCobros && this.isPermisoNuevoCobrarDetalleCobros));			
			this.jMenuItemDuplicarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaDuplicarCobrarDetalleCobros && this.isPermisoDuplicarCobrarDetalleCobros));			
			this.jMenuItemCopiarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaCopiarCobrarDetalleCobros && this.isPermisoCopiarCobrarDetalleCobros));			
			this.jMenuItemVerFormCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaVerFormCobrarDetalleCobros && this.isPermisoVerFormCobrarDetalleCobros));			
			this.jMenuItemAbrirOrderByCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaOrdenCobrarDetalleCobros && this.isPermisoOrdenCobrarDetalleCobros));			
			//this.jMenuItemMostrarOcultarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaOrdenCobrarDetalleCobros && this.isPermisoOrdenCobrarDetalleCobros));
			this.jMenuItemDetalleAbrirOrderByCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaOrdenCobrarDetalleCobros && this.isPermisoOrdenCobrarDetalleCobros));			
			//this.jMenuItemDetalleMostrarOcultarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaOrdenCobrarDetalleCobros && this.isPermisoOrdenCobrarDetalleCobros));			
			this.jMenuItemNuevoRelacionesCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros && this.isPermisoNuevoCobrarDetalleCobros));			
			this.jMenuItemNuevoGuardarCambiosCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaNuevoCobrarDetalleCobros && this.isPermisoNuevoCobrarDetalleCobros && this.isPermisoGuardarCambiosCobrarDetalleCobros));									
			
			if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jMenuItemModificarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaModificarCobrarDetalleCobros && this.isPermisoActualizarCobrarDetalleCobros));	
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jMenuItemActualizarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaActualizarCobrarDetalleCobros && this.isPermisoActualizarCobrarDetalleCobros));	
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jMenuItemEliminarCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaEliminarCobrarDetalleCobros && this.isPermisoEliminarCobrarDetalleCobros));
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jMenuItemCancelarCobrarDetalleCobros.setVisible(this.isVisibilidadCeldaCancelarCobrarDetalleCobros);				
			}
			
			this.jMenuItemGuardarCambiosCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaGuardarCobrarDetalleCobros && this.isPermisoGuardarCambiosCobrarDetalleCobros));						
			this.jMenuItemGuardarCambiosTablaCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros && this.isPermisoGuardarCambiosCobrarDetalleCobros));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCobrarDetalleCobros=this.jButtonNuevoCobrarDetalleCobros.isVisible();
			this.isVisibilidadCeldaDuplicarCobrarDetalleCobros=this.jButtonDuplicarCobrarDetalleCobros.isVisible();
			this.isVisibilidadCeldaCopiarCobrarDetalleCobros=this.jButtonCopiarCobrarDetalleCobros.isVisible();
			this.isVisibilidadCeldaVerFormCobrarDetalleCobros=this.jButtonVerFormCobrarDetalleCobros.isVisible();
			
			this.isVisibilidadCeldaOrdenCobrarDetalleCobros=this.jButtonAbrirOrderByCobrarDetalleCobros.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros=this.jButtonNuevoRelacionesCobrarDetalleCobros.isVisible();
			this.isVisibilidadCeldaModificarCobrarDetalleCobros=this.jButtonModificarCobrarDetalleCobros.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
			this.isVisibilidadCeldaActualizarCobrarDetalleCobros=this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonActualizarCobrarDetalleCobros.isVisible();
			this.isVisibilidadCeldaEliminarCobrarDetalleCobros=this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonEliminarCobrarDetalleCobros.isVisible();
			this.isVisibilidadCeldaCancelarCobrarDetalleCobros=this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonCancelarCobrarDetalleCobros.isVisible();
			this.isVisibilidadCeldaGuardarCobrarDetalleCobros=this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonGuardarCambiosCobrarDetalleCobros.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros=this.jButtonGuardarCambiosTablaCobrarDetalleCobros.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCobrarDetalleCobros=this.jButtonNuevoToolBarCobrarDetalleCobros.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros=this.jButtonNuevoRelacionesToolBarCobrarDetalleCobros.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
			this.isVisibilidadCeldaModificarCobrarDetalleCobros=this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonModificarToolBarCobrarDetalleCobros.isVisible();
			this.isVisibilidadCeldaActualizarCobrarDetalleCobros=this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonActualizarToolBarCobrarDetalleCobros.isVisible();
			this.isVisibilidadCeldaEliminarCobrarDetalleCobros=this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonEliminarToolBarCobrarDetalleCobros.isVisible();
			this.isVisibilidadCeldaCancelarCobrarDetalleCobros=this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonCancelarToolBarCobrarDetalleCobros.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarDetalleCobros=this.jButtonGuardarCambiosToolBarCobrarDetalleCobros.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros=this.jButtonGuardarCambiosTablaToolBarCobrarDetalleCobros.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCobrarDetalleCobros=this.jMenuItemNuevoCobrarDetalleCobros.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros=this.jMenuItemNuevoRelacionesCobrarDetalleCobros.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
			this.isVisibilidadCeldaModificarCobrarDetalleCobros=this.jInternalFrameDetalleFormCobrarDetalleCobros.jMenuItemModificarCobrarDetalleCobros.isVisible();
			this.isVisibilidadCeldaActualizarCobrarDetalleCobros=this.jInternalFrameDetalleFormCobrarDetalleCobros.jMenuItemActualizarCobrarDetalleCobros.isVisible();
			this.isVisibilidadCeldaEliminarCobrarDetalleCobros=this.jInternalFrameDetalleFormCobrarDetalleCobros.jMenuItemEliminarCobrarDetalleCobros.isVisible();
			this.isVisibilidadCeldaCancelarCobrarDetalleCobros=this.jInternalFrameDetalleFormCobrarDetalleCobros.jMenuItemCancelarCobrarDetalleCobros.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarDetalleCobros=this.jMenuItemGuardarCambiosCobrarDetalleCobros.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros=this.jMenuItemGuardarCambiosTablaCobrarDetalleCobros.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCobrarDetalleCobros(Boolean esInicializar) {
		if(CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cobrardetallecobrosSessionBean.getConGuardarRelaciones()) {
				//if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarDetalleCobros();
			}
			
			this.inicializarActualizarBindingBotonesManualCobrarDetalleCobros(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCobrarDetalleCobros() {
		this.jButtonNuevoCobrarDetalleCobros.setVisible(this.isPermisoNuevoCobrarDetalleCobros);			
		this.jButtonDuplicarCobrarDetalleCobros.setVisible(this.isPermisoDuplicarCobrarDetalleCobros);			
		this.jButtonCopiarCobrarDetalleCobros.setVisible(this.isPermisoCopiarCobrarDetalleCobros);			
		this.jButtonVerFormCobrarDetalleCobros.setVisible(this.isPermisoVerFormCobrarDetalleCobros);			
		
		this.jButtonAbrirOrderByCobrarDetalleCobros.setVisible(this.isPermisoOrdenCobrarDetalleCobros);					
		
		this.jButtonNuevoRelacionesCobrarDetalleCobros.setVisible(this.isPermisoNuevoCobrarDetalleCobros);			
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonModificarCobrarDetalleCobros.setVisible(this.isPermisoActualizarCobrarDetalleCobros);	
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonActualizarCobrarDetalleCobros.setVisible(this.isPermisoActualizarCobrarDetalleCobros);	
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonEliminarCobrarDetalleCobros.setVisible(this.isPermisoEliminarCobrarDetalleCobros);
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonCancelarCobrarDetalleCobros.setVisible(this.isVisibilidadCeldaCancelarCobrarDetalleCobros);						
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonGuardarCambiosCobrarDetalleCobros.setVisible(this.isPermisoGuardarCambiosCobrarDetalleCobros);							
		}
		
		this.jButtonGuardarCambiosTablaCobrarDetalleCobros.setVisible(this.isPermisoActualizarCobrarDetalleCobros);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarDetalleCobros() {
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonModificarCobrarDetalleCobros.setVisible(this.isPermisoActualizarCobrarDetalleCobros);	
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonActualizarCobrarDetalleCobros.setVisible(this.isPermisoActualizarCobrarDetalleCobros);	
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonEliminarCobrarDetalleCobros.setVisible(this.isPermisoEliminarCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonCancelarCobrarDetalleCobros.setVisible(this.isVisibilidadCeldaCancelarCobrarDetalleCobros);							
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonGuardarCambiosCobrarDetalleCobros.setVisible((this.isVisibilidadCeldaGuardarCobrarDetalleCobros && this.isPermisoGuardarCambiosCobrarDetalleCobros));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCobrarDetalleCobros() {
		if(CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCobrarDetalleCobros();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCobrarDetalleCobros() {
	}
	
	public void jTableDatosCobrarDetalleCobrosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCobrarDetalleCobros(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCobrarDetalleCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrardetallecobros==null) {
						this.cobrardetallecobros = new CobrarDetalleCobros();
					}

					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
				}

				if(this.cobrardetallecobros.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cobrardetallecobros.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarDetalleCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCobrarDetalleCobrosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCobrarDetalleCobros(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarDetalleCobros.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarDetalleCobros.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cobrardetallecobrosLogic.getConnexion());

				if(this.cobrardetallecobros.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cobrardetallecobros.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarDetalleCobros=(TitledBorder)this.jScrollPanelDatosCobrarDetalleCobros.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCobrarDetalleCobros.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCobrarDetalleCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrardetallecobros==null) {
						this.cobrardetallecobros = new CobrarDetalleCobros();
					}

					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
				}

				if(this.cobrardetallecobros.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cobrardetallecobros.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarDetalleCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisCobrarDetalleCobrosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebCobrarDetalleCobros(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarDetalleCobros.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarDetalleCobros.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.cobrardetallecobrosLogic.getConnexion());

				if(this.cobrardetallecobros.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.cobrardetallecobros.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarDetalleCobros=(TitledBorder)this.jScrollPanelDatosCobrarDetalleCobros.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderCobrarDetalleCobros.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisCobrarDetalleCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrardetallecobros==null) {
						this.cobrardetallecobros = new CobrarDetalleCobros();
					}

					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
				}

				if(this.cobrardetallecobros.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.cobrardetallecobros.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarDetalleCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ciudadCobrarDetalleCobrosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisociudad=true;

			idTienePermisociudad=this.tienePermisosUsuarioEnPaginaWebCobrarDetalleCobros(CiudadConstantesFunciones.CLASSNAME);

			if(idTienePermisociudad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarDetalleCobros.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarDetalleCobros.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.cobrardetallecobrosLogic.getConnexion());

				if(this.cobrardetallecobros.getid_ciudad()!=null) {
					this.ciudadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ciudadBeanSwingJInternalFrame.setIdActual(this.cobrardetallecobros.getid_ciudad());
					this.ciudadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad();
				}

				JInternalFrameBase jinternalFrame =this.ciudadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarDetalleCobros=(TitledBorder)this.jScrollPanelDatosCobrarDetalleCobros.getBorder();
				TitledBorder titledBorderciudad=(TitledBorder)this.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

				titledBorderciudad.setTitle(titledBorderCobrarDetalleCobros.getTitle() + " -> Ciudad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ciudadCobrarDetalleCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrardetallecobros==null) {
						this.cobrardetallecobros = new CobrarDetalleCobros();
					}

					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
				}

				if(this.cobrardetallecobros.getid_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ciudad = "+this.cobrardetallecobros.getid_ciudad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarDetalleCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_zonaCobrarDetalleCobrosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisozona=true;

			idTienePermisozona=this.tienePermisosUsuarioEnPaginaWebCobrarDetalleCobros(ZonaConstantesFunciones.CLASSNAME);

			if(idTienePermisozona) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarDetalleCobros.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarDetalleCobros.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);

				this.zonaBeanSwingJInternalFrame=new ZonaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.zonaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.zonaBeanSwingJInternalFrame.getZonaLogic().setConnexion(this.cobrardetallecobrosLogic.getConnexion());

				if(this.cobrardetallecobros.getid_zona()!=null) {
					this.zonaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.zonaBeanSwingJInternalFrame.setIdActual(this.cobrardetallecobros.getid_zona());
					this.zonaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.zonaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.zonaBeanSwingJInternalFrame.inicializarActualizarBindingTablaZona();
				}

				JInternalFrameBase jinternalFrame =this.zonaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarDetalleCobros=(TitledBorder)this.jScrollPanelDatosCobrarDetalleCobros.getBorder();
				TitledBorder titledBorderzona=(TitledBorder)this.zonaBeanSwingJInternalFrame.jScrollPanelDatosZona.getBorder();

				titledBorderzona.setTitle(titledBorderCobrarDetalleCobros.getTitle() + " -> Zona");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_zonaCobrarDetalleCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrardetallecobros==null) {
						this.cobrardetallecobros = new CobrarDetalleCobros();
					}

					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
				}

				if(this.cobrardetallecobros.getid_zona()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_zona = "+this.cobrardetallecobros.getid_zona().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarDetalleCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_grupo_clienteCobrarDetalleCobrosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisogrupocliente=true;

			idTienePermisogrupocliente=this.tienePermisosUsuarioEnPaginaWebCobrarDetalleCobros(GrupoClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisogrupocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarDetalleCobros.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarDetalleCobros.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);

				this.grupoclienteBeanSwingJInternalFrame=new GrupoClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.grupoclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.grupoclienteBeanSwingJInternalFrame.getGrupoClienteLogic().setConnexion(this.cobrardetallecobrosLogic.getConnexion());

				if(this.cobrardetallecobros.getid_grupo_cliente()!=null) {
					this.grupoclienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.grupoclienteBeanSwingJInternalFrame.setIdActual(this.cobrardetallecobros.getid_grupo_cliente());
					this.grupoclienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaGrupoCliente();
				}

				JInternalFrameBase jinternalFrame =this.grupoclienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarDetalleCobros=(TitledBorder)this.jScrollPanelDatosCobrarDetalleCobros.getBorder();
				TitledBorder titledBordergrupocliente=(TitledBorder)this.grupoclienteBeanSwingJInternalFrame.jScrollPanelDatosGrupoCliente.getBorder();

				titledBordergrupocliente.setTitle(titledBorderCobrarDetalleCobros.getTitle() + " -> Grupo Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_grupo_clienteCobrarDetalleCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrardetallecobros==null) {
						this.cobrardetallecobros = new CobrarDetalleCobros();
					}

					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
				}

				if(this.cobrardetallecobros.getid_grupo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_grupo_cliente = "+this.cobrardetallecobros.getid_grupo_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarDetalleCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_vendedorCobrarDetalleCobrosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisovendedor=true;

			idTienePermisovendedor=this.tienePermisosUsuarioEnPaginaWebCobrarDetalleCobros(VendedorConstantesFunciones.CLASSNAME);

			if(idTienePermisovendedor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarDetalleCobros.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarDetalleCobros.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);

				this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.vendedorBeanSwingJInternalFrame.getVendedorLogic().setConnexion(this.cobrardetallecobrosLogic.getConnexion());

				if(this.cobrardetallecobros.getid_vendedor()!=null) {
					this.vendedorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.vendedorBeanSwingJInternalFrame.setIdActual(this.cobrardetallecobros.getid_vendedor());
					this.vendedorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedor();
				}

				JInternalFrameBase jinternalFrame =this.vendedorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarDetalleCobros=(TitledBorder)this.jScrollPanelDatosCobrarDetalleCobros.getBorder();
				TitledBorder titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderCobrarDetalleCobros.getTitle() + " -> VENDEDOR");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_vendedorCobrarDetalleCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrardetallecobros==null) {
						this.cobrardetallecobros = new CobrarDetalleCobros();
					}

					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
				}

				if(this.cobrardetallecobros.getid_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_vendedor = "+this.cobrardetallecobros.getid_vendedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarDetalleCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionCobrarDetalleCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrardetallecobros==null) {
						this.cobrardetallecobros = new CobrarDetalleCobros();
					}

					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
				}

				if(this.cobrardetallecobros.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.cobrardetallecobros.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarDetalleCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaCobrarDetalleCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrardetallecobros==null) {
						this.cobrardetallecobros = new CobrarDetalleCobros();
					}

					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
				}

				if(this.cobrardetallecobros.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.cobrardetallecobros.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarDetalleCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_vendedorCobrarDetalleCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrardetallecobros==null) {
						this.cobrardetallecobros = new CobrarDetalleCobros();
					}

					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
				}

				if(this.cobrardetallecobros.getnombre_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_vendedor like '%"+this.cobrardetallecobros.getnombre_vendedor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarDetalleCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCobrarDetalleCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrardetallecobros==null) {
						this.cobrardetallecobros = new CobrarDetalleCobros();
					}

					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
				}

				if(this.cobrardetallecobros.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.cobrardetallecobros.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarDetalleCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCobrarDetalleCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrardetallecobros==null) {
						this.cobrardetallecobros = new CobrarDetalleCobros();
					}

					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
				}

				if(this.cobrardetallecobros.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.cobrardetallecobros.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarDetalleCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellidoCobrarDetalleCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrardetallecobros==null) {
						this.cobrardetallecobros = new CobrarDetalleCobros();
					}

					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
				}

				if(this.cobrardetallecobros.getapellido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellido like '%"+this.cobrardetallecobros.getapellido()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarDetalleCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_facturasCobrarDetalleCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrardetallecobros==null) {
						this.cobrardetallecobros = new CobrarDetalleCobros();
					}

					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
				}

				if(this.cobrardetallecobros.gettotal_facturas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_facturas = "+this.cobrardetallecobros.gettotal_facturas().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarDetalleCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_abonosCobrarDetalleCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrardetallecobros==null) {
						this.cobrardetallecobros = new CobrarDetalleCobros();
					}

					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
				}

				if(this.cobrardetallecobros.gettotal_abonos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_abonos = "+this.cobrardetallecobros.gettotal_abonos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarDetalleCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_facturas_actualCobrarDetalleCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrardetallecobros==null) {
						this.cobrardetallecobros = new CobrarDetalleCobros();
					}

					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
				}

				if(this.cobrardetallecobros.gettotal_facturas_actual()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_facturas_actual = "+this.cobrardetallecobros.gettotal_facturas_actual().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarDetalleCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonabonos_anteriorCobrarDetalleCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrardetallecobros==null) {
						this.cobrardetallecobros = new CobrarDetalleCobros();
					}

					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
				}

				if(this.cobrardetallecobros.getabonos_anterior()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where abonos_anterior = "+this.cobrardetallecobros.getabonos_anterior().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarDetalleCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonabonos_actualCobrarDetalleCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.getcobrardetallecobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrardetallecobros==null) {
						this.cobrardetallecobros = new CobrarDetalleCobros();
					}

					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);
				}

				if(this.cobrardetallecobros.getabonos_actual()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where abonos_actual = "+this.cobrardetallecobros.getabonos_actual().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarDetalleCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaCobrarDetalleCobrosCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarDetalleCobros(false,false);

			this.getCobrarDetalleCobrossBusquedaCobrarDetalleCobros();

			this.inicializarActualizarBindingCobrarDetalleCobros(false);

			//if(CobrarDetalleCobrosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarDetalleCobros(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCiudadCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarDetalleCobros(false,false);

			this.getCobrarDetalleCobrossFK_IdCiudad();

			this.inicializarActualizarBindingCobrarDetalleCobros(false);

			//if(CobrarDetalleCobrosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarDetalleCobros(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarDetalleCobros(false,false);

			this.getCobrarDetalleCobrossFK_IdEmpresa();

			this.inicializarActualizarBindingCobrarDetalleCobros(false);

			//if(CobrarDetalleCobrosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarDetalleCobros(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdGrupoClienteCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarDetalleCobros(false,false);

			this.getCobrarDetalleCobrossFK_IdGrupoCliente();

			this.inicializarActualizarBindingCobrarDetalleCobros(false);

			//if(CobrarDetalleCobrosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarDetalleCobros(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarDetalleCobros(false,false);

			this.getCobrarDetalleCobrossFK_IdPais();

			this.inicializarActualizarBindingCobrarDetalleCobros(false);

			//if(CobrarDetalleCobrosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarDetalleCobros(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdVendedorCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarDetalleCobros(false,false);

			this.getCobrarDetalleCobrossFK_IdVendedor();

			this.inicializarActualizarBindingCobrarDetalleCobros(false);

			//if(CobrarDetalleCobrosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarDetalleCobros(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdZonaCobrarDetalleCobrosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarDetalleCobros(false,false);

			this.getCobrarDetalleCobrossFK_IdZona();

			this.inicializarActualizarBindingCobrarDetalleCobros(false);

			//if(CobrarDetalleCobrosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarDetalleCobros(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrardetallecobrosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCobrarDetalleCobros() {
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
			this.jInternalFrameDetalleFormCobrarDetalleCobros.setVisible(false);	    			
			this.jInternalFrameDetalleFormCobrarDetalleCobros.dispose();
			this.jInternalFrameDetalleFormCobrarDetalleCobros=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCobrarDetalleCobros!=null) {
			this.jInternalFrameReporteDinamicoCobrarDetalleCobros.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCobrarDetalleCobros.dispose();
			this.jInternalFrameReporteDinamicoCobrarDetalleCobros=null;
		}
		
		if(this.jInternalFrameImportacionCobrarDetalleCobros!=null) {
			this.jInternalFrameImportacionCobrarDetalleCobros.setVisible(false);	    			
			this.jInternalFrameImportacionCobrarDetalleCobros.dispose();
			this.jInternalFrameImportacionCobrarDetalleCobros=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCobrarDetalleCobros();
			
			CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
			
			
			if(sTipo.equals("NuevoCobrarDetalleCobros")) {
				jButtonNuevoCobrarDetalleCobrosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCobrarDetalleCobros")) {
				jButtonDuplicarCobrarDetalleCobrosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCobrarDetalleCobros")) {
				jButtonCopiarCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("VerFormCobrarDetalleCobros")) {
				jButtonVerFormCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCobrarDetalleCobros")) {
				jButtonNuevoCobrarDetalleCobrosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCobrarDetalleCobros")) {
				jButtonDuplicarCobrarDetalleCobrosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCobrarDetalleCobros")) {
				jButtonNuevoCobrarDetalleCobrosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCobrarDetalleCobros")) {
				jButtonDuplicarCobrarDetalleCobrosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCobrarDetalleCobros")) {
				jButtonNuevoCobrarDetalleCobrosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCobrarDetalleCobros")) {
				jButtonNuevoCobrarDetalleCobrosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCobrarDetalleCobros")) {
				jButtonNuevoCobrarDetalleCobrosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCobrarDetalleCobros")) {
				jButtonModificarCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCobrarDetalleCobros")) {
				jButtonModificarCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCobrarDetalleCobros")) {
				jButtonModificarCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCobrarDetalleCobros")) {
				jButtonActualizarCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCobrarDetalleCobros")) {
				jButtonActualizarCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCobrarDetalleCobros")) {
				jButtonActualizarCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("EliminarCobrarDetalleCobros")) {
				jButtonEliminarCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCobrarDetalleCobros")) {
				jButtonEliminarCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCobrarDetalleCobros")) {
				jButtonEliminarCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("CancelarCobrarDetalleCobros")) {
				jButtonCancelarCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCobrarDetalleCobros")) {
				jButtonCancelarCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCobrarDetalleCobros")) {
				jButtonCancelarCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("CerrarCobrarDetalleCobros")) {
				jButtonCerrarCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCobrarDetalleCobros")) {
				jButtonCerrarCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCobrarDetalleCobros")) {
				jButtonCerrarCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCobrarDetalleCobros")) {
				jButtonMostrarOcultarCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCobrarDetalleCobros")) {
				jButtonCancelarCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCobrarDetalleCobros")) {
				jButtonGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCobrarDetalleCobros")) {
				jButtonGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCobrarDetalleCobros")) {
				jButtonCopiarCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCobrarDetalleCobros")) {
				jButtonVerFormCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCobrarDetalleCobros")) {
				jButtonGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCobrarDetalleCobros")) {
				jButtonCopiarCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCobrarDetalleCobros")) {
				jButtonVerFormCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCobrarDetalleCobros")) {
				jButtonGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCobrarDetalleCobros")) {
				jButtonGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCobrarDetalleCobros")) {
				jButtonGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCobrarDetalleCobros")) {
				jButtonRecargarInformacionCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCobrarDetalleCobros")) {
				jButtonRecargarInformacionCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCobrarDetalleCobros")) {
				jButtonRecargarInformacionCobrarDetalleCobrosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCobrarDetalleCobros")) {
				jButtonAnterioresCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCobrarDetalleCobros")) {
				jButtonAnterioresCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCobrarDetalleCobros")) {
				jButtonAnterioresCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCobrarDetalleCobros")) {
				jButtonSiguientesCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCobrarDetalleCobros")) {
				jButtonSiguientesCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCobrarDetalleCobros")) {
				jButtonSiguientesCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCobrarDetalleCobros") || sTipo.equals("MenuItemDetalleAbrirOrderByCobrarDetalleCobros")) {
				jButtonAbrirOrderByCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCobrarDetalleCobros") || sTipo.equals("MenuItemDetalleMostrarOcultarCobrarDetalleCobros")) {
				jButtonMostrarOcultarCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarDetalleCobros")) {
				jButtonNuevoGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCobrarDetalleCobros")) {
				jButtonNuevoGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCobrarDetalleCobros")) {
				jButtonNuevoGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCobrarDetalleCobros")) {
				jButtonCerrarReporteDinamicoCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCobrarDetalleCobros")) {
				jButtonGenerarReporteDinamicoCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCobrarDetalleCobros")) {
				
				jButtonGenerarExcelReporteDinamicoCobrarDetalleCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCobrarDetalleCobros")) {
				jButtonCerrarImportacionCobrarDetalleCobrosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCobrarDetalleCobros")) {
				
				jButtonGenerarImportacionCobrarDetalleCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCobrarDetalleCobros")) {
				
				jButtonAbrirImportacionCobrarDetalleCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCobrarDetalleCobros")) {
				jComboBoxTiposAccionesCobrarDetalleCobrosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCobrarDetalleCobros")) {
				jComboBoxTiposRelacionesCobrarDetalleCobrosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCobrarDetalleCobros")) {
				jComboBoxTiposAccionesCobrarDetalleCobrosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCobrarDetalleCobros")) {
				
				jComboBoxTiposSeleccionarCobrarDetalleCobrosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCobrarDetalleCobros")) {
				jTextFieldValorCampoGeneralCobrarDetalleCobrosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCobrarDetalleCobros")) {
				jButtonAbrirOrderByCobrarDetalleCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCobrarDetalleCobros")) {
				jButtonAbrirOrderByCobrarDetalleCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCobrarDetalleCobros")) {
				jButtonCerrarOrderByCobrarDetalleCobrosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarDetalleCobrosBusqueda")) {
				this.jButtonidCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarDetalleCobrosUpdate")) {
				this.jButtonid_empresaCobrarDetalleCobrosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarDetalleCobrosBusqueda")) {
				this.jButtonid_empresaCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisCobrarDetalleCobrosUpdate")) {
				this.jButtonid_paisCobrarDetalleCobrosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisCobrarDetalleCobrosBusqueda")) {
				this.jButtonid_paisCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadCobrarDetalleCobrosUpdate")) {
				this.jButtonid_ciudadCobrarDetalleCobrosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadCobrarDetalleCobrosBusqueda")) {
				this.jButtonid_ciudadCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_zonaCobrarDetalleCobrosUpdate")) {
				this.jButtonid_zonaCobrarDetalleCobrosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_zonaCobrarDetalleCobrosBusqueda")) {
				this.jButtonid_zonaCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clienteCobrarDetalleCobrosUpdate")) {
				this.jButtonid_grupo_clienteCobrarDetalleCobrosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clienteCobrarDetalleCobrosBusqueda")) {
				this.jButtonid_grupo_clienteCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorCobrarDetalleCobrosUpdate")) {
				this.jButtonid_vendedorCobrarDetalleCobrosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorCobrarDetalleCobrosBusqueda")) {
				this.jButtonid_vendedorCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionCobrarDetalleCobrosBusqueda")) {
				this.jButtonfecha_emisionCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaCobrarDetalleCobrosBusqueda")) {
				this.jButtonfecha_emision_hastaCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_vendedorCobrarDetalleCobrosBusqueda")) {
				this.jButtonnombre_vendedorCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarDetalleCobrosBusqueda")) {
				this.jButtoncodigoCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCobrarDetalleCobrosBusqueda")) {
				this.jButtonnombreCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoCobrarDetalleCobrosBusqueda")) {
				this.jButtonapellidoCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_facturasCobrarDetalleCobrosBusqueda")) {
				this.jButtontotal_facturasCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_abonosCobrarDetalleCobrosBusqueda")) {
				this.jButtontotal_abonosCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_facturas_actualCobrarDetalleCobrosBusqueda")) {
				this.jButtontotal_facturas_actualCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("abonos_anteriorCobrarDetalleCobrosBusqueda")) {
				this.jButtonabonos_anteriorCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("abonos_actualCobrarDetalleCobrosBusqueda")) {
				this.jButtonabonos_actualCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaCobrarDetalleCobrosCobrarDetalleCobros")) {
				this.jButtonBusquedaCobrarDetalleCobrosCobrarDetalleCobrosActionPerformed(evt);
			}
			
			;
			
			
			CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCobrarDetalleCobros();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarDetalleCobrosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrardetallecobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrardetallecobros);
				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
				
				


				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarDetalleCobros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarDetalleCobros.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CobrarDetalleCobros cobrardetallecobrosLocal=null;
			
			if(!this.getEsControlTabla()) {
				cobrardetallecobrosLocal=this.cobrardetallecobros;
			} else {
				cobrardetallecobrosLocal=this.cobrardetallecobrosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrardetallecobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrardetallecobros);
				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
							
				
				


				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarDetalleCobros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarDetalleCobros.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarDetalleCobrosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosAnterior =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrardetallecobrosAnterior =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
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
			
			CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
			
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
			
			


			
			CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarDetalleCobrosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrardetallecobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrardetallecobros);
				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
								
						
				


				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarDetalleCobros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarDetalleCobros.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrardetallecobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrardetallecobros);
				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
								
				
				


				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarDetalleCobros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarDetalleCobros.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarDetalleCobrosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosAnterior =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrardetallecobrosAnterior =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrardetallecobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrardetallecobros);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarDetalleCobrosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosAnterior =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrardetallecobrosAnterior =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarDetalleCobrosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrardetallecobros);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrardetallecobros);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrardetallecobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrardetallecobros);
				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
							
				
				


				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarDetalleCobros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarDetalleCobros.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarDetalleCobrosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrardetallecobrosAnterior =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrardetallecobrosAnterior =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
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
			
			CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
			
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
			
			


			
			CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarDetalleCobrosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrardetallecobros);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrardetallecobros);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrardetallecobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrardetallecobros);
				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
								
				
				


				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarDetalleCobros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarDetalleCobros.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarDetalleCobrosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosAnterior =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrardetallecobrosAnterior =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarDetalleCobrosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrardetallecobros);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrardetallecobros);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarDetalleCobrosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrardetallecobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrardetallecobros);
				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCobrarDetalleCobros")) {
					jCheckBoxSeleccionarTodosCobrarDetalleCobrosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCobrarDetalleCobros")) {
					jCheckBoxSeleccionadosCobrarDetalleCobrosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCobrarDetalleCobros")) {
					
				}
				
				


				
				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarDetalleCobros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarDetalleCobros.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrardetallecobros);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cobrardetallecobros);
				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
												
				
				


				
				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarDetalleCobros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarDetalleCobros.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarDetalleCobrosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrardetallecobrosAnterior =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrardetallecobrosAnterior =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarDetalleCobrosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrardetallecobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrardetallecobros);
				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
				
				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
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
			
			CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
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
			
			


			
			CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarDetalleCobrosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrardetallecobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrardetallecobros);
				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarDetalleCobros.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarDetalleCobros.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrardetallecobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrardetallecobros);
				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
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
				
				


				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarDetalleCobros.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarDetalleCobros.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarDetalleCobrosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrardetallecobrosAnterior =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrardetallecobrosAnterior =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCobrarDetalleCobros")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCobrarDetalleCobrosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCobrarDetalleCobros.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cobrardetallecobros =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cobrardetallecobros);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCobrarDetalleCobros")) {
				
				}
				
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCobrarDetalleCobros")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCobrarDetalleCobros.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCobrarDetalleCobros")) {
			
			}
			
			CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCobrarDetalleCobros();
			
			CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
			
			if(sTipo.equals("NuevoCobrarDetalleCobros")) {
				jButtonNuevoCobrarDetalleCobrosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCobrarDetalleCobros")) {
				jButtonDuplicarCobrarDetalleCobrosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCobrarDetalleCobros")) {
				jButtonCopiarCobrarDetalleCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCobrarDetalleCobros")) {
				jButtonVerFormCobrarDetalleCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCobrarDetalleCobros")) {
				jButtonNuevoCobrarDetalleCobrosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCobrarDetalleCobros")) {
				jButtonModificarCobrarDetalleCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCobrarDetalleCobros")) {
				jButtonActualizarCobrarDetalleCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCobrarDetalleCobros")) {
				jButtonEliminarCobrarDetalleCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCobrarDetalleCobros")) {
				jButtonGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCobrarDetalleCobros")) {
				jButtonCancelarCobrarDetalleCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCobrarDetalleCobros")) {
				jButtonCerrarCobrarDetalleCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCobrarDetalleCobros")) {
				jButtonGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarDetalleCobros")) {
				jButtonNuevoGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCobrarDetalleCobros")) {
				jButtonAbrirOrderByCobrarDetalleCobrosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCobrarDetalleCobros")) {
				jButtonRecargarInformacionCobrarDetalleCobrosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCobrarDetalleCobros")) {
				jButtonAnterioresCobrarDetalleCobrosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCobrarDetalleCobros")) {
				jButtonSiguientesCobrarDetalleCobrosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarDetalleCobrosBusqueda")) {
				this.jButtonidCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarDetalleCobrosUpdate")) {
				this.jButtonid_empresaCobrarDetalleCobrosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarDetalleCobrosBusqueda")) {
				this.jButtonid_empresaCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisCobrarDetalleCobrosUpdate")) {
				this.jButtonid_paisCobrarDetalleCobrosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisCobrarDetalleCobrosBusqueda")) {
				this.jButtonid_paisCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadCobrarDetalleCobrosUpdate")) {
				this.jButtonid_ciudadCobrarDetalleCobrosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadCobrarDetalleCobrosBusqueda")) {
				this.jButtonid_ciudadCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_zonaCobrarDetalleCobrosUpdate")) {
				this.jButtonid_zonaCobrarDetalleCobrosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_zonaCobrarDetalleCobrosBusqueda")) {
				this.jButtonid_zonaCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clienteCobrarDetalleCobrosUpdate")) {
				this.jButtonid_grupo_clienteCobrarDetalleCobrosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clienteCobrarDetalleCobrosBusqueda")) {
				this.jButtonid_grupo_clienteCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorCobrarDetalleCobrosUpdate")) {
				this.jButtonid_vendedorCobrarDetalleCobrosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorCobrarDetalleCobrosBusqueda")) {
				this.jButtonid_vendedorCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionCobrarDetalleCobrosBusqueda")) {
				this.jButtonfecha_emisionCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaCobrarDetalleCobrosBusqueda")) {
				this.jButtonfecha_emision_hastaCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_vendedorCobrarDetalleCobrosBusqueda")) {
				this.jButtonnombre_vendedorCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarDetalleCobrosBusqueda")) {
				this.jButtoncodigoCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCobrarDetalleCobrosBusqueda")) {
				this.jButtonnombreCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoCobrarDetalleCobrosBusqueda")) {
				this.jButtonapellidoCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_facturasCobrarDetalleCobrosBusqueda")) {
				this.jButtontotal_facturasCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_abonosCobrarDetalleCobrosBusqueda")) {
				this.jButtontotal_abonosCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_facturas_actualCobrarDetalleCobrosBusqueda")) {
				this.jButtontotal_facturas_actualCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("abonos_anteriorCobrarDetalleCobrosBusqueda")) {
				this.jButtonabonos_anteriorCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("abonos_actualCobrarDetalleCobrosBusqueda")) {
				this.jButtonabonos_actualCobrarDetalleCobrosBusquedaActionPerformed(evt);
			}
			
			CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCobrarDetalleCobros();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCobrarDetalleCobros")) {
				closingInternalFrameCobrarDetalleCobros();
				
			} else if(sTipo.equals("jButtonCancelarCobrarDetalleCobros")) {
				JInternalFrameBase jInternalFrameDetalleFormCobrarDetalleCobros = (JInternalFrameBase)evt.getSource();
	            	
	            CobrarDetalleCobrosBeanSwingJInternalFrame jInternalFrameParent=(CobrarDetalleCobrosBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarDetalleCobros.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCobrarDetalleCobrosActionPerformed(null);
			}
			
			CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrardetallecobros,new Object(),this.cobrardetallecobrosParameterGeneral,this.cobrardetallecobrosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCobrarDetalleCobros(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCobrarDetalleCobros(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCobrarDetalleCobros(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cobrardetallecobros)) {
			if(!esControlTabla) {
				if(CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);			
				}
				
				if(this.cobrardetallecobrosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCobrarDetalleCobros(this.cobrardetallecobrosReturnGeneral,this.cobrardetallecobrosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cobrardetallecobrosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCobrarDetalleCobros(classes,this.cobrardetallecobrosReturnGeneral,this.cobrardetallecobrosBean,false);
					}
						
					if(this.cobrardetallecobrosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCobrarDetalleCobros(this.cobrardetallecobrosReturnGeneral.getCobrarDetalleCobros());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCobrarDetalleCobros(this.cobrardetallecobrosReturnGeneral.getCobrarDetalleCobros());	
					}
						
					if(this.cobrardetallecobrosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCobrarDetalleCobros(this.cobrardetallecobrosReturnGeneral.getCobrarDetalleCobros(),classes);//this.cobrardetallecobrosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCobrarDetalleCobros(this.cobrardetallecobros,classes);//this.cobrardetallecobrosBean);									
				}
			
				if(CobrarDetalleCobrosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCobrarDetalleCobros(this.cobrardetallecobros,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarDetalleCobros(this.cobrardetallecobros);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cobrardetallecobrosAnterior!=null) {
						this.cobrardetallecobros=this.cobrardetallecobrosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cobrardetallecobrosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cobrardetallecobrosReturnGeneral.getCobrarDetalleCobros(),cobrardetallecobrosLogic.getCobrarDetalleCobross());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cobrardetallecobrosReturnGeneral.getCobrarDetalleCobros(),this.cobrardetallecobross);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCobrarDetalleCobros.repaint();
				
				//((AbstractTableModel) this.jTableDatosCobrarDetalleCobros.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCobrarDetalleCobros();
			}
		}
	}
	
	public void actualizarVisualTableDatosCobrarDetalleCobros() throws Exception {
		
		CobrarDetalleCobrosModel cobrardetallecobrosModel=(CobrarDetalleCobrosModel)this.jTableDatosCobrarDetalleCobros.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrardetallecobrosModel.cobrardetallecobross=this.cobrardetallecobrosLogic.getCobrarDetalleCobross();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cobrardetallecobrosModel.cobrardetallecobross=this.cobrardetallecobross;
		}
		
		
		((CobrarDetalleCobrosModel) this.jTableDatosCobrarDetalleCobros.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCobrarDetalleCobros() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcobrardetallecobrosAnterior(),this.cobrardetallecobrosLogic.getCobrarDetalleCobross());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcobrardetallecobrosAnterior(),this.cobrardetallecobross);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCobrarDetalleCobros();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCobrarDetalleCobros(CobrarDetalleCobros cobrardetallecobros,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
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
										
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrardetallecobros,new Object(),generalEntityParameterGeneral,this.cobrardetallecobrosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cobrardetallecobrosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CobrarDetalleCobrosConstantesFunciones.getClassesRelationshipsOfCobrarDetalleCobros(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CobrarDetalleCobrosConstantesFunciones.getClassesRelationshipsFromStringsOfCobrarDetalleCobros(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCobrarDetalleCobros(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrardetallecobros,new Object(),generalEntityParameterGeneral,this.cobrardetallecobrosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCobrarDetalleCobros(CobrarDetalleCobrosBean cobrardetallecobrosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCobrarDetalleCobros(ArrayList<Classe> classes,CobrarDetalleCobrosReturnGeneral cobrardetallecobrosReturnGeneral,CobrarDetalleCobrosBean cobrardetallecobrosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCobrarDetalleCobros(CobrarDetalleCobros cobrardetallecobros,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cobrardetallecobros)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCobrarDetalleCobros = new CobrarDetalleCobrosDetalleFormJInternalFrame(jDesktopPane,this.cobrardetallecobrosSessionBean.getConGuardarRelaciones(),this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.setVisible(false);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.setSelected(false);						
		
		this.jInternalFrameDetalleFormCobrarDetalleCobros.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCobrarDetalleCobros.cobrardetallecobrosLogic=this.cobrardetallecobrosLogic;
		
		this.cargarCombosFrameForeignKeyCobrarDetalleCobros("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarDetalleCobros();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarDetalleCobros();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCobrarDetalleCobros("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCobrarDetalleCobros();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCobrarDetalleCobros.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarDetalleCobros"));
		
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonModificarCobrarDetalleCobros.addActionListener(new ButtonActionListener(this,"ModificarCobrarDetalleCobros"));

		
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonModificarToolBarCobrarDetalleCobros.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarDetalleCobros"));
					
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jMenuItemModificarCobrarDetalleCobros.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarDetalleCobros"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonActualizarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"ActualizarCobrarDetalleCobros"));
		
		
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonActualizarToolBarCobrarDetalleCobros.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarDetalleCobros"));
						
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jMenuItemActualizarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarDetalleCobros"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonEliminarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"EliminarCobrarDetalleCobros"));
		
		
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonEliminarToolBarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarDetalleCobros"));
								
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jMenuItemEliminarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarDetalleCobros"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonCancelarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"CancelarCobrarDetalleCobros"));
		
		
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonCancelarToolBarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarDetalleCobros"));
					
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jMenuItemCancelarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarDetalleCobros"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jMenuItemDetalleCerrarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarDetalleCobros"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonGuardarCambiosToolBarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarDetalleCobros"));
		
		
		
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonGuardarCambiosToolBarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarDetalleCobros"));
		
		
		
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxTiposAccionesFormularioCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarDetalleCobros"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonidCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarDetalleCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_empresaCobrarDetalleCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarDetalleCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_empresaCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarDetalleCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_paisCobrarDetalleCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_paisCobrarDetalleCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_paisCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_paisCobrarDetalleCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_ciudadCobrarDetalleCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadCobrarDetalleCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_ciudadCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadCobrarDetalleCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_zonaCobrarDetalleCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_zonaCobrarDetalleCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_zonaCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaCobrarDetalleCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_grupo_clienteCobrarDetalleCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteCobrarDetalleCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_grupo_clienteCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteCobrarDetalleCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_vendedorCobrarDetalleCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorCobrarDetalleCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_vendedorCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonfecha_emisionCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonfecha_emision_hastaCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonnombre_vendedorCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtoncodigoCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonnombreCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"nombreCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonapellidoCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"apellidoCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtontotal_facturasCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"total_facturasCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtontotal_abonosCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"total_abonosCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtontotal_facturas_actualCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"total_facturas_actualCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonabonos_anteriorCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"abonos_anteriorCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonabonos_actualCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"abonos_actualCobrarDetalleCobrosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jTabbedPaneRelacionesCobrarDetalleCobros.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarDetalleCobros"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCobrarDetalleCobros"));
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarDetalleCobros.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarDetalleCobros"));
		}
		
		this.jTableDatosCobrarDetalleCobros.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCobrarDetalleCobros"));
		
		this.jTableDatosCobrarDetalleCobros.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCobrarDetalleCobros"));
		
		this.jButtonNuevoCobrarDetalleCobros.addActionListener(new ButtonActionListener(this,"NuevoCobrarDetalleCobros"));
		
		this.jButtonDuplicarCobrarDetalleCobros.addActionListener(new ButtonActionListener(this,"DuplicarCobrarDetalleCobros"));
		
		this.jButtonCopiarCobrarDetalleCobros.addActionListener(new ButtonActionListener(this,"CopiarCobrarDetalleCobros"));
		
		this.jButtonVerFormCobrarDetalleCobros.addActionListener(new ButtonActionListener(this,"VerFormCobrarDetalleCobros"));
		
		
		this.jButtonNuevoToolBarCobrarDetalleCobros.addActionListener(new ButtonActionListener(this,"NuevoToolBarCobrarDetalleCobros"));
			
		this.jButtonDuplicarToolBarCobrarDetalleCobros.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCobrarDetalleCobros"));
			
		this.jMenuItemNuevoCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCobrarDetalleCobros"));
			
		this.jMenuItemDuplicarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCobrarDetalleCobros"));		
		
		
		this.jButtonNuevoRelacionesCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCobrarDetalleCobros"));
		
		
		this.jButtonNuevoRelacionesToolBarCobrarDetalleCobros.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCobrarDetalleCobros"));
			
		this.jMenuItemNuevoRelacionesCobrarDetalleCobros.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCobrarDetalleCobros"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonModificarCobrarDetalleCobros.addActionListener(new ButtonActionListener(this,"ModificarCobrarDetalleCobros"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonModificarToolBarCobrarDetalleCobros.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarDetalleCobros"));
			
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jMenuItemModificarCobrarDetalleCobros.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarDetalleCobros"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonActualizarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"ActualizarCobrarDetalleCobros"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonActualizarToolBarCobrarDetalleCobros.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarDetalleCobros"));
				
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jMenuItemActualizarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarDetalleCobros"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonEliminarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"EliminarCobrarDetalleCobros"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonEliminarToolBarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarDetalleCobros"));
						
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jMenuItemEliminarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarDetalleCobros"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonCancelarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"CancelarCobrarDetalleCobros"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonCancelarToolBarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarDetalleCobros"));
			
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jMenuItemCancelarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarDetalleCobros"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCobrarDetalleCobros"));		
		
		
		this.jButtonCerrarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"CerrarCobrarDetalleCobros"));
		
		
		this.jButtonCerrarToolBarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"CerrarToolBarCobrarDetalleCobros"));
			
		this.jMenuItemCerrarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCobrarDetalleCobros"));
			
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jMenuItemDetalleCerrarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarDetalleCobros"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonGuardarCambiosCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"GuardarCambiosCobrarDetalleCobros"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonGuardarCambiosToolBarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarDetalleCobros"));
		}
		
		this.jButtonCopiarToolBarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"CopiarToolBarCobrarDetalleCobros"));
			
		this.jButtonVerFormToolBarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"VerFormToolBarCobrarDetalleCobros"));
		
		this.jMenuItemGuardarCambiosCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCobrarDetalleCobros"));
			
		this.jMenuItemCopiarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCobrarDetalleCobros"));		
		
		this.jMenuItemVerFormCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCobrarDetalleCobros"));		
		
		
		this.jButtonGuardarCambiosTablaCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarDetalleCobros"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCobrarDetalleCobros"));
			
		this.jMenuItemGuardarCambiosTablaCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarDetalleCobros"));		
		
		
		
		this.jButtonRecargarInformacionCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"RecargarInformacionCobrarDetalleCobros"));
					
		this.jButtonRecargarInformacionToolBarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCobrarDetalleCobros"));
		
		this.jMenuItemRecargarInformacionCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCobrarDetalleCobros"));		
		
		
		
		this.jButtonAnterioresCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"AnterioresCobrarDetalleCobros"));
		
		
		this.jButtonAnterioresToolBarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCobrarDetalleCobros"));
		
		this.jMenuItemAnterioresCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCobrarDetalleCobros"));		
		
		
		this.jButtonSiguientesCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"SiguientesCobrarDetalleCobros"));
		
		
		this.jButtonSiguientesToolBarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCobrarDetalleCobros"));
			
		this.jMenuItemSiguientesCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCobrarDetalleCobros"));
			
		this.jMenuItemAbrirOrderByCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCobrarDetalleCobros"));
			
		this.jMenuItemMostrarOcultarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCobrarDetalleCobros"));
			
		this.jMenuItemDetalleAbrirOrderByCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCobrarDetalleCobros"));
			
		this.jMenuItemDetalleMostarOcultarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCobrarDetalleCobros"));		
		
		
		this.jButtonNuevoGuardarCambiosCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCobrarDetalleCobros"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCobrarDetalleCobros"));
			
		this.jMenuItemNuevoGuardarCambiosCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCobrarDetalleCobros"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCobrarDetalleCobros.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCobrarDetalleCobros"));

		this.jCheckBoxSeleccionadosCobrarDetalleCobros.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCobrarDetalleCobros"));
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxTiposAccionesFormularioCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarDetalleCobros"));
		}
		
		
		this.jComboBoxTiposRelacionesCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"TiposRelacionesCobrarDetalleCobros"));
			
		this.jComboBoxTiposAccionesCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"TiposAccionesCobrarDetalleCobros"));
					
		this.jComboBoxTiposSeleccionarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCobrarDetalleCobros"));
			
		this.jTextFieldValorCampoGeneralCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCobrarDetalleCobros"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonidCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarDetalleCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_empresaCobrarDetalleCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarDetalleCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_empresaCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarDetalleCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_paisCobrarDetalleCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_paisCobrarDetalleCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_paisCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_paisCobrarDetalleCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_ciudadCobrarDetalleCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadCobrarDetalleCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_ciudadCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadCobrarDetalleCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_zonaCobrarDetalleCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_zonaCobrarDetalleCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_zonaCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaCobrarDetalleCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_grupo_clienteCobrarDetalleCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteCobrarDetalleCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_grupo_clienteCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteCobrarDetalleCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_vendedorCobrarDetalleCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorCobrarDetalleCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_vendedorCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonfecha_emisionCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonfecha_emision_hastaCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonnombre_vendedorCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtoncodigoCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonnombreCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"nombreCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonapellidoCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"apellidoCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtontotal_facturasCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"total_facturasCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtontotal_abonosCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"total_abonosCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtontotal_facturas_actualCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"total_facturas_actualCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonabonos_anteriorCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"abonos_anteriorCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonabonos_actualCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"abonos_actualCobrarDetalleCobrosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaCobrarDetalleCobrosCobrarDetalleCobros.addActionListener(new ButtonActionListener(this,"BusquedaCobrarDetalleCobrosCobrarDetalleCobros"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCobrarDetalleCobros!=null) {
				this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarDetalleCobros"));
				this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarDetalleCobros"));
				this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarDetalleCobros"));
			}
			
			//this.jButtonCerrarReporteDinamicoCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarDetalleCobros"));				
			//this.jButtonGenerarReporteDinamicoCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarDetalleCobros"));
			//this.jButtonGenerarExcelReporteDinamicoCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarDetalleCobros"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCobrarDetalleCobros!=null) {
				this.jInternalFrameImportacionCobrarDetalleCobros.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarDetalleCobros"));
				this.jInternalFrameImportacionCobrarDetalleCobros.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarDetalleCobros"));
				this.jInternalFrameImportacionCobrarDetalleCobros.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarDetalleCobros"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"AbrirOrderByCobrarDetalleCobros"));
			
			this.jButtonAbrirOrderByToolBarCobrarDetalleCobros.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCobrarDetalleCobros"));			
			
			if(this.jInternalFrameOrderByCobrarDetalleCobros!=null) {
				this.jInternalFrameOrderByCobrarDetalleCobros.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarDetalleCobros"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarDetalleCobros.jTabbedPaneRelacionesCobrarDetalleCobros.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarDetalleCobros"));
		
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
            		closingInternalFrameCobrarDetalleCobros();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCobrarDetalleCobros.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCobrarDetalleCobros = (JInternalFrameBase)event.getSource();
	            	
	            CobrarDetalleCobrosBeanSwingJInternalFrame jInternalFrameParent=(CobrarDetalleCobrosBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarDetalleCobros.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCobrarDetalleCobrosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCobrarDetalleCobros.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCobrarDetalleCobrosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCobrarDetalleCobros.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCobrarDetalleCobros.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarDetalleCobrosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarDetalleCobrosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarDetalleCobrosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCobrarDetalleCobros";
		inputMap = this.jButtonNuevoCobrarDetalleCobros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCobrarDetalleCobros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarDetalleCobrosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarDetalleCobrosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarDetalleCobrosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarDetalleCobrosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCobrarDetalleCobros";
		inputMap = this.jButtonNuevoRelacionesCobrarDetalleCobros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCobrarDetalleCobros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarDetalleCobrosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCobrarDetalleCobros";
		inputMap = this.jButtonModificarCobrarDetalleCobros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCobrarDetalleCobros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCobrarDetalleCobrosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCobrarDetalleCobros";
		inputMap = this.jButtonActualizarCobrarDetalleCobros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCobrarDetalleCobros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCobrarDetalleCobrosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCobrarDetalleCobros";
		inputMap = this.jButtonEliminarCobrarDetalleCobros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCobrarDetalleCobros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCobrarDetalleCobrosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCobrarDetalleCobros";
		inputMap = this.jButtonCancelarCobrarDetalleCobros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCobrarDetalleCobros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCobrarDetalleCobrosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCobrarDetalleCobros";
		inputMap = this.jButtonCerrarCobrarDetalleCobros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCobrarDetalleCobros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCobrarDetalleCobrosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonGuardarCambiosCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCobrarDetalleCobros";
		inputMap = this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonGuardarCambiosCobrarDetalleCobros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonGuardarCambiosCobrarDetalleCobros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCobrarDetalleCobros.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCobrarDetalleCobrosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCobrarDetalleCobros.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCobrarDetalleCobrosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCobrarDetalleCobros.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCobrarDetalleCobrosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCobrarDetalleCobros.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCobrarDetalleCobrosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonidCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarDetalleCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_empresaCobrarDetalleCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarDetalleCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_empresaCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarDetalleCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_paisCobrarDetalleCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_paisCobrarDetalleCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_paisCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_paisCobrarDetalleCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_ciudadCobrarDetalleCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadCobrarDetalleCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_ciudadCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadCobrarDetalleCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_zonaCobrarDetalleCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_zonaCobrarDetalleCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_zonaCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaCobrarDetalleCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_grupo_clienteCobrarDetalleCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteCobrarDetalleCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_grupo_clienteCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteCobrarDetalleCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_vendedorCobrarDetalleCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorCobrarDetalleCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonid_vendedorCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonfecha_emisionCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonfecha_emision_hastaCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonnombre_vendedorCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtoncodigoCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonnombreCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"nombreCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonapellidoCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"apellidoCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtontotal_facturasCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"total_facturasCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtontotal_abonosCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"total_abonosCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtontotal_facturas_actualCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"total_facturas_actualCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonabonos_anteriorCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"abonos_anteriorCobrarDetalleCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jButtonabonos_actualCobrarDetalleCobrosBusqueda.addActionListener(new ButtonActionListener(this,"abonos_actualCobrarDetalleCobrosBusqueda"));
		
		
		this.jButtonBusquedaCobrarDetalleCobrosCobrarDetalleCobros.addActionListener(new ButtonActionListener(this,"BusquedaCobrarDetalleCobrosCobrarDetalleCobros"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCobrarDetalleCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCobrarDetalleCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCobrarDetalleCobrosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCobrarDetalleCobros.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCobrarDetalleCobros(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CobrarDetalleCobros cobrardetallecobrosAux:this.cobrardetallecobrosLogic.getCobrarDetalleCobross()) {
					cobrardetallecobrosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarDetalleCobros cobrardetallecobrosAux:cobrardetallecobross) {
					cobrardetallecobrosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCobrarDetalleCobrosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarDetalleCobros(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarDetalleCobros cobrardetallecobrosAux:this.cobrardetallecobrosLogic.getCobrarDetalleCobross()) {
						cobrardetallecobrosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarDetalleCobros cobrardetallecobrosAux:cobrardetallecobross) {
						cobrardetallecobrosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CobrarDetalleCobros cobrardetallecobrosAux:this.cobrardetallecobrosLogic.getCobrarDetalleCobross()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarDetalleCobros cobrardetallecobrosAux:cobrardetallecobross) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarDetalleCobros(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarDetalleCobros.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarDetalleCobros.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarDetalleCobros,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCobrarDetalleCobrosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarDetalleCobros(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCobrarDetalleCobros.getSelectedRows();
			
			CobrarDetalleCobros cobrardetallecobrosLocal=new CobrarDetalleCobros();
			
			//this.seleccionarTodosCobrarDetalleCobros(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cobrardetallecobrosLocal =(CobrarDetalleCobros) this.cobrardetallecobrosLogic.getCobrarDetalleCobross().toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cobrardetallecobrosLocal =(CobrarDetalleCobros) this.cobrardetallecobross.toArray()[this.jTableDatosCobrarDetalleCobros.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cobrardetallecobrosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarDetalleCobros cobrardetallecobrosAux:this.cobrardetallecobrosLogic.getCobrarDetalleCobross()) {
						cobrardetallecobrosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarDetalleCobros cobrardetallecobrosAux:cobrardetallecobross) {
						cobrardetallecobrosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCobrarDetalleCobros(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarDetalleCobros.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarDetalleCobros.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarDetalleCobros,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCobrarDetalleCobrosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCobrarDetalleCobrosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCobrarDetalleCobrosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCobrarDetalleCobros(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCobrarDetalleCobros.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarDetalleCobros cobrardetallecobrosAux:this.cobrardetallecobrosLogic.getCobrarDetalleCobross()) {
				
						if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							cobrardetallecobrosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							cobrardetallecobrosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
							existe=true;
							cobrardetallecobrosAux.setnombre_vendedor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrardetallecobrosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cobrardetallecobrosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							cobrardetallecobrosAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURAS)) {
							existe=true;
							cobrardetallecobrosAux.settotal_facturas(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALABONOS)) {
							existe=true;
							cobrardetallecobrosAux.settotal_abonos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURASACTUAL)) {
							existe=true;
							cobrardetallecobrosAux.settotal_facturas_actual(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSANTERIOR)) {
							existe=true;
							cobrardetallecobrosAux.setabonos_anterior(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSACTUAL)) {
							existe=true;
							cobrardetallecobrosAux.setabonos_actual(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarDetalleCobros cobrardetallecobrosAux:cobrardetallecobross) {
					
						if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							cobrardetallecobrosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							cobrardetallecobrosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
							existe=true;
							cobrardetallecobrosAux.setnombre_vendedor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrardetallecobrosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cobrardetallecobrosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							cobrardetallecobrosAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURAS)) {
							existe=true;
							cobrardetallecobrosAux.settotal_facturas(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALABONOS)) {
							existe=true;
							cobrardetallecobrosAux.settotal_abonos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURASACTUAL)) {
							existe=true;
							cobrardetallecobrosAux.settotal_facturas_actual(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSANTERIOR)) {
							existe=true;
							cobrardetallecobrosAux.setabonos_anterior(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSACTUAL)) {
							existe=true;
							cobrardetallecobrosAux.setabonos_actual(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarDetalleCobros(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCobrarDetalleCobrosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCobrarDetalleCobros(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCobrarDetalleCobros=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCobrarDetalleCobros.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxTiposAccionesFormularioCobrarDetalleCobros.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCobrarDetalleCobros) {				
					conSplash=true;//false;										
					
					//this.startProcessCobrarDetalleCobros(conSplash);
				
					this.generarReporteCobrarDetalleCobrossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarDetalleCobros.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxTiposAccionesFormularioCobrarDetalleCobros.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCobrarDetalleCobrossSeleccionados();
				//this.jComboBoxTiposAccionesCobrarDetalleCobros.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarDetalleCobrossSeleccionados(false);
				//this.jComboBoxTiposAccionesCobrarDetalleCobros.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarDetalleCobrossSeleccionados(true);
				//this.jComboBoxTiposAccionesCobrarDetalleCobros.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarDetalleCobros();
				
				this.exportarCobrarDetalleCobrossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarDetalleCobros.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxTiposAccionesFormularioCobrarDetalleCobros.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCobrarDetalleCobross();
				//this.importarCobrarDetalleCobross();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarDetalleCobros.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxTiposAccionesFormularioCobrarDetalleCobros.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarDetalleCobros();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCobrarDetalleCobrossSeleccionados();
				//this.jComboBoxTiposAccionesCobrarDetalleCobros.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cobrar Detalle Cobros", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCobrarDetalleCobros();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCobrarDetalleCobros)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCobrarDetalleCobros(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cobrar Detalle Cobros",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarDetalleCobros.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxTiposAccionesFormularioCobrarDetalleCobros.setSelectedIndex(0);					
				}	
			} 			
			else if(CobrarDetalleCobrosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCobrarDetalleCobros) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCobrarDetalleCobros(conSplash);
					
						//this.actualizarParametrosGeneralCobrarDetalleCobros();
						
						this.generarReporteProcesoAccionCobrarDetalleCobrossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCobrarDetalleCobros.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxTiposAccionesFormularioCobrarDetalleCobros.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cobrar Detalle CobrosES SELECCIONADOS?", "MANTENIMIENTO DE Cobrar Detalle Cobros", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCobrarDetalleCobros();
				
						this.actualizarParametrosGeneralCobrarDetalleCobros();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cobrardetallecobrosReturnGeneral=cobrardetallecobrosLogic.procesarAccionCobrarDetalleCobrossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cobrardetallecobrosLogic.getCobrarDetalleCobross(),this.cobrardetallecobrosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCobrarDetalleCobrosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarDetalleCobros.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxTiposAccionesFormularioCobrarDetalleCobros.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCobrarDetalleCobros();
					
					CobrarDetalleCobrosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCobrarDetalleCobrosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarDetalleCobros.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxTiposAccionesFormularioCobrarDetalleCobros.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCobrarDetalleCobros(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCobrarDetalleCobrosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCobrarDetalleCobros();
			
			if(this.jInternalFrameDetalleFormCobrarDetalleCobros==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CobrarDetalleCobros> cobrardetallecobrossSeleccionados=new ArrayList<CobrarDetalleCobros>();		
			CobrarDetalleCobros cobrardetallecobros=new CobrarDetalleCobros();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCobrarDetalleCobros(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCobrarDetalleCobros.getSelectedItem();
			
			
			
			
			cobrardetallecobrossSeleccionados=this.getCobrarDetalleCobrossSeleccionados(true);
			//this.sTipoAccion;
			
			if(cobrardetallecobrossSeleccionados.size()==1) {
				for(CobrarDetalleCobros cobrardetallecobrosAux:cobrardetallecobrossSeleccionados) {
					cobrardetallecobros=cobrardetallecobrosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCobrarDetalleCobros();
			
      		//this.finishProcessCobrarDetalleCobros(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCobrarDetalleCobrosReturnGeneral() throws Exception {
		if(this.cobrardetallecobrosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cobrardetallecobrosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cobrardetallecobrosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cobrardetallecobrosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cobrardetallecobrosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cobrardetallecobrosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCobrarDetalleCobros(false);
		}
		
		if(this.cobrardetallecobrosReturnGeneral.getConRetornoLista() || this.cobrardetallecobrosReturnGeneral.getConRetornoObjeto()) {
			if(this.cobrardetallecobrosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cobrardetallecobrosLogic.setCobrarDetalleCobross(this.cobrardetallecobrosReturnGeneral.getCobrarDetalleCobross());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingCobrarDetalleCobros(false);
		}
	}
	
	public void actualizarParametrosGeneralCobrarDetalleCobros() throws Exception {
		
		
	}
	
	public ArrayList<CobrarDetalleCobros> getCobrarDetalleCobrossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CobrarDetalleCobros> cobrardetallecobrossSeleccionados=new ArrayList<CobrarDetalleCobros>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCobrarDetalleCobros) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CobrarDetalleCobros cobrardetallecobrosAux:cobrardetallecobrosLogic.getCobrarDetalleCobross()) {
					if(cobrardetallecobrosAux.getIsSelected()) {
						cobrardetallecobrossSeleccionados.add(cobrardetallecobrosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarDetalleCobros cobrardetallecobrosAux:this.cobrardetallecobross) {
					if(cobrardetallecobrosAux.getIsSelected()) {
						cobrardetallecobrossSeleccionados.add(cobrardetallecobrosAux);				
					}
				}
			}
			
			if(cobrardetallecobrossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cobrardetallecobrossSeleccionados.addAll(this.cobrardetallecobrosLogic.getCobrarDetalleCobross());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cobrardetallecobrossSeleccionados.addAll(this.cobrardetallecobross);				
					}
				}
			}
		} else {
			cobrardetallecobrossSeleccionados.add(this.cobrardetallecobros);
		}
		
		return cobrardetallecobrossSeleccionados;
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
	
	public void generarReporteCobrarDetalleCobrossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCobrarDetalleCobrossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCobrarDetalleCobrossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarDetalleCobrossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarDetalleCobrossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cobrar Detalle Cobros",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCobrarDetalleCobrossSeleccionados() throws Exception {
		ArrayList<CobrarDetalleCobros> cobrardetallecobrossSeleccionados=new ArrayList<CobrarDetalleCobros>();		
		
		cobrardetallecobrossSeleccionados=this.getCobrarDetalleCobrossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCobrarDetalleCobross("Todos",cobrardetallecobrossSeleccionados);
		
	}	
	
	public void generarReporteNormalCobrarDetalleCobrossSeleccionados() throws Exception {
		ArrayList<CobrarDetalleCobros> cobrardetallecobrossSeleccionados=new ArrayList<CobrarDetalleCobros>();		
		
		cobrardetallecobrossSeleccionados=this.getCobrarDetalleCobrossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCobrarDetalleCobross("Todos",cobrardetallecobrossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCobrarDetalleCobrossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CobrarDetalleCobros> cobrardetallecobrossSeleccionados=new ArrayList<CobrarDetalleCobros>();
		
		cobrardetallecobrossSeleccionados=this.getCobrarDetalleCobrossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCobrarDetalleCobross("Todos",cobrardetallecobrossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCobrarDetalleCobrossSeleccionados() throws Exception {
		ArrayList<CobrarDetalleCobros> cobrardetallecobrossSeleccionados=new ArrayList<CobrarDetalleCobros>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCobrarDetalleCobros();
		
		
		cobrardetallecobrossSeleccionados=this.getCobrarDetalleCobrossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCobrarDetalleCobros();
		
		
		//this.generarReporteCobrarDetalleCobross("Todos",cobrardetallecobrossSeleccionados ,cobrardetallecobrosImplementable,cobrardetallecobrosImplementableHome);
	}
	
	public void mostrarImportacionCobrarDetalleCobross() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCobrarDetalleCobros();
		
		this.abrirFrameImportacionCobrarDetalleCobros();		
		
			
		//this.generarReporteCobrarDetalleCobross("Todos",cobrardetallecobrossSeleccionados ,cobrardetallecobrosImplementable,cobrardetallecobrosImplementableHome);
	}
	
	public void importarCobrarDetalleCobross() throws Exception {		
	
	}
	
	public void exportarCobrarDetalleCobrossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCobrarDetalleCobrossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCobrarDetalleCobrossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCobrarDetalleCobrossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cobrar Detalle Cobros",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCobrarDetalleCobrossSeleccionados() throws Exception {
		ArrayList<CobrarDetalleCobros> cobrardetallecobrossSeleccionados=new ArrayList<CobrarDetalleCobros>();		
		
		cobrardetallecobrossSeleccionados=this.getCobrarDetalleCobrossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrardetallecobros."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCobrarDetalleCobros(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CobrarDetalleCobros cobrardetallecobrosAux:cobrardetallecobrossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCobrarDetalleCobros(cobrardetallecobrosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cobrardetallecobrosAux.setsDetalleGeneralEntityReporte(cobrardetallecobrosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Detalle Cobros",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCobrarDetalleCobros(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CobrarDetalleCobrosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarDetalleCobrosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarDetalleCobrosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarDetalleCobrosConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarDetalleCobrosConstantesFunciones.LABEL_IDCIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarDetalleCobrosConstantesFunciones.LABEL_IDZONA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarDetalleCobrosConstantesFunciones.LABEL_IDGRUPOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarDetalleCobrosConstantesFunciones.LABEL_IDVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBREVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarDetalleCobrosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarDetalleCobrosConstantesFunciones.LABEL_APELLIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALABONOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURASACTUAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSANTERIOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSACTUAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCobrarDetalleCobros(CobrarDetalleCobros cobrardetallecobros,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cobrardetallecobros.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrardetallecobros.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrardetallecobros.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrardetallecobros.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrardetallecobros.getciudad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrardetallecobros.getzona_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrardetallecobros.getgrupocliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrardetallecobros.getvendedor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrardetallecobros.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrardetallecobros.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrardetallecobros.getnombre_vendedor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrardetallecobros.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrardetallecobros.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrardetallecobros.getapellido();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrardetallecobros.gettotal_facturas().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrardetallecobros.gettotal_abonos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrardetallecobros.gettotal_facturas_actual().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrardetallecobros.getabonos_anterior().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrardetallecobros.getabonos_actual().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCobrarDetalleCobrossSeleccionados() throws Exception {
		ArrayList<CobrarDetalleCobros> cobrardetallecobrossSeleccionados=new ArrayList<CobrarDetalleCobros>();		
		
		cobrardetallecobrossSeleccionados=this.getCobrarDetalleCobrossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrardetallecobros.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CobrarDetalleCobross");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCobrarDetalleCobros(row);				
				iRow++;
			}				
			
			for(CobrarDetalleCobros cobrardetallecobrosAux:cobrardetallecobrossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCobrarDetalleCobros(cobrardetallecobrosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Detalle Cobros",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCobrarDetalleCobrossSeleccionados() throws Exception {
		ArrayList<CobrarDetalleCobros> cobrardetallecobrossSeleccionados=new ArrayList<CobrarDetalleCobros>();		
		
		cobrardetallecobrossSeleccionados=this.getCobrarDetalleCobrossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrardetallecobros.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cobrardetallecobross");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cobrardetallecobros");
			//elementRoot.appendChild(element);
		
			for(CobrarDetalleCobros cobrardetallecobrosAux:cobrardetallecobrossSeleccionados) {
				element = document.createElement("cobrardetallecobros");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCobrarDetalleCobros(cobrardetallecobrosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Detalle Cobros",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCobrarDetalleCobros(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_IDCIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_IDZONA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_IDVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBREVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_APELLIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURAS);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALABONOS);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURASACTUAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSANTERIOR);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSACTUAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCobrarDetalleCobros(CobrarDetalleCobros cobrardetallecobros,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cobrardetallecobros.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrardetallecobros.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrardetallecobros.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrardetallecobros.getciudad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrardetallecobros.getzona_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrardetallecobros.getgrupocliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrardetallecobros.getvendedor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrardetallecobros.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrardetallecobros.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrardetallecobros.getnombre_vendedor());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrardetallecobros.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrardetallecobros.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrardetallecobros.getapellido());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrardetallecobros.gettotal_facturas());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrardetallecobros.gettotal_abonos());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrardetallecobros.gettotal_facturas_actual());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrardetallecobros.getabonos_anterior());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrardetallecobros.getabonos_actual());				
	}
	
	public void setFilaDatosExportarXmlCobrarDetalleCobros(CobrarDetalleCobros cobrardetallecobros,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CobrarDetalleCobrosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cobrardetallecobros.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CobrarDetalleCobrosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cobrardetallecobros.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CobrarDetalleCobrosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cobrardetallecobros.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementpais_descripcion = document.createElement(CobrarDetalleCobrosConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(cobrardetallecobros.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementciudad_descripcion = document.createElement(CobrarDetalleCobrosConstantesFunciones.IDCIUDAD);
		elementciudad_descripcion.appendChild(document.createTextNode(cobrardetallecobros.getciudad_descripcion()));
		element.appendChild(elementciudad_descripcion);

		Element elementzona_descripcion = document.createElement(CobrarDetalleCobrosConstantesFunciones.IDZONA);
		elementzona_descripcion.appendChild(document.createTextNode(cobrardetallecobros.getzona_descripcion()));
		element.appendChild(elementzona_descripcion);

		Element elementgrupocliente_descripcion = document.createElement(CobrarDetalleCobrosConstantesFunciones.IDGRUPOCLIENTE);
		elementgrupocliente_descripcion.appendChild(document.createTextNode(cobrardetallecobros.getgrupocliente_descripcion()));
		element.appendChild(elementgrupocliente_descripcion);

		Element elementvendedor_descripcion = document.createElement(CobrarDetalleCobrosConstantesFunciones.IDVENDEDOR);
		elementvendedor_descripcion.appendChild(document.createTextNode(cobrardetallecobros.getvendedor_descripcion()));
		element.appendChild(elementvendedor_descripcion);

		Element elementfecha_emision = document.createElement(CobrarDetalleCobrosConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision.appendChild(document.createTextNode(cobrardetallecobros.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_emision_hasta = document.createElement(CobrarDetalleCobrosConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(cobrardetallecobros.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_vendedor = document.createElement(CobrarDetalleCobrosConstantesFunciones.NOMBREVENDEDOR);
		elementnombre_vendedor.appendChild(document.createTextNode(cobrardetallecobros.getnombre_vendedor().trim()));
		element.appendChild(elementnombre_vendedor);

		Element elementcodigo = document.createElement(CobrarDetalleCobrosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(cobrardetallecobros.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(CobrarDetalleCobrosConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(cobrardetallecobros.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementapellido = document.createElement(CobrarDetalleCobrosConstantesFunciones.APELLIDO);
		elementapellido.appendChild(document.createTextNode(cobrardetallecobros.getapellido().trim()));
		element.appendChild(elementapellido);

		Element elementtotal_facturas = document.createElement(CobrarDetalleCobrosConstantesFunciones.TOTALFACTURAS);
		elementtotal_facturas.appendChild(document.createTextNode(cobrardetallecobros.gettotal_facturas().toString().trim()));
		element.appendChild(elementtotal_facturas);

		Element elementtotal_abonos = document.createElement(CobrarDetalleCobrosConstantesFunciones.TOTALABONOS);
		elementtotal_abonos.appendChild(document.createTextNode(cobrardetallecobros.gettotal_abonos().toString().trim()));
		element.appendChild(elementtotal_abonos);

		Element elementtotal_facturas_actual = document.createElement(CobrarDetalleCobrosConstantesFunciones.TOTALFACTURASACTUAL);
		elementtotal_facturas_actual.appendChild(document.createTextNode(cobrardetallecobros.gettotal_facturas_actual().toString().trim()));
		element.appendChild(elementtotal_facturas_actual);

		Element elementabonos_anterior = document.createElement(CobrarDetalleCobrosConstantesFunciones.ABONOSANTERIOR);
		elementabonos_anterior.appendChild(document.createTextNode(cobrardetallecobros.getabonos_anterior().toString().trim()));
		element.appendChild(elementabonos_anterior);

		Element elementabonos_actual = document.createElement(CobrarDetalleCobrosConstantesFunciones.ABONOSACTUAL);
		elementabonos_actual.appendChild(document.createTextNode(cobrardetallecobros.getabonos_actual().toString().trim()));
		element.appendChild(elementabonos_actual);
	}
	
	public void generarReporteGroupGenericoCobrarDetalleCobrossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CobrarDetalleCobros> cobrardetallecobrossSeleccionados=new ArrayList<CobrarDetalleCobros>();
		
		cobrardetallecobrossSeleccionados=this.getCobrarDetalleCobrossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCobrarDetalleCobros(cobrardetallecobrossSeleccionados);
		
		this.generarReporteCobrarDetalleCobross("Todos",cobrardetallecobrossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCobrarDetalleCobros(ArrayList<CobrarDetalleCobros> cobrardetallecobrossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CobrarDetalleCobros cobrardetallecobrosAux:cobrardetallecobrossSeleccionados) {
				cobrardetallecobrosAux.setsDetalleGeneralEntityReporte(cobrardetallecobrosAux.toString());
			
				if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cobrardetallecobrosAux.setsDescripcionGeneralEntityReporte1(cobrardetallecobrosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					cobrardetallecobrosAux.setsDescripcionGeneralEntityReporte1(cobrardetallecobrosAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_IDCIUDAD)) {
					existe=true;
					cobrardetallecobrosAux.setsDescripcionGeneralEntityReporte1(cobrardetallecobrosAux.getciudad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_IDZONA)) {
					existe=true;
					cobrardetallecobrosAux.setsDescripcionGeneralEntityReporte1(cobrardetallecobrosAux.getzona_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_IDGRUPOCLIENTE)) {
					existe=true;
					cobrardetallecobrosAux.setsDescripcionGeneralEntityReporte1(cobrardetallecobrosAux.getgrupocliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_IDVENDEDOR)) {
					existe=true;
					cobrardetallecobrosAux.setsDescripcionGeneralEntityReporte1(cobrardetallecobrosAux.getvendedor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					cobrardetallecobrosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrardetallecobrosAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					cobrardetallecobrosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrardetallecobrosAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
					existe=true;
					cobrardetallecobrosAux.setsDescripcionGeneralEntityReporte1(cobrardetallecobrosAux.getnombre_vendedor());
				}
				 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					cobrardetallecobrosAux.setsDescripcionGeneralEntityReporte1(cobrardetallecobrosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					cobrardetallecobrosAux.setsDescripcionGeneralEntityReporte1(cobrardetallecobrosAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(CobrarDetalleCobrosConstantesFunciones.LABEL_APELLIDO)) {
					existe=true;
					cobrardetallecobrosAux.setsDescripcionGeneralEntityReporte1(cobrardetallecobrosAux.getapellido());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarDetalleCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCobrarDetalleCobros(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCobrarDetalleCobros=true;
				this.isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros=true;
				this.isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros=true;
			}
			
			this.isVisibilidadCeldaModificarCobrarDetalleCobros=false;
			this.isVisibilidadCeldaActualizarCobrarDetalleCobros=false;
			this.isVisibilidadCeldaEliminarCobrarDetalleCobros=false;
			this.isVisibilidadCeldaCancelarCobrarDetalleCobros=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarDetalleCobros=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarDetalleCobros=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCobrarDetalleCobros=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros=false;
			this.isVisibilidadCeldaModificarCobrarDetalleCobros=false;
			this.isVisibilidadCeldaActualizarCobrarDetalleCobros=true;
			this.isVisibilidadCeldaEliminarCobrarDetalleCobros=false;
			this.isVisibilidadCeldaCancelarCobrarDetalleCobros=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarDetalleCobros=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarDetalleCobros=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCobrarDetalleCobros=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros=false;
			this.isVisibilidadCeldaModificarCobrarDetalleCobros=false;
			this.isVisibilidadCeldaActualizarCobrarDetalleCobros=true;
			this.isVisibilidadCeldaEliminarCobrarDetalleCobros=true;
			this.isVisibilidadCeldaCancelarCobrarDetalleCobros=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarDetalleCobros=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarDetalleCobros=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCobrarDetalleCobros=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros=false;
			this.isVisibilidadCeldaModificarCobrarDetalleCobros=false;
			this.isVisibilidadCeldaActualizarCobrarDetalleCobros=true;
			this.isVisibilidadCeldaEliminarCobrarDetalleCobros=false;
			this.isVisibilidadCeldaCancelarCobrarDetalleCobros=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarDetalleCobros=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarDetalleCobros=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCobrarDetalleCobros=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros=true;
			this.isVisibilidadCeldaModificarCobrarDetalleCobros=false;
			this.isVisibilidadCeldaActualizarCobrarDetalleCobros=false;
			this.isVisibilidadCeldaEliminarCobrarDetalleCobros=false;
			this.isVisibilidadCeldaCancelarCobrarDetalleCobros=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarDetalleCobros=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarDetalleCobros=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCobrarDetalleCobros=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros=false;
			this.isVisibilidadCeldaActualizarCobrarDetalleCobros=false;
			this.isVisibilidadCeldaEliminarCobrarDetalleCobros=false;
			this.isVisibilidadCeldaCancelarCobrarDetalleCobros=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarDetalleCobros=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarDetalleCobros=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCobrarDetalleCobros=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros=false;
			this.isVisibilidadCeldaModificarCobrarDetalleCobros=true;
			this.isVisibilidadCeldaActualizarCobrarDetalleCobros=false;
			this.isVisibilidadCeldaEliminarCobrarDetalleCobros=false;
			this.isVisibilidadCeldaCancelarCobrarDetalleCobros=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarDetalleCobros=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarDetalleCobros=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CobrarDetalleCobrosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCobrarDetalleCobros=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros=true;
		} else {
			this.actualizarEstadoPanelsCobrarDetalleCobros(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCobrarDetalleCobros=false;
			//this.isVisibilidadCeldaVerFormCobrarDetalleCobros=false;
			this.isVisibilidadCeldaDuplicarCobrarDetalleCobros=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cobrardetallecobrosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros=false;
		} else {
			this.isVisibilidadCeldaNuevoCobrarDetalleCobros=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
			if(!cobrardetallecobrosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros=false;												
			}
			
			this.jButtonCerrarCobrarDetalleCobros.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros=false;
		}
		
		if(!this.permiteMantenimiento(this.cobrardetallecobros)) {
			this.isVisibilidadCeldaActualizarCobrarDetalleCobros=false;
			this.isVisibilidadCeldaEliminarCobrarDetalleCobros=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoCobrarDetalleCobros=false;
		this.isVisibilidadCeldaNuevoRelacionesCobrarDetalleCobros=false;
		this.isVisibilidadCeldaGuardarCambiosCobrarDetalleCobros=false;
		//this.isVisibilidadCeldaModificarCobrarDetalleCobros=true;
		this.isVisibilidadCeldaActualizarCobrarDetalleCobros=false;
		this.isVisibilidadCeldaEliminarCobrarDetalleCobros=false;
		//this.isVisibilidadCeldaCancelarCobrarDetalleCobros=true;			
		this.isVisibilidadCeldaGuardarCobrarDetalleCobros=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarDetalleCobros() {
	}
	
	public void actualizarEstadoPanelsCobrarDetalleCobros(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCobrarDetalleCobros!=null) {
				this.jScrollPanelDatosEdicionCobrarDetalleCobros.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarDetalleCobros!=null) {
				this.jTabbedPaneBusquedasCobrarDetalleCobros.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarDetalleCobros!=null) {
				this.jScrollPanelDatosCobrarDetalleCobros.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarDetalleCobros!=null) {
				this.jPanelPaginacionCobrarDetalleCobros.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarDetalleCobros!=null) {
				this.jPanelParametrosReportesCobrarDetalleCobros.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCobrarDetalleCobros!=null) {
				this.jScrollPanelDatosEdicionCobrarDetalleCobros.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarDetalleCobros!=null) {
				this.jTabbedPaneBusquedasCobrarDetalleCobros.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCobrarDetalleCobros!=null) {
				this.jScrollPanelDatosCobrarDetalleCobros.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarDetalleCobros!=null) {
				this.jPanelPaginacionCobrarDetalleCobros.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarDetalleCobros!=null) {
				this.jPanelParametrosReportesCobrarDetalleCobros.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCobrarDetalleCobros!=null) {
				this.jScrollPanelDatosEdicionCobrarDetalleCobros.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarDetalleCobros!=null) {
				this.jTabbedPaneBusquedasCobrarDetalleCobros.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarDetalleCobros!=null) {
				this.jScrollPanelDatosCobrarDetalleCobros.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarDetalleCobros!=null) {
				this.jPanelPaginacionCobrarDetalleCobros.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarDetalleCobros!=null) {
				this.jPanelParametrosReportesCobrarDetalleCobros.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCobrarDetalleCobros!=null) {
				this.jScrollPanelDatosEdicionCobrarDetalleCobros.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarDetalleCobros!=null) {
				this.jTabbedPaneBusquedasCobrarDetalleCobros.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarDetalleCobros!=null) {
				this.jScrollPanelDatosCobrarDetalleCobros.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarDetalleCobros!=null) {
				this.jPanelPaginacionCobrarDetalleCobros.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarDetalleCobros!=null) {
				this.jPanelParametrosReportesCobrarDetalleCobros.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCobrarDetalleCobros!=null) {
				this.jScrollPanelDatosEdicionCobrarDetalleCobros.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarDetalleCobros!=null) {
				this.jTabbedPaneBusquedasCobrarDetalleCobros.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarDetalleCobros!=null) {
				this.jScrollPanelDatosCobrarDetalleCobros.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarDetalleCobros!=null) {
				this.jPanelPaginacionCobrarDetalleCobros.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarDetalleCobros!=null) {
				this.jPanelParametrosReportesCobrarDetalleCobros.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCobrarDetalleCobros!=null) {
				this.jScrollPanelDatosEdicionCobrarDetalleCobros.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarDetalleCobros!=null) {
				this.jTabbedPaneBusquedasCobrarDetalleCobros.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarDetalleCobros!=null) {
				this.jScrollPanelDatosCobrarDetalleCobros.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarDetalleCobros!=null) {
				this.jPanelPaginacionCobrarDetalleCobros.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarDetalleCobros!=null) {
				this.jPanelParametrosReportesCobrarDetalleCobros.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCobrarDetalleCobros!=null) {
				this.jScrollPanelDatosEdicionCobrarDetalleCobros.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarDetalleCobros!=null) {
				this.jTabbedPaneBusquedasCobrarDetalleCobros.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarDetalleCobros!=null) {
				this.jScrollPanelDatosCobrarDetalleCobros.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarDetalleCobros!=null) {
				this.jPanelPaginacionCobrarDetalleCobros.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarDetalleCobros!=null) {
				this.jPanelParametrosReportesCobrarDetalleCobros.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCobrarDetalleCobros!=null) {
					this.jTabbedPaneBusquedasCobrarDetalleCobros.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCobrarDetalleCobros!=null) {
				this.jPanelParametrosReportesCobrarDetalleCobros.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarDetalleCobros!=null) {
				this.jTabbedPaneBusquedasCobrarDetalleCobros.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCobrarDetalleCobros!=null) {
				this.jPanelParametrosReportesCobrarDetalleCobros.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaCobrarDetalleCobros=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaCobrarDetalleCobros) {this.jTabbedPaneBusquedasCobrarDetalleCobros.remove(jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros);}
		}
		
	}

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadBusquedaCobrarDetalleCobros=isParaPais;
			if(!this.isVisibilidadBusquedaCobrarDetalleCobros) {this.jTabbedPaneBusquedasCobrarDetalleCobros.remove(jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros);}
		}
		
	}

	public void setVisibilidadBusquedasParaCiudad(Boolean isParaCiudad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCiudadNegation=!isParaCiudad;

			this.isVisibilidadBusquedaCobrarDetalleCobros=isParaCiudad;
			if(!this.isVisibilidadBusquedaCobrarDetalleCobros) {this.jTabbedPaneBusquedasCobrarDetalleCobros.remove(jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros);}
		}
		
	}

	public void setVisibilidadBusquedasParaZona(Boolean isParaZona){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaZonaNegation=!isParaZona;

			this.isVisibilidadBusquedaCobrarDetalleCobros=isParaZona;
			if(!this.isVisibilidadBusquedaCobrarDetalleCobros) {this.jTabbedPaneBusquedasCobrarDetalleCobros.remove(jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros);}
		}
		
	}

	public void setVisibilidadBusquedasParaGrupoCliente(Boolean isParaGrupoCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaGrupoClienteNegation=!isParaGrupoCliente;

			this.isVisibilidadBusquedaCobrarDetalleCobros=isParaGrupoCliente;
			if(!this.isVisibilidadBusquedaCobrarDetalleCobros) {this.jTabbedPaneBusquedasCobrarDetalleCobros.remove(jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros);}
		}
		
	}

	public void setVisibilidadBusquedasParaVendedor(Boolean isParaVendedor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaVendedorNegation=!isParaVendedor;

			this.isVisibilidadBusquedaCobrarDetalleCobros=isParaVendedor;
			if(!this.isVisibilidadBusquedaCobrarDetalleCobros) {this.jTabbedPaneBusquedasCobrarDetalleCobros.remove(jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros);}
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
			
			this.inicializarActualizarBindingTablaCobrarDetalleCobros(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCobrarDetalleCobros() {
		this.updateBorderResaltarBusquedasFormularioCobrarDetalleCobros();
		this.updateVisibilidadBusquedasFormularioCobrarDetalleCobros();
		this.updateHabilitarBusquedasFormularioCobrarDetalleCobros();
	}
	
	public void updateBorderResaltarBusquedasFormularioCobrarDetalleCobros() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCobrarDetalleCobros.getComponents().length>0) {
	

		if(this.cobrardetallecobrosConstantesFunciones.resaltarBusquedaCobrarDetalleCobrosCobrarDetalleCobros!=null) {
			index= this.jTabbedPaneBusquedasCobrarDetalleCobros.indexOfComponent(this.jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarDetalleCobros.getComponent(index);
				jPanel.setBorder(this.cobrardetallecobrosConstantesFunciones.resaltarBusquedaCobrarDetalleCobrosCobrarDetalleCobros);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCobrarDetalleCobros() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCobrarDetalleCobros.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarDetalleCobros.indexOfComponent(this.jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarDetalleCobros.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarBusquedaCobrarDetalleCobrosCobrarDetalleCobros);
			if(!this.cobrardetallecobrosConstantesFunciones.mostrarBusquedaCobrarDetalleCobrosCobrarDetalleCobros && index>-1) {
				this.jTabbedPaneBusquedasCobrarDetalleCobros.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCobrarDetalleCobros() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCobrarDetalleCobros.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarDetalleCobros.indexOfComponent(this.jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarDetalleCobros.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cobrardetallecobrosConstantesFunciones.activarBusquedaCobrarDetalleCobrosCobrarDetalleCobros);
				this.jTabbedPaneBusquedasCobrarDetalleCobros.setEnabledAt(index,this.cobrardetallecobrosConstantesFunciones.activarBusquedaCobrarDetalleCobrosCobrarDetalleCobros);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCobrarDetalleCobros(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaCobrarDetalleCobros")) {
			index= this.jTabbedPaneBusquedasCobrarDetalleCobros.indexOfComponent(this.jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros);

			this.jTabbedPaneBusquedasCobrarDetalleCobros.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarDetalleCobros.getComponent(index);

			this.cobrardetallecobrosConstantesFunciones.setResaltarBusquedaCobrarDetalleCobrosCobrarDetalleCobros(resaltar);

			jPanel.setBorder(this.cobrardetallecobrosConstantesFunciones.resaltarBusquedaCobrarDetalleCobrosCobrarDetalleCobros);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCobrarDetalleCobros.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCobrarDetalleCobros() throws Exception {

		if(this.jInternalFrameDetalleFormCobrarDetalleCobros==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCobrarDetalleCobros();
		this.updateVisibilidadResaltarControlesFormularioCobrarDetalleCobros();
		this.updateHabilitarResaltarControlesFormularioCobrarDetalleCobros();
		
	}
	
	public void updateBorderResaltarControlesFormularioCobrarDetalleCobros() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cobrardetallecobrosConstantesFunciones.resaltaridCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelidCobrarDetalleCobros.setBorder(this.cobrardetallecobrosConstantesFunciones.resaltaridCobrarDetalleCobros);}
		if(this.cobrardetallecobrosConstantesFunciones.resaltarid_empresaCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_empresaCobrarDetalleCobros.setBorder(this.cobrardetallecobrosConstantesFunciones.resaltarid_empresaCobrarDetalleCobros);}
		if(this.cobrardetallecobrosConstantesFunciones.resaltarid_paisCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_paisCobrarDetalleCobros.setBorder(this.cobrardetallecobrosConstantesFunciones.resaltarid_paisCobrarDetalleCobros);}
		if(this.cobrardetallecobrosConstantesFunciones.resaltarid_ciudadCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_ciudadCobrarDetalleCobros.setBorder(this.cobrardetallecobrosConstantesFunciones.resaltarid_ciudadCobrarDetalleCobros);}
		if(this.cobrardetallecobrosConstantesFunciones.resaltarid_zonaCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_zonaCobrarDetalleCobros.setBorder(this.cobrardetallecobrosConstantesFunciones.resaltarid_zonaCobrarDetalleCobros);}
		if(this.cobrardetallecobrosConstantesFunciones.resaltarid_grupo_clienteCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_grupo_clienteCobrarDetalleCobros.setBorder(this.cobrardetallecobrosConstantesFunciones.resaltarid_grupo_clienteCobrarDetalleCobros);}
		if(this.cobrardetallecobrosConstantesFunciones.resaltarid_vendedorCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_vendedorCobrarDetalleCobros.setBorder(this.cobrardetallecobrosConstantesFunciones.resaltarid_vendedorCobrarDetalleCobros);}
		if(this.cobrardetallecobrosConstantesFunciones.resaltarfecha_emisionCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {this.jInternalFrameDetalleFormCobrarDetalleCobros.jDateChooserfecha_emisionCobrarDetalleCobros.setBorder(this.cobrardetallecobrosConstantesFunciones.resaltarfecha_emisionCobrarDetalleCobros);}
		if(this.cobrardetallecobrosConstantesFunciones.resaltarfecha_emision_hastaCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {this.jInternalFrameDetalleFormCobrarDetalleCobros.jDateChooserfecha_emision_hastaCobrarDetalleCobros.setBorder(this.cobrardetallecobrosConstantesFunciones.resaltarfecha_emision_hastaCobrarDetalleCobros);}
		if(this.cobrardetallecobrosConstantesFunciones.resaltarnombre_vendedorCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreanombre_vendedorCobrarDetalleCobros.setBorder(this.cobrardetallecobrosConstantesFunciones.resaltarnombre_vendedorCobrarDetalleCobros);}
		if(this.cobrardetallecobrosConstantesFunciones.resaltarcodigoCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldcodigoCobrarDetalleCobros.setBorder(this.cobrardetallecobrosConstantesFunciones.resaltarcodigoCobrarDetalleCobros);}
		if(this.cobrardetallecobrosConstantesFunciones.resaltarnombreCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreanombreCobrarDetalleCobros.setBorder(this.cobrardetallecobrosConstantesFunciones.resaltarnombreCobrarDetalleCobros);}
		if(this.cobrardetallecobrosConstantesFunciones.resaltarapellidoCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreaapellidoCobrarDetalleCobros.setBorder(this.cobrardetallecobrosConstantesFunciones.resaltarapellidoCobrarDetalleCobros);}
		if(this.cobrardetallecobrosConstantesFunciones.resaltartotal_facturasCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_facturasCobrarDetalleCobros.setBorder(this.cobrardetallecobrosConstantesFunciones.resaltartotal_facturasCobrarDetalleCobros);}
		if(this.cobrardetallecobrosConstantesFunciones.resaltartotal_abonosCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_abonosCobrarDetalleCobros.setBorder(this.cobrardetallecobrosConstantesFunciones.resaltartotal_abonosCobrarDetalleCobros);}
		if(this.cobrardetallecobrosConstantesFunciones.resaltartotal_facturas_actualCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_facturas_actualCobrarDetalleCobros.setBorder(this.cobrardetallecobrosConstantesFunciones.resaltartotal_facturas_actualCobrarDetalleCobros);}
		if(this.cobrardetallecobrosConstantesFunciones.resaltarabonos_anteriorCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldabonos_anteriorCobrarDetalleCobros.setBorder(this.cobrardetallecobrosConstantesFunciones.resaltarabonos_anteriorCobrarDetalleCobros);}
		if(this.cobrardetallecobrosConstantesFunciones.resaltarabonos_actualCobrarDetalleCobros!=null && this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldabonos_actualCobrarDetalleCobros.setBorder(this.cobrardetallecobrosConstantesFunciones.resaltarabonos_actualCobrarDetalleCobros);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCobrarDetalleCobros() throws Exception {		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
	
		//this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelidCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostraridCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jPanelidCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostraridCobrarDetalleCobros);
		//this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_empresaCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarid_empresaCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jPanelid_empresaCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarid_empresaCobrarDetalleCobros);
		//this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_paisCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarid_paisCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jPanelid_paisCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarid_paisCobrarDetalleCobros);
		//this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_ciudadCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarid_ciudadCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jPanelid_ciudadCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarid_ciudadCobrarDetalleCobros);
		//this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_zonaCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarid_zonaCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jPanelid_zonaCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarid_zonaCobrarDetalleCobros);
		//this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_grupo_clienteCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarid_grupo_clienteCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jPanelid_grupo_clienteCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarid_grupo_clienteCobrarDetalleCobros);
		//this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_vendedorCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarid_vendedorCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jPanelid_vendedorCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarid_vendedorCobrarDetalleCobros);
		//this.jInternalFrameDetalleFormCobrarDetalleCobros.jDateChooserfecha_emisionCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarfecha_emisionCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jPanelfecha_emisionCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarfecha_emisionCobrarDetalleCobros);
		//this.jInternalFrameDetalleFormCobrarDetalleCobros.jDateChooserfecha_emision_hastaCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarfecha_emision_hastaCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jPanelfecha_emision_hastaCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarfecha_emision_hastaCobrarDetalleCobros);
		//this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreanombre_vendedorCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarnombre_vendedorCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jPanelnombre_vendedorCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarnombre_vendedorCobrarDetalleCobros);
		//this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldcodigoCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarcodigoCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jPanelcodigoCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarcodigoCobrarDetalleCobros);
		//this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreanombreCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarnombreCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jPanelnombreCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarnombreCobrarDetalleCobros);
		//this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreaapellidoCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarapellidoCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jPanelapellidoCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarapellidoCobrarDetalleCobros);
		//this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_facturasCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrartotal_facturasCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jPaneltotal_facturasCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrartotal_facturasCobrarDetalleCobros);
		//this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_abonosCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrartotal_abonosCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jPaneltotal_abonosCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrartotal_abonosCobrarDetalleCobros);
		//this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_facturas_actualCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrartotal_facturas_actualCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jPaneltotal_facturas_actualCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrartotal_facturas_actualCobrarDetalleCobros);
		//this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldabonos_anteriorCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarabonos_anteriorCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jPanelabonos_anteriorCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarabonos_anteriorCobrarDetalleCobros);
		//this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldabonos_actualCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarabonos_actualCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jPanelabonos_actualCobrarDetalleCobros.setVisible(this.cobrardetallecobrosConstantesFunciones.mostrarabonos_actualCobrarDetalleCobros);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCobrarDetalleCobros() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarDetalleCobros!=null) {
	
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jLabelidCobrarDetalleCobros.setEnabled(this.cobrardetallecobrosConstantesFunciones.activaridCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_empresaCobrarDetalleCobros.setEnabled(this.cobrardetallecobrosConstantesFunciones.activarid_empresaCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_paisCobrarDetalleCobros.setEnabled(this.cobrardetallecobrosConstantesFunciones.activarid_paisCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_ciudadCobrarDetalleCobros.setEnabled(this.cobrardetallecobrosConstantesFunciones.activarid_ciudadCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_zonaCobrarDetalleCobros.setEnabled(this.cobrardetallecobrosConstantesFunciones.activarid_zonaCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_grupo_clienteCobrarDetalleCobros.setEnabled(this.cobrardetallecobrosConstantesFunciones.activarid_grupo_clienteCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jComboBoxid_vendedorCobrarDetalleCobros.setEnabled(this.cobrardetallecobrosConstantesFunciones.activarid_vendedorCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jDateChooserfecha_emisionCobrarDetalleCobros.setEnabled(this.cobrardetallecobrosConstantesFunciones.activarfecha_emisionCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jDateChooserfecha_emision_hastaCobrarDetalleCobros.setEnabled(this.cobrardetallecobrosConstantesFunciones.activarfecha_emision_hastaCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreanombre_vendedorCobrarDetalleCobros.setEnabled(this.cobrardetallecobrosConstantesFunciones.activarnombre_vendedorCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldcodigoCobrarDetalleCobros.setEnabled(this.cobrardetallecobrosConstantesFunciones.activarcodigoCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreanombreCobrarDetalleCobros.setEnabled(this.cobrardetallecobrosConstantesFunciones.activarnombreCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextAreaapellidoCobrarDetalleCobros.setEnabled(this.cobrardetallecobrosConstantesFunciones.activarapellidoCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_facturasCobrarDetalleCobros.setEnabled(this.cobrardetallecobrosConstantesFunciones.activartotal_facturasCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_abonosCobrarDetalleCobros.setEnabled(this.cobrardetallecobrosConstantesFunciones.activartotal_abonosCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldtotal_facturas_actualCobrarDetalleCobros.setEnabled(this.cobrardetallecobrosConstantesFunciones.activartotal_facturas_actualCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldabonos_anteriorCobrarDetalleCobros.setEnabled(this.cobrardetallecobrosConstantesFunciones.activarabonos_anteriorCobrarDetalleCobros);
		this.jInternalFrameDetalleFormCobrarDetalleCobros.jTextFieldabonos_actualCobrarDetalleCobros.setEnabled(this.cobrardetallecobrosConstantesFunciones.activarabonos_actualCobrarDetalleCobros);
		}
	}
	
		
}