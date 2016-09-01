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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




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

import com.bydan.erp.inventario.util.PuertoConstantesFunciones;
import com.bydan.erp.inventario.util.PuertoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.PuertoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.PuertoBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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


import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PuertoBeanSwingJInternalFrame extends PuertoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PuertoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Puerto> puertoValidator = new ClassValidator<Puerto>(Puerto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Puerto puerto;	
	public Puerto puertoAux;
	public Puerto puertoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Puerto puertoTotales;
	public Long idPuertoActual;
	public Long iIdNuevoPuerto=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboTipoPuerto="";

	public List<TipoPuerto> tipopuertosForeignKey;

	public List<TipoPuerto> gettipopuertosForeignKey() {
		return tipopuertosForeignKey;
	}

	public void settipopuertosForeignKey(List<TipoPuerto> tipopuertosForeignKey) {
		this.tipopuertosForeignKey = tipopuertosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoPuerto tipopuertoForeignKey;

	public TipoPuerto gettipopuertoForeignKey() {
		return tipopuertoForeignKey;
	}

	public void settipopuertoForeignKey(TipoPuerto tipopuertoForeignKey) {
		this.tipopuertoForeignKey = tipopuertoForeignKey;
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

		
	
	
	
	
	

	public Boolean isTienePermisosPedidoCompraImpor=false;

	public Boolean getIsTienePermisosPedidoCompraImpor() {
		return isTienePermisosPedidoCompraImpor;
	}

	public void setIsTienePermisosPedidoCompraImpor(Boolean isTienePermisosPedidoCompraImpor) {
		this.isTienePermisosPedidoCompraImpor= isTienePermisosPedidoCompraImpor;
	}


	public Boolean isTienePermisosLiquidacionImpor=false;

	public Boolean getIsTienePermisosLiquidacionImpor() {
		return isTienePermisosLiquidacionImpor;
	}

	public void setIsTienePermisosLiquidacionImpor(Boolean isTienePermisosLiquidacionImpor) {
		this.isTienePermisosLiquidacionImpor= isTienePermisosLiquidacionImpor;
	}


	public Boolean isTienePermisosEmbarcador=false;

	public Boolean getIsTienePermisosEmbarcador() {
		return isTienePermisosEmbarcador;
	}

	public void setIsTienePermisosEmbarcador(Boolean isTienePermisosEmbarcador) {
		this.isTienePermisosEmbarcador= isTienePermisosEmbarcador;
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
	
	public Boolean isPermisoTodoPuerto;
	public Boolean isPermisoNuevoPuerto;
	public Boolean isPermisoActualizarPuerto;
	public Boolean isPermisoActualizarOriginalPuerto;
	public Boolean isPermisoEliminarPuerto;
	public Boolean isPermisoGuardarCambiosPuerto;
	public Boolean isPermisoConsultaPuerto;
	public Boolean isPermisoBusquedaPuerto;
	public Boolean isPermisoReportePuerto;
	public Boolean isPermisoPaginacionMedioPuerto;
	public Boolean isPermisoPaginacionAltoPuerto;
	public Boolean isPermisoPaginacionTodoPuerto;
	public Boolean isPermisoCopiarPuerto;
	public Boolean isPermisoVerFormPuerto;
	public Boolean isPermisoDuplicarPuerto;
	public Boolean isPermisoOrdenPuerto;
	
	
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
	
	public PuertoParameterReturnGeneral puertoReturnGeneral;
	public PuertoParameterReturnGeneral puertoParameterGeneral;
	
	

	public PedidoCompraImporLogic pedidocompraimporLogic=null;

	public PedidoCompraImporLogic getPedidoCompraImporLogic() {
		return pedidocompraimporLogic;
	}

	public void setPedidoCompraImporLogic(PedidoCompraImporLogic pedidocompraimporLogic) {
		this.pedidocompraimporLogic = pedidocompraimporLogic;
	}


	public LiquidacionImporLogic liquidacionimporLogic=null;

	public LiquidacionImporLogic getLiquidacionImporLogic() {
		return liquidacionimporLogic;
	}

	public void setLiquidacionImporLogic(LiquidacionImporLogic liquidacionimporLogic) {
		this.liquidacionimporLogic = liquidacionimporLogic;
	}


	public EmbarcadorLogic embarcadorLogic=null;

	public EmbarcadorLogic getEmbarcadorLogic() {
		return embarcadorLogic;
	}

	public void setEmbarcadorLogic(EmbarcadorLogic embarcadorLogic) {
		this.embarcadorLogic = embarcadorLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPuerto=false;
	public Boolean esParaAccionDesdeFormularioPuerto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PuertoSessionBeanAdditional puertoSessionBeanAdditional=null;
	
	public PuertoSessionBeanAdditional getPuertoSessionBeanAdditional() {
		return this.puertoSessionBeanAdditional;
	}
	
	public void setPuertoSessionBeanAdditional(PuertoSessionBeanAdditional puertoSessionBeanAdditional) {
		try {
			this.puertoSessionBeanAdditional=puertoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PuertoBeanSwingJInternalFrameAdditional puertoBeanSwingJInternalFrameAdditional=null;
	//public class PuertoBeanSwingJInternalFrame
	
	public PuertoBeanSwingJInternalFrameAdditional getPuertoBeanSwingJInternalFrameAdditional() {
		return this.puertoBeanSwingJInternalFrameAdditional;
	}
	
	public void setPuertoBeanSwingJInternalFrameAdditional(PuertoBeanSwingJInternalFrameAdditional puertoBeanSwingJInternalFrameAdditional) {
		try {
			this.puertoBeanSwingJInternalFrameAdditional=puertoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PuertoLogic puertoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Puerto puertoBean;
	public PuertoConstantesFunciones puertoConstantesFunciones;
	//public PuertoParameterReturnGeneral puertoReturnGeneral;
	
	//FK
	
	public TipoPuertoLogic tipopuertoLogic;
	public PaisLogic paisLogic;
	
	//PARAMETROS
	
	
	//public List<Puerto> puertos;	
	//public List<Puerto> puertosEliminados;
	//public List<Puerto> puertosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPuerto=false;
	public Boolean isVisibilidadCeldaDuplicarPuerto=true;
	public Boolean isVisibilidadCeldaCopiarPuerto=true;
	public Boolean isVisibilidadCeldaVerFormPuerto=true;
	public Boolean isVisibilidadCeldaOrdenPuerto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPuerto=false;
	public Boolean isVisibilidadCeldaModificarPuerto=false;
	public Boolean isVisibilidadCeldaActualizarPuerto=false;
	public Boolean isVisibilidadCeldaEliminarPuerto=false;
	public Boolean isVisibilidadCeldaCancelarPuerto=false;
	public Boolean isVisibilidadCeldaGuardarPuerto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPuerto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdPais=false;
	public Boolean isVisibilidadFK_IdTipoPuerto=false;
	
	public Long getiIdNuevoPuerto() {
		return this.iIdNuevoPuerto;
	}

	public void setiIdNuevoPuerto(Long iIdNuevoPuerto) {
		this.iIdNuevoPuerto = iIdNuevoPuerto;
	}
	
	public Long getidPuertoActual() {
		return this.idPuertoActual;
	}

	public void setidPuertoActual(Long idPuertoActual) {
		this.idPuertoActual = idPuertoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Puerto getpuerto() {
		return this.puerto;
	}

	public void setpuerto(Puerto puerto) {
		this.puerto = puerto;
	}
	
	public Puerto getpuertoAux() {
		return this.puertoAux;
	}

	public void setpuertoAux(Puerto puertoAux) {
		this.puertoAux = puertoAux;
	}				
	
	public Puerto getpuertoAnterior() {
		return this.puertoAnterior;
	}

	public void setpuertoAnterior(Puerto puertoAnterior) {
		this.puertoAnterior = puertoAnterior;
	}	
	
	public Puerto getpuertoTotales() {
		return this.puertoTotales;
	}

	public void setpuertoTotales(Puerto puertoTotales) {
		this.puertoTotales = puertoTotales;
	}	
	
	public Puerto getpuertoBean() {
		return this.puertoBean;
	}

	public void setpuertoBean(Puerto puertoBean) {
		this.puertoBean = puertoBean;
	}	
	
	public PuertoParameterReturnGeneral getpuertoReturnGeneral() {
		return this.puertoReturnGeneral;
	}

	public void setpuertoReturnGeneral(PuertoParameterReturnGeneral puertoReturnGeneral) {
		this.puertoReturnGeneral = puertoReturnGeneral;
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

	public Long id_tipo_puertoFK_IdTipoPuerto=-1L;

	public Long getid_tipo_puertoFK_IdTipoPuerto() {
		return this.id_tipo_puertoFK_IdTipoPuerto;
	}

	public void setid_tipo_puertoFK_IdTipoPuerto(Long id_tipo_puertoFK_IdTipoPuerto) {
		this.id_tipo_puertoFK_IdTipoPuerto = id_tipo_puertoFK_IdTipoPuerto;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PuertoLogic getPuertoLogic()	{		
		return puertoLogic;
	}

	public void setPuertoLogic(PuertoLogic puertoLogic) {
		this.puertoLogic = puertoLogic;
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
	
	public Boolean getIsEsNuevoPuerto() {
		return isEsNuevoPuerto;
	}

	public void setIsEsNuevoPuerto(Boolean isEsNuevoPuerto) {
		this.isEsNuevoPuerto = isEsNuevoPuerto;
	}

	public Boolean getEsParaAccionDesdeFormularioPuerto() {
		return esParaAccionDesdeFormularioPuerto;
	}
	
	public void setEsParaAccionDesdeFormularioPuerto(Boolean esParaAccionDesdeFormularioPuerto) {
		this.esParaAccionDesdeFormularioPuerto = esParaAccionDesdeFormularioPuerto;
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
	
	
	public void cargarCombosTipoPuertosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipopuertosForeignKey=new ArrayList<TipoPuerto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoPuertoLogic tipopuertoLogic=new TipoPuertoLogic();

			tipopuertoLogic.getTipoPuertoDataAccess().setIsForForeingKeyData(true);

			if(this.puertoSessionBean==null) {
				this.puertoSessionBean=new PuertoSessionBean();
			}

			if(!this.puertoSessionBean.getisBusquedaDesdeForeignKeySesionTipoPuerto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipopuertoLogic.getTipoPuertoDataAccess().setIsForForeingKeyData(true);

					tipopuertoLogic.getTodosTipoPuertosWithConnection(sFinalQuery,new Pagination());

					this.tipopuertosForeignKey=tipopuertoLogic.getTipoPuertos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoPuerto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipopuertoLogic.getEntityWithConnection(puertoSessionBean.getlidTipoPuertoActual());
					this.tipopuertosForeignKey.add(tipopuertoLogic.getTipoPuerto());
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

			if(this.puertoSessionBean==null) {
				this.puertoSessionBean=new PuertoSessionBean();
			}

			if(!this.puertoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
					paisLogic.getEntityWithConnection(puertoSessionBean.getlidPaisActual());
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

	
	
	public void setActualTipoPuertoForeignKey(Long idTipoPuertoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoPuerto  tipopuertoTemp=null;

			for(TipoPuerto tipopuertoAux:tipopuertosForeignKey) {
				if(tipopuertoAux.getId()!=null && tipopuertoAux.getId().equals(idTipoPuertoSeleccionado)) {
					tipopuertoTemp=tipopuertoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipopuertoTemp!=null) {

					if(this.puerto!=null) {
						this.puerto.setTipoPuerto(tipopuertoTemp);
					}

					if(this.jInternalFrameDetalleFormPuerto!=null) {
						this.jInternalFrameDetalleFormPuerto.jComboBoxid_tipo_puertoPuerto.setSelectedItem(tipopuertoTemp);
					}
				} else {
					//jComboBoxid_tipo_puertoPuerto.setSelectedItem(tipopuertoTemp);
					if(this.jInternalFrameDetalleFormPuerto!=null) {
						if(this.jInternalFrameDetalleFormPuerto.jComboBoxid_tipo_puertoPuerto.getItemCount()>0) {
							this.jInternalFrameDetalleFormPuerto.jComboBoxid_tipo_puertoPuerto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoPuerto") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipopuertoTemp!=null && jComboBoxid_tipo_puertoFK_IdTipoPuertoPuerto!=null) {
						jComboBoxid_tipo_puertoFK_IdTipoPuertoPuerto.setSelectedItem(tipopuertoTemp);
					} else {
						if(jComboBoxid_tipo_puertoFK_IdTipoPuertoPuerto!=null) {
							//jComboBoxid_tipo_puertoFK_IdTipoPuertoPuerto.setSelectedItem(tipopuertoTemp);
							if(jComboBoxid_tipo_puertoFK_IdTipoPuertoPuerto.getItemCount()>0) {
								jComboBoxid_tipo_puertoFK_IdTipoPuertoPuerto.setSelectedIndex(0);
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

	public String getActualTipoPuertoForeignKeyDescripcion(Long idTipoPuertoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoPuerto  tipopuertoTemp=null;

			for(TipoPuerto tipopuertoAux:tipopuertosForeignKey) {
				if(tipopuertoAux.getId()!=null && tipopuertoAux.getId().equals(idTipoPuertoSeleccionado)) {
					tipopuertoTemp=tipopuertoAux;
					break;
				}
			}


			sDescripcion=TipoPuertoConstantesFunciones.getTipoPuertoDescripcion(tipopuertoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoPuertoForeignKeyGenerico(Long idTipoPuertoSeleccionado,JComboBox jComboBoxid_tipo_puertoPuertoGenerico)throws Exception
	{
		try
		{
			TipoPuerto  tipopuertoTemp=null;

			for(TipoPuerto tipopuertoAux:tipopuertosForeignKey) {
				if(tipopuertoAux.getId()!=null && tipopuertoAux.getId().equals(idTipoPuertoSeleccionado)) {
					tipopuertoTemp=tipopuertoAux;
					break;
				}
			}

			if(tipopuertoTemp!=null) {
				jComboBoxid_tipo_puertoPuertoGenerico.setSelectedItem(tipopuertoTemp);
			} else {
				if(jComboBoxid_tipo_puertoPuertoGenerico!=null && jComboBoxid_tipo_puertoPuertoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_puertoPuertoGenerico.setSelectedIndex(0);
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

					if(this.puerto!=null) {
						this.puerto.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormPuerto!=null) {
						this.jInternalFrameDetalleFormPuerto.jComboBoxid_paisPuerto.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisPuerto.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormPuerto!=null) {
						if(this.jInternalFrameDetalleFormPuerto.jComboBoxid_paisPuerto.getItemCount()>0) {
							this.jInternalFrameDetalleFormPuerto.jComboBoxid_paisPuerto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisPuerto!=null) {
						jComboBoxid_paisFK_IdPaisPuerto.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisPuerto!=null) {
							//jComboBoxid_paisFK_IdPaisPuerto.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisPuerto.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisPuerto.setSelectedIndex(0);
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
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisPuertoGenerico)throws Exception
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
				jComboBoxid_paisPuertoGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisPuertoGenerico!=null && jComboBoxid_paisPuertoGenerico.getItemCount()>0) {
					jComboBoxid_paisPuertoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoPuertoForeignKey(Puerto puerto,JComboBox jComboBoxid_tipo_puertoPuertoGenerico)throws Exception
	{
		try
		{
			TipoPuerto  tipopuertoAux=new TipoPuerto();

			if(jComboBoxid_tipo_puertoPuertoGenerico==null) {
				tipopuertoAux=(TipoPuerto)this.jInternalFrameDetalleFormPuerto.jComboBoxid_tipo_puertoPuerto.getSelectedItem();
			} else {
				tipopuertoAux=(TipoPuerto)jComboBoxid_tipo_puertoPuertoGenerico.getSelectedItem();
			}

			if(tipopuertoAux!=null && tipopuertoAux.getId()!=null) {
				puerto.setid_tipo_puerto(tipopuertoAux.getId());
				puerto.settipopuerto_descripcion(PuertoConstantesFunciones.getTipoPuertoDescripcion(tipopuertoAux));
				puerto.setTipoPuerto(tipopuertoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(Puerto puerto,JComboBox jComboBoxid_paisPuertoGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisPuertoGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormPuerto.jComboBoxid_paisPuerto.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisPuertoGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				puerto.setid_pais(paisAux.getId());
				puerto.setpais_descripcion(PuertoConstantesFunciones.getPaisDescripcion(paisAux));
				puerto.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoPuertosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoPuerto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PuertoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPuerto!=null) { 
							this.jInternalFrameDetalleFormPuerto.jComboBoxid_tipo_puertoPuerto.removeAllItems();

							for(TipoPuerto tipopuerto:this.tipopuertosForeignKey) {
								this.jInternalFrameDetalleFormPuerto.jComboBoxid_tipo_puertoPuerto.addItem(tipopuerto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPuerto!=null) { 
					}

					if(!PuertoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoPuerto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PuertoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_puertoFK_IdTipoPuertoPuerto.removeAllItems();

							for(TipoPuerto tipopuerto:this.tipopuertosForeignKey) {
								this.jComboBoxid_tipo_puertoFK_IdTipoPuertoPuerto.addItem(tipopuerto);
							}
						}

						if(!PuertoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PuertoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPuerto!=null) { 
							this.jInternalFrameDetalleFormPuerto.jComboBoxid_paisPuerto.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormPuerto.jComboBoxid_paisPuerto.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPuerto!=null) { 
					}

					if(!PuertoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PuertoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisPuerto.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisPuerto.addItem(pais);
							}
						}

						if(!PuertoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameTipoPuertoForeignKey(TipoPuerto tipopuerto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPuerto!=null) {
							this.jInternalFrameDetalleFormPuerto.jComboBoxid_tipo_puertoPuerto.setSelectedItem(tipopuerto);
						}
					} else {
						if(this.jInternalFrameDetalleFormPuerto!=null) {
							this.jInternalFrameDetalleFormPuerto.jComboBoxid_tipo_puertoPuerto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_puertoFK_IdTipoPuertoPuerto.setSelectedItem(tipopuerto);
						} else {
							this.jComboBoxid_tipo_puertoFK_IdTipoPuertoPuerto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPuerto!=null) {
							this.jInternalFrameDetalleFormPuerto.jComboBoxid_paisPuerto.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormPuerto!=null) {
							this.jInternalFrameDetalleFormPuerto.jComboBoxid_paisPuerto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisPuerto.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisPuerto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPuerto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PuertoConstantesFunciones.refrescarForeignKeysDescripcionesPuerto(this.puertoLogic.getPuertos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PuertoConstantesFunciones.refrescarForeignKeysDescripcionesPuerto(this.puertos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(TipoPuerto.class));
		classes.add(new Classe(Pais.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//puertoLogic.setPuertos(this.puertos);
			puertoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PuertoParameterReturnGeneral getPuertoParameterGeneral() {
		return this.puertoParameterGeneral;
	}
	
	public void setPuertoParameterGeneral(PuertoParameterReturnGeneral puertoParameterGeneral) {
		this.puertoParameterGeneral = puertoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPuerto() {
		return isPermisoTodoPuerto;
	}

	public void setIsPermisoTodoPuerto(Boolean isPermisoTodoPuerto) {
		this.isPermisoTodoPuerto = isPermisoTodoPuerto;
	}

	public Boolean getIsPermisoNuevoPuerto() {
		return isPermisoNuevoPuerto;
	}

	public void setIsPermisoNuevoPuerto(Boolean isPermisoNuevoPuerto) {
		this.isPermisoNuevoPuerto = isPermisoNuevoPuerto;
	}

	public Boolean getIsPermisoActualizarPuerto() {
		return isPermisoActualizarPuerto;
	}

	public void setIsPermisoActualizarPuerto(Boolean isPermisoActualizarPuerto) {
		this.isPermisoActualizarPuerto = isPermisoActualizarPuerto;
	}

	public Boolean getIsPermisoEliminarPuerto() {
		return isPermisoEliminarPuerto;
	}

	public void setIsPermisoEliminarPuerto(Boolean isPermisoEliminarPuerto) {
		this.isPermisoEliminarPuerto = isPermisoEliminarPuerto;
	}

	public Boolean getIsPermisoGuardarCambiosPuerto() {
		return isPermisoGuardarCambiosPuerto;
	}

	public void setIsPermisoGuardarCambiosPuerto(Boolean isPermisoGuardarCambiosPuerto) {
		this.isPermisoGuardarCambiosPuerto = isPermisoGuardarCambiosPuerto;
	}
	
	public Boolean getIsPermisoConsultaPuerto() {
		return isPermisoConsultaPuerto;
	}

	public void setIsPermisoConsultaPuerto(Boolean isPermisoConsultaPuerto) {
		this.isPermisoConsultaPuerto = isPermisoConsultaPuerto;
	}

	public Boolean getIsPermisoBusquedaPuerto() {
		return isPermisoBusquedaPuerto;
	}

	public void setIsPermisoBusquedaPuerto(Boolean isPermisoBusquedaPuerto) {
		this.isPermisoBusquedaPuerto = isPermisoBusquedaPuerto;
	}

	public Boolean getIsPermisoReportePuerto() {
		return isPermisoReportePuerto;
	}

	public void setIsPermisoReportePuerto(Boolean isPermisoReportePuerto) {
		this.isPermisoReportePuerto = isPermisoReportePuerto;
	}
	
	public Boolean getIsPermisoPaginacionMedioPuerto() {
		return isPermisoPaginacionMedioPuerto;
	}

	public void setIsPermisoPaginacionMedioPuerto(Boolean isPermisoPaginacionMedioPuerto) {
		this.isPermisoPaginacionMedioPuerto = isPermisoPaginacionMedioPuerto;
	}
	
	public Boolean getIsPermisoPaginacionTodoPuerto() {
		return isPermisoPaginacionTodoPuerto;
	}

	public void setIsPermisoPaginacionTodoPuerto(Boolean isPermisoPaginacionTodoPuerto) {
		this.isPermisoPaginacionTodoPuerto = isPermisoPaginacionTodoPuerto;
	}
	
	public Boolean getIsPermisoPaginacionAltoPuerto() {
		return isPermisoPaginacionAltoPuerto;
	}

	public void setIsPermisoPaginacionAltoPuerto(Boolean isPermisoPaginacionAltoPuerto) {
		this.isPermisoPaginacionAltoPuerto = isPermisoPaginacionAltoPuerto;
	}
	
	public Boolean getIsPermisoCopiarPuerto() {
		return isPermisoCopiarPuerto;
	}

	public void setIsPermisoCopiarPuerto(Boolean isPermisoCopiarPuerto) {
		this.isPermisoCopiarPuerto = isPermisoCopiarPuerto;
	}
	
	public Boolean getIsPermisoVerFormPuerto() {
		return isPermisoVerFormPuerto;
	}

	public void setIsPermisoVerFormPuerto(Boolean isPermisoVerFormPuerto) {
		this.isPermisoVerFormPuerto = isPermisoVerFormPuerto;
	}
	
	public Boolean getIsPermisoDuplicarPuerto() {
		return isPermisoDuplicarPuerto;
	}

	public void setIsPermisoDuplicarPuerto(Boolean isPermisoDuplicarPuerto) {
		this.isPermisoDuplicarPuerto = isPermisoDuplicarPuerto;
	}
	
	public Boolean getIsPermisoOrdenPuerto() {
		return isPermisoOrdenPuerto;
	}

	public void setIsPermisoOrdenPuerto(Boolean isPermisoOrdenPuerto) {
		this.isPermisoOrdenPuerto = isPermisoOrdenPuerto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPuerto() {
		return isVisibilidadCeldaNuevoPuerto;
	}

	public void setIsVisibilidadCeldaNuevoPuerto(Boolean isVisibilidadCeldaNuevoPuerto) {
		this.isVisibilidadCeldaNuevoPuerto = isVisibilidadCeldaNuevoPuerto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPuerto() {
		return isVisibilidadCeldaDuplicarPuerto;
	}

	public void setIsVisibilidadCeldaDuplicarPuerto(Boolean isVisibilidadCeldaDuplicarPuerto) {
		this.isVisibilidadCeldaDuplicarPuerto = isVisibilidadCeldaDuplicarPuerto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPuerto() {
		return isVisibilidadCeldaCopiarPuerto;
	}

	public void setIsVisibilidadCeldaCopiarPuerto(Boolean isVisibilidadCeldaCopiarPuerto) {
		this.isVisibilidadCeldaCopiarPuerto = isVisibilidadCeldaCopiarPuerto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPuerto() {
		return isVisibilidadCeldaVerFormPuerto;
	}

	public void setIsVisibilidadCeldaVerFormPuerto(Boolean isVisibilidadCeldaVerFormPuerto) {
		this.isVisibilidadCeldaVerFormPuerto = isVisibilidadCeldaVerFormPuerto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPuerto() {
		return isVisibilidadCeldaOrdenPuerto;
	}

	public void setIsVisibilidadCeldaOrdenPuerto(Boolean isVisibilidadCeldaOrdenPuerto) {
		this.isVisibilidadCeldaOrdenPuerto = isVisibilidadCeldaOrdenPuerto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPuerto() {
		return isVisibilidadCeldaNuevoRelacionesPuerto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPuerto(Boolean isVisibilidadCeldaNuevoRelacionesPuerto) {
		this.isVisibilidadCeldaNuevoRelacionesPuerto = isVisibilidadCeldaNuevoRelacionesPuerto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPuerto() {
		return isVisibilidadCeldaModificarPuerto;
	}

	public void setIsVisibilidadCeldaModificarPuerto(Boolean isVisibilidadCeldaModificarPuerto) {
		this.isVisibilidadCeldaModificarPuerto = isVisibilidadCeldaModificarPuerto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPuerto() {
		return isVisibilidadCeldaActualizarPuerto;
	}

	public void setIsVisibilidadCeldaActualizarPuerto(Boolean isVisibilidadCeldaActualizarPuerto) {
		this.isVisibilidadCeldaActualizarPuerto = isVisibilidadCeldaActualizarPuerto;
	}

	public Boolean getIsVisibilidadCeldaEliminarPuerto() {
		return isVisibilidadCeldaEliminarPuerto;
	}

	public void setIsVisibilidadCeldaEliminarPuerto(Boolean isVisibilidadCeldaEliminarPuerto) {
		this.isVisibilidadCeldaEliminarPuerto = isVisibilidadCeldaEliminarPuerto;
	}

	public Boolean getIsVisibilidadCeldaCancelarPuerto() {
		return isVisibilidadCeldaCancelarPuerto;
	}

	public void setIsVisibilidadCeldaCancelarPuerto(Boolean isVisibilidadCeldaCancelarPuerto) {
		this.isVisibilidadCeldaCancelarPuerto = isVisibilidadCeldaCancelarPuerto;
	}

	public Boolean getIsVisibilidadCeldaGuardarPuerto() {
		return isVisibilidadCeldaGuardarPuerto;
	}

	public void setIsVisibilidadCeldaGuardarPuerto(Boolean isVisibilidadCeldaGuardarPuerto) {
		this.isVisibilidadCeldaGuardarPuerto = isVisibilidadCeldaGuardarPuerto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPuerto() {
		return isVisibilidadCeldaGuardarCambiosPuerto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPuerto(Boolean isVisibilidadCeldaGuardarCambiosPuerto) {
		this.isVisibilidadCeldaGuardarCambiosPuerto = isVisibilidadCeldaGuardarCambiosPuerto;
	}
		
	public PuertoSessionBean getpuertoSessionBean() {
		return this.puertoSessionBean;
	}
	
	public void setpuertoSessionBean(PuertoSessionBean puertoSessionBean) {
		this.puertoSessionBean=puertoSessionBean;
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

	public Boolean getisVisibilidadFK_IdTipoPuerto() {
		return this.isVisibilidadFK_IdTipoPuerto;
	}

	public void setisVisibilidadFK_IdTipoPuerto(Boolean isVisibilidadFK_IdTipoPuerto) {
		this.isVisibilidadFK_IdTipoPuerto=isVisibilidadFK_IdTipoPuerto;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPuerto(Puerto puerto)throws Exception {
		try {
			
				this.setActualParaGuardarTipoPuertoForeignKey(puerto,null);
				this.setActualParaGuardarPaisForeignKey(puerto,null);
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
	
	public void bugActualizarReferenciaActual(Puerto puerto,Puerto puertoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPuerto(puerto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		puertoAux.setId(puerto.getId());
		puertoAux.setVersionRow(puerto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPuerto();
		
			int intSelectedRow = this.jTableDatosPuerto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puerto =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.puerto =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PuertoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPuerto(this.puerto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = puertoValidator.getInvalidValues(this.puerto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			puertoLogic.setDatosCliente(datosCliente);
			puertoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				puertoAux=new  Puerto();
				
				puertoAux.setIsNew(true);
				puertoAux.setIsChanged(true);
				
				puertoAux.setPuertoOriginal(this.puerto);
				
				puertoAux.setId(this.puerto.getId());	
				puertoAux.setVersionRow(this.puerto.getVersionRow());	
				puertoAux.setid_tipo_puerto(this.puerto.getid_tipo_puerto());	
				puertoAux.setid_pais(this.puerto.getid_pais());	
				puertoAux.setnombre(this.puerto.getnombre());	
				puertoAux.setes_local(this.puerto.getes_local());	
				puertoAux.setdescripcion(this.puerto.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.puertoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.puertoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(puertoAux,puertoLogic.getPuertos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(puertoAux,puertos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.puertoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.puertoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						puertoLogic.savePuertos();//WithConnection
						//puertoLogic.getSetVersionRowPuertos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.puerto,puertoAux);
					
					this.refrescarForeignKeysDescripcionesPuerto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.puertoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors().addAll(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporsEliminados);
							this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporLogic.getLiquidacionImpors().addAll(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporsEliminados);
							this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorLogic.getEmbarcadors().addAll(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimpors.addAll(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporsEliminados);
							this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimpors.addAll(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporsEliminados);
							this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadors.addAll(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.puertoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								puertoLogic.savePuertoRelaciones(puertoAux,this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors(),this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporLogic.getLiquidacionImpors(),this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorLogic.getEmbarcadors());//WithConnection
								//puertoLogic.getSetVersionRowPuertos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.puerto,puertoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.setPedidoCompraImpors(new ArrayList<PedidoCompraImpor>());
							this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporLogic.setLiquidacionImpors(new ArrayList<LiquidacionImpor>());
							this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorLogic.setEmbarcadors(new ArrayList<Embarcador>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimpors= new ArrayList<PedidoCompraImpor>();
							this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimpors= new ArrayList<LiquidacionImpor>();
							this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadors= new ArrayList<Embarcador>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();}
							puertoAux.setPedidoCompraImpors(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors());

							if(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();}
							puertoAux.setLiquidacionImpors(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporLogic.getLiquidacionImpors());

							if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.quitarFilaTotales();}
							puertoAux.setEmbarcadors(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorLogic.getEmbarcadors());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.puertoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.puertoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(puertoAux,puertoLogic.getPuertos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(puertoAux,puertos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.puerto,puertoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				puertoAux=new  Puerto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.puertoSessionBean.getEsGuardarRelacionado() 
					|| (this.puertoSessionBean.getEsGuardarRelacionado() && this.puerto.getId()>=0)) {
						
					puertoAux.setIsNew(false);
				}
				
				puertoAux.setIsDeleted(false);
			
				puertoAux.setId(this.puerto.getId());	
				puertoAux.setVersionRow(this.puerto.getVersionRow());	
				puertoAux.setid_tipo_puerto(this.puerto.getid_tipo_puerto());	
				puertoAux.setid_pais(this.puerto.getid_pais());	
				puertoAux.setnombre(this.puerto.getnombre());	
				puertoAux.setes_local(this.puerto.getes_local());	
				puertoAux.setdescripcion(this.puerto.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(puertoAux,puertoLogic.getPuertos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(puertoAux,puertos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.puertoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.puertoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						puertoLogic.savePuertos();//WithConnection
						//puertoLogic.getSetVersionRowPuertos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.puerto,puertoAux);
					
					this.refrescarForeignKeysDescripcionesPuerto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.puertoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors().addAll(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporsEliminados);
							this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporLogic.getLiquidacionImpors().addAll(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporsEliminados);
							this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorLogic.getEmbarcadors().addAll(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimpors.addAll(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporsEliminados);
							this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimpors.addAll(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporsEliminados);
							this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadors.addAll(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.puertoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								puertoLogic.savePuertoRelaciones(puertoAux,this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors(),this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporLogic.getLiquidacionImpors(),this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorLogic.getEmbarcadors());//WithConnection
								//puertoLogic.getSetVersionRowPuertos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.puerto,puertoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.setPedidoCompraImpors(new ArrayList<PedidoCompraImpor>());
							this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporLogic.setLiquidacionImpors(new ArrayList<LiquidacionImpor>());
							this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorLogic.setEmbarcadors(new ArrayList<Embarcador>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimpors= new ArrayList<PedidoCompraImpor>();
							this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimpors= new ArrayList<LiquidacionImpor>();
							this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadors= new ArrayList<Embarcador>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();}
							puertoAux.setPedidoCompraImpors(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors());

							if(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();}
							puertoAux.setLiquidacionImpors(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporLogic.getLiquidacionImpors());

							if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.quitarFilaTotales();}
							puertoAux.setEmbarcadors(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorLogic.getEmbarcadors());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.puertoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.puertoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(puertoAux,puertoLogic.getPuertos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(puertoAux,puertos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.puerto,puertoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				puertoAux=new  Puerto();
				
				puertoAux.setIsNew(false);
				puertoAux.setIsChanged(false);
				
				puertoAux.setIsDeleted(true);
				
				puertoAux.setId(this.puerto.getId());	
				puertoAux.setVersionRow(this.puerto.getVersionRow());	
				puertoAux.setid_tipo_puerto(this.puerto.getid_tipo_puerto());	
				puertoAux.setid_pais(this.puerto.getid_pais());	
				puertoAux.setnombre(this.puerto.getnombre());	
				puertoAux.setes_local(this.puerto.getes_local());	
				puertoAux.setdescripcion(this.puerto.getdescripcion());	
				
				if(this.puertoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.puertoAux.getId()>=0) {	
						this.puertosEliminados.add(puertoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(puertoAux,puertoLogic.getPuertos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(puertoAux,puertos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.puertoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.puertoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						puertoLogic.savePuertos();//WithConnection
						//puertoLogic.getSetVersionRowPuertos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.puertoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors().addAll(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporsEliminados);
							this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporLogic.getLiquidacionImpors().addAll(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporsEliminados);
							this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorLogic.getEmbarcadors().addAll(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimpors.addAll(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporsEliminados);
							this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimpors.addAll(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporsEliminados);
							this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadors.addAll(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.puertoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								puertoLogic.savePuertoRelaciones(puertoAux,this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors(),this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporLogic.getLiquidacionImpors(),this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorLogic.getEmbarcadors());//WithConnection
								//puertoLogic.getSetVersionRowPuertos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.setPedidoCompraImpors(new ArrayList<PedidoCompraImpor>());
							this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporLogic.setLiquidacionImpors(new ArrayList<LiquidacionImpor>());
							this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorLogic.setEmbarcadors(new ArrayList<Embarcador>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimpors= new ArrayList<PedidoCompraImpor>();
							this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimpors= new ArrayList<LiquidacionImpor>();
							this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadors= new ArrayList<Embarcador>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();}
							puertoAux.setPedidoCompraImpors(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors());

							if(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();}
							puertoAux.setLiquidacionImpors(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporLogic.getLiquidacionImpors());

							if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.quitarFilaTotales();}
							puertoAux.setEmbarcadors(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorLogic.getEmbarcadors());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.puertoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.puertoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(puertoAux,puertoLogic.getPuertos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(puertoAux,puertos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.getPuertos().addAll(this.puertosEliminados);
					
					puertoLogic.savePuertos();//WithConnection
					//puertoLogic.getSetVersionRowPuertos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPuerto();
				
				this.puertosEliminados= new ArrayList<Puerto>();		
			}
			
			if(this.puertoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puertoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Puerto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Puerto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.puerto=puertoAux;
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
      		//this.finishProcessPuerto();
      	}
		
	}	
	
	public void actualizarRelaciones(Puerto puertoLocal) throws Exception {
		
		if(this.puertoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				puertoLocal.setPedidoCompraImpors(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors());
				puertoLocal.setLiquidacionImpors(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporLogic.getLiquidacionImpors());
				puertoLocal.setEmbarcadors(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorLogic.getEmbarcadors());
			
			} else {
			
				puertoLocal.setPedidoCompraImpors(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimpors);
				puertoLocal.setLiquidacionImpors(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimpors);
				puertoLocal.setEmbarcadors(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadors);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Puerto puertoLocal) throws Exception {	
		if(this.puertoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(TipoPuertoDetalleFormJInternalFrame.class)) {
				TipoPuertoBeanSwingJInternalFrame tipopuertoBeanSwingJInternalFrameLocal=(TipoPuertoBeanSwingJInternalFrame) ((TipoPuertoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipopuertoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoPuerto(tipopuertoBeanSwingJInternalFrameLocal.gettipopuerto(),true);
				tipopuertoBeanSwingJInternalFrameLocal.actualizarLista(tipopuertoBeanSwingJInternalFrameLocal.tipopuerto,this.tipopuertosForeignKey);

				tipopuertoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipopuertoBeanSwingJInternalFrameLocal.tipopuerto);

				puertoLocal.setTipoPuerto(tipopuertoBeanSwingJInternalFrameLocal.tipopuerto);

				this.addItemDefectoCombosForeignKeyTipoPuerto();
				this.cargarCombosFrameTipoPuertosForeignKey("Formulario");
				this.setActualTipoPuertoForeignKey(tipopuertoBeanSwingJInternalFrameLocal.tipopuerto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				puertoLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPuertoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPuerto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.puerto =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.puerto =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = puertoValidator.getInvalidValues(this.puerto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Puerto puerto,List<Puerto> puertos) throws Exception {
		try	{		
			PuertoConstantesFunciones.actualizarLista(puerto,puertos,this.puertoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Puerto puerto,List<Puerto> puertos) throws Exception {
		try	{			
			PuertoConstantesFunciones.actualizarSelectedLista(puerto,puertos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Puerto> puertosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				puertosLocal=this.puertoLogic.getPuertos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				puertosLocal=this.puertos;
			}
			//ARCHITECTURE
		
			for(Puerto puertoLocal:puertosLocal) {
				if(this.permiteMantenimiento(puertoLocal) && puertoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PuertoConstantesFunciones.getPuertoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PuertoConstantesFunciones.IDTIPOPUERTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPuerto.jLabelid_tipo_puertoPuerto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PuertoConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPuerto.jLabelid_paisPuerto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PuertoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPuerto.jLabelnombrePuerto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PuertoConstantesFunciones.ESLOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPuerto.jLabeles_localPuerto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PuertoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPuerto.jLabeldescripcionPuerto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPuerto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPuerto.jLabelid_tipo_puertoPuerto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPuerto.jLabelid_paisPuerto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPuerto.jLabelnombrePuerto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPuerto.jLabeles_localPuerto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPuerto.jLabeldescripcionPuerto,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("PedidoCompraImpor")) {
			if(this.puerto==null) {
				this.puerto= new Puerto();
			}

			if(this.puertoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPuerto
				this.setVariablesFormularioToObjetoActualPuerto(this.puerto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);

				this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.getpedidocompraimpor().setPuerto(this.puerto);
			}

			return;
		}
		 else  if(sTipo.equals("LiquidacionImpor")) {
			if(this.puerto==null) {
				this.puerto= new Puerto();
			}

			if(this.puertoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPuerto
				this.setVariablesFormularioToObjetoActualPuerto(this.puerto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);

				this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.getliquidacionimpor().setPuerto(this.puerto);
			}

			return;
		}
		 else  if(sTipo.equals("Embarcador")) {
			if(this.puerto==null) {
				this.puerto= new Puerto();
			}

			if(this.puertoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPuerto
				this.setVariablesFormularioToObjetoActualPuerto(this.puerto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);

				this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.getembarcador().setPuerto(this.puerto);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoPuerto--;	
		
		
		this.puertoAux=new Puerto();
		
		this.puertoAux.setId(this.iIdNuevoPuerto);
		this.puertoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.puertoLogic.getPuertos().add(this.puertoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.puertos.add(this.puertoAux);
		}
		//ARCHITECTURE
		
		this.puerto=this.puertoAux;
		
		if(PuertoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPuerto(this.puerto);
			this.setVariablesObjetoActualToFormularioForeignKeyPuerto(this.puerto);
		}
				
		//this.setDefaultControlesPuerto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPuerto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPuerto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPuerto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPuerto(this.puertoBean,this.puerto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PuertoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.puertoSessionBean.getConGuardarRelaciones()) {
			classes=PuertoConstantesFunciones.getClassesRelationshipsOfPuerto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.puertoReturnGeneral=puertoLogic.procesarEventosPuertosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.puertoLogic.getPuertos(),this.puerto,this.puertoParameterGeneral,this.isEsNuevoPuerto,classes);//this.puertoLogic.getPuerto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPuerto(this.puertoReturnGeneral,this.puertoBean,false);
		
		if(this.puertoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPuerto(this.puertoReturnGeneral.getPuerto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPuerto(this.puertoReturnGeneral.getPuerto());
		}
		
		if(this.puertoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPuerto(this.puertoReturnGeneral.getPuerto(),classes);//this.puertoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPuerto(this.puerto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPuerto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPuerto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PuertoBeanSwingJInternalFrameAdditional.RecargarFormPuerto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPuerto(false);
						
			if(puertoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.getEsGuardarRelacionado() && PedidoCompraImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoCompraImporActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporSessionBean.getEsGuardarRelacionado() && LiquidacionImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonLiquidacionImporActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorSessionBean.getEsGuardarRelacionado() && EmbarcadorJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmbarcadorActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(PuertoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPuerto();
			}
			
			this.actualizarVisualTableDatosPuerto();
			
			this.jTableDatosPuerto.setRowSelectionInterval(this.getIndiceNuevoPuerto(), this.getIndiceNuevoPuerto());
			
			this.seleccionarFilaTablaPuertoActual();
						
			this.actualizarEstadoCeldasBotonesPuerto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPuerto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPuerto.jTextAreanombrePuerto.setEnabled(isHabilitar && this.puertoConstantesFunciones.activarnombrePuerto);
		this.jInternalFrameDetalleFormPuerto.jCheckBoxes_localPuerto.setEnabled(isHabilitar && this.puertoConstantesFunciones.activares_localPuerto);
		this.jInternalFrameDetalleFormPuerto.jTextAreadescripcionPuerto.setEnabled(isHabilitar && this.puertoConstantesFunciones.activardescripcionPuerto);	
		
		this.jInternalFrameDetalleFormPuerto.jComboBoxid_tipo_puertoPuerto.setEnabled(isHabilitar && this.puertoConstantesFunciones.activarid_tipo_puertoPuerto);
		this.jInternalFrameDetalleFormPuerto.jComboBoxid_paisPuerto.setEnabled(isHabilitar && this.puertoConstantesFunciones.activarid_paisPuerto);
	};
	
	public void setDefaultControlesPuerto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPuerto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.puertoSessionBean.setConGuardarRelaciones(true);			
			this.puertoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPuerto.jTabbedPaneRelacionesPuerto.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.puertoSessionBean.setConGuardarRelaciones(false);			
			this.puertoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPuerto.jTabbedPaneRelacionesPuerto.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoPuerto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Puerto puertoAux:this.puertoLogic.getPuertos()) {
				if(puertoAux.getId().equals(this.iIdNuevoPuerto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Puerto puertoAux:this.puertos) {
				if(puertoAux.getId().equals(this.iIdNuevoPuerto)) {
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
	
	public int getIndiceActualPuerto(Puerto puerto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Puerto puertoAux:this.puertoLogic.getPuertos()) {
				if(puertoAux.getId().equals(puerto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Puerto puertoAux:this.puertos) {
				if(puertoAux.getId().equals(puerto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPuerto(Puerto puertoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Puerto puertoAux:this.puertoLogic.getPuertos()) {
				if(puertoAux.getPuertoOriginal().getId().equals(puertoOriginal.getId())) {
					existe=true;
					puertoOriginal.setId(puertoAux.getId());
					puertoOriginal.setVersionRow(puertoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Puerto puertoAux:this.puertos) {
				if(puertoAux.getPuertoOriginal().getId().equals(puertoOriginal.getId())) {
					existe=true;
					puertoOriginal.setId(puertoAux.getId());
					puertoOriginal.setVersionRow(puertoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPuerto(Boolean esParaCancelar) throws Exception {
		puertosAux=new ArrayList<Puerto>();
		puertoAux=new Puerto();
		
		if(!this.puertoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Puerto puertoAux:this.puertoLogic.getPuertos()) {
					if(puertoAux.getId()<0) {
						puertosAux.add(puertoAux);
					}		
				}
				this.iIdNuevoPuerto=0L;
				this.puertoLogic.getPuertos().removeAll(puertosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Puerto puertoAux:this.puertos) {
					if(puertoAux.getId()<0) {
						puertosAux.add(puertoAux);
					}		
				}
				this.iIdNuevoPuerto=0L;
				this.puertos.removeAll(puertosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPuerto 
					&& this.puertoLogic.getPuertos().size()>0
					) {
					puertoAux=this.puertoLogic.getPuertos().get(this.puertoLogic.getPuertos().size() - 1);
				
					if(puertoAux.getId()<0) {
						this.puertoLogic.getPuertos().remove(puertoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPuerto && this.puertos.size()>0) {
					puertoAux=this.puertos.get(this.puertos.size() - 1);
				
					if(puertoAux.getId()<0) {
						this.puertos.remove(puertoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPuerto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(puerto.getId()<0) {
				this.puertoLogic.getPuertos().remove(this.puerto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(puerto.getId()<0) {
				this.puertos.remove(this.puerto);
			}
		}			
	}
	
	public void setEstadosInicialesPuerto(List<Puerto> puertosAux) throws Exception {
		PuertoConstantesFunciones.setEstadosInicialesPuerto(puertosAux);
	}
	
	public void setEstadosInicialesPuerto(Puerto puertoAux) throws Exception {
		PuertoConstantesFunciones.setEstadosInicialesPuerto(puertoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPuertoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPuerto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPuertoActual()) {
				if(!this.isEsNuevoPuerto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPuerto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPuerto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPuertoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Puerto ?", "MANTENIMIENTO DE Puerto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPuerto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Puerto puerto) throws Exception {
		PuertoConstantesFunciones.seleccionarAsignar(this.puerto,puerto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPuerto=this.isPermisoActualizarOriginalPuerto;
			
			
			this.seleccionarAsignar(puerto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PuertoConstantesFunciones.quitarEspaciosPuerto(this.puerto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPuerto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.puertoSessionBean.setsFuncionBusquedaRapida(this.puertoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPuerto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPuerto(esParaCancelar);				
				this.cancelarNuevoPuerto(esParaCancelar);								
			}
			
			this.puerto=new Puerto();
			
			this.inicializarPuerto();
			
			this.actualizarEstadoCeldasBotonesPuerto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPuerto() throws Exception {
		try {
			PuertoConstantesFunciones.inicializarPuerto(this.puerto);
			
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
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.puertoLogic.getPuertos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePuertos(String sAccionBusqueda,List<Puerto> puertosParaReportes) throws Exception {
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
					sPathReporteFinal="Puerto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PuertoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PuertoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Puerto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Puertoes");		
		parameters.put("busquedapor", PuertoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(PedidoCompraImpor.class));
			classes.add(new Classe(LiquidacionImpor.class));
			classes.add(new Classe(Embarcador.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					PuertoLogic puertoLogicAuxiliar=new PuertoLogic();
					puertoLogicAuxiliar.setDatosCliente(puertoLogic.getDatosCliente());				
					puertoLogicAuxiliar.setPuertos(puertosParaReportes);
					
					puertoLogicAuxiliar.cargarRelacionesLoteForeignKeyPuertoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					puertosParaReportes=puertoLogicAuxiliar.getPuertos();
					
					//puertoLogic.getNewConnexionToDeep();
					
					//for (Puerto puerto:puertosParaReportes) {
					//	puertoLogic.deepLoad(puerto, false, DeepLoadType.INCLUDE, classes);
					//}						
					//puertoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//puertoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePedidoCompraImpor = AuxiliarReportes.class.getResourceAsStream("PedidoCompraImporDetalleRelacionesDesign.jasper");
			parameters.put("subreport_pedidocompraimpor", reportFilePedidoCompraImpor);

			InputStream reportFileLiquidacionImpor = AuxiliarReportes.class.getResourceAsStream("LiquidacionImporDetalleRelacionesDesign.jasper");
			parameters.put("subreport_liquidacionimpor", reportFileLiquidacionImpor);

			InputStream reportFileEmbarcador = AuxiliarReportes.class.getResourceAsStream("EmbarcadorDetalleRelacionesDesign.jasper");
			parameters.put("subreport_embarcador", reportFileEmbarcador);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePuerto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PuertoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PuertoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePuerto=new JRBeanArrayDataSource(PuertoJInternalFrame.TraerPuertoBeans(puertosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePuerto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PuertoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PuertoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PuertoBean.TraerPuertoBeans(puertosParaReportes).toArray()));
							
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
				this.generarExcelReportePuertos(sAccionBusqueda,sTipoArchivoReporte,puertosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPuertos(sAccionBusqueda,sTipoArchivoReporte,puertosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPuertoActionPerformed(null);
					//this.generarExcelReportePuertos(sAccionBusqueda,sTipoArchivoReporte,puertosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPuertos(sAccionBusqueda,sTipoArchivoReporte,puertosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPuertos(sAccionBusqueda,sTipoArchivoReporte,puertosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPuertos(sAccionBusqueda,sTipoArchivoReporte,puertosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePuertos(String sAccionBusqueda,String sTipoArchivoReporte,List<Puerto> puertosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"puerto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Puertos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPuerto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Puerto puerto : puertosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PuertoConstantesFunciones.generarExcelReporteDataPuerto("NORMAL",row,workbook,puerto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puertoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Puerto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPuerto(String sTipo,Row row,Workbook workbook) {
		
		PuertoConstantesFunciones.generarExcelReporteHeaderPuerto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPuertos(String sAccionBusqueda,String sTipoArchivoReporte,List<Puerto> puertosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"puerto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Puertos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Puerto puerto : puertosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PuertoConstantesFunciones.getPuertoDescripcion(puerto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PuertoConstantesFunciones.LABEL_IDTIPOPUERTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PuertoConstantesFunciones.LABEL_IDTIPOPUERTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(puerto.gettipopuerto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PuertoConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PuertoConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(puerto.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PuertoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PuertoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(puerto.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PuertoConstantesFunciones.LABEL_ESLOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PuertoConstantesFunciones.LABEL_ESLOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(puerto.getes_local()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PuertoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PuertoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(puerto.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puertoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Puerto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPuertos(String sAccionBusqueda,String sTipoArchivoReporte,List<Puerto> puertosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Puerto> puertosRespaldo=null;
		
		classes=PuertoConstantesFunciones.getClassesRelationshipsOfPuerto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.puertoLogic.setDatosCliente(this.datosCliente);
		this.puertoLogic.setDatosDeep(this.datosDeep);
		this.puertoLogic.setIsConDeep(true);
		
		puertosRespaldo=this.puertoLogic.getPuertos();
		
		this.puertoLogic.setPuertos(puertosParaReportes);	
		this.puertoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		puertosParaReportes=this.puertoLogic.getPuertos();
		this.puertoLogic.setPuertos(puertosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"puerto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Puertos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPuerto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Puerto puerto : puertosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPuerto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PuertoConstantesFunciones.generarExcelReporteDataPuerto("NORMAL",row,workbook,puerto,cellStyleDataAux);
		
			
			


				//PedidoCompraImpor
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO))) {

				if(puerto.getPedidoCompraImpors()!=null && puerto.getPedidoCompraImpors().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PedidoCompraImporConstantesFunciones.generarExcelReporteHeaderPedidoCompraImpor("RELACIONADO",row,workbook);
				}

				if(puerto.getPedidoCompraImpors()!=null) {
					i2=0;
					for(PedidoCompraImpor pedidocompraimpor : puerto.getPedidoCompraImpors()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PedidoCompraImporConstantesFunciones.generarExcelReporteDataPedidoCompraImpor("RELACIONADO",row,workbook,pedidocompraimpor,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//LiquidacionImpor
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(LiquidacionImporConstantesFunciones.SCLASSWEBTITULO))) {

				if(puerto.getLiquidacionImpors()!=null && puerto.getLiquidacionImpors().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(LiquidacionImporConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					LiquidacionImporConstantesFunciones.generarExcelReporteHeaderLiquidacionImpor("RELACIONADO",row,workbook);
				}

				if(puerto.getLiquidacionImpors()!=null) {
					i2=0;
					for(LiquidacionImpor liquidacionimpor : puerto.getLiquidacionImpors()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						LiquidacionImporConstantesFunciones.generarExcelReporteDataLiquidacionImpor("RELACIONADO",row,workbook,liquidacionimpor,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Embarcador
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EmbarcadorConstantesFunciones.SCLASSWEBTITULO))) {

				if(puerto.getEmbarcadors()!=null && puerto.getEmbarcadors().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EmbarcadorConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EmbarcadorConstantesFunciones.generarExcelReporteHeaderEmbarcador("RELACIONADO",row,workbook);
				}

				if(puerto.getEmbarcadors()!=null) {
					i2=0;
					for(Embarcador embarcador : puerto.getEmbarcadors()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EmbarcadorConstantesFunciones.generarExcelReporteDataEmbarcador("RELACIONADO",row,workbook,embarcador,cellStyleDataAuxHijo);
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
		cell.setCellValue(PuertoConstantesFunciones.getPuertoDescripcion(puerto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puertoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Puerto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPuerto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPuerto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPuerto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPuerto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPuerto() throws Exception {		
		this.startProcessPuerto(true);
	}
	
	public void startProcessPuerto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPuerto ,this.jPanelParametrosReportesPuerto, this.jScrollPanelDatosPuerto,this.jPanelPaginacionPuerto, this.jScrollPanelDatosEdicionPuerto, this.jPanelAccionesPuerto,this.jPanelAccionesFormularioPuerto,this.jmenuBarPuerto,this.jmenuBarDetallePuerto,this.jTtoolBarPuerto,this.jTtoolBarDetallePuerto);		
		
		final JTabbedPane jTabbedPaneBusquedasPuerto=this.jTabbedPaneBusquedasPuerto; 
		
		final JPanel jPanelParametrosReportesPuerto=this.jPanelParametrosReportesPuerto;
		//final JScrollPane jScrollPanelDatosPuerto=this.jScrollPanelDatosPuerto;
		final JTable jTableDatosPuerto=this.jTableDatosPuerto;		
		final JPanel jPanelPaginacionPuerto=this.jPanelPaginacionPuerto;
		//final JScrollPane jScrollPanelDatosEdicionPuerto=this.jScrollPanelDatosEdicionPuerto;
		final JPanel jPanelAccionesPuerto=this.jPanelAccionesPuerto;
		
		JPanel jPanelCamposAuxiliarPuerto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPuerto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPuerto!=null) {
			jPanelCamposAuxiliarPuerto=this.jInternalFrameDetalleFormPuerto.jPanelCamposPuerto;
			jPanelAccionesFormularioAuxiliarPuerto=this.jInternalFrameDetalleFormPuerto.jPanelAccionesFormularioPuerto;
		}
		
		final JPanel jPanelCamposPuerto=jPanelCamposAuxiliarPuerto;
		final JPanel jPanelAccionesFormularioPuerto=jPanelAccionesFormularioAuxiliarPuerto;
		
		
		final JMenuBar jmenuBarPuerto=this.jmenuBarPuerto;
		final JToolBar jTtoolBarPuerto=this.jTtoolBarPuerto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPuerto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPuerto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPuerto!=null) {
			jmenuBarDetalleAuxiliarPuerto=this.jInternalFrameDetalleFormPuerto.jmenuBarDetallePuerto;
			jTtoolBarDetalleAuxiliarPuerto=this.jInternalFrameDetalleFormPuerto.jTtoolBarDetallePuerto;
		}
		
		final JMenuBar jmenuBarDetallePuerto=jmenuBarDetalleAuxiliarPuerto;
		final JToolBar jTtoolBarDetallePuerto=jTtoolBarDetalleAuxiliarPuerto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPuerto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPuerto;
			processRunnable.jTableDatos=jTableDatosPuerto;
			processRunnable.jPanelCampos=jPanelCamposPuerto;
			processRunnable.jPanelPaginacion=jPanelPaginacionPuerto;
			processRunnable.jPanelAcciones=jPanelAccionesPuerto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPuerto;
			
			
			processRunnable.jmenuBar=jmenuBarPuerto;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePuerto;
			processRunnable.jTtoolBar=jTtoolBarPuerto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePuerto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPuerto ,jPanelParametrosReportesPuerto,jTableDatosPuerto, /*jScrollPanelDatosPuerto,*/jPanelCamposPuerto,jPanelPaginacionPuerto, /*jScrollPanelDatosEdicionPuerto,*/ jPanelAccionesPuerto,jPanelAccionesFormularioPuerto,jmenuBarPuerto,jmenuBarDetallePuerto,jTtoolBarPuerto,jTtoolBarDetallePuerto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPuerto ,jPanelParametrosReportesPuerto, jScrollPanelDatosPuerto,jPanelPaginacionPuerto, jScrollPanelDatosEdicionPuerto, jPanelAccionesPuerto,jPanelAccionesFormularioPuerto,jmenuBarPuerto,jmenuBarDetallePuerto,jTtoolBarPuerto,jTtoolBarDetallePuerto);
						
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
	
	public void finishProcessPuerto() {// throws Exception 
		this.finishProcessPuerto(true);
	}
	
	public void finishProcessPuerto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPuerto ,this.jPanelParametrosReportesPuerto, this.jScrollPanelDatosPuerto,this.jPanelPaginacionPuerto, this.jScrollPanelDatosEdicionPuerto, this.jPanelAccionesPuerto,this.jPanelAccionesFormularioPuerto,this.jmenuBarPuerto,this.jmenuBarDetallePuerto,this.jTtoolBarPuerto,this.jTtoolBarDetallePuerto);		
		
		final JTabbedPane jTabbedPaneBusquedasPuerto=this.jTabbedPaneBusquedasPuerto; 
		
		final JPanel jPanelParametrosReportesPuerto=this.jPanelParametrosReportesPuerto;
		//final JScrollPane jScrollPanelDatosPuerto=this.jScrollPanelDatosPuerto;
		final JTable jTableDatosPuerto=this.jTableDatosPuerto;		
		final JPanel jPanelPaginacionPuerto=this.jPanelPaginacionPuerto;
		//final JScrollPane jScrollPanelDatosEdicionPuerto=this.jScrollPanelDatosEdicionPuerto;
		final JPanel jPanelAccionesPuerto=this.jPanelAccionesPuerto;
		
		JPanel jPanelCamposAuxiliarPuerto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPuerto=new JPanel();
		
		if(this.jInternalFrameDetalleFormPuerto!=null) {
			jPanelCamposAuxiliarPuerto=this.jInternalFrameDetalleFormPuerto.jPanelCamposPuerto;
			jPanelAccionesFormularioAuxiliarPuerto=this.jInternalFrameDetalleFormPuerto.jPanelAccionesFormularioPuerto;
		}
		
		final JPanel jPanelCamposPuerto=jPanelCamposAuxiliarPuerto;
		final JPanel jPanelAccionesFormularioPuerto=jPanelAccionesFormularioAuxiliarPuerto;
		
		
		final JMenuBar jmenuBarPuerto=this.jmenuBarPuerto;		
		final JToolBar jTtoolBarPuerto=this.jTtoolBarPuerto;
				
		JMenuBar jmenuBarDetalleAuxiliarPuerto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPuerto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPuerto!=null) {
			jmenuBarDetalleAuxiliarPuerto=this.jInternalFrameDetalleFormPuerto.jmenuBarDetallePuerto;
			jTtoolBarDetalleAuxiliarPuerto=this.jInternalFrameDetalleFormPuerto.jTtoolBarDetallePuerto;		
		}
		
		final JMenuBar jmenuBarDetallePuerto=jmenuBarDetalleAuxiliarPuerto;
		final JToolBar jTtoolBarDetallePuerto=jTtoolBarDetalleAuxiliarPuerto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPuerto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPuerto;
			processRunnable.jTableDatos=jTableDatosPuerto;
			processRunnable.jPanelCampos=jPanelCamposPuerto;
			processRunnable.jPanelPaginacion=jPanelPaginacionPuerto;
			processRunnable.jPanelAcciones=jPanelAccionesPuerto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPuerto;
			
			
			processRunnable.jmenuBar=jmenuBarPuerto;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePuerto;
			processRunnable.jTtoolBar=jTtoolBarPuerto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePuerto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPuerto ,jPanelParametrosReportesPuerto, jTableDatosPuerto,/*jScrollPanelDatosPuerto,*/jPanelCamposPuerto,jPanelPaginacionPuerto, /*jScrollPanelDatosEdicionPuerto,*/ jPanelAccionesPuerto,jPanelAccionesFormularioPuerto,jmenuBarPuerto,jmenuBarDetallePuerto,jTtoolBarPuerto,jTtoolBarDetallePuerto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPuerto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPuerto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPuerto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPuerto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPuerto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePuerto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPuerto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPuerto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePuerto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.puertoConstantesFunciones.getsFinalQueryPuerto();
		String  finalQueryPaginacionTodos=this.puertoConstantesFunciones.getsFinalQueryPuerto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PuertoConstantesFunciones.getArrayColumnasGlobalesNoPuerto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PuertoConstantesFunciones.getArrayColumnasGlobalesPuerto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PuertoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.puertosEliminados= new ArrayList<Puerto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPuerto();
		
				///*PuertoSessionBean*/this.puertoSessionBean=new PuertoSessionBean();
			
			if(this.puertoSessionBean==null) {
				this.puertoSessionBean=new PuertoSessionBean();
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
					this.iNumeroPaginacion=PuertoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PuertoConstantesFunciones.getClassesForeignKeysOfPuerto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/puerto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			puertosAux= new ArrayList<Puerto>();
			
				
			puertoLogic.setDatosCliente(this.datosCliente);
			puertoLogic.setDatosDeep(this.datosDeep);
			puertoLogic.setIsConDeep(true);
			
			
			puertoLogic.getPuertoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					puertoLogic.getTodosPuertos(finalQueryGlobal,pagination);
					
					//puertoLogic.getTodosPuertosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(puertoLogic.getPuertos()==null|| puertoLogic.getPuertos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							puertosAux= new ArrayList<Puerto>();
							puertosAux.addAll(puertoLogic.getPuertos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							puertosAux= new ArrayList<Puerto>();
							puertosAux.addAll(puertos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							puertoLogic.getTodosPuertos(finalQueryGlobal+"",this.pagination);												
							
							//puertoLogic.getTodosPuertosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePuertos("Todos",puertoLogic.getPuertos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							puertoLogic.setPuertos(new ArrayList<Puerto>());					
							puertoLogic.getPuertos().addAll(puertosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							puertos=new ArrayList<Puerto>();
							puertos.addAll(puertosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPuerto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPuerto=this.idActual;
				
				} else if(this.idPuertoActual!=null && this.idPuertoActual!=0L) {
					idPuerto=idPuertoActual;
				}
				
					
				this.sDetalleReporte=PuertoConstantesFunciones.getDetalleIndicePorId(idPuerto);
				
				this.puertos=new ArrayList<Puerto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					puertoLogic.getEntity(idPuerto);
					
					//puertoLogic.getEntityWithConnection(idPuerto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					puertoLogic.setPuertos(new ArrayList<Puerto>());
					puertoLogic.getPuertos().add(puertoLogic.getPuerto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.puertos=new ArrayList<Puerto>();
					this.puertos.add(puerto);
				}
				
				if(puertoLogic.getPuerto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=PuertoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					puertoLogic.getPuertosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PuertoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PuertoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=puertoLogic.getPuertos()==null||puertoLogic.getPuertos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=puertos==null|| puertos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						puertosAux=new ArrayList<Puerto>();
						puertosAux.addAll(puertoLogic.getPuertos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							puertosAux=new ArrayList<Puerto>();
							puertosAux.addAll(puertos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							puertoLogic.getPuertosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PuertoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PuertoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePuertos("BusquedaPorNombre",puertoLogic.getPuertos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePuertos("BusquedaPorNombre",puertos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						puertoLogic.setPuertos(new ArrayList<Puerto>());
						puertoLogic.getPuertos().addAll(puertosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							puertos=new ArrayList<Puerto>();
							puertos.addAll(puertosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=PuertoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					puertoLogic.getPuertosFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PuertoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PuertoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=puertoLogic.getPuertos()==null||puertoLogic.getPuertos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=puertos==null|| puertos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						puertosAux=new ArrayList<Puerto>();
						puertosAux.addAll(puertoLogic.getPuertos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							puertosAux=new ArrayList<Puerto>();
							puertosAux.addAll(puertos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							puertoLogic.getPuertosFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PuertoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PuertoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePuertos("FK_IdPais",puertoLogic.getPuertos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePuertos("FK_IdPais",puertos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						puertoLogic.setPuertos(new ArrayList<Puerto>());
						puertoLogic.getPuertos().addAll(puertosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							puertos=new ArrayList<Puerto>();
							puertos.addAll(puertosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoPuerto")) {
				this.sDetalleReporte=PuertoConstantesFunciones.getDetalleIndiceFK_IdTipoPuerto(id_tipo_puertoFK_IdTipoPuerto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					puertoLogic.getPuertosFK_IdTipoPuerto(finalQueryGlobal,pagination,id_tipo_puertoFK_IdTipoPuerto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PuertoConstantesFunciones.getDetalleIndiceFK_IdTipoPuerto(id_tipo_puertoFK_IdTipoPuerto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PuertoConstantesFunciones.getDetalleIndiceFK_IdTipoPuerto(id_tipo_puertoFK_IdTipoPuerto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=puertoLogic.getPuertos()==null||puertoLogic.getPuertos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=puertos==null|| puertos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						puertosAux=new ArrayList<Puerto>();
						puertosAux.addAll(puertoLogic.getPuertos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							puertosAux=new ArrayList<Puerto>();
							puertosAux.addAll(puertos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							puertoLogic.getPuertosFK_IdTipoPuerto(finalQueryGlobal,pagination,id_tipo_puertoFK_IdTipoPuerto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PuertoConstantesFunciones.getDetalleIndiceFK_IdTipoPuerto(id_tipo_puertoFK_IdTipoPuerto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PuertoConstantesFunciones.getDetalleIndiceFK_IdTipoPuerto(id_tipo_puertoFK_IdTipoPuerto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePuertos("FK_IdTipoPuerto",puertoLogic.getPuertos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePuertos("FK_IdTipoPuerto",puertos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						puertoLogic.setPuertos(new ArrayList<Puerto>());
						puertoLogic.getPuertos().addAll(puertosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							puertos=new ArrayList<Puerto>();
							puertos.addAll(puertosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPuerto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPuerto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=puertoLogic.getPuertos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=puertos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=puertoLogic.getPuertos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=puertos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Puerto puerto) {
		Boolean permite=true;
		
		if(this.puerto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PuertoConstantesFunciones.getOrderByListaPuerto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PuertoConstantesFunciones.getOrderByListaPuerto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Puerto puerto:puertoLogic.getPuertos()) {
				if(puerto.getsType().equals(Constantes2.S_TOTALES)) {
					puertoTotales=puerto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Puerto puerto:this.puertos) {
				if(puerto.getsType().equals(Constantes2.S_TOTALES)) {
					puertoTotales=puerto;
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
			this.puertoAux=new Puerto();
			this.puertoAux.setsType(Constantes2.S_TOTALES);
			this.puertoAux.setIsNew(false);
			this.puertoAux.setIsChanged(false);
			this.puertoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PuertoConstantesFunciones.TotalizarValoresFilaPuerto(this.puertoLogic.getPuertos(),this.puertoAux);
				
				this.puertoLogic.getPuertos().add(this.puertoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PuertoConstantesFunciones.TotalizarValoresFilaPuerto(this.puertos,this.puertoAux);
				
				this.puertos.add(this.puertoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		puertoTotales=new Puerto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.puertoLogic.getPuertos().remove(puertoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.puertos.remove(puertoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		puertoTotales=new Puerto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Puerto puerto:puertoLogic.getPuertos()) {
				if(puerto.getsType().equals(Constantes2.S_TOTALES)) {
					puertoTotales=puerto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PuertoConstantesFunciones.TotalizarValoresFilaPuerto(this.puertoLogic.getPuertos(),puertoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Puerto puerto:this.puertos) {
				if(puerto.getsType().equals(Constantes2.S_TOTALES)) {
					puertoTotales=puerto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PuertoConstantesFunciones.TotalizarValoresFilaPuerto(this.puertos,puertoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPuertosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPuertosFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPuertosFK_IdTipoPuerto()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoPuerto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPuertoPorIdPaisPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorIdPaisPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getPuertosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					puertoLogic.getPuertosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPuertosFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					puertoLogic.getPuertosFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPuertosFK_IdTipoPuerto(String sFinalQuery,Long id_tipo_puerto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					puertoLogic.getPuertosFK_IdTipoPuerto(sFinalQuery,this.pagination,id_tipo_puerto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPuertoPorIdPaisPorNombre(Long id_pais,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					puertoLogic.getPuertoPorIdPaisPorNombre(id_pais,nombre);
				
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
	
	public void inicializarPermisosPuerto() {
		this.isPermisoTodoPuerto=false;
		this.isPermisoNuevoPuerto=false;
		this.isPermisoActualizarPuerto=false;
		this.isPermisoActualizarOriginalPuerto=false;
		this.isPermisoEliminarPuerto=false;
		this.isPermisoGuardarCambiosPuerto=false;
		this.isPermisoConsultaPuerto=false;
		this.isPermisoBusquedaPuerto=false;
		this.isPermisoReportePuerto=false;		
		this.isPermisoOrdenPuerto=false;		
		this.isPermisoPaginacionMedioPuerto=false;		
		this.isPermisoPaginacionAltoPuerto=false;
		this.isPermisoPaginacionTodoPuerto=false;
		this.isPermisoCopiarPuerto=false;		
		this.isPermisoVerFormPuerto=false;		
		this.isPermisoDuplicarPuerto=false;		
		this.isPermisoOrdenPuerto=false;		
	}
	
	public void setPermisosUsuarioPuerto(Boolean isPermiso) {
		this.isPermisoTodoPuerto=isPermiso;
		this.isPermisoNuevoPuerto=isPermiso;
		this.isPermisoActualizarPuerto=isPermiso;
		this.isPermisoActualizarOriginalPuerto=isPermiso;
		this.isPermisoEliminarPuerto=isPermiso;
		this.isPermisoGuardarCambiosPuerto=isPermiso;
		this.isPermisoConsultaPuerto=isPermiso;
		this.isPermisoBusquedaPuerto=isPermiso;
		this.isPermisoReportePuerto=isPermiso;
		this.isPermisoOrdenPuerto=isPermiso;		
		this.isPermisoPaginacionMedioPuerto=isPermiso;		
		this.isPermisoPaginacionAltoPuerto=isPermiso;		
		this.isPermisoPaginacionTodoPuerto=isPermiso;		
		this.isPermisoCopiarPuerto=isPermiso;		
		this.isPermisoVerFormPuerto=isPermiso;		
		this.isPermisoDuplicarPuerto=isPermiso;
		this.isPermisoOrdenPuerto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPuerto(Boolean isPermiso) {
		//this.isPermisoTodoPuerto=isPermiso;
		this.isPermisoNuevoPuerto=isPermiso;
		this.isPermisoActualizarPuerto=isPermiso;
		this.isPermisoActualizarOriginalPuerto=isPermiso;
		this.isPermisoEliminarPuerto=isPermiso;
		this.isPermisoGuardarCambiosPuerto=isPermiso;
		//this.isPermisoConsultaPuerto=isPermiso;
		//this.isPermisoBusquedaPuerto=isPermiso;
		//this.isPermisoReportePuerto=isPermiso;
		//this.isPermisoOrdenPuerto=isPermiso;		
		//this.isPermisoPaginacionMedioPuerto=isPermiso;		
		//this.isPermisoPaginacionAltoPuerto=isPermiso;		
		//this.isPermisoPaginacionTodoPuerto=isPermiso;		
		//this.isPermisoCopiarPuerto=isPermiso;		
		//this.isPermisoDuplicarPuerto=isPermiso;
		//this.isPermisoOrdenPuerto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPuertoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PedidoCompraImporConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(LiquidacionImporConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(EmbarcadorConstantesFunciones.SNOMBREOPCION);
		
		if(PuertoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPedidoCompraImpor=false;
		this.isTienePermisosPedidoCompraImpor=this.verificarGetPermisosUsuarioOpcionPuertoClaseRelacionada(this.opcionsRelacionadas,PedidoCompraImporConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosLiquidacionImpor=false;
		this.isTienePermisosLiquidacionImpor=this.verificarGetPermisosUsuarioOpcionPuertoClaseRelacionada(this.opcionsRelacionadas,LiquidacionImporConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosEmbarcador=false;
		this.isTienePermisosEmbarcador=this.verificarGetPermisosUsuarioOpcionPuertoClaseRelacionada(this.opcionsRelacionadas,EmbarcadorConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebPuerto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPuertoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPedidoCompraImpor=conPermiso;
		this.isTienePermisosLiquidacionImpor=conPermiso;
		this.isTienePermisosEmbarcador=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioPuertoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPuertoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPuertoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPedidoCompraImpor && this.jInternalFrameDetalleFormPuerto!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPuerto.jTabbedPaneRelacionesPuerto.remove(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosLiquidacionImpor && this.jInternalFrameDetalleFormPuerto!=null && this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPuerto.jTabbedPaneRelacionesPuerto.remove(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosEmbarcador && this.jInternalFrameDetalleFormPuerto!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPuerto.jTabbedPaneRelacionesPuerto.remove(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioPuerto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PuertoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.puertoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PuertoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPuerto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPuerto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPuerto=this.isPermisoActualizarPuerto;
			this.isPermisoEliminarPuerto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPuerto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPuerto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPuerto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPuerto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePuerto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPuerto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPuerto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPuerto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPuerto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPuerto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPuerto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPuerto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPuerto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.puertoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPuerto.setToolTipText(this.jTableDatosPuerto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPuerto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPuerto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PuertoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PuertoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPuerto() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPedidoCompraImpor && this.puertoConstantesFunciones.mostrarPedidoCompraImporPuerto && !PuertoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Pedido Compra");
			reporte.setsDescripcion("Pedido Compra");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosLiquidacionImpor && this.puertoConstantesFunciones.mostrarLiquidacionImporPuerto && !PuertoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Liquidacion Impor");
			reporte.setsDescripcion("Liquidacion Impor");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosEmbarcador && this.puertoConstantesFunciones.mostrarEmbarcadorPuerto && !PuertoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Embarcador");
			reporte.setsDescripcion("Embarcador");
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
	public void inicializarCombosForeignKeyPuertoListas()throws Exception {
		try	{						
			
				this.tipopuertosForeignKey=new ArrayList();
				this.paissForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPuertoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PuertoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPuertoListas(false);
			} else {
			
				this.cargarCombosForeignKeyTipoPuertoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyTipoPuertoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipopuertosForeignKey==null||this.tipopuertosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoPuertoConstantesFunciones.getArrayColumnasGlobalesTipoPuerto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoPuertoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoPuertoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoPuertosForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyPuertoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PuertoParameterReturnGeneral puertoReturnGeneral=new PuertoParameterReturnGeneral();
						
			


				String finalQueryGlobalTipoPuerto="";

				if(((this.tipopuertosForeignKey==null||this.tipopuertosForeignKey.size()<=0) && this.puertoConstantesFunciones.cargarid_tipo_puertoPuerto)
					 || (this.esRecargarFks && this.puertoConstantesFunciones.cargarid_tipo_puertoPuerto)) {

					if(!this.puertoSessionBean.getisBusquedaDesdeForeignKeySesionTipoPuerto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoPuertoConstantesFunciones.getArrayColumnasGlobalesTipoPuerto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoPuerto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoPuertoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoPuerto=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoPuerto, "");
						finalQueryGlobalTipoPuerto+=TipoPuertoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoPuertosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoPuerto=" WHERE " + ConstantesSql.ID + "="+puertoSessionBean.getlidTipoPuertoActual();
					}
				} else {
					finalQueryGlobalTipoPuerto="NONE";
				}


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.puertoConstantesFunciones.cargarid_paisPuerto)
					 || (this.esRecargarFks && this.puertoConstantesFunciones.cargarid_paisPuerto)) {

					if(!this.puertoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+puertoSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				puertoReturnGeneral=puertoLogic.cargarCombosLoteForeignKeyPuerto(finalQueryGlobalTipoPuerto,finalQueryGlobalPais);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalTipoPuerto.equals("NONE")) {
				this.tipopuertosForeignKey=puertoReturnGeneral.gettipopuertosForeignKey();
			}

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=puertoReturnGeneral.getpaissForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPuerto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyTipoPuerto();
			this.addItemDefectoCombosForeignKeyPais();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyTipoPuerto()throws Exception {
		try {
			if(this.puertoSessionBean==null) {
				this.puertoSessionBean=new PuertoSessionBean();
			}

			if(!this.puertoSessionBean.getisBusquedaDesdeForeignKeySesionTipoPuerto()) {
				TipoPuerto tipopuerto=new TipoPuerto();
				TipoPuertoConstantesFunciones.setTipoPuertoDescripcion(tipopuerto,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipopuerto.setId(null);

				if(!TipoPuertoConstantesFunciones.ExisteEnLista(this.tipopuertosForeignKey,tipopuerto,true)) {

					this.tipopuertosForeignKey.add(0,tipopuerto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {

			if(!this.puertoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
	
	public void initActionsCombosTodosForeignKeyPuerto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPuerto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPuerto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPuerto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPuerto(Puerto puerto)throws Exception {	
		try {
			
			this.setActualTipoPuertoForeignKey(puerto.getid_tipo_puerto(),false,"Formulario");
			this.setActualPaisForeignKey(puerto.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPuerto(Puerto puerto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPuerto()throws Exception {	
		try {
			
			this.setActualTipoPuertoForeignKey(this.puertoConstantesFunciones.getid_tipo_puerto(),false,"Formulario");
			this.setActualPaisForeignKey(this.puertoConstantesFunciones.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPuerto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPuerto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPuerto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPuerto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPuerto()throws Exception {
		try {
			

			this.cargarCombosFrameTipoPuertosForeignKey("Todos");
			this.cargarCombosFramePaissForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPuerto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameTipoPuertosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPuerto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPuerto.jComboBoxid_tipo_puertoPuerto!=null && this.jInternalFrameDetalleFormPuerto.jComboBoxid_tipo_puertoPuerto.getItemCount()>0) {
				this.jInternalFrameDetalleFormPuerto.jComboBoxid_tipo_puertoPuerto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPuerto.jComboBoxid_paisPuerto!=null && this.jInternalFrameDetalleFormPuerto.jComboBoxid_paisPuerto.getItemCount()>0) {
				this.jInternalFrameDetalleFormPuerto.jComboBoxid_paisPuerto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public PuertoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PuertoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PuertoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.puertoSessionBean=new PuertoSessionBean(); 
		this.puertoConstantesFunciones=new PuertoConstantesFunciones(); 
		this.puertoBean=new Puerto();//(this.puertoConstantesFunciones); 		
		this.puertoReturnGeneral=new PuertoParameterReturnGeneral(); 
		
		this.puertoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.puertoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PuertoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PuertoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PuertoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPuerto(true);
			
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
			
			this.puertoConstantesFunciones=new PuertoConstantesFunciones(); 
			this.puertoBean=new Puerto();//this.puertoConstantesFunciones); 			
			this.puertoReturnGeneral=new PuertoParameterReturnGeneral(); 
		
			PuertoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Puerto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.puerto=new Puerto();
			this.puertos = new ArrayList<Puerto>();
			this.puertosAux = new ArrayList<Puerto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic=new PuertoLogic();
				this.puertoLogic.getNewConnexionToDeep("");
			}
			
			//this.puertoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.puertoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPuerto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPuerto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPuerto);	
					}
					
					if(this.jInternalFrameImportacionPuerto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPuerto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPuerto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPuerto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPuerto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPuerto);
				this.jInternalFrameDetalleFormPuerto.setVisible(false);
				this.jInternalFrameDetalleFormPuerto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPuerto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPuerto);
					this.jInternalFrameReporteDinamicoPuerto.setVisible(false);
					this.jInternalFrameReporteDinamicoPuerto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPuerto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPuerto);
					this.jInternalFrameImportacionPuerto.setVisible(false);
					this.jInternalFrameImportacionPuerto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPuerto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPuerto);
					this.jInternalFrameOrderByPuerto.setVisible(false);
					this.jInternalFrameOrderByPuerto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPuertoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PuertoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.puertoReturnGeneral=new PuertoParameterReturnGeneral();
			
			this.puertoParameterGeneral=new PuertoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.puertoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.puertoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PuertoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.puertoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PedidoCompraImporConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(LiquidacionImporConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(EmbarcadorConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PuertoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.puertoSessionBean.getEsGuardarRelacionado(),this.puertoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PuertoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.puertoSessionBean.getEsGuardarRelacionado(),this.puertoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPuerto=false;
			this.isVisibilidadCeldaDuplicarPuerto=true;
			this.isVisibilidadCeldaCopiarPuerto=true;
			this.isVisibilidadCeldaVerFormPuerto=true;
			this.isVisibilidadCeldaOrdenPuerto=true;
			this.isVisibilidadCeldaNuevoRelacionesPuerto=false;
			this.isVisibilidadCeldaModificarPuerto=false;
			this.isVisibilidadCeldaActualizarPuerto=false;
			this.isVisibilidadCeldaEliminarPuerto=false;
			this.isVisibilidadCeldaCancelarPuerto=false;
			this.isVisibilidadCeldaGuardarPuerto=false;
			this.isVisibilidadCeldaGuardarCambiosPuerto=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdPais=true;
			this.isVisibilidadFK_IdTipoPuerto=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPuerto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPuerto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPuerto(false);
			
			this.setPermisosUsuarioPuerto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.puertoSessionBean.getEsGuardarRelacionado() 
				|| (this.puertoSessionBean.getEsGuardarRelacionado() && this.puertoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPuertoClasesRelacionadas();
			}
			
			if(this.puertoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPuertoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PuertoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPuerto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPuerto();
			}
			
			if(!this.isPermisoBusquedaPuerto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPuerto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.puertoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPuerto,this.isPermisoPaginacionMedioPuerto,this.isPermisoPaginacionTodoPuerto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PuertoConstantesFunciones.getTiposSeleccionarPuerto());
				
				this.tiposColumnasSelect=PuertoConstantesFunciones.getTiposSeleccionarPuerto(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectPuerto();				
				//this.tiposRelacionesSelect=PuertoConstantesFunciones.getTiposRelacionesPuerto(true);
				
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
			//if(!this.puertoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPuerto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPuerto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPuerto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPuerto() ;
			
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
			
			
			this.pedidocompraimporLogic=new PedidoCompraImporLogic();
			this.liquidacionimporLogic=new LiquidacionImporLogic();
			this.embarcadorLogic=new EmbarcadorLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.tipopuertoLogic=new TipoPuertoLogic();
			this.paisLogic=new PaisLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				puertoImplementable= (PuertoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PuertoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				puertoImplementableHome= (PuertoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PuertoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.puertos= new ArrayList<Puerto>();
			this.puertosEliminados= new ArrayList<Puerto>();
						
			this.isEsNuevoPuerto=false;
			this.esParaAccionDesdeFormularioPuerto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.tipopuertosForeignKey=new ArrayList<TipoPuerto>() ;
			this.paissForeignKey=new ArrayList<Pais>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPuerto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPuerto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.puertoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PuertoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PuertoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPuerto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPuerto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPuerto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPuerto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPuerto();
			}
			
			PuertoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPuerto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPuerto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPuerto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPuerto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Puerto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPuerto() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(LiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(LiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(EmbarcadorConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EmbarcadorConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPuerto")) {
				iIndex=this.jInternalFrameDetalleFormPuerto.jTabbedPaneRelacionesPuerto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPuerto.jTabbedPaneRelacionesPuerto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPuerto.getSelectedRow();	
				
				

				if(sTitle.equals("Embarcadores")) {
					if(!EmbarcadorJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPuerto();

						this.cargarParteTabPanelRelacionadaEmbarcador(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Liquidacion Impores")) {
					if(!LiquidacionImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPuerto();

						this.cargarParteTabPanelRelacionadaLiquidacionImpor(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Pedido Compras")) {
					if(!PedidoCompraImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPuerto();

						this.cargarParteTabPanelRelacionadaPedidoCompraImpor(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPuerto();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaEmbarcador(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPuerto.cargarSessionConBeanSwingJInternalFrameEmbarcador(false,true,iIndex);
		this.jButtonEmbarcadorActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEmbarcador();

		//this.jTabbedPaneRelacionesPuerto.updateUI();
		//this.jTabbedPaneRelacionesPuerto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPuerto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaLiquidacionImpor(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPuerto.cargarSessionConBeanSwingJInternalFrameLiquidacionImpor(false,true,iIndex);
		this.jButtonLiquidacionImporActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaLiquidacionImpor();

		//this.jTabbedPaneRelacionesPuerto.updateUI();
		//this.jTabbedPaneRelacionesPuerto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPuerto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPedidoCompraImpor(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPuerto.cargarSessionConBeanSwingJInternalFramePedidoCompraImpor(false,true,iIndex);
		this.jButtonPedidoCompraImporActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPedidoCompraImpor();

		//this.jTabbedPaneRelacionesPuerto.updateUI();
		//this.jTabbedPaneRelacionesPuerto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPuerto.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("PedidoCompraImpor")) {
				int row=this.jTableDatosPuerto.getSelectedRow();
				jButtonPedidoCompraImporActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("LiquidacionImpor")) {
				int row=this.jTableDatosPuerto.getSelectedRow();
				jButtonLiquidacionImporActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Embarcador")) {
				int row=this.jTableDatosPuerto.getSelectedRow();
				jButtonEmbarcadorActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.puertoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Pedido Compra")) {

					if(this.isTienePermisosPedidoCompraImpor && this.puertoConstantesFunciones.mostrarPedidoCompraImporPuerto && !PuertoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Pedido Compras"+"("+PedidoCompraImporConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Pedido Compras");

						if(puertoConstantesFunciones.resaltarPedidoCompraImporPuerto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(puertoConstantesFunciones.resaltarPedidoCompraImporPuerto);
						}

						jmenuItem.setEnabled(this.puertoConstantesFunciones.activarPedidoCompraImporPuerto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PedidoCompraImpor"));

						

						this.jInternalFrameDetalleFormPuerto.jmenuDetallePuerto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Liquidacion Impor")) {

					if(this.isTienePermisosLiquidacionImpor && this.puertoConstantesFunciones.mostrarLiquidacionImporPuerto && !PuertoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Liquidacion Impores"+"("+LiquidacionImporConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Liquidacion Impores");

						if(puertoConstantesFunciones.resaltarLiquidacionImporPuerto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(puertoConstantesFunciones.resaltarLiquidacionImporPuerto);
						}

						jmenuItem.setEnabled(this.puertoConstantesFunciones.activarLiquidacionImporPuerto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"LiquidacionImpor"));

						

						this.jInternalFrameDetalleFormPuerto.jmenuDetallePuerto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Embarcador")) {

					if(this.isTienePermisosEmbarcador && this.puertoConstantesFunciones.mostrarEmbarcadorPuerto && !PuertoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Embarcadores"+"("+EmbarcadorConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Embarcadores");

						if(puertoConstantesFunciones.resaltarEmbarcadorPuerto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(puertoConstantesFunciones.resaltarEmbarcadorPuerto);
						}

						jmenuItem.setEnabled(this.puertoConstantesFunciones.activarEmbarcadorPuerto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Embarcador"));

						

						this.jInternalFrameDetalleFormPuerto.jmenuDetallePuerto.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyPuerto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPuerto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPuerto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPuertoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPuerto();
		
		this.cargarCombosFrameForeignKeyPuerto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPuerto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPuerto();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoPuerto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoPuertoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoPuerto();
				this.cargarCombosFrameTipoPuertosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoPuerto(this.tipopuertosForeignKey);

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
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPuertoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.puertoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPuerto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
			
			
			if(jTableDatosPuerto.getRowCount()>=1) {
				jTableDatosPuerto.removeRowSelectionInterval(0, jTableDatosPuerto.getRowCount()-1);						
			}
			
			this.isEsNuevoPuerto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPuerto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPuerto(true);			
			//this.puerto=new Puerto();
			//this.puerto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPuerto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPuerto() ;
			
			if(PuertoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePuerto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.puerto);	
			this.actualizarInformacion("INFO_PADRE",false,this.puerto);				
			
			PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
			
			if(this.puertoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Puerto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPuertoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Puerto> puertosSeleccionados=new ArrayList<Puerto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPuerto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPuerto.getSelectedRows().length;			
			}
			
			puertosSeleccionados=this.getPuertosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPuerto--;			
				//Puerto puertoAux= new Puerto();			
				//puertoAux.setId(this.iIdNuevoPuerto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Puerto puertoOrigen=new Puerto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Puerto puertoOrigen : puertosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPuerto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							puertoOrigen =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							puertoOrigen =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPuerto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.puerto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPuerto(puertoOrigen,this.puerto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.puertoLogic.getPuertos().add(this.puertoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.puertos.add(this.puertoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPuerto(false);
				
				this.jTableDatosPuerto.setRowSelectionInterval(this.getIndiceNuevoPuerto(), this.getIndiceNuevoPuerto());
				
				int iLastRow =  this.jTableDatosPuerto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPuerto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPuerto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPuerto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Puerto> puertosSeleccionados=new ArrayList<Puerto>();									
		
			Puerto puertoOrigen=new Puerto();
			Puerto puertoDestino=new Puerto();
				
			puertosSeleccionados=this.getPuertosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPuerto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || puertosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPuerto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						puertoOrigen =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						puertoOrigen =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						puertoDestino =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						puertoDestino =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				puertoOrigen =puertosSeleccionados.get(0);
				puertoDestino =puertosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPuerto(puertoOrigen,puertoDestino,true,false);
				
				puertoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(puertoDestino,puertoLogic.getPuertos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(puertoDestino,puertos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPuerto(false);
				
				//this.jTableDatosPuerto.setRowSelectionInterval(this.getIndiceNuevoPuerto(), this.getIndiceNuevoPuerto());
				
				int iLastRow =  this.jTableDatosPuerto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPuerto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPuerto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPuerto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPuerto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPuerto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPuerto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPuerto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPuerto.setVisible(!isVisible);
			this.jPanelPaginacionPuerto.setVisible(!isVisible);
			this.jPanelAccionesPuerto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePuerto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPuerto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPuerto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPuerto();
			
			this.abrirFrameOrderByPuerto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPuerto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePuerto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPuerto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPuerto.isMaximum()) {
					this.jInternalFrameDetalleFormPuerto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPuerto.setSize(this.jInternalFrameDetalleFormPuerto.iWidthFormulario,this.jInternalFrameDetalleFormPuerto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPuerto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPuerto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPuerto.isMaximum()) {
						this.jInternalFrameDetalleFormPuerto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPuerto.jContentPaneDetallePuerto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPuerto.jTabbedPaneRelacionesPuerto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPuerto.jContentPaneDetallePuerto.getWidth(),PuertoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPuerto.jTabbedPaneRelacionesPuerto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPuerto.jContentPaneDetallePuerto.getWidth(),PuertoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPuerto.jTabbedPaneRelacionesPuerto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPuerto.jContentPaneDetallePuerto.getWidth(),PuertoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(EmbarcadorJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEmbarcador();
					}

					if(LiquidacionImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaLiquidacionImpor();
					}

					if(PedidoCompraImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPedidoCompraImpor();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPuerto.setVisible(true);
	        this.jInternalFrameDetalleFormPuerto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPuerto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPuerto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPuerto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPuerto,false,this);
				} else {
					this.jInternalFrameOrderByPuerto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPuerto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPuerto);
				this.jInternalFrameOrderByPuerto.setVisible(false);
				this.jInternalFrameOrderByPuerto.setSelected(false);
				
				this.jInternalFrameOrderByPuerto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPuerto"));
				
				this.inicializarActualizarBindingTablaOrderByPuerto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPuerto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPuerto==null) {
				
				this.jInternalFrameImportacionPuerto=new ImportacionJInternalFrame(PuertoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPuerto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPuerto);
				this.jInternalFrameImportacionPuerto.setVisible(false);
				this.jInternalFrameImportacionPuerto.setSelected(false);


				this.jInternalFrameImportacionPuerto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPuerto"));
				this.jInternalFrameImportacionPuerto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPuerto"));
				this.jInternalFrameImportacionPuerto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPuerto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPuerto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPuerto==null) {
				this.jInternalFrameReporteDinamicoPuerto=new ReporteDinamicoJInternalFrame(PuertoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPuerto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPuerto);
				this.jInternalFrameReporteDinamicoPuerto.setVisible(false);
				this.jInternalFrameReporteDinamicoPuerto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPuerto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPuerto"));
				this.jInternalFrameReporteDinamicoPuerto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPuerto"));
				this.jInternalFrameReporteDinamicoPuerto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPuerto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPuerto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaEmbarcador() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jScrollPanelDatosEmbarcador.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPuerto.jContentPaneDetallePuerto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jScrollPanelDatosEmbarcador.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jScrollPanelDatosEmbarcador.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.jScrollPanelDatosEmbarcador.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaLiquidacionImpor() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jScrollPanelDatosLiquidacionImpor.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPuerto.jContentPaneDetallePuerto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jScrollPanelDatosLiquidacionImpor.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jScrollPanelDatosLiquidacionImpor.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.jScrollPanelDatosLiquidacionImpor.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPedidoCompraImpor() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jScrollPanelDatosPedidoCompraImpor.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPuerto.jContentPaneDetallePuerto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jScrollPanelDatosPedidoCompraImpor.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jScrollPanelDatosPedidoCompraImpor.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.jScrollPanelDatosPedidoCompraImpor.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetallePuerto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPuerto);
			
	       	this.jInternalFrameDetalleFormPuerto.setVisible(false);
	        this.jInternalFrameDetalleFormPuerto.setSelected(false);
			
			//this.jInternalFrameDetalleFormPuerto.dispose();
			//this.jInternalFrameDetalleFormPuerto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPuerto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPuerto.setVisible(true);
	        this.jInternalFrameReporteDinamicoPuerto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPuerto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPuerto.setVisible(true);
	        this.jInternalFrameImportacionPuerto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPuerto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPuerto.setVisible(true);
	        this.jInternalFrameOrderByPuerto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPuerto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPuerto.setVisible(false);
	        this.jInternalFrameOrderByPuerto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPuerto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPuerto.setVisible(false);
	        this.jInternalFrameReporteDinamicoPuerto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPuerto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPuerto.setVisible(false);
	        this.jInternalFrameImportacionPuerto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPuerto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPuerto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPuerto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPuerto(true);
			//this.isEsNuevoPuerto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puerto =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.puerto =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPuerto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPuerto(false) ;
			
			if(puertoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.getEsGuardarRelacionado() && PedidoCompraImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoCompraImporActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporSessionBean.getEsGuardarRelacionado() && LiquidacionImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonLiquidacionImporActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorSessionBean.getEsGuardarRelacionado() && EmbarcadorJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmbarcadorActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(PuertoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePuerto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPuerto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPuertoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPuerto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puerto =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puerto =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPuerto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPuerto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPuerto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPuerto(true);
			//this.isEsNuevoPuerto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puerto =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.puerto =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.puerto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPuerto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPuerto(false) ;
			
			if(PuertoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePuerto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPuerto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaTipoPuerto(List<TipoPuerto> tipopuertosForeignKey)throws Exception{
		TableColumn tableColumnTipoPuerto=this.jTableDatosPuerto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPuerto,PuertoConstantesFunciones.LABEL_IDTIPOPUERTO));
		TableCellEditor tableCellEditorTipoPuerto =tableColumnTipoPuerto.getCellEditor();

		TipoPuertoTableCell tipopuertoTableCellFk=(TipoPuertoTableCell)tableCellEditorTipoPuerto;

		if(tipopuertoTableCellFk!=null) {
			tipopuertoTableCellFk.settipopuertosForeignKey(tipopuertosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPuerto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipopuertoTableCellFk.setRowActual(intSelectedRow);
			//tipopuertoTableCellFk.settipopuertosForeignKeyActual(tipopuertosForeignKey);
		//}


		if(tipopuertoTableCellFk!=null) {
			tipopuertoTableCellFk.RecargarTipoPuertosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosPuerto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPuerto,PuertoConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPuerto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPuerto(false);
			
			//if(!this.isEsNuevoPuerto) {								
				int intSelectedRow = this.jTableDatosPuerto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puerto =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.puerto =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PuertoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPuerto(this.puerto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);
				
			}
			
			if(this.permiteMantenimiento(this.puerto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.puertoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPuerto=true;
					this.inicializarActualizarBindingTablaPuerto(false);
					this.isEsNuevoPuerto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPuerto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPuerto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPuerto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPuerto(false);
				
				this.habilitarDeshabilitarControlesPuerto(false);
			
												
				
				if(PuertoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePuerto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPuertoActionPerformed(evt,puertoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPuerto(this.puerto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPuerto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,puertoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.puerto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Puerto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Puerto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPuerto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puerto =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				this.puerto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.puerto =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				this.puerto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.puerto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.puertoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PuertoModel) this.jTableDatosPuerto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPuerto=true;
				this.inicializarActualizarBindingTablaPuerto(false);
				this.isEsNuevoPuerto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPuerto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPuerto(false);
				
				this.habilitarDeshabilitarControlesPuerto(false);
				
				
				
				if(PuertoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePuerto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPuertoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPuerto.getRowCount()>=1) {
				jTableDatosPuerto.removeRowSelectionInterval(0, jTableDatosPuerto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPuerto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPuerto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPuerto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPuerto(false) ;
			
			this.isEsNuevoPuerto=false;
			
			if(PuertoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePuerto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPuertoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPuerto(false);
				
				//SI ES MANUAL
				if(PuertoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPuerto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPuertoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPuerto--;			
			//Puerto puertoAux= new Puerto();			
			//puertoAux.setId(this.iIdNuevoPuerto);
			
			if(this.jInternalFrameDetalleFormPuerto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPuerto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);
			
			this.puerto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.puertoLogic.getPuertos().add(this.puertoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.puertos.add(this.puertoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPuerto(false);
			
			this.jTableDatosPuerto.setRowSelectionInterval(this.getIndiceNuevoPuerto(), this.getIndiceNuevoPuerto());
			
			int iLastRow =  this.jTableDatosPuerto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPuerto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPuerto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPuerto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPuertoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPuerto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPuerto(false);
			
			//SI ES MANUAL
			if(PuertoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPuerto();
			}
			
			//this.abrirFrameTreePuerto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPuertoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE PuertoES ?", "MANTENIMIENTO DE Puerto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPuerto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPuerto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.puertoReturnGeneral=puertoLogic.procesarImportacionPuertosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.puertoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPuertoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPuertoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPuerto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPuerto.setFileImportacion(this.jInternalFrameImportacionPuerto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPuerto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPuerto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPuerto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPuerto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPuertoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Puerto> puertosSeleccionados=new ArrayList<Puerto>();		

		puertosSeleccionados=this.getPuertosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPuerto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPuerto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PuertoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PuertoBaseDesign.jrxml";
			
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
			
			this.generarReportePuertos("Todos",puertosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puertoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Puerto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPuerto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPuerto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PuertoConstantesFunciones.LABEL_IDTIPOPUERTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoPuerto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoPuerto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoPuerto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoPuerto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PuertoConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PuertoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PuertoConstantesFunciones.LABEL_ESLOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Local_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Local_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Local_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Local_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PuertoConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoPuerto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPuerto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPuerto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PuertoConstantesFunciones.LABEL_IDTIPOPUERTO:
					sNombreCampoCategoria="id_tipo_puerto";
					break;

				case PuertoConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case PuertoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case PuertoConstantesFunciones.LABEL_ESLOCAL:
					sNombreCampoCategoria="es_local";
					break;

				case PuertoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPuerto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PuertoConstantesFunciones.LABEL_IDTIPOPUERTO:
					sNombreCampoCategoriaValor="id_tipo_puerto";
					break;

				case PuertoConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case PuertoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case PuertoConstantesFunciones.LABEL_ESLOCAL:
					sNombreCampoCategoriaValor="es_local";
					break;

				case PuertoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPuerto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPuerto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PuertoConstantesFunciones.LABEL_IDTIPOPUERTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Puerto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_puerto");
					break;

				case PuertoConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case PuertoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case PuertoConstantesFunciones.LABEL_ESLOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_local");
					break;

				case PuertoConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoPuertoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Puerto> puertosSeleccionados=new ArrayList<Puerto>();		
		
		puertosSeleccionados=this.getPuertosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"puerto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Puertos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPuerto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPuerto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PuertoConstantesFunciones.LABEL_IDTIPOPUERTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PuertoConstantesFunciones.LABEL_IDTIPOPUERTO);
					iRow++;

					for(Puerto puerto:puertosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(puerto.gettipopuerto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PuertoConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PuertoConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(Puerto puerto:puertosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(puerto.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PuertoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PuertoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Puerto puerto:puertosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(puerto.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PuertoConstantesFunciones.LABEL_ESLOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PuertoConstantesFunciones.LABEL_ESLOCAL);
					iRow++;

					for(Puerto puerto:puertosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(puerto.getes_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PuertoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PuertoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Puerto puerto:puertosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(puerto.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelPuerto(row);				
			//	iRow++;
			//}				
			
			//for(Puerto puertoAux:puertosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPuerto(puertoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puertoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Puerto",JOptionPane.INFORMATION_MESSAGE);
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
				this.puertoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPuerto(false);
			
			//SI ES MANUAL
			if(PuertoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPuerto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPuertoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPuerto(false);
			
			//SI ES MANUAL
			if(PuertoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPuerto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPuertoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPuerto(false);
			
			//SI ES MANUAL
			if(PuertoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPuerto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPuerto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPuerto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPuerto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPuerto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPuerto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPuerto.setMinimumSize(dimensionMinimum);
		this.jTableDatosPuerto.setMaximumSize(dimensionMaximum);
		this.jTableDatosPuerto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPuerto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPuerto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPuerto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPuerto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPuerto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.puertoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPuerto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPuerto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPuerto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PuertoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PuertoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPuerto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPuerto();
		
		this.inicializarActualizarBindingBotonesManualPuerto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.puertoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPuerto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPuerto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPuerto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPuerto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPuerto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPuerto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePuerto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPuerto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPuerto.jCheckBoxPostAccionNuevoPuerto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPuerto.jCheckBoxPostAccionSinCerrarPuerto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPuerto.jCheckBoxPostAccionSinMensajePuerto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPuerto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPuerto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePuerto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPuerto!=null) {
				this.jInternalFrameDetalleFormPuerto.jCheckBoxPostAccionNuevoPuerto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPuerto.jCheckBoxPostAccionSinCerrarPuerto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPuerto.jCheckBoxPostAccionSinMensajePuerto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPuerto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPuerto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPuerto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPuerto.jComboBoxTiposAccionesFormularioPuerto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPuerto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPuerto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPuerto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPuerto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPuerto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPuerto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPuerto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPuerto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPuerto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPuerto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPuerto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPuerto(Boolean esInicializar) throws Exception {
		try	{	
			if(PuertoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPuerto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPuerto() throws Exception {
		try	{
			if(PuertoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPuerto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePuerto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPuerto.jComboBoxTiposAccionesFormularioPuerto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPuerto.jComboBoxTiposAccionesFormularioPuerto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPuerto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPuerto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPuerto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPuerto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPuerto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPuerto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPuerto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPuerto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPuerto.addItem(reporte);
			}
			
			
			if(!this.puertoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPuerto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPuerto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPuerto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPuerto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPuerto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPuerto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPuerto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPuerto.jComboBoxTiposAccionesFormularioPuerto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPuerto.jComboBoxTiposAccionesFormularioPuerto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPuerto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPuerto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPuerto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPuerto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPuerto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPuerto!=null) {
				this.jInternalFrameReporteDinamicoPuerto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPuerto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPuerto!=null) {
				this.jInternalFrameReporteDinamicoPuerto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPuerto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPuerto!=null) {
				
				if(this.jInternalFrameReporteDinamicoPuerto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPuerto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPuerto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPuerto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPuerto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPuerto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPuerto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombrePuerto.getText();
		if(this.jComboBoxid_paisFK_IdPaisPuerto.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisPuerto.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_puertoFK_IdTipoPuertoPuerto.getSelectedItem()!=null){this.id_tipo_puertoFK_IdTipoPuerto=((TipoPuerto)this.jComboBoxid_tipo_puertoFK_IdTipoPuertoPuerto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPuerto(Boolean esInicializar) throws Exception {				
		if(PuertoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPuerto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPuerto() throws Exception {
		this.inicializarActualizarBindingTablaPuerto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPuerto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPuerto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPuerto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPuerto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PuertoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPuerto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPuerto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PuertoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPuertoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPuertoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PuertoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPuerto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPuerto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PuertoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPuerto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPuerto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=puertoLogic.getPuertos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=puertos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PuertoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPuerto.setModel(new PuertoModel(this.puertoLogic.getPuertos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPuerto.setModel(new PuertoModel(this.puertos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPuerto!=null && this.jInternalFrameOrderByPuerto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPuerto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPuerto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPuerto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PuertoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PuertoConstantesFunciones.SCLASSWEBTITULO,puertoConstantesFunciones.resaltarSeleccionarPuerto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PuertoConstantesFunciones.SCLASSWEBTITULO,puertoConstantesFunciones.resaltarSeleccionarPuerto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPuerto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPuerto,PuertoConstantesFunciones.LABEL_ID));

		if(this.puertoConstantesFunciones.mostraridPuerto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PuertoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.puertoConstantesFunciones.resaltaridPuerto,this.puertoConstantesFunciones.activaridPuerto,this,true,"idPuerto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.puertoConstantesFunciones.resaltaridPuerto,this.puertoConstantesFunciones.activaridPuerto,this,true,"idPuerto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPuerto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPuerto,PuertoConstantesFunciones.LABEL_IDTIPOPUERTO));

		if(this.puertoConstantesFunciones.mostrarid_tipo_puertoPuerto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PuertoConstantesFunciones.LABEL_IDTIPOPUERTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoPuertoTableCell(this.tipopuertosForeignKey,this.puertoConstantesFunciones.resaltarid_tipo_puertoPuerto,this,this.puertoConstantesFunciones.activarid_tipo_puertoPuerto));
			tableColumn.setCellEditor(new TipoPuertoTableCell(this.tipopuertosForeignKey,this.puertoConstantesFunciones.resaltarid_tipo_puertoPuerto,this,this.puertoConstantesFunciones.activarid_tipo_puertoPuerto,true,"id_tipo_puertoPuerto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PuertoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPuerto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPuerto,PuertoConstantesFunciones.LABEL_IDPAIS));

		if(this.puertoConstantesFunciones.mostrarid_paisPuerto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PuertoConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.puertoConstantesFunciones.resaltarid_paisPuerto,this,this.puertoConstantesFunciones.activarid_paisPuerto));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.puertoConstantesFunciones.resaltarid_paisPuerto,this,this.puertoConstantesFunciones.activarid_paisPuerto,true,"id_paisPuerto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PuertoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPuerto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPuerto,PuertoConstantesFunciones.LABEL_NOMBRE));

		if(this.puertoConstantesFunciones.mostrarnombrePuerto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PuertoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.puertoConstantesFunciones.resaltarnombrePuerto,this.puertoConstantesFunciones.activarnombrePuerto,this,true,"nombrePuerto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.puertoConstantesFunciones.resaltarnombrePuerto,this.puertoConstantesFunciones.activarnombrePuerto,this,true,"nombrePuerto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PuertoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPuerto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPuerto,PuertoConstantesFunciones.LABEL_ESLOCAL));

		if(this.puertoConstantesFunciones.mostrares_localPuerto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PuertoConstantesFunciones.LABEL_ESLOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.puertoConstantesFunciones.resaltares_localPuerto,this.puertoConstantesFunciones.activares_localPuerto));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.puertoConstantesFunciones.resaltares_localPuerto,this.puertoConstantesFunciones.activares_localPuerto,this,true,"es_localPuerto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PuertoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPuerto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPuerto,PuertoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.puertoConstantesFunciones.mostrardescripcionPuerto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PuertoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.puertoConstantesFunciones.resaltardescripcionPuerto,this.puertoConstantesFunciones.activardescripcionPuerto,this,true,"descripcionPuerto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.puertoConstantesFunciones.resaltardescripcionPuerto,this.puertoConstantesFunciones.activardescripcionPuerto,this,true,"descripcionPuerto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PuertoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.puertoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPedidoCompraImpor && this.puertoConstantesFunciones.mostrarPedidoCompraImporPuerto && !PuertoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Pedido Compras");
				tableColumn.setHeaderValue("Pedido Compras");
				tableColumn.setCellRenderer(new PedidoCompraImporTableCell(puertoConstantesFunciones.resaltarPedidoCompraImporPuerto,this,this.puertoConstantesFunciones.activarPedidoCompraImporPuerto));
				tableColumn.setCellEditor(new PedidoCompraImporTableCell(puertoConstantesFunciones.resaltarPedidoCompraImporPuerto,this,this.puertoConstantesFunciones.activarPedidoCompraImporPuerto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPuerto.addColumn(tableColumn);
			}

			if(this.isTienePermisosLiquidacionImpor && this.puertoConstantesFunciones.mostrarLiquidacionImporPuerto && !PuertoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Liquidacion Impores");
				tableColumn.setHeaderValue("Liquidacion Impores");
				tableColumn.setCellRenderer(new LiquidacionImporTableCell(puertoConstantesFunciones.resaltarLiquidacionImporPuerto,this,this.puertoConstantesFunciones.activarLiquidacionImporPuerto));
				tableColumn.setCellEditor(new LiquidacionImporTableCell(puertoConstantesFunciones.resaltarLiquidacionImporPuerto,this,this.puertoConstantesFunciones.activarLiquidacionImporPuerto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPuerto.addColumn(tableColumn);
			}

			if(this.isTienePermisosEmbarcador && this.puertoConstantesFunciones.mostrarEmbarcadorPuerto && !PuertoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Embarcadores");
				tableColumn.setHeaderValue("Embarcadores");
				tableColumn.setCellRenderer(new EmbarcadorTableCell(puertoConstantesFunciones.resaltarEmbarcadorPuerto,this,this.puertoConstantesFunciones.activarEmbarcadorPuerto));
				tableColumn.setCellEditor(new EmbarcadorTableCell(puertoConstantesFunciones.resaltarEmbarcadorPuerto,this,this.puertoConstantesFunciones.activarEmbarcadorPuerto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPuerto.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.puertoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.puertoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPuerto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.puertoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.puertoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPuerto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPuerto && this.isPermisoGuardarCambiosPuerto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.puertoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.puertoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPuerto.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.puertoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosPuerto.addColumn(tableColumn);
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
			
			this.jTableDatosPuerto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPuerto && this.isPermisoGuardarCambiosPuerto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.puertoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPuerto && this.isPermisoGuardarCambiosPuerto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPuerto.moveColumn(this.jTableDatosPuerto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPuerto.moveColumn(this.jTableDatosPuerto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.puertoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosPuerto.moveColumn(this.jTableDatosPuerto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPuerto.moveColumn(this.jTableDatosPuerto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPuerto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPuerto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPuerto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PuertoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPuerto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPuerto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PuertoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PuertoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPuerto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPuerto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPuerto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=puertoLogic.getPuertos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=puertos.size()-1;
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
		//this.jTableDatosPuerto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPuerto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPuerto();
			
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
				
				//this.isEsNuevoPuerto=false;
					
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
			
				if(this.puertoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPuerto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPuerto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPuerto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puerto =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puerto =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.puerto.getsType().equals("DUPLICADO")
				   || this.puerto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPuerto=true;
				
				} else {
					this.isEsNuevoPuerto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.puertoSessionBean.getEsGuardarRelacionado()) {
					if(this.puerto.getId()>=0 && !this.puerto.getIsNew()) {						
						this.isEsNuevoPuerto=false;
						
					} else {
						this.isEsNuevoPuerto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPuerto(esRelaciones);						
				
				this.seleccionarPuerto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.puerto.getId()<0) {
					this.isEsNuevoPuerto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPuerto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPuerto(evt,rowIndex);
				}	
				
				if(this.puertoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Puerto: " + this.dDif); 
					}
				}								
				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPuerto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.puerto)) {
					if(this.puerto.getId()>0) {
						this.puerto.setIsDeleted(true);
						
						this.puertosEliminados.add(this.puerto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.puertoLogic.getPuertos().remove(this.puerto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.puertos.remove(this.puerto);				
					}
					
					
					((PuertoModel) this.jTableDatosPuerto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPuerto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPuerto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPuerto) {
			
			if(this.jInternalFrameDetalleFormPuerto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPuerto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPuerto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puerto =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puerto =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PuertoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPuerto(this.puerto);
				}
				
				//ARCHITECTURE
				try {
					

					//TipoPuerto
					if(!this.puertoConstantesFunciones.cargarid_tipo_puertoPuerto || this.puertoConstantesFunciones.event_dependid_tipo_puertoPuerto) {
						//this.cargarCombosTipoPuertosForeignKeyLista(" where id="+this.puerto.getid_tipo_puerto());
									//this.inicializarActualizarBindingPuerto(false,false);
						this.tipopuertosForeignKey=new ArrayList<TipoPuerto>();

						if(puerto.getTipoPuerto()!=null) {
							this.tipopuertosForeignKey.add(puerto.getTipoPuerto());
						}

						this.addItemDefectoCombosForeignKeyTipoPuerto();
						this.cargarCombosFrameTipoPuertosForeignKey("Todos");
					}
					this.setActualTipoPuertoForeignKey(this.puerto.getid_tipo_puerto(),false,"Formulario");

					//Pais
					if(!this.puertoConstantesFunciones.cargarid_paisPuerto || this.puertoConstantesFunciones.event_dependid_paisPuerto) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.puerto.getid_pais());
									//this.inicializarActualizarBindingPuerto(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(puerto.getPais()!=null) {
							this.paissForeignKey.add(puerto.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.puerto.getid_pais(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPuerto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPuerto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPuerto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPuerto(Puerto puerto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPuerto(puerto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPuerto(Puerto puerto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPuerto(puerto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPuerto(puerto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPuerto(puerto);
	}
	
	public void setVariablesObjetoActualToFormularioPuerto(Puerto puerto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPuerto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPuerto.jLabelidPuerto.setText(puerto.getId().toString());
			this.jInternalFrameDetalleFormPuerto.jTextAreanombrePuerto.setText(puerto.getnombre());
			this.jInternalFrameDetalleFormPuerto.jCheckBoxes_localPuerto.setSelected(puerto.getes_local());
			this.jInternalFrameDetalleFormPuerto.jTextAreadescripcionPuerto.setText(puerto.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Puerto puertoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,puertoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Puerto puertoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				puertoLocal=this.puerto;
			} else {
				puertoLocal=this.puertoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(puertoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPuerto(puertoLocal,true);
					
					if(puertoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(puertoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.puertoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(puertoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPuerto(Puerto puerto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPuerto(puerto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPuerto(puerto);
	}
	
	public void setVariablesFormularioToObjetoActualPuerto(Puerto puerto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPuerto(puerto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPuerto(Puerto puerto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPuerto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPuerto.jLabelidPuerto.getText()==null || this.jInternalFrameDetalleFormPuerto.jLabelidPuerto.getText()=="" || this.jInternalFrameDetalleFormPuerto.jLabelidPuerto.getText()=="Id") {
				this.jInternalFrameDetalleFormPuerto.jLabelidPuerto.setText("0");
			}

			if(conColumnasBase) {puerto.setId(Long.parseLong(this.jInternalFrameDetalleFormPuerto.jLabelidPuerto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PuertoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPuerto.jLabelIdPuerto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			puerto.setnombre(this.jInternalFrameDetalleFormPuerto.jTextAreanombrePuerto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PuertoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPuerto.jLabelnombrePuerto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			puerto.setes_local(this.jInternalFrameDetalleFormPuerto.jCheckBoxes_localPuerto.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PuertoConstantesFunciones.LABEL_ESLOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPuerto.jLabeles_localPuerto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			puerto.setdescripcion(this.jInternalFrameDetalleFormPuerto.jTextAreadescripcionPuerto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PuertoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPuerto.jLabeldescripcionPuerto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPuerto(Puerto puertoBean,Puerto puerto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && puertoBean.getid_tipo_puerto()!=null && !puertoBean.getid_tipo_puerto().equals(-1L))) {puerto.setid_tipo_puerto(puertoBean.getid_tipo_puerto());}
			if(conDefault || (!conDefault && puertoBean.getid_pais()!=null && !puertoBean.getid_pais().equals(-1L))) {puerto.setid_pais(puertoBean.getid_pais());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPuerto(Puerto puertoOrigen,Puerto puerto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && puertoOrigen.getId()!=null && !puertoOrigen.getId().equals(0L))) {puerto.setId(puertoOrigen.getId());}}
			if(conDefault || (!conDefault && puertoOrigen.getid_tipo_puerto()!=null && !puertoOrigen.getid_tipo_puerto().equals(-1L))) {puerto.setid_tipo_puerto(puertoOrigen.getid_tipo_puerto());}
			if(conDefault || (!conDefault && puertoOrigen.getid_pais()!=null && !puertoOrigen.getid_pais().equals(-1L))) {puerto.setid_pais(puertoOrigen.getid_pais());}
			if(conDefault || (!conDefault && puertoOrigen.getnombre()!=null && !puertoOrigen.getnombre().equals(""))) {puerto.setnombre(puertoOrigen.getnombre());}
			if(conDefault || (!conDefault && puertoOrigen.getes_local()!=null && !puertoOrigen.getes_local().equals(false))) {puerto.setes_local(puertoOrigen.getes_local());}
			if(conDefault || (!conDefault && puertoOrigen.getdescripcion()!=null && !puertoOrigen.getdescripcion().equals(""))) {puerto.setdescripcion(puertoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPuerto(Puerto puerto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPuerto.jLabelidPuerto.setText(puerto.getId().toString());
			this.jInternalFrameDetalleFormPuerto.jTextAreanombrePuerto.setText(puerto.getnombre());
			this.jInternalFrameDetalleFormPuerto.jCheckBoxes_localPuerto.setSelected(puerto.getes_local());
			this.jInternalFrameDetalleFormPuerto.jTextAreadescripcionPuerto.setText(puerto.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPuerto(PuertoBean puertoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPuerto.jLabelidPuerto.setText(puertoBean.getId().toString());
			this.jInternalFrameDetalleFormPuerto.jTextAreanombrePuerto.setText(puertoBean.getnombre());
			this.jInternalFrameDetalleFormPuerto.jCheckBoxes_localPuerto.setSelected(puertoBean.getes_local());
			this.jInternalFrameDetalleFormPuerto.jTextAreadescripcionPuerto.setText(puertoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPuerto(PuertoParameterReturnGeneral puertoReturnGeneral,PuertoBean puertoBean,Boolean conDefault) throws Exception { 
		try {
			Puerto puertoLocal=new Puerto();
			
			puertoLocal=puertoReturnGeneral.getPuerto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && puertoLocal.getId()!=null && !puertoLocal.getId().equals(0L))) {puertoBean.setId(puertoLocal.getId());}}
			if(conDefault || (!conDefault && puertoLocal.getid_tipo_puerto()!=null && !puertoLocal.getid_tipo_puerto().equals(-1L))) {puertoBean.setid_tipo_puerto(puertoLocal.getid_tipo_puerto());}
			if(conDefault || (!conDefault && puertoLocal.getid_pais()!=null && !puertoLocal.getid_pais().equals(-1L))) {puertoBean.setid_pais(puertoLocal.getid_pais());}
			if(conDefault || (!conDefault && puertoLocal.getnombre()!=null && !puertoLocal.getnombre().equals(""))) {puertoBean.setnombre(puertoLocal.getnombre());}
			if(conDefault || (!conDefault && puertoLocal.getes_local()!=null && !puertoLocal.getes_local().equals(false))) {puertoBean.setes_local(puertoLocal.getes_local());}
			if(conDefault || (!conDefault && puertoLocal.getdescripcion()!=null && !puertoLocal.getdescripcion().equals(""))) {puertoBean.setdescripcion(puertoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPuertoGenerico(Long idPuertoSeleccionado,JComboBox jComboBoxPuerto,List<Puerto> puertosLocal)throws Exception {
		try {
			Puerto  puertoTemp=null;

			for(Puerto puertoAux:puertosLocal) {
				if(puertoAux.getId()!=null && puertoAux.getId().equals(idPuertoSeleccionado)) {
					puertoTemp=puertoAux;
					break;
				}
			}

			jComboBoxPuerto.setSelectedItem(puertoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPuertoGenerico(JComboBox jComboBoxPuerto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPuerto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPuerto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPuerto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPuerto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPuerto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPuerto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPuerto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPuerto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPuerto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPuerto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("PedidoCompraImpor")) {
			jButtonPedidoCompraImporActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("LiquidacionImpor")) {
			jButtonLiquidacionImporActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Embarcador")) {
			jButtonEmbarcadorActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			puerto=(Puerto) puertoLogic.getPuertos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			puerto =(Puerto) puertos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("TipoPuerto")) {
			//sDescripcion=this.getActualTipoPuertoForeignKeyDescripcion((Long)value);
			if(!puerto.getIsNew() && !puerto.getIsChanged() && !puerto.getIsDeleted()) {
				sDescripcion=puerto.gettipopuerto_descripcion();
			} else {
				//sDescripcion=this.getActualTipoPuertoForeignKeyDescripcion((Long)value);
				sDescripcion=puerto.gettipopuerto_descripcion();
			}
		}

		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!puerto.getIsNew() && !puerto.getIsChanged() && !puerto.getIsDeleted()) {
				sDescripcion=puerto.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=puerto.getpais_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Puerto puertoRow=new Puerto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			puertoRow=(Puerto) puertoLogic.getPuertos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			puertoRow=(Puerto) puertos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPedidoCompraImporActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Puerto puerto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPuerto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.puerto = (Puerto)this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.puerto = (Puerto)this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(puerto!=null) {
						this.puerto = puerto;
					} else {
						this.puerto = new Puerto();
					}
				}

				if(this.isTienePermisosPedidoCompraImpor && this.permiteMantenimiento(this.puerto)) {
					PedidoCompraImporBeanSwingJInternalFrame pedidocompraimporBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFramePopup=new PedidoCompraImporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						pedidocompraimporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFramePopup;
					} else {
						pedidocompraimporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame;
					}

					List<Puerto> puertos=new ArrayList<Puerto>();
					puertos.add(this.puerto);
					if(!esRelacionado) {
						//pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.setConGuardarRelaciones(false);
						//pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					pedidocompraimporBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPuerto.cargarPedidoCompraImporBeanSwingJInternalFrame(puertos,this.puerto,pedidocompraimporBeanSwingJInternalFrame,/*conInicializar,*/pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.getConGuardarRelaciones(),pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.getEsGuardarRelacionado());
					pedidocompraimporBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						pedidocompraimporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoCompraImpor("no_relacionado");

						pedidocompraimporBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PedidoCompraImporConstantesFunciones.ITAMANIOFILATABLA + (PedidoCompraImporConstantesFunciones.ITAMANIOFILATABLA/2));

						pedidocompraimporBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPuerto=(TitledBorder)this.jScrollPanelDatosPuerto.getBorder();
						TitledBorder titledBorderPedidoCompraImpor=(TitledBorder)pedidocompraimporBeanSwingJInternalFrame.jScrollPanelDatosPedidoCompraImpor.getBorder();

						titledBorderPedidoCompraImpor.setTitle(titledBorderPuerto.getTitle() + " -> Pedido Compra");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,pedidocompraimporBeanSwingJInternalFrame);
						}

						pedidocompraimporBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(pedidocompraimporBeanSwingJInternalFrame);

						pedidocompraimporBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.puertoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Pedido Compra",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonLiquidacionImporActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Puerto puerto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPuerto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.puerto = (Puerto)this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.puerto = (Puerto)this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(puerto!=null) {
						this.puerto = puerto;
					} else {
						this.puerto = new Puerto();
					}
				}

				if(this.isTienePermisosLiquidacionImpor && this.permiteMantenimiento(this.puerto)) {
					LiquidacionImporBeanSwingJInternalFrame liquidacionimporBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFramePopup=new LiquidacionImporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						liquidacionimporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFramePopup;
					} else {
						liquidacionimporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame;
					}

					List<Puerto> puertos=new ArrayList<Puerto>();
					puertos.add(this.puerto);
					if(!esRelacionado) {
						//liquidacionimporBeanSwingJInternalFrame.liquidacionimporSessionBean.setConGuardarRelaciones(false);
						//liquidacionimporBeanSwingJInternalFrame.liquidacionimporSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					liquidacionimporBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPuerto.cargarLiquidacionImporBeanSwingJInternalFrame(puertos,this.puerto,liquidacionimporBeanSwingJInternalFrame,/*conInicializar,*/liquidacionimporBeanSwingJInternalFrame.liquidacionimporSessionBean.getConGuardarRelaciones(),liquidacionimporBeanSwingJInternalFrame.liquidacionimporSessionBean.getEsGuardarRelacionado());
					liquidacionimporBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						liquidacionimporBeanSwingJInternalFrame.actualizarEstadoPanelsLiquidacionImpor("no_relacionado");

						liquidacionimporBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(LiquidacionImporConstantesFunciones.ITAMANIOFILATABLA + (LiquidacionImporConstantesFunciones.ITAMANIOFILATABLA/2));

						liquidacionimporBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPuerto=(TitledBorder)this.jScrollPanelDatosPuerto.getBorder();
						TitledBorder titledBorderLiquidacionImpor=(TitledBorder)liquidacionimporBeanSwingJInternalFrame.jScrollPanelDatosLiquidacionImpor.getBorder();

						titledBorderLiquidacionImpor.setTitle(titledBorderPuerto.getTitle() + " -> Liquidacion Impor");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,liquidacionimporBeanSwingJInternalFrame);
						}

						liquidacionimporBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(liquidacionimporBeanSwingJInternalFrame);

						liquidacionimporBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.puertoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Liquidacion Impor",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonEmbarcadorActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Puerto puerto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPuerto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.puerto = (Puerto)this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.puerto = (Puerto)this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(puerto!=null) {
						this.puerto = puerto;
					} else {
						this.puerto = new Puerto();
					}
				}

				if(this.isTienePermisosEmbarcador && this.permiteMantenimiento(this.puerto)) {
					EmbarcadorBeanSwingJInternalFrame embarcadorBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFramePopup=new EmbarcadorBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						embarcadorBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFramePopup;
					} else {
						embarcadorBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame;
					}

					List<Puerto> puertos=new ArrayList<Puerto>();
					puertos.add(this.puerto);
					if(!esRelacionado) {
						//embarcadorBeanSwingJInternalFrame.embarcadorSessionBean.setConGuardarRelaciones(false);
						//embarcadorBeanSwingJInternalFrame.embarcadorSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					embarcadorBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPuerto.cargarEmbarcadorBeanSwingJInternalFrame(puertos,this.puerto,embarcadorBeanSwingJInternalFrame,/*conInicializar,*/embarcadorBeanSwingJInternalFrame.embarcadorSessionBean.getConGuardarRelaciones(),embarcadorBeanSwingJInternalFrame.embarcadorSessionBean.getEsGuardarRelacionado());
					embarcadorBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						embarcadorBeanSwingJInternalFrame.actualizarEstadoPanelsEmbarcador("no_relacionado");

						embarcadorBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EmbarcadorConstantesFunciones.ITAMANIOFILATABLA + (EmbarcadorConstantesFunciones.ITAMANIOFILATABLA/2));

						embarcadorBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPuerto=(TitledBorder)this.jScrollPanelDatosPuerto.getBorder();
						TitledBorder titledBorderEmbarcador=(TitledBorder)embarcadorBeanSwingJInternalFrame.jScrollPanelDatosEmbarcador.getBorder();

						titledBorderEmbarcador.setTitle(titledBorderPuerto.getTitle() + " -> Embarcador");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,embarcadorBeanSwingJInternalFrame);
						}

						embarcadorBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(embarcadorBeanSwingJInternalFrame);

						embarcadorBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.puertoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Embarcador",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPuerto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPuerto.setVisible((this.isVisibilidadCeldaNuevoPuerto && this.isPermisoNuevoPuerto));			
			this.jButtonDuplicarPuerto.setVisible((this.isVisibilidadCeldaDuplicarPuerto && this.isPermisoDuplicarPuerto));			
			this.jButtonCopiarPuerto.setVisible((this.isVisibilidadCeldaCopiarPuerto && this.isPermisoCopiarPuerto));
			this.jButtonVerFormPuerto.setVisible((this.isVisibilidadCeldaVerFormPuerto && this.isPermisoVerFormPuerto));
			
			this.jButtonAbrirOrderByPuerto.setVisible((this.isVisibilidadCeldaOrdenPuerto && this.isPermisoOrdenPuerto));			
			
			this.jButtonNuevoRelacionesPuerto.setVisible((this.isVisibilidadCeldaNuevoRelacionesPuerto && this.isPermisoNuevoPuerto));			
			this.jButtonNuevoGuardarCambiosPuerto.setVisible((this.isVisibilidadCeldaNuevoPuerto && this.isPermisoNuevoPuerto && this.isPermisoGuardarCambiosPuerto));
			
			if(this.jInternalFrameDetalleFormPuerto!=null) {
			this.jInternalFrameDetalleFormPuerto.jButtonModificarPuerto.setVisible((this.isVisibilidadCeldaModificarPuerto && this.isPermisoActualizarPuerto));	
			this.jInternalFrameDetalleFormPuerto.jButtonActualizarPuerto.setVisible((this.isVisibilidadCeldaActualizarPuerto && this.isPermisoActualizarPuerto));	
			this.jInternalFrameDetalleFormPuerto.jButtonEliminarPuerto.setVisible((this.isVisibilidadCeldaEliminarPuerto && this.isPermisoEliminarPuerto));
			this.jInternalFrameDetalleFormPuerto.jButtonCancelarPuerto.setVisible(this.isVisibilidadCeldaCancelarPuerto);							
			this.jInternalFrameDetalleFormPuerto.jButtonGuardarCambiosPuerto.setVisible((this.isVisibilidadCeldaGuardarPuerto && this.isPermisoGuardarCambiosPuerto));			
			
			}
						
			this.jButtonGuardarCambiosTablaPuerto.setVisible((this.isVisibilidadCeldaGuardarCambiosPuerto && this.isPermisoGuardarCambiosPuerto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPuerto.setVisible((this.isVisibilidadCeldaNuevoPuerto && this.isPermisoNuevoPuerto));						
			this.jButtonDuplicarToolBarPuerto.setVisible((this.isVisibilidadCeldaDuplicarPuerto && this.isPermisoDuplicarPuerto));						
			this.jButtonCopiarToolBarPuerto.setVisible((this.isVisibilidadCeldaCopiarPuerto && this.isPermisoCopiarPuerto));			
			this.jButtonVerFormToolBarPuerto.setVisible((this.isVisibilidadCeldaVerFormPuerto && this.isPermisoVerFormPuerto));			
			this.jButtonAbrirOrderByToolBarPuerto.setVisible((this.isVisibilidadCeldaOrdenPuerto && this.isPermisoOrdenPuerto));
			this.jButtonNuevoRelacionesToolBarPuerto.setVisible((this.isVisibilidadCeldaNuevoRelacionesPuerto && this.isPermisoNuevoPuerto));			
			this.jButtonNuevoGuardarCambiosToolBarPuerto.setVisible((this.isVisibilidadCeldaNuevoPuerto && this.isPermisoNuevoPuerto && this.isPermisoGuardarCambiosPuerto));			
			
			if(this.jInternalFrameDetalleFormPuerto!=null) {
			this.jInternalFrameDetalleFormPuerto.jButtonModificarToolBarPuerto.setVisible((this.isVisibilidadCeldaModificarPuerto && this.isPermisoActualizarPuerto));	
			this.jInternalFrameDetalleFormPuerto.jButtonActualizarToolBarPuerto.setVisible((this.isVisibilidadCeldaActualizarPuerto  && this.isPermisoActualizarPuerto));	
			this.jInternalFrameDetalleFormPuerto.jButtonEliminarToolBarPuerto.setVisible((this.isVisibilidadCeldaEliminarPuerto && this.isPermisoEliminarPuerto));
			this.jInternalFrameDetalleFormPuerto.jButtonCancelarToolBarPuerto.setVisible(this.isVisibilidadCeldaCancelarPuerto);				
			this.jInternalFrameDetalleFormPuerto.jButtonGuardarCambiosToolBarPuerto.setVisible((this.isVisibilidadCeldaGuardarPuerto && this.isPermisoGuardarCambiosPuerto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPuerto.setVisible((this.isVisibilidadCeldaGuardarCambiosPuerto && this.isPermisoGuardarCambiosPuerto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPuerto.setVisible((this.isVisibilidadCeldaNuevoPuerto && this.isPermisoNuevoPuerto));			
			this.jMenuItemDuplicarPuerto.setVisible((this.isVisibilidadCeldaDuplicarPuerto && this.isPermisoDuplicarPuerto));			
			this.jMenuItemCopiarPuerto.setVisible((this.isVisibilidadCeldaCopiarPuerto && this.isPermisoCopiarPuerto));			
			this.jMenuItemVerFormPuerto.setVisible((this.isVisibilidadCeldaVerFormPuerto && this.isPermisoVerFormPuerto));			
			this.jMenuItemAbrirOrderByPuerto.setVisible((this.isVisibilidadCeldaOrdenPuerto && this.isPermisoOrdenPuerto));			
			//this.jMenuItemMostrarOcultarPuerto.setVisible((this.isVisibilidadCeldaOrdenPuerto && this.isPermisoOrdenPuerto));
			this.jMenuItemDetalleAbrirOrderByPuerto.setVisible((this.isVisibilidadCeldaOrdenPuerto && this.isPermisoOrdenPuerto));			
			//this.jMenuItemDetalleMostrarOcultarPuerto.setVisible((this.isVisibilidadCeldaOrdenPuerto && this.isPermisoOrdenPuerto));			
			this.jMenuItemNuevoRelacionesPuerto.setVisible((this.isVisibilidadCeldaNuevoRelacionesPuerto && this.isPermisoNuevoPuerto));			
			this.jMenuItemNuevoGuardarCambiosPuerto.setVisible((this.isVisibilidadCeldaNuevoPuerto && this.isPermisoNuevoPuerto && this.isPermisoGuardarCambiosPuerto));									
			
			if(this.jInternalFrameDetalleFormPuerto!=null) {
			this.jInternalFrameDetalleFormPuerto.jMenuItemModificarPuerto.setVisible((this.isVisibilidadCeldaModificarPuerto && this.isPermisoActualizarPuerto));	
			this.jInternalFrameDetalleFormPuerto.jMenuItemActualizarPuerto.setVisible((this.isVisibilidadCeldaActualizarPuerto && this.isPermisoActualizarPuerto));	
			this.jInternalFrameDetalleFormPuerto.jMenuItemEliminarPuerto.setVisible((this.isVisibilidadCeldaEliminarPuerto && this.isPermisoEliminarPuerto));
			this.jInternalFrameDetalleFormPuerto.jMenuItemCancelarPuerto.setVisible(this.isVisibilidadCeldaCancelarPuerto);				
			}
			
			this.jMenuItemGuardarCambiosPuerto.setVisible((this.isVisibilidadCeldaGuardarPuerto && this.isPermisoGuardarCambiosPuerto));						
			this.jMenuItemGuardarCambiosTablaPuerto.setVisible((this.isVisibilidadCeldaGuardarCambiosPuerto && this.isPermisoGuardarCambiosPuerto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPuerto=this.jButtonNuevoPuerto.isVisible();
			this.isVisibilidadCeldaDuplicarPuerto=this.jButtonDuplicarPuerto.isVisible();
			this.isVisibilidadCeldaCopiarPuerto=this.jButtonCopiarPuerto.isVisible();
			this.isVisibilidadCeldaVerFormPuerto=this.jButtonVerFormPuerto.isVisible();
			
			this.isVisibilidadCeldaOrdenPuerto=this.jButtonAbrirOrderByPuerto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPuerto=this.jButtonNuevoRelacionesPuerto.isVisible();
			this.isVisibilidadCeldaModificarPuerto=this.jButtonModificarPuerto.isVisible();
			
			if(this.jInternalFrameDetalleFormPuerto!=null) {
			this.isVisibilidadCeldaActualizarPuerto=this.jInternalFrameDetalleFormPuerto.jButtonActualizarPuerto.isVisible();
			this.isVisibilidadCeldaEliminarPuerto=this.jInternalFrameDetalleFormPuerto.jButtonEliminarPuerto.isVisible();
			this.isVisibilidadCeldaCancelarPuerto=this.jInternalFrameDetalleFormPuerto.jButtonCancelarPuerto.isVisible();
			this.isVisibilidadCeldaGuardarPuerto=this.jInternalFrameDetalleFormPuerto.jButtonGuardarCambiosPuerto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPuerto=this.jButtonGuardarCambiosTablaPuerto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPuerto=this.jButtonNuevoToolBarPuerto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPuerto=this.jButtonNuevoRelacionesToolBarPuerto.isVisible();
			
			if(this.jInternalFrameDetalleFormPuerto!=null) {
			this.isVisibilidadCeldaModificarPuerto=this.jInternalFrameDetalleFormPuerto.jButtonModificarToolBarPuerto.isVisible();
			this.isVisibilidadCeldaActualizarPuerto=this.jInternalFrameDetalleFormPuerto.jButtonActualizarToolBarPuerto.isVisible();
			this.isVisibilidadCeldaEliminarPuerto=this.jInternalFrameDetalleFormPuerto.jButtonEliminarToolBarPuerto.isVisible();
			this.isVisibilidadCeldaCancelarPuerto=this.jInternalFrameDetalleFormPuerto.jButtonCancelarToolBarPuerto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPuerto=this.jButtonGuardarCambiosToolBarPuerto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPuerto=this.jButtonGuardarCambiosTablaToolBarPuerto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPuerto=this.jMenuItemNuevoPuerto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPuerto=this.jMenuItemNuevoRelacionesPuerto.isVisible();
			
			if(this.jInternalFrameDetalleFormPuerto!=null) {
			this.isVisibilidadCeldaModificarPuerto=this.jInternalFrameDetalleFormPuerto.jMenuItemModificarPuerto.isVisible();
			this.isVisibilidadCeldaActualizarPuerto=this.jInternalFrameDetalleFormPuerto.jMenuItemActualizarPuerto.isVisible();
			this.isVisibilidadCeldaEliminarPuerto=this.jInternalFrameDetalleFormPuerto.jMenuItemEliminarPuerto.isVisible();
			this.isVisibilidadCeldaCancelarPuerto=this.jInternalFrameDetalleFormPuerto.jMenuItemCancelarPuerto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPuerto=this.jMenuItemGuardarCambiosPuerto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPuerto=this.jMenuItemGuardarCambiosTablaPuerto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPuerto(Boolean esInicializar) {
		if(PuertoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.puertoSessionBean.getConGuardarRelaciones()) {
				//if(this.puertoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPuerto();
			}
			
			this.inicializarActualizarBindingBotonesManualPuerto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPuerto() {
		this.jButtonNuevoPuerto.setVisible(this.isPermisoNuevoPuerto);			
		this.jButtonDuplicarPuerto.setVisible(this.isPermisoDuplicarPuerto);			
		this.jButtonCopiarPuerto.setVisible(this.isPermisoCopiarPuerto);			
		this.jButtonVerFormPuerto.setVisible(this.isPermisoVerFormPuerto);			
		
		this.jButtonAbrirOrderByPuerto.setVisible(this.isPermisoOrdenPuerto);					
		
		this.jButtonNuevoRelacionesPuerto.setVisible(this.isPermisoNuevoPuerto);			
		
		if(this.jInternalFrameDetalleFormPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuerto.jButtonModificarPuerto.setVisible(this.isPermisoActualizarPuerto);	
			this.jInternalFrameDetalleFormPuerto.jButtonActualizarPuerto.setVisible(this.isPermisoActualizarPuerto);	
			this.jInternalFrameDetalleFormPuerto.jButtonEliminarPuerto.setVisible(this.isPermisoEliminarPuerto);
			this.jInternalFrameDetalleFormPuerto.jButtonCancelarPuerto.setVisible(this.isVisibilidadCeldaCancelarPuerto);						
			this.jInternalFrameDetalleFormPuerto.jButtonGuardarCambiosPuerto.setVisible(this.isPermisoGuardarCambiosPuerto);							
		}
		
		this.jButtonGuardarCambiosTablaPuerto.setVisible(this.isPermisoActualizarPuerto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePuerto() {
		this.jInternalFrameDetalleFormPuerto.jButtonModificarPuerto.setVisible(this.isPermisoActualizarPuerto);	
		this.jInternalFrameDetalleFormPuerto.jButtonActualizarPuerto.setVisible(this.isPermisoActualizarPuerto);	
		this.jInternalFrameDetalleFormPuerto.jButtonEliminarPuerto.setVisible(this.isPermisoEliminarPuerto);
		this.jInternalFrameDetalleFormPuerto.jButtonCancelarPuerto.setVisible(this.isVisibilidadCeldaCancelarPuerto);							
		this.jInternalFrameDetalleFormPuerto.jButtonGuardarCambiosPuerto.setVisible((this.isVisibilidadCeldaGuardarPuerto && this.isPermisoGuardarCambiosPuerto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPuerto() {
		if(PuertoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPuerto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPuerto() {
	}
	
	public void jTableDatosPuertoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPuerto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPuertoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPuerto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPuerto(this.getpuerto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.puerto =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.puerto =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.puerto==null) {
						this.puerto = new Puerto();
					}

					this.setVariablesFormularioToObjetoActualPuerto(this.puerto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);
				}

				if(this.puerto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.puerto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPuerto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_puertoPuertoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipopuerto=true;

			idTienePermisotipopuerto=this.tienePermisosUsuarioEnPaginaWebPuerto(TipoPuertoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipopuerto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPuerto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPuerto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPuerto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puerto =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.puerto =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPuerto(this.getpuerto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);

				this.tipopuertoBeanSwingJInternalFrame=new TipoPuertoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipopuertoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipopuertoBeanSwingJInternalFrame.getTipoPuertoLogic().setConnexion(this.puertoLogic.getConnexion());

				if(this.puerto.getid_tipo_puerto()!=null) {
					this.tipopuertoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipopuertoBeanSwingJInternalFrame.setIdActual(this.puerto.getid_tipo_puerto());
					this.tipopuertoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipopuertoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipopuertoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoPuerto();
				}

				JInternalFrameBase jinternalFrame =this.tipopuertoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPuerto=(TitledBorder)this.jScrollPanelDatosPuerto.getBorder();
				TitledBorder titledBordertipopuerto=(TitledBorder)this.tipopuertoBeanSwingJInternalFrame.jScrollPanelDatosTipoPuerto.getBorder();

				titledBordertipopuerto.setTitle(titledBorderPuerto.getTitle() + " -> Tipo Puerto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_puertoPuertoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPuerto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPuerto(this.getpuerto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.puerto =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.puerto =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.puerto==null) {
						this.puerto = new Puerto();
					}

					this.setVariablesFormularioToObjetoActualPuerto(this.puerto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);
				}

				if(this.puerto.getid_tipo_puerto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_puerto = "+this.puerto.getid_tipo_puerto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPuerto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisPuertoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebPuerto(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPuerto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPuerto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPuerto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puerto =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.puerto =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPuerto(this.getpuerto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.puertoLogic.getConnexion());

				if(this.puerto.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.puerto.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPuerto=(TitledBorder)this.jScrollPanelDatosPuerto.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderPuerto.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisPuertoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPuerto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPuerto(this.getpuerto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.puerto =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.puerto =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.puerto==null) {
						this.puerto = new Puerto();
					}

					this.setVariablesFormularioToObjetoActualPuerto(this.puerto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);
				}

				if(this.puerto.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.puerto.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPuerto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombrePuertoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPuerto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPuerto(this.getpuerto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.puerto =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.puerto =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.puerto==null) {
						this.puerto = new Puerto();
					}

					this.setVariablesFormularioToObjetoActualPuerto(this.puerto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);
				}

				if(this.puerto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.puerto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPuerto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_localPuertoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPuerto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPuerto(this.getpuerto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.puerto =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.puerto =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.puerto==null) {
						this.puerto = new Puerto();
					}

					this.setVariablesFormularioToObjetoActualPuerto(this.puerto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);
				}

				if(this.puerto.getes_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_local = "+this.puerto.getes_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPuerto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionPuertoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPuerto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPuerto(this.getpuerto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.puerto =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.puerto =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.puerto==null) {
						this.puerto = new Puerto();
					}

					this.setVariablesFormularioToObjetoActualPuerto(this.puerto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);
				}

				if(this.puerto.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.puerto.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPuerto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombrePuertoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPuerto(false,false);

			this.getPuertosBusquedaPorNombre();

			this.inicializarActualizarBindingPuerto(false);

			//if(PuertoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPuerto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisPuertoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPuerto(false,false);

			this.getPuertosFK_IdPais();

			this.inicializarActualizarBindingPuerto(false);

			//if(PuertoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPuerto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoPuertoPuertoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPuerto(false,false);

			this.getPuertosFK_IdTipoPuerto();

			this.inicializarActualizarBindingPuerto(false);

			//if(PuertoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPuerto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puertoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePuerto() {
		if(this.jInternalFrameDetalleFormPuerto!=null) {
		

		if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormPuerto!=null) {
			this.jInternalFrameDetalleFormPuerto.setVisible(false);	    			
			this.jInternalFrameDetalleFormPuerto.dispose();
			this.jInternalFrameDetalleFormPuerto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPuerto!=null) {
			this.jInternalFrameReporteDinamicoPuerto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPuerto.dispose();
			this.jInternalFrameReporteDinamicoPuerto=null;
		}
		
		if(this.jInternalFrameImportacionPuerto!=null) {
			this.jInternalFrameImportacionPuerto.setVisible(false);	    			
			this.jInternalFrameImportacionPuerto.dispose();
			this.jInternalFrameImportacionPuerto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPuerto();
			
			PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
			
			
			if(sTipo.equals("NuevoPuerto")) {
				jButtonNuevoPuertoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPuerto")) {
				jButtonDuplicarPuertoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPuerto")) {
				jButtonCopiarPuertoActionPerformed(evt);
			} else if(sTipo.equals("VerFormPuerto")) {
				jButtonVerFormPuertoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPuerto")) {
				jButtonNuevoPuertoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPuerto")) {
				jButtonDuplicarPuertoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPuerto")) {
				jButtonNuevoPuertoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPuerto")) {
				jButtonDuplicarPuertoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPuerto")) {
				jButtonNuevoPuertoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPuerto")) {
				jButtonNuevoPuertoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPuerto")) {
				jButtonNuevoPuertoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPuerto")) {
				jButtonModificarPuertoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPuerto")) {
				jButtonModificarPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPuerto")) {
				jButtonModificarPuertoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPuerto")) {
				jButtonActualizarPuertoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPuerto")) {
				jButtonActualizarPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPuerto")) {
				jButtonActualizarPuertoActionPerformed(evt);
			} else if(sTipo.equals("EliminarPuerto")) {
				jButtonEliminarPuertoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPuerto")) {
				jButtonEliminarPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPuerto")) {
				jButtonEliminarPuertoActionPerformed(evt);
			} else if(sTipo.equals("CancelarPuerto")) {
				jButtonCancelarPuertoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPuerto")) {
				jButtonCancelarPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPuerto")) {
				jButtonCancelarPuertoActionPerformed(evt);
			} else if(sTipo.equals("CerrarPuerto")) {
				jButtonCerrarPuertoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPuerto")) {
				jButtonCerrarPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPuerto")) {
				jButtonCerrarPuertoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPuerto")) {
				jButtonMostrarOcultarPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPuerto")) {
				jButtonCancelarPuertoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPuerto")) {
				jButtonGuardarCambiosPuertoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPuerto")) {
				jButtonGuardarCambiosPuertoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPuerto")) {
				jButtonCopiarPuertoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPuerto")) {
				jButtonVerFormPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPuerto")) {
				jButtonGuardarCambiosPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPuerto")) {
				jButtonCopiarPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPuerto")) {
				jButtonVerFormPuertoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPuerto")) {
				jButtonGuardarCambiosPuertoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPuerto")) {
				jButtonGuardarCambiosPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPuerto")) {
				jButtonGuardarCambiosPuertoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPuerto")) {
				jButtonRecargarInformacionPuertoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPuerto")) {
				jButtonRecargarInformacionPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPuerto")) {
				jButtonRecargarInformacionPuertoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPuerto")) {
				jButtonAnterioresPuertoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPuerto")) {
				jButtonAnterioresPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePuerto")) {
				jButtonAnterioresPuertoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPuerto")) {
				jButtonSiguientesPuertoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPuerto")) {
				jButtonSiguientesPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPuerto")) {
				jButtonSiguientesPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPuerto") || sTipo.equals("MenuItemDetalleAbrirOrderByPuerto")) {
				jButtonAbrirOrderByPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPuerto") || sTipo.equals("MenuItemDetalleMostrarOcultarPuerto")) {
				jButtonMostrarOcultarPuertoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPuerto")) {
				jButtonNuevoGuardarCambiosPuertoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPuerto")) {
				jButtonNuevoGuardarCambiosPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPuerto")) {
				jButtonNuevoGuardarCambiosPuertoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPuerto")) {
				jButtonCerrarReporteDinamicoPuertoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPuerto")) {
				jButtonGenerarReporteDinamicoPuertoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPuerto")) {
				
				jButtonGenerarExcelReporteDinamicoPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPuerto")) {
				jButtonCerrarImportacionPuertoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPuerto")) {
				
				jButtonGenerarImportacionPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPuerto")) {
				
				jButtonAbrirImportacionPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPuerto")) {
				jComboBoxTiposAccionesPuertoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPuerto")) {
				jComboBoxTiposRelacionesPuertoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPuerto")) {
				jComboBoxTiposAccionesPuertoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPuerto")) {
				
				jComboBoxTiposSeleccionarPuertoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPuerto")) {
				jTextFieldValorCampoGeneralPuertoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPuerto")) {
				jButtonAbrirOrderByPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPuerto")) {
				jButtonAbrirOrderByPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPuerto")) {
				jButtonCerrarOrderByPuertoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPuertoBusqueda")) {
				this.jButtonidPuertoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_puertoPuertoUpdate")) {
				this.jButtonid_tipo_puertoPuertoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_puertoPuertoBusqueda")) {
				this.jButtonid_tipo_puertoPuertoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisPuertoUpdate")) {
				this.jButtonid_paisPuertoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisPuertoBusqueda")) {
				this.jButtonid_paisPuertoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePuertoBusqueda")) {
				this.jButtonnombrePuertoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_localPuertoBusqueda")) {
				this.jButtones_localPuertoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPuertoBusqueda")) {
				this.jButtondescripcionPuertoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombrePuerto")) {
				this.jButtonBusquedaPorNombrePuertoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisPuerto")) {
				this.jButtonFK_IdPaisPuertoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoPuertoPuerto")) {
				this.jButtonFK_IdTipoPuertoPuertoActionPerformed(evt);
			}
			
			;
			
			
			PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPuerto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPuertoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puerto);
				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
				
				


				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Puerto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Puerto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Puerto puertoLocal=null;
			
			if(!this.getEsControlTabla()) {
				puertoLocal=this.puerto;
			} else {
				puertoLocal=this.puertoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puerto);
				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
							
				
				


				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Puerto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Puerto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuertoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPuerto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoAnterior =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puertoAnterior =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
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
			
			PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
			
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
			
			


			
			PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPuertoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puerto);
				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
								
						
				


				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Puerto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Puerto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puerto);
				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
								
				
				


				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Puerto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Puerto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuertoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPuerto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoAnterior =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puertoAnterior =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puerto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuertoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPuerto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoAnterior =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puertoAnterior =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuertoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.puerto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.puerto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puerto);
				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
							
				
				


				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Puerto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Puerto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPuertoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPuerto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.puertoAnterior =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.puertoAnterior =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
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
			
			PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
			
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
			
			


			
			PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuertoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.puerto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.puerto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puerto);
				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
								
				
				


				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Puerto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Puerto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuertoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPuerto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoAnterior =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puertoAnterior =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuertoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.puerto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.puerto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPuertoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puerto);
				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPuerto")) {
					jCheckBoxSeleccionarTodosPuertoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPuerto")) {
					jCheckBoxSeleccionadosPuertoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPuerto")) {
					
				}
				
				


				
				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Puerto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Puerto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.puerto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.puerto);
				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
												
				
				


				
				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Puerto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Puerto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPuertoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPuerto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.puertoAnterior =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.puertoAnterior =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPuertoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puerto);
				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
				
				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
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
			
			PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
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
			
			


			
			PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPuertoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puerto);
				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Puerto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Puerto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puerto);
				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
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
				
				


				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Puerto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Puerto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuertoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPuerto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puertoAnterior =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puertoAnterior =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPuerto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPuertoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPuerto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.puerto =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.puerto =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.puerto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPuerto")) {
				
				}
				
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPuerto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPuerto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPuerto")) {
			
			}
			
			PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPuerto();
			
			PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
			
			if(sTipo.equals("NuevoPuerto")) {
				jButtonNuevoPuertoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPuerto")) {
				jButtonDuplicarPuertoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPuerto")) {
				jButtonCopiarPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPuerto")) {
				jButtonVerFormPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPuerto")) {
				jButtonNuevoPuertoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPuerto")) {
				jButtonModificarPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPuerto")) {
				jButtonActualizarPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPuerto")) {
				jButtonEliminarPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPuerto")) {
				jButtonGuardarCambiosPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPuerto")) {
				jButtonCancelarPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPuerto")) {
				jButtonCerrarPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPuerto")) {
				jButtonGuardarCambiosPuertoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPuerto")) {
				jButtonNuevoGuardarCambiosPuertoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPuerto")) {
				jButtonAbrirOrderByPuertoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPuerto")) {
				jButtonRecargarInformacionPuertoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPuerto")) {
				jButtonAnterioresPuertoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPuerto")) {
				jButtonSiguientesPuertoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPuertoBusqueda")) {
				this.jButtonidPuertoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_puertoPuertoUpdate")) {
				this.jButtonid_tipo_puertoPuertoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_puertoPuertoBusqueda")) {
				this.jButtonid_tipo_puertoPuertoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisPuertoUpdate")) {
				this.jButtonid_paisPuertoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisPuertoBusqueda")) {
				this.jButtonid_paisPuertoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePuertoBusqueda")) {
				this.jButtonnombrePuertoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_localPuertoBusqueda")) {
				this.jButtones_localPuertoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPuertoBusqueda")) {
				this.jButtondescripcionPuertoBusquedaActionPerformed(evt);
			}
			
			PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPuerto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePuerto")) {
				closingInternalFramePuerto();
				
			} else if(sTipo.equals("jButtonCancelarPuerto")) {
				JInternalFrameBase jInternalFrameDetalleFormPuerto = (JInternalFrameBase)evt.getSource();
	            	
	            PuertoBeanSwingJInternalFrame jInternalFrameParent=(PuertoBeanSwingJInternalFrame)jInternalFrameDetalleFormPuerto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPuertoActionPerformed(null);
			}
			
			PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.puerto,new Object(),this.puertoParameterGeneral,this.puertoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPuerto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPuerto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPuerto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.puerto)) {
			if(!esControlTabla) {
				if(PuertoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPuerto(this.puerto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);			
				}
				
				if(this.puertoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPuerto(this.puerto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.puertoReturnGeneral=puertoLogic.procesarEventosPuertosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.puertoLogic.getPuertos(),this.puerto,this.puertoParameterGeneral,this.isEsNuevoPuerto,classes);//this.puertoLogic.getPuerto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPuerto(this.puertoReturnGeneral,this.puertoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.puertoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPuerto(classes,this.puertoReturnGeneral,this.puertoBean,false);
					}
						
					if(this.puertoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPuerto(this.puertoReturnGeneral.getPuerto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPuerto(this.puertoReturnGeneral.getPuerto());	
					}
						
					if(this.puertoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPuerto(this.puertoReturnGeneral.getPuerto(),classes);//this.puertoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPuerto(this.puerto,classes);//this.puertoBean);									
				}
			
				if(PuertoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPuerto(this.puerto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPuerto(this.puerto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.puertoAnterior!=null) {
						this.puerto=this.puertoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.puertoReturnGeneral=puertoLogic.procesarEventosPuertosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.puertoLogic.getPuertos(),this.puerto,this.puertoParameterGeneral,this.isEsNuevoPuerto,classes);//this.puertoLogic.getPuerto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.puertoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.puertoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.puertoReturnGeneral.getPuerto(),puertoLogic.getPuertos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.puertoReturnGeneral.getPuerto(),this.puertos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPuerto.repaint();
				
				//((AbstractTableModel) this.jTableDatosPuerto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPuerto();
			}
		}
	}
	
	public void actualizarVisualTableDatosPuerto() throws Exception {
		
		PuertoModel puertoModel=(PuertoModel)this.jTableDatosPuerto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			puertoModel.puertos=this.puertoLogic.getPuertos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			puertoModel.puertos=this.puertos;
		}
		
		
		((PuertoModel) this.jTableDatosPuerto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPuerto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpuertoAnterior(),this.puertoLogic.getPuertos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpuertoAnterior(),this.puertos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPuerto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPuerto(Puerto puerto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoCompraImpor.class)) {
					this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.setPedidoCompraImpors(puerto.getPedidoCompraImpors());
					this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoCompraImpor(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(LiquidacionImpor.class)) {
					this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporLogic.setLiquidacionImpors(puerto.getLiquidacionImpors());
					this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaLiquidacionImpor(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Embarcador.class)) {
					this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorLogic.setEmbarcadors(puerto.getEmbarcadors());
					this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmbarcador(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
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
										
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.puerto,new Object(),generalEntityParameterGeneral,this.puertoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.puertoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PuertoConstantesFunciones.getClassesRelationshipsOfPuerto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PuertoConstantesFunciones.getClassesRelationshipsFromStringsOfPuerto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPuerto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.puerto,new Object(),generalEntityParameterGeneral,this.puertoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPuerto(PuertoBean puertoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoCompraImpor.class)) {
					this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.setPedidoCompraImpors(puerto.getPedidoCompraImpors());
					this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoCompraImpor(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(LiquidacionImpor.class)) {
					this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporLogic.setLiquidacionImpors(puerto.getLiquidacionImpors());
					this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaLiquidacionImpor(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Embarcador.class)) {
					this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorLogic.setEmbarcadors(puerto.getEmbarcadors());
					this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmbarcador(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPuerto(ArrayList<Classe> classes,PuertoReturnGeneral puertoReturnGeneral,PuertoBean puertoBean,Boolean conDefault) throws Exception {
		
			this.puertoBean.setPedidoCompraImpors(puertoReturnGeneral.getPuerto().getPedidoCompraImpors());
			this.puertoBean.setLiquidacionImpors(puertoReturnGeneral.getPuerto().getLiquidacionImpors());
			this.puertoBean.setEmbarcadors(puertoReturnGeneral.getPuerto().getEmbarcadors());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPuerto(Puerto puerto,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoCompraImpor.class)) {
					puerto.setPedidoCompraImpors(this.jInternalFrameDetalleFormPuerto.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(LiquidacionImpor.class)) {
					puerto.setLiquidacionImpors(this.jInternalFrameDetalleFormPuerto.liquidacionimporBeanSwingJInternalFrame.liquidacionimporLogic.getLiquidacionImpors());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Embarcador.class)) {
					puerto.setEmbarcadors(this.jInternalFrameDetalleFormPuerto.embarcadorBeanSwingJInternalFrame.embarcadorLogic.getEmbarcadors());
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
		if(!paraTabla && !this.permiteMantenimiento(this.puerto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPuerto = new PuertoDetalleFormJInternalFrame(jDesktopPane,this.puertoSessionBean.getConGuardarRelaciones(),this.puertoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPuerto);
		this.jInternalFrameDetalleFormPuerto.setVisible(false);
		this.jInternalFrameDetalleFormPuerto.setSelected(false);						
		
		this.jInternalFrameDetalleFormPuerto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPuerto.puertoLogic=this.puertoLogic;
		
		this.cargarCombosFrameForeignKeyPuerto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePuerto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePuerto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPuerto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPuerto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPuerto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPuerto"));
		
		this.jInternalFrameDetalleFormPuerto.jButtonModificarPuerto.addActionListener(new ButtonActionListener(this,"ModificarPuerto"));

		
		this.jInternalFrameDetalleFormPuerto.jButtonModificarToolBarPuerto.addActionListener(new ButtonActionListener(this,"ModificarToolBarPuerto"));
					
		this.jInternalFrameDetalleFormPuerto.jMenuItemModificarPuerto.addActionListener(new ButtonActionListener(this,"MenuItemModificarPuerto"));		
		
		
		
		this.jInternalFrameDetalleFormPuerto.jButtonActualizarPuerto.addActionListener (new ButtonActionListener(this,"ActualizarPuerto"));
		
		
		this.jInternalFrameDetalleFormPuerto.jButtonActualizarToolBarPuerto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPuerto"));
						
		this.jInternalFrameDetalleFormPuerto.jMenuItemActualizarPuerto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPuerto"));		
		
		
		
		this.jInternalFrameDetalleFormPuerto.jButtonEliminarPuerto.addActionListener (new ButtonActionListener(this,"EliminarPuerto"));
		
		
		this.jInternalFrameDetalleFormPuerto.jButtonEliminarToolBarPuerto.addActionListener (new ButtonActionListener(this,"EliminarToolBarPuerto"));
								
		this.jInternalFrameDetalleFormPuerto.jMenuItemEliminarPuerto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPuerto"));		
		
		
		
		this.jInternalFrameDetalleFormPuerto.jButtonCancelarPuerto.addActionListener (new ButtonActionListener(this,"CancelarPuerto"));
		
		
		this.jInternalFrameDetalleFormPuerto.jButtonCancelarToolBarPuerto.addActionListener (new ButtonActionListener(this,"CancelarToolBarPuerto"));
					
		this.jInternalFrameDetalleFormPuerto.jMenuItemCancelarPuerto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPuerto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPuerto.jMenuItemDetalleCerrarPuerto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPuerto"));		
		
		
		
		this.jInternalFrameDetalleFormPuerto.jButtonGuardarCambiosToolBarPuerto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPuerto"));
		
		
		
		this.jInternalFrameDetalleFormPuerto.jButtonGuardarCambiosToolBarPuerto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPuerto"));
		
		
		
		this.jInternalFrameDetalleFormPuerto.jComboBoxTiposAccionesFormularioPuerto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPuerto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuerto.jButtonidPuertoBusqueda.addActionListener(new ButtonActionListener(this,"idPuertoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPuerto.jButtonid_tipo_puertoPuertoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_puertoPuertoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuerto.jButtonid_tipo_puertoPuertoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_puertoPuertoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPuerto.jButtonid_paisPuertoUpdate.addActionListener(new ButtonActionListener(this,"id_paisPuertoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuerto.jButtonid_paisPuertoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisPuertoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuerto.jButtonnombrePuertoBusqueda.addActionListener(new ButtonActionListener(this,"nombrePuertoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuerto.jButtones_localPuertoBusqueda.addActionListener(new ButtonActionListener(this,"es_localPuertoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuerto.jButtondescripcionPuertoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPuertoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPuerto.jTabbedPaneRelacionesPuerto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPuerto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePuerto"));
		
		if(this.jInternalFrameDetalleFormPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuerto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPuerto"));
		}
		
		this.jTableDatosPuerto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPuerto"));
		
		this.jTableDatosPuerto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPuerto"));
		
		this.jButtonNuevoPuerto.addActionListener(new ButtonActionListener(this,"NuevoPuerto"));
		
		this.jButtonDuplicarPuerto.addActionListener(new ButtonActionListener(this,"DuplicarPuerto"));
		
		this.jButtonCopiarPuerto.addActionListener(new ButtonActionListener(this,"CopiarPuerto"));
		
		this.jButtonVerFormPuerto.addActionListener(new ButtonActionListener(this,"VerFormPuerto"));
		
		
		this.jButtonNuevoToolBarPuerto.addActionListener(new ButtonActionListener(this,"NuevoToolBarPuerto"));
			
		this.jButtonDuplicarToolBarPuerto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPuerto"));
			
		this.jMenuItemNuevoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPuerto"));
			
		this.jMenuItemDuplicarPuerto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPuerto"));		
		
		
		this.jButtonNuevoRelacionesPuerto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPuerto"));
		
		
		this.jButtonNuevoRelacionesToolBarPuerto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPuerto"));
			
		this.jMenuItemNuevoRelacionesPuerto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPuerto"));		
		
		
		if(this.jInternalFrameDetalleFormPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuerto.jButtonModificarPuerto.addActionListener(new ButtonActionListener(this,"ModificarPuerto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuerto.jButtonModificarToolBarPuerto.addActionListener(new ButtonActionListener(this,"ModificarToolBarPuerto"));
			
			this.jInternalFrameDetalleFormPuerto.jMenuItemModificarPuerto.addActionListener(new ButtonActionListener(this,"MenuItemModificarPuerto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPuerto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPuerto.jButtonActualizarPuerto.addActionListener (new ButtonActionListener(this,"ActualizarPuerto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuerto.jButtonActualizarToolBarPuerto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPuerto"));
				
			this.jInternalFrameDetalleFormPuerto.jMenuItemActualizarPuerto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPuerto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuerto.jButtonEliminarPuerto.addActionListener (new ButtonActionListener(this,"EliminarPuerto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuerto.jButtonEliminarToolBarPuerto.addActionListener (new ButtonActionListener(this,"EliminarToolBarPuerto"));
						
			this.jInternalFrameDetalleFormPuerto.jMenuItemEliminarPuerto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPuerto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuerto.jButtonCancelarPuerto.addActionListener (new ButtonActionListener(this,"CancelarPuerto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuerto.jButtonCancelarToolBarPuerto.addActionListener (new ButtonActionListener(this,"CancelarToolBarPuerto"));
			
			this.jInternalFrameDetalleFormPuerto.jMenuItemCancelarPuerto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPuerto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPuerto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPuerto"));		
		
		
		this.jButtonCerrarPuerto.addActionListener (new ButtonActionListener(this,"CerrarPuerto"));
		
		
		this.jButtonCerrarToolBarPuerto.addActionListener (new ButtonActionListener(this,"CerrarToolBarPuerto"));
			
		this.jMenuItemCerrarPuerto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPuerto"));
			
		if(this.jInternalFrameDetalleFormPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuerto.jMenuItemDetalleCerrarPuerto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPuerto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuerto.jButtonGuardarCambiosPuerto.addActionListener (new ButtonActionListener(this,"GuardarCambiosPuerto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuerto.jButtonGuardarCambiosToolBarPuerto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPuerto"));
		}
		
		this.jButtonCopiarToolBarPuerto.addActionListener (new ButtonActionListener(this,"CopiarToolBarPuerto"));
			
		this.jButtonVerFormToolBarPuerto.addActionListener (new ButtonActionListener(this,"VerFormToolBarPuerto"));
		
		this.jMenuItemGuardarCambiosPuerto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPuerto"));
			
		this.jMenuItemCopiarPuerto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPuerto"));		
		
		this.jMenuItemVerFormPuerto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPuerto"));		
		
		
		this.jButtonGuardarCambiosTablaPuerto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPuerto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPuerto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPuerto"));
			
		this.jMenuItemGuardarCambiosTablaPuerto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPuerto"));		
		
		
		
		this.jButtonRecargarInformacionPuerto.addActionListener (new ButtonActionListener(this,"RecargarInformacionPuerto"));
					
		this.jButtonRecargarInformacionToolBarPuerto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPuerto"));
		
		this.jMenuItemRecargarInformacionPuerto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPuerto"));		
		
		
		
		this.jButtonAnterioresPuerto.addActionListener (new ButtonActionListener(this,"AnterioresPuerto"));
		
		
		this.jButtonAnterioresToolBarPuerto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPuerto"));
		
		this.jMenuItemAnterioresPuerto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPuerto"));		
		
		
		this.jButtonSiguientesPuerto.addActionListener (new ButtonActionListener(this,"SiguientesPuerto"));
		
		
		this.jButtonSiguientesToolBarPuerto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPuerto"));
			
		this.jMenuItemSiguientesPuerto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPuerto"));
			
		this.jMenuItemAbrirOrderByPuerto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPuerto"));
			
		this.jMenuItemMostrarOcultarPuerto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPuerto"));
			
		this.jMenuItemDetalleAbrirOrderByPuerto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPuerto"));
			
		this.jMenuItemDetalleMostarOcultarPuerto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPuerto"));		
		
		
		this.jButtonNuevoGuardarCambiosPuerto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPuerto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPuerto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPuerto"));
			
		this.jMenuItemNuevoGuardarCambiosPuerto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPuerto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPuerto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPuerto"));

		this.jCheckBoxSeleccionadosPuerto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPuerto"));
		
		if(this.jInternalFrameDetalleFormPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuerto.jComboBoxTiposAccionesFormularioPuerto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPuerto"));
		}
		
		
		this.jComboBoxTiposRelacionesPuerto.addActionListener (new ButtonActionListener(this,"TiposRelacionesPuerto"));
			
		this.jComboBoxTiposAccionesPuerto.addActionListener (new ButtonActionListener(this,"TiposAccionesPuerto"));
					
		this.jComboBoxTiposSeleccionarPuerto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPuerto"));
			
		this.jTextFieldValorCampoGeneralPuerto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPuerto"));		
		
		
		if(this.jInternalFrameDetalleFormPuerto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuerto.jButtonidPuertoBusqueda.addActionListener(new ButtonActionListener(this,"idPuertoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPuerto.jButtonid_tipo_puertoPuertoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_puertoPuertoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuerto.jButtonid_tipo_puertoPuertoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_puertoPuertoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPuerto.jButtonid_paisPuertoUpdate.addActionListener(new ButtonActionListener(this,"id_paisPuertoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuerto.jButtonid_paisPuertoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisPuertoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuerto.jButtonnombrePuertoBusqueda.addActionListener(new ButtonActionListener(this,"nombrePuertoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuerto.jButtones_localPuertoBusqueda.addActionListener(new ButtonActionListener(this,"es_localPuertoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuerto.jButtondescripcionPuertoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPuertoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombrePuerto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombrePuerto"));

			this.jButtonFK_IdPaisPuerto.addActionListener(new ButtonActionListener(this,"FK_IdPaisPuerto"));

			this.jButtonFK_IdTipoPuertoPuerto.addActionListener(new ButtonActionListener(this,"FK_IdTipoPuertoPuerto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPuerto!=null) {
				this.jInternalFrameReporteDinamicoPuerto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPuerto"));
				this.jInternalFrameReporteDinamicoPuerto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPuerto"));
				this.jInternalFrameReporteDinamicoPuerto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPuerto"));
			}
			
			//this.jButtonCerrarReporteDinamicoPuerto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPuerto"));				
			//this.jButtonGenerarReporteDinamicoPuerto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPuerto"));
			//this.jButtonGenerarExcelReporteDinamicoPuerto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPuerto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPuerto!=null) {
				this.jInternalFrameImportacionPuerto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPuerto"));
				this.jInternalFrameImportacionPuerto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPuerto"));
				this.jInternalFrameImportacionPuerto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPuerto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPuerto.addActionListener (new ButtonActionListener(this,"AbrirOrderByPuerto"));
			
			this.jButtonAbrirOrderByToolBarPuerto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPuerto"));			
			
			if(this.jInternalFrameOrderByPuerto!=null) {
				this.jInternalFrameOrderByPuerto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPuerto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPuerto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuerto.jTabbedPaneRelacionesPuerto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPuerto"));
		
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
            		closingInternalFramePuerto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPuerto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPuerto = (JInternalFrameBase)event.getSource();
	            	
	            PuertoBeanSwingJInternalFrame jInternalFrameParent=(PuertoBeanSwingJInternalFrame)jInternalFrameDetalleFormPuerto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPuertoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPuerto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPuertoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPuerto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPuerto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPuertoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPuertoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPuertoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPuerto";
		inputMap = this.jButtonNuevoPuerto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPuerto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPuertoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPuertoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPuertoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPuertoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPuerto";
		inputMap = this.jButtonNuevoRelacionesPuerto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPuerto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPuertoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPuerto";
		inputMap = this.jButtonModificarPuerto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPuerto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPuertoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPuerto";
		inputMap = this.jButtonActualizarPuerto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPuerto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPuertoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPuerto";
		inputMap = this.jButtonEliminarPuerto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPuerto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPuertoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPuerto";
		inputMap = this.jButtonCancelarPuerto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPuerto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPuertoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPuerto";
		inputMap = this.jButtonCerrarPuerto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPuerto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPuertoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPuerto.jButtonGuardarCambiosPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPuerto";
		inputMap = this.jInternalFrameDetalleFormPuerto.jButtonGuardarCambiosPuerto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPuerto.jButtonGuardarCambiosPuerto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPuertoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPuerto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPuertoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPuerto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPuertoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPuerto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPuertoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPuerto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPuertoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuerto.jButtonidPuertoBusqueda.addActionListener(new ButtonActionListener(this,"idPuertoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPuerto.jButtonid_tipo_puertoPuertoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_puertoPuertoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuerto.jButtonid_tipo_puertoPuertoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_puertoPuertoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPuerto.jButtonid_paisPuertoUpdate.addActionListener(new ButtonActionListener(this,"id_paisPuertoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuerto.jButtonid_paisPuertoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisPuertoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuerto.jButtonnombrePuertoBusqueda.addActionListener(new ButtonActionListener(this,"nombrePuertoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuerto.jButtones_localPuertoBusqueda.addActionListener(new ButtonActionListener(this,"es_localPuertoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuerto.jButtondescripcionPuertoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPuertoBusqueda"));
		
		
		this.jButtonBusquedaPorNombrePuerto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombrePuerto"));

		this.jButtonFK_IdPaisPuerto.addActionListener(new ButtonActionListener(this,"FK_IdPaisPuerto"));

		this.jButtonFK_IdTipoPuertoPuerto.addActionListener(new ButtonActionListener(this,"FK_IdTipoPuertoPuerto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPuertoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPuerto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPuerto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Puerto puertoAux:this.puertoLogic.getPuertos()) {
					puertoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Puerto puertoAux:puertos) {
					puertoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPuertoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPuerto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Puerto puertoAux:this.puertoLogic.getPuertos()) {
						puertoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Puerto puertoAux:puertos) {
						puertoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Puerto puertoAux:this.puertoLogic.getPuertos()) {
					
						if(sTipoSeleccionar.equals(PuertoConstantesFunciones.LABEL_ESLOCAL)) {
							existe=true;
							puertoAux.setes_local(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Puerto puertoAux:puertos) {
						
						if(sTipoSeleccionar.equals(PuertoConstantesFunciones.LABEL_ESLOCAL)) {
							existe=true;
							puertoAux.setes_local(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPuerto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPuerto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPuerto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPuerto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPuertoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPuerto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPuerto.getSelectedRows();
			
			Puerto puertoLocal=new Puerto();
			
			//this.seleccionarTodosPuerto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					puertoLocal =(Puerto) this.puertoLogic.getPuertos().toArray()[this.jTableDatosPuerto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					puertoLocal =(Puerto) this.puertos.toArray()[this.jTableDatosPuerto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				puertoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Puerto puertoAux:this.puertoLogic.getPuertos()) {
						puertoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Puerto puertoAux:puertos) {
						puertoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPuerto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPuerto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPuerto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPuerto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPuertoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPuertoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPuertoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPuerto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPuerto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Puerto puertoAux:this.puertoLogic.getPuertos()) {
				
						if(sTipoSeleccionar.equals(PuertoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							puertoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PuertoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							puertoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Puerto puertoAux:puertos) {
					
						if(sTipoSeleccionar.equals(PuertoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							puertoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PuertoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							puertoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPuerto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPuertoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPuerto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPuerto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPuerto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPuerto.jComboBoxTiposAccionesFormularioPuerto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePuerto) {				
					conSplash=true;//false;										
					
					//this.startProcessPuerto(conSplash);
				
					this.generarReportePuertosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPuerto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPuerto.jComboBoxTiposAccionesFormularioPuerto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPuertosSeleccionados();
				//this.jComboBoxTiposAccionesPuerto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPuertosSeleccionados(false);
				//this.jComboBoxTiposAccionesPuerto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPuertosSeleccionados(true);
				//this.jComboBoxTiposAccionesPuerto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPuerto();
				
				this.exportarPuertosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPuerto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPuerto.jComboBoxTiposAccionesFormularioPuerto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPuertos();
				//this.importarPuertos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPuerto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPuerto.jComboBoxTiposAccionesFormularioPuerto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPuerto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPuertosSeleccionados();
				//this.jComboBoxTiposAccionesPuerto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Puerto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPuerto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPuerto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPuerto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Puerto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPuerto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPuerto.jComboBoxTiposAccionesFormularioPuerto.setSelectedIndex(0);					
				}	
			} 			
			else if(PuertoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePuerto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPuerto(conSplash);
					
						//this.actualizarParametrosGeneralPuerto();
						
						this.generarReporteProcesoAccionPuertosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPuerto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPuerto.jComboBoxTiposAccionesFormularioPuerto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PuertoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO PuertoES SELECCIONADOS?", "MANTENIMIENTO DE Puerto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPuerto();
				
						this.actualizarParametrosGeneralPuerto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.puertoReturnGeneral=puertoLogic.procesarAccionPuertosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.puertoLogic.getPuertos(),this.puertoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPuertoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPuerto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPuerto.jComboBoxTiposAccionesFormularioPuerto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPuerto();
					
					PuertoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPuertoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPuerto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPuerto.jComboBoxTiposAccionesFormularioPuerto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPuerto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPuertoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPuerto();
			
			if(this.jInternalFrameDetalleFormPuerto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Puerto> puertosSeleccionados=new ArrayList<Puerto>();		
			Puerto puerto=new Puerto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPuerto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPuerto.getSelectedItem();
			
			
			
			
			puertosSeleccionados=this.getPuertosSeleccionados(true);
			//this.sTipoAccion;
			
			if(puertosSeleccionados.size()==1) {
				for(Puerto puertoAux:puertosSeleccionados) {
					puerto=puertoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Pedido Compra")) {
					jButtonPedidoCompraImporActionPerformed(null,rowIndex,true,false,puerto);
				}
				else if(this.sTipoRelacion.equals("Liquidacion Impor")) {
					jButtonLiquidacionImporActionPerformed(null,rowIndex,true,false,puerto);
				}
				else if(this.sTipoRelacion.equals("Embarcador")) {
					jButtonEmbarcadorActionPerformed(null,rowIndex,true,false,puerto);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPuerto();
			
      		//this.finishProcessPuerto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPuertoReturnGeneral() throws Exception {
		if(this.puertoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.puertoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.puertoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.puertoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.puertoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.puertoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPuerto(false);
		}
		
		if(this.puertoReturnGeneral.getConRetornoLista() || this.puertoReturnGeneral.getConRetornoObjeto()) {
			if(this.puertoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.puertoLogic.setPuertos(this.puertoReturnGeneral.getPuertos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.puertoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.puertoLogic.setPuerto(this.puertoReturnGeneral.getPuerto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPuerto(false);
		}
	}
	
	public void actualizarParametrosGeneralPuerto() throws Exception {
		
		
	}
	
	public ArrayList<Puerto> getPuertosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Puerto> puertosSeleccionados=new ArrayList<Puerto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPuerto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Puerto puertoAux:puertoLogic.getPuertos()) {
					if(puertoAux.getIsSelected()) {
						puertosSeleccionados.add(puertoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Puerto puertoAux:this.puertos) {
					if(puertoAux.getIsSelected()) {
						puertosSeleccionados.add(puertoAux);				
					}
				}
			}
			
			if(puertosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						puertosSeleccionados.addAll(this.puertoLogic.getPuertos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						puertosSeleccionados.addAll(this.puertos);				
					}
				}
			}
		} else {
			puertosSeleccionados.add(this.puerto);
		}
		
		return puertosSeleccionados;
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
	
	public void generarReportePuertosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPuertosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPuertosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPuertosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPuertosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesPuertosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Puerto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPuertosSeleccionados() throws Exception {
		ArrayList<Puerto> puertosSeleccionados=new ArrayList<Puerto>();		
		
		puertosSeleccionados=this.getPuertosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePuertos("Todos",puertosSeleccionados);
		
	}	
	
	public void generarReporteNormalPuertosSeleccionados() throws Exception {
		ArrayList<Puerto> puertosSeleccionados=new ArrayList<Puerto>();		
		
		puertosSeleccionados=this.getPuertosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePuertos("Todos",puertosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPuertosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Puerto> puertosSeleccionados=new ArrayList<Puerto>();
		
		puertosSeleccionados=this.getPuertosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePuertos("Todos",puertosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPuertosSeleccionados() throws Exception {
		ArrayList<Puerto> puertosSeleccionados=new ArrayList<Puerto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPuerto();
		
		
		puertosSeleccionados=this.getPuertosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPuerto();
		
		
		//this.generarReportePuertos("Todos",puertosSeleccionados ,puertoImplementable,puertoImplementableHome);
	}
	
	public void mostrarImportacionPuertos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPuerto();
		
		this.abrirFrameImportacionPuerto();		
		
			
		//this.generarReportePuertos("Todos",puertosSeleccionados ,puertoImplementable,puertoImplementableHome);
	}
	
	public void importarPuertos() throws Exception {		
	
	}
	
	public void exportarPuertosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPuertosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPuertosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPuertosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Puerto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPuertosSeleccionados() throws Exception {
		ArrayList<Puerto> puertosSeleccionados=new ArrayList<Puerto>();		
		
		puertosSeleccionados=this.getPuertosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"puerto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPuerto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Puerto puertoAux:puertosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPuerto(puertoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//puertoAux.setsDetalleGeneralEntityReporte(puertoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puertoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Puerto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPuerto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PuertoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PuertoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PuertoConstantesFunciones.LABEL_IDTIPOPUERTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PuertoConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PuertoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PuertoConstantesFunciones.LABEL_ESLOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PuertoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPuerto(Puerto puerto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=puerto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=puerto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=puerto.gettipopuerto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=puerto.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=puerto.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=puerto.getes_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=puerto.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPuertosSeleccionados() throws Exception {
		ArrayList<Puerto> puertosSeleccionados=new ArrayList<Puerto>();		
		
		puertosSeleccionados=this.getPuertosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"puerto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Puertos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPuerto(row);				
				iRow++;
			}				
			
			for(Puerto puertoAux:puertosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPuerto(puertoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puertoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Puerto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPuertosSeleccionados() throws Exception {
		ArrayList<Puerto> puertosSeleccionados=new ArrayList<Puerto>();		
		
		puertosSeleccionados=this.getPuertosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"puerto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("puertos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("puerto");
			//elementRoot.appendChild(element);
		
			for(Puerto puertoAux:puertosSeleccionados) {
				element = document.createElement("puerto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPuerto(puertoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puertoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Puerto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPuerto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PuertoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PuertoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PuertoConstantesFunciones.LABEL_IDTIPOPUERTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PuertoConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(PuertoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(PuertoConstantesFunciones.LABEL_ESLOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PuertoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPuerto(Puerto puerto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(puerto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(puerto.gettipopuerto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(puerto.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(puerto.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(puerto.getes_local());
		cell = row.createCell(iColumn++);cell.setCellValue(puerto.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlPuerto(Puerto puerto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PuertoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(puerto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PuertoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(puerto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementtipopuerto_descripcion = document.createElement(PuertoConstantesFunciones.IDTIPOPUERTO);
		elementtipopuerto_descripcion.appendChild(document.createTextNode(puerto.gettipopuerto_descripcion()));
		element.appendChild(elementtipopuerto_descripcion);

		Element elementpais_descripcion = document.createElement(PuertoConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(puerto.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementnombre = document.createElement(PuertoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(puerto.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementes_local = document.createElement(PuertoConstantesFunciones.ESLOCAL);
		elementes_local.appendChild(document.createTextNode(puerto.getes_local().toString().trim()));
		element.appendChild(elementes_local);

		Element elementdescripcion = document.createElement(PuertoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(puerto.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoPuertosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Puerto> puertosSeleccionados=new ArrayList<Puerto>();
		
		puertosSeleccionados=this.getPuertosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPuerto(puertosSeleccionados);
		
		this.generarReportePuertos("Todos",puertosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPuerto(ArrayList<Puerto> puertosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Puerto puertoAux:puertosSeleccionados) {
				puertoAux.setsDetalleGeneralEntityReporte(puertoAux.toString());
			
				if(sTipoSeleccionar.equals(PuertoConstantesFunciones.LABEL_IDTIPOPUERTO)) {
					existe=true;
					puertoAux.setsDescripcionGeneralEntityReporte1(puertoAux.gettipopuerto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PuertoConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					puertoAux.setsDescripcionGeneralEntityReporte1(puertoAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PuertoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					puertoAux.setsDescripcionGeneralEntityReporte1(puertoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(PuertoConstantesFunciones.LABEL_ESLOCAL)) {
					existe=true;
					puertoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(puertoAux.getes_local()));
				}
				 else if(sTipoSeleccionar.equals(PuertoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					puertoAux.setsDescripcionGeneralEntityReporte1(puertoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPuerto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPuerto=true;
				this.isVisibilidadCeldaNuevoRelacionesPuerto=true;
				this.isVisibilidadCeldaGuardarCambiosPuerto=true;
			}
			
			this.isVisibilidadCeldaModificarPuerto=false;
			this.isVisibilidadCeldaActualizarPuerto=false;
			this.isVisibilidadCeldaEliminarPuerto=false;
			this.isVisibilidadCeldaCancelarPuerto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPuerto=true;
				} else {
					this.isVisibilidadCeldaGuardarPuerto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPuerto=false;
			this.isVisibilidadCeldaNuevoRelacionesPuerto=false;
			this.isVisibilidadCeldaGuardarCambiosPuerto=false;
			this.isVisibilidadCeldaModificarPuerto=false;
			this.isVisibilidadCeldaActualizarPuerto=true;
			this.isVisibilidadCeldaEliminarPuerto=false;
			this.isVisibilidadCeldaCancelarPuerto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPuerto=true;
				} else {
					this.isVisibilidadCeldaGuardarPuerto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPuerto=false;
			this.isVisibilidadCeldaNuevoRelacionesPuerto=false;
			this.isVisibilidadCeldaGuardarCambiosPuerto=false;
			this.isVisibilidadCeldaModificarPuerto=false;
			this.isVisibilidadCeldaActualizarPuerto=true;
			this.isVisibilidadCeldaEliminarPuerto=true;
			this.isVisibilidadCeldaCancelarPuerto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPuerto=true;
				} else {
					this.isVisibilidadCeldaGuardarPuerto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPuerto=false;
			this.isVisibilidadCeldaNuevoRelacionesPuerto=false;
			this.isVisibilidadCeldaGuardarCambiosPuerto=false;
			this.isVisibilidadCeldaModificarPuerto=false;
			this.isVisibilidadCeldaActualizarPuerto=true;
			this.isVisibilidadCeldaEliminarPuerto=false;
			this.isVisibilidadCeldaCancelarPuerto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPuerto=false;
				} else {
					this.isVisibilidadCeldaGuardarPuerto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPuerto=true;
			this.isVisibilidadCeldaNuevoRelacionesPuerto=true;
			this.isVisibilidadCeldaGuardarCambiosPuerto=true;
			this.isVisibilidadCeldaModificarPuerto=false;
			this.isVisibilidadCeldaActualizarPuerto=false;
			this.isVisibilidadCeldaEliminarPuerto=false;
			this.isVisibilidadCeldaCancelarPuerto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPuerto=true;
				} else {
					this.isVisibilidadCeldaGuardarPuerto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPuerto=false;
			this.isVisibilidadCeldaNuevoRelacionesPuerto=false;
			this.isVisibilidadCeldaGuardarCambiosPuerto=false;
			this.isVisibilidadCeldaActualizarPuerto=false;
			this.isVisibilidadCeldaEliminarPuerto=false;
			this.isVisibilidadCeldaCancelarPuerto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPuerto=false;
				} else {
					this.isVisibilidadCeldaGuardarPuerto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPuerto=false;
			this.isVisibilidadCeldaNuevoRelacionesPuerto=false;
			this.isVisibilidadCeldaGuardarCambiosPuerto=false;
			this.isVisibilidadCeldaModificarPuerto=true;
			this.isVisibilidadCeldaActualizarPuerto=false;
			this.isVisibilidadCeldaEliminarPuerto=false;
			this.isVisibilidadCeldaCancelarPuerto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPuerto=false;
				} else {
					this.isVisibilidadCeldaGuardarPuerto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PuertoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPuerto=true;
			this.isVisibilidadCeldaNuevoRelacionesPuerto=true;
			this.isVisibilidadCeldaGuardarCambiosPuerto=true;
		} else {
			this.actualizarEstadoPanelsPuerto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPuerto=false;
			//this.isVisibilidadCeldaVerFormPuerto=false;
			this.isVisibilidadCeldaDuplicarPuerto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!puertoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPuerto=false;
		} else {
			this.isVisibilidadCeldaNuevoPuerto=false;
			this.isVisibilidadCeldaGuardarCambiosPuerto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(puertoSessionBean.getEsGuardarRelacionado()) {
			if(!puertoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPuerto=false;												
			}
			
			this.jButtonCerrarPuerto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPuerto=false;
		}
		
		if(!this.permiteMantenimiento(this.puerto)) {
			this.isVisibilidadCeldaActualizarPuerto=false;
			this.isVisibilidadCeldaEliminarPuerto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPuerto() {
		this.isVisibilidadCeldaNuevoPuerto=false;
		this.isVisibilidadCeldaGuardarCambiosPuerto=false;
	}
	
	public void actualizarEstadoPanelsPuerto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPuerto!=null) {
				this.jScrollPanelDatosEdicionPuerto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPuerto!=null) {
				this.jTabbedPaneBusquedasPuerto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPuerto!=null) {
				this.jScrollPanelDatosPuerto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPuerto!=null) {
				this.jPanelPaginacionPuerto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPuerto!=null) {
				this.jPanelParametrosReportesPuerto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPuerto!=null) {
				this.jScrollPanelDatosEdicionPuerto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPuerto!=null) {
				this.jTabbedPaneBusquedasPuerto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPuerto!=null) {
				this.jScrollPanelDatosPuerto.setVisible(false);
			}
			
			if(this.jPanelPaginacionPuerto!=null) {
				this.jPanelPaginacionPuerto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPuerto!=null) {
				this.jPanelParametrosReportesPuerto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPuerto!=null) {
				this.jScrollPanelDatosEdicionPuerto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPuerto!=null) {
				this.jTabbedPaneBusquedasPuerto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPuerto!=null) {
				this.jScrollPanelDatosPuerto.setVisible(false);
			}
			
			if(this.jPanelPaginacionPuerto!=null) {
				this.jPanelPaginacionPuerto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPuerto!=null) {
				this.jPanelParametrosReportesPuerto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPuerto!=null) {
				this.jScrollPanelDatosEdicionPuerto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPuerto!=null) {
				this.jTabbedPaneBusquedasPuerto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPuerto!=null) {
				this.jScrollPanelDatosPuerto.setVisible(false);
			}
			
			if(this.jPanelPaginacionPuerto!=null) {
				this.jPanelPaginacionPuerto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPuerto!=null) {
				this.jPanelParametrosReportesPuerto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPuerto!=null) {
				this.jScrollPanelDatosEdicionPuerto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPuerto!=null) {
				this.jTabbedPaneBusquedasPuerto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPuerto!=null) {
				this.jScrollPanelDatosPuerto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPuerto!=null) {
				this.jPanelPaginacionPuerto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPuerto!=null) {
				this.jPanelParametrosReportesPuerto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPuerto!=null) {
				this.jScrollPanelDatosEdicionPuerto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPuerto!=null) {
				this.jTabbedPaneBusquedasPuerto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPuerto!=null) {
				this.jScrollPanelDatosPuerto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPuerto!=null) {
				this.jPanelPaginacionPuerto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPuerto!=null) {
				this.jPanelParametrosReportesPuerto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPuerto!=null) {
				this.jScrollPanelDatosEdicionPuerto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPuerto!=null) {
				this.jTabbedPaneBusquedasPuerto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPuerto!=null) {
				this.jScrollPanelDatosPuerto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPuerto!=null) {
				this.jPanelPaginacionPuerto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPuerto!=null) {
				this.jPanelParametrosReportesPuerto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.puertoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPuerto!=null) {
					this.jTabbedPaneBusquedasPuerto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPuerto!=null) {
				this.jPanelParametrosReportesPuerto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.puertoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPuerto!=null) {
				this.jTabbedPaneBusquedasPuerto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPuerto!=null) {
				this.jPanelParametrosReportesPuerto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaTipoPuerto(Boolean isParaTipoPuerto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoPuertoNegation=!isParaTipoPuerto;

			this.isVisibilidadBusquedaPorNombre=isParaTipoPuertoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasPuerto.remove(jPanelBusquedaPorNombrePuerto);}

			this.isVisibilidadFK_IdPais=isParaTipoPuertoNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasPuerto.remove(jPanelFK_IdPaisPuerto);}

			this.isVisibilidadFK_IdTipoPuerto=isParaTipoPuerto;
			if(!this.isVisibilidadFK_IdTipoPuerto) {this.jTabbedPaneBusquedasPuerto.remove(jPanelFK_IdTipoPuertoPuerto);}
		}
		
	}

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadBusquedaPorNombre=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasPuerto.remove(jPanelBusquedaPorNombrePuerto);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasPuerto.remove(jPanelFK_IdPaisPuerto);}

			this.isVisibilidadFK_IdTipoPuerto=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdTipoPuerto) {this.jTabbedPaneBusquedasPuerto.remove(jPanelFK_IdTipoPuertoPuerto);}
		}
		
	}
	
	

	public String registrarSesionPuertoParaPedidoCompraImpors() throws Exception {
		Boolean isPaginaPopupPedidoCompraImpor=false;

		try {

			if(this.puertoSessionBean==null) {
				this.puertoSessionBean=new PuertoSessionBean();
			}

			if(this.jInternalFrameDetalleFormPuerto.pedidocompraimporSessionBean==null) {
				this.jInternalFrameDetalleFormPuerto.pedidocompraimporSessionBean=new PedidoCompraImporSessionBean();
			}

			this.jInternalFrameDetalleFormPuerto.pedidocompraimporSessionBean.setsPathNavegacionActual(puertoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPuerto.pedidocompraimporSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPedidoCompraImpor=this.jInternalFrameDetalleFormPuerto.pedidocompraimporSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPuerto.pedidocompraimporSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePedidoCompraImpor(true);
			this.jInternalFrameDetalleFormPuerto.pedidocompraimporSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePedidoCompraImpor(PuertoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPuerto.pedidocompraimporSessionBean.setisBusquedaDesdeForeignKeySesionPuerto(true);
			this.jInternalFrameDetalleFormPuerto.pedidocompraimporSessionBean.setlidPuertoActual(this.idPuertoActual);

			puertoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPuerto(true);
			puertoSessionBean.setlIdPuertoActualForeignKey(this.idPuertoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionPuertoParaLiquidacionImpores() throws Exception {
		Boolean isPaginaPopupLiquidacionImpor=false;

		try {

			if(this.puertoSessionBean==null) {
				this.puertoSessionBean=new PuertoSessionBean();
			}

			if(this.jInternalFrameDetalleFormPuerto.liquidacionimporSessionBean==null) {
				this.jInternalFrameDetalleFormPuerto.liquidacionimporSessionBean=new LiquidacionImporSessionBean();
			}

			this.jInternalFrameDetalleFormPuerto.liquidacionimporSessionBean.setsPathNavegacionActual(puertoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPuerto.liquidacionimporSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupLiquidacionImpor=this.jInternalFrameDetalleFormPuerto.liquidacionimporSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPuerto.liquidacionimporSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeLiquidacionImpor(true);
			this.jInternalFrameDetalleFormPuerto.liquidacionimporSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeLiquidacionImpor(PuertoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPuerto.liquidacionimporSessionBean.setisBusquedaDesdeForeignKeySesionPuerto(true);
			this.jInternalFrameDetalleFormPuerto.liquidacionimporSessionBean.setlidPuertoActual(this.idPuertoActual);

			puertoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPuerto(true);
			puertoSessionBean.setlIdPuertoActualForeignKey(this.idPuertoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionPuertoParaEmbarcadores() throws Exception {
		Boolean isPaginaPopupEmbarcador=false;

		try {

			if(this.puertoSessionBean==null) {
				this.puertoSessionBean=new PuertoSessionBean();
			}

			if(this.jInternalFrameDetalleFormPuerto.embarcadorSessionBean==null) {
				this.jInternalFrameDetalleFormPuerto.embarcadorSessionBean=new EmbarcadorSessionBean();
			}

			this.jInternalFrameDetalleFormPuerto.embarcadorSessionBean.setsPathNavegacionActual(puertoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmbarcadorConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPuerto.embarcadorSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEmbarcador=this.jInternalFrameDetalleFormPuerto.embarcadorSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPuerto.embarcadorSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmbarcador(true);
			this.jInternalFrameDetalleFormPuerto.embarcadorSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmbarcador(PuertoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPuerto.embarcadorSessionBean.setisBusquedaDesdeForeignKeySesionPuerto(true);
			this.jInternalFrameDetalleFormPuerto.embarcadorSessionBean.setlidPuertoActual(this.idPuertoActual);

			puertoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPuerto(true);
			puertoSessionBean.setlIdPuertoActualForeignKey(this.idPuertoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PuertoSessionBean puertoSessionBean=new PuertoSessionBean();
		
		if(this.puertoSessionBean==null) {
			this.puertoSessionBean=new PuertoSessionBean();
		}
		
		this.puertoSessionBean.setsUltimaBusquedaPuerto(this.getsAccionBusqueda());
		this.puertoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.puertoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			puertoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			puertoSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoPuerto")) {
			puertoSessionBean.setid_tipo_puerto(this.getid_tipo_puertoFK_IdTipoPuerto());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PuertoSessionBean puertoSessionBean=new PuertoSessionBean();
		
		if(this.puertoSessionBean==null) {
			this.puertoSessionBean=new PuertoSessionBean();
		}
		
		if(this.puertoSessionBean.getsUltimaBusquedaPuerto()!=null&&!this.puertoSessionBean.getsUltimaBusquedaPuerto().equals("")) {
			this.setsAccionBusqueda(puertoSessionBean.getsUltimaBusquedaPuerto());
			this.setiNumeroPaginacion(puertoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(puertoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(puertoSessionBean.getnombre());
				puertoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(puertoSessionBean.getid_pais());
				puertoSessionBean.setid_pais(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoPuerto")) {
				this.setid_tipo_puertoFK_IdTipoPuerto(puertoSessionBean.getid_tipo_puerto());
				puertoSessionBean.setid_tipo_puerto(-1L);
			}
		}
		
		this.puertoSessionBean.setsUltimaBusquedaPuerto("");
		this.puertoSessionBean.setiNumeroPaginacion(PuertoConstantesFunciones.INUMEROPAGINACION);
		this.puertoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPuerto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPuerto() {
		this.updateBorderResaltarBusquedasFormularioPuerto();
		this.updateVisibilidadBusquedasFormularioPuerto();
		this.updateHabilitarBusquedasFormularioPuerto();
	}
	
	public void updateBorderResaltarBusquedasFormularioPuerto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPuerto.getComponents().length>0) {
	

		if(this.puertoConstantesFunciones.resaltarBusquedaPorNombrePuerto!=null) {
			index= this.jTabbedPaneBusquedasPuerto.indexOfComponent(this.jPanelBusquedaPorNombrePuerto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPuerto.getComponent(index);
				jPanel.setBorder(this.puertoConstantesFunciones.resaltarBusquedaPorNombrePuerto);
			}
		}

		if(this.puertoConstantesFunciones.resaltarFK_IdPaisPuerto!=null) {
			index= this.jTabbedPaneBusquedasPuerto.indexOfComponent(this.jPanelFK_IdPaisPuerto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPuerto.getComponent(index);
				jPanel.setBorder(this.puertoConstantesFunciones.resaltarFK_IdPaisPuerto);
			}
		}

		if(this.puertoConstantesFunciones.resaltarFK_IdTipoPuertoPuerto!=null) {
			index= this.jTabbedPaneBusquedasPuerto.indexOfComponent(this.jPanelFK_IdTipoPuertoPuerto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPuerto.getComponent(index);
				jPanel.setBorder(this.puertoConstantesFunciones.resaltarFK_IdTipoPuertoPuerto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPuerto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPuerto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPuerto.indexOfComponent(this.jPanelBusquedaPorNombrePuerto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPuerto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.puertoConstantesFunciones.mostrarBusquedaPorNombrePuerto);
			if(!this.puertoConstantesFunciones.mostrarBusquedaPorNombrePuerto && index>-1) {
				this.jTabbedPaneBusquedasPuerto.remove(index);
			}

			index= this.jTabbedPaneBusquedasPuerto.indexOfComponent(this.jPanelFK_IdPaisPuerto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPuerto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.puertoConstantesFunciones.mostrarFK_IdPaisPuerto);
			if(!this.puertoConstantesFunciones.mostrarFK_IdPaisPuerto && index>-1) {
				this.jTabbedPaneBusquedasPuerto.remove(index);
			}

			index= this.jTabbedPaneBusquedasPuerto.indexOfComponent(this.jPanelFK_IdTipoPuertoPuerto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPuerto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.puertoConstantesFunciones.mostrarFK_IdTipoPuertoPuerto);
			if(!this.puertoConstantesFunciones.mostrarFK_IdTipoPuertoPuerto && index>-1) {
				this.jTabbedPaneBusquedasPuerto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPuerto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPuerto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPuerto.indexOfComponent(this.jPanelBusquedaPorNombrePuerto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPuerto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.puertoConstantesFunciones.activarBusquedaPorNombrePuerto);
				this.jTabbedPaneBusquedasPuerto.setEnabledAt(index,this.puertoConstantesFunciones.activarBusquedaPorNombrePuerto);
			}

			index= this.jTabbedPaneBusquedasPuerto.indexOfComponent(this.jPanelFK_IdPaisPuerto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPuerto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.puertoConstantesFunciones.activarFK_IdPaisPuerto);
				this.jTabbedPaneBusquedasPuerto.setEnabledAt(index,this.puertoConstantesFunciones.activarFK_IdPaisPuerto);
			}

			index= this.jTabbedPaneBusquedasPuerto.indexOfComponent(this.jPanelFK_IdTipoPuertoPuerto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPuerto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.puertoConstantesFunciones.activarFK_IdTipoPuertoPuerto);
				this.jTabbedPaneBusquedasPuerto.setEnabledAt(index,this.puertoConstantesFunciones.activarFK_IdTipoPuertoPuerto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPuerto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasPuerto.indexOfComponent(this.jPanelBusquedaPorNombrePuerto);

			this.jTabbedPaneBusquedasPuerto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPuerto.getComponent(index);

			this.puertoConstantesFunciones.setResaltarBusquedaPorNombrePuerto(resaltar);

			jPanel.setBorder(this.puertoConstantesFunciones.resaltarBusquedaPorNombrePuerto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasPuerto.indexOfComponent(this.jPanelFK_IdPaisPuerto);

			this.jTabbedPaneBusquedasPuerto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPuerto.getComponent(index);

			this.puertoConstantesFunciones.setResaltarFK_IdPaisPuerto(resaltar);

			jPanel.setBorder(this.puertoConstantesFunciones.resaltarFK_IdPaisPuerto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoPuerto")) {
			index= this.jTabbedPaneBusquedasPuerto.indexOfComponent(this.jPanelFK_IdTipoPuertoPuerto);

			this.jTabbedPaneBusquedasPuerto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPuerto.getComponent(index);

			this.puertoConstantesFunciones.setResaltarFK_IdTipoPuertoPuerto(resaltar);

			jPanel.setBorder(this.puertoConstantesFunciones.resaltarFK_IdTipoPuertoPuerto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPuerto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPuerto() throws Exception {

		if(this.jInternalFrameDetalleFormPuerto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPuerto();
		this.updateVisibilidadResaltarControlesFormularioPuerto();
		this.updateHabilitarResaltarControlesFormularioPuerto();
		
	}
	
	public void updateBorderResaltarControlesFormularioPuerto() throws Exception {
		if(this.jInternalFrameDetalleFormPuerto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.puertoConstantesFunciones.resaltaridPuerto!=null && this.jInternalFrameDetalleFormPuerto!=null) {this.jInternalFrameDetalleFormPuerto.jLabelidPuerto.setBorder(this.puertoConstantesFunciones.resaltaridPuerto);}
		if(this.puertoConstantesFunciones.resaltarid_tipo_puertoPuerto!=null && this.jInternalFrameDetalleFormPuerto!=null) {this.jInternalFrameDetalleFormPuerto.jComboBoxid_tipo_puertoPuerto.setBorder(this.puertoConstantesFunciones.resaltarid_tipo_puertoPuerto);}
		if(this.puertoConstantesFunciones.resaltarid_paisPuerto!=null && this.jInternalFrameDetalleFormPuerto!=null) {this.jInternalFrameDetalleFormPuerto.jComboBoxid_paisPuerto.setBorder(this.puertoConstantesFunciones.resaltarid_paisPuerto);}
		if(this.puertoConstantesFunciones.resaltarnombrePuerto!=null && this.jInternalFrameDetalleFormPuerto!=null) {this.jInternalFrameDetalleFormPuerto.jTextAreanombrePuerto.setBorder(this.puertoConstantesFunciones.resaltarnombrePuerto);}
		if(this.puertoConstantesFunciones.resaltares_localPuerto!=null && this.jInternalFrameDetalleFormPuerto!=null) {this.jInternalFrameDetalleFormPuerto.jCheckBoxes_localPuerto.setBorderPainted(true);this.jInternalFrameDetalleFormPuerto.jCheckBoxes_localPuerto.setBorder(this.puertoConstantesFunciones.resaltares_localPuerto);}
		if(this.puertoConstantesFunciones.resaltardescripcionPuerto!=null && this.jInternalFrameDetalleFormPuerto!=null) {this.jInternalFrameDetalleFormPuerto.jTextAreadescripcionPuerto.setBorder(this.puertoConstantesFunciones.resaltardescripcionPuerto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPuerto() throws Exception {		
		if(this.jInternalFrameDetalleFormPuerto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPuerto!=null) {
	
		//this.jInternalFrameDetalleFormPuerto.jLabelidPuerto.setVisible(this.puertoConstantesFunciones.mostraridPuerto);
		this.jInternalFrameDetalleFormPuerto.jPanelidPuerto.setVisible(this.puertoConstantesFunciones.mostraridPuerto);
		//this.jInternalFrameDetalleFormPuerto.jComboBoxid_tipo_puertoPuerto.setVisible(this.puertoConstantesFunciones.mostrarid_tipo_puertoPuerto);
		this.jInternalFrameDetalleFormPuerto.jPanelid_tipo_puertoPuerto.setVisible(this.puertoConstantesFunciones.mostrarid_tipo_puertoPuerto);
		//this.jInternalFrameDetalleFormPuerto.jComboBoxid_paisPuerto.setVisible(this.puertoConstantesFunciones.mostrarid_paisPuerto);
		this.jInternalFrameDetalleFormPuerto.jPanelid_paisPuerto.setVisible(this.puertoConstantesFunciones.mostrarid_paisPuerto);
		//this.jInternalFrameDetalleFormPuerto.jTextAreanombrePuerto.setVisible(this.puertoConstantesFunciones.mostrarnombrePuerto);
		this.jInternalFrameDetalleFormPuerto.jPanelnombrePuerto.setVisible(this.puertoConstantesFunciones.mostrarnombrePuerto);
		//this.jInternalFrameDetalleFormPuerto.jCheckBoxes_localPuerto.setVisible(this.puertoConstantesFunciones.mostrares_localPuerto);
		this.jInternalFrameDetalleFormPuerto.jPaneles_localPuerto.setVisible(this.puertoConstantesFunciones.mostrares_localPuerto);
		//this.jInternalFrameDetalleFormPuerto.jTextAreadescripcionPuerto.setVisible(this.puertoConstantesFunciones.mostrardescripcionPuerto);
		this.jInternalFrameDetalleFormPuerto.jPaneldescripcionPuerto.setVisible(this.puertoConstantesFunciones.mostrardescripcionPuerto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPuerto() throws Exception {
		if(this.jInternalFrameDetalleFormPuerto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPuerto!=null) {
	
		this.jInternalFrameDetalleFormPuerto.jLabelidPuerto.setEnabled(this.puertoConstantesFunciones.activaridPuerto);
		this.jInternalFrameDetalleFormPuerto.jComboBoxid_tipo_puertoPuerto.setEnabled(this.puertoConstantesFunciones.activarid_tipo_puertoPuerto);
		this.jInternalFrameDetalleFormPuerto.jComboBoxid_paisPuerto.setEnabled(this.puertoConstantesFunciones.activarid_paisPuerto);
		this.jInternalFrameDetalleFormPuerto.jTextAreanombrePuerto.setEnabled(this.puertoConstantesFunciones.activarnombrePuerto);
		this.jInternalFrameDetalleFormPuerto.jCheckBoxes_localPuerto.setEnabled(this.puertoConstantesFunciones.activares_localPuerto);
		this.jInternalFrameDetalleFormPuerto.jTextAreadescripcionPuerto.setEnabled(this.puertoConstantesFunciones.activardescripcionPuerto);
		}
	}
	
		
}